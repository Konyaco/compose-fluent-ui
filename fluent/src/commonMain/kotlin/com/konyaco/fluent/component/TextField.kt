package com.konyaco.fluent.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer

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
    header: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()
    val focused by interactionSource.collectIsFocusedAsState()

    Column(modifier) {
        if (header != null) {
            header()
            Spacer(Modifier.height(8.dp))
        }
        BasicTextField(
            modifier = modifier.defaultMinSize(160.dp, 32.dp)
                .clip(RoundedCornerShape(4.dp)),
            value = value,
            onValueChange = onValueChange,
            textStyle = LocalTextStyle.current.copy(
                color = if (enabled) FluentTheme.colors.text.text.primary
                else FluentTheme.colors.text.text.disabled
            ),
            enabled = enabled,
            readOnly = readOnly,
            singleLine = singleLine,
            visualTransformation = visualTransformation,
            maxLines = maxLines,
            keyboardActions = keyboardActions,
            cursorBrush = SolidColor(FluentTheme.colors.text.text.primary),
            keyboardOptions = keyboardOptions,
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                Layer(
                    modifier = Modifier.hoverable(interactionSource)
                        .drawBottomLine(enabled) { focused },
                    shape = RoundedCornerShape(4.dp),
                    color = when {
                        !enabled -> FluentTheme.colors.control.disabled
                        pressed || focused -> FluentTheme.colors.control.inputActive
                        hovered -> FluentTheme.colors.control.secondary
                        else -> FluentTheme.colors.control.default
                    },
                    border = BorderStroke(
                        1.dp,
                        if (focused || pressed) SolidColor(FluentTheme.colors.stroke.control.default)
                        else FluentTheme.colors.borders.textControl
                    ),
                    backgroundSizing = BackgroundSizing.OuterBorderEdge
                ) {
                    Box(
                        Modifier.offset(y = (-1).dp).padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 3.dp),
                        Alignment.CenterStart
                    ) {
                        innerTextField()
                    }
                }
            }
        )
    }
}

@Composable
private fun Modifier.drawBottomLine(enabled: Boolean, focused: () -> Boolean): Modifier {
    return if (enabled) {
        val height by rememberUpdatedState(with(LocalDensity.current) {
            (if (focused()) 2.dp else 1.dp).toPx()
        })
        val fillColor by rememberUpdatedState(
            if (focused()) FluentTheme.colors.fillAccent.default
            else FluentTheme.colors.stroke.controlStrong.default
        )
        drawWithContent {
            drawContent()
            drawRect(
                color = fillColor,
                topLeft = Offset(0f, size.height - height),
                size = Size(size.width, height)
            )
        }
    } else this
}