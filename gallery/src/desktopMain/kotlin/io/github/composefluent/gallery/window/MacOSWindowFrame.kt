package io.github.composefluent.gallery.window

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import org.jetbrains.skiko.disableTitleBar

@Composable
fun FrameWindowScope.MacOSWindowFrame(
    state: WindowState,
    backButtonVisible: Boolean,
    backButtonEnabled: Boolean,
    title: String,
    icon: Painter?,
    captionBarHeight: Dp,
    onBackButtonClick: () -> Unit,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {

    LaunchedEffect(window, captionBarHeight) {
        window.findSkiaLayer()?.disableTitleBar(captionBarHeight.value)
    }

    MacOSWindowFrame(
        isFullScreen = { state.placement == WindowPlacement.Fullscreen },
        backButtonEnabled = backButtonEnabled,
        backButtonVisible = backButtonVisible,
        icon = icon,
        title = title,
        captionBarHeight = captionBarHeight,
        onBackButtonClick = onBackButtonClick,
        content = content
    )

    window.rootPane.apply {
        rootPane.putClientProperty("apple.awt.fullWindowContent", true)
        rootPane.putClientProperty("apple.awt.transparentTitleBar", true)
        rootPane.putClientProperty("apple.awt.windowTitleVisible", false)
    }
}