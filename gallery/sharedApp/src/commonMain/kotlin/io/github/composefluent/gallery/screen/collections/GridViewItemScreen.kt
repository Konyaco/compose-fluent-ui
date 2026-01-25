package io.github.composefluent.gallery.screen.collections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.GridViewItem
import io.github.composefluent.component.GridViewItemDefaults
import io.github.composefluent.component.MultiSelectGridViewItem
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
import kotlin.random.Random
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Component(description = "Selectable item template in grids.")
@Composable
fun GridViewItemScreen() {
    GalleryPage(
        title = "GridViewItem",
        description = "Selectable item template in grids.",
        componentPath = FluentSourceFile.GridViewItem,
        galleryPath = ComponentPagePath.GridViewItemScreen
    ) {
        Section(
            title = "Basic GridViewItem",
            sourceCode = sourceCodeOfBasicGridViewItemSample,
            content = { BasicGridViewItemSample() }
        )

        Section(
            title = "MultiSelect GridViewItem",
            sourceCode = sourceCodeOfMultiSelectGridViewItemSample,
            content = { MultiSelectGridViewItemSample() }
        )
    }
}

@Sample
@Composable
private fun BasicGridViewItemSample() {
    val items = randomBrushItems()
    var selectedIndex by remember { mutableStateOf(-1) }
    LazyVerticalGrid(
        columns = GridCells.Adaptive(112.dp),
        horizontalArrangement = Arrangement.spacedBy(GridViewItemDefaults.spacing),
        verticalArrangement = Arrangement.spacedBy(GridViewItemDefaults.spacing),
        contentPadding = PaddingValues(GridViewItemDefaults.spacing),
        modifier = Modifier.height(300.dp)
    ) {
        itemsIndexed(items) { index, item ->
            GridViewItem(
                selected = index == selectedIndex,
                onSelectedChange = {
                    selectedIndex = if (it) index else -1
                },
                content = {
                    Box(modifier = Modifier.background(item))
                },
                modifier = Modifier.fillMaxWidth()
                    .aspectRatio(1f)
            )
        }
    }
}

@Sample
@Composable
private fun MultiSelectGridViewItemSample() {
    val items = randomBrushItems()
    val selectedIndices = remember { mutableStateListOf<Int>() }
    LazyVerticalGrid(
        columns = GridCells.Adaptive(112.dp),
        horizontalArrangement = Arrangement.spacedBy(GridViewItemDefaults.spacing),
        verticalArrangement = Arrangement.spacedBy(GridViewItemDefaults.spacing),
        contentPadding = PaddingValues(GridViewItemDefaults.spacing),
        modifier = Modifier.height(300.dp)
    ) {
        itemsIndexed(items) { index, item ->
            MultiSelectGridViewItem(
                selected = selectedIndices.contains(index),
                onSelectedChange = {
                    if (it) {
                        selectedIndices.add(index)
                    } else {
                        selectedIndices.remove(index)
                    }
                },
                content = {
                    Box(modifier = Modifier.background(item))
                },
                modifier = Modifier.fillMaxWidth()
                    .aspectRatio(1f)
            )
        }
    }
}

@OptIn(ExperimentalUuidApi::class)
@Composable
internal fun randomBrushItems(): List<Brush> {
    val random = remember { Random(Uuid.random().toLongs { a, b -> a + b }) }
    return List(12) {
        Brush.linearGradient(
            colors = randomColor(random)
        )
    }
}

private fun randomColor(random: Random): List<Color> {
    val count = random.nextInt(2, 5)
    return List(count) {
        Color(
            red = random.nextInt(0, 255),
            green = random.nextInt(0, 255),
            blue = random.nextInt(0, 255)
        )
    }
}