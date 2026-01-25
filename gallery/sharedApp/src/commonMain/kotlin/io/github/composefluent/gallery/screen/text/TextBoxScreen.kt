package io.github.composefluent.gallery.screen.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.SecureTextField
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextField
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

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

        Section(
            title = "A SecureTextBox.",
            sourceCode = sourceCodeOfSecureTextBoxSample,
            content = { SecureTextBoxSample() }
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

@Sample
@Composable
private fun SecureTextBoxSample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            state = rememberTextFieldState(),
            header = { Text("Username") }
        )
        SecureTextField(
            state = rememberTextFieldState(),
            header = { Text("Password") }
        )
    }

}