package io.github.composefluent.gallery.screen.collections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.CardExpanderItem
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.DropDownButton
import io.github.composefluent.component.Expander
import io.github.composefluent.component.ExpanderItem
import io.github.composefluent.component.ExpanderItemSeparator
import io.github.composefluent.component.Icon
import io.github.composefluent.component.Switcher
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.ChevronRight
import io.github.composefluent.icons.regular.Power
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "Control that displays a header and a collapsible content area.")
@Composable
fun ExpanderScreen() {
    GalleryPage(
        title = "Expander",
        description = "An expander control that can be used to create Windows 11 style settings experiences.",
        componentPath = FluentSourceFile.Expander,
        galleryPath = ComponentPagePath.ExpanderScreen
    ) {
        Section(
            title = "Basic Expander",
            sourceCode = sourceCodeOfExpanderSample,
            content = { ExpanderSample() }
        )
        Section(
            title = "Expander without icon",
            sourceCode = sourceCodeOfExpanderSampleWithoutIcon,
            content = { ExpanderSampleWithoutIcon() }
        )
        Section(
            title = "Card Expander Item",
            sourceCode = sourceCodeOfCardExpanderItemSample,
            content = { CardExpanderItemSample() }
        )
        val enabled = remember { mutableStateOf(true) }
        Section(
            title = "Clickable Card Expander Item",
            sourceCode = sourceCodeOfClickableCardExpanderItemSample,
            content = { ClickableCardExpanderItemSample(enabled = enabled.value) },
            options = {
                CheckBox(
                    checked = enabled.value,
                    onCheckStateChange = { enabled.value = it },
                    label = "Enabled"
                )
            }
        )
    }
}

@Sample
@Composable
private fun ExpanderSample() {
    val expanded = remember { mutableStateOf(false) }
    Expander(
        expanded = expanded.value,
        onExpandedChanged = { expanded.value = it },
        heading = { Text("Power button functionality") },
        caption = { Text("Adjust what yor power buttons control") },
        icon = { Icon(Icons.Default.Power, null) },
        trailing = {
            val checked = remember { mutableStateOf(true) }
            Switcher(
                checked = checked.value,
                { checked.value = it },
                textBefore = true,
                text = if (checked.value) "On" else "Off"
            )
        }
    ) {
        ExpanderItem(
            heading = { Text("When I press the power button on battery") },
            trailing = { DropDownButton(onClick = {}, content = { Text("Sleep") }) }
        )
        ExpanderItemSeparator()
        ExpanderItem(
            heading = { Text("When I press the power button when plugged in") },
            trailing = { DropDownButton(onClick = {}, content = { Text("Sleep") }) }
        )
    }
}

@Sample
@Composable
private fun ExpanderSampleWithoutIcon() {
    val expanded = remember { mutableStateOf(false) }
    Expander(
        expanded = expanded.value,
        onExpandedChanged = { expanded.value = it },
        heading = { Text("Power button functionality") },
        caption = { Text("Adjust what yor power buttons control") },
        icon = null,
        trailing = {
            val checked = remember { mutableStateOf(true) }
            Switcher(
                checked = checked.value,
                { checked.value = it },
                textBefore = true,
                text = if (checked.value) "On" else "Off"
            )
        }
    ) {
        ExpanderItem(
            heading = { Text("When I press the power button on battery") },
            trailing = { DropDownButton(onClick = {}, content = { Text("Sleep") }) },
            icon = null
        )
    }
}

@Sample
@Composable
private fun CardExpanderItemSample() {
    CardExpanderItem(
        heading = { Text("Power button functionality") },
        caption = { Text("Adjust what yor power buttons control") },
        icon = { Icon(Icons.Default.Power, null) },
        trailing = {
            val checked = remember { mutableStateOf(true) }
            Switcher(
                checked = checked.value,
                { checked.value = it },
                textBefore = true,
                text = if (checked.value) "On" else "Off"
            )
        }
    )
}

@Sample
@Composable
private fun ClickableCardExpanderItemSample(enabled: Boolean = true) {
    CardExpanderItem(
        heading = { Text("Power button functionality") },
        caption = { Text("Adjust what yor power buttons control") },
        icon = { Icon(Icons.Default.Power, null) },
        dropdown = { Icon(Icons.Default.ChevronRight, null) },
        onClick = {},
        enabled = enabled
    )
}