package com.konyaco.fluent.gallery

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.gallery.component.rememberComponentNavigator
import com.konyaco.fluent.gallery.jna.windows.structure.isWindows10OrLater
import com.konyaco.fluent.gallery.window.WindowsWindowFrame
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.skiko.hostOs

fun main() = application {
    val state = rememberWindowState(
        position = WindowPosition(Alignment.Center),
        size = DpSize(1280.dp, 720.dp)
    )
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = "Compose Fluent Design Gallery",
        icon = painterResource(Res.drawable.icon)
    ) {
        val supportBackdrop = hostOs.isWindows && isWindows10OrLater()
        val isMacOS = System.getProperty("os.name").equals("Mac OS X")
        val titleBarHeight by remember {
            derivedStateOf {
                if (isMacOS && state.placement != WindowPlacement.Fullscreen) {
                    28.dp
                } else {
                    0.dp
                }
            }
        }
        GalleryTheme(!supportBackdrop) {
            if (supportBackdrop) {
                val navigator = rememberComponentNavigator()
                WindowsWindowFrame(
                    onCloseRequest = { exitApplication() },
                    icon = painterResource(Res.drawable.icon),
                    title = "Compose Fluent Design Gallery",
                    backButtonEnabled = navigator.canNavigateUp,
                    backButtonClick = { navigator.navigateUp() },
                    state = state
                ) {
                    App(navigator, titleBarHeight)
                }
            } else {
                App(titleBarHeight = titleBarHeight)
            }

        }
        window.rootPane.apply {
            rootPane.putClientProperty("apple.awt.fullWindowContent", true)
            rootPane.putClientProperty("apple.awt.transparentTitleBar", true)
            rootPane.putClientProperty("apple.awt.windowTitleVisible", false)
        }.takeIf { isMacOS }
    }
}
