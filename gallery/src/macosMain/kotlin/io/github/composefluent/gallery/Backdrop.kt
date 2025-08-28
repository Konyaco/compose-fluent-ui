package io.github.composefluent.gallery

import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readValue
import platform.AppKit.NSAppearance
import platform.AppKit.NSAppearanceNameAqua
import platform.AppKit.NSAppearanceNameDarkAqua
import platform.AppKit.NSColor
import platform.AppKit.NSView
import platform.AppKit.NSViewHeightSizable
import platform.AppKit.NSViewWidthSizable
import platform.AppKit.NSVisualEffectBlendingMode
import platform.AppKit.NSVisualEffectMaterial
import platform.AppKit.NSVisualEffectMaterialSidebar
import platform.AppKit.NSVisualEffectState
import platform.AppKit.NSVisualEffectView
import platform.AppKit.NSWindow
import platform.CoreGraphics.CGRect
import platform.CoreGraphics.CGRectZero
import platform.Foundation.NSThread
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue

private object Backdrop {

    @OptIn(ExperimentalForeignApi::class)
    fun applyBackdrop(window: NSWindow, material: NSVisualEffectMaterial, blendingMode: NSVisualEffectBlendingMode, state: NSVisualEffectState, isDark: Boolean) {
        val applyBlock = apply@ {
            val contentView = window.contentView ?: return@apply
            if (window.opaque) {
                window.opaque = false
                window.backgroundColor = NSColor.clearColor
            }
            if (!contentView.wantsLayer()) {
                contentView.wantsLayer = true
            }

            val visualEffectView = if (contentView !is WindowBackdropView) {
                val windowBackdropView = WindowBackdropView()
                windowBackdropView.wantsLayer = true
                windowBackdropView.addSubview(contentView)
                window.contentView = windowBackdropView
                contentView.autoresizingMask = NSViewWidthSizable or NSViewHeightSizable
                windowBackdropView.visualView
            } else {
                contentView.visualView
            }

            visualEffectView.apply {
                this.material = material
                this.blendingMode = blendingMode
                this.state = state
                appearance = when(isDark) {
                    true -> NSAppearance.appearanceNamed(NSAppearanceNameDarkAqua)
                    false -> NSAppearance.appearanceNamed(NSAppearanceNameAqua)
                }
                wantsLayer = true
            }
        }

        if (!NSThread.isMainThread) {
            dispatch_async(dispatch_get_main_queue(), applyBlock)
        } else {
            applyBlock()
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    class WindowBackdropView(frame: CValue<CGRect> = CGRectZero.readValue()): NSView(frame) {
        val visualView: NSVisualEffectView = NSVisualEffectView(frame)

        init {
            autoresizingMask = NSViewWidthSizable or NSViewHeightSizable
            visualView.autoresizingMask = NSViewWidthSizable or NSViewHeightSizable
            addSubview(visualView)
        }
    }
}

fun NSWindow.applyBackdrop(
    material: NSVisualEffectMaterial = NSVisualEffectMaterialSidebar,
    blendingMode: NSVisualEffectBlendingMode = NSVisualEffectBlendingMode.NSVisualEffectBlendingModeBehindWindow,
    state: NSVisualEffectState = NSVisualEffectState.NSVisualEffectStateActive,
    isDark: Boolean = false
) {
    Backdrop.applyBackdrop(
        window = this,
        material = material,
        blendingMode = blendingMode,
        state = state,
        isDark = isDark
    )
}