@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.datetime

import androidx.compose.runtime.Composable
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.component.CalendarDatePicker
import com.konyaco.fluent.component.CalendarView
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

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