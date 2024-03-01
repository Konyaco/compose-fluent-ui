package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.konyaco.fluent.component.Switcher
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection
import com.konyaco.fluent.gallery.component.TodoComponent

@Component(index = 13)
@Composable
fun ToggleSwitchScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ToggleSwitch",
            "Use ToggleSwitch controls to present users with exactly two mutually exclusive options (like on/off), where choosing an option results in an immediate commit. A toggle switch should have a single label."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A simple ToggleSwitch.",
                sourceCode = sourceCodeOfToggleSwitchSample,
                content = { ToggleSwitchSample() }
            )
            Spacer(Modifier.height(24.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A ToggleSwitch with custom header and content.",
                sourceCode = ""
            ) {
                TodoComponent()
            }
        }
    }
}

@Sample
@Composable
private fun ToggleSwitchSample() {
    var checked by remember { mutableStateOf(false) }
    Switcher(checked, { checked = it }, text = if (checked) "On" else "Off")
}