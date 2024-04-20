package com.konyaco.fluent.surface

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

@Composable
fun Card(
    modifier: Modifier,
    shape: Shape = RoundedCornerShape(size = 8.dp),
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier,
        shape = shape,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        content = content
    )
}

@Composable
fun Card(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(size = 4.dp),
    disabled: Boolean = false,
    cardColors: VisualStateScheme<CardColor> = CardDefaults.cardColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val visualState = interactionSource.collectVisualState(disabled)
    val colors = cardColors.schemeFor(visualState)

    val fillColor by animateColorAsState(
        colors.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        colors.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Layer(
        modifier = modifier.clickable(onClick = {
            if (!disabled) onClick()
        }, indication = null, interactionSource = interactionSource),
        shape = shape,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        color = fillColor,
        border = BorderStroke(1.dp, colors.borderBrush),
        contentColor = contentColor,
        content = content
    )
}

data class CardColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderBrush: Brush
)

object CardDefaults {
    @Stable
    @Composable
    fun cardColors(
        default: CardColor = CardColor(
            fillColor = FluentTheme.colors.background.layer.default,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.card.default)
        ),
        hovered: CardColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary,
            borderBrush = FluentTheme.colors.borders.control
        ),
        pressed: CardColor = CardColor(
            fillColor = FluentTheme.colors.control.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        disabled: CardColor = pressed.copy(
            fillColor = FluentTheme.colors.background.layer.default,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.card.default)
        )
    ) = PentaVisualScheme(default, hovered, pressed, disabled)
}