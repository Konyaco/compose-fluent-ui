package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.Icon
import io.github.composefluent.component.PillButton
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Power
import io.github.composefluent.source.generated.FluentSourceFile

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