package io.github.composefluent.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.layout.datetime.IntRangePickerWheelData
import io.github.composefluent.layout.datetime.PickerFlyoutContainer
import io.github.composefluent.layout.datetime.PickerFlyoutFooter
import io.github.composefluent.layout.datetime.PickerItemHeight
import io.github.composefluent.layout.datetime.PickerSelectionIndicator
import io.github.composefluent.layout.datetime.PickerWheel
import io.github.composefluent.layout.datetime.PickerWheelData
import io.github.composefluent.layout.datetime.PickerWheelDivider
import io.github.composefluent.layout.datetime.PickerWidth
import io.github.composefluent.platform.PlatformCalendarData
import io.github.composefluent.platform.PlatformCalendarField
import io.github.composefluent.platform.getLocalCalendarData
import io.github.composefluent.platform.getLocalLocaleIdentifier
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.Padding
import kotlinx.datetime.number
import kotlinx.datetime.todayIn
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

/**
 * Displays a compact control that lets the user select a date with linked wheel pickers.
 *
 * The visible date fields, their order, labels, and item text are controlled by [format]. The
 * default format follows the platform locale. Changes made in the flyout remain a candidate until
 * the user accepts them; cancelling or dismissing the flyout leaves [value] unchanged.
 *
 * When [value] is `null`, opening the picker starts at today's date clamped into the inclusive
 * [minDate] through [maxDate] range. Fields hidden by [format] remain part of that complete
 * candidate date and continue to participate in validity and range clamping.
 *
 * Date arithmetic and selectable values use the ISO proleptic Gregorian calendar. The platform
 * locale affects presentation, including the default field order, month names, and available
 * localized field labels, but does not change the calendar system.
 *
 * @param value The confirmed date, or `null` when no date has been selected.
 * @param onValueChange Called with the accepted date when it differs from [value]. Cancelling or
 * dismissing the flyout does not invoke this callback.
 * @param modifier The [Modifier] applied to the selection button and its flyout anchor. Set a
 * width with this modifier to customize the selection bar and flyout width; the picker keeps a
 * minimum width of `300.dp`.
 * @param disabled Whether the picker ignores input and prevents its flyout from opening.
 * @param minDate The first selectable date, inclusive. Defaults to today minus 100 years.
 * @param maxDate The last selectable date, inclusive. Defaults to today plus 100 years.
 * @param format The immutable field layout and text-format configuration.
 * @throws IllegalArgumentException If [minDate] is after [maxDate], or if a non-null [value] is
 * outside the selectable range.
 */
@Composable
@ExperimentalFluentApi
fun DatePicker(
    value: LocalDate?,
    onValueChange: (LocalDate?) -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    minDate: LocalDate = DatePickerDefaults.minimumDate(),
    maxDate: LocalDate = DatePickerDefaults.maximumDate(),
    format: DatePickerFormat = DatePickerDefaults.format()
) {
    require(minDate <= maxDate) { "minDate must not be after maxDate" }
    require(value == null || value in minDate..maxDate) {
        "value must be null or within minDate..maxDate"
    }

    val range = remember(minDate, maxDate) { minDate..maxDate }
    var open by remember { mutableStateOf(false) }
    var candidateDate by remember(value, minDate, maxDate) {
        mutableStateOf((value ?: currentDatePickerDate()).coerceIn(range))
    }
    val anchorFocusRequester = remember { FocusRequester() }
    var pickerWidthPx by remember { mutableIntStateOf(0) }
    val pickerWidth = with(LocalDensity.current) {
        pickerWidthPx.toDp()
    }.coerceAtLeast(PickerWidth)
    var restoreAnchorFocus by remember { mutableStateOf(false) }

    fun closePicker(restoreFocus: Boolean = true) {
        restoreAnchorFocus = restoreFocus
        open = false
    }

    LaunchedEffect(value, minDate, maxDate, open) {
        if (open) {
            candidateDate = (value ?: currentDatePickerDate()).coerceIn(range)
        }
    }
    LaunchedEffect(disabled) {
        if (disabled && open) closePicker(restoreFocus = false)
    }
    LaunchedEffect(open, disabled, restoreAnchorFocus) {
        if (!open && !disabled && restoreAnchorFocus) {
            anchorFocusRequester.requestFocus()
            restoreAnchorFocus = false
        }
    }

    PickerFlyoutContainer(
        expanded = open,
        onDismissRequest = { closePicker() },
        flyoutContent = { visibleItemsCount ->
            Column(Modifier.width(pickerWidth).padding(1.dp)) {
                Box {
                    PickerSelectionIndicator(format.fields.map { it.weight })
                    Row(Modifier.height(PickerItemHeight * visibleItemsCount)) {
                        format.fields.forEachIndexed { index, fieldFormat ->
                            key(fieldFormat.field) {
                                Box(Modifier.weight(fieldFormat.weight)) {
                                    DatePickerWheel(
                                        fieldFormat = fieldFormat,
                                        candidateDate = candidateDate,
                                        range = range,
                                        visibleItemsCount = visibleItemsCount,
                                        onCandidateDateChange = { candidateDate = it }
                                    )
                                }
                            }
                            if (index < format.fields.lastIndex) PickerWheelDivider()
                        }
                    }
                }
                PickerFlyoutFooter(
                    onAccept = {
                        if (candidateDate != value) onValueChange(candidateDate)
                        closePicker()
                    },
                    onCancel = { closePicker() }
                )
            }
        },
        anchor = { anchorModifier ->
            Box(
                modifier = anchorModifier
                    .widthIn(min = PickerWidth)
                    .onSizeChanged { pickerWidthPx = it.width },
                propagateMinConstraints = true
            ) {
                DatePickerButton(
                    modifier = modifier.focusRequester(anchorFocusRequester),
                    value = value,
                    format = format,
                    disabled = disabled,
                    onClick = {
                        candidateDate = (value ?: currentDatePickerDate()).coerceIn(range)
                        open = true
                    }
                )
            }
        }
    )
}

