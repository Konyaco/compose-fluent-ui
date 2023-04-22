package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.text.TextFieldScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
    val pressed by interactionSource.collectIsPressedAsState()
    val focused by interactionSource.collectIsFocusedAsState()
    val dragged by interactionSource.collectIsDraggedAsState()
    val isThicknessHighLight by remember {
        derivedStateOf {
            hovered || pressed || focused || dragged
        }
    }

    val thickness by animateDpAsState(
        if (isThicknessHighLight) {
            ScrollbarDefaults.thicknessHighlight
        } else {
            ScrollbarDefaults.thickness
        }
    )

    val style = ScrollbarStyle(
        thickness = thickness,
        unhoverColor = colors.contentColor,
        hoverColor = if (pressed || dragged || focused) {
            colors.contentColorPressed
        } else {
            colors.contentColorHovered
        },
        hoverDurationMillis = ScrollbarDefaults.hoverDurationMillis,
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
    if (isVertical) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.hoverable(containerInteraction)
                .background(if (isThicknessHighLight) {
                    colors.backgroundColor
                } else {
                    Color.Transparent
                })
                .scrollable(
                    state = scrollbarScrollState,
                    orientation = Orientation.Vertical,
                    reverseDirection = reverseLayout
                )
        ) {
            ScrollbarIndicator(
                adapter = adapter,
                isVertical = true,
                visible = isThicknessHighLight,
                forward = true
            )
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
        }
    } else {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.hoverable(containerInteraction)
                .background(if (isThicknessHighLight) {
                    colors.backgroundColor
                } else {
                    Color.Transparent
                })
                .scrollable(
                    state = scrollbarScrollState,
                    orientation = Orientation.Horizontal,
                    reverseDirection = reverseLayout
                )
        ) {
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