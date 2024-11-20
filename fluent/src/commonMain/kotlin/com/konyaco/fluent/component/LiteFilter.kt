package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.relocation.BringIntoViewResponder
import androidx.compose.foundation.relocation.bringIntoViewResponder
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LiteFilter(
    modifier: Modifier = Modifier,
    state: ScrollState = rememberScrollState(),
    content: @Composable RowScope.() -> Unit
) {
    Box(modifier = modifier.heightIn(40.dp)) {
        val isPreviousVisible = state.canScrollBackward
        val isNextVisible = state.canScrollForward
        val density = LocalDensity.current
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.clip(
                PaddingShape(
                    clipStart = isPreviousVisible,
                    clipEnd = isNextVisible
                )
            )
                .horizontalScroll(state)
                .bringIntoViewResponder(remember(state, density) { LiteFilterBringIntoViewResponder(state, density) })
                .align(Alignment.CenterStart)
        ) {
            content()
        }

        val scope = rememberCoroutineScope()
        AnimatedVisibility(
            visible = isPreviousVisible,
            enter = fadeIn(animationSpec = tween(durationMillis = FluentDuration.ShortDuration)),
            exit = fadeOut(animationSpec = tween(durationMillis = FluentDuration.ShortDuration)),
            modifier = Modifier.padding(start = 2.dp).align(Alignment.CenterStart)
        ) {
            SubtleButton(
                onClick = { scope.launch { state.animateScrollBy(-state.viewportSize / 3f) } },
                content = { FontIconSolid8(type = FontIconPrimitive.CaretLeft, contentDescription = null) },
                iconOnly = true
            )
        }

        AnimatedVisibility(
            visible = isNextVisible,
            enter = fadeIn(animationSpec = tween(durationMillis = FluentDuration.ShortDuration)),
            exit = fadeOut(animationSpec = tween(durationMillis = FluentDuration.ShortDuration)),
            modifier = Modifier.padding(end = 2.dp).align(Alignment.CenterEnd)
        ) {
            SubtleButton(
                onClick = { scope.launch { state.animateScrollBy(state.viewportSize / 3f) } },
                content = { FontIconSolid8(type = FontIconPrimitive.CaretRight, contentDescription = null) },
                iconOnly = true
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private class LiteFilterBringIntoViewResponder(
    private val state: ScrollState,
    density: Density,
): BringIntoViewResponder {
    val startSize = with(density) { 44.dp.toPx() }
    val endSize = startSize

    override suspend fun bringChildIntoView(localRect: () -> Rect?) {}

    override fun calculateRectForParent(localRect: Rect): Rect {
        return Snapshot.withoutReadObservation {
            when {
                state.canScrollForward && state.viewportSize - localRect.right - state.value < endSize -> {
                    return localRect.copy(
                        right = localRect.right + endSize
                    )
                }

                state.canScrollBackward && localRect.left < state.value + startSize -> {
                    return localRect.copy(
                        left = localRect.left - startSize
                    )
                }

                else -> localRect
            }
        }
    }
}

@Stable
private class PaddingShape(
    private val clipStart: Boolean,
    private val clipEnd: Boolean,
    private val startSize: Dp = 44.dp,
    private val endSize: Dp = 44.dp
) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return with(density) {
            Outline.Rectangle(
                Rect(
                    left = if (clipStart) startSize.toPx() else 0f,
                    top = 0f,
                    right = size.width - if (clipEnd) endSize.toPx() else 0f,
                    bottom = size.height
                )
            )
        }
    }
}