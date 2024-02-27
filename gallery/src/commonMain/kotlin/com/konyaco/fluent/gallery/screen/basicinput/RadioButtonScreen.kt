package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun RadioButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "RadioButton",
            "Use RadioButtons to let a user choose between mutually exclusive, related options. Generally contained within a RadioButtons group control."
        )
        // TODO:
    }
}