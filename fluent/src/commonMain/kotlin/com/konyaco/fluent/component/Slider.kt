package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer

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
    rail: @Composable () -> Unit = { SliderDefaults.Rail() },
    track: @Composable (progress: Float, width: Dp) -> Unit = { fraction, width -> SliderDefaults.Track(fraction, width) },
    thumb: @Composable (progress: Float, width: Dp, dragging: Boolean) -> Unit = { fraction, width, dragging -> SliderDefaults.Thumb(fraction, width, dragging) },
) {
    val progress = valueToFraction(value, valueRange.start, valueRange.endInclusive)
    Slider(
        modifier = modifier,
        progress = progress,
        onProgressChange = {
            onValueChange(fractionToValue(it, valueRange.start, valueRange.endInclusive))
        },
        enabled = enabled,
        onValueChangeFinished = onValueChangeFinished,
        interactionSource = interactionSource,
        rail = rail,
        track = track,
        thumb = thumb
    )
}

@Composable
private fun Slider(
    progress: Float,
    onProgressChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true, // TODO
    onValueChangeFinished: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    rail: @Composable () -> Unit = { SliderDefaults.Rail() },
    track: @Composable (progress: Float, width: Dp) -> Unit = { fraction, width -> SliderDefaults.Track(fraction, width) },
    thumb: @Composable (progress: Float, width: Dp, dragging: Boolean) -> Unit = { fraction, width, dragging -> SliderDefaults.Thumb(fraction, width, dragging) },
) {
    // TODO: Refactor this component
    val currentOnProgressChange by rememberUpdatedState(onProgressChange)
    BoxWithConstraints(
        modifier = modifier.defaultMinSize(minWidth = 120.dp, minHeight = 32.dp),
        contentAlignment = Alignment.CenterStart,
        propagateMinConstraints = true
    ) {
        val width by rememberUpdatedState(minWidth)
        var dragging by remember { mutableStateOf(false) }

        val density by rememberUpdatedState(LocalDensity.current)
        fun calcProgress(offset: Offset): Float {
            val radius = with(density) { (ThumbSizeWithBorder / 2).toPx() }
            return valueToFraction(offset.x, radius, constraints.minWidth - radius).coerceIn(0f, 1f)
        }

        var offset by remember { mutableStateOf(Offset.Zero) }
        Box(
            modifier = Modifier
                .draggable(
                    state = rememberDraggableState {
                        offset = Offset(x = offset.x + it, y = offset.y)
                        currentOnProgressChange(calcProgress(offset))
                    },
                    interactionSource = interactionSource,
                    onDragStarted = {
                        dragging = true
                        offset = it
                    },
                    onDragStopped = {
                        dragging = false
                        onValueChangeFinished?.invoke()
                    },
                    orientation = Orientation.Horizontal
                )
                .pointerInput(Unit) {
                awaitEachGesture {
                    val down = awaitFirstDown()
                    dragging = true
                    currentOnProgressChange(calcProgress(down.position))
                    waitForUpOrCancellation()
                    dragging = false
                }
            }, contentAlignment = Alignment.CenterStart
        ) {
            rail()
            track(progress, width)
            thumb(progress, width, dragging)
        }
    }
}

@Stable
private fun fractionToValue(fraction: Float, start: Float, end: Float): Float =
    (end - start) * fraction + start

@Stable
private fun valueToFraction(
    value: Float, start: Float, end: Float
): Float = (value - start) / (end - start)

@Stable
private fun calcThumbOffset(
    maxWidth: Dp, thumbSize: Dp, padding: Dp, fraction: Float
): Dp {
    return (maxWidth - thumbSize) * fraction - padding
}

object SliderDefaults {

    @Composable
    fun Track(
        fraction: Float,
        maxWidth: Dp,
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.fillAccent.default,
        shape: Shape = CircleShape
    ) {
        // Track
        val width = ThumbRadiusWithBorder + (fraction * (maxWidth - ThumbSizeWithBorder))
        Box(
            modifier.width(width)
                .requiredHeight(4.dp)
                .background(color, shape)
        )
    }

    @Composable
    fun Rail(
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.controlStrong.default,
        border: BorderStroke? = BorderStroke(
            1.dp, if (FluentTheme.colors.darkMode) FluentTheme.colors.stroke.controlStrong.default
            else FluentTheme.colors.controlStrong.default
        ),
        shape: Shape = CircleShape
    ) {
        // Rail
        Layer(
            modifier = modifier.fillMaxWidth().requiredHeight(4.dp),
            shape = shape,
            color = color,
            border = border,
            backgroundSizing = BackgroundSizing.InnerBorderEdge,
            content = {}
        )
    }

    @Composable
    fun Thumb(
        fraction: Float,
        maxWidth: Dp,
        dragging: Boolean = false,
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        shape: Shape = CircleShape,
        border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.borders.circle),
        ringColor: Color = FluentTheme.colors.controlSolid.default,
        color: Color = FluentTheme.colors.fillAccent.default
    ) {
        // Thumb
        val thumbOffset by rememberUpdatedState(calcThumbOffset(maxWidth, ThumbSize, 1.dp, fraction))

        val hovered by interactionSource.collectIsHoveredAsState()
        val pressed by interactionSource.collectIsPressedAsState()

        Layer(
            modifier = modifier.offset { IntOffset(x = thumbOffset.roundToPx(), y = 0) }
                .size(ThumbSizeWithBorder)
                .clickable(interactionSource, null, onClick = {}),
            shape = shape,
            color = ringColor,
            border = border,
            backgroundSizing = BackgroundSizing.InnerBorderEdge
        ) {
            Box(contentAlignment = Alignment.Center) {
                // Inner Thumb
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
                    ).background(color, shape)
                )
            }
        }
    }
}

private val ThumbSize = 20.dp
private val ThumbSizeWithBorder = ThumbSize + 2.dp
private val ThumbRadiusWithBorder = ThumbSizeWithBorder / 2
private val InnerThumbSize = 12.dp
private val InnerThumbHoverSize = 14.dp
private val InnerThumbPressedSize = 10.dp
