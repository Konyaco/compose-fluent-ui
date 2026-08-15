package io.github.composefluent.component

import androidx.annotation.IntRange
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.layout.datetime.ListPickerWheelData
import io.github.composefluent.layout.datetime.PickerFlyoutContainer
import io.github.composefluent.layout.datetime.PickerFlyoutFooter
import io.github.composefluent.layout.datetime.PickerItemHeight
import io.github.composefluent.layout.datetime.PickerSelectionIndicator
import io.github.composefluent.layout.datetime.PickerWheel
import io.github.composefluent.layout.datetime.PickerWheelDivider
import io.github.composefluent.layout.datetime.PickerWidth
import kotlinx.datetime.LocalTime

/**
 * Displays a control that lets the user select an hour and minute.
 *
 * When [is12hour] is `true`, the picker also displays an AM/PM selector and uses the 12-hour
 * clock. Otherwise, it uses the 24-hour clock.
 *
 * @param value The currently selected time, or `null` when no time is selected.
 * @param onValueChange Callback invoked with the accepted time. Cancelling or dismissing the
 * flyout does not invoke this callback.
 * @param modifier The [Modifier] to be applied to the TimePicker container, including its
 * selection button.
 * @param is12hour Whether to use the 12-hour clock and display an AM/PM selector. When `false`,
 * the picker uses the 24-hour clock.
 * @param disabled Whether this picker is disabled. A disabled picker does not respond to user
 * input.
 * @param minuteIncrement The increment used to generate the values shown by the minute picker.
 * The value must be in the range `0..59`. Values start at `00` and continue by this increment
 * while they are less than `60`; for example, `8` displays `00`, `08`, `16`, `24`, `32`, `40`,
 * `48`, and `56`. A value of `0` displays only `00`.
 * @throws IllegalArgumentException If [minuteIncrement] is not in the range `0..59`.
 */
@Composable
@ExperimentalFluentApi
fun TimePicker(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false,
    @IntRange(from = 0, to = 59)
    minuteIncrement: Int = 1
) = TimePickerImpl(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    is12hour = is12hour,
    disabled = disabled,
    minuteIncrement = minuteIncrement,
)

@Composable
internal fun TimePickerImpl(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false,
    @IntRange(from = 0, to = 59)
    minuteIncrement: Int = 1
) {
    require(minuteIncrement in 0..59) { "minuteIncrement must be in the range 0..59" }

    var open by remember { mutableStateOf(false) }
    val minuteOptions = remember(minuteIncrement) {
        createMinuteOptions(minuteIncrement)
    }
    val minuteWheelData = remember(minuteOptions) { ListPickerWheelData(minuteOptions) }

    PickerFlyoutContainer(
        modifier = modifier,
        expanded = open,
        onDismissRequest = { open = false },
        flyoutContent = { visibleItemsCount ->
            var candidateHour by remember {
                mutableIntStateOf(
                    value?.let { if (is12hour) hour24to12(it.hour) else it.hour }
                        ?: if (is12hour) 1 else 0
                )
            }
            var candidateMinutes by remember(value, minuteIncrement) {
                mutableIntStateOf(alignMinuteToIncrement(value?.minute ?: 0, minuteIncrement))
            }
            var candidateAmPm by remember {
                mutableStateOf(if ((value?.hour ?: 0) < 12) "AM" else "PM")
            }

            Column(Modifier.width(PickerWidth)) {
                Box {
                    PickerSelectionIndicator(List(if (is12hour) 3 else 2) { 1f })

                    Row(Modifier.height(PickerItemHeight * visibleItemsCount)) {
                        Box(Modifier.weight(1f)) {
                            key(visibleItemsCount, is12hour) {
                                PickerWheel(
                                    data = if (is12hour) Hours12WheelData else Hours24WheelData,
                                    selectedValue = candidateHour.toString(),
                                    onSelectedValueChange = { candidateHour = it.toInt() },
                                    visibleItemsCount = visibleItemsCount,
                                    looping = true,
                                    label = "Hour",
                                    itemText = { it }
                                )
                            }
                        }
                        PickerWheelDivider()
                        Box(Modifier.weight(1f)) {
                            key(visibleItemsCount, minuteIncrement) {
                                PickerWheel(
                                    data = minuteWheelData,
                                    selectedValue = formatMinute(candidateMinutes),
                                    onSelectedValueChange = { candidateMinutes = it.toInt() },
                                    visibleItemsCount = visibleItemsCount,
                                    looping = minuteOptions.size > 1,
                                    label = "Minute",
                                    itemText = { it }
                                )
                            }
                        }
                        if (is12hour) {
                            PickerWheelDivider()
                            Box(Modifier.weight(1f)) {
                                key(visibleItemsCount) {
                                    PickerWheel(
                                        data = AmPmWheelData,
                                        selectedValue = candidateAmPm,
                                        onSelectedValueChange = { candidateAmPm = it },
                                        visibleItemsCount = visibleItemsCount,
                                        looping = false,
                                        label = "AM/PM",
                                        itemText = { it }
                                    )
                                }
                            }
                        }
                    }
                }
                PickerFlyoutFooter(
                    onAccept = {
                        if (is12hour) {
                            onValueChange(
                                LocalTime(
                                    hour12to24(candidateHour, candidateAmPm == "AM"),
                                    candidateMinutes,
                                    0
                                )
                            )
                        } else {
                            onValueChange(LocalTime(candidateHour, candidateMinutes, 0))
                        }
                        open = false
                    },
                    onCancel = { open = false }
                )
            }
        },
        anchor = { anchorModifier ->
            TimePickerButton(
                modifier = anchorModifier,
                value = value,
                is12Hour = is12hour,
                disabled = disabled,
                onClick = { open = true }
            )
        }
    )
}

