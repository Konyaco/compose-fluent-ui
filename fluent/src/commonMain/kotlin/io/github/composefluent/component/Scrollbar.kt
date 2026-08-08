package io.github.composefluent.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollIndicatorState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.node.DrawModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.PointerInputModifierNode
import androidx.compose.ui.node.invalidateDraw
import androidx.compose.ui.node.requireDensity
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastFirstOrNull
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentAlpha
import io.github.composefluent.LocalContentColor
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.math.abs
import kotlin.math.roundToInt

/**
 * Draws a Fluent scrollbar as an overlay at the trailing edge of this modifier's content.
 *
 * Geometry is read from Compose Foundation's [ScrollIndicatorState]. This modifier does not
 * reserve layout space. If [state] is `null`, does not contain a known scroll range yet, or the
 * content fits inside the viewport, the scrollbar is not drawn and its pointer input is ignored.
 *
 * Scrolling remains under the caller's control because [ScrollIndicatorState] only reports the
 * current position. [onThumbDrag] receives an absolute position fraction while the thumb is
 * dragged. [onTrackPress] receives the next absolute target fraction for a track or end-indicator
 * press; track presses advance by at most one page at a time, while end-indicator presses advance
 * by one indicator step. Both interactions repeat while held, following the Fluent/JetBrains
 * interaction model. Fractions are measured from the visual start of the scroll axis, including
 * the correct direction for a horizontal RTL layout.
 *
 * Apply this modifier to the scrollable container, typically before `verticalScroll` or
 * `horizontalScroll`, so the node observes the container's viewport.
 *
 * @param state state supplied by the scrollable container, or `null` to hide and disable the
 *   scrollbar.
 * @param orientation axis of the associated scrollable container.
 * @param onThumbDrag callback invoked continuously while the thumb is dragged, or `null` to
 *   disable thumb dragging. The fraction is in `0f..1f`, where zero is the visual start.
 * @param onTrackPress callback invoked for a track or end-indicator press, or `null` to disable
 *   those interactions. The fraction is the next absolute target in `0f..1f`.
 * @param colors colors used to draw the thumb and the highlighted track.
 */
@Composable
fun Modifier.scrollbar(
    state: ScrollIndicatorState?,
    orientation: Orientation,
    onThumbDrag: ((positionFraction: Float) -> Unit)? = null,
    onTrackPress: ((positionFraction: Float) -> Unit)? = null,
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
): Modifier = scrollbarNode(
    state = state,
    orientation = orientation,
    onThumbDrag = onThumbDrag,
    onThumbDragDelta = null,
    onTrackPress = onTrackPress,
    colors = colors,
)

@Composable
private fun Modifier.scrollbarNode(
    state: ScrollIndicatorState?,
    orientation: Orientation,
    onThumbDrag: ((positionFraction: Float) -> Unit)?,
    onThumbDragDelta: ((positionDeltaFraction: Float) -> Unit)?,
    onTrackPress: ((positionFraction: Float) -> Unit)?,
    colors: ScrollbarColors,
): Modifier {
    val fontIconFamily = LocalFontIconFontFamily.current
    val textMeasurer = rememberTextMeasurer()
    val layoutDirection = LocalLayoutDirection.current
    val horizontalRtl = orientation == Orientation.Horizontal &&
            layoutDirection == LayoutDirection.Rtl
    val startIndicator = when {
        orientation == Orientation.Vertical -> FontIconPrimitive.CaretUp
        horizontalRtl -> FontIconPrimitive.CaretRight
        else -> FontIconPrimitive.CaretLeft
    }
    val endIndicator = when {
        orientation == Orientation.Vertical -> FontIconPrimitive.CaretDown
        horizontalRtl -> FontIconPrimitive.CaretLeft
        else -> FontIconPrimitive.CaretRight
    }
    return this then ScrollbarElement(
        state = state,
        orientation = orientation,
        onThumbDrag = onThumbDrag,
        onThumbDragDelta = onThumbDragDelta,
        onTrackPress = onTrackPress,
        colors = colors,
        layoutDirection = layoutDirection,
        fontIconFamily = fontIconFamily,
        textMeasurer = textMeasurer,
        startIndicator = startIndicator,
        endIndicator = endIndicator,
        startIndicatorPainter = rememberVectorPainter(startIndicator.vector()),
        endIndicatorPainter = rememberVectorPainter(endIndicator.vector()),
    )
}

@Composable
private fun Modifier.scrollbarForState(
    state: ScrollIndicatorState?,
    orientation: Orientation,
    scrollableState: ScrollableState,
    coroutineScope: CoroutineScope,
    colors: ScrollbarColors,
): Modifier {
    val scrollMutex = remember(scrollableState) { Mutex() }
    return scrollbarNode(
        state = state,
        orientation = orientation,
        onThumbDrag = null,
        onThumbDragDelta = { positionDeltaFraction ->
            coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
                scrollMutex.withLock {
                    scrollByIndicatorDelta(
                        state = scrollableState,
                        indicatorState = state,
                        positionDeltaFraction = positionDeltaFraction,
                    )
                }
            }
        },
        onTrackPress = { positionFraction ->
            coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
                scrollMutex.withLock {
                    scrollToIndicatorPosition(
                        state = scrollableState,
                        indicatorState = state,
                        positionFraction = positionFraction,
                    )
                }
            }
        },
        colors = colors,
    )
}

/**
 * Draws a Fluent scrollbar for a [ScrollState] and connects its thumb and track interactions to
 * that state.
 *
 * The position fractions reported by the base scrollbar are converted to [ScrollState]'s pixel
 * range and dispatched from [coroutineScope]. A [ScrollState] can be used for either axis, so
 * [orientation] must match the `verticalScroll` or `horizontalScroll` modifier that uses
 * [state].
 *
 * @param state scroll state used by the scrollable container.
 * @param orientation axis of the scrollable container backed by [state].
 * @param coroutineScope scope used to launch scroll operations from thumb drags and track
 *   presses. Defaults to the composition's remembered scope.
 * @param colors colors used to draw the scrollbar.
 */
@Composable
fun Modifier.scrollbar(
    state: ScrollState,
    orientation: Orientation,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
): Modifier = scrollbarForState(
    state = state.scrollIndicatorState,
    orientation = orientation,
    scrollableState = state,
    coroutineScope = coroutineScope,
    colors = colors,
)

