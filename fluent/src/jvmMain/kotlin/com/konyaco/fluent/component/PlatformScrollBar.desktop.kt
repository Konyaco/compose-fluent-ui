package com.konyaco.fluent.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.TextFieldScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

actual typealias ScrollbarAdapter = androidx.compose.foundation.v2.ScrollbarAdapter

@Composable
internal actual fun PlatformScrollBar(
    isVertical: Boolean,
    adapter: ScrollbarAdapter,
    modifier: Modifier,
    reverseLayout: Boolean,
    colors: ScrollbarColors
) {
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val containerInteraction = remember {
        MutableInteractionSource()
    }
    val hovered by containerInteraction.collectIsHoveredAsState()
    var delayedHovered by remember(containerInteraction) {
        mutableStateOf(false)
    }
    LaunchedEffect(hovered) {
        delay(ScrollbarDefaults.hoverDurationMillis.toLong())
        delayedHovered = hovered
    }
    val pressed by interactionSource.collectIsPressedAsState()
    val focused by interactionSource.collectIsFocusedAsState()
    val dragged by interactionSource.collectIsDraggedAsState()
    val isThicknessHighLight by remember {
        derivedStateOf {
            (delayedHovered || pressed || focused || dragged) && adapter.contentSize > adapter.viewportSize
        }
    }

    val animationFraction by animateFloatAsState(
        targetValue = if (isThicknessHighLight) {
            1f
        } else {
            0f
        },
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )
    val thickness = androidx.compose.ui.unit.lerp(
        ScrollbarDefaults.thickness,
        ScrollbarDefaults.thicknessHighlight,
        animationFraction
    )

    val style = ScrollbarStyle(
        thickness = thickness,
        unhoverColor = colors.contentColor,
        hoverColor = if (pressed || dragged || focused) {
            colors.contentColorPressed
        } else {
            colors.contentColorHovered
        },
        hoverDurationMillis = FluentDuration.ShortDuration,
        shape = ScrollbarDefaults.shape,
        minimalHeight = 16.dp
    )

    val scrollScope = rememberCoroutineScope()
    val scrollbarScrollState = rememberScrollableState {
        scrollScope.launch {
            adapter.scrollTo(adapter.scrollOffset - it)
        }
        it
    }
    val trackColor = colors.backgroundColor.copy(animationFraction)
    if (isVertical) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.hoverable(containerInteraction)
                .width(12.dp)
                .background(
                    color = trackColor,
                    shape = CircleShape
                )
                .scrollable(
                    state = scrollbarScrollState,
                    orientation = Orientation.Vertical,
                    reverseDirection = reverseLayout
                )
        ) {
            Spacer(Modifier.height(2.dp))
            ScrollbarIndicator(
                adapter = adapter,
                isVertical = true,
                visible = isThicknessHighLight,
                forward = true
            )
            // TODO: Use Acrylic as scrollbar's track 
            VerticalScrollbar(
                adapter = adapter,
                modifier = modifier.width(ScrollbarDefaults.thicknessHighlight)
                    .wrapContentWidth(Alignment.End)
                    .weight(1f),
                style = style,
                reverseLayout = reverseLayout,
                interactionSource = interactionSource
            )
            ScrollbarIndicator(
                adapter = adapter,
                isVertical = true,
                visible = isThicknessHighLight
            )
            Spacer(Modifier.height(2.dp))
        }
    } else {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.hoverable(containerInteraction)
                .height(12.dp)
                .background(
                    color = trackColor,
                    shape = CircleShape
                )
                .scrollable(
                    state = scrollbarScrollState,
                    orientation = Orientation.Horizontal,
                    reverseDirection = reverseLayout
                )
        ) {
            Spacer(Modifier.width(2.dp))
            ScrollbarIndicator(
                adapter = adapter,
                isVertical = false,
                visible = isThicknessHighLight,
                forward = true
            )
            HorizontalScrollbar(
                adapter = adapter,
                modifier = modifier.height(ScrollbarDefaults.thicknessHighlight)
                    .wrapContentHeight(Alignment.Bottom)
                    .weight(1f),
                style = style,
                reverseLayout = reverseLayout,
                interactionSource = interactionSource
            )
            ScrollbarIndicator(
                adapter = adapter,
                isVertical = false,
                visible = isThicknessHighLight
            )
            Spacer(Modifier.width(2.dp))
        }
    }
}

@Composable
actual fun rememberScrollbarAdapter(
    state: ScrollState
): ScrollbarAdapter {
    return androidx.compose.foundation.rememberScrollbarAdapter(state)
}

//TODO move to CommonMain
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun rememberScrollbarAdapter(
    state: TextFieldScrollState
): ScrollbarAdapter {
    return androidx.compose.foundation.rememberScrollbarAdapter(state)
}

@Composable
actual fun rememberScrollbarAdapter(
    state: LazyListState
): ScrollbarAdapter {
    return androidx.compose.foundation.rememberScrollbarAdapter(state)
}

@Composable
actual fun rememberScrollbarAdapter(
    state: LazyGridState
): ScrollbarAdapter {
    return androidx.compose.foundation.rememberScrollbarAdapter(state)
}