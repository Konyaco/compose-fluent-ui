package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.Text
import io.github.composefluent.component.TriStateCheckBox
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

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

        var threeState by remember { mutableStateOf(ToggleableState.Off) }
        val threeStateOutput = remember { mutableStateOf("") }
        Section(
            title = "A 3-state CheckBox.",
            sourceCode = sourceCodeOfThreeStateCheckBoxSample,
            content = {
                ThreeStateCheckBoxSample(
                    toggleableState = threeState,
                    onToggleableStateChanged = {
                        threeState = it
                        threeStateOutput.value = "CheckBox is " + when(it) {
                            ToggleableState.On -> "checked"
                            ToggleableState.Off -> "unchecked"
                            ToggleableState.Indeterminate -> "indeterminate"
                        } + "."
                    }
                )
            },
            output = {
                Text(threeStateOutput.value)
            }
        )

        Section(
            title = "Using a 3-state CheckBox",
            sourceCode = sourceCodeOfParentCheckBoxSample,
            content = { ParentCheckBoxSample() }
        )
    }
}

@Sample
@Composable
private fun TwoStateCheckBoxSample(checked: Boolean, onCheckedChanged: (Boolean) -> Unit) {

    CheckBox(checked, "Two-state CheckBox", onCheckStateChange = onCheckedChanged)
}

@Sample
@Composable
private fun ThreeStateCheckBoxSample(toggleableState: ToggleableState, onToggleableStateChanged: (ToggleableState) -> Unit) {

    TriStateCheckBox(
        state = toggleableState,
        label = "Three-state CheckBox",
        onClick = {
            val nextState = when (toggleableState) {
                ToggleableState.Off -> ToggleableState.On
                ToggleableState.On -> ToggleableState.Indeterminate
                ToggleableState.Indeterminate -> ToggleableState.Off
            }
            onToggleableStateChanged(nextState)
        }
    )
}

@Sample
@Composable
private fun ParentCheckBoxSample() {
    val checkedItems = remember { mutableStateListOf(false, true, false) }
    val parentState by remember(checkedItems) {
        derivedStateOf {
            when(checkedItems.sumOf { if (it) 1 else 0 }) {
                checkedItems.size -> ToggleableState.On
                0 -> ToggleableState.Off
                else -> ToggleableState.Indeterminate
            }
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        TriStateCheckBox(
            state = parentState,
            label = "Select all",
            onClick = {
                val targetState = parentState != ToggleableState.Off
                checkedItems.forEachIndexed { index, _ ->
                    checkedItems[index] = !targetState
                }
            }
        )
        checkedItems.forEachIndexed { index, value ->
            CheckBox(
                checked = value,
                label = "Option ${index + 1}",
                onCheckStateChange = { checkedItems[index] = it },
                modifier = Modifier.padding(start = 24.dp)
            )
        }
    }
}
