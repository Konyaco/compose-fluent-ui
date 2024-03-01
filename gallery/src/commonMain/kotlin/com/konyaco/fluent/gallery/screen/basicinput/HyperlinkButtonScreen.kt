package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.GalleryHeader

@Component(index = 2)
@Composable
fun HyperlinkButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "HyperlinkButton",
            "A HyperlinkButton appears as a text hyperlink. When a user clicks it, it opens the page you specify in the NavigateUri property in the default browser. Or you can handle its Click event, typically to navigate within your app."
        )
        // TODO:
    }
}