package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.component.CalendarDatePickerState.ChooseType
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.CaretDown
import com.konyaco.fluent.icons.filled.CaretUp
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualState
import com.konyaco.fluent.scheme.collectVisualState
import java.util.Calendar
import java.util.Date


/**
 * CalendarView shows a large view for showing and selecting dates.
 * DatePicker by contrast has a compact view with inline selection.
 * TODO: Add animations, scroll behaviors and refactor codes. Add selection mode (single, multiple, range)
 */
@Composable
@ExperimentalFluentApi
fun CalendarView(
    onChoose: (day: CalendarDatePickerState.Day) -> Unit,
    state: CalendarDatePickerState = remember { CalendarDatePickerState() }
) {
    // TODO: Replace by flyout when it's in CalendarDatePicker
    Layer(
        Modifier.width(300.dp),
        color = FluentTheme.colors.background.acrylic.defaultFallback
    ) {
        Column {
            // Header
            Row(Modifier.padding(4.dp).height(40.dp), verticalAlignment = Alignment.CenterVertically) {
                CalendarHeader(
                    modifier = Modifier.weight(1f),
                    text = state.viewHeaderText.value,
                    onClick = { state.toggleChooseType() },
                    disabled = state.currentChooseType.value == ChooseType.YEAR
                )
                PaginationButton(up = true, onClick = { state.up() })
                PaginationButton(up = false, onClick = { state.down() })
            }
            // Divider
            Box(
                Modifier.fillMaxWidth().height(1.dp)
                    .background(FluentTheme.colors.stroke.card.default)
            )
            // Content
            AnimatedContent(modifier = Modifier.size(300.dp), targetState = state.currentChooseType.value) {
                when (it) {
                    ChooseType.YEAR -> YearTable(state)
                    ChooseType.MONTH -> MonthTable(state)
                    ChooseType.DAY -> DateTable(state, onChoose = onChoose)
                }
            }
        }
    }

}

