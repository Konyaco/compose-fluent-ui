package com.konyaco.fluent.component

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BasicTooltipBox
import androidx.compose.foundation.BasicTooltipDefaults
import androidx.compose.foundation.BasicTooltipState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.PointerType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.plus
import androidx.compose.ui.window.PopupPositionProvider
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.ElevationDefaults
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalFluentApi
@Composable
fun TooltipBox(
    tooltip: @Composable () -> Unit,
    state: TooltipState = rememberTooltipState(),
    modifier: Modifier = Modifier,
    positionProvider: PopupPositionProvider = rememberTooltipPositionProvider(state),
    enabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    FlyoutAnchorScope {
        BasicTooltipBox(
            state = state,
            positionProvider = positionProvider,
            enableUserInput = false,
            tooltip = {
                TooltipBoxDefaults.Tooltip(
                    visible = state.isVisible,
                    content = tooltip,
                    modifier = Modifier.flyoutSize()
                )
            },
            modifier = modifier
        ) {
            Box(
                modifier = Modifier
                    .flyoutAnchor()
                    .gestureHandle(enabled, state)
            ) {
                content()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalFluentApi
@Composable
fun rememberTooltipState(
    initialIsVisible: Boolean = false,
    isPersistent: Boolean = true,
    mutatorMutex: MutatorMutex = BasicTooltipDefaults.GlobalMutatorMutex,
): TooltipState {
    return remember(initialIsVisible, isPersistent, mutatorMutex) {
        TooltipState(initialIsVisible, isPersistent, mutatorMutex)
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun Modifier.gestureHandle(
    enabled: Boolean,
    state: TooltipState
): Modifier {
    return if (enabled) {

        then(Modifier.pointerInput(state) {
            coroutineScope {
                awaitEachGesture {
                    val longPressTimeout = viewConfiguration.longPressTimeoutMillis
                    val pass = PointerEventPass.Initial
                    val change = awaitFirstDown(pass = pass)
                    val inputType = change.type
                    if (inputType == PointerType.Touch || inputType == PointerType.Stylus) {
                        try {
                            withTimeout(longPressTimeout) {
                                waitForUpOrCancellation(pass)
                            }
                        } catch (_: PointerEventTimeoutCancellationException) {
                            state.pointerPosition = change.position - if (inputType == PointerType.Touch) {
                                viewConfiguration.minimumTouchTargetSize.toSize().center
                            } else {
                                Offset.Zero
                            }
                            state.pointerType = inputType
                            launch {
                                state.show(MutatePriority.UserInput)
                            }
                            val changes = awaitPointerEvent(pass).changes
                            for (i in 0 until changes.size) { changes[i].consume() }
                        }
                    }
                }
            }
        }.pointerInput(state) {
            coroutineScope {
                var hoveredJob: Job? = null
                awaitEachGesture {
                    val event = awaitPointerEvent(PointerEventPass.Main)
                    val longPressTimeout = viewConfiguration.longPressTimeoutMillis
                    val change = event.changes[0]
                    if (change.type != PointerType.Mouse) return@awaitEachGesture
                    if (event.type == PointerEventType.Enter) {
                        hoveredJob?.cancel()
                        hoveredJob = launch {
                            delay(longPressTimeout)
                            state.show(mutatePriority = MutatePriority.UserInput)
                        }
                    }
                    if (!state.isVisible && event.type != PointerEventType.Exit) {
                        state.pointerType = change.type
                        state.pointerPosition = change.position
                    } else if (event.type == PointerEventType.Exit) {
                        state.pointerPosition = null
                        state.pointerType = null
                        hoveredJob?.cancel()
                        state.dismiss()
                    }
                }
            }

        })
    } else {
        this
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun rememberTooltipPositionProvider(
    state: TooltipState,
    anchorPadding: Dp = 0.dp
): PopupPositionProvider {
    val anchorPadding = with(LocalDensity.current) { (anchorPadding + flyoutPopPaddingFixShadowRender + flyoutDefaultPadding).toPx().roundToInt() }
    val mouseOverflowPadding =
        with(LocalDensity.current) { defaultMousePadding.toPx().roundToInt() }
    return remember(state, anchorPadding, mouseOverflowPadding) {
        TooltipPopupPositionProvider(state, anchorPadding, mouseOverflowPadding)
    }
}

@Stable
@ExperimentalFoundationApi
class TooltipState(
    initialIsVisible: Boolean = false,
    isPersistent: Boolean = true,
    mutatorMutex: MutatorMutex = BasicTooltipDefaults.GlobalMutatorMutex,
) : BasicTooltipState by BasicTooltipState(
    initialIsVisible = initialIsVisible,
    isPersistent = isPersistent,
    mutatorMutex = mutatorMutex
) {
    var pointerPosition: Offset? by mutableStateOf(null)
        internal set
    var pointerType: PointerType? by mutableStateOf(null)
        internal set
}

@ExperimentalFluentApi
object TooltipBoxDefaults {

    val iconSpacing = 8.dp

    @Composable
    fun Tooltip(
        visible: Boolean,
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit,
    ) {
        val visibleState = remember {
            MutableTransitionState(false)
        }
        visibleState.targetState = visible
        Tooltip(
            visibleState = visibleState,
            content = content,
            modifier = modifier
        )
    }

    @Composable
    fun Tooltip(
        visibleState: MutableTransitionState<Boolean>,
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit,
    ) {

        AcrylicPopupContent(
            elevation = ElevationDefaults.tooltip,
            visibleState = visibleState,
            enterTransition = fadeIn(
                tween(
                    FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing
                )
            ),
            exitTransition = fadeOut(
                tween(
                    FluentDuration.QuickDuration,
                    easing = FluentEasing.FastDismissEasing
                )
            ),
            shape = FluentTheme.shapes.control,
            contentPadding = PaddingValues(
                start = 8.dp,
                end = 8.dp,
                top = 6.dp,
                bottom = 8.dp
            ),
            content = {
                ProvideTextStyle(
                    value = FluentTheme.typography.caption,
                    content = content
                )
            },
            modifier = modifier
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
internal class TooltipPopupPositionProvider(
    private val state: TooltipState,
    private val anchorPadding: Int,
    private val mouseOverflowPadding: Int,
) : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        return Snapshot.withoutReadObservation {
            val pointerPosition = state.pointerPosition
            val alignmentPosition = pointerPosition ?: Offset(
                x = anchorBounds.width / 2f,
                y = 0f
            )
            var (offsetX, offsetY) = alignmentPosition + IntOffset(
                x = anchorBounds.left - popupContentSize.width / 2,
                y = anchorBounds.top - anchorPadding - popupContentSize.height
            )
            val topOverflow = -offsetY

            if (topOverflow > 0) {

                if (pointerPosition != null) {
                    // Fixed pointer overflow dismiss
                    offsetY = pointerPosition.y + anchorPadding + mouseOverflowPadding
                } else {
                    offsetY -= topOverflow
                }
            }

            val rightOverflow = offsetX + popupContentSize.width - windowSize.width
            if (rightOverflow > 0) {
                offsetX -= rightOverflow
            }

            offsetX = offsetX.coerceAtLeast(0f)
            offsetY = offsetY.coerceAtLeast(0f)

            return IntOffset(offsetX.roundToInt(), offsetY.roundToInt())
        }
    }
}

private val defaultMousePadding = 24.dp