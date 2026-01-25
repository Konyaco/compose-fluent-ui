package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.RatingControl
import io.github.composefluent.component.Slider
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
import kotlin.math.roundToInt

@Component(index = 11, description = "Rate something 1 to 5 stars.")
@Composable
fun RatingControlScreen() {
    GalleryPage(
        title = "RatingControl",
        description = "Rate something 1 to 5 stars.",
        componentPath = FluentSourceFile.RatingControl,
        galleryPath = ComponentPagePath.RatingControlScreen
    ) {
        val (value, setValue) = remember { mutableFloatStateOf(0.5f) }
        val isClearEnabled = remember { mutableStateOf(false) }
        val isReadOnly = remember { mutableStateOf(false) }
        Section(
            title = "A simple RatingControl",
            sourceCode = sourceCodeOfBasicRatingControlSample,
            content = {
                BasicRatingControlSample(
                    value = value,
                    onValueChanged = setValue,
                    isClearEnabled = isClearEnabled.value,
                    isReadOnly = isReadOnly.value
                )
            },
            output = {
                Text(value.toString())
            },
            options = {
                CheckBox(
                    checked = isClearEnabled.value,
                    onCheckStateChange = { isClearEnabled.value = it },
                    label = "Is Clear Enabled"
                )
                Text("Swipe left to clear your rating.", modifier = Modifier.padding(bottom = 8.dp))
                CheckBox(
                    checked = isReadOnly.value,
                    onCheckStateChange = { isReadOnly.value = it },
                    label = "Is Read Only"
                )
            }
        )
        val (placeholderValue, setPlaceholderValue) = remember { mutableFloatStateOf(2f) }
        Section(
            title = "PlaceholderValue of RatingControl",
            sourceCode = sourceCodeOfPlaceholderRatingControlSample,
            content = { PlaceholderRatingControlSample(placeholderValue) },
            options = {
                Text("PlaceholderValue")
                Slider(
                    value = placeholderValue,
                    onValueChange = {
                        setPlaceholderValue((it / 0.5f).roundToInt() * 0.5f)
                    },
                    valueRange = 0f..5f,
                    modifier = Modifier.size(200.dp, 32.dp),
                )
            }
        )
    }
}

@Sample
@Composable
private fun BasicRatingControlSample(
    value: Float,
    onValueChanged: (Float) -> Unit,
    isClearEnabled: Boolean = false,
    isReadOnly: Boolean = false,
) {
    RatingControl(
        value = value,
        onValueChanged = onValueChanged,
        caption = { Text("Your rating") },
        isClearEnabled = isClearEnabled,
        isReadOnly = isReadOnly
    )
}

@Sample
@Composable
private fun PlaceholderRatingControlSample(placeHolderValue: Float = 2f) {
    val (value, setValue) = remember { mutableFloatStateOf(0.0f) }
    RatingControl(value = value, onValueChanged = setValue, isClearEnabled = true, placeholderValue = placeHolderValue)
}