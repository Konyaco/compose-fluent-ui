package io.github.composefluent.layout.overflow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.layout.LazyLayout
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.composefluent.component.BasicFlyout
import io.github.composefluent.component.BasicFlyoutContainer
import io.github.composefluent.component.FlyoutContainerScope
import io.github.composefluent.component.ScrollbarContainer
import kotlin.math.roundToInt

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
    contentPadding: PaddingValues = PaddingValues(),
    alwaysShowOverflowAction: Boolean = false,
    content: OverflowRowScope.() -> Unit
) {
    val contentState = rememberUpdatedState(content)
    val itemProviderState = remember {
        val intervalContentState = derivedStateOf(referentialEqualityPolicy()) {
            OverflowRowIntervalContent(contentState.value)
        }
        val itemProviderState = derivedStateOf(referentialEqualityPolicy()) {
            OverflowRowItemProvider(state, intervalContentState.value).apply {
                val scope = OverflowActionScopeImpl({ this }, state)
                intervalContentState.value.item("_overflow_action", "_overflow_action") {
                    scope.overflowAction()
                }
            }
        }
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
            verticalAlignment,
            contentPadding,
            alwaysShowOverflowAction
        ),
        modifier = modifier
    )
}

/**
 * Determines the position of the overflow action within the [OverflowRow].
 *
 * This enum defines where the overflow indicator (e.g., a three-dot button) should be
 * positioned relative to the other items in the row when there is not enough space to display
 * all items.
 *
 * - **Start**: The overflow action is placed at the start (left in LTR, right in RTL) of the row.
 *   Items that overflow will be hidden from the right.
 * - **Center**: The overflow action is placed in the center of the row. Items that overflow will
 *   be hidden from both sides, equally.
 * - **End**: The overflow action is placed at the end (right in LTR, left in RTL) of the row.
 *   Items that overflow will be hidden from the left.
 */
enum class OverflowPosition {
    Start,
    Center,
    End
}

/**
 * Scope for the overflow action.
 *
 * This scope provides information about the items that are currently in the overflow and allows
 * rendering them.
 */
interface OverflowActionScope {

    /**
     * The number of items that are currently in the overflow.
     */
    val overflowItemCount: Int

    /**
     * Returns the key for the item at the specified [index] in the overflow menu.
     *
     * This key is used to uniquely identify the item when it's displayed in the
     * overflow menu (e.g., in a [LazyColumn]).
     *
     * @param index The index of the item within the overflow menu.
     * @return The unique key associated with the item at the given index.
     */
    fun overflowItemKey(index: Int): Any

    /**
     * Returns the content type for the item at the given [index] in the overflow area.
     * This is used by [LazyColumn] to optimize item recycling.
     *
     * @param index The index of the item in the overflow area.
     * @return The content type of the item, or `null` if there is no specific type.
     */
    fun overflowItemContentType(index: Int): Any?

    /**
     * Composable function to render an item within the overflow area.
     *
     * @param index The index of the item within the overflow area. This index is relative
     *              to the start of the overflow range, not the overall item list.
     */
    @Composable
    fun overflowItem(index: Int)
}

/**
 * A container for displaying overflow items in a flyout.
 *
 * This composable provides a flyout that appears when the overflow action button is clicked.
 * It displays the overflow items within a scrollable column inside the flyout.
 *
 * @param actionButton The composable that represents the overflow action button. When clicked,
 *        it triggers the flyout to be shown. The content of the action button will be passed to the
 *        [BasicFlyoutContainer] `content` param.
 */
@Composable
fun OverflowActionScope.OverflowFlyoutContainer(
    actionButton: @Composable FlyoutContainerScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            BasicFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                contentPadding = PaddingValues(),
                content = {
                    val scrollState = rememberScrollState()
                    ScrollbarContainer(
                        adapter = io.github.composefluent.component.rememberScrollbarAdapter(scrollState)
                    ) {
                        Column(
                            modifier = Modifier.verticalScroll(scrollState)
                                .width(IntrinsicSize.Max)
                                .padding(vertical = 3.dp)
                        ) {
                            repeat(overflowItemCount) {
                                overflowItem(it)
                            }
                        }
                    }
                }
            )
        },
        content = actionButton
    )
}

