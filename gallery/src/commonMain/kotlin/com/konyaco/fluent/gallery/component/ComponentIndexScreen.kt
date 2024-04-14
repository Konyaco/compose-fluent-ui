package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text

@Composable
fun ComponentItem.ComponentIndexScreen(navigator: ComponentNavigator) {
    ComponentIndexScreen(name, description, items, navigator)
}

@Composable
fun ComponentIndexScreen(
    name: String,
    description: String,
    items: List<ComponentItem>?,
    navigator: ComponentNavigator
) {
    //TODO Fixed Style
    Column {
        GalleryHeader(name, description)
        LazyVerticalGrid(
            columns = GridCells.Adaptive(300.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(32.dp)
        ) {
            items(
                items = items ?: emptyList()
            ) {
                Button(onClick =  { navigator.navigate(it) }) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(16.dp)
                            .fillMaxWidth()
                            .heightIn(64.dp)
                    ) {
                        Text(
                            text = it.name,
                            style = FluentTheme.typography.bodyStrong
                        )
                        Text(
                            text = it.description,
                            style = FluentTheme.typography.caption,
                            fontWeight = FontWeight.Normal,
                            minLines = 2,
                            maxLines = 2
                        )
                    }
                }
            }
        }
    }
}