@Composable
private fun TimePickerButton(
    modifier: Modifier,
    value: LocalTime?,
    is12Hour: Boolean,
    disabled: Boolean,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.width(PickerWidth),
        onClick = onClick,
        disabled = disabled
    ) {
        val labelColor = when {
            disabled -> FluentTheme.colors.text.text.tertiary
            value == null -> FluentTheme.colors.text.text.secondary
            else -> FluentTheme.colors.text.text.primary
        }
        val hour = value?.let {
            if (is12Hour) hour24to12(value.hour)
            else value.hour
        }
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = hour?.toString() ?: "hour",
            color = labelColor
        )
        Box(Modifier.size(1.dp, 30.dp).background(FluentTheme.colors.stroke.control.default))
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = value?.minute?.let { formatMinute(it) } ?: "minute",
            color = labelColor
        )
        if (is12Hour) {
            val isAm = value == null || value.hour < 12

            // TODO[i18n](TimePicker)
            Box(Modifier.size(1.dp, 30.dp).background(FluentTheme.colors.stroke.control.default))
            Text(
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                text = if (isAm) "AM" else "PM",
                color = labelColor
            )
        }
    }
}

private fun hour24to12(value: Int): Int = when {
    value == 0 -> 12
    value <= 12 -> value
    else -> value - 12
}

private fun hour12to24(value: Int, isAm: Boolean): Int {
    val normalizedValue = if (value == 12) 0 else value
    return if (isAm) normalizedValue else normalizedValue + 12
}

private val Hours24 = (0..23).map { it.toString() }
private val Hours12 = (1..12).map { it.toString() }
private val AmPm = listOf("AM", "PM")

private val Hours24WheelData = ListPickerWheelData(Hours24)
private val Hours12WheelData = ListPickerWheelData(Hours12)
private val AmPmWheelData = ListPickerWheelData(AmPm)

private fun createMinuteOptions(minuteIncrement: Int): List<String> =
    if (minuteIncrement == 0) {
        listOf(formatMinute(0))
    } else {
        (0..59 step minuteIncrement).map(::formatMinute)
    }

private fun alignMinuteToIncrement(minute: Int, minuteIncrement: Int): Int =
    if (minuteIncrement == 0) 0 else minute - minute % minuteIncrement

private fun formatMinute(value: Int): String =
    if (value < 10) "0$value"
    else value.toString()
