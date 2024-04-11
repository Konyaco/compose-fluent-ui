package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.konyaco.fluent.component.RatingControl
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 11, description = "Rate something 1 to 5 stars.")
@Composable
fun RatingControlScreen() {
    GalleryPage(
        title = "RatingControl",
        description = "Rate something 1 to 5 stars."
    ) {
        Section(
            title = "A simple RatingControl",
            sourceCode = sourceCodeOfBasicRatingControlSample,
            content = { BasicRatingControlSample() }
        )
        Section(
            title = "PlaceholderValue of RatingControl",
            sourceCode = sourceCodeOfPlaceholderRatingControlSample,
            content = { PlaceholderRatingControlSample() }
        )
    }
}

@Sample
@Composable
private fun BasicRatingControlSample() {
    val (value, setValue) = remember { mutableStateOf(0.5f) }
    RatingControl(value = value, onValueChanged = setValue, caption = { Text("Your rating") })
}

@Sample
@Composable
private fun PlaceholderRatingControlSample() {
    val (value, setValue) = remember { mutableStateOf(0.0f) }
    RatingControl(value = value, onValueChanged = setValue, placeholderValue = 2f)
}