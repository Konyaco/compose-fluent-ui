package com.konyaco.fluent.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.ExperimentalFluentApi

/**
 * A calendar view lets a user view and interact with a calendar that they can navigate by month, year, or decade. A user can select a single date or a range of dates. It doesn't have a picker surface and the calendar is always visible.
 *
 * The calendar date picker is a drop down control that's optimized for picking a single date from a calendar view where contextual information like the day of the week or fullness of the calendar is important. The calendar date picker has an internal CalendarView for picking a date.
 */
@Composable
@ExperimentalFluentApi
fun CalendarDatePicker(
    onChoose: (CalendarDatePickerState.Day) -> Unit,
    state: CalendarDatePickerState = remember { CalendarDatePickerState() }
) {
    var day by remember { mutableStateOf<CalendarDatePickerState.Day?>(null) }
    BasicFlyoutContainer(
        flyout = {
            BasicFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                contentPadding = PaddingValues()
            ) {
                CalendarViewLayout(
                    onChoose = {
                        day = it
                        onChoose(it)
                        isFlyoutVisible = false
                    },
                    state = state
                )
            }
        },
        content = {
            Button(
                onClick = {
                    isFlyoutVisible = true
                },
                content = {
                    Text(
                        day?.let { day ->
                            "${day.year}/${day.monthValue + 1}/${day.day}"
                        } ?: "Pick a date"
                    )
                    FontIcon(type = FontIconPrimitive.Calendar, contentDescription = null)
                }
            )
        }
    )
}
