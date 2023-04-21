package com.konyaco.fluent.example

import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import org.jetbrains.skiko.hostOs

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center)),
        title = "Compose Fluent"
    ) {
        ExampleTheme(displayMicaLayer = !hostOs.isWindows) {
            WindowStyle(
                isDarkTheme = LocalStore.current.darkMode,
                backdropType = WindowBackdrop.Mica
            )
            App()
        }
    }
}