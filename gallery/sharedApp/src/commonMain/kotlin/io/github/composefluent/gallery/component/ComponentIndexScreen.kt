package io.github.composefluent.gallery.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.Text
import io.github.composefluent.surface.Card

@Composable
fun ComponentItem.ComponentIndexScreen(navigator: ComponentNavigator) {
    ComponentIndexScreen(name, items, navigator)
}

@Composable
fun ComponentIndexScreen(
    name: String,
    items: List<ComponentItem>?,
    navigator: ComponentNavigator
) {
    Column {
        GalleryHeader(
            title = name,
            description = "",
            controlVisible = false
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(300.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(32.dp)
        ) {
            items(
                items = items ?: emptyList()
            ) {
                Card(onClick =  { navigator.navigate(it) }) {
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