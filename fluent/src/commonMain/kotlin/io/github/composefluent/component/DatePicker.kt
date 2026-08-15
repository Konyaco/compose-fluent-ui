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
import kotlinx.datetime.LocalDate

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
