package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.AccentButton
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Home
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(
    index = 0,
    description = "A control that responds to user input and raises a Click event."
)
@Composable
fun ButtonScreen() {
    GalleryPage(
        title = "Button",
        description = "The Button control provides a Click event to respond to user input from a touch, mouse, keyboard, stylus, or other input device. You can put different kinds of content in a button, such as text or an image, or you can restyle a button to give it a new look.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.ButtonScreen
    ) {
        val clickTextContent = remember { mutableStateOf("") }
        val buttonEnabled = remember { mutableStateOf(true) }
        Section(
            title = "A simple Button with text content.",
            content = {
                ButtonSample(enabled = buttonEnabled.value) { clickTextContent.value = "You clicked: Button 1" }
            },
            output = {
                if (clickTextContent.value.isNotBlank()) {
                    Text(clickTextContent.value)
                }
            },
            options = {
                CheckBox(
                    checked = !buttonEnabled.value,
                    onCheckStateChange = { buttonEnabled.value = !it },
                    label = "Disable button"
                )
            },
            sourceCode = sourceCodeOfButtonSample
        )
        val clickTextContent2 = remember { mutableStateOf("") }
        Section(
            title = "Button with graphical content.",
            content = { GraphicalButtonSample { clickTextContent2.value = "You clicked: Button 2" } },
            output = {
                if (clickTextContent2.value.isNotBlank()) {
                    Text(clickTextContent2.value)
                }
            },
            sourceCode = sourceCodeOfGraphicalButtonSample
        )
        // TODO: Wrapping Buttons with large content.
        Section(
            title = "Accent style applied to Button.",
            content = { AccentButtonSample() },
            sourceCode = sourceCodeOfAccentButtonSample
        )
        Section(
            title = "Subtle button.",
            content = { SubtleButtonSample() },
            sourceCode = sourceCodeOfSubtleButtonSample
        )
    }
}

@Sample
@Composable
private fun ButtonSample(enabled: Boolean = true, onClick: () -> Unit) {
    Button(disabled = !enabled, onClick = onClick) {
        Text("Standard Compose Button")
    }
}

@Sample
@Composable
private fun GraphicalButtonSample(onClick: () -> Unit) {
    Button(modifier = Modifier.size(48.dp), onClick = onClick, iconOnly = true) {
        Icon(
            modifier = Modifier.size(20.dp),
            imageVector = Icons.Default.Home,
            contentDescription = null
        )
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