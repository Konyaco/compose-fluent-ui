package io.github.composefluent.gallery.screen.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import io.github.composefluent.component.Button
import io.github.composefluent.component.ContentDialog
import io.github.composefluent.component.DialogSize
import io.github.composefluent.component.LocalContentDialog
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
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