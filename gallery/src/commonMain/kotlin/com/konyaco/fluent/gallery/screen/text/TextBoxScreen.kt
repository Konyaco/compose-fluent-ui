package com.konyaco.fluent.gallery.screen.text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(
    index = 6,
    description = "A single-line or multi-line plain text field."
)
@Composable
fun TextBoxScreen() {
    GalleryPage(
        title = "TextBox",
        description = "Use a TextBox to let a user enter simple text input in your app. You can add a header and placeholder text to let the user know that the TextBox is for, and you can customize it in other ways.",
        componentPath = FluentSourceFile.TextField,
        galleryPath = ComponentPagePath.TextBoxScreen
    ) {
        Section(
            title = "A simple TextBox.",
            sourceCode = sourceCodeOfTextBoxSample,
            content = { TextBoxSample() }
        )
        Section(
            title = "A TextBox with a header and placeholder text.",
            sourceCode = sourceCodeOfTextBoxHeaderSample,
            content = { TextBoxHeaderSample() }
        )
    }
}

@Sample
@Composable
private fun TextBoxSample() {
    var value by remember { mutableStateOf(TextFieldValue()) }
    TextField(value, onValueChange = { value = it })
}

@Sample
@Composable
private fun TextBoxHeaderSample() {
    var value by remember { mutableStateOf(TextFieldValue()) }
    TextField(
        value = value,
        onValueChange = { value = it },
        header = { Text("Enter your name:") },
        // placeholder = { Text("Name") },
    )
    // TODO: Support placeholder
}