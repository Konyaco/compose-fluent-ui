package com.konyaco.fluent.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.TargetedFlingBehavior
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Material
import com.konyaco.fluent.background.MaterialContainer
import com.konyaco.fluent.background.MaterialContainerScope
import com.konyaco.fluent.background.MaterialDefaults
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.CaretDown
import com.konyaco.fluent.icons.filled.CaretLeft
import com.konyaco.fluent.icons.filled.CaretRight
import com.konyaco.fluent.icons.filled.CaretUp
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlinx.coroutines.launch

@OptIn(ExperimentalFluentApi::class)
@Composable
fun HorizontalFlipView(
    state: PagerState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    pageButtonColors: VisualStateScheme<PageButtonColor> = FlipViewDefaults.pageButtonColors(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    pageSize: PageSize = PageSize.Fill,
    beyondViewportPageCount: Int = PagerDefaults.BeyondViewportPageCount,
    pageSpacing: Dp = 0.dp,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    flingBehavior: TargetedFlingBehavior = PagerDefaults.flingBehavior(state = state),
    userScrollEnabled: Boolean = true,
    reverseLayout: Boolean = false,
    key: ((index: Int) -> Any)? = null,
    pageNestedScrollConnection: NestedScrollConnection = PagerDefaults.pageNestedScrollConnection(
        state,
        Orientation.Horizontal
    ),
    snapPosition: SnapPosition = SnapPosition.Start,
    pageContent: @Composable PagerScope.(index: Int) -> Unit
) {
    val scope = rememberCoroutineScope()
    HorizontalFlipViewContainer(
        nextPageVisible = remember(state) { derivedStateOf { state.currentPage < state.pageCount - 1 } }.value,
        previousPageVisible = remember(state) { derivedStateOf { state.currentPage > 0 } }.value,
        onNextPageClick = {
            scope.launch {
                state.animateScrollToPage(
                    page = state.currentPage + 1,
                    animationSpec = FlipViewDefaults.scrollAnimationSpec()
                )
            }
        },
        onPreviousPageClick = {
            scope.launch {
                state.animateScrollToPage(
                    page = state.currentPage - 1,
                    animationSpec = FlipViewDefaults.scrollAnimationSpec()
                )
            }
        },
        modifier = modifier,
        enabled = enabled,
        pageButtonColors = pageButtonColors
    ) {
        HorizontalPager(
            state = state,
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding,
            pageSize = pageSize,
            beyondViewportPageCount = beyondViewportPageCount,
            pageSpacing = pageSpacing,
            verticalAlignment = verticalAlignment,
            flingBehavior = flingBehavior,
            userScrollEnabled = userScrollEnabled,
            reverseLayout = reverseLayout,
            key = key,
            pageNestedScrollConnection = pageNestedScrollConnection,
            snapPosition = snapPosition,
            pageContent = pageContent
        )
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
fun VerticalFlipView(
    state: PagerState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    pageButtonColors: VisualStateScheme<PageButtonColor> = FlipViewDefaults.pageButtonColors(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    pageSize: PageSize = PageSize.Fill,
    beyondViewportPageCount: Int = PagerDefaults.BeyondViewportPageCount,
    pageSpacing: Dp = FlipViewDefaults.verticalPageSpacing,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    flingBehavior: TargetedFlingBehavior = PagerDefaults.flingBehavior(state = state),
    userScrollEnabled: Boolean = true,
    reverseLayout: Boolean = false,
    key: ((index: Int) -> Any)? = null,
    pageNestedScrollConnection: NestedScrollConnection = PagerDefaults.pageNestedScrollConnection(
        state,
        Orientation.Horizontal
    ),
    snapPosition: SnapPosition = SnapPosition.Start,
    pageContent: @Composable PagerScope.(index: Int) -> Unit
) {
    val scope = rememberCoroutineScope()
    VerticalFlipViewContainer(
        nextPageVisible = remember(state) { derivedStateOf { state.currentPage < state.pageCount - 1 } }.value,
        previousPageVisible = remember(state) { derivedStateOf { state.currentPage > 0 } }.value,
        onNextPageClick = {
            scope.launch {
                state.animateScrollToPage(
                    page = state.currentPage + 1,
                    animationSpec = FlipViewDefaults.scrollAnimationSpec()
                )
            }
        },
        onPreviousPageClick = {
            scope.launch {
                state.animateScrollToPage(
                    page = state.currentPage - 1,
                    animationSpec = FlipViewDefaults.scrollAnimationSpec()
                )
            }
        },
        modifier = modifier,
        enabled = enabled,
        pageButtonColors = pageButtonColors
    ) {
        VerticalPager(
            state = state,
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding,
            pageSize = pageSize,
            beyondViewportPageCount = beyondViewportPageCount,
            pageSpacing = pageSpacing,
            horizontalAlignment = horizontalAlignment,
            flingBehavior = flingBehavior,
            userScrollEnabled = userScrollEnabled,
            reverseLayout = reverseLayout,
            key = key,
            pageNestedScrollConnection = pageNestedScrollConnection,
            snapPosition = snapPosition,
            pageContent = pageContent
        )
    }
}

@ExperimentalFluentApi
@Composable
fun VerticalFlipViewContainer(
    onNextPageClick: () -> Unit,
    onPreviousPageClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    nextPageVisible: Boolean = true,
    previousPageVisible: Boolean = true,
    pageButtonColors: VisualStateScheme<PageButtonColor> = FlipViewDefaults.pageButtonColors(),
    content: @Composable () -> Unit
) {
    FlipViewContainer(
        onNextPageClick = onNextPageClick,
        onPreviousPageClick = onPreviousPageClick,
        modifier = modifier,
        isVertical = true,
        enabled = enabled,
        nextPageVisible = nextPageVisible,
        previousPageVisible = previousPageVisible,
        pageButtonColors = pageButtonColors,
        content = content
    )
}

@ExperimentalFluentApi
@Composable
fun HorizontalFlipViewContainer(
    onNextPageClick: () -> Unit,
    onPreviousPageClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    nextPageVisible: Boolean = true,
    previousPageVisible: Boolean = true,
    pageButtonColors: VisualStateScheme<PageButtonColor> = FlipViewDefaults.pageButtonColors(),
    content: @Composable () -> Unit
) {
    FlipViewContainer(
        onNextPageClick = onNextPageClick,
        onPreviousPageClick = onPreviousPageClick,
        modifier = modifier,
        isVertical = false,
        enabled = enabled,
        pageButtonColors = pageButtonColors,
        nextPageVisible = nextPageVisible,
        previousPageVisible = previousPageVisible,
        content = content
    )
}

@ExperimentalFluentApi
@Composable
private fun FlipViewContainer(
    onNextPageClick: () -> Unit,
    onPreviousPageClick: () -> Unit,
    nextPageVisible: Boolean,
    previousPageVisible: Boolean,
    modifier: Modifier,
    isVertical: Boolean,
    enabled: Boolean,
    pageButtonColors: VisualStateScheme<PageButtonColor>,
    content: @Composable () -> Unit
) {
    MaterialContainer(modifier = modifier.clip(FluentTheme.shapes.overlay)) {
        val interactionSource = remember { MutableInteractionSource() }
        val isHovered = interactionSource.collectIsHoveredAsState()
        Box(
            propagateMinConstraints = true,
            modifier = Modifier.behindMaterial()
                .hoverable(interactionSource, enabled = enabled)
        ) {
            content()
        }
        if (isVertical) {
            PageButton(
                colors = pageButtonColors,
                isVertical = true,
                vector = Icons.Filled.CaretDown,
                glyph = '\uEDDC',
                onClick = onNextPageClick,
                visible = nextPageVisible && isHovered.value,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 1.dp)
                    .hoverable(interactionSource),
            )
            PageButton(
                colors = pageButtonColors,
                isVertical = true,
                vector = Icons.Filled.CaretUp,
                glyph = '\uEDDB',
                onClick = onPreviousPageClick,
                visible = previousPageVisible && isHovered.value,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 1.dp)
                    .hoverable(interactionSource),
            )
        } else {
            PageButton(
                colors = pageButtonColors,
                isVertical = false,
                vector = Icons.Filled.CaretRight,
                glyph = '\uEDDA',
                onClick = onNextPageClick,
                visible = nextPageVisible && isHovered.value,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 1.dp)
                    .hoverable(interactionSource),
            )

            PageButton(
                colors = pageButtonColors,
                isVertical = false,
                vector = Icons.Filled.CaretLeft,
                glyph = '\uEDD9',
                onClick = onPreviousPageClick,
                visible = previousPageVisible && isHovered.value,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 1.dp)
                    .hoverable(interactionSource),
            )
        }
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
private fun MaterialContainerScope.PageButton(
    colors: VisualStateScheme<PageButtonColor>,
    modifier: Modifier = Modifier,
    isVertical: Boolean,
    visible: Boolean,
    onClick: () -> Unit,
    glyph: Char = '\uEDDA',
    vector: ImageVector = Icons.Filled.CaretRight,
) {
    if (visible) {
        val interactionSource = remember { MutableInteractionSource() }
        val currentColor = colors.schemeFor(interactionSource.collectVisualState(false))
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .clip(FluentTheme.shapes.control)
                .materialOverlay(currentColor.background)
                .size(if (isVertical) VerticalButtonSize else HorizontalButtonSize)
                .clickable(
                    indication = null,
                    interactionSource = interactionSource,
                    onClick = onClick
                )
        ) {
            CompositionLocalProvider(
                LocalContentColor provides currentColor.contentColor,
                LocalContentAlpha provides currentColor.contentColor.alpha,
                LocalTextStyle provides LocalTextStyle.current.copy(color = currentColor.contentColor)
            ) {
                val isPressed = interactionSource.collectIsPressedAsState()
                val scale = animateFloatAsState(
                    targetValue = if (isPressed.value) { 7/8f } else 1f,
                    animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                )
                FontIcon(
                    glyph = glyph,
                    vector = vector,
                    contentDescription = null,
                    iconSize = 8.sp,
                    vectorSize = 14.dp,
                    modifier = Modifier
                        .graphicsLayer {
                            scaleX = scale.value
                            scaleY = scale.value
                            transformOrigin = TransformOrigin(0.5f, 0.5f)
                        }
                )
            }
        }
    }
}

data class PageButtonColor(
    val background: Material,
    val contentColor: Color
)

object FlipViewDefaults {

    val verticalPageSpacing = 4.dp

    @Composable
    @Stable
    fun pageButtonColors(
        default: PageButtonColor = PageButtonColor(
            background = MaterialDefaults.acrylicDefault(),
            contentColor = FluentTheme.colors.controlStrong.default
        ),
        hovered: PageButtonColor = PageButtonColor(
            background = MaterialDefaults.acrylicDefault(),
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        pressed: PageButtonColor = hovered,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = default
    )

    fun scrollAnimationSpec() =
        tween<Float>(FluentDuration.LongDuration, easing = FluentEasing.FastInvokeEasing)
}

private val VerticalButtonSize = DpSize(38.dp, 16.dp)
private val HorizontalButtonSize = DpSize(16.dp, 38.dp)