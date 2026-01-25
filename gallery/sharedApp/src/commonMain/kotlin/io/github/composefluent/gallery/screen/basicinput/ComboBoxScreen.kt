package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.composefluent.component.ComboBox
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.component.TodoComponent
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 9, description = "A drop-down list of items a user can select from.")
@Composable
fun ComboBoxScreen() {
    GalleryPage(
        title = "ComboBox",
        description = "Use a ComboBox when you need to conserve on-screen space and when users select only one option at a time. A ComboBox shows only the currently selected item.",
        galleryPath = ComponentPagePath.ComboBoxScreen,
        componentPath = FluentSourceFile.ComboBox
    ) {
        Section(
            title = "A ComboBox with its Items source set",
            sourceCode = sourceCodeOfItemsSourceComboBoxSample
        ) {
            ItemsSourceComboBoxSample()
        }

        Section(
            title = "A ComboBox with items defined inline and its width set",
            sourceCode = ""
        ) {
            TodoComponent()
        }

        Section(
            title = "An editable ComboBox",
            sourceCode = ""
        ) {
            TodoComponent()
        }
    }
}

private val itemsList = listOf("Red", "Green", "Yellow", "Blue", "Pink")

@Sample
@Composable
private fun ItemsSourceComboBoxSample() {
    var selected by remember { mutableStateOf<Int?>(null) }

    ComboBox(
        header = "Color",
        placeholder = "Pick a color",
        selected = selected,
        items = itemsList,
        onSelectionChange = { i, s -> selected = i }
    )
}