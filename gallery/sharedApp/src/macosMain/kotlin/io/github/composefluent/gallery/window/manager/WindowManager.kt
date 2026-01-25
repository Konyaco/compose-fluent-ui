package io.github.composefluent.gallery.window.manager

import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.cValue
import kotlinx.cinterop.readValue
import platform.AppKit.NSEvent
import platform.AppKit.NSLayoutConstraint
import platform.AppKit.NSTextField
import platform.AppKit.NSView
import platform.AppKit.NSWindow
import platform.AppKit.NSWindowCloseButton
import platform.AppKit.NSWindowDidExitFullScreenNotification
import platform.AppKit.NSWindowMiniaturizeButton
import platform.AppKit.NSWindowStyleMaskFullScreen
import platform.AppKit.NSWindowStyleMaskFullSizeContentView
import platform.AppKit.NSWindowTitleHidden
import platform.AppKit.NSWindowWillEnterFullScreenNotification
import platform.AppKit.NSWindowWillExitFullScreenNotification
import platform.AppKit.NSWindowZoomButton
import platform.AppKit.bottomAnchor
import platform.AppKit.centerXAnchor
import platform.AppKit.centerYAnchor
import platform.AppKit.constraints
import platform.AppKit.heightAnchor
import platform.AppKit.leftAnchor
import platform.AppKit.rightAnchor
import platform.AppKit.topAnchor
import platform.AppKit.translatesAutoresizingMaskIntoConstraints
import platform.AppKit.widthAnchor
import platform.CoreGraphics.CGFloat
import platform.CoreGraphics.CGRectZero
import platform.Foundation.NSNotificationCenter
import platform.Foundation.NSOperatingSystemVersion
import platform.Foundation.NSOperationQueue
import platform.Foundation.NSProcessInfo
import platform.Foundation.NSRect
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue

@OptIn(ExperimentalForeignApi::class)
class WindowDragView(framerRect: CValue<NSRect> = CGRectZero.readValue()) : NSView(framerRect) {

    override fun mouseDown(event: NSEvent) {
        window?.performWindowDragWithEvent(event)
        super.mouseDown(event)
    }

    override fun mouseUp(event: NSEvent) {
        if (event.clickCount == 2.toLong()) { // clickCount is NSInteger (Long)
            window?.performZoom(null) // nil becomes null
        }
        super.mouseUp(event)
    }
}

