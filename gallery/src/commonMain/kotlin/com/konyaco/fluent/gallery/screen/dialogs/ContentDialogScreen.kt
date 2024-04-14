package com.konyaco.fluent.gallery.screen.dialogs

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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.ContentDialog
import com.konyaco.fluent.component.DialogSize
import com.konyaco.fluent.component.LocalContentDialog
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection
import kotlinx.coroutines.launch

@Component
@Composable
fun ContentDialogScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ContentDialog",
            "Use a ContentDialog to show relevant information or to provide a modal dialog experience that can show any Compose content."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A basic content dialog with content.",
                sourceCode = sourceCodeOfBasicContentDialogSample,
                content = { BasicContentDialogSample() }
            )

            Spacer(Modifier.height(32.dp))

            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "Use content dialog by LocalContentDialog.",
                sourceCode = sourceCodeOfLocalContentDialogSample,
                content = { LocalContentDialogSample() }
            )
        }
    }
}

@Sample
@Composable
private fun BasicContentDialogSample() {
    var displayDialog by remember { mutableStateOf(false) }
    ContentDialog(
        title = "This is an example dialog",
        visible = displayDialog,
        size = DialogSize.Max,
        primaryButtonText = "Confirm",
        closeButtonText = "Cancel",
        onButtonClick = { displayDialog = false },
        content = {
            Text(
                "This is body text. Windows 11 marks a visual evolution of the operating system. We have evolved our design language alongside with Fluent to create a design which is human, universal and truly feels like Windows. \n" +
                        "\n" +
                        "The design principles below have guided us throughout the journey of making Windows the best-in-class implementation of Fluent.\n",
            )
        }
    )
    Button(onClick = { displayDialog = true }) {
        Text("Show dialog")
    }
}

@Sample
@Composable
private fun LocalContentDialogSample() {
    val dialog = LocalContentDialog.current
    val scope = rememberCoroutineScope()

    Button(onClick = {
        scope.launch {
            val result = dialog.show(
                size = DialogSize.Standard,
                title = "This is an example dialog",
                contentText = "This is body text. Windows 11 marks a visual evolution of the operating system. We have evolved our design language alongside with Fluent to create a design which is human, universal and truly feels like Windows. \n" +
                        "\n" +
                        "The design principles below have guided us throughout the journey of making Windows the best-in-class implementation of Fluent.\n",
                primaryButtonText = "Confirm",
                closeButtonText = "Cancel"
            )
        }
    }) {
        Text("Show dialog")
    }
}