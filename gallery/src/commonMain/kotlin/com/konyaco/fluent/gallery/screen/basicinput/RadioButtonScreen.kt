package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Component(
    index = 10,
    description = "A control that allows a user to select a single option from a group of options."
)
@Composable
fun RadioButtonScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "RadioButton",
            "Use RadioButtons to let a user choose between mutually exclusive, related options. Generally contained within a RadioButtons group control."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A group of RadioButton controls.",
                sourceCode = sourceCodeOfRadioButtonSample
            ) {
                RadioButtonSample()
            }
        }
    }
}

@Sample
@Composable
fun RadioButtonSample() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Options:")
        var selected by remember { mutableStateOf(0) }
        RadioButton(selected = selected == 0, onClick = { selected = 0 }, label = "Option 1")
        RadioButton(selected = selected == 1, onClick = { selected = 1 }, label = "Option 2")
        RadioButton(selected = selected == 2, onClick = { selected = 2 }, label = "Option 3")
    }
}