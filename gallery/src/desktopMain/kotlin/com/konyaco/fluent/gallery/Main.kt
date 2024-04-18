package com.konyaco.fluent.gallery

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center), size = DpSize(1280.dp, 720.dp)),
        title = "Compose Fluent Design Gallery",
        icon = painterResource(Res.drawable.icon)
    ) {
        GalleryTheme(false) {
            //TODO Make Window transparent.
            WindowStyle(
                isDarkTheme = LocalStore.current.darkMode,
                backdropType = WindowBackdrop.Mica
            )
            App()
        }
    }
}