/**
 * Draws a Fluent scrollbar for a [LazyListState] and connects its thumb and track interactions to
 * the lazy list.
 *
 * By default, [orientation] follows the axis currently reported by [LazyListState.layoutInfo].
 * Override it only when the scrollbar's axis cannot be inferred from the lazy layout. Scroll
 * operations are launched from [coroutineScope], and the scrollbar's position fractions are
 * translated into the lazy list's scroll range.
 *
 * @param state lazy list state used by the scrollable container.
 * @param orientation axis of the lazy list; defaults to the measured orientation in
 *   [LazyListState.layoutInfo].
 * @param coroutineScope scope used to launch scroll operations from thumb drags and track
 *   presses. Defaults to the composition's remembered scope.
 * @param colors colors used to draw the scrollbar.
 */
@Composable
fun Modifier.scrollbar(
    state: LazyListState,
    orientation: Orientation = remember(state) { derivedStateOf { state.layoutInfo.orientation } }.value,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
): Modifier = scrollbarForState(
    state = state.scrollIndicatorState,
    orientation = orientation,
    scrollableState = state,
    coroutineScope = coroutineScope,
    colors = colors,
)

/**
 * Draws a Fluent scrollbar for a [LazyGridState] and connects its thumb and track interactions to
 * the lazy grid.
 *
 * By default, [orientation] follows the axis currently reported by [LazyGridState.layoutInfo].
 * Override it only when the scrollbar's axis cannot be inferred from the lazy layout. Scroll
 * operations are launched from [coroutineScope], and the scrollbar's position fractions are
 * translated into the lazy grid's scroll range.
 *
 * @param state lazy grid state used by the scrollable container.
 * @param orientation axis of the lazy grid; defaults to the measured orientation in
 *   [LazyGridState.layoutInfo].
 * @param coroutineScope scope used to launch scroll operations from thumb drags and track
 *   presses. Defaults to the composition's remembered scope.
 * @param colors colors used to draw the scrollbar.
 */
@Composable
fun Modifier.scrollbar(
    state: LazyGridState,
    orientation: Orientation = remember(state) { derivedStateOf { state.layoutInfo.orientation } }.value,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
): Modifier = scrollbarForState(
    state = state.scrollIndicatorState,
    orientation = orientation,
    scrollableState = state,
    coroutineScope = coroutineScope,
    colors = colors,
)

/**
 * Draws a Fluent scrollbar for a [LazyStaggeredGridState] and connects its thumb and track
 * interactions to the lazy staggered grid.
 *
 * By default, [orientation] follows the axis currently reported by
 * [LazyStaggeredGridState.layoutInfo]. Override it only when the scrollbar's axis cannot be
 * inferred from the lazy layout. Scroll operations are launched from [coroutineScope], and the
 * scrollbar's position fractions are translated into the lazy staggered grid's scroll range.
 *
 * @param state lazy staggered grid state used by the scrollable container.
 * @param orientation axis of the lazy staggered grid; defaults to the measured orientation in
 *   [LazyStaggeredGridState.layoutInfo].
 * @param coroutineScope scope used to launch scroll operations from thumb drags and track
 *   presses. Defaults to the composition's remembered scope.
 * @param colors colors used to draw the scrollbar.
 */
@Composable
fun Modifier.scrollbar(
    state: LazyStaggeredGridState,
    orientation: Orientation = remember(state) { derivedStateOf { state.layoutInfo.orientation } }.value,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
): Modifier = scrollbarForState(
    state = state.scrollIndicatorState,
    orientation = orientation,
    scrollableState = state,
    coroutineScope = coroutineScope,
    colors = colors,
)

@PublishedApi
internal suspend fun scrollByIndicatorDelta(
    state: ScrollableState,
    indicatorState: ScrollIndicatorState?,
    positionDeltaFraction: Float,
) {
    val indicator = indicatorState ?: return
    val contentSize = indicator.contentSize
    val viewportSize = indicator.viewportSize
    if (contentSize == Int.MAX_VALUE ||
        viewportSize == Int.MAX_VALUE ||
        contentSize <= viewportSize ||
        viewportSize <= 0
    ) {
        return
    }
    val scrollRange = contentSize.toLong() - viewportSize.toLong()
    state.scroll {
        scrollBy(scrollRange * positionDeltaFraction)
    }
}

@PublishedApi
internal suspend fun scrollToIndicatorPosition(
    state: ScrollableState,
    indicatorState: ScrollIndicatorState?,
    positionFraction: Float,
) {
    val indicator = indicatorState ?: return
    val scrollOffset = indicator.scrollOffset
    val contentSize = indicator.contentSize
    val viewportSize = indicator.viewportSize
    if (scrollOffset == Int.MAX_VALUE ||
        contentSize == Int.MAX_VALUE ||
        viewportSize == Int.MAX_VALUE ||
        scrollOffset < 0 ||
        contentSize <= viewportSize ||
        viewportSize <= 0
    ) {
        return
    }
    val scrollRange = contentSize.toLong() - viewportSize.toLong()
    val targetOffset = (scrollRange * positionFraction.coerceIn(0f, 1f))
        .roundToInt()
    state.scroll {
        scrollBy((targetOffset - scrollOffset).toFloat())
    }
}

