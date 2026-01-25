package io.github.composefluent.gallery.screen.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(
    index = 5,
    description = "A lightweight control for displaying small amounts of text."
)
@Composable
fun TextBlockScreen() {
    GalleryPage(
        title = "TextBlock",
        description = "TextBlock is the primary control for displaying read-only text in your app. " +
                "You typically display text by setting the Text property to a simple string. " +
                "You can also display a series of strings in Run elements and give each different formatting.",
        componentPath = FluentSourceFile.Text,
        galleryPath = ComponentPagePath.TextBlockScreen
    ) {
        Section(
            title = "A simple TextBox.",
            sourceCode = sourceCodeOfSimpleTextBlockSample,
            content = { SimpleTextBlockSample() }
        )
        Section(
            title = "A TextBlock with a style applied.",
            sourceCode = sourceCodeOfStyledTextBlockSample,
            content = { StyledTextBlockSample() }
        )
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