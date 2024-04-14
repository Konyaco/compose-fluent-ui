package com.konyaco.fluent.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.FocusableValueVisualStateScheme
import com.konyaco.fluent.scheme.collectCurrentScheme

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
    placeholder: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColorScheme = TextFieldDefaults.defaultTextFieldColors()
) {
    val color = colors.collectCurrentScheme(interactionSource, !enabled)
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
            textStyle = LocalTextStyle.current.copy(color = color.contentColor),
            enabled = enabled,
            readOnly = readOnly,
            singleLine = singleLine,
            visualTransformation = visualTransformation,
            maxLines = maxLines,
            keyboardActions = keyboardActions,
            cursorBrush = color.cursorBrush,
            keyboardOptions = keyboardOptions,
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                TextFieldDefaults.DecorationBox(
                    color = color,
                    interactionSource = interactionSource,
                    innerTextField = innerTextField,
                    value = value.text,
                    enabled = enabled,
                    placeholder = placeholder
                )
            }
        )
    }
}

object TextFieldDefaults {

    @Stable
    @Composable
    fun defaultTextFieldColors(
        default: TextFieldColor = TextFieldColor(
            fillColor = FluentTheme.colors.control.default,
            contentColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            bottomLineFillColor = FluentTheme.colors.stroke.controlStrong.default,
            borderBrush = FluentTheme.colors.borders.textControl,
            cursorBrush = SolidColor(FluentTheme.colors.text.text.primary)
        ),
        focused: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.inputActive,
            bottomLineFillColor = FluentTheme.colors.fillAccent.default,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        hovered: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary
        ),
        pressed: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.inputActive,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        disabled: TextFieldColor = default.copy(
            contentColor = FluentTheme.colors.text.text.disabled,
            placeholderColor = FluentTheme.colors.text.text.disabled,
            bottomLineFillColor = Color.Transparent,
        )
    ) = TextFieldColorScheme(
        default = default,
        focused = focused,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun DecorationBox(
        value: String,
        interactionSource: MutableInteractionSource,
        enabled: Boolean,
        color: TextFieldColor,
        modifier: Modifier = Modifier.drawBottomLine(enabled, color, interactionSource),
        placeholder: (@Composable () -> Unit)?,
        innerTextField: @Composable () -> Unit,
    ) {
        Layer(
            modifier = modifier.hoverable(interactionSource),
            shape = RoundedCornerShape(4.dp),
            color = color.fillColor,
            border = BorderStroke(1.dp, color.borderBrush),
            backgroundSizing = BackgroundSizing.OuterBorderEdge
        ) {
            Box(
                Modifier.offset(y = (-1).dp).padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 3.dp),
                Alignment.CenterStart
            ) {
                innerTextField()
                if (value.isEmpty() && placeholder != null) {
                    CompositionLocalProvider(
                        LocalContentColor provides color.placeholderColor,
                        LocalTextStyle provides LocalTextStyle.current.copy(color = color.placeholderColor)
                    ) {
                        placeholder()
                    }
                }
            }
        }
    }
}

typealias TextFieldColorScheme = FocusableValueVisualStateScheme<TextFieldColor>

@Immutable
data class TextFieldColor(
    val fillColor: Color,
    val contentColor: Color,
    val placeholderColor: Color,
    val bottomLineFillColor: Color,
    val borderBrush: Brush,
    val cursorBrush: Brush
)

@Composable
private fun Modifier.drawBottomLine(enabled: Boolean, color: TextFieldColor, interactionSource: MutableInteractionSource): Modifier {
    val isFocused by interactionSource.collectIsFocusedAsState()
    return if (enabled) {
        val height by rememberUpdatedState(with(LocalDensity.current) {
            (if (isFocused) 2.dp else 1.dp).toPx()
        })
        val fillColor by rememberUpdatedState(color.bottomLineFillColor)
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