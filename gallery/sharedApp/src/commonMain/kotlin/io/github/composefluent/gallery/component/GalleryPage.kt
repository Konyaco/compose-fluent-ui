package io.github.composefluent.gallery.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import io.github.composefluent.Colors
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.ScrollbarContainer
import io.github.composefluent.component.rememberScrollbarAdapter
import io.github.composefluent.darkColors
import io.github.composefluent.gallery.LocalStore
import io.github.composefluent.lightColors

@Composable
fun GalleryPage(
    title: String,
    description: String,
    documentPath: String? = null,
    componentPath: String? = null,
    galleryPath: String? = null,
    content: @Composable GalleryPageScope.() -> Unit
) {
    GalleryPage(
        AnnotatedString(title),
        AnnotatedString(description),
        documentPath,
        componentPath,
        galleryPath,
        content
    )
}

@Composable
fun GalleryPage(
    title: AnnotatedString,
    description: AnnotatedString,
    documentPath: String? = null,
    componentPath: String? = null,
    galleryPath: String? = null,
    content: @Composable GalleryPageScope.() -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val inverseTheme = remember { mutableStateOf(false) }
        GalleryHeader(
            title,
            AnnotatedString(""),
            documentPath,
            componentPath,
            galleryPath,
            true,
            inverseTheme.value
        ) { inverseTheme.value = !inverseTheme.value }

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
                val scope = remember { GalleryPageScope(this) { inverseTheme.value } }
                GalleryDescription(description)
                scope.content()
            }
        }
    }
}

class GalleryPageScope(columnScope: ColumnScope, private val inverseTheme: () -> Boolean) :
    ColumnScope by columnScope {

    @Composable
    fun Section(
        title: String,
        sourceCode: String,
        options: (@Composable ColumnScope.() -> Unit)? = null,
        output: (@Composable ColumnScope.() -> Unit)? = null,
        content: @Composable BoxScope.() -> Unit
    ) {
        Section {
            GallerySection(
                modifier = Modifier.fillMaxSize(),
                title = title,
                sourceCode = sourceCode,
                options = options,
                content = content,
                output = output,
                colors = it
            )
        }
    }

    @Composable
    fun Section(content: @Composable (colors: Colors) -> Unit) {
        val currentThemeMode = LocalStore.current.darkMode
        val inverseThemeMode = inverseTheme()
        content(
            when {
                inverseThemeMode && currentThemeMode -> lightColors()
                inverseThemeMode && !currentThemeMode -> darkColors()
                else -> FluentTheme.colors
            }
        )
    }

}