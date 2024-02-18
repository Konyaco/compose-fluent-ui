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
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer

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

    Row(modifier.then(
        if (label != null) Modifier.defaultMinSize(minWidth = 120.dp)
        else Modifier
    ).clickable(interactionSource, null) {
        onClick?.invoke()
    }) {
        val fillColor by animateColorAsState(
            if (selected) when {
                !enabled -> FluentTheme.colors.fillAccent.disabled
                pressed -> FluentTheme.colors.fillAccent.tertiary
                hovered -> FluentTheme.colors.fillAccent.secondary
                else -> FluentTheme.colors.fillAccent.default
            } else when {
                !enabled -> FluentTheme.colors.controlAlt.disabled
                pressed -> FluentTheme.colors.controlAlt.quaternary
                hovered -> FluentTheme.colors.controlAlt.tertiary
                else -> FluentTheme.colors.controlAlt.secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = CircleShape,
            color = fillColor,
            outsideBorder = true,
            border = BorderStroke(
                1.dp,
                color = if (selected) when {
                    !enabled -> FluentTheme.colors.fillAccent.disabled
                    else -> FluentTheme.colors.fillAccent.default
                } else when {
                    !enabled || pressed -> FluentTheme.colors.stroke.controlStrong.disabled
                    else -> FluentTheme.colors.stroke.controlStrong.default
                }
            ),
            circular = true
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
                // Inner
                Layer(
                    modifier = Modifier.size(if (size == 0.dp || !selected) size else size + 2.dp), // TODO: Remove this 2dp if outside border is provided
                    color = FluentTheme.colors.text.onAccent.primary,
                    border = if (selected) BorderStroke(
                        1.dp,
                        FluentTheme.colors.borders.circle
                    ) else null,
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
                    color = if (enabled) FluentTheme.colors.text.text.primary
                    else FluentTheme.colors.text.text.disabled
                )
            )
        }
    }
}