package com.konyaco.fluent.gallery

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
fun main() = application {
    val windowState = rememberWindowState(position = WindowPosition(Alignment.Center), size = DpSize(1280.dp, 720.dp))
    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "Compose Fluent Design Gallery",
        icon = painterResource(Res.drawable.icon)
    ) {
        val isFullscreen = windowState.placement == WindowPlacement.Fullscreen
        val isMacOS = System.getProperty("os.name").equals("Mac OS X")
        val titleBarHeight = if (!isFullscreen and isMacOS) { 28.dp } else { 0.dp } //TODO Get real title bar height.

        GalleryTheme {
            //TODO Make Window transparent.
            WindowStyle(
                isDarkTheme = LocalStore.current.darkMode,
                backdropType = WindowBackdrop.Mica
            )
            App(titleBarHeight)
        }

        window.rootPane.apply {
            rootPane.putClientProperty("apple.awt.fullWindowContent", true)
            rootPane.putClientProperty("apple.awt.transparentTitleBar", true)
            rootPane.putClientProperty("apple.awt.windowTitleVisible", false)
        }.takeIf { isMacOS }
    }
}