@Composable
private fun YearTable(state: CalendarDatePickerState) {
    Layer(
        Modifier.fillMaxWidth().height(300.dp),
        color = FluentTheme.colors.background.layer.default,
        border = null
    ) {
        // 4x4
        LazyVerticalGrid(
            GridCells.Fixed(4),
            modifier = Modifier.height(300.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalArrangement = Arrangement.SpaceAround,
            contentPadding = PaddingValues(12.dp)

        ) {
            itemsIndexed(state.candidateYears.value) { i, e ->
                Box(contentAlignment = Alignment.Center) {
                    Item(
                        text = e.value.toString(),
                        header = null,
                        size = ItemSize.MonthYear,
                        current = state.currentDay.value.year == e.value,
                        selected = false,
                        blackOut = false,
                        outOfRange = false,
                        onSelectedChange = { state.selectYear(e) }
                    )
                }
            }
        }
    }
}

@Composable
private fun MonthTable(state: CalendarDatePickerState) {
    // 4x4
    Layer(
        Modifier.fillMaxSize(),
        color = FluentTheme.colors.background.layer.default,
        border = null
    ) {
        val names = state.monthNames.value
        LazyVerticalGrid(
            GridCells.Fixed(4),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalArrangement = Arrangement.SpaceAround,
            contentPadding = PaddingValues(12.dp)
        ) {
            itemsIndexed(state.candidateMonths.value) { i, day ->
                Box(contentAlignment = Alignment.Center) {
                    val day by rememberUpdatedState(day)
                    val isCurrent by remember {
                        derivedStateOf {
                            state.currentDay.value.year == day.year && state.currentDay.value.monthValue == day.monthValue
                        }
                    }
                    val header by remember { derivedStateOf { if (day.monthValue == 0) day.year.toString() else null } }
                    Item(
                        text = names[day.monthValue],
                        header = header,
                        size = ItemSize.MonthYear,
                        current = isCurrent,
                        selected = false,
                        blackOut = false,
                        outOfRange = false,
                        onSelectedChange = { state.selectMonth(day) }
                    )
                }
            }
        }
    }
}

@Composable
private fun DateTable(
    state: CalendarDatePickerState,
    onChoose: (day: CalendarDatePickerState.Day) -> Unit
) {
    Layer(
        Modifier.fillMaxSize(),
        color = FluentTheme.colors.background.layer.default,
        border = null
    ) {
        Column(Modifier.padding(4.dp)) {
            // Day of Weeks
            Row(
                modifier = Modifier.fillMaxWidth().height(40.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                val weekNames = state.dayOfWeekNames.value
                val start = state.localeStartDayOfWeek - 1

                for (i in weekNames.indices) {
                    val j = (start + i) % weekNames.size
                    DaysOfTheWeek(weekNames[j])
                }
            }
            Spacer(Modifier.height(2.dp))
            LazyVerticalGrid(
                GridCells.Fixed(7),
                modifier = Modifier.height(250.dp).fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(2.dp),
            ) {
                itemsIndexed(state.candidateDays.value) { i, day ->
                    Box(contentAlignment = Alignment.Center) {
                        val day by rememberUpdatedState(day)
                        val current by remember { derivedStateOf { day == state.currentDay.value } }
                        val selected by remember { derivedStateOf { day == state.selectedDay.value } }
                        val outOfRange by remember { derivedStateOf { day.monthValue != state.viewMonth.value.monthValue } }
                        val header by remember { derivedStateOf { if (day.day == 1) state.monthNames.value[day.monthValue % 12] else null } }
                        Item(
                            text = day.day.toString(),
                            size = ItemSize.Day,
                            header = header,
                            current = current,
                            selected = selected,
                            blackOut = false, // TODO: Support blackOut later
                            outOfRange = outOfRange,
                            onSelectedChange = {
                                state.selectDay(day)
                                onChoose(day)
                            }
                        )
                    }
                }
            }
        }
    }
}

private enum class ItemSize {
    Day, MonthYear
}

@Composable
private fun CalendarHeader(
    modifier: Modifier,
    text: String,
    disabled: Boolean,
    onClick: () -> Unit
) {
    Box(modifier.height(40.dp).padding(horizontal = 4.dp), Alignment.Center) {
        SubtleButton(modifier = Modifier.height(30.dp), iconOnly = true, onClick = onClick, disabled = disabled) {
            Box(Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                Text(text = text, style = FluentTheme.typography.bodyStrong, textAlign = TextAlign.Start)
            }
        }
    }
}

@Composable
private fun PaginationButton(
    up: Boolean,
    onClick: () -> Unit
) {
    Box(Modifier.requiredSize(40.dp), Alignment.Center) {
        SubtleButton(modifier = Modifier.height(30.dp), onClick = onClick, iconOnly = true) {
            if (up) Icon(
                modifier = Modifier.size(12.dp),
                imageVector = Icons.Filled.CaretUp,
                contentDescription = "Up"
            )
            else Icon(
                modifier = Modifier.size(12.dp),
                imageVector = Icons.Filled.CaretDown,
                contentDescription = "Down"
            )
        }
    }
}

@Composable
private fun DaysOfTheWeek(text: String) {
    Box(Modifier.size(38.dp), contentAlignment = Alignment.Center) {
        Text(text = text, style = FluentTheme.typography.bodyStrong)
    }
}

private val activeColor
    @Composable
    get() = PentaVisualScheme<Color>(
        default = FluentTheme.colors.fillAccent.default,
        hovered = FluentTheme.colors.fillAccent.secondary,
        pressed = FluentTheme.colors.fillAccent.tertiary,
        disabled = FluentTheme.colors.fillAccent.disabled,
        focused = FluentTheme.colors.fillAccent.secondary
    )

private val inactiveColor
    @Composable
    get() = PentaVisualScheme<Color>(
        default = FluentTheme.colors.subtleFill.transparent,
        hovered = FluentTheme.colors.subtleFill.secondary,
        pressed = FluentTheme.colors.subtleFill.tertiary,
        disabled = FluentTheme.colors.subtleFill.disabled,
        focused = FluentTheme.colors.subtleFill.transparent
    )

@Composable
private fun Item(
    text: String,
    header: String?,
    size: ItemSize,
    current: Boolean,
    selected: Boolean,
    blackOut: Boolean,
    outOfRange: Boolean,
    onSelectedChange: (Boolean) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val visualState = interactionSource.collectVisualState(disabled = false)

    val fillColor = if (current && !selected) {
        activeColor.schemeFor(visualState)
    } else {
        inactiveColor.schemeFor(visualState)
    }

    val contentColor = if (current) {
        FluentTheme.colors.text.onAccent.primary
    } else {
        if (selected) {
            FluentTheme.colors.text.accent.primary
        } else if (outOfRange) {
            FluentTheme.colors.text.text.tertiary // Should be secondary in Figma, but it's more clear to use tertiary
        } else {
            FluentTheme.colors.text.text.primary
        }
    }

    val strokeColor = if (current) {
        if (selected) FluentTheme.colors.fillAccent.default
        else FluentTheme.colors.fillAccent.default
    } else {
        if (selected) FluentTheme.colors.fillAccent.default
        else Color.Transparent
    }


    Layer(
        modifier = Modifier.size(if (size == ItemSize.MonthYear) 56.dp else 40.dp),
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        shape = CircleShape,
        color = fillColor,
        border = BorderStroke(1.dp, strokeColor),
        contentColor = contentColor,
    ) {
        Box(
            modifier = Modifier.clickable(
                interactionSource = interactionSource,
                indication = null
            ) { onSelectedChange(!selected) },
            contentAlignment = Alignment.Center
        ) {
            // Selected background
            if (current && selected) {
                val fillColor = activeColor.schemeFor(visualState)
                Box(
                    Modifier.fillMaxSize().padding(2.dp)
                        .background(fillColor, CircleShape)
                )
            }
            Text(text = text)
            if (header != null) {
                Text(
                    modifier = Modifier.align(Alignment.TopCenter).padding(top = 2.dp),
                    text = header,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 8.sp,
                        lineHeight = 12.sp
                    )
                )
            }
        }
    }
}

class CalendarDatePickerState {
    private val locale = java.util.Locale.getDefault()
    private val calendar = Calendar.getInstance(locale)

    val currentChooseType = mutableStateOf<ChooseType>(ChooseType.DAY)
    val viewHeaderText = mutableStateOf("")

    val dayOfWeekNames = mutableStateOf(getDowNames())
    val monthNames = mutableStateOf(getMonthNames())

    enum class ChooseType {
        YEAR, MONTH, DAY
    }

    data class Year(val value: Int)
    data class Month(val year: Int, val monthValue: Int)
    data class Day(val year: Int, val monthValue: Int, val day: Int)

    //    val currentYear: MutableState<Year>
//    val currentMonth: MutableState<Month>
    val currentDay: MutableState<Day>

    //    val viewYear: MutableState<Year>
    val viewMonth: MutableState<Month>
//    val viewDay: MutableState<Day>

    val selectedDay: MutableState<Day>

    // Should be 7 * 6 = 42 cells
    val candidateYears = mutableStateOf<List<Year>>(emptyList())
    val candidateMonths = mutableStateOf<List<Month>>(emptyList())
    val candidateDays = mutableStateOf<List<Day>>(emptyList())

    // TODO: For localization, e.g. In China the start of week is Monday
    // FIXME: `firstDayOfWeek` should return 2(Monday), but returns 1(Sunday) in Java 17
    val localeStartDayOfWeek = calendar.firstDayOfWeek
//    val localeStartDayOfWeek = 2

    private fun getDowNames(): List<String> {
        val names = calendar.getDisplayNames(
            Calendar.DAY_OF_WEEK,
            Calendar.NARROW_STANDALONE,
            locale
        ) ?: calendar.getDisplayNames(
            Calendar.DAY_OF_WEEK,
            Calendar.SHORT_STANDALONE,
            locale
        )
        val result = MutableList(7) { "" }

        for (entry in names.entries) {
            // minus 1 because dof start from 1
            result[entry.value - 1] = entry.key
        }
        return result
    }

    private fun getMonthNames(): List<String> {
        val names = calendar.getDisplayNames(Calendar.MONTH, Calendar.SHORT_STANDALONE, locale)
        val result = MutableList(12) { "" }
        for (entry in names.entries) {
            result[entry.value] = entry.key
        }
        return result
    }

    init {
        val calendar = Calendar.getInstance()
        calendar.time = Date()
        val year = calendar.get(Calendar.YEAR)
        val monthValue = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
//        currentYear = mutableStateOf(Year(year))
//        viewYear = mutableStateOf(Year(year))
//        selectedYear = mutableStateOf(Year(year))
//        currentMonth = mutableStateOf(Month(year, monthValue))
        viewMonth = mutableStateOf(Month(year, monthValue))
//        selectedMonth = mutableStateOf(Month(year, monthValue))
        currentDay = mutableStateOf(Day(year, monthValue, day))
//        viewDay = mutableStateOf(Day(year, monthValue, day))
        selectedDay = mutableStateOf(Day(year, monthValue, day))
        calculateCandidateYears(year)
        calculateCandidateMonths(year)
        calculateCandidateDays(year, monthValue)
        computeHeaderText()
    }

    private fun calculateCandidateYears(currentYear: Int) {
        val startYear = currentYear / 10 * 10 // 2024 -> 2020
        val endYear = startYear + 16
        val candidateYears = (startYear until endYear).map {
            Year(it)
        }
        this.candidateYears.value = candidateYears
    }

    private fun calculateCandidateMonths(year: Int) {
        val candidateMonths = (0..15).map {
            Month(if (it >= 12) year + 1 else year, it % 12)
        }
        this.candidateMonths.value = candidateMonths
    }

    private fun calculateCandidateDays(year: Int, monthValue: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(year, monthValue, 1)
        val startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) // Start at Sunday(1)

        // Start day at the first `localeStartDayOfWeek(e.g. Sunday)` before this month
        // If localeStartDOW = Sunday(1):
        //   Wednesday(4) - Sunday(1) = 3
        // If localeStartDOW = Monday(2):
        //   Sunday(1) - Monday(2) = -1 -> 6   (case 1)
        //   Wednesday(4) - Monday(2) = 2
        // If this month (5/1) is Wednesday(4th), the offset should be 3, the start day should be 5/1 - 3days = 4/28
        // If this month (9/1) is Sunday(1th), the offset should be 0, the start day should be 7/1 - 0days = 7/1

        var startDayOffset = startDayOfWeek - localeStartDayOfWeek
        if (startDayOffset < 0) { // for case 1
            startDayOffset += 7
        }

        val startDayOfYear = calendar.get(Calendar.DAY_OF_YEAR) - startDayOffset

        // e.g from 4-29 to 6-9
        val daysToDisplay = 7 * 6
        val candidateDays = (startDayOfYear until startDayOfYear + daysToDisplay).map { dayOfYear ->
            calendar.set(Calendar.DAY_OF_YEAR, dayOfYear)
            val monthValue = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            Day(year, monthValue, day)
        }
        this.candidateDays.value = candidateDays
    }

    internal fun toggleChooseType() {
        when (currentChooseType.value) {
            ChooseType.YEAR -> {
                // Do nothing
            }

            ChooseType.MONTH -> {
                // Choose year
                currentChooseType.value = ChooseType.YEAR
            }

            ChooseType.DAY -> {
                // Choose month
                currentChooseType.value = ChooseType.MONTH
            }
        }
        computeHeaderText()
        calculateCandidates()
    }

    internal fun selectYear(year: Year) {
//        selectedYear.value = year
        viewMonth.value = Month(year.value, viewMonth.value.monthValue)
        currentChooseType.value = ChooseType.MONTH

        calculateCandidateMonths(year.value)
        computeHeaderText()
    }

    internal fun selectMonth(month: Month) {
//        selectedMonth.value = month
        viewMonth.value = Month(month.year, month.monthValue)
        currentChooseType.value = ChooseType.DAY

        calculateCandidateDays(month.year, month.monthValue)
        computeHeaderText()
    }

    internal fun selectDay(day: Day) {
//        viewMonth.value = Month(day.year, day.monthValue)
        selectedDay.value = day
        computeHeaderText()
    }

    internal fun down() {
        when (currentChooseType.value) {
            ChooseType.YEAR -> {
                nextYears()
            }

            ChooseType.MONTH -> {
                nextMonths()
            }

            ChooseType.DAY -> {
                nextMonth()
            }
        }
    }

    internal fun up() {
        when (currentChooseType.value) {
            ChooseType.YEAR -> {
                previousYears()
            }

            ChooseType.MONTH -> {
                previousMonths()
            }

            ChooseType.DAY -> {
                previousMonth()
            }
        }
    }

    private fun previousYears() {
        viewMonth.value = Month(viewMonth.value.year - 10, viewMonth.value.monthValue)
        calculateCandidateYears(viewMonth.value.year)
        computeHeaderText()
    }

    private fun nextYears() {
        viewMonth.value = Month(viewMonth.value.year + 10, viewMonth.value.monthValue)
        calculateCandidateYears(viewMonth.value.year)
        computeHeaderText()
    }

    private fun previousMonths() {
        val previousYear = viewMonth.value.year - 1
        viewMonth.value = Month(previousYear, viewMonth.value.monthValue)
        calculateCandidateMonths(previousYear)
        computeHeaderText()
    }

    private fun nextMonths() {
        val nextYear = viewMonth.value.year + 1
        viewMonth.value = Month(nextYear, viewMonth.value.monthValue)
        calculateCandidateMonths(nextYear)
        computeHeaderText()
    }

    private fun previousMonth() {
        val current = viewMonth.value
        var year = current.year
        var month = current.monthValue
        if (month == 0) {
            month = 11
            year -= 1
        } else {
            month -= 1
        }
        viewMonth.value = Month(year, month)
        calculateCandidates()
        computeHeaderText()
    }

    private fun nextMonth() {
        val current = viewMonth.value
        var year = current.year
        var month = current.monthValue
        if (month == 11) {
            month = 0
            year += 1
        } else {
            month += 1
        }
        viewMonth.value = Month(year, month)
        calculateCandidates()
        computeHeaderText()
    }

    private fun calculateCandidates() {
        val curr = viewMonth.value
        calculateCandidateYears(curr.year)
        calculateCandidateMonths(curr.year)
        calculateCandidateDays(curr.year, curr.monthValue)
    }


    private fun computeHeaderText() {
        when (currentChooseType.value) {
            ChooseType.YEAR -> {
                // 2020-2029
                val startYear = viewMonth.value.year / 10 * 10 // 2024 -> 2020
                val endYear = startYear + 9
                viewHeaderText.value = "$startYear-$endYear"
            }

            ChooseType.MONTH -> {
                // 2024
                viewHeaderText.value = viewMonth.value.year.toString()
            }

            ChooseType.DAY -> {
                val displayNames =
                    calendar.getDisplayNames(Calendar.MONTH, Calendar.SHORT_STANDALONE, locale)
                val curr = viewMonth.value
                val monthValue = curr.monthValue
                val year = curr.year
                val name = displayNames.firstNotNullOf { (k, v) ->
                    if (v == monthValue) k
                    else null
                }
                // TODO: Should be "May 2024" / "2024年 5月"
                viewHeaderText.value = "$name $year"
            }
        }
    }
}