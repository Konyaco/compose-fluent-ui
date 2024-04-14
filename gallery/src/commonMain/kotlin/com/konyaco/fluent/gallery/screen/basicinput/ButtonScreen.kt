package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.AccentButton
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Home

@Component(
    index = 0,
    description = "A control that responds to user input and raises a Click event."
)
@Composable
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
            Spacer(Modifier.height(32.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "Button with graphical content.",
                content = { GraphicalButtonSample() },
                sourceCode = sourceCodeOfGraphicalButtonSample
            )
            Spacer(Modifier.height(32.dp))
            // TODO: Wrapping Buttons with large content.
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "Accent style applied to Button.",
                content = {
                    AccentButtonSample()
                },
                sourceCode = sourceCodeOfAccentButtonSample
            )
            Spacer(Modifier.height(32.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "Subtle button.",
                content = {
                    SubtleButtonSample()
                },
                sourceCode = sourceCodeOfSubtleButtonSample
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
private fun GraphicalButtonSample() {
    Button(modifier = Modifier.size(48.dp), onClick = {}, iconOnly = true) {
        Icon(modifier = Modifier.size(20.dp), imageVector = Icons.Default.Home, contentDescription = null)
    }
}

@Sample
@Composable
private fun AccentButtonSample() {
    AccentButton(onClick = {}) {
        Text("Accent Compose Button")
    }
}

@Sample
@Composable
private fun SubtleButtonSample() {
    SubtleButton(onClick = {}) {
        Text("Subtle Compose Button")
    }
}