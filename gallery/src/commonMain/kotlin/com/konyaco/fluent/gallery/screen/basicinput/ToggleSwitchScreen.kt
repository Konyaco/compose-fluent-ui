package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.Switcher
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.component.TodoComponent
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 13, description = "A switch that can be toggled between 2 states.")
@Composable
fun ToggleSwitchScreen() {
    GalleryPage(
        title = "ToggleSwitch",
        description = "Use ToggleSwitch controls to present users with exactly two mutually exclusive options (like on/off), where choosing an option results in an immediate commit. A toggle switch should have a single label.",
        componentPath = FluentSourceFile.Switcher,
        galleryPath = ComponentPagePath.ToggleSwitchScreen
    ) {
        Section(
            title = "A simple ToggleSwitch.",
            sourceCode = sourceCodeOfToggleSwitchSample,
            content = { ToggleSwitchSample() }
        )
        Section(
            title = "A ToggleSwitch with custom header and content.",
            sourceCode = ""
        ) {
            TodoComponent()
        }
    }
}

@Sample
@Composable
private fun ToggleSwitchSample() {
    var checked by remember { mutableStateOf(false) }
    Switcher(checked, { checked = it }, text = if (checked) "On" else "Off")
}