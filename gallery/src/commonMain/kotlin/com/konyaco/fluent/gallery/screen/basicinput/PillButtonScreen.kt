package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.PillButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Power
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "represent content metadata to users. They can be used as static tags, links to genre pages, or content filtering experiences.", index = 14)
@Composable
fun PillButtonScreen() {
    GalleryPage(
        title = "PillButton",
        description = "Pill buttons represent content metadata to users. They can be used as static" +
                "tags, links to genre pages, or built into interactive components to create" +
                " content filtering experiences.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.PillButtonScreen
    ) {
        val enabled = remember { mutableStateOf(true) }
        Section(
            title = "PillButton",
            sourceCode = sourceCodeOfPillButtonSample,
            content = {
                PillButtonSample(enabled.value)
            },
            options = {
                CheckBox(
                    checked = enabled.value,
                    onCheckStateChange = { enabled.value = !enabled.value },
                    label = "Enabled"
                )
            }
        )
        Section(
            title = "PillButton with Icon",
            sourceCode = sourceCodeOfPillButtonWithIconSample,
            content = {
                PillButtonWithIconSample()
            }
        )
    }
}

@Sample
@Composable
private fun PillButtonSample(enabled: Boolean) {
    val selected = remember { mutableStateOf(false) }
    PillButton(
        selected = selected.value,
        onSelectedChanged = { selected.value = !selected.value },
        content = { Text("Close") },
        disabled = !enabled
    )
}

@Sample
@Composable
private fun PillButtonWithIconSample() {
    val selected = remember { mutableStateOf(false) }
    PillButton(
        selected = selected.value,
        onSelectedChanged = { selected.value = !selected.value },
        content = {
            Icon(Icons.Default.Power, null)
            Text("Close")
        }
    )
}