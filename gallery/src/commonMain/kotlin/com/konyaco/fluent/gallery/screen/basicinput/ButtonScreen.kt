package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.AccentButton
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Composable
@Preview
fun ButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "Button",
            "The Button control provides a Click event to respond to user input from a touch, mouse, keyboard, stylus, or other input device. You can put different kinds of content in a button, such as text or an image, or you can restyle a button to give it a new look."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A simple Button with text content.",
                content = { ButtonSample() },
                sourceCode = sourceCodeOfButtonSample
            )
            // TODO: Button with graphical content.
            // TODO: Wrapping Buttons with large content.
            Spacer(Modifier.height(32.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "Accent style applied to Button.",
                content = {
                    AccentButtonSample()
                },
                sourceCode = sourceCodeOfAccentButtonSample
            )
        }
    }
}

@Sample
@Composable
private fun ButtonSample() {
    Button(onClick = {}) {
        Text("Standard Compose Button")
    }
}

@Sample
@Composable
private fun AccentButtonSample() {
    AccentButton(onClick = {}) {
        Text("Accent Compose Button")
    }
}