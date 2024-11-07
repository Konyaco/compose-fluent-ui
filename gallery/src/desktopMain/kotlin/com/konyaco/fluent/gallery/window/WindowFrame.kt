package com.konyaco.fluent.gallery.window

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowState
import com.konyaco.fluent.gallery.GalleryTheme
import com.konyaco.fluent.gallery.jna.windows.structure.isWindows10OrLater
import com.konyaco.fluent.gallery.jna.windows.structure.isWindows11OrLater
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
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    val supportBackdrop = hostOs.isWindows && isWindows11OrLater()
    GalleryTheme(!supportBackdrop) {
        when {
            hostOs.isWindows && isWindows10OrLater() -> {
                WindowsWindowFrame(
                    onCloseRequest = onCloseRequest,
                    icon = icon,
                    title = title,
                    content = content,
                    state = state,
                    backButtonVisible = backButtonVisible,
                    backButtonEnabled = backButtonEnabled,
                    backButtonClick = backButtonClick
                )
            }

            hostOs.isMacOS -> {
                MacOSWindowFrame(
                    content = content,
                    state = state
                )
            }

            else -> {
                content(WindowInsets(0), WindowInsets(0))
            }
        }
    }
}