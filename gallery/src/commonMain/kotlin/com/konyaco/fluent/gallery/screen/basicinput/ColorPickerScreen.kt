package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 8, description = "A control that displays a selectable color spectrum.")
@Composable
fun ColorPickerScreen() {
    GalleryPage(
        title = "ColorPicker",
        description = "A selectable color spectrum."
    ) {
    }
}