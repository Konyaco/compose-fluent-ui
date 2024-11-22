package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.awaitHorizontalDragOrCancellation
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.compose.ui.util.lerp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import kotlin.math.abs

@Composable
fun Slider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: ((Float) -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Slider(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        valueRange = valueRange,
        steps = steps,
        onValueChangeFinished = onValueChangeFinished,
        interactionSource = interactionSource,
        rail = { state -> SliderDefaults.Rail(state, enabled = enabled) },
        track = { state -> SliderDefaults.Track(state, enabled = enabled) },
        thumb = { state -> SliderDefaults.Thumb(state, enabled = enabled) }
    )
}

@Composable
fun Slider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: ((Float) -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    rail: @Composable (SliderState) -> Unit,
    track: @Composable (SliderState) -> Unit,
    thumb: @Composable (SliderState) -> Unit,
) {
    val state =
        remember(steps, valueRange) { SliderState(value, steps, onValueChangeFinished, valueRange) }
    state.value = value
    state.onValueChangeFinished = onValueChangeFinished
    state.onValueChange = onValueChange

    SliderImpl(
        modifier = modifier,
        state = state,
        enabled = enabled,
        interactionSource = interactionSource,
        rail = rail,
        track = track,
        thumb = thumb
    )
}

@Composable
fun Slider(
    state: SliderState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    SliderImpl(
        modifier = modifier,
        state = state,
        enabled = enabled,
        interactionSource = interactionSource,
        rail = { state -> SliderDefaults.Rail(state, enabled = enabled) },
        track = { state -> SliderDefaults.Track(state, enabled = enabled) },
        thumb = { state -> SliderDefaults.Thumb(state, enabled = enabled) }
    )
}

@Composable
fun Slider(
    state: SliderState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    rail: @Composable (SliderState) -> Unit,
    track: @Composable (SliderState) -> Unit,
    thumb: @Composable (SliderState) -> Unit,
) {
    SliderImpl(
        modifier = modifier,
        state = state,
        enabled = enabled,
        interactionSource = interactionSource,
        rail = rail,
        track = track,
        thumb = thumb
    )
}

@Composable
private fun SliderImpl(
    state: SliderState,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    rail: @Composable (SliderState) -> Unit,
    track: @Composable (SliderState) -> Unit,
    thumb: @Composable (SliderState) -> Unit,
) {
    BoxWithConstraints(
        modifier = modifier.height(32.dp).defaultMinSize(minWidth = 120.dp),
        contentAlignment = Alignment.CenterStart,
        propagateMinConstraints = true
    ) {
        val width by rememberUpdatedState(minWidth)
        val widthPx by rememberUpdatedState(constraints.minWidth)

        val density by rememberUpdatedState(LocalDensity.current)

        Box(
            modifier = Modifier.width(width)
                // .semantics {  } // TODO: Slider semantics
                .pointerInput(enabled, state.onValueChange) {
                    if (enabled) awaitEachGesture {
                        val down = awaitFirstDown()
                        down.consume()

                        val press = PressInteraction.Press(down.position)
                        interactionSource.tryEmit(press)

                        // Fluent  Behavior: Press will immediately change the value
                        state.startDragging(down.position, widthPx, density)

                        var change: PointerInputChange? = down

                        // We don't need touch slop
                        /*var change = awaitHorizontalTouchSlopOrCancellation(down.id) { change, overslop ->
                            val delta = change.positionChange()
                            change.consume()
                            println("Slop: ${delta} $overslop")
                            offset = Offset(x = offset.x + delta.x + overslop, y = offset.y)
                            currentOnFractionChange(calcFraction(offset))
                        }*/

                        while (change != null && change.pressed) {
                            change = awaitHorizontalDragOrCancellation(down.id)
                            if (change != null) {
                                val delta = change.positionChange()
                                change.consume()
                                state.updateDelta(delta, widthPx, density)
                            }
                        }
                        // Notify change finished
                        interactionSource.tryEmit(PressInteraction.Release(press))
                        state.stopDragging(widthPx, density)
                    }
                },
            contentAlignment = Alignment.CenterStart,
            propagateMinConstraints = true
        ) {
            rail(state)
            track(state)
            thumb(state)
        }
    }
}

