package io.github.composefluent.gallery.window

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.WindowScope
import io.github.composefluent.component.NavigationDisplayMode
import io.github.composefluent.gallery.GalleryTheme
import io.github.composefluent.gallery.LocalStore
import io.github.composefluent.gallery.applyBackdrop
import io.github.composefluent.gallery.window.manager.WindowManager
import platform.AppKit.NSWindowWillEnterFullScreenNotification
import platform.AppKit.NSWindowWillExitFullScreenNotification
import platform.Foundation.NSNotificationCenter
import platform.Foundation.NSOperationQueue

@Composable
fun WindowScope.WindowFrame(
    backButtonVisible: Boolean,
    backButtonEnabled: Boolean,
    title: String,
    icon: Painter?,
    captionBarHeight: Dp,
    onBackButtonClick: () -> Unit,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    GalleryTheme( displayMicaLayer = false) {
        val isCollapsed = LocalStore.current.navigationDisplayMode == NavigationDisplayMode.LeftCollapsed

        WindowFrameInternal(
            backButtonVisible = backButtonVisible,
            backButtonEnabled = backButtonEnabled,
            icon = if (isCollapsed) null else icon,
            title = if (isCollapsed) "" else title,
            captionBarHeight = captionBarHeight,
            onBackButtonClick = onBackButtonClick,
            content = content
        )
    }
}

@Composable
private fun WindowScope.WindowFrameInternal(
    backButtonVisible: Boolean,
    backButtonEnabled: Boolean,
    title: String,
    icon: Painter?,
    captionBarHeight: Dp,
    onBackButtonClick: () -> Unit,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    val windowManager = remember(window) { WindowManager(window) }
    val isDark = LocalStore.current.darkMode
    LaunchedEffect(window, captionBarHeight) {
        windowManager.disableTitlebar(captionBarHeight.value.toDouble())
    }

    LaunchedEffect(window, isDark) {
        window.applyBackdrop(isDark = isDark)
    }

    val isFullScreen = remember(windowManager) { mutableStateOf(windowManager.isFullScreen()) }

    DisposableEffect(window, isFullScreen) {
        val enterFullScreenObserver = NSNotificationCenter.defaultCenter.addObserverForName(
            NSWindowWillEnterFullScreenNotification,
            window,
            NSOperationQueue.mainQueue
        ) {
            isFullScreen.value = true
        }
        val exitFullScreenObserver = NSNotificationCenter.defaultCenter.addObserverForName(
            NSWindowWillExitFullScreenNotification,
            window,
            NSOperationQueue.mainQueue
        ) {
            isFullScreen.value = false
        }
        onDispose {
            NSNotificationCenter.defaultCenter.removeObserver(enterFullScreenObserver)
            NSNotificationCenter.defaultCenter.removeObserver(exitFullScreenObserver)
        }
    }

    MacOSWindowFrame(
        isFullScreen = { isFullScreen.value },
        backButtonEnabled = backButtonEnabled,
        backButtonVisible = backButtonVisible,
        icon = icon,
        title = title,
        captionBarHeight = captionBarHeight,
        onBackButtonClick = onBackButtonClick,
        content = content
    )
}