@Composable
private fun DatePickerWheel(
    fieldFormat: DatePickerFieldFormat,
    candidateDate: LocalDate,
    range: ClosedRange<LocalDate>,
    visibleItemsCount: Int,
    onCandidateDateChange: (LocalDate) -> Unit
) {
    val model = IsoDatePickerCalendarModel
    val data = when (fieldFormat.field) {
        DatePickerField.Year -> remember(range.start, range.endInclusive) {
            model.options(fieldFormat.field, candidateDate, range)
        }

        DatePickerField.Month -> remember(
            candidateDate.year,
            range.start,
            range.endInclusive
        ) {
            model.options(fieldFormat.field, candidateDate, range)
        }

        DatePickerField.Day -> remember(
            candidateDate.year,
            candidateDate.month,
            range.start,
            range.endInclusive
        ) {
            model.options(fieldFormat.field, candidateDate, range)
        }
    }
    val selectedValue = model.selectedValue(fieldFormat.field, candidateDate)
    val itemText = remember(fieldFormat, candidateDate, range) {
        { option: Int ->
            fieldFormat.contentFormat.format(
                model.resolve(
                    field = fieldFormat.field,
                    value = option,
                    candidate = candidateDate,
                    range = range
                )
            )
        }
    }

    key(data, visibleItemsCount) {
        PickerWheel(
            data = data,
            selectedValue = selectedValue,
            onSelectedValueChange = { option ->
                val resolvedDate = model.resolve(
                    field = fieldFormat.field,
                    value = option,
                    candidate = candidateDate,
                    range = range
                )
                if (resolvedDate != candidateDate) onCandidateDateChange(resolvedDate)
            },
            visibleItemsCount = visibleItemsCount,
            looping = fieldFormat.field != DatePickerField.Year,
            label = fieldFormat.label,
            itemText = itemText
        )
    }
}

@Composable
private fun DatePickerButton(
    modifier: Modifier,
    value: LocalDate?,
    format: DatePickerFormat,
    disabled: Boolean,
    onClick: () -> Unit
) {
    val displayValues = remember(value, format) {
        format.fields.map { fieldFormat ->
            value?.let(fieldFormat.contentFormat::format) ?: fieldFormat.label
        }
    }
    Button(
        modifier = modifier
            .widthIn(min = PickerWidth, max = PickerWidth)
            .semantics {
                stateDescription = displayValues.joinToString(", ")
            },
        onClick = onClick,
        disabled = disabled
    ) {
        val labelColor = when {
            disabled -> FluentTheme.colors.text.text.tertiary
            value == null -> FluentTheme.colors.text.text.secondary
            else -> FluentTheme.colors.text.text.primary
        }
        displayValues.forEachIndexed { index, text ->
            Text(
                modifier = Modifier.weight(format.fields[index].weight),
                textAlign = TextAlign.Center,
                text = text,
                color = labelColor
            )
            if (index < displayValues.lastIndex) {
                Box(
                    Modifier
                        .size(1.dp, 30.dp)
                        .background(FluentTheme.colors.stroke.control.default)
                )
            }
        }
    }
}

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

