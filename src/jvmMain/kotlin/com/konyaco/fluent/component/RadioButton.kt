package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors

@Composable
fun RadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    label: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    // TODO: Extract same logic
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    Row(modifier.composed {
        if (label != null) defaultMinSize(minWidth = 120.dp)
        else this
    }.clickable(interactionSource, null) {
        onClick?.invoke()
    }) {
        val fillColor by animateColorAsState(
            if (selected) when {
                !enabled -> Colors.Fill.Accent.Disabled
                pressed -> Colors.Fill.Accent.Tertiary
                hovered -> Colors.Fill.Accent.Secondary
                else -> Colors.Fill.Accent.Default
            } else when {
                !enabled -> Colors.Fill.ControlAlt.Disabled
                pressed -> Colors.Fill.ControlAlt.Quarternary
                hovered -> Colors.Fill.ControlAlt.Tertiary
                else -> Colors.Fill.ControlAlt.Secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = CircleShape,
            color = fillColor,
            outsideBorder = !selected,
            border = BorderStroke(
                1.dp,
                color = if (selected) when {
                    !enabled -> Colors.Fill.Accent.Disabled
                    else -> Colors.Fill.Accent.Default
                } else when {
                    !enabled || pressed -> Colors.Stroke.ControlStrong.Disabled
                    else -> Colors.Stroke.ControlStrong.Default
                }
            )
        ) {
            Box(contentAlignment = Alignment.Center) {
                // Bullet, Only displays when selected, or is pressed

                val size by animateDpAsState(
                    if (selected) when {
                        pressed -> 6.dp
                        hovered -> 10.dp
                        else -> 8.dp
                    } else when {
                        pressed -> 10.dp
                        else -> 0.dp
                    },
                    tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
                )
                Layer(
                    modifier = Modifier.size(if (size == 0.dp) 0.dp else size + 2.dp), // TODO: Remove this 2dp if outside border is provided
                    color = Colors.Text.OnAccent.Primary,
                    border = FluentTheme.colors.borders.circle,
                    shape = CircleShape,
                    outsideBorder = true,
                    content = {}
                )
            }
        }
        label?.let {
            Spacer(Modifier.width(8.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = it,
                style = FluentTheme.typography.body.copy(
                    color = if (enabled) Colors.Text.Text.Primary
                    else Colors.Text.Text.Disabled
                )
            )
        }
    }
}