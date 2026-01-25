package io.github.composefluent.gallery.window

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowState
import io.github.composefluent.component.NavigationDisplayMode
import io.github.composefluent.gallery.GalleryTheme
import io.github.composefluent.gallery.LocalStore
import io.github.composefluent.gallery.jna.windows.structure.isWindows10OrLater
import io.github.composefluent.gallery.jna.windows.structure.isWindows11OrLater
import org.jetbrains.skiko.hostOs

@Composable
fun FrameWindowScope.WindowFrame(
    onCloseRequest: () -> Unit,
    icon: Painter? = null,
    title: String = "",
    state: WindowState,
    backButtonVisible: Boolean = true,
    backButtonEnabled: Boolean = false,
    backButtonClick: () -> Unit = {},
    captionBarHeight: Dp = 48.dp,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    val supportBackdrop = hostOs.isWindows && isWindows11OrLater()
    GalleryTheme(!supportBackdrop) {
        val isCollapsed = LocalStore.current.navigationDisplayMode == NavigationDisplayMode.LeftCollapsed
        when {
            hostOs.isWindows && isWindows10OrLater() -> {

                WindowsWindowFrame(
                    onCloseRequest = onCloseRequest,
                    icon = if (isCollapsed) null else icon,
                    title = if (isCollapsed) "" else title,
                    content = content,
                    state = state,
                    backButtonVisible = backButtonVisible && !isCollapsed,
                    backButtonEnabled = backButtonEnabled,
                    backButtonClick = backButtonClick,
                    captionBarHeight = captionBarHeight
                )
            }

            hostOs.isMacOS -> {

                MacOSWindowFrame(
                    content = content,
                    backButtonVisible = backButtonVisible && !isCollapsed,
                    backButtonEnabled = backButtonEnabled,
                    onBackButtonClick = backButtonClick,
                    captionBarHeight = captionBarHeight,
                    icon = if (isCollapsed) null else icon,
                    title = if (isCollapsed) "" else title,
                    state = state
                )
            }

            else -> {
                content(WindowInsets(0), WindowInsets(0))
            }
        }
    }
}