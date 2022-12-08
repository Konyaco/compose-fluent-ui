package com.konyaco.fluent.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors

private val borderBrush = Colors.Stroke.Control.Default
private val borderBrushFocus = Colors.Stroke.Control.Default

@Composable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()
    val focused by interactionSource.collectIsFocusedAsState()
    BasicTextField(
        modifier = modifier.defaultMinSize(160.dp, 32.dp)
            .composed {
                if (enabled) {
                    val height by rememberUpdatedState(with(LocalDensity.current) {
                        (if (focused) 2.dp else 1.dp).toPx()
                    })
                    clip(RoundedCornerShape(4.dp)).drawWithContent {
                        drawContent()
                        drawRect(
                            color = if (focused) Colors.Fill.Accent.Default else Colors.Stroke.ControlStrong.Default,
                            topLeft = Offset(0f, size.height - height),
                            size = Size(size.width, height)
                        )
                    }
                } else this
            },
        value = value,
        onValueChange = onValueChange,
        textStyle = LocalTextStyle.current.copy(
            color = if (enabled) Colors.Text.Text.Secondary
            else Colors.Text.Text.Disabled
        ),
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        visualTransformation = visualTransformation,
        maxLines = maxLines,
        keyboardActions = keyboardActions,
        cursorBrush = SolidColor(Colors.Text.Text.Secondary),
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        decorationBox = { innerTextField ->
            Layer(
                modifier = Modifier.hoverable(interactionSource),
                shape = RoundedCornerShape(4.dp),
                border = BorderStroke(1.dp, if (focused) borderBrushFocus else borderBrush),
                color = when {
                    !enabled -> Colors.Fill.Control.Disabled
                    pressed || focused -> Colors.Fill.Control.InputActive
                    hovered -> Colors.Fill.Control.Secondary
                    else -> Colors.Fill.Control.Default
                },
            ) {
                Box(Modifier.padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 3.dp)) {
                    innerTextField()
                }
            }
        }
    )
}