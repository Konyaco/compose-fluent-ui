package io.github.composefluent.component

import androidx.compose.runtime.Composable

@Composable
actual fun TimePicker(
    value: kotlinx.datetime.LocalTime?,
    onValueChange: (kotlinx.datetime.LocalTime?) -> Unit,
    modifier: androidx.compose.ui.Modifier,
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