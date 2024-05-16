package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(
    index = 10,
    description = "A control that allows a user to select a single option from a group of options."
)
@Composable
fun RadioButtonScreen() {
    GalleryPage(
        title = "RadioButton",
        description = "Use RadioButtons to let a user choose between mutually exclusive, related options. Generally contained within a RadioButtons group control.",
        componentPath = FluentSourceFile.RadioButton,
        galleryPath = ComponentPagePath.RadioButtonScreen
    ) {
        val output = remember { mutableStateOf("Select an option.") }
        Section(
            title = "A group of RadioButton controls.",
            sourceCode = sourceCodeOfRadioButtonSample,
            content = {
                RadioButtonSample {
                    output.value = "You selected Option $it"
                }
            },
            output = {
                Text(output.value)
            }
        )
    }
}

@Sample
@Composable
fun RadioButtonSample(onOptionSelected: (index: Int) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Options:")
        var selected by remember { mutableStateOf(0) }
        for (index in 1..3) {
            RadioButton(
                selected = selected == index,
                label = "Option $index",
                onClick = {
                    selected = index
                    onOptionSelected(index)
                }
            )
        }
    }
}