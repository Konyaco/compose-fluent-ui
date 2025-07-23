@file:OptIn(ExperimentalFluentApi::class)

package io.github.composefluent.gallery.screen.datetime

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.TimePicker
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
import kotlinx.datetime.LocalTime

@Component(
    description = "A control that lets a user pick a time value."
)
@Composable
fun TimePickerScreen() {
    GalleryPage(
        title = "TimePicker",
        description = "Use a TimePicker to let users set a time in your app, for example to set a reminder. The TimePicker displays three controls for hour, minute, and AM/PM. These controls are easy to use with touch or mouse.",
        componentPath = FluentSourceFile.TimePicker,
        galleryPath = ComponentPagePath.TimePickerScreen
    ) {

        Section(
            title = "A TimePicker using a 12-hour clock",
            sourceCode = sourceCodeOfTimePicker12Sample
        ) {
            TimePicker12Sample()
        }
        Section(
            title = "A TimePicker using a 24-hour clock",
            sourceCode = sourceCodeOfTimePicker24Sample
        ) {
            TimePicker24Sample()
        }

    }
}

@Sample
@Composable
private fun TimePicker12Sample() {
    var value by remember { mutableStateOf<LocalTime?>(null) }
    TimePicker(
        value = value,
        onValueChange = { value = it },
        is12hour = true
    )
}

@Sample
@Composable
private fun TimePicker24Sample() {
    var value by remember { mutableStateOf<LocalTime?>(null) }
    TimePicker(
        value = value,
        onValueChange = { value = it },
        is12hour = false
    )
}