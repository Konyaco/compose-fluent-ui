package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun RepeatButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "RepeatButton",
            "The RepeatButton control is like a standard Button, except that the Click event occurs continuously while the user presses the RepeatButton."
        )
        // TODO:
    }
}