package com.konyaco.fluent.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirstOrNull
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import kotlinx.coroutines.launch

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

@Composable
expect fun rememberScrollbarAdapter(
    state: ScrollState
): ScrollbarAdapter

@Composable
expect fun rememberScrollbarAdapter(
    state: LazyListState
): ScrollbarAdapter

@Composable
expect fun rememberScrollbarAdapter(
    state: LazyGridState
): ScrollbarAdapter

@Immutable
data class ScrollbarColors(
    val contentColor: Color,
    val contentColorDisabled: Color,
    val contentColorHovered: Color,
    val contentColorPressed: Color,
    val backgroundColor: Color
)

object ScrollbarDefaults {
    val thicknessHighlight = 6.dp
    val thickness = 2.dp
    const val hoverDurationMillis = 500
    val shape = CircleShape
    const val indicatorPressedScale = 0.875f
    val indicatorScrollOffset = 24.dp

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