@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.datetime

import androidx.compose.runtime.Composable
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.component.CalendarDatePicker
import com.konyaco.fluent.component.CalendarView
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage

@Component
@Composable
fun DateTimeScreen() {
    GalleryPage(
        title = "DateTime",
        description = "Lets users pick a date value using a calendar.",
    ) {
        Section(
            title = "A CalendarDatePicker",
            sourceCode = sourceCodeOfDatePickerSample
        ) {
            DatePickerSample()
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
private fun DatePickerSample() {
    CalendarDatePicker(onChoose = {})
}

@Sample
@Composable
private fun CalendarViewSample() {
    CalendarView(onChoose = {})
}