class SliderState(
    value: Float = 0f,
    val steps: Int = 0,
    var onValueChangeFinished: ((Float) -> Unit)? = null,
    val valueRange: ClosedFloatingPointRange<Float>
) {
    val stepFractions = getStepFractions(steps)

    private var valueState by mutableFloatStateOf(value)
    internal var onValueChange: ((Float) -> Unit)? = null

    var value: Float
        set(newVal) {
            val coercedValue = newVal.coerceIn(valueRange.start, valueRange.endInclusive)
            // We snap value at dragging ending instead of each dragging delta
            /*val snappedValue =
                snapValueToTick(
                    coercedValue,
                    tickFractions,
                    valueRange.start,
                    valueRange.endInclusive
                )*/
            valueState = coercedValue
        }
        get() = valueState

    var isDragging by mutableStateOf(false)
        private set

    // Relating to component size, for accumulating offset delta
    var rawOffset by mutableStateOf(Offset.Zero)
        private set

    // Without relating to component size
    var rawFraction by mutableStateOf(valueToFraction(value, valueRange))
        private set

    private fun setRawOffset(offset: Offset, width: Int, density: Density) {
        this.rawOffset = offset
        this.rawFraction = offsetToFraction(offset, width, density)
    }

    private fun setRawFraction(fraction: Float, width: Int, density: Density) {
        this.rawFraction = fraction
        this.rawOffset =
            Offset(x = fractionToOffset(fraction, width, density), y = this.rawOffset.y)
    }

    internal fun startDragging(downOffset: Offset, width: Int, density: Density) {
        setRawOffset(downOffset, width, density)

        this.isDragging = true

        val fraction = offsetToFraction(downOffset, width, density)
        this.value = scaleToUserValue(fraction, this.valueRange)
        this.onValueChange?.invoke(this.value)
    }

    internal fun updateDelta(delta: Offset, width: Int, density: Density) {
        setRawOffset(Offset(x = this.rawOffset.x + delta.x, y = this.rawOffset.y), width, density)

        val fraction = offsetToFraction(this.rawOffset, width, density)
        this.value = scaleToUserValue(fraction, this.valueRange)
        this.onValueChange?.invoke(this.value)
    }

    internal fun stopDragging(width: Int, density: Density) {
        if (this.steps > 0) {
            // Snap
            // TODO: Add snap animation, maybe we should use anchoredDraggable?
            val currentValue = this.value
            val nearestValue = snapToNearestTickValue(currentValue)
            val fraction = valueToFraction(nearestValue, this.valueRange)
            this.value = nearestValue
            setRawFraction(fraction, width, density)
        }

        this.onValueChangeFinished?.invoke(this.value)
        this.isDragging = false
    }

    private fun snapToNearestTickValue(value: Float): Float {
        return this.stepFractions
            .map { lerp(this.valueRange.start, this.valueRange.endInclusive, it) }
            .minBy { abs(it - value) }
    }
}

private fun getStepFractions(steps: Int): FloatArray {
    return FloatArray(steps + 2) {
        it.toFloat() / (steps + 1)
    }
}

private fun fractionToOffset(fraction: Float, width: Int, density: Density): Float {
    val thumbRadius = with(density) { (ThumbSizeWithBorder / 2).toPx() }
    return lerp(thumbRadius, width - thumbRadius, fraction)
}

@Stable
private fun offsetToFraction(offset: Offset, width: Int, density: Density): Float {
    val thumbRadius = with(density) { (ThumbSizeWithBorder / 2).toPx() }

    return valueToFraction(offset.x, thumbRadius..(width - thumbRadius)).coerceIn(0f, 1f)
}

@Stable
private fun scaleToUserValue(fraction: Float, range: ClosedFloatingPointRange<Float>): Float =
    (range.endInclusive - range.start) * fraction + range.start

@Stable
private fun valueToFraction(
    value: Float, valueRange: ClosedFloatingPointRange<Float>
): Float = (value - valueRange.start) / (valueRange.endInclusive - valueRange.start)

@Stable
private fun calcThumbOffset(
    maxWidth: Dp, thumbSize: Dp, padding: Dp, fraction: Float
): Dp {
    return (maxWidth - thumbSize) * fraction - padding
}

object SliderDefaults {

