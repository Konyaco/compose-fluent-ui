package com.konyaco.fluent.layout.overflow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.layout.LazyLayout
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.referentialEqualityPolicy
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.util.fastForEachIndexed

/**
 * Common row logic for TopNav, BreadcrumbBar, CommandBar, etc.
 */

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun OverflowRow(
    modifier: Modifier = Modifier,
    overflow: OverflowPosition = OverflowPosition.End,
    state: OverflowRowState = rememberOverflowRowState(),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    overflowAction: @Composable OverflowActionScope.() -> Unit = {},
    content: OverflowRowScope.() -> Unit
) {
    val contentState = rememberUpdatedState(content)
    val overflowActionState = rememberUpdatedState(overflowAction)
    val itemProviderState = remember {
        val intervalContentState = derivedStateOf(referentialEqualityPolicy()) {
            OverflowRowIntervalContent(contentState.value)
        }
        val itemProviderState = derivedStateOf(referentialEqualityPolicy()) {
            OverflowRowItemProvider(state, intervalContentState.value)
        }
        derivedStateOf(referentialEqualityPolicy()) {
            val scope = OverflowActionScopeImpl(itemProviderState::value, state)
            intervalContentState.value.item("_overflow_action", "_overflow_action") {
                overflowActionState.value(scope)
            }
        }.value
        itemProviderState::value
    }
    LazyLayout(
        itemProvider = itemProviderState,
        prefetchState = remember { LazyLayoutPrefetchState() },
        measurePolicy = rememberOverflowRowItemMeasurePolicy(
            state,
            itemProviderState,
            overflow,
            horizontalArrangement,
            verticalAlignment
        ),
        modifier = modifier
    )
}

enum class OverflowPosition {
    Start,
    Center,
    End
}

interface OverflowActionScope {

    val overflowItemCount: Int

    fun overflowItemKey(index: Int): Any

    fun overflowItemContentType(index: Int): Any?

    @Composable
    fun overflowItem(index: Int)
}

