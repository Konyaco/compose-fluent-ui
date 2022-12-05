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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme

@Composable
fun Switcher(
    checked: Boolean,
    onCheckStateChange: (checked: Boolean) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    // TODO: 2021/6/30 Swipeable, Hoverable

    Box(
        modifier = Modifier.size(40.dp, 20.dp)
            .border(Dp.Hairline, FluentTheme.colors.onBackground.copy(0.75f), CircleShape)
            .hoverable(interactionSource)
            .clickable(indication = null, interactionSource = interactionSource) {
                onCheckStateChange(!checked)
            }
            .padding(horizontal = 3.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        val scaleX by animateFloatAsState(
            when {
                pressed -> 1.8f
                hovered -> 1.2f
                else -> 1f
            }
        )

        val scaleY by animateFloatAsState(
            when {
                pressed -> 1.4f
                hovered -> 1.2f
                else -> 1f
            }
        )

        val density = LocalDensity.current
        val offset = animateDpAsState(if (checked) 22.dp else 0.dp)
        val offsetX by rememberUpdatedState(with(density) { offset.value.toPx() })

        Box(
            Modifier.size(10.dp)
                .graphicsLayer {
                    this.scaleX = scaleX
                    this.scaleY = scaleY
                    translationX = offsetX
                    transformOrigin = TransformOrigin.Center
                }
                .clip(CircleShape)
                .background(FluentTheme.colors.onBackground)

        )
        /*
        width = animateDpAsState(
                    if (checked) {
                        if (pressed) 18.dp else 14.dp
                    } else {
                        if (pressed) {
                            18.dp
                        } else if (hovered) {
                            14.dp
                        } else {
                            10.dp
                        }
                    }
                ).value,
                height = animateDpAsState(
                    if (checked) {
                        if (pressed) 18.dp else 14.dp
                    } else {
                        if (hovered) {
                            14.dp
                        } else {
                            10.dp
                        }
                    }
                ).value
        */
    }
}