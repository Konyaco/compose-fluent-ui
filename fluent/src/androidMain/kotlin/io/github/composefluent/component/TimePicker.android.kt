package io.github.composefluent.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.datetime.LocalTime

@Composable
actual fun TimePicker(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier,
    is12hour: Boolean,
    disabled: Boolean
) {
    TimePickerImpl(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        is12hour = is12hour,
        disabled = disabled,
        userScrollEnabled = true
    )
}