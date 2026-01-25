package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.Text
import io.github.composefluent.component.ToggleButton
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 4, description = "A button that can be switched between two states like a CheckBox.")
@Composable
fun ToggleButtonScreen() {
    GalleryPage(
        title = "ToggleButton",
        description = "A ToggleButton looks like a Button, but works like a CheckBox. It typically has two states, checked (on) or unchecked (off), but can be indeterminate if the IsThreeState property is true. You can determine it's state by checking the IsChecked property.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.ToggleButtonScreen
    ) {
        val enabled = remember { mutableStateOf(true) }
        val (checked, setChecked) = remember { mutableStateOf(false) }
        Section(
            title = "A simple ToggleButton with text content.",
            sourceCode = sourceCodeOfBasicToggleButton,
            content = { BasicToggleButton(enabled.value, checked, setChecked) },
            options = {
                CheckBox(
                    checked = !enabled.value,
                    onCheckStateChange = { enabled.value = !it },
                    label = "Disable toggle button"
                )
            },
            output = {
                Text(
                    text = if (checked) { "On" } else { "Off" }
                )
            }
        )
    }
}

@Sample
@Composable
private fun BasicToggleButton(enabled: Boolean, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    ToggleButton(checked, onCheckedChange, disabled = !enabled) { Text("ToggleButton") }
}