    @Composable
    fun Track(
        state: SliderState,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        color: Color = FluentTheme.colors.fillAccent.default,
        disabledColor: Color = FluentTheme.colors.fillAccent.disabled,
        shape: Shape = CircleShape
    ) {
        BoxWithConstraints(modifier, contentAlignment = Alignment.CenterStart) {
            val width =
                ThumbRadiusWithBorder + (state.rawFraction * (maxWidth - ThumbSizeWithBorder))
            Box(
                Modifier.requiredSize(width, 4.dp)
                    .background(if (enabled) color else disabledColor, shape)
            )
        }
    }

    private val TickThickness = 1.dp
    private val TickHeight = 4.dp
    private val TickY = 22.dp
    private val TopTickY = 6.dp

    @Composable
    fun Rail(
        state: SliderState,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        showTick: Boolean = state.steps > 0,
        showTopTick: Boolean = true,
        color: Color = FluentTheme.colors.controlStrong.default,
        disabledColor: Color = FluentTheme.colors.controlStrong.default,
        border: BorderStroke? = BorderStroke(
            1.dp, if (FluentTheme.colors.darkMode) FluentTheme.colors.stroke.controlStrong.default
            else FluentTheme.colors.controlStrong.default
        ),
        shape: Shape = CircleShape
    ) {
        BoxWithConstraints(modifier, propagateMinConstraints = true) {
            val color = if (enabled) color else disabledColor

            Layer(
                modifier = Modifier.requiredHeight(4.dp),
                shape = shape,
                color = color,
                border = border,
                backgroundSizing = BackgroundSizing.InnerBorderEdge,
                content = {}
            )

            if (showTick && state.steps > 0) Tick(
                modifier = Modifier.width(minWidth).requiredHeight(minHeight),
                color = color,
                state = state,
                showTopTick = showTopTick
            )
        }
    }

    @Composable
    fun Tick(modifier: Modifier, color: Color, state: SliderState, showTopTick: Boolean) {
        Canvas(modifier) {
            // Start at center of the Thumb
            val scaledWidth =
                size.width - ThumbSize.toPx() // We don't need the start and end half Thumb
            val startX = ThumbSize.toPx() / 2
            val tickY = TickY.toPx()
            val topTickY = TopTickY.toPx()
            val tickThickness = TickThickness.toPx()
            val tickHeight = TickHeight.toPx()

            for (stepFraction in state.stepFractions) {
                val x = scaledWidth * stepFraction + startX
                drawLine(
                    color = color,
                    start = Offset(x = x, y = tickY),
                    end = Offset(x = x, y = tickY + tickHeight),
                    strokeWidth = tickThickness
                )

                if (showTopTick) {
                    drawLine(
                        color = color,
                        start = Offset(x = x, y = topTickY),
                        end = Offset(x = x, y = topTickY + tickHeight),
                        strokeWidth = tickThickness
                    )
                }
            }
        }
    }

    @Composable
    fun Thumb(
        state: SliderState,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        shape: Shape = CircleShape,
        border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.borders.circle),
        ringColor: Color = FluentTheme.colors.controlSolid.default,
        color: Color = FluentTheme.colors.fillAccent.default,
        draggingColor: Color = FluentTheme.colors.fillAccent.tertiary,
        disabledColor: Color = FluentTheme.colors.fillAccent.disabled
    ) {
        BoxWithConstraints(modifier, Alignment.CenterStart) {
            val thumbOffset by rememberUpdatedState(
                calcThumbOffset(maxWidth, ThumbSize, 1.dp, state.rawFraction)
            )

            val hovered by interactionSource.collectIsHoveredAsState()
            val pressed by interactionSource.collectIsPressedAsState()

            Layer(
                modifier = Modifier.offset { IntOffset(x = thumbOffset.roundToPx(), y = 0) }
                    .requiredSize(ThumbSizeWithBorder)
                    .hoverable(interactionSource, enabled),
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
                                    pressed || state.isDragging -> InnerThumbPressedSize
                                    hovered -> InnerThumbHoverSize
                                    else -> InnerThumbSize
                                },
                                tween(
                                    FluentDuration.QuickDuration,
                                    easing = FluentEasing.FastInvokeEasing
                                )
                            ).value
                        ).background(
                            when {
                                !enabled -> disabledColor
                                pressed || state.isDragging -> draggingColor
                                else -> color
                            }, shape
                        )
                    )
                }
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
