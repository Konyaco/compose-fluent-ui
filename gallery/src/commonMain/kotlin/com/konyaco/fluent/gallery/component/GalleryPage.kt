package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.ScrollbarContainer
import com.konyaco.fluent.component.rememberScrollbarAdapter

@Composable
fun GalleryPage(
    title: String,
    description: String,
    content: @Composable GalleryPageScope.() -> Unit
) {
    GalleryPage(AnnotatedString(title), AnnotatedString(description), content)
}

@Composable
fun GalleryPage(
    title: AnnotatedString,
    description: AnnotatedString,
    content: @Composable GalleryPageScope.() -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        GalleryHeader(title, description)
        val scrollState = rememberScrollState()
        ScrollbarContainer(
            adapter = rememberScrollbarAdapter(scrollState),
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .verticalScroll(scrollState)
                    .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                val scope = remember { GalleryPageScope(this) }
                scope.content()
            }
        }
    }
}

class GalleryPageScope(columnScope: ColumnScope): ColumnScope by columnScope {

    @Composable
    fun Section(title: String, sourceCode: String, content: @Composable BoxScope.() -> Unit) {
        GallerySection(modifier = Modifier.fillMaxSize(), title, sourceCode, content)
    }

}