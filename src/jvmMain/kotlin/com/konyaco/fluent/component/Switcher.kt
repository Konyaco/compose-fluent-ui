package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.color.Colors

data class SwitcherBackground(
    val default: Color,
    val hovered: Color,
    val pressed: Color,
    val disabled: Color,
    val strokeDefault: Color,
    val strokeHovered: Color,
    val strokePressed: Color,
    val strokeDisabled: Color
)

@Composable
fun Switcher(
    checked: Boolean,
    text: String,
    onCheckStateChange: (checked: Boolean) -> Unit,
    textBefore: Boolean = false,
    disabled: Boolean = false
) {
    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (textBefore) {
            Text(
                text = text,
                style = FluentTheme.typography.body,
                color = Colors.Text.Text.Primary
            )
            Spacer(Modifier.width(16.dp))
        }

        Box(
            modifier = Modifier.size(40.dp, 20.dp)
                .border(1.dp, if (checked) Color.Transparent else Colors.Stroke.ControlStrong.Default, CircleShape)
                .clickable(indication = null, interactionSource = interactionSource) {
                    onCheckStateChange(!checked)
                }
                .clip(CircleShape)
                .background(
                    if (checked) when {
                        disabled -> Colors.Fill.Accent.Disabled
                        pressed -> Colors.Fill.Accent.Tertiary
                        hovered -> Colors.Fill.Accent.Secondary
                        else -> Colors.Fill.Accent.Default
                    } else when {
                        disabled -> Colors.Fill.ControlAlt.Disabled
                        pressed || hovered -> Colors.Fill.ControlAlt.Tertiary
                        else -> Colors.Fill.ControlAlt.Secondary
                    }
                )
                .padding(horizontal = 4.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            val height by animateDpAsState(
                when {
                    pressed || hovered -> 14.dp
                    else -> 12.dp
                }
            )

            val width by animateDpAsState(
                when {
                    pressed -> 17.dp
                    hovered -> 14.dp
                    else -> 12.dp
                }
            )

            val density = LocalDensity.current
            val offset = animateDpAsState(if (checked) 26.dp - (width / 2) else 0.dp)

            val offsetX by rememberUpdatedState(with(density) {
                offset.value.toPx()
            })

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
            Spacer(Modifier.width(16.dp))
            Text(
                text = text,
                style = FluentTheme.typography.body,
                color = Colors.Text.Text.Primary
            )
        }
    }
}