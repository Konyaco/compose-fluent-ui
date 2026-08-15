package io.github.composefluent.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.withSaveLayer
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.scrollBy
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalWindowAcrylicContainer
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.MaterialDefaults
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.math.abs

@Stable
internal interface PickerWheelData<T : Any> {
    val size: Int

    operator fun get(index: Int): T

    fun indexOf(value: T): Int

    fun key(index: Int): Any
}

@Immutable
internal data class ListPickerWheelData<T : Any>(
    private val values: List<T>
) : PickerWheelData<T> {
    override val size: Int
        get() = values.size

    override fun get(index: Int): T = values[index]

    override fun indexOf(value: T): Int = values.indexOf(value)

    override fun key(index: Int): Any = values[index]
}

@Immutable
internal data class IntRangePickerWheelData(
    val range: IntRange
) : PickerWheelData<Int> {
    override val size: Int
        get() = if (range.isEmpty()) 0 else range.last - range.first + 1

    override fun get(index: Int): Int {
        require(index in 0 until size) { "index must be in the wheel data range" }
        return range.first + index
    }

    override fun indexOf(value: Int): Int =
        if (value in range) value - range.first else -1

    override fun key(index: Int): Any = get(index)
}

@OptIn(ExperimentalFluentApi::class)
@Composable
internal fun <T : Any> PickerWheel(
    data: PickerWheelData<T>,
    selectedValue: T,
    onSelectedValueChange: (T) -> Unit,
    visibleItemsCount: Int,
    looping: Boolean,
    label: String,
    itemText: (T) -> String,
    modifier: Modifier = Modifier,
    itemHeight: Dp = PickerItemHeight,
) {
    require(data.size > 0) { "PickerWheel data must not be empty" }
    require(visibleItemsCount % 2 == 1) { "visibleItemsCount must be odd" }

    val effectiveLooping = looping && data.size > 1
    val virtualListSize = if (effectiveLooping) data.size * VirtualListRepeatCount else data.size
    val selectedDataIndex = data.indexOf(selectedValue).coerceAtLeast(0)
    val centerOffset = (visibleItemsCount - 1) / 2
    val initialVirtualIndex = remember(data, selectedDataIndex, effectiveLooping) {
        if (effectiveLooping) {
            val middleCycleStart = virtualListSize / 2 - virtualListSize / 2 % data.size
            middleCycleStart + selectedDataIndex
        } else {
            selectedDataIndex
        }
    }
    val initialFirstVisibleItemIndex = if (effectiveLooping) {
        (initialVirtualIndex - centerOffset).coerceAtLeast(0)
    } else {
        initialVirtualIndex
    }
    val contentPadding = if (effectiveLooping) {
        0.dp
    } else {
        itemHeight * centerOffset
    }
    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex = initialFirstVisibleItemIndex
    )
    val centeredVirtualIndex by remember(listState, virtualListSize, initialVirtualIndex) {
        derivedStateOf {
            listState.centeredItemIndex() ?: initialVirtualIndex.coerceIn(0, virtualListSize - 1)
        }
    }
    val centeredValue by remember(data, centeredVirtualIndex) {
        derivedStateOf { data[centeredVirtualIndex % data.size] }
    }
    val centeredText by remember(data, centeredVirtualIndex, itemText) {
        derivedStateOf { itemText(data[centeredVirtualIndex % data.size]) }
    }
    val currentOnSelectedValueChange by rememberUpdatedState(onSelectedValueChange)
    val pendingSelectionEchoes = remember(data) { mutableListOf<T>() }

    LaunchedEffect(centeredValue) {
        if (centeredValue != selectedValue) {
            pendingSelectionEchoes += centeredValue
            currentOnSelectedValueChange(centeredValue)
        }
    }

    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val scrollScope = rememberCoroutineScope()
    var currentTargetVirtualIndex by remember {
        mutableIntStateOf(initialVirtualIndex)
    }
    val focusRequester = remember { FocusRequester() }
    val itemSizePx = with(LocalDensity.current) { itemHeight.toPx() }
    val mouseWheelSnapLayoutInfoProvider = remember(listState, itemSizePx) {
        MouseWheelSnapLayoutInfoProvider(listState, itemSizePx)
    }
    val mouseWheelFlingBehavior = rememberSnapFlingBehavior(mouseWheelSnapLayoutInfoProvider)
    val mouseWheelSnapController = remember(
        listState,
        mouseWheelSnapLayoutInfoProvider,
        mouseWheelFlingBehavior,
        scrollScope,
        itemSizePx
    ) {
        MouseWheelSnapController(
            listState = listState,
            snapLayoutInfoProvider = mouseWheelSnapLayoutInfoProvider,
            flingBehavior = mouseWheelFlingBehavior,
            coroutineScope = scrollScope,
            itemSizePx = itemSizePx
        )
    }
    DisposableEffect(mouseWheelSnapController) {
        onDispose { mouseWheelSnapController.cancel() }
    }

    fun targetFirstVisibleItemIndex(targetVirtualIndex: Int): Int =
        if (effectiveLooping) {
            (targetVirtualIndex - centerOffset).coerceAtLeast(0)
        } else {
            targetVirtualIndex
        }

    fun scroll(offset: Int) {
        scrollScope.launch {
            mouseWheelSnapController.cancelAndJoin()
            val currentIndex = if (listState.isScrollInProgress) {
                currentTargetVirtualIndex
            } else {
                listState.centeredItemIndex() ?: centeredVirtualIndex
            }
            val target = (currentIndex + offset).coerceIn(0, virtualListSize - 1)
            currentTargetVirtualIndex = target
            listState.animateScrollToItem(targetFirstVisibleItemIndex(target))
        }
    }

    fun canScroll(offset: Int): Boolean {
        val currentIndex = if (listState.isScrollInProgress) {
            currentTargetVirtualIndex
        } else {
            listState.centeredItemIndex() ?: centeredVirtualIndex
        }
        return currentIndex + offset in 0 until virtualListSize
    }

    LaunchedEffect(data, selectedValue, effectiveLooping) {
        // A fast fling can advance past a value before its callback is reflected by the caller.
        // Consume those delayed echoes without treating them as authoritative external updates.
        val echoedSelectionIndex = pendingSelectionEchoes.indexOfLast {
            it == selectedValue
        }
        if (echoedSelectionIndex >= 0) {
            pendingSelectionEchoes.subList(0, echoedSelectionIndex + 1).clear()
            return@LaunchedEffect
        }
        pendingSelectionEchoes.clear()

        val targetDataIndex = data.indexOf(selectedValue)
        if (targetDataIndex < 0) return@LaunchedEffect

        val currentIndex = listState.centeredItemIndex() ?: centeredVirtualIndex
        val currentDataIndex = currentIndex % data.size
        if (currentDataIndex == targetDataIndex) return@LaunchedEffect

        mouseWheelSnapController.cancelAndJoin()
        val targetVirtualIndex = if (effectiveLooping) {
            val forward = (targetDataIndex - currentDataIndex + data.size) % data.size
            val backward = forward - data.size
            currentIndex + if (abs(backward) < forward) backward else forward
        } else {
            targetDataIndex
        }.coerceIn(0, virtualListSize - 1)
        currentTargetVirtualIndex = targetVirtualIndex
        listState.scrollToItem(targetFirstVisibleItemIndex(targetVirtualIndex))
    }

    Box(modifier.hoverable(interactionSource)) {
        LazyColumn(
            state = listState,
            flingBehavior = rememberSnapFlingBehavior(listState),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = contentPadding),
            verticalArrangement = Arrangement.Center,
            userScrollEnabled = true,
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(mouseWheelSnapController) {
                    while (true) {
                        val event = awaitPointerEventScope {
                            awaitPointerEvent(PointerEventPass.Initial)
                        }
                        when (event.type) {
                            PointerEventType.Scroll -> {
                                val change = event.changes.first()
                                val scrollDelta = change.scrollDelta.y
                                if (scrollDelta != 0f) {
                                    event.changes.forEach { it.consume() }
                                    mouseWheelSnapController.onMouseWheel(
                                        scrollDelta = scrollDelta,
                                        uptimeMillis = change.uptimeMillis
                                    )
                                }
                            }

                            PointerEventType.Press -> mouseWheelSnapController.cancelAndJoin()
                            PointerEventType.Enter -> focusRequester.requestFocus()
                            else -> Unit
                        }
                    }
                }
                .focusable()
                .focusRequester(focusRequester)
                .semantics {
                    contentDescription = label
                    stateDescription = centeredText
                    role = Role.ValuePicker
                    scrollBy { _, y ->
                        when {
                            y > 0f && canScroll(1) -> {
                                scroll(1)
                                true
                            }

                            y < 0f && canScroll(-1) -> {
                                scroll(-1)
                                true
                            }

                            else -> false
                        }
                    }
                }
                .onKeyEvent {
                    if (it.type != KeyEventType.KeyDown) return@onKeyEvent false
                    when (it.key) {
                        Key.DirectionUp -> scroll(-1)
                        Key.DirectionDown -> scroll(1)
                        Key.PageUp -> scroll(-visibleItemsCount)
                        Key.PageDown -> scroll(visibleItemsCount)
                        else -> return@onKeyEvent false
                    }
                    true
                }
        ) {
            items(
                count = virtualListSize,
                key = { index -> if (effectiveLooping) index else data.key(index) }
            ) { index ->
                val itemValue = data[index % data.size]

                SubtleButton(
                    modifier = Modifier
                        .height(itemHeight)
                        .fillMaxWidth()
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    onClick = {
                        scrollScope.launch {
                            mouseWheelSnapController.cancelAndJoin()
                            currentTargetVirtualIndex = index
                            listState.animateScrollToItem(targetFirstVisibleItemIndex(index))
                        }
                    }
                ) {
                    PickerWheelItemText(
                        text = itemText(itemValue),
                        itemIndex = index,
                        listState = listState,
                        itemSizePx = itemSizePx
                    )
                }
            }
        }
        if (hovered) {
            with(LocalWindowAcrylicContainer.current) {
                PickerCaretButton(
                    type = FontIconPrimitive.CaretUp,
                    contentDescription = "Up",
                    onClick = { scroll(-1) },
                    disabled = !canScroll(-1),
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .materialOverlay(MaterialDefaults.acrylicDefault())
                        .fillMaxWidth()
                )

                PickerCaretButton(
                    type = FontIconPrimitive.CaretDown,
                    contentDescription = "Down",
                    onClick = { scroll(1) },
                    disabled = !canScroll(1),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .materialOverlay(MaterialDefaults.acrylicDefault())
                        .fillMaxWidth()
                )
            }
        }
    }
}

