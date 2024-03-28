package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.ToggleButton
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 4, description = "A button that can be switched between two states like a CheckBox.")
@Composable
fun ToggleButtonScreen() {
    GalleryPage(
        title = "ToggleButton",
        description = "A ToggleButton looks like a Button, but works like a CheckBox. It typically has two states, checked (on) or unchecked (off), but can be indeterminate if the IsThreeState property is true. You can determine it's state by checking the IsChecked property."
    ) {
        Section(
            title = "A simple ToggleButton with text content.",
            sourceCode = sourceCodeOfBasicToggleButton,
            content = { BasicToggleButton() }
        )
    }
}

@Sample
@Composable
private fun BasicToggleButton() {
    val (checked, setChecked) = remember { mutableStateOf(false) }
    ToggleButton(checked, setChecked) { Text("ToggleButton") }
}