private data class ScrollbarElement(
    val state: ScrollIndicatorState?,
    val orientation: Orientation,
    val onThumbDrag: ((positionFraction: Float) -> Unit)?,
    val onThumbDragDelta: ((positionDeltaFraction: Float) -> Unit)?,
    val onTrackPress: ((positionFraction: Float) -> Unit)?,
    val colors: ScrollbarColors,
    val layoutDirection: LayoutDirection,
    val fontIconFamily: FontFamily?,
    val textMeasurer: TextMeasurer,
    val startIndicator: FontIconPrimitive,
    val endIndicator: FontIconPrimitive,
    val startIndicatorPainter: Painter,
    val endIndicatorPainter: Painter,
) : ModifierNodeElement<ScrollbarNode>() {
    override fun create() = ScrollbarNode(
        state = state,
        orientation = orientation,
        onThumbDrag = onThumbDrag,
        onThumbDragDelta = onThumbDragDelta,
        onTrackPress = onTrackPress,
        colors = colors,
        layoutDirection = layoutDirection,
        fontIconFamily = fontIconFamily,
        textMeasurer = textMeasurer,
        startIndicator = startIndicator,
        endIndicator = endIndicator,
        startIndicatorPainter = startIndicatorPainter,
        endIndicatorPainter = endIndicatorPainter,
    )

    override fun update(node: ScrollbarNode) {
        node.update(
            state = state,
            orientation = orientation,
            onThumbDrag = onThumbDrag,
            onThumbDragDelta = onThumbDragDelta,
            onTrackPress = onTrackPress,
            colors = colors,
            layoutDirection = layoutDirection,
            fontIconFamily = fontIconFamily,
            textMeasurer = textMeasurer,
            startIndicator = startIndicator,
            endIndicator = endIndicator,
            startIndicatorPainter = startIndicatorPainter,
            endIndicatorPainter = endIndicatorPainter,
        )
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "scrollbar"
        properties["state"] = state
        properties["orientation"] = orientation
        properties["onThumbDrag"] = onThumbDrag
        properties["onThumbDragDelta"] = onThumbDragDelta
        properties["onTrackPress"] = onTrackPress
        properties["colors"] = colors
    }
}

