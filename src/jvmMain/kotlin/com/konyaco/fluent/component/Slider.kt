package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors
import kotlin.math.max
import kotlin.math.min

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
    // TODO: Refactor this component
    // TODO: Click track to change value
    val onValueChangeState = rememberUpdatedState(onValueChange)
    BoxWithConstraints(
        modifier = modifier.defaultMinSize(minWidth = 120.dp, minHeight = 32.dp)
    ) {
        val widthPx = constraints.maxWidth.toFloat()
        val maxPx: Float
        val minPx: Float

        with(LocalDensity.current) {
            maxPx = max(widthPx - ThumbSizeWithBorder.toPx() / 2, 0f)
            minPx = min(ThumbSizeWithBorder.toPx() / 2, maxPx)
        }

        fun scaleToUserValue(offset: Float) =
            scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)

        fun scaleToOffset(userValue: Float) =
            scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

        val rawOffset = remember { mutableStateOf(scaleToOffset(value)) }
        val pressOffset = remember { mutableStateOf(0f) }

        val maxWidth by rememberUpdatedState(maxWidth)
        val fraction by rememberUpdatedState(valueToFraction(value, valueRange.start, valueRange.endInclusive))

        var dragging by remember { mutableStateOf(false) }

        Box(Modifier.composed {
            draggable(
                state = rememberDraggableState { deltaPx ->
                    rawOffset.value = (rawOffset.value + deltaPx + pressOffset.value)
                    pressOffset.value = 0f
                    val offsetInTrack = rawOffset.value.coerceIn(minPx, maxPx)
                    onValueChangeState.value.invoke(scaleToUserValue(offsetInTrack))
                },
                interactionSource = interactionSource,
                onDragStarted = {
                    dragging = true
                },
                onDragStopped = {
                    dragging = false
                    onValueChangeFinished?.invoke()
                },
                orientation = Orientation.Horizontal
            )
        }, contentAlignment = Alignment.CenterStart) {
            Rail()
            Track(fraction)
            Thumb(maxWidth, fraction, dragging)
        }
    }
}

// Scale x1 from a1..b1 range to a2..b2 range
private fun scale(a1: Float, b1: Float, x1: Float, a2: Float, b2: Float) =
    fractionToValue(calcFraction(a1, b1, x1), a2, b2)

// Scale x.start, x.endInclusive from a1..b1 range to a2..b2 range
private fun scale(a1: Float, b1: Float, x: ClosedFloatingPointRange<Float>, a2: Float, b2: Float) =
    scale(a1, b1, x.start, a2, b2)..scale(a1, b1, x.endInclusive, a2, b2)

// Calculate the 0..1 fraction that `pos` value represents between `a` and `b`
private fun calcFraction(a: Float, b: Float, pos: Float) =
    (if (b - a == 0f) 0f else (pos - a) / (b - a)).coerceIn(0f, 1f)


@Stable
private fun fractionToValue(fraction: Float, start: Float, end: Float) = (end - start) * fraction + start

/**
 * Get the delta value
 */
@Stable
private fun pxToFraction(
    deltaPx: Float,
    maxWidth: Int
): Float {
    return deltaPx / maxWidth
}

@Stable
private fun valueToFraction(
    value: Float, start: Float, end: Float
): Float = (value - start) / end

@Stable
private fun calcThumbOffset(
    maxWidth: Dp, thumbSize: Dp, fraction: Float
): Dp {
    val width = maxWidth - thumbSize
    return (width * fraction).coerceIn(0.dp, Dp.Infinity)
}

@Composable
private fun Rail() {
    // Rail
    Layer(modifier = Modifier.requiredHeight(4.dp).fillMaxWidth(),
        shape = CircleShape,
        color = Colors.Fill.ControlStrong.Default,
        border = BorderStroke(1.dp, Colors.Stroke.ControlStrong.Default),
        outsideBorder = true,
        content = {})
}

@Composable
private fun Track(
    fraction: Float
) {
    // Track
    Box(
        modifier = Modifier.fillMaxWidth(fraction).requiredHeight(4.dp)
            .background(Colors.Fill.Accent.Default, CircleShape)

    )
}

@Composable
private fun Thumb(
    maxWidth: Dp, fraction: Float, dragging: Boolean,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    // Thumb
    val thumbOffset = calcThumbOffset(maxWidth, ThumbSizeWithBorder, fraction)

    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    Layer(
        modifier = Modifier.padding(start = thumbOffset).size(ThumbSizeWithBorder)
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
private val InnerThumbSize = 12.dp
private val InnerThumbHoverSize = 14.dp
private val InnerThumbPressedSize = 10.dp
private val ThumbBorderBrush = Brush.verticalGradient(
    0f to Colors.Stroke.Control.Secondary, 0.5f to Colors.Stroke.Control.Default
)
