package com.konyaco.fluent.gallery.screen.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Component(
    index = 5,
    description = "A lightweight control for displaying small amounts of text."
)
@Composable
fun TextBlockScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "TextBlock",
            "TextBlock is the primary control for displaying read-only text in your app. " +
                    "You typically display text by setting the Text property to a simple string. " +
                    "You can also display a series of strings in Run elements and give each different formatting."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A simple TextBox.",
                sourceCode = sourceCodeOfSimpleTextBlockSample
            ) {
                SimpleTextBlockSample()
            }
            Spacer(Modifier.height(24.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A TextBlock with a style applied.",
                sourceCode = sourceCodeOfStyledTextBlockSample
            ) {
                StyledTextBlockSample()
            }
        }
    }
}

@Sample
@Composable
private fun SimpleTextBlockSample() {
    Text("I am a TextBlock.")
}

@Sample
@Composable
private fun StyledTextBlockSample() {
    Text("I am a styled TextBlock", fontFamily = FontFamily.Cursive)
}