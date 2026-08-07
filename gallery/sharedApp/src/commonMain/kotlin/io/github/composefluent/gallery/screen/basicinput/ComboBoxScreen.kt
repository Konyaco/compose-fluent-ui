package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.composefluent.component.ComboBox
import io.github.composefluent.component.EditableComboBox
import io.github.composefluent.component.LazyComboBox
import io.github.composefluent.component.LazyEditableComboBox
import io.github.composefluent.component.LocalContentDialog
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
import kotlinx.coroutines.launch

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
            sourceCode = sourceCodeOfItemsSourceComboBoxSample,
        ) {
            ItemsSourceComboBoxSample()
        }

        Section(
            title = "A lazy ComboBox for large data sets",
            sourceCode = sourceCodeOfLazyComboBoxSample,
        ) {
            LazyComboBoxSample()
        }

        Section(
            title = "An editable ComboBox",
            sourceCode = sourceCodeOfEditableComboBoxSample,
        ) {
            EditableComboBoxSample()
        }

        Section(
            title = "A lazy editable ComboBox for large data sets",
            sourceCode = sourceCodeOfLazyEditableComboBoxSample,
        ) {
            LazyEditableComboBoxSample()
        }
    }
}

private val itemsList = listOf(
    "Blue" to Color.Blue,
    "Green" to Color.Green,
    "Red" to Color.Red,
    "Yellow" to Color.Yellow,
)

private val largeItemsList = List(10_000) { index ->
    when {
        index % 25 == 0 -> "Item $index with a longer label in the current viewport"
        index % 7 == 0 -> "Item $index with a medium label"
        else -> "Item $index"
    }
}

private val largeEditableItemsList = List(10_000) { index ->
    "Item ${index / 2}"
}

@Sample
@Composable
private fun ItemsSourceComboBoxSample() {
    var selected by remember { mutableStateOf<Int?>(null) }

    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ComboBox(
            header = { Text("Color") },
            placeholder = { Text("Pick a color") },
            selected = selected,
            items = itemsList,
            onSelectionChange = { i, _ -> selected = i },
            content = { _, item -> Text(item.first) }
        )
        Box(
            modifier = Modifier
                .size(80.dp, 36.dp)
                .background(
                color = itemsList.let {
                    it.getOrNull(selected ?: return@let null)
                }?.second ?: Color.Transparent
            )
        )
    }
}

@Sample
@Composable
private fun LazyComboBoxSample() {
    var selected by remember { mutableStateOf<Int?>(5_000) }

    LazyComboBox(
        header = { Text("Large data set") },
        placeholder = { Text("Pick an item") },
        selected = selected,
        items = largeItemsList,
        key = { index, _ -> index },
        onSelectionChange = { index, _ -> selected = index },
        content = { _, item -> Text(item) }
    )
}

@Sample
@Composable
private fun EditableComboBoxSample() {
    val state = rememberTextFieldState("10")
    var confirmedValue by remember { mutableFloatStateOf(10f) }
    val fontSizes = remember { listOf(8f, 9f, 10f, 11f, 12f, 14f, 16f, 18f, 20f, 24f, 28f, 36f, 48f, 72f) }
    val scope = rememberCoroutineScope()
    val contentDialog = LocalContentDialog.current
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        EditableComboBox(
            state = state,
            items = fontSizes,
            itemText = { _, item -> formatFontSize(item) },
            onSelectionChange = { _, item ->
                confirmedValue = item
            },
            onValueConfirmed = { value ->
                val sizeValue = value.toFloatOrNull()
                if (sizeValue != null && sizeValue in 8f..100f) {
                    confirmedValue = sizeValue
                    state.setTextAndPlaceCursorAtEnd(formatFontSize(sizeValue))
                } else {
                    state.setTextAndPlaceCursorAtEnd(formatFontSize(confirmedValue))
                    scope.launch {
                        contentDialog.show("", "The font size must be a number between 8 and 100.", "Close")
                    }
                }
            },
            header = { Text("Font Size") },
            content = { _, item -> Text(formatFontSize(item)) }
        )
        Text("You can set the font size used for this text.", fontSize = confirmedValue.sp)
    }
}

@Sample
@Composable
private fun LazyEditableComboBoxSample() {
    val state = rememberTextFieldState("Item 2500")
    var selected by remember { mutableStateOf<Int?>(null) }
    val firstItemIndex = remember {
        buildMap<String, Int> {
            largeEditableItemsList.forEachIndexed { index, item ->
                if (item !in this) put(item, index)
            }
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        LazyEditableComboBox(
            state = state,
            items = largeEditableItemsList,
            itemText = { _, item -> item },
            itemIndex = { text -> firstItemIndex[text] },
            key = { index, _ -> index },
            onSelectionChange = { index, _ -> selected = index },
            onValueConfirmed = { value -> selected = firstItemIndex[value] },
            header = { Text("Large editable data set") },
            content = { _, item -> Text(item) }
        )
        Text("First matching index: ${selected ?: "None"}")
    }
}

private fun formatFontSize(value: Float): String =
    if (value % 1f == 0f) value.toInt().toString() else value.toString()
