@file:OptIn(ExperimentalFluentApi::class)

package io.github.composefluent.gallery.screen.datetime

import androidx.compose.runtime.Composable
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.CalendarDatePicker
import io.github.composefluent.component.CalendarView
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "A control that presents a calendar for a user to " +
        "choose a date from.")
@Composable
fun CalendarScreen() {
    GalleryPage(
        title = "Calendar",
        description = "Lets users pick a date value using a calendar.",
        componentPath = FluentSourceFile.CalendarView,
        galleryPath = ComponentPagePath.CalendarScreen
    ) {
        Section(
            title = "A CalendarDatePicker",
            sourceCode = sourceCodeOfCalendarDatePickerSample
        ) {
            CalendarDatePickerSample()
        }

        Section(
            title = "CalendarView shows a large view for showing and selecting dates.",
            sourceCode = sourceCodeOfCalendarViewSample
        ) {
            CalendarViewSample()
        }
    }
}

@Sample
@Composable
private fun CalendarDatePickerSample() {
    CalendarDatePicker(onChoose = {})
}

@Sample
@Composable
private fun CalendarViewSample() {
    CalendarView(onChoose = {})
}