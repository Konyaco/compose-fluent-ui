package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.component.TabRow
import com.konyaco.fluent.component.TabItem
import com.konyaco.fluent.component.TabViewDefaults
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.rememberTabItemEndDividerController
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 1, description = "A control that displays a collection of tabs that can be used to display several documents.")
@Composable
fun TabViewScreen() {
    GalleryPage(
        title = "TabView",
        description = "TabView provides the user with a collection of tabs that can be used to display several documents.",
        componentPath = FluentSourceFile.TabView,
        galleryPath = ComponentPagePath.TabViewScreen
    ) {
        Section(
            title = "Basic TabView",
            sourceCode = sourceCodeOfTabViewSample,
            content = { TabViewSample() }
        )
    }
}

@Sample
@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
@Composable
private fun TabViewSample() {
    val selectedKey = remember { mutableIntStateOf(0) }
    val items = remember { mutableStateListOf(*Array(10) { it }) }
    val state = rememberLazyListState()
    val endDividerController = rememberTabItemEndDividerController(
        selectedKey = { selectedKey.value },
        state = state
    )
    TabRow(
        state = state,
        selectedKey = { selectedKey.value },
        modifier = Modifier.fillMaxWidth()
    ) {

        itemsIndexed(items, key = { _, item -> item }) { index, item ->
            val interactionSource = remember { MutableInteractionSource() }
            TabItem(
                selected = item == selectedKey.value,
                onSelectedChanged = { selectedKey.value = item },
                endDividerVisible = endDividerController.attach(item, interactionSource),
                interactionSource = interactionSource,
                text = {Text("Item ${item + 1}")},
                trailing = {
                    val isHovered = interactionSource.collectIsHoveredAsState()
                    if (isHovered.value) {
                        TabViewDefaults.TabCloseButton(
                            onClick = {
                                val isSelected = selectedKey.value == item
                                items.remove(item)
                                if (isSelected) {
                                    selectedKey.value = items.getOrNull(index) ?: items.getOrNull(index - 1) ?: 0
                                }
                            }
                        )
                    }
                },
                modifier = Modifier.widthIn(160.dp).animateItemPlacement(),
            )
        }

        item {
            TabViewDefaults.TabAddButton(
                onClick = {
                    items.add(items.lastOrNull()?.plus(1) ?: 0)
                }
            )
        }
    }
}