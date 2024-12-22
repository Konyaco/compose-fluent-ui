package com.konyaco.fluent.component

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.CaretDown
import com.konyaco.fluent.icons.filled.CaretLeft
import com.konyaco.fluent.icons.filled.CaretRight
import com.konyaco.fluent.icons.filled.CaretUp
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualState
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlinx.coroutines.launch
import kotlin.math.abs

@Composable
fun HorizontalPipsPager(
    state: PagerState,
    modifier: Modifier = Modifier,
    scrollAnimationSpec: AnimationSpec<Float> = FlipViewDefaults.scrollAnimationSpec(),
    visibleCount: Int = 5,
    enabled: Boolean = true,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy = PageButtonVisibleStrategy.Never,
    pipsColors: VisualStateScheme<Color> = PipsPagerDefaults.pipsColors(),
) {
    val scope = rememberCoroutineScope()
    PipsPager(
        selectedIndex = state.currentPage,
        onSelectedIndexChange = {
            scope.launch {
                if (abs(state.currentPage - it) == 1) {
                    state.animateScrollToPage(it, animationSpec = scrollAnimationSpec)
                } else {
                    state.scrollToPage(it)
                }
            }
        },
        count = state.pageCount,
        isVertical = false,
        pipsColors = pipsColors,
        visibleCount = visibleCount,
        pageButtonVisibleStrategy = pageButtonVisibleStrategy,
        enabled = enabled,
        modifier = modifier
    )
}

@Composable
fun VerticalPipsPager(
    state: PagerState,
    modifier: Modifier = Modifier,
    scrollAnimationSpec: AnimationSpec<Float> = FlipViewDefaults.scrollAnimationSpec(),
    visibleCount: Int = 5,
    enabled: Boolean = true,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy = PageButtonVisibleStrategy.Never,
    pipsColors: VisualStateScheme<Color> = PipsPagerDefaults.pipsColors(),
) {
    val scope = rememberCoroutineScope()
    PipsPager(
        selectedIndex = state.currentPage,
        onSelectedIndexChange = {
            scope.launch {
                if (abs(state.currentPage - it) == 1) {
                    state.animateScrollToPage(it, animationSpec = scrollAnimationSpec)
                } else {
                    state.scrollToPage(it)
                }
            }
        },
        count = state.pageCount,
        isVertical = true,
        pipsColors = pipsColors,
        visibleCount = visibleCount,
        pageButtonVisibleStrategy = pageButtonVisibleStrategy,
        enabled = enabled,
        modifier = modifier
    )
}

@Composable
fun HorizontalPipsPager(
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    count: Int,
    modifier: Modifier = Modifier,
    visibleCount: Int = 5,
    enabled: Boolean = true,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy = PageButtonVisibleStrategy.Never,
    pipsColors: VisualStateScheme<Color> = PipsPagerDefaults.pipsColors(),
) {
    PipsPager(
        selectedIndex = selectedIndex,
        onSelectedIndexChange = onSelectedIndexChange,
        count = count,
        isVertical = false,
        pipsColors = pipsColors,
        visibleCount = visibleCount,
        pageButtonVisibleStrategy = pageButtonVisibleStrategy,
        enabled = enabled,
        modifier = modifier
    )
}

@Composable
fun VerticalPipsPager(
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    count: Int,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy = PageButtonVisibleStrategy.Never,
    visibleCount: Int = 5,
    pipsColors: VisualStateScheme<Color> = PipsPagerDefaults.pipsColors(),
) {
    PipsPager(
        selectedIndex = selectedIndex,
        onSelectedIndexChange = onSelectedIndexChange,
        count = count,
        isVertical = true,
        pipsColors = pipsColors,
        visibleCount = visibleCount,
        pageButtonVisibleStrategy = pageButtonVisibleStrategy,
        enabled = enabled,
        modifier = modifier
    )
}

