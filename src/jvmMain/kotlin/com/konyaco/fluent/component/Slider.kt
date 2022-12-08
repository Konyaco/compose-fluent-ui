package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors

@Composable
fun Slider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true, // TODO
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0, // TODO
    onValueChangeFinished: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val progress = valueToFraction(value, valueRange.start, valueRange.endInclusive)
    Slider(progress, onProgressChange = {
        onValueChange(fractionToValue(it, valueRange.start, valueRange.endInclusive))
    }, modifier, enabled, onValueChangeFinished, interactionSource)
}

@Composable
private fun Slider(
    progress: Float,
    onProgressChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true, // TODO
    onValueChangeFinished: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    // TODO: Refactor this component
    // TODO: Click track to change value
    val onValueChangeState by rememberUpdatedState(onProgressChange)
    BoxWithConstraints(
        modifier = modifier.defaultMinSize(minWidth = 120.dp, minHeight = 32.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        val maxWidth by rememberUpdatedState(maxWidth)
        var dragging by remember { mutableStateOf(false) }

        val density by rememberUpdatedState(LocalDensity.current)
        fun calcProgress(offset: Offset): Float {
            val radius = with(density) { (ThumbSizeWithBorder / 2).toPx() }
            return valueToFraction(offset.x, radius, constraints.maxWidth - radius).coerceIn(0f, 1f)
        }

        Box(Modifier.composed {
            var offset by remember { mutableStateOf(Offset.Zero) }
            draggable(
                state = rememberDraggableState {
                    offset = Offset(x = offset.x + it, y = offset.y)
                    onProgressChange(calcProgress(offset))
                },
                interactionSource = interactionSource,
                onDragStarted = {
                    dragging = true
                    offset = it
                }, onDragStopped = {
                    dragging = false
                    onValueChangeFinished?.invoke()
                }, orientation = Orientation.Horizontal
            )
        }.pointerInput(Unit) {
            forEachGesture {
                awaitPointerEventScope {
                    val down = awaitFirstDown()
                    onValueChangeState(calcProgress(down.position))
                }
            }
        }, contentAlignment = Alignment.CenterStart) {
            Rail()
            Track(progress, maxWidth)
            Thumb(maxWidth, progress, dragging)
        }
    }
}

@Stable
private fun fractionToValue(fraction: Float, start: Float, end: Float): Float = (end - start) * fraction + start

@Stable
private fun valueToFraction(
    value: Float, start: Float, end: Float
): Float = (value - start) / (end - start)

@Stable
private fun calcThumbOffset(
    maxWidth: Dp, thumbSize: Dp, fraction: Float
): Dp {
    return (maxWidth - thumbSize) * fraction
}

@Composable
private fun Rail() {
    // Rail
    Layer(modifier = Modifier.requiredHeight(4.dp).fillMaxWidth(),
        shape = CircleShape,
        color = Colors.Fill.ControlStrong.Default,
        border = BorderStroke(1.dp, Colors.Stroke.ControlStrong.Default),
        outsideBorder = true,
        content = {}
    )
}

@Composable
private fun Track(
    fraction: Float,
    maxWidth: Dp
) {
    // Track
    val width = ThumbRadiusWithBorder + (fraction * (maxWidth - ThumbSizeWithBorder))
    Box(
        Modifier.width(width)
            .requiredHeight(4.dp)
            .background(Colors.Fill.Accent.Default, CircleShape)
    )
}

@Composable
private fun Thumb(
    maxWidth: Dp, fraction: Float, dragging: Boolean,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    // Thumb
    val thumbOffset by rememberUpdatedState(calcThumbOffset(maxWidth, ThumbSizeWithBorder, fraction))

    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    Layer(
        modifier = Modifier.offset { IntOffset(x = thumbOffset.roundToPx(), y = 0) }
            .size(ThumbSizeWithBorder)
            .clickable(interactionSource, null, onClick = {}),
        shape = CircleShape,
        border = BorderStroke(1.dp, ThumbBorderBrush),
        color = Colors.Fill.ControlSolid.Default,
        outsideBorder = false
    ) {
        Box(contentAlignment = Alignment.Center) {
            Box(
                Modifier.size(
                    animateDpAsState(
                        when {
                            pressed || dragging -> InnerThumbPressedSize
                            hovered -> InnerThumbHoverSize
                            else -> InnerThumbSize
                        },
                        tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
                    ).value
                ).background(Colors.Fill.Accent.Default, CircleShape)
            )
        }
    }
}


private val ThumbSize = 20.dp
private val ThumbSizeWithBorder = ThumbSize + 2.dp
private val ThumbRadiusWithBorder = ThumbSizeWithBorder / 2
private val InnerThumbSize = 12.dp
private val InnerThumbHoverSize = 14.dp
private val InnerThumbPressedSize = 10.dp
private val ThumbBorderBrush = Brush.verticalGradient(
    0f to Colors.Stroke.Control.Secondary, 0.5f to Colors.Stroke.Control.Default
)