private class ScrollbarNode(
    state: ScrollIndicatorState?,
    orientation: Orientation,
    onThumbDrag: ((positionFraction: Float) -> Unit)?,
    onThumbDragDelta: ((positionDeltaFraction: Float) -> Unit)?,
    onTrackPress: ((positionFraction: Float) -> Unit)?,
    colors: ScrollbarColors,
    layoutDirection: LayoutDirection,
    fontIconFamily: FontFamily?,
    textMeasurer: TextMeasurer,
    startIndicator: FontIconPrimitive,
    endIndicator: FontIconPrimitive,
    startIndicatorPainter: Painter,
    endIndicatorPainter: Painter,
) : Modifier.Node(), DrawModifierNode, PointerInputModifierNode {
    private var state = state
    private var orientation = orientation
    private var onThumbDrag = onThumbDrag
    private var onThumbDragDelta = onThumbDragDelta
    private var onTrackPress = onTrackPress
    private var colors = colors
    private var layoutDirection = layoutDirection
    private var fontIconFamily = fontIconFamily
    private var textMeasurer = textMeasurer
    private var startIndicator = startIndicator
    private var endIndicator = endIndicator
    private var startIndicatorPainter = startIndicatorPainter
    private var endIndicatorPainter = endIndicatorPainter
    private var pointerHovered = false
    private var highlightTarget = false
    private var pressedPart = ScrollbarPart.None
    private var dragGrabOffset = 0f
    private var dragLastPosition = 0f
    private var dragGeometry: ScrollbarGeometry? = null
    private var dragThumbOffset = 0f
    private val highlight = Animatable(0f)
    private val indicatorScale = Animatable(1f)
    private var highlightJob: Job? = null
    private var indicatorScaleJob: Job? = null
    private var repeatPressJob: Job? = null

    fun update(
        state: ScrollIndicatorState?,
        orientation: Orientation,
        onThumbDrag: ((positionFraction: Float) -> Unit)?,
        onThumbDragDelta: ((positionDeltaFraction: Float) -> Unit)?,
        onTrackPress: ((positionFraction: Float) -> Unit)?,
        colors: ScrollbarColors,
        layoutDirection: LayoutDirection,
        fontIconFamily: FontFamily?,
        textMeasurer: TextMeasurer,
        startIndicator: FontIconPrimitive,
        endIndicator: FontIconPrimitive,
        startIndicatorPainter: Painter,
        endIndicatorPainter: Painter,
    ) {
        val stateChanged = this.state !== state
        val geometryChanged = stateChanged ||
                this.orientation != orientation ||
                this.layoutDirection != layoutDirection
        this.state = state
        this.orientation = orientation
        this.onThumbDrag = onThumbDrag
        this.onThumbDragDelta = onThumbDragDelta
        this.onTrackPress = onTrackPress
        this.colors = colors
        this.layoutDirection = layoutDirection
        this.fontIconFamily = fontIconFamily
        this.textMeasurer = textMeasurer
        this.startIndicator = startIndicator
        this.endIndicator = endIndicator
        this.startIndicatorPainter = startIndicatorPainter
        this.endIndicatorPainter = endIndicatorPainter
        if (state == null) {
            pressedPart = ScrollbarPart.None
            dragGeometry = null
            dragThumbOffset = 0f
            dragLastPosition = 0f
            animateIndicatorScale(false)
            repeatPressJob?.cancel()
            animateHighlight(false)
        } else if (stateChanged) {
            animateHighlight(pointerHovered)
        }
        if (geometryChanged) {
            invalidateDraw()
        }
    }

    override fun onPointerEvent(
        pointerEvent: PointerEvent,
        pass: PointerEventPass,
        bounds: IntSize,
    ) {
        if (pass != PointerEventPass.Main || state == null) return
        val change = pointerEvent.changes.firstOrNull() ?: return
        val position = change.position
        val isInScrollbar = position.isInScrollbar(bounds)
        if (pointerEvent.type == PointerEventType.Exit && pressedPart == ScrollbarPart.None) {
            setPointerHovered(false)
            return
        }
        setPointerHovered(isInScrollbar)

        val geometry = calculateGeometry(
            state = state ?: return,
            axisLength = bounds.axisLength(),
            minimumThumbLength = with(requireDensity()) {
                ScrollbarDefaults.minimumThumbLength.toPx()
            },
        ) ?: return

        when {
            change.pressed && !change.previousPressed && isInScrollbar -> {
                val part = hitTest(position.axisPosition(), geometry)
                pressedPart = part
                when (part) {
                    ScrollbarPart.Thumb -> {
                        dragGrabOffset = position.axisPosition() - geometry.thumbOffset
                        dragLastPosition = position.axisPosition()
                        dragGeometry = geometry
                        dragThumbOffset = geometry.thumbOffset
                    }
                    ScrollbarPart.StartIndicator -> pressTrack(
                        geometry.positionFraction - geometry.indicatorStepFraction,
                    )
                    ScrollbarPart.EndIndicator -> pressTrack(
                        geometry.positionFraction + geometry.indicatorStepFraction,
                    )
                    ScrollbarPart.TrackBefore -> pressTrack(
                        geometry.positionAfterTrackPress(
                            pointerPosition = position.axisPosition(),
                            reverse = isHorizontalRtl,
                        ),
                    )
                    ScrollbarPart.TrackAfter -> pressTrack(
                        geometry.positionAfterTrackPress(
                            pointerPosition = position.axisPosition(),
                            reverse = isHorizontalRtl,
                        ),
                    )
                    ScrollbarPart.None -> Unit
                }
                if (part.isRepeatable) {
                    startRepeatingPress(
                        part = part,
                        axisLength = bounds.axisLength(),
                        pointerPosition = position.axisPosition(),
                    )
                }
                animateIndicatorScale(part.isIndicator)
                if (part != ScrollbarPart.None) change.consume()
                if (part != ScrollbarPart.None) {
                    animateHighlight(true, delayMillis = 0)
                }
                invalidateDraw()
            }
            change.pressed && pressedPart == ScrollbarPart.Thumb -> {
                val axisPosition = position.axisPosition()
                val pointerDelta = axisPosition - dragLastPosition
                dragLastPosition = axisPosition
                dragGeometry?.let { dragGeometry ->
                    dragThumbOffset = (dragThumbOffset + pointerDelta)
                        .coerceIn(
                            dragGeometry.trackStart,
                            dragGeometry.trackStart + dragGeometry.travel,
                        )
                }
                val dragTravel = dragGeometry?.travel ?: geometry.travel
                if (onThumbDragDelta != null && dragTravel > 0f) {
                    val direction = if (isHorizontalRtl) -1f else 1f
                    onThumbDragDelta?.invoke(pointerDelta / dragTravel * direction)
                }
                val fractionGeometry = dragGeometry ?: geometry
                val fractionThumbPosition = if (dragGeometry != null) {
                    dragThumbOffset
                } else {
                    axisPosition - dragGrabOffset
                }
                val fraction = fractionGeometry.fractionForThumbPosition(
                    fractionThumbPosition,
                    reverse = orientation == Orientation.Horizontal &&
                            layoutDirection == LayoutDirection.Rtl,
                )
                onThumbDrag?.invoke(fraction)
                change.consume()
                invalidateDraw()
            }
            !change.pressed && change.previousPressed -> {
                pressedPart = ScrollbarPart.None
                dragLastPosition = 0f
                dragGeometry = null
                dragThumbOffset = 0f
                animateIndicatorScale(false)
                repeatPressJob?.cancel()
                animateHighlight(pointerHovered)
                invalidateDraw()
            }
        }
    }

    override fun onCancelPointerInput() {
        pressedPart = ScrollbarPart.None
        dragLastPosition = 0f
        dragGeometry = null
        dragThumbOffset = 0f
        animateIndicatorScale(false)
        repeatPressJob?.cancel()
        setPointerHovered(false)
    }

    override fun onDetach() {
        highlightJob?.cancel()
        indicatorScaleJob?.cancel()
        repeatPressJob?.cancel()
    }

    private fun pressTrack(positionFraction: Float) {
        onTrackPress?.invoke(positionFraction.coerceIn(0f, 1f))
    }

    private fun startRepeatingPress(
        part: ScrollbarPart,
        axisLength: Float,
        pointerPosition: Float,
    ) {
        repeatPressJob?.cancel()
        repeatPressJob = coroutineScope.launch {
            delay(RepeatPressDelayMillis)
            while (pressedPart == part) {
                if (!performRepeatPress(part, axisLength, pointerPosition)) break
                delay(RepeatPressIntervalMillis)
            }
        }
    }

    private fun performRepeatPress(
        part: ScrollbarPart,
        axisLength: Float,
        pointerPosition: Float,
    ): Boolean {
        val geometry = calculateGeometry(
            state = state ?: return false,
            axisLength = axisLength,
            minimumThumbLength = with(requireDensity()) {
                ScrollbarDefaults.minimumThumbLength.toPx()
            },
        ) ?: return false
        val targetPosition = when (part) {
            ScrollbarPart.StartIndicator ->
                geometry.positionFraction - geometry.indicatorStepFraction
            ScrollbarPart.EndIndicator ->
                geometry.positionFraction + geometry.indicatorStepFraction
            ScrollbarPart.TrackBefore,
            ScrollbarPart.TrackAfter,
                -> geometry.fractionForTrackPosition(pointerPosition, reverse = isHorizontalRtl)
            else -> return false
        }.coerceIn(0f, 1f)
        val distanceToTarget = targetPosition - geometry.positionFraction
        if (abs(distanceToTarget) <= PositionEpsilon) return false
        val step = if (part.isIndicator) {
            geometry.indicatorStepFraction
        } else {
            geometry.pageStepFraction
        }
        pressTrack(
            geometry.positionFraction + distanceToTarget.coerceIn(-step, step),
        )
        return if (part.isIndicator) {
            true
        } else {
            abs(distanceToTarget) > step + PositionEpsilon
        }
    }

    private fun animateIndicatorScale(pressed: Boolean) {
        val target = if (pressed) ScrollbarDefaults.indicatorPressedScale else 1f
        if (indicatorScale.targetValue == target) return
        indicatorScaleJob?.cancel()
        indicatorScaleJob = coroutineScope.launch {
            indicatorScale.animateTo(
                target,
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing,
                ),
            )
        }
    }

    private fun hitTest(axisPosition: Float, geometry: ScrollbarGeometry): ScrollbarPart = when {
        axisPosition in geometry.thumbOffset..(geometry.thumbOffset + geometry.thumbLength) ->
            if (onThumbDrag != null || onThumbDragDelta != null) {
                ScrollbarPart.Thumb
            } else {
                ScrollbarPart.None
            }
        axisPosition < geometry.trackStart -> if (onTrackPress != null) {
            if (isHorizontalRtl) {
                ScrollbarPart.EndIndicator
            } else {
                ScrollbarPart.StartIndicator
            }
        } else ScrollbarPart.None
        axisPosition > geometry.trackEnd -> if (onTrackPress != null) {
            if (isHorizontalRtl) {
                ScrollbarPart.StartIndicator
            } else {
                ScrollbarPart.EndIndicator
            }
        } else ScrollbarPart.None
        axisPosition < geometry.thumbOffset -> if (onTrackPress != null) {
            if (isHorizontalRtl) ScrollbarPart.TrackAfter else ScrollbarPart.TrackBefore
        } else ScrollbarPart.None
        axisPosition > geometry.thumbOffset + geometry.thumbLength -> if (onTrackPress != null) {
            if (isHorizontalRtl) ScrollbarPart.TrackBefore else ScrollbarPart.TrackAfter
        } else ScrollbarPart.None
        else -> ScrollbarPart.None
    }

    private val isHorizontalRtl
        get() = orientation == Orientation.Horizontal && layoutDirection == LayoutDirection.Rtl

    private fun Offset.axisPosition() = when (orientation) {
        Orientation.Vertical -> y
        Orientation.Horizontal -> x
    }

    private fun IntSize.axisLength() = when (orientation) {
        Orientation.Vertical -> height.toFloat()
        Orientation.Horizontal -> width.toFloat()
    }

    private fun Offset.isInScrollbar(bounds: IntSize): Boolean {
        val targetThickness = with(requireDensity()) {
            ScrollbarDefaults.containerThickness.toPx()
        }
        return when (orientation) {
            Orientation.Vertical ->
                x in (bounds.width - targetThickness)..bounds.width.toFloat() &&
                        y in 0f..bounds.height.toFloat()
            Orientation.Horizontal ->
                y in (bounds.height - targetThickness)..bounds.height.toFloat() &&
                        x in 0f..bounds.width.toFloat()
        }
    }

    private fun setPointerHovered(value: Boolean) {
        if (pointerHovered == value) return
        pointerHovered = value
        if (state != null) {
            animateHighlight(value || pressedPart != ScrollbarPart.None)
        }
        invalidateDraw()
    }

    private fun animateHighlight(
        value: Boolean,
        delayMillis: Long = ScrollbarDefaults.hoverDurationMillis.toLong(),
    ) {
        if (highlightTarget == value && !(value && delayMillis == 0L && highlight.value < 1f)) return
        highlightTarget = value
        highlightJob?.cancel()
        highlightJob = coroutineScope.launch {
            delay(delayMillis)
            highlight.animateTo(
                targetValue = if (value) 1f else 0f,
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing,
                ),
            )
        }
    }

    override fun ContentDrawScope.draw() {
        drawContent()
        val geometry = calculateGeometry(
            state = state ?: return,
            axisLength = when (orientation) {
                Orientation.Vertical -> size.height
                Orientation.Horizontal -> size.width
            },
            minimumThumbLength = ScrollbarDefaults.minimumThumbLength.toPx(),
        ) ?: return
        val fraction = highlight.value
        val drawGeometry = if (pressedPart == ScrollbarPart.Thumb) {
            dragGeometry?.copy(thumbOffset = dragThumbOffset) ?: geometry
        } else {
            geometry
        }
        drawTrack(fraction)
        drawThumb(drawGeometry, fraction)
        drawIndicators(drawGeometry, fraction)
    }

    private fun calculateGeometry(
        state: ScrollIndicatorState,
        axisLength: Float,
        minimumThumbLength: Float,
    ): ScrollbarGeometry? {
        val scrollOffset = state.scrollOffset
        val contentSize = state.contentSize
        val viewportSize = state.viewportSize
        if (scrollOffset == Int.MAX_VALUE ||
            contentSize == Int.MAX_VALUE ||
            viewportSize == Int.MAX_VALUE ||
            scrollOffset < 0 ||
            contentSize <= 0 ||
            viewportSize <= 0 ||
            contentSize <= viewportSize
        ) {
            return null
        }

        val indicatorLength = with(requireDensity()) { IndicatorLength.toPx() }
        val edgePadding = with(requireDensity()) { IndicatorEdgePadding.toPx() }
        val trackStart = indicatorLength + edgePadding
        val trackLength = (axisLength - 2f * trackStart).coerceAtLeast(0f)
        if (trackLength <= 0f) return null

        val resolvedMinimumThumbLength = minimumThumbLength.coerceAtMost(trackLength)
        val thumbLength = (viewportSize.toFloat() / contentSize * trackLength)
            .coerceIn(resolvedMinimumThumbLength, trackLength)
        val scrollRange = (contentSize - viewportSize).coerceAtLeast(1)
        val travel = (trackLength - thumbLength).coerceAtLeast(0f)
        val positionFraction = scrollOffset.coerceIn(0, scrollRange).toFloat() / scrollRange
        val visualOffset = positionFraction * travel
        val canvasOffset = when {
            orientation == Orientation.Horizontal && layoutDirection == LayoutDirection.Rtl ->
                trackStart + travel - visualOffset
            else -> trackStart + visualOffset
        }
        return ScrollbarGeometry(
            thumbOffset = canvasOffset,
            thumbLength = thumbLength,
            trackStart = trackStart,
            trackEnd = trackStart + trackLength,
            travel = travel,
            positionFraction = positionFraction,
            indicatorStepFraction = with(requireDensity()) {
                ScrollbarDefaults.indicatorScrollOffset.toPx() / scrollRange
            },
            pageStepFraction = viewportSize.toFloat() / scrollRange,
        )
    }

    private fun ContentDrawScope.drawTrack(highlightFraction: Float) {
        if (highlightFraction <= 0f) return
        val availableThickness = when (orientation) {
            Orientation.Vertical -> size.width
            Orientation.Horizontal -> size.height
        }
        val thickness = ScrollbarDefaults.containerThickness.toPx()
            .coerceAtMost(availableThickness)
        val trackSize = when (orientation) {
            Orientation.Vertical -> Size(thickness, size.height)
            Orientation.Horizontal -> Size(size.width, thickness)
        }
        val trackOffset = Offset(size.width - trackSize.width, size.height - trackSize.height)
        val outline = ScrollbarDefaults.shape.createOutline(trackSize, layoutDirection, this)
        translate(trackOffset.x, trackOffset.y) {
            drawOutline(
                outline = outline,
                color = colors.backgroundColor.copy(
                    alpha = colors.backgroundColor.alpha * highlightFraction,
                ),
            )
        }
    }

    private fun ContentDrawScope.drawThumb(
        geometry: ScrollbarGeometry,
        highlightFraction: Float,
    ) {
        val restingThickness = ScrollbarDefaults.thickness.toPx()
        val highlightedThickness = ScrollbarDefaults.thicknessHighlight.toPx()
        val availableThickness = when (orientation) {
            Orientation.Vertical -> size.width
            Orientation.Horizontal -> size.height
        }
        val thickness = (restingThickness +
                (highlightedThickness - restingThickness) * highlightFraction)
            .coerceAtMost(availableThickness)
        val thumbSize = when (orientation) {
            Orientation.Vertical -> Size(thickness, geometry.thumbLength)
            Orientation.Horizontal -> Size(geometry.thumbLength, thickness)
        }
        val thumbOffset = when (orientation) {
            Orientation.Vertical -> Offset(
                x = scrollbarCrossAxisEnd() - thickness,
                y = geometry.thumbOffset,
            )
            Orientation.Horizontal -> Offset(
                x = geometry.thumbOffset,
                y = scrollbarCrossAxisEnd() - thickness,
            )
        }
        val outline = ScrollbarDefaults.shape.createOutline(thumbSize, layoutDirection, this)
        translate(thumbOffset.x, thumbOffset.y) {
            drawOutline(
                outline = outline,
                color = when {
                    pressedPart == ScrollbarPart.Thumb -> colors.contentColorPressed
                    pointerHovered -> colors.contentColorHovered
                    else -> colors.contentColor
                },
            )
        }
    }

    private fun ContentDrawScope.drawIndicators(
        geometry: ScrollbarGeometry,
        highlightFraction: Float,
    ) {
        if (highlightFraction <= 0f) return
        val edgePadding = IndicatorEdgePadding.toPx()
        val indicatorLength = IndicatorLength.toPx()
        val indicatorCrossAxisCenter = scrollbarCrossAxisEnd(IndicatorEndPadding) -
                IndicatorIconSize.toPx() / 2f
        val lowCenter = edgePadding + indicatorLength / 2f
        val highCenter = when (orientation) {
            Orientation.Vertical -> size.height - lowCenter
            Orientation.Horizontal -> size.width - lowCenter
        }
        val startCenter = when {
            isHorizontalRtl -> Offset(highCenter, indicatorCrossAxisCenter)
            orientation == Orientation.Vertical -> Offset(indicatorCrossAxisCenter, lowCenter)
            else -> Offset(lowCenter, indicatorCrossAxisCenter)
        }
        val endCenter = when {
            isHorizontalRtl -> Offset(lowCenter, indicatorCrossAxisCenter)
            orientation == Orientation.Vertical -> Offset(indicatorCrossAxisCenter, highCenter)
            else -> Offset(highCenter, indicatorCrossAxisCenter)
        }
        drawIndicator(
            center = startCenter,
            pressed = pressedPart == ScrollbarPart.StartIndicator,
            enabled = true,
            alpha = highlightFraction,
            icon = startIndicator,
            painter = startIndicatorPainter,
        )
        drawIndicator(
            center = endCenter,
            pressed = pressedPart == ScrollbarPart.EndIndicator,
            enabled = true,
            alpha = highlightFraction,
            icon = endIndicator,
            painter = endIndicatorPainter,
        )
    }

    private fun ContentDrawScope.drawIndicator(
        center: Offset,
        pressed: Boolean,
        enabled: Boolean,
        alpha: Float,
        icon: FontIconPrimitive,
        painter: Painter,
    ) {
        val color = when {
            pressed -> colors.contentColorPressed
            !enabled -> colors.contentColorDisabled
            pointerHovered -> colors.contentColorHovered
            else -> colors.contentColor
        }
        scale(indicatorScale.value, pivot = center) {
            if (fontIconFamily != null) {
                val textLayout = textMeasurer.measure(
                    text = AnnotatedString(icon.glyph.toString()),
                    style = TextStyle(
                        color = color.copy(alpha = color.alpha * alpha),
                        fontFamily = fontIconFamily,
                        fontSize = IndicatorIconSize.value.sp,
                    ),
                    softWrap = false,
                    maxLines = 1,
                )
                drawText(
                    textLayoutResult = textLayout,
                    topLeft = center - Offset(
                        textLayout.size.width / 2f,
                        textLayout.size.height / 2f,
                    ),
                )
            } else {
                val iconSize = IndicatorIconSize.toPx()
                translate(center.x - iconSize / 2f, center.y - iconSize / 2f) {
                    with(painter) {
                        draw(
                            size = Size(iconSize, iconSize),
                            alpha = alpha,
                            colorFilter = ColorFilter.tint(color),
                        )
                    }
                }
            }
        }
    }

    private fun ContentDrawScope.scrollbarCrossAxisEnd(endPadding: Dp = ScrollbarEndPadding): Float {
        val availableThickness = when (orientation) {
            Orientation.Vertical -> size.width
            Orientation.Horizontal -> size.height
        }
        return (availableThickness - endPadding.toPx()).coerceAtLeast(0f)
    }
}