/** Identifies a field displayed by a [DatePicker]. */
enum class DatePickerField {
    /** The day-of-month field. */
    Day,

    /** The month field. */
    Month,

    /** The year field. */
    Year
}

/**
 * Describes the visible fields, order, labels, and item text used by a [DatePicker].
 *
 * Instances are immutable. When constructing a format inside a composable function, remember the
 * returned value to avoid rebuilding the DSL during every recomposition. Prefer
 * [rememberDatePickerFormat] when the format uses [DatePickerFormatBuilder.default], because it
 * also updates the format when the platform locale changes.
 */
@Immutable
class DatePickerFormat internal constructor(
    internal val fields: List<DatePickerFieldFormat>
)

/**
 * Builds a [DatePickerFormat].
 *
 * This factory is useful outside composition. Inside a composable function, wrap it in [remember]
 * or use [rememberDatePickerFormat] to avoid executing [builder] and creating formatters again on
 * every recomposition.
 *
 * @param builder The configuration applied to the new format.
 * @throws IllegalArgumentException If no field is visible, an explicit field order is invalid,
 * or a visible field has a non-positive or non-finite weight.
 */
fun DatePickerFormat(
    builder: DatePickerFormatBuilder.() -> Unit
): DatePickerFormat = DatePickerFormatBuilder(getLocalCalendarData())
    .apply(builder)
    .build()

/**
 * Builds and remembers an immutable [DatePickerFormat].
 *
 * The platform locale identifier and every value in [keys] participate in the remembered identity.
 * Values captured by [builder] that can change must also be supplied in [keys]; otherwise the
 * remembered format intentionally keeps the configuration from the composition in which it was
 * created.
 *
 * @param keys Values whose changes should rebuild the format.
 * @param builder The non-composable configuration applied when a new format is required.
 * @throws IllegalArgumentException If no field is visible, an explicit field order is invalid,
 * or a visible field has a non-positive or non-finite weight.
 */
@Composable
fun rememberDatePickerFormat(
    vararg keys: Any?,
    builder: @DisallowComposableCalls DatePickerFormatBuilder.() -> Unit
): DatePickerFormat {
    val localeIdentifier = getLocalLocaleIdentifier()
    return remember(localeIdentifier, *keys) {
        DatePickerFormatBuilder(getLocalCalendarData()).apply(builder).build()
    }
}

