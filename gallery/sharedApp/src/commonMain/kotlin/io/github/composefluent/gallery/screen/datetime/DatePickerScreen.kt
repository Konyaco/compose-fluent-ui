@file:OptIn(ExperimentalFluentApi::class)

package io.github.composefluent.gallery.screen.datetime

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.DatePicker
import io.github.composefluent.component.rememberDatePickerFormat
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format.DayOfWeekNames
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.Padding
import kotlinx.datetime.format.char

@Component(
    description = "A control that lets a user pick a date value."
)
@Composable
fun DatePickerScreen() {
    GalleryPage(
        title = "DatePicker",
        description = "Use a DatePicker to select a date with locale-aware day, month, and year wheels.",
        componentPath = FluentSourceFile.DatePicker,
        galleryPath = ComponentPagePath.DatePickerScreen
    ) {
        Section(
            title = "A DatePicker using the platform locale",
            sourceCode = sourceCodeOfDefaultDatePickerSample
        ) {
            DefaultDatePickerSample()
        }
        Section(
            title = "A DatePicker with custom month and day text",
            sourceCode = sourceCodeOfCustomDatePickerFormatSample
        ) {
            CustomDatePickerFormatSample()
        }
        Section(
            title = "A DatePicker with a custom width",
            sourceCode = sourceCodeOfCustomDatePickerWidthSample
        ) {
            CustomDatePickerWidthSample()
        }
    }
}

@Sample
@Composable
private fun DefaultDatePickerSample() {
    var value by remember { mutableStateOf<LocalDate?>(null) }
    DatePicker(
        value = value,
        onValueChange = { value = it }
    )
}

@Sample
@Composable
private fun CustomDatePickerFormatSample() {
    var value by remember { mutableStateOf<LocalDate?>(null) }
    val format = rememberDatePickerFormat {
        default()
        month {
            weight = 2f
            contentFormat = LocalDate.Format {
                monthName(MonthNames.ENGLISH_FULL)
            }
        }
        day {
            contentFormat = LocalDate.Format {
                day(Padding.NONE)
                chars(" (")
                dayOfWeek(DayOfWeekNames.ENGLISH_ABBREVIATED)
                char(')')
            }
        }
    }

    DatePicker(
        value = value,
        onValueChange = { value = it },
        format = format
    )
}

@Sample
@Composable
private fun CustomDatePickerWidthSample() {
    var value by remember { mutableStateOf<LocalDate?>(null) }
    DatePicker(
        modifier = Modifier.width(420.dp),
        value = value,
        onValueChange = { value = it }
    )
}