private class OverflowActionScopeImpl(
    private val itemProviderLambda: () -> OverflowRowItemProvider,
    private val state: OverflowRowState
) : OverflowActionScope {

    override val overflowItemCount: Int
        get() = state.overflowRange.let { it.last - it.first + 1 }

    override fun overflowItemContentType(index: Int): Any? {
        return itemProviderLambda().getContentType(state.overflowRange.first + index)
    }

    @Composable
    override fun overflowItem(index: Int) {
        val targetIndex = state.overflowRange.first + index
        return itemProviderLambda().Item(
            targetIndex,
            overflowItemKey(index),
            OverflowRowItemScope.OnOverflow
        )
    }

    override fun overflowItemKey(index: Int): Any {
        return itemProviderLambda().getKey(state.overflowRange.first + index)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun rememberOverflowRowItemMeasurePolicy(
    state: OverflowRowState,
    itemProviderLambda: () -> OverflowRowItemProvider,
    overflow: OverflowPosition,
    horizontalArrangement: Arrangement.Horizontal,
    verticalAlignment: Alignment.Vertical
) = remember<LazyLayoutMeasureScope.(Constraints) -> MeasureResult>(
    state,
    itemProviderLambda,
    horizontalArrangement,
    verticalAlignment
) {
    block@ { constraints ->
        val itemProvider = itemProviderLambda()
        if (itemProvider.itemCount <= 1) {
            return@block layout(0, 0) {}
        }
        val overflowPlaceable = measure(itemProvider.itemCount - 1, constraints.copy(minWidth = 0))[0]

        if (constraints.hasBoundedWidth) {
            when (overflow) {
                OverflowPosition.Start -> {
                    measureItemsEllipseStart(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable
                    )
                }

                OverflowPosition.End -> {
                    measureItemsEllipseEnd(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable
                    )
                }

                OverflowPosition.Center -> {
                    measureItemsEllipseCenter(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable
                    )
                }
            }
        } else {
            layout(0, 0) {

            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyLayoutMeasureScope.measureItemsEllipseStart(
    constraints: Constraints,
    horizontalArrangement: Arrangement.Horizontal,
    verticalAlignment: Alignment.Vertical,
    state: OverflowRowState,
    itemCount: Int,
    overflowPlaceable: Placeable
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastIndex = itemCount
    val itemConstraints = constraints.copy(minWidth = 0)
    var width = constraints.maxWidth
    var height = overflowPlaceable.height
    val measuredItems = buildList<Placeable> {
        do {
            remainingLastIndex -= 1
            val item = measure(remainingLastIndex, itemConstraints)[0]
            width -= item.width + if (remainingLastIndex == 0) 0 else spacingPx
            add(0, item)
            height = maxOf(height, item.height)
        } while (remainingLastIndex > 0 && width > 0)
        if (width < 0) {
            do {
                val removeItem = removeFirstOrNull() ?: break
                remainingLastIndex += 1
                width += removeItem.width + if (remainingLastIndex == 1) 0 else spacingPx
            } while (width < actionWidth + spacingPx)
        }
    }
    val overflowRange = 0 until remainingLastIndex
    state.overflowRange = overflowRange
    val layoutWidth = constraints.maxWidth - width + if (overflowRange.isEmpty()) {
        0
    } else {
        actionWidth + spacingPx
    }
    val layoutHeight = height
    return layout(layoutWidth, layoutHeight) {
        with(horizontalArrangement) {
            val hasOverflow = overflowRange.isEmpty().not()
            val offset = if (hasOverflow) 1 else 0
            val sizes = IntArray(measuredItems.size + offset) {
                if (hasOverflow && it == 0) {
                    actionWidth
                } else {
                    measuredItems[it - offset].width
                }
            }
            val positions = IntArray(sizes.size)
            arrange(layoutWidth, sizes, layoutDirection, positions)
            if (hasOverflow) {
                overflowPlaceable.place(positions.first(), verticalAlignment.align(overflowPlaceable.height, layoutHeight))
            }
            measuredItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    positions[index + offset],
                    verticalAlignment.align(placeable.height, layoutHeight)
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyLayoutMeasureScope.measureItemsEllipseEnd(
    constraints: Constraints,
    horizontalArrangement: Arrangement.Horizontal,
    verticalAlignment: Alignment.Vertical,
    state: OverflowRowState,
    itemCount: Int,
    overflowPlaceable: Placeable
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastIndex = -1
    val itemConstraints = constraints.copy(minWidth = 0)
    var width = constraints.maxWidth
    var height = overflowPlaceable.height
    val measuredItems = buildList<Placeable> {
        do {
            remainingLastIndex += 1
            val item = measure(remainingLastIndex, itemConstraints)[0]
            width -= item.width + if (remainingLastIndex == itemCount - 1) 0 else spacingPx
            add(remainingLastIndex, item)
            height = maxOf(height, item.height)
        } while (remainingLastIndex < itemCount - 1 && width > 0)
        if (width < 0) {
            do {
                val removeItem = removeLastOrNull() ?: break
                remainingLastIndex -= 1
                width += removeItem.width + if (remainingLastIndex == itemCount - 2) 0 else spacingPx
            } while (width < actionWidth + spacingPx)
        }
    }
    val overflowRange = remainingLastIndex + 1 until itemCount
    state.overflowRange = overflowRange
    val layoutWidth = constraints.maxWidth - width + if (overflowRange.isEmpty()) {
        0
    } else {
        actionWidth + spacingPx
    }
    val layoutHeight = height
    return layout(layoutWidth, layoutHeight) {
        val hasOverflow = overflowRange.isEmpty().not()
        val sizes = IntArray(measuredItems.size + if (hasOverflow) 1 else 0) {
            if (it < measuredItems.size) {
                measuredItems[it].width
            } else {
                actionWidth
            }
        }
        val positions = IntArray(sizes.size)
        with(horizontalArrangement) {
            arrange(layoutWidth, sizes, layoutDirection, positions)
        }
        measuredItems.fastForEachIndexed { index, placeable ->
            placeable.place(
                positions[index],
                verticalAlignment.align(placeable.height, layoutHeight)
            )
        }
        if (hasOverflow) {
            overflowPlaceable.place(
                positions.lastOrNull() ?: 0,
                verticalAlignment.align(overflowPlaceable.height, layoutHeight)
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyLayoutMeasureScope.measureItemsEllipseCenter(
    constraints: Constraints,
    horizontalArrangement: Arrangement.Horizontal,
    verticalAlignment: Alignment.Vertical,
    state: OverflowRowState,
    itemCount: Int,
    overflowPlaceable: Placeable
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastStartIndex = -1
    var remainingLastEndIndex = itemCount
    val itemConstraints = constraints.copy(minWidth = 0)
    var width = constraints.maxWidth + spacingPx
    var height = overflowPlaceable.height
    val measuredEndItems = mutableListOf<Placeable>()
    val measuredStartItems = mutableListOf<Placeable>()
    do {
        if (measuredStartItems.size == measuredEndItems.size) {
            remainingLastStartIndex += 1
            val item = measure(remainingLastStartIndex, itemConstraints)[0]
            width -= item.width + spacingPx
            measuredStartItems.add(remainingLastStartIndex, item)
            height = maxOf(height, item.height)
        } else {
            remainingLastEndIndex -= 1
            val item = measure(remainingLastEndIndex, itemConstraints)[0]
            width -= item.width + spacingPx
            measuredEndItems.add(0, item)
            height = maxOf(height, item.height)
        }
    } while (remainingLastEndIndex - remainingLastStartIndex > 1 && width > 0)
    if (width < 0) {
        do {
            val isStart = measuredStartItems.size > measuredEndItems.size
            if (isStart) {
                val removeItem = measuredStartItems.removeLastOrNull() ?: break
                remainingLastStartIndex -= 1
                width += removeItem.width + spacingPx
            } else {
                val removeItem = measuredEndItems.removeFirstOrNull() ?: break
                remainingLastEndIndex += 1
                width += removeItem.width + spacingPx
            }
        } while (width < actionWidth + spacingPx)
    }
    val overflowRange = remainingLastStartIndex + 1 until remainingLastEndIndex
    state.overflowRange = overflowRange
    val layoutWidth = constraints.maxWidth - width + if (overflowRange.isEmpty()) {
        0
    } else {
        actionWidth + spacingPx
    }
    val layoutHeight = height
    return layout(layoutWidth, layoutHeight) {
        val hasOverflow = overflowRange.isEmpty().not()
        val offset = if (hasOverflow) 1 else 0
        with(horizontalArrangement) {
            val sizes = IntArray(measuredStartItems.size + measuredEndItems.size + offset) {
                if (it < measuredStartItems.size) {
                    measuredStartItems[it].width
                } else if (hasOverflow && it == measuredStartItems.size) {
                    actionWidth
                } else {
                    measuredEndItems[it - measuredStartItems.size - offset].width
                }
            }
            val positions = IntArray(sizes.size)
            arrange(layoutWidth, sizes, layoutDirection, positions)
            measuredStartItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    positions[index],
                    verticalAlignment.align(placeable.height, layoutHeight)
                )
            }
            measuredEndItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    positions[measuredStartItems.size + index + offset],
                    verticalAlignment.align(placeable.height, layoutHeight)
                )
            }
            if (hasOverflow) {
                overflowPlaceable.place(
                    positions[measuredStartItems.size],
                    verticalAlignment.align(overflowPlaceable.height, layoutHeight)
                )
            }
        }
    }
}