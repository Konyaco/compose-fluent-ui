package com.konyaco.fluent.gallery.screen.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Component(
    index = 6,
    description = "A single-line or multi-line plain text field."
)
@Composable
fun TextBoxScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "TextBox",
            "Use a TextBox to let a user enter simple text input in your app. You can add a header and placeholder text to let the user know that the TextBox is for, and you can customize it in other ways."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A simple TextBox.",
                sourceCode = sourceCodeOfTextBoxSample
            ) {
                TextBoxSample()
            }
            Spacer(Modifier.height(24.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A TextBox with a header and placeholder text.",
                sourceCode = sourceCodeOfTextBoxHeaderSample
            ) {
                TextBoxHeaderSample()
            }
        }
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