@Composable
private fun PipsPager(
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    count: Int,
    isVertical: Boolean,
    pipsColors: VisualStateScheme<Color>,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy,
    enabled: Boolean,
    visibleCount: Int,
    modifier: Modifier,
) {
    val size = PipsItemWidth * minOf(visibleCount, count)
    val listState = rememberLazyListState()
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered = interactionSource.collectIsHoveredAsState()
    val pageButtonVisible = when (pageButtonVisibleStrategy) {
        PageButtonVisibleStrategy.Always -> true
        PageButtonVisibleStrategy.VisibleOnHovered -> isHovered.value
        PageButtonVisibleStrategy.Never -> false
    }
    if (isVertical) {
        Column(modifier = modifier.width(PipsPagerContainerHeight).hoverable(interactionSource)) {

            PageButton(
                colors = pipsColors,
                vector = Icons.Filled.CaretUp,
                glyph = '\uEDDB',
                onClick = { onSelectedIndexChange(selectedIndex - 1) },
                enabled = enabled && selectedIndex > 0,
                visible = pageButtonVisible,
                modifier = Modifier.hoverable(interactionSource)
            )
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(size)
            ) {
                items(count) { index ->
                    Pips(
                        selected = index == selectedIndex,
                        onSelectedChange = { onSelectedIndexChange(index) },
                        isVertical = isVertical,
                        colors = pipsColors,
                        enabled = enabled,
                        modifier = Modifier
                    )
                }
            }
            PageButton(
                colors = pipsColors,
                vector = Icons.Filled.CaretDown,
                glyph = '\uEDDC',
                onClick = { onSelectedIndexChange(selectedIndex + 1) },
                enabled = enabled && selectedIndex < count - 1,
                visible = pageButtonVisible,
                modifier = Modifier
            )
        }
    } else {
        Row(modifier = modifier.height(PipsPagerContainerHeight).hoverable(interactionSource)) {

            PageButton(
                colors = pipsColors,
                vector = Icons.Filled.CaretLeft,
                glyph = '\uEDD9',
                onClick = { onSelectedIndexChange(selectedIndex - 1) },
                enabled = enabled && selectedIndex > 0,
                visible = pageButtonVisible,
                modifier = Modifier.hoverable(interactionSource)
            )

            LazyRow(
                state = listState,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(size)
            ) {
                items(count) { index ->
                    Pips(
                        selected = index == selectedIndex,
                        onSelectedChange = { onSelectedIndexChange(index) },
                        isVertical = isVertical,
                        colors = pipsColors,
                        enabled = enabled,
                        modifier = Modifier
                    )
                }
            }

            PageButton(
                colors = pipsColors,
                vector = Icons.Filled.CaretRight,
                glyph = '\uEDDA',
                onClick = { onSelectedIndexChange(selectedIndex + 1) },
                enabled = enabled && selectedIndex < count - 1,
                visible = pageButtonVisible,
                modifier = Modifier.hoverable(interactionSource)
            )
        }
    }
    LaunchedEffect(selectedIndex, listState.layoutInfo.visibleItemsInfo) {
        val item = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == selectedIndex }
        if (item == null) {
            listState.animateScrollToItem(selectedIndex)
        } else {
            val itemSize = item.size
            val viewportSize = if (isVertical) {
                listState.layoutInfo.viewportSize.height
            } else {
                listState.layoutInfo.viewportSize.width
            }
            val centerOffset = (viewportSize - itemSize) / 2f
            val scrollOffset = item.offset - centerOffset
            listState.animateScrollBy(
                scrollOffset,
                animationSpec = FlipViewDefaults.scrollAnimationSpec()
            )
        }
    }
}

typealias PipsColorScheme = PentaVisualScheme<Color>

object PipsPagerDefaults {

    @Stable
    @Composable
    fun pipsColors(
        default: Color = FluentTheme.colors.controlStrong.default,
        hovered: Color = FluentTheme.colors.text.text.secondary,
        pressed: Color = FluentTheme.colors.text.text.secondary,
        disabled: Color = FluentTheme.colors.controlStrong.disabled
    ) = PipsColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun Pips(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    isVertical: Boolean,
    colors: VisualStateScheme<Color>,
    enabled: Boolean,
    modifier: Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val bringIntoViewRequester = remember { BringIntoViewRequester() }
    val visualState = interactionSource.collectVisualState(!enabled)
    val currentColor = colors.schemeFor(visualState)
    val size = animateDpAsState(
        targetValue = when (visualState) {
            VisualState.Hovered -> 5.dp
            VisualState.Pressed -> 3.dp
            else -> 4.dp
        } + if (selected) {
            2.dp
        } else {
            0.dp
        }
    )
    LaunchedEffect(selected) {
        if (selected) {
            bringIntoViewRequester.bringIntoView()
        }
    }
    Box(
        modifier = modifier
            .then(
                if (isVertical) {
                    Modifier.fillMaxWidth()
                        .height(PipsItemWidth)
                } else {
                    Modifier.fillMaxHeight()
                        .width(PipsItemWidth)
                }
            )
            .bringIntoViewRequester(bringIntoViewRequester)
            .selectable(
                selected = selected,
                indication = null,
                interactionSource = interactionSource,
                enabled = enabled,
                onClick = { onSelectedChange(!selected) }
            )
            .wrapContentSize(Alignment.Center)
            .size(size.value)
            .background(currentColor, shape = CircleShape)
    )
}

enum class PageButtonVisibleStrategy {
    Always,
    VisibleOnHovered,
    Never
}

@OptIn(ExperimentalFluentApi::class)
@Composable
private fun PageButton(
    colors: VisualStateScheme<Color>,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    visible: Boolean = true,
    onClick: () -> Unit,
    glyph: Char = '\uEDDA',
    vector: ImageVector = Icons.Filled.CaretRight,
) {
    if (visible) {
        val interactionSource = remember { MutableInteractionSource() }
        val currentColor = colors.schemeFor(interactionSource.collectVisualState(!enabled))
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .size(PipsPagerContainerHeight)
                .clickable(
                    indication = null,
                    interactionSource = interactionSource,
                    onClick = onClick,
                    enabled = enabled
                )
        ) {
            CompositionLocalProvider(
                LocalContentColor provides currentColor,
                LocalContentAlpha provides currentColor.alpha,
                LocalTextStyle provides LocalTextStyle.current.copy(color = currentColor)
            ) {
                val isPressed = interactionSource.collectIsPressedAsState()
                val scale = animateFloatAsState(
                    targetValue = if (isPressed.value) {
                        7 / 8f
                    } else 1f,
                    animationSpec = tween(
                        FluentDuration.ShortDuration,
                        easing = FluentEasing.FastInvokeEasing
                    )
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
    } else {
        Box(modifier = modifier.size(PipsPagerContainerHeight))
    }
}

private val PipsPagerContainerHeight = 20.dp
private val PipsItemWidth = 12.dp