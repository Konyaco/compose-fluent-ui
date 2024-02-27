package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun SplitButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "SplitButton",
            "The SplitButton is a dropdown button, but with an addition execution hit target."
        )
        // TODO:
    }
}