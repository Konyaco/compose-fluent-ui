package com.konyaco.fluent.gallery

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow(
        title = "Compose Fluent Design Gallery"
    ) {
        GalleryTheme { App() }
    }
}