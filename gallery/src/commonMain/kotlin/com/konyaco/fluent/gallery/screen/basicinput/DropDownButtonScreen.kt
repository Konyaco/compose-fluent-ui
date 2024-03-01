package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.GalleryHeader

@Component(index = 1)
@Composable
fun DropDownButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "DropDownButton",
            "A control that drops down a flyout of choices from which one can be chosen."
        )
        // TODO:
    }
}