package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.GalleryHeader

@Component(index = 9)
@Composable
fun ComboBoxScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ComboBox",
            "Use a ComboBox when you need to conserve on-screen space and when users select only one option at a time. A ComboBox shows only the currently selected item."
        )
        // TODO:
    }
}