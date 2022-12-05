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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors
import com.konyaco.fluent.color.Colors.Fill.Control

@Composable
fun Button(
    onClick: () -> Unit,
    isDisabled: Boolean = false,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val fillColor by animateColorAsState(
        when {
            isDisabled -> Control.Disabled
            pressed -> Control.Tertiary
            hovered -> Control.Secondary
            else -> Control.Default
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        when {
            isDisabled -> Colors.Text.Text.Disabled
            pressed -> Colors.Text.Text.Tertiary
            hovered -> Colors.Text.Text.Secondary
            else -> Colors.Text.Text.Primary
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    // 上 35
    // 侧 下 30
    Layer(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Brush.verticalGradient(listOf(Control.Default, Control.Secondary))),
        color = fillColor,
        contentColor = contentColor
    ) {
        ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
            Row(
                Modifier
                    .clickable(
                        onClick = onClick,
                        interactionSource = interaction,
                        indication = null
                    )
                    .defaultMinSize(
                        minWidth = 80.dp,
                        minHeight = 32.dp
                    )
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    isDisabled: Boolean = false,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val fillColor by animateColorAsState(
        when {
            isDisabled -> Control.Disabled
            pressed -> Control.Tertiary
            hovered -> Control.Secondary
            else -> Control.Default
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        when {
            isDisabled -> Colors.Text.Text.Disabled
            pressed -> Colors.Text.Text.Tertiary
            hovered -> Colors.Text.Text.Secondary
            else -> Colors.Text.Text.Primary
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    // 上 35
    // 侧 下 30
    Layer(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Brush.verticalGradient(listOf(Control.Default, Control.Secondary))),
        color = fillColor,
        contentColor = contentColor
    ) {
        ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
            Row(
                Modifier
                    .clickable(
                        onClick = onClick,
                        interactionSource = interaction,
                        indication = null
                    )
                    .defaultMinSize(
                        minWidth = 80.dp,
                        minHeight = 32.dp
                    )
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}