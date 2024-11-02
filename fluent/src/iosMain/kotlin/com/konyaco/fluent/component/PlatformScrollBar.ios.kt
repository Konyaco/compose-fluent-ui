package com.konyaco.fluent.component

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

actual interface ScrollbarAdapter {
    /**
     * Scroll offset of the content inside the scrollable component.
     *
     * For example, a value of `100` could mean the content is scrolled by 100 pixels from the
     * start.
     */
    actual val scrollOffset: Double

    /**
     * The size of the scrollable content, on the scrollable axis.
     */
    actual val contentSize: Double

    /**
     * The size of the viewport, on the scrollable axis.
     */
    actual val viewportSize: Double

    /**
     * Instantly jump to [scrollOffset].
     *
     * @param scrollOffset target offset to jump to, value will be coerced to the valid
     * scroll range.
     */
    actual suspend fun scrollTo(scrollOffset: Double)

}
@Composable
internal actual fun PlatformScrollBar(
    isVertical: Boolean,
    adapter: ScrollbarAdapter,
    modifier: Modifier,
    reverseLayout: Boolean,
    colors: ScrollbarColors
) {
    //TODO Scrollbar browser implementation
}

@Composable
actual fun rememberScrollbarAdapter(
    state: ScrollState
): ScrollbarAdapter {
    return EmptyScrollbarAdapter
}

@Composable
actual fun rememberScrollbarAdapter(
    state: LazyListState
): ScrollbarAdapter {
    return EmptyScrollbarAdapter
}

@Composable
actual fun rememberScrollbarAdapter(
    state: LazyGridState
): ScrollbarAdapter {
    return EmptyScrollbarAdapter
}

private object EmptyScrollbarAdapter: ScrollbarAdapter {
    override val contentSize: Double
        get() = 0.0

    override val scrollOffset: Double
        get() = 0.0

    override val viewportSize: Double
        get() = 0.0

    override suspend fun scrollTo(scrollOffset: Double) {

    }
}