private fun LazyListState.centeredItemIndex(): Int? {
    val layoutInfo = layoutInfo
    val viewportCenter = (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2f
    return layoutInfo.visibleItemsInfo.minByOrNull { item ->
        abs(item.offset + item.size / 2f - viewportCenter)
    }?.index
}

@Composable
private fun PickerWheelItemText(
    text: String,
    itemIndex: Int,
    listState: LazyListState,
    itemSizePx: Float
) {
    val itemOffset = remember(listState, itemIndex) {
        derivedStateOf {
            val layoutInfo = listState.layoutInfo
            val item = layoutInfo.visibleItemsInfo
                .firstOrNull { it.index == itemIndex }
                ?: return@derivedStateOf null

            val offsetInViewport = item.offset - layoutInfo.viewportStartOffset

            // LazyLayout's item offset can be observed one frame late while scrolling. Reading
            // firstVisibleItemScrollOffset forces this state to refresh for every scroll delta.
            offsetInViewport + listState.firstVisibleItemScrollOffset -
                listState.firstVisibleItemScrollOffset
        }
    }

    val selectedTextColor = FluentTheme.colors.text.onAccent.primary
    Text(
        text = text,
        style = FluentTheme.typography.body,
        color = FluentTheme.colors.text.text.primary,
        textAlign = TextAlign.Center,
        modifier = Modifier.drawWithCache {
            val layerBounds = Rect(Offset.Zero, size)
            val layerPaint = Paint()

            onDrawWithContent {
                val currentItemOffset = itemOffset.value
                if (currentItemOffset == null) {
                    drawContent()
                    return@onDrawWithContent
                }

                val selectionTop =
                    (listState.layoutInfo.viewportSize.height - itemSizePx) / 2f
                val textTop = currentItemOffset + (itemSizePx - size.height) / 2f
                val selectionTopInText = selectionTop - textTop
                val intersectionTop = selectionTopInText.coerceAtLeast(0f)
                val intersectionBottom =
                    (selectionTopInText + itemSizePx).coerceAtMost(size.height)

                if (intersectionTop >= intersectionBottom) {
                    drawContent()
                    return@onDrawWithContent
                }

                drawContext.canvas.withSaveLayer(layerBounds, layerPaint) {
                    drawContent()
                    drawRect(
                        color = selectedTextColor,
                        topLeft = Offset(0f, intersectionTop),
                        size = Size(
                            size.width,
                            intersectionBottom - intersectionTop
                        ),
                        blendMode = BlendMode.SrcIn
                    )
                }
            }
        }
    )
}

private class MouseWheelSnapController(
    private val listState: LazyListState,
    private val snapLayoutInfoProvider: MouseWheelSnapLayoutInfoProvider,
    private val flingBehavior: FlingBehavior,
    private val coroutineScope: CoroutineScope,
    private val itemSizePx: Float
) {
    private var flingJob: Job? = null
    private var lastEventUptimeMillis = 0L
    private var lastDirection = 0
    private var velocity = 0f

    fun onMouseWheel(scrollDelta: Float, uptimeMillis: Long) {
        val direction = if (scrollDelta > 0f) 1 else -1
        if (flingJob?.isActive != true) {
            snapLayoutInfoProvider.targetIndex = snapLayoutInfoProvider.currentSnappedItemIndex()
        }
        if (!snapLayoutInfoProvider.moveTarget(direction)) return

        val elapsedMillis = uptimeMillis - lastEventUptimeMillis
        val isContinuous = direction == lastDirection &&
            elapsedMillis in 1..ContinuousInputTimeoutMillis
        val singleStepVelocity = itemSizePx * SingleStepItemsPerSecond
        velocity = if (isContinuous) {
            val measuredVelocity = itemSizePx * 1000f / elapsedMillis
            direction * ((abs(velocity) + measuredVelocity) / 2f)
                .coerceIn(singleStepVelocity, itemSizePx * MaxItemsPerSecond)
        } else {
            direction * singleStepVelocity
        }
        lastDirection = direction
        lastEventUptimeMillis = uptimeMillis

        val flingVelocity = velocity
        flingJob = coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
            listState.scroll(MutatePriority.PreventUserInput) {
                with(flingBehavior) { performFling(flingVelocity) }
            }
        }
    }

    fun cancel() {
        val job = flingJob
        job?.cancel()
        if (flingJob === job) {
            flingJob = null
            resetInputTracking()
        }
    }

    suspend fun cancelAndJoin() {
        val job = flingJob
        job?.cancel()
        if (flingJob === job) resetInputTracking()
        job?.join()
        if (flingJob === job) flingJob = null
    }

    private fun resetInputTracking() {
        lastEventUptimeMillis = 0L
        lastDirection = 0
        velocity = 0f
    }

    private companion object {
        const val ContinuousInputTimeoutMillis = 250L
        const val SingleStepItemsPerSecond = 10f
        const val MaxItemsPerSecond = 50f
    }
}

