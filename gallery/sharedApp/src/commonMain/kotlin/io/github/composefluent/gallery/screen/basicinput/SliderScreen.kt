package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.*
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.component.TodoComponent
import io.github.composefluent.source.generated.FluentSourceFile
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
                Text(value.toString())
            }
        )

        Section(
            title = "A Slider with tick marks.",
            sourceCode = sourceCodeOfSliderTickMarkSample,
            content = { SliderTickMarkSample() }
        )

        val (confirmValue, setConfirmValue) = remember { mutableStateOf(0f) }
        val stepsSliderState = remember {
            SliderState(
                value = 0f,
                steps = 4,
                snap = true,
                onValueChangeFinished = setConfirmValue,
                valueRange = 0f..100f
            )
        }

        Section(
            title = "A Slider with custom tooltip content and snaps to tickmark.",
            sourceCode = sourceCodeOfSliderStepsSample,
            content = { SliderStepsSample(stepsSliderState) },
            output = {
                Text("value: ${stepsSliderState.value}")
                Text("confirmValue: $confirmValue")
            }
        )

        Section(
            title = "Customize slider by using BasicSlider.",
            sourceCode = sourceCodeOfBasicSliderSample,
            content = { BasicSliderSample(remember { SliderState(valueRange = 0f..100f) }) },
        )

        Section("A vertical slider with range and tick marks specified.", "") {
            TodoComponent()
        }
    }
}

@Sample
@Composable
private fun SliderSample(value: Float, onValueChanged: (Float) -> Unit) {
    Slider(
        modifier = Modifier.width(200.dp),
        value = value,
        onValueChange = onValueChanged
    )
}

@Sample
@Composable
private fun SliderTickMarkSample() {
    val (value, setValue) = remember { mutableStateOf(0f) }
    Slider(
        modifier = Modifier.width(200.dp),
        valueRange = 0f..100f,
        value = value,
        steps = 5,
        showTickMark = true,
        snap = false,
        onValueChange = setValue,
    )
}

@Sample
@Composable
private fun SliderStepsSample(state: SliderState) {
    Slider(
        modifier = Modifier.width(200.dp),
        state = state,
        tooltipContent = {
            Text(it.nearestValue().roundToInt().toString())
        },
    )
}

@Sample
@Composable
private fun BasicSliderSample(state: SliderState) {
    BasicSlider(
        modifier = Modifier.width(200.dp),
        state = state,
        rail = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(12.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.horizontalGradient(
                            0f to Color.White.copy(0f),
                            1f to Color.Red.copy(1f)
                        )
                    )
            )
        },
        track = {
        },
        thumb = {
            SliderDefaults.Thumb(state)
        }
    )
}