// Fork from https://github.com/JetBrains/skiko/blob/master/skiko/src/awtMain/objectiveC/macos/Drawlayer.mm
class WindowManager(
    private val window: NSWindow
) {

    private var _titlebarDisabled: Boolean = false
    private var _customHeaderHeight: CGFloat = 0.0

    @OptIn(ExperimentalForeignApi::class)
    private fun setUpCustomHeader() {
        val window = this.window
        val themeFrame = window.contentView?.superview
        val closeButton = window.standardWindowButton(NSWindowCloseButton)
        val titlebarContainer = closeButton?.superview?.superview
        val titlebar = titlebarContainer?.subviews?.get(0) as? NSView
        val titlebarDecoration = titlebarContainer?.subviews?.get(1) as? NSView

        if (themeFrame == null || titlebarContainer == null || titlebar == null || titlebarDecoration == null) {
            println("Error: Could not find essential view hierarchy elements.")
            return
        }

        // The following two views are only there on Big Sur and forward
        val runningAtLeastBigSur = NSProcessInfo.processInfo().isOperatingSystemAtLeastVersion(
            NSOperatingSystemVersion(majorVersion = 11, minorVersion = 0, patchVersion = 0)
        )
        val titlebarVisualEffect =
            if (runningAtLeastBigSur) titlebar.subviews[0] as? NSView else null
        val titlebarBackground =
            if (runningAtLeastBigSur) titlebar.subviews[1] as? NSView else null

        val dragger = WindowDragView() // Initial frame, constraints will set it.
        titlebar.addSubview(dragger)

        val newConstraints = mutableListOf<NSLayoutConstraint>()

        titlebar.translatesAutoresizingMaskIntoConstraints = false
        newConstraints.addAll(
            listOf(
                titlebar.leftAnchor.constraintEqualToAnchor(themeFrame.leftAnchor),
                titlebar.widthAnchor.constraintEqualToAnchor(themeFrame.widthAnchor),
                titlebar.topAnchor.constraintEqualToAnchor(themeFrame.topAnchor),
                titlebar.heightAnchor.constraintEqualToConstant(_customHeaderHeight) // This is the important one
            )
        )

        val viewsToChange = mutableListOf<NSView>()
        viewsToChange.add(titlebarContainer)
        viewsToChange.add(titlebarDecoration)
        if (runningAtLeastBigSur) {
            titlebarVisualEffect?.let { viewsToChange.add(it) }
            titlebarBackground?.let { viewsToChange.add(it) }
        }
        viewsToChange.add(dragger)

        for (view in viewsToChange) {
            view.translatesAutoresizingMaskIntoConstraints = false
            newConstraints.addAll(
                listOf(
                    view.leftAnchor.constraintEqualToAnchor(titlebar.leftAnchor),
                    view.rightAnchor.constraintEqualToAnchor(titlebar.rightAnchor),
                    view.topAnchor.constraintEqualToAnchor(titlebar.topAnchor),
                    view.bottomAnchor.constraintEqualToAnchor(titlebar.bottomAnchor)
                )
            )
        }

        // In some scenarios, we still have an `NSTextField` inside the `NSTitlebar` containing the window title, even
        // though we called `setTitleVisibility` with `NSWindowTitleHidden`. We need to make it zero size because otherwise,
        // it would swallow click events.
        val potentialTitleIndex = if (runningAtLeastBigSur) 2 else 0
        val title = (titlebar.subviews.getOrNull(potentialTitleIndex) as? NSTextField)
        if (title != null) {
            title.translatesAutoresizingMaskIntoConstraints = false
            newConstraints.addAll(
                listOf(
                    title.heightAnchor.constraintEqualToConstant(0.0),
                    title.widthAnchor.constraintEqualToConstant(0.0)
                )
            )
        }

        val miniaturizeButtonView = window.standardWindowButton(NSWindowMiniaturizeButton)
        val zoomButtonView = window.standardWindowButton(NSWindowZoomButton)
        val horizontalButtonOffset: CGFloat = 20.0

        // Use indexed iteration for buttons
        listOfNotNull(closeButton, miniaturizeButtonView, zoomButtonView)
            .forEachIndexed { i, button ->
                button.translatesAutoresizingMaskIntoConstraints = false
                newConstraints.addAll(
                    listOf(
                        button.centerYAnchor.constraintEqualToAnchor(titlebar.centerYAnchor),
                        button.centerXAnchor.constraintEqualToAnchor(
                            titlebar.leftAnchor,
                            constant = (_customHeaderHeight / 2.0 + (i * horizontalButtonOffset))
                        )
                    )
                )
            }

        NSLayoutConstraint.activateConstraints(newConstraints)
    }

    @OptIn(ExperimentalForeignApi::class)
    private fun resetHeader() {
        val window = this.window

        val themeFrame = window.contentView?.superview
        val closeButton = window.standardWindowButton(NSWindowCloseButton)
        val titlebarContainer = closeButton?.superview?.superview
        val titlebar = titlebarContainer?.subviews?.get(0) as? NSView
        val titlebarDecoration = titlebarContainer?.subviews?.get(1) as? NSView

        if (themeFrame == null || titlebarContainer == null || titlebar == null || titlebarDecoration == null) {
            println("Error: Could not find essential view hierarchy elements for reset.")
            return
        }

        val runningAtLeastBigSur = NSProcessInfo.processInfo().isOperatingSystemAtLeastVersion(
            NSOperatingSystemVersion(majorVersion = 11, minorVersion = 0, patchVersion = 0)
        )
        val titlebarVisualEffect =
            if (runningAtLeastBigSur) titlebar.subviews.get(0) as? NSView else null
        val titlebarBackground =
            if (runningAtLeastBigSur) titlebar.subviews.get(1) as? NSView else null

        val miniaturizeButtonView = window.standardWindowButton(NSWindowMiniaturizeButton)
        val zoomButtonView = window.standardWindowButton(NSWindowZoomButton)

        val changedViews = mutableListOf<NSView>()
        changedViews.add(titlebarContainer)
        changedViews.add(titlebarDecoration)
        changedViews.add(titlebar)
        listOfNotNull(closeButton, miniaturizeButtonView, zoomButtonView)
            .forEach { changedViews.add(it) }
        if (runningAtLeastBigSur) {
            titlebarVisualEffect?.let { changedViews.add(it) }
            titlebarBackground?.let { changedViews.add(it) }
        }

        for (changedView in changedViews) {
            NSLayoutConstraint.deactivateConstraints(changedView.constraints())
            changedView.translatesAutoresizingMaskIntoConstraints = true
        }

        val potentialTitleIndex = if (runningAtLeastBigSur) 2 else 0
        val title = (titlebar.subviews.getOrNull(potentialTitleIndex) as? NSTextField)
        if (title != null) {
            NSLayoutConstraint.deactivateConstraints(title.constraints())
            title.translatesAutoresizingMaskIntoConstraints = true
        }

        val dragger = titlebar.subviews.firstOrNull { it is WindowDragView } as? WindowDragView
        dragger?.removeFromSuperview()
    }

    private fun setWindowControlsHidden(hidden: Boolean) {
        this.window.standardWindowButton(NSWindowCloseButton)?.superview?.setHidden(hidden)
    }

    @OptIn(ExperimentalForeignApi::class)
    fun disableTitlebar(customHeaderHeight: CGFloat) {
        _customHeaderHeight = customHeaderHeight
        // dispatch_sync(dispatch_get_main_queue(), ...) becomes AppKit.onMainThread { ... } or similar
        // For production, you'd want a more robust main thread dispatcher.
        // kotlinx.coroutines.swing provides a Dispatchers.Swing for JVM, for Native it's more direct with GCD/runBlocking.
        // For AppKit, simply calling methods on NS* objects from any thread will often implicitly defer to main thread,
        // but explicit dispatch is safer for UI modifications.

        // A basic way to run on the main thread:
        dispatch_async(dispatch_get_main_queue()) {
            val window = this.window
            window.setStyleMask(window.styleMask() or NSWindowStyleMaskFullSizeContentView)
            window.setTitlebarAppearsTransparent(true)
            window.setTitleVisibility(NSWindowTitleHidden)
            (window.contentView!!).apply {
                layer?.setBounds(window.contentView?.bounds()!!)
                setNeedsDisplay(true)
            }
            if (!isFullScreen()) {
                setUpCustomHeader()
            }
        }

        val defaultCenter = NSNotificationCenter.defaultCenter()
        val mainQueue = NSOperationQueue.mainQueue()

        // Block-based notifications become Kotlin lambdas
        defaultCenter.addObserverForName(
            NSWindowWillEnterFullScreenNotification,
            `object` = window, // 'object' is a reserved word, use backticks
            queue = mainQueue
        ) { notification ->
            resetHeader()
        }
        defaultCenter.addObserverForName(
            NSWindowWillExitFullScreenNotification,
            `object` = window,
            queue = mainQueue
        ) { notification ->
            setWindowControlsHidden(true)
        }
        defaultCenter.addObserverForName(
            NSWindowDidExitFullScreenNotification,
            `object` = window,
            queue = mainQueue
        ) { notification ->
            setUpCustomHeader()
            setWindowControlsHidden(false)
        }
        _titlebarDisabled = true
    }

    fun isFullScreen(): Boolean {
        val window = this.window
        val masks = window.styleMask()
        return (masks and NSWindowStyleMaskFullScreen) != 0uL
    }

    fun makeFullscreen(value: Boolean) {
        val window = this.window
        if (value && !isFullScreen()) {
            // performSelectorOnMainThread becomes a direct call on the main thread.
            dispatch_async(dispatch_get_main_queue()) {
                window.toggleFullScreen(null)
            }
        } else if (!value && isFullScreen()) {
            dispatch_async(dispatch_get_main_queue()) {
                window.toggleFullScreen(null)
            }
        }
    }

}

@OptIn(ExperimentalForeignApi::class)
private fun NSOperatingSystemVersion(majorVersion: Long, minorVersion: Long, patchVersion: Long): CValue<NSOperatingSystemVersion> {
    return cValue {
        this.majorVersion = majorVersion
        this.minorVersion = minorVersion
        this.patchVersion = patchVersion
    }
}