private data class ScrollbarGeometry(
    val thumbOffset: Float,
    val thumbLength: Float,
    val trackStart: Float,
    val trackEnd: Float,
    val travel: Float,
    val positionFraction: Float,
    val indicatorStepFraction: Float,
    val pageStepFraction: Float,
) {
    val canScrollToStart: Boolean get() = positionFraction > 0f
    val canScrollToEnd: Boolean get() = positionFraction < 1f

    fun fractionForTrackPosition(position: Float, reverse: Boolean): Float {
        return fractionForThumbPosition(position - thumbLength / 2f, reverse)
    }

    fun positionAfterTrackPress(pointerPosition: Float, reverse: Boolean): Float {
        val target = fractionForTrackPosition(pointerPosition, reverse)
        val distanceToTarget = target - positionFraction
        return (positionFraction + distanceToTarget.coerceIn(-pageStepFraction, pageStepFraction))
            .coerceIn(0f, 1f)
    }

    fun fractionForThumbPosition(position: Float, reverse: Boolean): Float {
        if (travel <= 0f) return 0f
        val canvasFraction = ((position - trackStart) / travel).coerceIn(0f, 1f)
        return if (reverse) 1f - canvasFraction else canvasFraction
    }
}

private enum class ScrollbarPart {
    None,
    StartIndicator,
    TrackBefore,
    Thumb,
    TrackAfter,
    EndIndicator,
}

