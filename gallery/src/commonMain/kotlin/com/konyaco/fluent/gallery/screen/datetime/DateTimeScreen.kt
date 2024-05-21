package com.konyaco.fluent.gallery.screen.datetime

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.CalendarDatePicker
import com.konyaco.fluent.component.CalendarView
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Component
@Composable
fun DateTimeScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "CalendarDatePicker",
            "A control that lets users pick a date value using a calendar."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A CalendarDatePicker",
                sourceCode = sourceCodeOfDatePickerSample,
                content = { DatePickerSample() }
            )
            Spacer(Modifier.height(32.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "CalendarView shows a large view for showing and selecting dates.",
                sourceCode = sourceCodeOfCalendarViewSample,
                content = { CalendarViewSample() }
            )
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