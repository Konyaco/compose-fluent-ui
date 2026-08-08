package io.github.composefluent.gallery.screen.scrolling

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items as lazyListItems
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items as lazyGridItems
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items as lazyStaggeredGridItems
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.Text
import io.github.composefluent.component.scrollbar
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "A control communicates the visible portion of scrollable content and can expose thumb-drag and track-press interactions to the users.")
@Composable
fun ScrollbarScreen() {
    GalleryPage(
        title = "Scrollbar",
        description = "Scroll viewers enable content to extend beyond the bounds of the viewport (visible area). " +
                "Users reach this content by manipulating the scroll viewer surface through touch, " +
                "mouse wheel, keyboard, or a game pad, or by using the mouse or pen cursor to interact with the scroll viewer's scroll bar.",
        galleryPath = ComponentPagePath.ScrollbarScreen,
        componentPath = FluentSourceFile.Scrollbar,
    ) {
        Section(
            title = "Vertical scrollbar",
            sourceCode = sourceCodeOfVerticalScrollbarSample,
            content = { VerticalScrollbarSample() }
        )
        Section(
            title = "Horizontal scrollbar",
            sourceCode = sourceCodeOfHorizontalScrollbarSample,
            content = { HorizontalScrollbarSample() }
        )
        Section(
            title = "LazyList scrollbar",
            sourceCode = sourceCodeOfLazyListScrollbarSample,
            content = { LazyListScrollbarSample() }
        )
        Section(
            title = "LazyGrid scrollbar",
            sourceCode = sourceCodeOfLazyGridScrollbarSample,
            content = { LazyGridScrollbarSample() }
        )
        Section(
            title = "LazyStaggeredGrid scrollbar",
            sourceCode = sourceCodeOfLazyStaggeredGridScrollbarSample,
            content = { LazyStaggeredGridScrollbarSample() }
        )
    }
}

@Sample
@Composable
private fun VerticalScrollbarSample() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .size(width = 280.dp, height = 180.dp)
            .background(FluentTheme.colors.background.layer.default)
            .scrollbar(
                state = scrollState,
                orientation = Orientation.Vertical,
            )
            .verticalScroll(scrollState)
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        repeat(20) { index -> Text("Scrollable item ${index + 1}") }
    }
}

@Sample
@Composable
private fun HorizontalScrollbarSample() {
    val scrollState = rememberScrollState()

    Row(
        modifier = Modifier
            .width(360.dp)
            .height(112.dp)
            .background(FluentTheme.colors.background.layer.default)
            .scrollbar(
                state = scrollState,
                orientation = Orientation.Horizontal,
            )
            .horizontalScroll(scrollState)
            .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        repeat(12) { index ->
            Box(
                modifier = Modifier.size(72.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text("${index + 1}")
            }
        }
    }
}

@Sample
@Composable
private fun LazyListScrollbarSample() {
    val state = rememberLazyListState()
    val items = remember { List(30) { it } }

    LazyColumn(
        state = state,
        modifier = Modifier
            .size(width = 280.dp, height = 180.dp)
            .background(FluentTheme.colors.background.layer.default)
            .scrollbar(state = state),
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        lazyListItems(items = items) { index ->
            Text(
                text = "Lazy list item ${index + 1}",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(FluentTheme.colors.background.layer.alt)
                    .padding(horizontal = 12.dp, vertical = 8.dp),
            )
        }
    }
}

@Sample
@Composable
private fun LazyGridScrollbarSample() {
    val state = rememberLazyGridState()
    val items = remember { List(40) { it } }

    LazyVerticalGrid(
        state = state,
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .size(width = 280.dp, height = 180.dp)
            .background(FluentTheme.colors.background.layer.default)
            .scrollbar(state = state),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        lazyGridItems(items = items) { index ->
            Box(
                modifier = Modifier
                    .height(48.dp)
                    .background(FluentTheme.colors.background.layer.alt),
                contentAlignment = Alignment.Center,
            ) {
                Text("${index + 1}")
            }
        }
    }
}

@Sample
@Composable
private fun LazyStaggeredGridScrollbarSample() {
    val state = rememberLazyStaggeredGridState()
    val items = remember { List(40) { it } }

    LazyVerticalStaggeredGrid(
        state = state,
        columns = StaggeredGridCells.Fixed(3),
        modifier = Modifier
            .size(width = 280.dp, height = 180.dp)
            .background(FluentTheme.colors.background.layer.default)
            .scrollbar(state = state),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp,
    ) {
        lazyStaggeredGridItems(items = items) { index ->
            Box(
                modifier = Modifier
                    .height((40 + index % 3 * 16).dp)
                    .background(FluentTheme.colors.background.layer.alt),
                contentAlignment = Alignment.Center,
            ) {
                Text("${index + 1}")
            }
        }
    }
}
