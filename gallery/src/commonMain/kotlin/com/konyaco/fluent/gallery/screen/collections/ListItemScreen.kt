package com.konyaco.fluent.gallery.screen.collections

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.CompactMode
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.ListHeader
import com.konyaco.fluent.component.ListItem
import com.konyaco.fluent.component.ListItemSelectionType
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.Switcher
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 0, description = "Basic list item templates for use in a variety of controls")
@Composable
fun ListItemScreen() {
    GalleryPage(
        title = "ListItem",
        description = "Reusable list item templates",
        galleryPath = ComponentPagePath.ListItemScreen,
        componentPath = FluentSourceFile.ListItem
    ) {
        Section(
            title = "Basic ListItem sample",
            sourceCode = sourceCodeOfBasicListItemSample,
            content = { BasicListItemSample() }
        )
        val type = remember { mutableStateOf(ListItemSelectionType.Standard) }
        Section(
            title = "Select type ListItem sample",
            sourceCode = sourceCodeOfListItemSampleWithSelectionType,
            options = {
                Text("Selection type", style = FluentTheme.typography.bodyLarge)
                ListItemSelectionType.entries.forEach {
                    RadioButton(
                        selected = type.value == it,
                        onClick = { type.value = it },
                        label = it.name,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            content = { ListItemSampleWithSelectionType(type.value) }
        )
        val store = LocalStore.current
        val compactMode = remember(store.compactMode) { mutableStateOf(store.compactMode) }
        Section(
            title = "ListItem with compact mode",
            sourceCode = sourceCodeOfListItemWithCompactMode,
            content = { ListItemWithCompactMode(compactMode.value) },
            options = {
                Switcher(
                    checked = compactMode.value,
                    onCheckStateChange = { compactMode.value = it },
                    text = "Compact Mode Enabled"
                )
            }
        )
        Section(
            title = "ListItem with header sample",
            sourceCode = sourceCodeOfListItemWithHeaderSample,
            content = { ListItemWithHeaderSample() }
        )
    }
}

@Sample
@Composable
private fun BasicListItemSample() {
    LazyColumn(modifier = Modifier.height(200.dp)) {
        items(1000) {
            ListItem(
                onClick = {},
                text = { Text("Item ${it + 1}") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Sample
@Composable
private fun ListItemSampleWithSelectionType(selectionType: ListItemSelectionType) {
    var selectedIndex by remember { mutableStateOf(-1) }
    LazyColumn(modifier = Modifier.height(200.dp)) {
        items(1000) {
            ListItem(
                selected = selectedIndex == it,
                onSelectedChanged = { selected ->
                    selectedIndex = if (!selected) {
                        -1
                    } else {
                        it
                    }
                },
                text = { Text("Item ${it + 1}") },
                selectionType = selectionType,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Sample
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ListItemWithHeaderSample() {
    LazyColumn(modifier = Modifier.height(200.dp)) {
        for (i in 1..3) {
            stickyHeader {
                ListHeader(content = { Text("Group $i") })
            }
            items(20) {
                ListItem(
                    onClick = {},
                    text = { Text("Item ${it + 1}") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

    }
}

@Sample
@Composable
private fun ListItemWithCompactMode(enabled: Boolean) {
    var selectedIndex by remember { mutableStateOf(-1) }
    CompactMode(enabled = enabled) {
        LazyColumn(modifier = Modifier.height(200.dp)) {
            items(1000) {
                ListItem(
                    selected = it == selectedIndex,
                    onSelectedChanged = { selected ->
                        selectedIndex = if (!selected) {
                            -1
                        } else {
                            it
                        }
                    },
                    text = { Text("Item ${it + 1}") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}