private class MouseWheelSnapLayoutInfoProvider(
    private val listState: LazyListState,
    private val itemSizePx: Float
) : SnapLayoutInfoProvider {
    var targetIndex = 0

    fun currentSnappedItemIndex(): Int {
        val visibleItems = listState.layoutInfo.visibleItemsInfo
        return visibleItems.minByOrNull { abs(distanceToSnapPosition(it)) }?.index
            ?: listState.firstVisibleItemIndex
    }

    fun moveTarget(direction: Int): Boolean {
        val itemCount = listState.layoutInfo.totalItemsCount
        if (itemCount == 0) return false
        val newTargetIndex = (targetIndex + direction).coerceIn(0, itemCount - 1)
        if (newTargetIndex == targetIndex) return false
        targetIndex = newTargetIndex
        return true
    }

    override fun calculateApproachOffset(velocity: Float, decayOffset: Float): Float = 0f

    override fun calculateSnapOffset(velocity: Float): Float {
        val visibleItems = listState.layoutInfo.visibleItemsInfo
        val targetItem = visibleItems.firstOrNull { it.index == targetIndex }
        if (targetItem != null) return distanceToSnapPosition(targetItem)

        val anchorItem = visibleItems.minByOrNull { abs(it.index - targetIndex) } ?: return 0f
        return distanceToSnapPosition(anchorItem) +
            (targetIndex - anchorItem.index) * itemSizePx
    }

    private fun distanceToSnapPosition(item: LazyListItemInfo): Float {
        val layoutInfo = listState.layoutInfo
        val snapPosition = SnapPosition.Center.position(
            layoutSize = layoutInfo.viewportSize.height,
            itemSize = item.size,
            beforeContentPadding = layoutInfo.beforeContentPadding,
            afterContentPadding = layoutInfo.afterContentPadding,
            itemIndex = item.index,
            itemCount = layoutInfo.totalItemsCount
        )
        return item.offset - snapPosition.toFloat()
    }
}

@Composable
private fun PickerCaretButton(
    type: FontIconPrimitive,
    contentDescription: String,
    onClick: () -> Unit,
    disabled: Boolean,
    modifier: Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val transparentButtonColor = ButtonColor(
        fillColor = Color.Transparent,
        contentColor = FluentTheme.colors.text.text.primary,
        borderBrush = SolidColor(Color.Transparent)
    )
    RepeatButton(
        onClick = onClick,
        buttonColors = ButtonDefaults.subtleButtonColors(
            default = transparentButtonColor,
            hovered = transparentButtonColor,
            pressed = transparentButtonColor,
            disabled = transparentButtonColor
        ),
        interaction = interactionSource,
        iconOnly = true,
        disabled = disabled,
        modifier = modifier.height(PickerItemHeight),
    ) {
        val pressed by interactionSource.collectIsPressedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val size by animateFloatAsState(
            if (pressed) 7f else 8f,
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        val color = if (hovered) FluentTheme.colors.text.text.secondary
        else FluentTheme.colors.controlStrong.default

        FontIcon(type, contentDescription, size = FontIconSize(size), tint = color)
    }
}

internal val PickerItemHeight = 40.dp

private const val VirtualListRepeatCount = 100
