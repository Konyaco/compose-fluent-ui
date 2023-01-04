package com.konyaco.fluent.example

import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center)),
        title = "Compose Fluent"
    ) {
        App()
    }
}