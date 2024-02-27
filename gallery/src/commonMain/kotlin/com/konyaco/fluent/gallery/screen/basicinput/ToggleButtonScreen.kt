package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun ToggleButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ToggleButton",
            "A ToggleButton looks like a Button, but works like a CheckBox. It typically has two states, checked (on) or unchecked (off), but can be indeterminate if the IsThreeState property is true. You can determine it's state by checking the IsChecked property."
        )
        // TODO:
    }
}