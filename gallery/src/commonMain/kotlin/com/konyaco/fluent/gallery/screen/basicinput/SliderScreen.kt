package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.component.TodoComponent
import com.konyaco.fluent.source.generated.FluentSourceFile
import kotlin.math.roundToInt

@Component(
    index = 12,
    description = "A control that lets the user select from a range of values by moving a Thumb control along a track."
)
@Composable
fun SliderScreen() {
    GalleryPage(
        title = "Slider",
        description = "Use a Slider when you want your users to be able to set defined, contiguous values (such as volume or brightness) or a range of discrete values (such as screen resolution settings).",
        componentPath = FluentSourceFile.Slider,
        galleryPath = ComponentPagePath.SliderScreen
    ) {
        val (value, onValueChanged) = remember { mutableStateOf(0f) }
        Section(
            title = "A simple Slider.",
            sourceCode = sourceCodeOfSliderSample,
            content = { SliderSample(value, onValueChanged) },
            output = {
                Text((value * 100).roundToInt().toString())
            }
        )
        Section("A Slider with range and steps specified.", "") {
            TodoComponent()
        }
        Section("A Slider with tick marks.", "") {
            TodoComponent()
        }
        Section("A vertical slider with range and tick marks specified.", "") {
            TodoComponent()
        }
    }
}

@Sample
@Composable
private fun SliderSample(value: Float, onValueChanged: (Float) -> Unit) {
    Slider(
        modifier = Modifier.width(200.dp).height(32.dp),
        value = value,
        onValueChange = onValueChanged
    )
}