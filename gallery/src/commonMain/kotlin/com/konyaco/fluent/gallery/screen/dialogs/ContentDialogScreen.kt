package com.konyaco.fluent.gallery.screen.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.ContentDialog
import com.konyaco.fluent.component.DialogSize
import com.konyaco.fluent.component.LocalContentDialog
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile
import kotlinx.coroutines.launch

@Component(index = 0, description = "A dialog box that can be customized to contain any content.")
@Composable
fun ContentDialogScreen() {
    GalleryPage(
        title = "ContentDialog",
        description = "Use a ContentDialog to show relevant information or to provide a modal dialog experience that can show any Compose content.",
        componentPath = FluentSourceFile.Dialog,
        galleryPath = ComponentPagePath.ContentDialogScreen
    ) {
        Section(
            title = "A basic content dialog with content.",
            sourceCode = sourceCodeOfBasicContentDialogSample,
            content = { BasicContentDialogSample() }
        )
        Section(
            title = "Use content dialog by LocalContentDialog.",
            sourceCode = sourceCodeOfLocalContentDialogSample,
            content = { LocalContentDialogSample() }
        )
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