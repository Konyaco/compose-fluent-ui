package io.github.composefluent.component

import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.number
import kotlinx.datetime.todayIn
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

internal interface DatePickerCalendarModel {
    fun options(
        field: DatePickerField,
        candidate: LocalDate,
        range: ClosedRange<LocalDate>
    ): PickerWheelData<Int>

    fun selectedValue(field: DatePickerField, candidate: LocalDate): Int

    fun resolve(
        field: DatePickerField,
        value: Int,
        candidate: LocalDate,
        range: ClosedRange<LocalDate>
    ): LocalDate
}

internal object IsoDatePickerCalendarModel : DatePickerCalendarModel {
    override fun options(
        field: DatePickerField,
        candidate: LocalDate,
        range: ClosedRange<LocalDate>
    ): PickerWheelData<Int> {
        require(range.start <= range.endInclusive) {
            "DatePicker range start must not be after its end"
        }
        val clampedCandidate = candidate.coerceIn(range)
        val values = when (field) {
            DatePickerField.Year -> range.start.year..range.endInclusive.year
            DatePickerField.Month -> monthRange(clampedCandidate.year, range)
            DatePickerField.Day -> dayRange(
                year = clampedCandidate.year,
                month = clampedCandidate.month.number,
                range = range
            )
        }
        return IntRangePickerWheelData(values)
    }

    override fun selectedValue(field: DatePickerField, candidate: LocalDate): Int =
        when (field) {
            DatePickerField.Day -> candidate.day
            DatePickerField.Month -> candidate.month.number
            DatePickerField.Year -> candidate.year
        }

    override fun resolve(
        field: DatePickerField,
        value: Int,
        candidate: LocalDate,
        range: ClosedRange<LocalDate>
    ): LocalDate {
        require(range.start <= range.endInclusive) {
            "DatePicker range start must not be after its end"
        }
        val current = candidate.coerceIn(range)
        val resolved = when (field) {
            DatePickerField.Day -> LocalDate(
                year = current.year,
                month = current.month.number,
                day = value.coerceIn(1, daysInIsoMonth(current.year, current.month.number))
            )

            DatePickerField.Month -> {
                val month = value.coerceIn(1, 12)
                LocalDate(
                    year = current.year,
                    month = month,
                    day = current.day.coerceAtMost(daysInIsoMonth(current.year, month))
                )
            }

            DatePickerField.Year -> LocalDate(
                year = value,
                month = current.month.number,
                day = current.day.coerceAtMost(daysInIsoMonth(value, current.month.number))
            )
        }
        return resolved.coerceIn(range)
    }

    private fun monthRange(
        year: Int,
        range: ClosedRange<LocalDate>
    ): IntRange {
        val firstMonth = if (year == range.start.year) range.start.month.number else 1
        val lastMonth = if (year == range.endInclusive.year) {
            range.endInclusive.month.number
        } else {
            12
        }
        return firstMonth..lastMonth
    }

    private fun dayRange(
        year: Int,
        month: Int,
        range: ClosedRange<LocalDate>
    ): IntRange {
        val firstDay = if (
            year == range.start.year && month == range.start.month.number
        ) {
            range.start.day
        } else {
            1
        }
        val lastDay = if (
            year == range.endInclusive.year && month == range.endInclusive.month.number
        ) {
            range.endInclusive.day
        } else {
            daysInIsoMonth(year, month)
        }
        return firstDay..lastDay
    }
}

internal fun LocalDate.coerceIn(range: ClosedRange<LocalDate>): LocalDate = when {
    this < range.start -> range.start
    this > range.endInclusive -> range.endInclusive
    else -> this
}

@OptIn(ExperimentalTime::class)
internal fun currentDatePickerDate(): LocalDate =
    Clock.System.todayIn(TimeZone.currentSystemDefault())

internal fun defaultDatePickerMinimumDate(): LocalDate {
    val currentYear = currentDatePickerDate().year
    return LocalDate(
        year = currentYear - DefaultDatePickerYearRange,
        month = 1,
        day = 1
    )
}

internal fun defaultDatePickerMaximumDate(): LocalDate {
    val currentYear = currentDatePickerDate().year
    return LocalDate(
        year = currentYear + DefaultDatePickerYearRange,
        month = 12,
        day = 31
    )
}

private fun daysInIsoMonth(year: Int, month: Int): Int = when (month) {
    2 -> if (isIsoLeapYear(year)) 29 else 28
    4, 6, 9, 11 -> 30
    1, 3, 5, 7, 8, 10, 12 -> 31
    else -> throw IllegalArgumentException("month must be in the range 1..12")
}

private fun isIsoLeapYear(year: Int): Boolean =
    year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

private const val DefaultDatePickerYearRange = 100
