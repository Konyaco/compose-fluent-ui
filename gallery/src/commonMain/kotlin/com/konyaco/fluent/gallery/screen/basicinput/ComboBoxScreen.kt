package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 9, description = "A drop-down list of items a user can select from.")
@Composable
fun ComboBoxScreen() {
    GalleryPage(
        title = "ComboBox",
        description = "Use a ComboBox when you need to conserve on-screen space and when users select only one option at a time. A ComboBox shows only the currently selected item.",
        galleryPath = ComponentPagePath.ComboBoxScreen
    ) {
        //TODO ComboBox Demo
    }
}