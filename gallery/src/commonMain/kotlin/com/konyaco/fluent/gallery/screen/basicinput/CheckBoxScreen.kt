package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.component.TodoComponent
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 7, description = "A control that a user can select or clear.")
@Composable
fun CheckBoxScreen() {
    GalleryPage(
        title = "CheckBox",
        description = "CheckBox controls let the user select a combination of binary options. In contrast, RadioButton controls allow the user to select from mutually exclusive options. The indeterminate state is used to indicate that an option is set for some, but not all, child options. Don't allow users to set an indeterminate state directly to indicate a third option.",
        componentPath = FluentSourceFile.CheckBox,
        galleryPath = ComponentPagePath.CheckBoxScreen
    ) {
        var twoStateChecked by remember { mutableStateOf(false) }
        val twoStateOutput = remember { mutableStateOf("") }
        Section(
            title = "A 2-state CheckBox.",
            sourceCode = sourceCodeOfTwoStateCheckBoxSample,
            content = {
                TwoStateCheckBoxSample(
                    checked = twoStateChecked,
                    onCheckedChanged = {
                        twoStateChecked = it
                        twoStateOutput.value = if (it) {
                            "You checked the box."
                        } else {
                            "You unchecked the box."
                        }
                    }
                )
            },
            output = {
                Text(twoStateOutput.value)
            }
        )
        Section("A 3-state CheckBox.", "") {
            TodoComponent()
        }
        Section("Using a 3-state CheckBox", "") {
            TodoComponent()
        }
    }
}

@Sample
@Composable
private fun TwoStateCheckBoxSample(checked: Boolean, onCheckedChanged: (Boolean) -> Unit) {

    CheckBox(checked, "Two-state CheckBox", onCheckStateChange = onCheckedChanged)
}