package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.color.Colors

@Composable
fun Switcher(
    checked: Boolean,
    text: String,
    onCheckStateChange: (checked: Boolean) -> Unit,
    textBefore: Boolean = false,
    disabled: Boolean = false
) {
    // TODO: Draggable
    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()
    val transition = updateTransition(checked)
    Row(
        modifier = Modifier.clickable(indication = null, interactionSource = interactionSource, role = Role.Button) {
            onCheckStateChange(!checked)
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (textBefore) {
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = text,
                style = FluentTheme.typography.body,
                color = Colors.Text.Text.Primary
            )
            Spacer(Modifier.width(12.dp))
        }

        val fillColor by animateColorAsState(
            if (checked) when {
                disabled -> Colors.Fill.Accent.Disabled
                pressed -> Colors.Fill.Accent.Tertiary
                hovered -> Colors.Fill.Accent.Secondary
                else -> Colors.Fill.Accent.Default
            } else when {
                disabled -> Colors.Fill.ControlAlt.Disabled
                pressed -> Colors.Fill.ControlAlt.Quarternary
                hovered -> Colors.Fill.ControlAlt.Tertiary
                else -> Colors.Fill.ControlAlt.Secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )

        Box(
            modifier = Modifier.size(40.dp, 20.dp)
                .border(1.dp, if (checked) Color.Transparent else Colors.Stroke.ControlStrong.Default, CircleShape)
                .clip(CircleShape)
                .background(fillColor)
                .padding(horizontal = 4.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            val height by animateDpAsState(
                when {
                    pressed || hovered -> 14.dp
                    else -> 12.dp
                },
                tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
            )

            val width by animateDpAsState(
                when {
                    pressed -> 17.dp
                    hovered -> 14.dp
                    else -> 12.dp
                },
                tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
            )

            val density = LocalDensity.current
            val offset by transition.animateDp(
                transitionSpec = {
                    tween(FluentDuration.QuickDuration, easing = FluentEasing.PointToPointEasing)
                },
                targetValueByState = {
                    if (checked) 26.dp - (width / 2) else 0.dp
                }
            )

            val offsetX = with(density) { offset.toPx() }

            // Control
            Box(
                Modifier.size(width, height)
                    .graphicsLayer {
                        translationX = offsetX
                        transformOrigin = TransformOrigin.Center
                    }
                    .clip(CircleShape)
                    .background(
                        if (checked) Colors.Text.OnAccent.Primary
                        else Colors.Text.Text.Secondary
                    )
            )
        }

        if (!textBefore) {
            Spacer(Modifier.width(12.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = text,
                style = FluentTheme.typography.body,
                color = Colors.Text.Text.Primary
            )
        }
    }
}