private val ScrollbarPart.isIndicator
    get() = this == ScrollbarPart.StartIndicator ||
            this == ScrollbarPart.EndIndicator

private val ScrollbarPart.isRepeatable
    get() = this.isIndicator ||
            this == ScrollbarPart.TrackBefore ||
            this == ScrollbarPart.TrackAfter

private val IndicatorLength = 16.dp
private val IndicatorEdgePadding = 2.dp
private val IndicatorIconSize = 8.dp
private val IndicatorEndPadding = 3.dp
private val ScrollbarEndPadding = 4.dp
private const val RepeatPressDelayMillis = 200L
private const val RepeatPressIntervalMillis = 50L
private const val PositionEpsilon = 0.0001f

/*
* fork from Scrollbar.desktop
 */
expect interface ScrollbarAdapter {

    // We use `Double` values here in order to allow scrolling both very large (think LazyList with
    // millions of items) and very small (think something whose natural coordinates are less than 1)
    // content.

    /**
     * Scroll offset of the content inside the scrollable component.
     *
     * For example, a value of `100` could mean the content is scrolled by 100 pixels from the
     * start.
     */
    val scrollOffset: Double

    /**
     * The size of the scrollable content, on the scrollable axis.
     */
    val contentSize: Double

    /**
     * The size of the viewport, on the scrollable axis.
     */
    val viewportSize: Double

    /**
     * Instantly jump to [scrollOffset].
     *
     * @param scrollOffset target offset to jump to, value will be coerced to the valid
     * scroll range.
     */
    suspend fun scrollTo(scrollOffset: Double)

}

