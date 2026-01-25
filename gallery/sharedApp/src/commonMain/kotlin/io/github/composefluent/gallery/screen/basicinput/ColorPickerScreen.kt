package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.ColorPicker
import io.github.composefluent.component.ColorSpectrum
import io.github.composefluent.component.RadioButton
import io.github.composefluent.component.Text
import io.github.composefluent.component.rememberColorPickerState
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 8, description = "A control that displays a selectable color spectrum.")
@Composable
fun ColorPickerScreen() {
    GalleryPage(
        title = "ColorPicker",
        description = "A selectable color spectrum.",
        componentPath = FluentSourceFile.ColorPicker,
        galleryPath = ComponentPagePath.ColorPickerScreen
    ) {
        val colorSpectrum = remember { mutableStateOf(ColorSpectrum.Default) }
        val alphaEnabled = remember { mutableStateOf(false) }
        val moreButtonVisible = remember { mutableStateOf(false) }
        Section(
            title = "ColorPicker Properties",
            sourceCode = sourceCodeOfColorPickerSample,
            content = {
                ColorPickerSample(
                    colorSpectrum = colorSpectrum.value,
                    alphaEnabled = alphaEnabled.value,
                    moreButtonVisible = moreButtonVisible.value
                )
            },
            options = {
                CheckBox(
                    checked = moreButtonVisible.value,
                    onCheckStateChange = { moreButtonVisible.value = it },
                    label = "More button visible"
                )
                CheckBox(
                    checked = alphaEnabled.value,
                    onCheckStateChange = { alphaEnabled.value = it },
                    label = "Alpha enabled"
                )
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text(text = "ColorSpectrum shape", modifier = Modifier.padding(bottom = 4.dp))
                    RadioButton(
                        selected = colorSpectrum.value == ColorSpectrum.Square,
                        onClick = { colorSpectrum.value = ColorSpectrum.Square },
                        label = "Square"
                    )
                    RadioButton(
                        selected = colorSpectrum.value == ColorSpectrum.Round,
                        onClick = { colorSpectrum.value = ColorSpectrum.Round },
                        label = "Round"
                    )
                }
            }
        )
    }
}

@Sample
@Composable
private fun ColorPickerSample(
    colorSpectrum: ColorSpectrum,
    alphaEnabled: Boolean = false,
    moreButtonVisible: Boolean = false
) {
    @OptIn(ExperimentalFluentApi::class)
    ColorPicker(
        state = rememberColorPickerState(
            color = Color.White
        ),
        colorSpectrum = colorSpectrum,
        alphaEnabled = alphaEnabled,
        moreButtonVisible = moreButtonVisible
    )
}