/**
 * A flyout container that displays the overflow items in a lazy column.
 *
 * This composable provides a container for overflow actions that are displayed within a flyout.
 * It uses a [LazyColumn] to display the overflow items, which enables efficient rendering of a large number of items.
 * The lazy column is scrollable and includes a scrollbar.
 *
 * @param actionButton The composable that triggers the display of the overflow flyout.
 *   This is typically a button or an icon that, when clicked, shows the overflow items.
 */
@Composable
fun OverflowActionScope.LazyOverflowFlyoutContainer(
    actionButton: @Composable FlyoutContainerScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            BasicFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                contentPadding = PaddingValues(),
                content = {
                    val listState = rememberLazyListState()
                    ScrollbarContainer(
                        adapter = io.github.composefluent.component.rememberScrollbarAdapter(listState)
                    ) {
                        LazyColumn(
                            state = listState,
                            contentPadding = PaddingValues(vertical = 3.dp),
                            modifier = Modifier.widthIn(max = 120.dp)
                        ) {
                            items(
                                count = overflowItemCount,
                                key = ::overflowItemKey,
                                contentType = ::overflowItemContentType,
                            ) {
                                overflowItem(it)
                            }
                        }
                    }
                }
            )
        },
        content = actionButton
    )
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
    verticalAlignment: Alignment.Vertical,
    contentPadding: PaddingValues,
    alwaysShowOverflowAction: Boolean
) = remember<LazyLayoutMeasureScope.(Constraints) -> MeasureResult>(
    state,
    itemProviderLambda,
    horizontalArrangement,
    verticalAlignment,
    contentPadding,
    alwaysShowOverflowAction
) {
    block@ { constraints ->
        val itemProvider = itemProviderLambda()
        if (itemProvider.itemCount <= 1) {
            return@block layout(0, 0) {}
        }
        val topPadding = contentPadding.calculateTopPadding().toPx()
        val bottomPadding = contentPadding.calculateBottomPadding().toPx()
        val leftPadding = contentPadding.calculateLeftPadding(layoutDirection).toPx()
        val rightPadding = contentPadding.calculateRightPadding(layoutDirection).toPx()
        val itemConstraints = constraints.copy(
            minWidth = 0,
            minHeight = 0,
            maxWidth = (constraints.maxWidth - leftPadding - rightPadding).toInt(),
            maxHeight = (constraints.maxHeight - topPadding - bottomPadding).toInt()
        )
        val overflowPlaceable =
            compose(itemProvider.itemCount - 1).map { it.measure(itemConstraints) }[0]

        if (constraints.hasBoundedWidth) {
            when (overflow) {
                OverflowPosition.Start -> {
                    measureItemsEllipseStart(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable,
                        alwaysShowOverflowAction,
                        itemConstraints,
                        leftPadding,
                        topPadding,
                        rightPadding,
                        bottomPadding
                    )
                }

                OverflowPosition.End -> {
                    measureItemsEllipseEnd(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable,
                        alwaysShowOverflowAction,
                        itemConstraints,
                        leftPadding,
                        topPadding,
                        rightPadding,
                        bottomPadding
                    )
                }

                OverflowPosition.Center -> {
                    measureItemsEllipseCenter(
                        constraints,
                        horizontalArrangement,
                        verticalAlignment,
                        state,
                        itemProvider.itemCount - 1,
                        overflowPlaceable,
                        alwaysShowOverflowAction,
                        itemConstraints,
                        leftPadding,
                        topPadding,
                        rightPadding,
                        bottomPadding
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
    overflowPlaceable: Placeable,
    alwaysShowOverflowAction: Boolean,
    itemConstraints: Constraints,
    leftPadding: Float,
    topPadding: Float,
    rightPadding: Float,
    bottomPadding: Float
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastIndex = itemCount
    var width = constraints.maxWidth
    var height = overflowPlaceable.height
    val measuredItems = buildList<Placeable> {
        do {
            remainingLastIndex -= 1
            val item = compose(remainingLastIndex).map { it.measure(itemConstraints) }[0]
            width -= item.width + if (remainingLastIndex == 0) 0 else spacingPx
            add(0, item)
            height = maxOf(height, item.height)
        } while (remainingLastIndex > 0 && width > 0)
        if (width < 0 || (alwaysShowOverflowAction && width < actionWidth + spacingPx)) {
            do {
                val removeItem = removeFirstOrNull() ?: break
                remainingLastIndex += 1
                width += removeItem.width + if (remainingLastIndex == 1) 0 else spacingPx
            } while (width < actionWidth + spacingPx)
        }
    }
    val overflowRange = 0 until remainingLastIndex
    state.overflowRange = overflowRange
    val contentWidth = constraints.maxWidth - width + if (overflowRange.isEmpty().not() || alwaysShowOverflowAction) {
        actionWidth + spacingPx
    } else {
        0
    }
    val layoutHeight = height
    val layoutWidth = maxOf(constraints.minWidth, (contentWidth + leftPadding + rightPadding).roundToInt())
    return layout(layoutWidth, (layoutHeight + topPadding + bottomPadding).roundToInt()) {
        with(horizontalArrangement) {
            val hasOverflow = alwaysShowOverflowAction || overflowRange.isEmpty().not()
            val offset = if (hasOverflow) 1 else 0
            val sizes = IntArray(measuredItems.size + offset) {
                if (hasOverflow && it == 0) {
                    actionWidth
                } else {
                    measuredItems[it - offset].width
                }
            }
            val positions = IntArray(sizes.size)
            arrange((layoutWidth - leftPadding - rightPadding).roundToInt(), sizes, layoutDirection, positions)
            if (hasOverflow) {
                overflowPlaceable.place(
                    x = (positions.first() + leftPadding).roundToInt(),
                    y = (verticalAlignment.align(overflowPlaceable.height, layoutHeight) + topPadding).roundToInt()
                )
            }
            measuredItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    (positions[index + offset] + leftPadding).roundToInt(),
                    (verticalAlignment.align(placeable.height, layoutHeight) + topPadding).roundToInt()
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
    overflowPlaceable: Placeable,
    alwaysShowOverflowAction: Boolean,
    itemConstraints: Constraints,
    leftPadding: Float,
    topPadding: Float,
    rightPadding: Float,
    bottomPadding: Float
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastIndex = -1
    var width = constraints.maxWidth
    var height = overflowPlaceable.height
    val measuredItems = buildList<Placeable> {
        do {
            remainingLastIndex += 1
            val item = compose(remainingLastIndex).map { it.measure(itemConstraints) }[0]
            width -= item.width + if (remainingLastIndex == itemCount - 1) 0 else spacingPx
            add(remainingLastIndex, item)
            height = maxOf(height, item.height)
        } while (remainingLastIndex < itemCount - 1 && width > 0)
        if (width < 0 || (alwaysShowOverflowAction && width < actionWidth + spacingPx)) {
            do {
                val removeItem = removeLastOrNull() ?: break
                remainingLastIndex -= 1
                width += removeItem.width + if (remainingLastIndex == itemCount - 2) 0 else spacingPx
            } while (width < actionWidth + spacingPx)
        }
    }
    val overflowRange = remainingLastIndex + 1 until itemCount
    state.overflowRange = overflowRange
    val contentWidth = constraints.maxWidth - width + if (overflowRange.isEmpty().not() || alwaysShowOverflowAction) {
        actionWidth + spacingPx
    } else {
        0
    }
    val layoutHeight = height
    val layoutWidth = maxOf(constraints.minWidth, (contentWidth + leftPadding + rightPadding).roundToInt())
    return layout(layoutWidth, (layoutHeight + topPadding + bottomPadding).roundToInt()) {
        val hasOverflow = alwaysShowOverflowAction || overflowRange.isEmpty().not()
        val sizes = IntArray(measuredItems.size + if (hasOverflow) 1 else 0) {
            if (it < measuredItems.size) {
                measuredItems[it].width
            } else {
                actionWidth
            }
        }
        val positions = IntArray(sizes.size)
        with(horizontalArrangement) {
            arrange((layoutWidth - leftPadding - rightPadding).roundToInt(), sizes, layoutDirection, positions)
        }
        measuredItems.fastForEachIndexed { index, placeable ->
            placeable.place(
                (positions[index] + leftPadding).roundToInt(),
                (verticalAlignment.align(placeable.height, layoutHeight) + topPadding).roundToInt()
            )
        }
        if (hasOverflow) {
            overflowPlaceable.place(
                (positions.lastOrNull() ?: 0) + leftPadding.roundToInt(),
                (verticalAlignment.align(overflowPlaceable.height, layoutHeight) + topPadding).roundToInt()
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
    overflowPlaceable: Placeable,
    alwaysShowOverflowAction: Boolean,
    itemConstraints: Constraints,
    leftPadding: Float,
    topPadding: Float,
    rightPadding: Float,
    bottomPadding: Float
): MeasureResult {
    val spacingPx = horizontalArrangement.spacing.roundToPx()
    val actionWidth = overflowPlaceable.width
    var remainingLastStartIndex = -1
    var remainingLastEndIndex = itemCount
    var width = constraints.maxWidth + spacingPx
    var height = overflowPlaceable.height
    val measuredEndItems = mutableListOf<Placeable>()
    val measuredStartItems = mutableListOf<Placeable>()
    do {
        if (measuredStartItems.size == measuredEndItems.size) {
            remainingLastStartIndex += 1
            val item = compose(remainingLastStartIndex).map { it.measure(itemConstraints) }[0]
            width -= item.width + spacingPx
            measuredStartItems.add(remainingLastStartIndex, item)
            height = maxOf(height, item.height)
        } else {
            remainingLastEndIndex -= 1
            val item = compose(remainingLastEndIndex).map { it.measure(itemConstraints) }[0]
            width -= item.width + spacingPx
            measuredEndItems.add(0, item)
            height = maxOf(height, item.height)
        }
    } while (remainingLastEndIndex - remainingLastStartIndex > 1 && width > 0)
    if (width < 0 || (alwaysShowOverflowAction && width < actionWidth + spacingPx)) {
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
    val contentWidth = constraints.maxWidth - width + if (overflowRange.isEmpty().not() || alwaysShowOverflowAction) {
        actionWidth + spacingPx
    } else {
       0
    }
    val layoutHeight = height
    val layoutWidth = maxOf(constraints.minWidth, (contentWidth + leftPadding + rightPadding).roundToInt())
    return layout(layoutWidth, (layoutHeight + topPadding + bottomPadding).roundToInt()) {
        val hasOverflow = alwaysShowOverflowAction || overflowRange.isEmpty().not()
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
            arrange((layoutWidth - leftPadding - rightPadding).roundToInt(), sizes, layoutDirection, positions)
            measuredStartItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    (positions[index] + leftPadding).roundToInt(),
                    (verticalAlignment.align(placeable.height, layoutHeight) + topPadding).roundToInt()
                )
            }
            measuredEndItems.fastForEachIndexed { index, placeable ->
                placeable.place(
                    (positions[measuredStartItems.size + index + offset] + leftPadding).roundToInt(),
                    (verticalAlignment.align(placeable.height, layoutHeight) + topPadding).roundToInt()
                )
            }
            if (hasOverflow) {
                overflowPlaceable.place(
                    (positions[measuredStartItems.size] + leftPadding).roundToInt(),
                    (verticalAlignment.align(overflowPlaceable.height, layoutHeight) + topPadding).roundToInt()
                )
            }
        }
    }
}