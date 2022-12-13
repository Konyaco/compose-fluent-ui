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
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing

@Composable
fun Switcher(
    checked: Boolean,
    onCheckStateChange: (checked: Boolean) -> Unit,
    text: String? = null,
    textBefore: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    // TODO: Draggable
    // TODO: Extract same logic
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
            text?.let {
                Text(
                    modifier = Modifier.offset(y = (-1).dp),
                    text = it,
                    color = if (enabled) FluentTheme.colors.text.text.primary
                    else FluentTheme.colors.text.text.disabled
                )
                Spacer(Modifier.width(12.dp))
            }
        }

        val colors = FluentTheme.colors
        val fillColor by animateColorAsState(
            if (checked) when {
                !enabled -> colors.fillAccent.disabled
                pressed -> colors.fillAccent.tertiary
                hovered -> colors.fillAccent.secondary
                else -> colors.fillAccent.default
            } else when {
                !enabled -> colors.controlAlt.disabled
                pressed -> colors.controlAlt.quaternary
                hovered -> colors.controlAlt.tertiary
                else -> colors.controlAlt.secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )

        Box(
            modifier = Modifier.size(40.dp, 20.dp)
                .border(
                    1.dp, if (checked) when {
                        !enabled -> FluentTheme.colors.fillAccent.disabled
                        else -> Color.Transparent
                    } else when {
                        !enabled -> FluentTheme.colors.controlStrong.disabled
                        else -> FluentTheme.colors.controlStrong.default
                    }, CircleShape
                )
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

            val offsetX by derivedStateOf { with(density) { offset.toPx() } }

            // Control
            Box(
                Modifier.size(width, height)
                    .graphicsLayer {
                        translationX = offsetX
                        transformOrigin = TransformOrigin.Center
                    }
                    .clip(CircleShape)
                    .background(
                        if (checked) when {
                            !enabled -> FluentTheme.colors.text.onAccent.disabled
                            else -> FluentTheme.colors.text.onAccent.primary
                        }
                        else when {
                            !enabled -> FluentTheme.colors.text.text.disabled
                            else -> FluentTheme.colors.text.text.secondary
                        }
                    )
            )
        }

        if (!textBefore) {
            text?.let {
                Spacer(Modifier.width(12.dp))
                Text(
                    modifier = Modifier.offset(y = (-1).dp),
                    text = it,
                    style = FluentTheme.typography.body,
                    color = if (enabled) FluentTheme.colors.text.text.primary
                    else FluentTheme.colors.text.text.disabled
                )
            }
        }
    }
}

data class SwitcherColors(
    val default: SwitcherColor,
    val hovered: SwitcherColor,
    val pressed: SwitcherColor,
    val disabled: SwitcherColor
)

data class SwitcherColor(
    val fillColor: Color,
    val textColor: Color,
    val borderBrush: Brush
)