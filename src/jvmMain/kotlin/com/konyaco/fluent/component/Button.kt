package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer

@Immutable
data class ButtonColors(
    val default: ButtonColor,
    val hovered: ButtonColor,
    val pressed: ButtonColor,
    val disabled: ButtonColor
)

@Immutable
data class ButtonColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderBrush: Brush
)


@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, buttonColors, false, onClick, content)
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = accentButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, buttonColors, true, onClick, content)
}

@Composable
private fun Button(
    modifier: Modifier,
    interaction: MutableInteractionSource,
    disabled: Boolean,
    buttonColors: ButtonColors,
    accentButton: Boolean,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val buttonColor = when {
        disabled -> buttonColors.disabled
        pressed -> buttonColors.pressed
        hovered -> buttonColors.hovered
        else -> buttonColors.default
    }

    val fillColor by animateColorAsState(
        buttonColor.fillColor,
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        buttonColor.contentColor,
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Layer(
        modifier = modifier.defaultMinSize(
            minWidth = 120.dp,
            minHeight = 32.dp
        ),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, buttonColor.borderBrush),
        color = fillColor,
        contentColor = contentColor,
        outsideBorder = !accentButton,
        cornerRadius = 4.dp
    ) {
        Row(
            Modifier
                .clickable(
                    onClick = onClick,
                    interactionSource = interaction,
                    indication = null
                )
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

@Composable
private fun buttonColors(): ButtonColors {
    val colors = FluentTheme.colors

    return ButtonColors(
        default = ButtonColor(
            colors.control.default,
            colors.text.text.primary,
            colors.borders.control
        ),
        hovered = ButtonColor(
            colors.control.secondary,
            colors.text.text.primary,
            colors.borders.control
        ),
        pressed = ButtonColor(
            colors.control.tertiary,
            colors.text.text.secondary,
            SolidColor(colors.stroke.control.default)
        ),
        disabled = ButtonColor(
            colors.control.disabled,
            colors.text.text.disabled,
            SolidColor(colors.stroke.control.default)
        )
    )
}

@Composable
private fun accentButtonColors(): ButtonColors {
    val colors = FluentTheme.colors

    return ButtonColors(
        default = ButtonColor(
            colors.fillAccent.default,
            colors.text.onAccent.primary,
            colors.borders.accentControl
        ),
        hovered = ButtonColor(
            colors.fillAccent.secondary,
            colors.text.onAccent.primary,
            colors.borders.accentControl
        ),
        pressed = ButtonColor(
            colors.fillAccent.tertiary,
            colors.text.onAccent.secondary,
            SolidColor(colors.stroke.control.onAccentDefault)
        ),
        disabled = ButtonColor(
            colors.fillAccent.disabled,
            colors.text.onAccent.disabled,
            SolidColor(Color.Transparent) // Disabled accent button does not have border
        )
    )
}