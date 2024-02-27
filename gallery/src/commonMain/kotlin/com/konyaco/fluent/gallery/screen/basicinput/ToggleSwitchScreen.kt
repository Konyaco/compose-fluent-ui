package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun ToggleSwitchScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ToggleSwitch",
            "Use ToggleSwitch controls to present users with exactly two mutually exclusive options (like on/off), where choosing an option results in an immediate commit. A toggle switch should have a single label."
        )
        // TODO:
    }
}