/**
 * A scrollbar that can be used to control the scrolling of a scrollable component.
 *
 * @param isVertical `true` if the scrollbar is vertical, `false` if horizontal.
 * @param adapter The [ScrollbarAdapter] that provides the information about the scrollable
 *   component and allows to control its scrolling.
 * @param modifier Modifier to be applied to the scrollbar.
 * @param reverseLayout `true` if the scrollable component's layout is reversed, `false`
 *   otherwise.
 * @param colors The [ScrollbarColors] that will be used to draw the scrollbar.
 */
@Composable
fun Scrollbar(
    isVertical: Boolean,
    adapter: ScrollbarAdapter,
    modifier: Modifier = Modifier,
    reverseLayout: Boolean = false,
    colors: ScrollbarColors = ScrollbarDefaults.colors()
) {
    PlatformScrollBar(
        isVertical,
        adapter,
        modifier,
        reverseLayout,
        colors
    )
}

@Composable
internal expect fun PlatformScrollBar(
    isVertical: Boolean,
    adapter: ScrollbarAdapter,
    modifier: Modifier,
    reverseLayout: Boolean,
    colors: ScrollbarColors
)

/**
 * Creates and remembers a [ScrollbarAdapter] for the given [ScrollState].
 *
 * @param state the [ScrollState] to create a [ScrollbarAdapter] for.
 */
@Composable
expect fun rememberScrollbarAdapter(
    state: ScrollState
): ScrollbarAdapter

/**
 * Creates and remembers a [ScrollbarAdapter] for a [LazyListState].
 *
 * @param state the [LazyListState] to be used with the [ScrollbarAdapter].
 * @return a [ScrollbarAdapter] that can be used with a scrollbar.
 */
@Composable
expect fun rememberScrollbarAdapter(
    state: LazyListState
): ScrollbarAdapter

/**
 * Creates and remembers a [ScrollbarAdapter] for a [LazyGridState].
 *
 * @param state The [LazyGridState] to observe.
 * @return A [ScrollbarAdapter] that is coupled to the given [LazyGridState].
 */
@Composable
expect fun rememberScrollbarAdapter(
    state: LazyGridState
): ScrollbarAdapter

/**
 * Represents the color scheme for the scrollbar.
 *
 * @property contentColor The color of the scrollbar content (e.g., the thumb) in its default state.
 * @property contentColorDisabled The color of the scrollbar content when it's disabled.
 * @property contentColorHovered The color of the scrollbar content when the mouse is hovering over it.
 * @property contentColorPressed The color of the scrollbar content when it's being pressed.
 * @property backgroundColor The background color of the scrollbar track.
 */
@Immutable
data class ScrollbarColors(
    val contentColor: Color,
    val contentColorDisabled: Color,
    val contentColorHovered: Color,
    val contentColorPressed: Color,
    val backgroundColor: Color
)

/**
 * Contains the default values used by [Scrollbar].
 */
object ScrollbarDefaults {
    /**
     * The width of the pointer target and highlighted track.
     */
    val containerThickness = 12.dp

    /**
     * The thickness of the scrollbar when it is highlighted (e.g., hovered or dragged).
     */
    val thicknessHighlight = 6.dp
    /**
     * The default thickness of the scrollbar when it is not being hovered or pressed.
     */
    val thickness = 2.dp

    /**
     * The minimum length of a scrollbar thumb.
     */
    val minimumThumbLength = 16.dp
    /**
     * The duration in milliseconds for the time to show the scrollbar highlight.
     */
    const val hoverDurationMillis = 500
    /**
     * The default shape of the scrollbar thumb.
     */
    val shape = CircleShape
    /**
     * The scale factor applied to the scrollbar indicator when it is pressed.
     */
    const val indicatorPressedScale = 0.875f
    /**
     * The offset for the scroll indicator, used to position the indicator away from the end or
     * start of the scrollbar.
     */
    val indicatorScrollOffset = 24.dp

    /**
     * Creates a [ScrollbarColors] that represents the default colors used in a scrollbar.
     *
     * @param contentColor The color of the scrollbar thumb in its default state.
     * @param contentColorDisabled The color of the scrollbar thumb when disabled.
     * @param contentColorHovered The color of the scrollbar thumb when hovered.
     * @param contentColorPressed The color of the scrollbar thumb when pressed.
     * @param backgroundColor The background color of the scrollbar track.
     *
     * @return The resulting [ScrollbarColors] object.
     */
    @Composable
    fun colors(
        contentColor: Color = FluentTheme.colors.controlStrong.default,
        contentColorDisabled: Color = FluentTheme.colors.controlStrong.disabled,
        contentColorHovered: Color = FluentTheme.colors.controlStrong.default,
        contentColorPressed: Color = FluentTheme.colors.controlStrong.default,
        backgroundColor: Color = FluentTheme.colors.background.acrylic.default
    ) = ScrollbarColors(
        contentColor = contentColor,
        contentColorDisabled = contentColorDisabled,
        contentColorHovered = contentColorHovered,
        contentColorPressed = contentColorPressed,
        backgroundColor = backgroundColor
    )
}