/** Receiver used to build a [DatePickerFormat]. */
class DatePickerFormatBuilder internal constructor(
    private val calendarData: PlatformCalendarData
) {
    private val fieldFormats = mutableMapOf<DatePickerField, MutableDatePickerFieldFormat>()
    private val fieldOrder = mutableListOf<DatePickerField>()
    private var explicitOrder: List<DatePickerField>? = null
    private val localizedMonthNames = MonthNames(calendarData.monthNames)

    /**
     * Inserts all date fields using the platform locale's order and month names, together with
     * localized field labels where available.
     *
     * Calling a field function after `default()` updates that field without moving it. Calling
     * `default()` after field functions preserves their settings but resets their order to the
     * platform default.
     */
    fun default() {
        calendarData.fieldOrder.forEach { calendarField ->
            val field = calendarField.toDatePickerField()
            fieldFormats.getOrPut(field) { defaultFormat(field) }
        }
        fieldOrder.clear()
        fieldOrder.addAll(calendarData.fieldOrder.map(PlatformCalendarField::toDatePickerField))
        explicitOrder = null
    }

    /** Adds or updates the day field without moving an existing field. */
    fun day(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Day, block)
    }

    /** Adds or updates the month field without moving an existing field. */
    fun month(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Month, block)
    }

    /** Adds or updates the year field without moving an existing field. */
    fun year(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Year, block)
    }

    /**
     * Sets the final order of all visible fields.
     *
     * [fields] must contain every visible field exactly once and must not contain hidden fields.
     * Validation is performed after the complete DSL block has run, so visibility can be changed
     * before or after this call.
     */
    fun order(vararg fields: DatePickerField) {
        explicitOrder = fields.toList()
    }

    internal fun build(): DatePickerFormat {
        val visibleFields = fieldFormats
            .filterValues { it.visible }
            .keys
        require(visibleFields.isNotEmpty()) {
            "DatePickerFormat must contain at least one visible field"
        }
        visibleFields.forEach { field ->
            val weight = checkNotNull(fieldFormats[field]).weight
            require(weight.isFinite() && weight > 0f) {
                "DatePickerFormat weight for $field must be finite and greater than 0, " +
                    "was $weight"
            }
        }

        val resolvedOrder = explicitOrder?.also { order ->
            require(order.size == order.toSet().size) {
                "DatePickerFormat order must not contain duplicate fields"
            }
            require(order.toSet() == visibleFields) {
                "DatePickerFormat order must contain every visible field exactly once"
            }
        } ?: fieldOrder.filter { it in visibleFields }

        return DatePickerFormat(
            resolvedOrder.map { field ->
                val fieldFormat = checkNotNull(fieldFormats[field])
                DatePickerFieldFormat(
                    field = field,
                    label = fieldFormat.label,
                    contentFormat = fieldFormat.contentFormat,
                    weight = fieldFormat.weight
                )
            }
        )
    }

    private fun configure(
        field: DatePickerField,
        block: DatePickerFieldFormatBuilder.() -> Unit
    ) {
        val current = fieldFormats.getOrPut(field) {
            fieldOrder += field
            defaultFormat(field)
        }
        val builder = DatePickerFieldFormatBuilder(
            visible = current.visible,
            label = current.label,
            contentFormat = current.contentFormat,
            weight = current.weight
        ).apply(block)
        fieldFormats[field] = MutableDatePickerFieldFormat(
            visible = builder.visible,
            label = builder.label,
            contentFormat = builder.contentFormat,
            weight = builder.weight
        )
    }

    private fun defaultFormat(field: DatePickerField): MutableDatePickerFieldFormat {
        val calendarField = field.toPlatformCalendarField()
        return MutableDatePickerFieldFormat(
            visible = true,
            label = checkNotNull(calendarData.fieldLabels[calendarField]),
            contentFormat = when (field) {
                DatePickerField.Day -> LocalDate.Format { day(Padding.NONE) }
                DatePickerField.Month -> LocalDate.Format { monthName(localizedMonthNames) }
                DatePickerField.Year -> LocalDate.Format { year() }
            },
            weight = 1f
        )
    }
}

/** Configures one field in a [DatePickerFormat]. */
class DatePickerFieldFormatBuilder internal constructor(
    /** Whether this field is shown by the picker. */
    var visible: Boolean,

    /**
     * The visible field label and accessible name of its wheel.
     *
     * The same label is displayed by the selection button when its value is `null`.
     */
    var label: String,

    /**
     * Formats a wheel item and a selected value.
     *
     * The formatter receives the complete date that selecting the item would produce. It can
     * therefore include related information, such as formatting a day as `3 (Thu)`.
     */
    var contentFormat: DateTimeFormat<LocalDate>,

    /**
     * Relative horizontal space assigned to this field in the DatePicker.
     *
     * The default value is `1f`. Increase it when the field content, such as a localized month
     * name, needs more room than the other fields. The value must be finite and greater than zero.
     */
    var weight: Float = 1f
)

/** Defaults shared by DatePicker APIs. */
object DatePickerDefaults {
    /** Returns a remembered format that follows the current platform locale. */
    @Composable
    fun format(): DatePickerFormat = rememberDatePickerFormat {
        default()
    }

    /** Returns January 1 of the year 100 years before the current year. */
    fun minimumDate(): LocalDate = defaultDatePickerMinimumDate()

    /** Returns December 31 of the year 100 years after the current year. */
    fun maximumDate(): LocalDate = defaultDatePickerMaximumDate()
}

@Immutable
internal data class DatePickerFieldFormat(
    val field: DatePickerField,
    val label: String,
    val contentFormat: DateTimeFormat<LocalDate>,
    val weight: Float
)

internal data class MutableDatePickerFieldFormat(
    val visible: Boolean,
    val label: String,
    val contentFormat: DateTimeFormat<LocalDate>,
    val weight: Float
)

private fun DatePickerField.toPlatformCalendarField(): PlatformCalendarField = when (this) {
    DatePickerField.Day -> PlatformCalendarField.Day
    DatePickerField.Month -> PlatformCalendarField.Month
    DatePickerField.Year -> PlatformCalendarField.Year
}

private fun PlatformCalendarField.toDatePickerField(): DatePickerField = when (this) {
    PlatformCalendarField.Day -> DatePickerField.Day
    PlatformCalendarField.Month -> DatePickerField.Month
    PlatformCalendarField.Year -> DatePickerField.Year
}
