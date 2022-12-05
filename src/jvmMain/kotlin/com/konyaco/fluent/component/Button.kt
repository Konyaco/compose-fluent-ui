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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors
import com.konyaco.fluent.color.Colors.Fill.Control

@Composable
fun Button(
    onClick: () -> Unit,
    disabled: Boolean = false,
    modifier: Modifier = Modifier,
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, DarkButtonColors, false, onClick, content)
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    disabled: Boolean = false,
    modifier: Modifier = Modifier,
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, DarkAccentButtonColors, true, onClick, content)
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
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing) // TODO: Tween
    )

    val contentColor by animateColorAsState(
        buttonColor.contentColor,
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Layer(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, buttonColor.borderBrush),
        color = fillColor,
        contentColor = contentColor,
        borderInside = accentButton
    ) {
        Row(
            Modifier
                .clickable(
                    onClick = onClick,
                    interactionSource = interaction,
                    indication = null
                )
                .composed {
                    if (accentButton) {
                        Modifier.defaultMinSize(
                            minWidth = 80.dp,
                            minHeight = 32.dp
                        )
                    } else {
                        Modifier.defaultMinSize(
                            minWidth = 78.dp,
                            minHeight = 30.dp
                        )
                    }
                }
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

private val DefaultStroke = Brush.verticalGradient(listOf(Colors.Stroke.Control.Secondary, Colors.Stroke.Control.Default), 0f, 0.0957f)

private val DarkButtonColors = ButtonColors(
    default = ButtonColor(
        Control.Default,
        Colors.Text.Text.Primary,
        DefaultStroke
    ),
    hovered = ButtonColor(
        Control.Secondary,
        Colors.Text.Text.Primary,
        DefaultStroke
    ),
    pressed = ButtonColor(
        Control.Tertiary,
        Colors.Text.Text.Secondary,
        DefaultStroke
    ),
    disabled = ButtonColor(
        Control.Disabled,
        Colors.Text.Text.Disabled,
        DefaultStroke
    )
)

private val AccentStroke = Brush.verticalGradient(listOf(Colors.Stroke.Control.OnAccentSecondary, Colors.Stroke.Control.OnAccentDefault), 0.9067f, 1f)
private val DarkAccentButtonColors = ButtonColors(
    default = ButtonColor(
        Colors.Fill.Accent.Default,
        Colors.Text.OnAccent.Primary,
        AccentStroke
    ),
    hovered = ButtonColor(
        Colors.Fill.Accent.Secondary,
        Colors.Text.OnAccent.Primary,
        AccentStroke
    ),
    pressed = ButtonColor(
        Colors.Fill.Accent.Tertiary,
        Colors.Text.OnAccent.Secondary,
        AccentStroke
    ),
    disabled = ButtonColor(
        Colors.Fill.Accent.Disabled,
        Colors.Text.OnAccent.Disabled,
        AccentStroke
    )
)

data class ButtonColors(
    val default: ButtonColor,
    val hovered: ButtonColor,
    val pressed: ButtonColor,
    val disabled: ButtonColor
)

data class ButtonColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderBrush: Brush
)