/**
 * A clickable indicator for scrolling, usually used alongside a [Scrollbar].
 *
 * @param adapter The [ScrollbarAdapter] that provides information about the scroll state.
 * @param isVertical `true` if the scrollbar is vertical, `false` if it's horizontal.
 * @param modifier Modifier for styling and layout.
 * @param visible `true` if the indicator should be visible, `false` otherwise.
 * @param forward `true` if the indicator is for scrolling towards the start (e.g., up/left), `false` for scrolling towards the end (e.g., down/right).
 * @param enabled `true` if the indicator should respond to clicks, `false` otherwise.
 * @param colors The [ScrollbarColors] to use for the indicator.
 */
@Composable
fun ScrollbarIndicator(
    adapter: ScrollbarAdapter,
    isVertical: Boolean,
    modifier: Modifier = Modifier,
    visible: Boolean = false,
    forward: Boolean = false,
    enabled: Boolean = true,
    colors: ScrollbarColors = ScrollbarDefaults.colors(),
) {
    val interaction = remember {
        MutableInteractionSource()
    }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()
    val scrollScope = rememberCoroutineScope()
    val offset = with(LocalDensity.current) { ScrollbarDefaults.indicatorScrollOffset.toPx() }
    val animationFraction by animateFloatAsState(
        targetValue = if (visible) {
            1f
        } else {
            0f
        },
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )
    val targetScale by animateFloatAsState(
        if (pressed) {
            ScrollbarDefaults.indicatorPressedScale
        } else {
            1f
        }
    )
    val targetAlpha = animationFraction
    val tint = when {
        pressed -> colors.contentColorPressed
        hovered -> colors.contentColorHovered
        !enabled -> colors.contentColorDisabled
        else -> colors.contentColor
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .then(modifier)
            .then(
                if (isVertical) {
                    Modifier.size(12.dp, 16.dp)
                } else {
                    Modifier.size(16.dp, 12.dp)
                }
            )
            .clickable(
                interactionSource = interaction,
                indication = null,
                enabled = enabled && visible
            ) {
                scrollScope.launch {
                    if (forward) {
                        adapter.scrollTo(-offset + adapter.scrollOffset)
                    } else {
                        adapter.scrollTo(offset + adapter.scrollOffset)
                    }
                }
            }.graphicsLayer {
                scaleX = targetScale
                scaleY = targetScale
                alpha = targetAlpha
            }) {
        CompositionLocalProvider(
            LocalContentColor provides tint,
            LocalContentAlpha provides tint.alpha
        ) {
            FontIconSolid8(
                type = when {
                    isVertical && forward -> FontIconPrimitive.CaretUp
                    isVertical -> FontIconPrimitive.CaretDown
                    forward -> FontIconPrimitive.CaretLeft
                    else -> FontIconPrimitive.CaretRight
                },
                contentDescription = null
            )
        }
    }
}

/**
 * A container that displays a scrollbar alongside its content.
 *
 * This composable arranges a scrollbar and its associated content within a layout. The scrollbar's
 * position is automatically calculated to be adjacent to the content, either vertically or
 * horizontally, depending on the `isVertical` parameter.
 *
 * @param adapter The [ScrollbarAdapter] that provides scroll-related information and control.
 * @param modifier The [Modifier] to be applied to the container.
 * @param isVertical `true` if the scrollbar is vertical, `false` if horizontal.
 * @param scrollbar A composable lambda that defines the appearance and behavior of the scrollbar.
 *   Defaults to a standard [Scrollbar] using the provided adapter.
 * @param content A composable lambda that defines the content to be displayed alongside the
 *   scrollbar.
 */
@Composable
fun ScrollbarContainer(
    adapter: ScrollbarAdapter,
    modifier: Modifier = Modifier,
    isVertical: Boolean = true,
    scrollbar: @Composable () -> Unit = { Scrollbar(isVertical, adapter) },
    content: @Composable () -> Unit
) {
    ScrollbarContainer(
        modifier = modifier,
        isVertical = isVertical,
        scrollbar = scrollbar,
        content = content
    )
}

/**
 * A composable that arranges a scrollbar and its content side by side.
 *
 * This function uses a custom [Layout] to position the scrollbar and content.
 * It allows you to provide a custom [scrollbar] composable and [content] composable.
 * The scrollbar is positioned on the right side if [isVertical] is true, or on the bottom side if false.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param isVertical Determines if the scrollbar is vertical (true) or horizontal (false). Defaults to true.
 * @param scrollbar The composable to be used as the scrollbar.
 * @param content The composable to be used as the scrollable content.
 */
@Composable
fun ScrollbarContainer(
    modifier: Modifier = Modifier,
    isVertical: Boolean = true,
    scrollbar: @Composable () -> Unit,
    content: @Composable () -> Unit
) {
    Layout(
        modifier = modifier,
        content = {
            Box(Modifier.layoutId("scrollbar")) { scrollbar() }
            Box(Modifier.layoutId("content")) { content() }
        }
    ) { measurables, constraints ->
        val contentMeasurable =
            measurables.fastFirstOrNull { it.layoutId == "content" }
                ?: return@Layout layout(0, 0) {}
        val contentPlaceable =
            contentMeasurable.measure(constraints.copy(minWidth = 0, minHeight = 0))
        val scrollbarMeasurable =
            measurables.fastFirstOrNull { it.layoutId == "scrollbar" } ?: return@Layout layout(
                contentPlaceable.width,
                contentPlaceable.height
            ) { contentPlaceable.place(0, 0) }
        val scrollbarPlaceable = scrollbarMeasurable.measure(
            if (isVertical) {
                Constraints.fixedHeight(contentPlaceable.height)
            } else {
                Constraints.fixedWidth(contentPlaceable.width)
            }
        )
        layout(contentPlaceable.width, contentPlaceable.height) {
            contentPlaceable.place(0, 0)
            if (isVertical) {
                scrollbarPlaceable.place(contentPlaceable.width - scrollbarPlaceable.width, 0)
            } else {
                scrollbarPlaceable.place(0, contentPlaceable.height - scrollbarPlaceable.height)
            }
        }
    }
}
