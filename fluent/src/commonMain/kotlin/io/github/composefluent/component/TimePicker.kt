package io.github.composefluent.component

import androidx.annotation.IntRange
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.withSaveLayer
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastCoerceAtLeast
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.MaterialContainer
import io.github.composefluent.background.MaterialDefaults
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalTime
import kotlin.math.abs

/**
 * Displays a control that lets the user select an hour and minute.
 *
 * When [is12hour] is `true`, the picker also displays an AM/PM selector and uses the 12-hour
 * clock. Otherwise, it uses the 24-hour clock.
 *
 * @param value The currently selected time, or `null` when no time is selected.
 * @param onValueChange Callback invoked when the selected time changes. The callback receives
 * `null` when the selection is cancelled.
 * @param modifier The [Modifier] to be applied to the TimePicker container, including its
 * selection button.
 * @param is12hour Whether to use the 12-hour clock and display an AM/PM selector. When `false`,
 * the picker uses the 24-hour clock.
 * @param disabled Whether this picker is disabled. A disabled picker does not respond to user
 * input.
 * @param minuteIncrement The increment used to generate the values shown by the minute picker.
 * The value must be in the range `0..59`. Values start at `00` and continue by this increment
 * while they are less than `60`; for example, `8` displays `00`, `08`, `16`, `24`, `32`, `40`,
 * `48`, and `56`. A value of `0` displays only `00`.
 * @throws IllegalArgumentException If [minuteIncrement] is not in the range `0..59`.
 */
@Composable
@ExperimentalFluentApi
fun TimePicker(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false,
    @IntRange(from = 0, to = 59)
    minuteIncrement: Int = 1
) = TimePickerImpl(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    is12hour = is12hour,
    disabled = disabled,
    minuteIncrement = minuteIncrement,
)

@Composable
internal fun TimePickerImpl(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false,
    @IntRange(from = 0, to = 59)
    minuteIncrement: Int = 1
) {
    require(minuteIncrement in 0..59) { "minuteIncrement must be in the range 0..59" }

    var open by remember { mutableStateOf(false) }
    val density = LocalDensity.current
    val minuteOptions = remember(minuteIncrement) {
        createMinuteOptions(minuteIncrement)
    }
    val calculatePopupAvailableSpace = rememberFlyoutAvailableSpace(flyoutDefaultPadding)
    var popupAvailableSpace by remember {
        mutableStateOf(
            FlyoutAvailableSpace(
                above = Dp.Infinity,
                below = Dp.Infinity,
                anchorHeight = 0.dp
            )
        )
    }
    val visibleItemsCount = timePickerVisibleItemsCount(popupAvailableSpace)
    val popupPositionProvider = remember(density, visibleItemsCount, open) {
        TimePickerPopupPositionProvider(density, visibleItemsCount)
    }

    BasicFlyoutContainer(
        modifier = modifier,
        flyout = {
            SelectionPopupSurface(
                expanded = open,
                positionProvider = popupPositionProvider,
                onDismissRequest = { open = false },
                contentPadding = PaddingValues(0.dp),
                revealOriginY = { popupPositionProvider.revealOriginY },
                placement = { popupPositionProvider.placement }
            ) {
                var candidateHour by remember {
                    mutableIntStateOf(
                        value?.let { if (is12hour) hour24to12(it.hour) else it.hour }
                            ?: if (is12hour) 1 else 0
                    )
                }
                var candidateMinutes by remember(value, minuteIncrement) {
                    mutableIntStateOf(alignMinuteToIncrement(value?.minute ?: 0, minuteIncrement))
                }
                var candidateSeconds by remember { mutableStateOf(0) }
                var candidateAmPm by remember {
                    mutableStateOf(if ((value?.hour ?: 0) < 12) "AM" else "PM")
                }

                Column(
                    Modifier.width(300.dp)
                ) {
                    Box {
                        // Base indicator
                        BaseIndicator(is12hour)

                        // Wheels
                        Row(Modifier.height(TimePickerItemHeight * visibleItemsCount)) {
                            // Hour
                            Box(Modifier.weight(1f)) {
                                key(visibleItemsCount) {
                                    InfiniteWheelPicker(
                                        items = if (is12hour) hours12 else hours24,
                                        initialValue = candidateHour.toString(),
                                        onSelectedValueChange = { candidateHour = it.toInt() },
                                        visibleItemsCount = visibleItemsCount,
                                        ring = true
                                    )
                                }
                            }
                            Box(
                                Modifier.width(1.dp).fillMaxHeight()
                                    .background(FluentTheme.colors.stroke.divider.default)
                            )
                            // Minute
                            Box(Modifier.weight(1f)) {
                                key(visibleItemsCount, minuteIncrement) {
                                    InfiniteWheelPicker(
                                        items = minuteOptions,
                                        initialValue = formatMinute(candidateMinutes),
                                        onSelectedValueChange = { candidateMinutes = it.toInt() },
                                        visibleItemsCount = visibleItemsCount,
                                        ring = minuteOptions.size > 1
                                    )
                                }
                            }
                            if (is12hour) {
                                Box(
                                    Modifier.width(1.dp).fillMaxHeight()
                                        .background(FluentTheme.colors.stroke.divider.default)
                                )
                                // AM/PM
                                Box(Modifier.weight(1f)) {
                                    key(visibleItemsCount) {
                                        InfiniteWheelPicker(
                                            items = amPm,
                                            initialValue = candidateAmPm,
                                            onSelectedValueChange = { candidateAmPm = it },
                                            visibleItemsCount = visibleItemsCount,
                                            ring = false
                                        )
                                    }
                                }
                            }
                        }
                    }
                    Box(Modifier.height(1.dp).fillMaxWidth().background(FluentTheme.colors.stroke.divider.default))
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        SubtleButton(
                            modifier = Modifier.padding(4.dp).height(36.dp).weight(1f),
                            onClick = {
                                if (is12hour) {
                                    onValueChange(
                                        LocalTime(
                                            hour12to24(candidateHour, candidateAmPm == "AM"),
                                            candidateMinutes,
                                            candidateSeconds
                                        )
                                    )
                                } else {
                                    onValueChange(LocalTime(candidateHour, candidateMinutes, candidateSeconds))
                                }
                                open = false
                            }) {
                            FontIcon(
                                type = FontIconPrimitive.Accept,
                                contentDescription = "Accept"
                            )
                        }
                        SubtleButton(
                            modifier = Modifier.padding(4.dp).height(38.dp).weight(1f),
                            onClick = {
                                open = false
                            }) {
                            FontIcon(
                                type = FontIconPrimitive.Cancel,
                                contentDescription = "Cancel"
                            )
                        }
                    }
                }
            }
        }
    ) {
        TimePickerButton(
            modifier = Modifier.onGloballyPositioned { coordinates ->
                popupAvailableSpace = calculatePopupAvailableSpace(coordinates)
            },
            value = value,
            is12Hour = is12hour,
            disabled = disabled,
            onClick = { open = true }
        )
    }
}

@Composable
private fun BoxScope.BaseIndicator(is24Hour: Boolean) {
    Box(
        Modifier.height(40.dp).fillMaxWidth().align(Alignment.Center)
    ) {
        Box(
            Modifier.fillMaxSize().padding(horizontal = 6.dp).background(
                color = FluentTheme.colors.fillAccent.default,
                shape = FluentTheme.shapes.control
            )
        )
        Row {
            Spacer(Modifier.weight(1f))
            Box(
                Modifier.width(1.dp).height(40.dp)
                    .background(FluentTheme.colors.stroke.control.onAccentTertiary)
            )
            Spacer(Modifier.weight(1f))
            if (is24Hour) {
                Box(
                    Modifier.width(1.dp).height(40.dp)
                        .background(FluentTheme.colors.stroke.control.onAccentTertiary)
                )
                Spacer(Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun TimePickerButton(
    modifier: Modifier,
    value: LocalTime?,
    is12Hour: Boolean,
    disabled: Boolean,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.width(300.dp),
        onClick = onClick,
        disabled = disabled
    ) {
        val labelColor = when {
            disabled -> FluentTheme.colors.text.text.tertiary
            value == null -> FluentTheme.colors.text.text.secondary
            else -> FluentTheme.colors.text.text.primary
        }
        val hour = value?.let {
            if (is12Hour) hour24to12(value.hour)
            else value.hour
        }
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = hour?.toString() ?: "hour",
            color = labelColor
        )
        Box(Modifier.size(1.dp, 30.dp).background(FluentTheme.colors.stroke.control.default))
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = value?.minute?.let { formatMinute(it) } ?: "minute",
            color = labelColor
        )
        if (is12Hour) {
            val isAm = value == null || value.hour < 12

            // TODO[i18n](TimePicker)
            Box(Modifier.size(1.dp, 30.dp).background(FluentTheme.colors.stroke.control.default))
            Text(
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                text = if (isAm) "AM" else "PM",
                color = labelColor
            )
        }
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
private fun InfiniteWheelPicker(
    items: List<String>,
    visibleItemsCount: Int,
    initialValue: String?,
    onSelectedValueChange: (String) -> Unit,
    ring: Boolean,
    itemHeight: Dp = TimePickerItemHeight,
    modifier: Modifier = Modifier
) {
    require(visibleItemsCount % 2 == 1) { "visibleItemsCount must be odd" }

    // Creates a virtual list (big enough to simulate infinite scroll)
    val virtualListSize = if (ring) items.size * 100 else items.size
    val initialValueIndex = remember(items, initialValue) {
        if (initialValue != null) items.indexOf(initialValue)
        else 0
    }
    val centerOffset = (visibleItemsCount - 1) / 2
    val actualCenterOffset = if (ring) centerOffset else 0
    val contentPadding = if (virtualListSize < visibleItemsCount) {
        itemHeight * (visibleItemsCount / 2)
    } else {
        0.dp
    }

    // Set the initial position to the center of the list
    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex =
            if (ring)
                (virtualListSize / 2 - centerOffset + initialValueIndex).coerceAtLeast(0)
            else initialValueIndex
    )

    // 当前选中的值
    val selectedValue by remember(items, listState, actualCenterOffset) {
        derivedStateOf {
            val centerIndex = listState.firstVisibleItemIndex + actualCenterOffset
            items[centerIndex % items.size]
        }
    }

    LaunchedEffect(selectedValue) {
        onSelectedValueChange(selectedValue)
    }

    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val scrollScope = rememberCoroutineScope()
    var currentTargetScrollIndex by remember { mutableStateOf(0) }
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

    fun scroll(offset: Int) {
        scrollScope.launch {
            mouseWheelSnapController.cancelAndJoin()
            val target = if (listState.isScrollInProgress) {
                currentTargetScrollIndex + offset
            } else {
                listState.firstVisibleItemIndex + offset
            }
            currentTargetScrollIndex = target
            listState.animateScrollToItem(target.fastCoerceAtLeast(0))
        }
    }

    fun next() {
        scroll(1)
    }

    fun previous() {
        scroll(-1)
    }

    fun nextPage() {
        scroll(visibleItemsCount)
    }

    fun previousPage() {
        scroll(-visibleItemsCount)
    }

    MaterialContainer(modifier.hoverable(interactionSource)) {
        LazyColumn(
            state = listState,
            flingBehavior = rememberSnapFlingBehavior(listState),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = contentPadding),
            verticalArrangement = Arrangement.Center,
            userScrollEnabled = true,
            modifier = Modifier
                .behindMaterial()
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
                .focusable().focusRequester(focusRequester)
                .onKeyEvent {
                    if (it.type == KeyEventType.KeyDown) {
                        when (it.key) {
                            Key.DirectionUp -> previous()
                            Key.DirectionDown -> next()
                            Key.PageUp -> previousPage()
                            Key.PageDown -> nextPage()
                            else -> return@onKeyEvent false
                        }
                        return@onKeyEvent true
                    }
                    return@onKeyEvent false
                }
        ) {
            items(virtualListSize) { index ->
                val actualIndex = index % items.size
                val itemValue = items[actualIndex]

                SubtleButton(
                    modifier = Modifier.height(itemHeight).fillMaxWidth().padding(horizontal = 8.dp, vertical = 2.dp),
                    onClick = {
                        // Select this item
                        scrollScope.launch {
                            listState.animateScrollToItem(index - actualCenterOffset)
                        }
                    }
                ) {
                    WheelPickerItemText(
                        text = itemValue,
                        itemIndex = index,
                        listState = listState,
                        itemSizePx = itemSizePx
                    )
                }
            }
        }
        if (hovered) {
            CaretButton(
                type = FontIconPrimitive.CaretUp,
                contentDescription = "Up",
                onClick = { previous() },
                modifier = Modifier.align(Alignment.TopCenter)
                    .materialOverlay(MaterialDefaults.acrylicDefault())
                    .fillMaxWidth()
            )

            CaretButton(
                type = FontIconPrimitive.CaretDown,
                contentDescription = "Down",
                onClick = { next() },
                modifier = Modifier.align(Alignment.BottomCenter)
                    .materialOverlay(MaterialDefaults.acrylicDefault())
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
private fun WheelPickerItemText(
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

            // LazyListItemInfo.offset doesn't include the visual offset from content padding.
            // Convert it to the LazyColumn's coordinate space before comparing it with the
            // centered selection area.
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
        modifier = Modifier
            .drawWithCache {
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
        targetIndex = (targetIndex + direction)
            .coerceIn(0, itemCount - 1)
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
private fun CaretButton(
    type: FontIconPrimitive,
    contentDescription: String,
    onClick: () -> Unit,
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
        modifier = modifier.height(TimePickerItemHeight),
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

private fun hour24to12(value: Int): Int = when {
    value == 0 -> 12 // 0 -> 12AM
    value <= 12 -> value
    else -> value - 12
}

private fun hour12to24(value: Int, isAm: Boolean): Int {
    val value = when {
        value == 12 -> 0
        else -> value
    }
    return if (isAm) value else value + 12
}

private val hours24 = (0..23).map { it.toString() }
private val hours12 = (1..12).map { it.toString() }

private val amPm = listOf("AM", "PM")

private fun createMinuteOptions(minuteIncrement: Int): List<String> =
    if (minuteIncrement == 0) {
        listOf(formatMinute(0))
    } else {
        (0..59 step minuteIncrement).map(::formatMinute)
    }

private fun alignMinuteToIncrement(minute: Int, minuteIncrement: Int): Int =
    if (minuteIncrement == 0) 0 else minute - minute % minuteIncrement

private val TimePickerItemHeight = 40.dp
private val TimePickerFooterHeight = 47.dp
private val TimePickerVisibleItemCounts = listOf(9, 7, 5, 3)

private fun timePickerVisibleItemsCount(
    availableSpace: FlyoutAvailableSpace
): Int {
    val anchorHalfHeight = availableSpace.anchorHeight / 2f
    val overlapSpaceAbove = availableSpace.above + anchorHalfHeight
    val overlapSpaceBelow = availableSpace.below + anchorHalfHeight
    val directionalSpace = maxOf(availableSpace.above, availableSpace.below)

    return TimePickerVisibleItemCounts.firstOrNull { visibleItemsCount ->
        val wheelHeight = TimePickerItemHeight * visibleItemsCount
        val popupHeight = wheelHeight + TimePickerFooterHeight
        val selectedCenter = wheelHeight / 2f
        val overlapFits = selectedCenter <= overlapSpaceAbove &&
            popupHeight - selectedCenter <= overlapSpaceBelow
        val directionalPlacementFits = popupHeight <= directionalSpace
        overlapFits || directionalPlacementFits
    } ?: TimePickerVisibleItemCounts.last()
}

@Stable
private class TimePickerPopupPositionProvider(
    density: Density,
    visibleItemsCount: Int
) : FlyoutPositionProvider(density) {
    private val selectedCenterY = with(density) {
        (TimePickerItemHeight * visibleItemsCount / 2f).roundToPx()
    }
    private val windowPadding = with(density) { flyoutDefaultPadding.roundToPx() }
    var revealOriginY by mutableIntStateOf(0)
        private set

    var placement by mutableStateOf(SelectionPopupPlacement.Overlap)
        private set

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val position = calculateSelectionPopupPosition(
            anchorBounds = anchorBounds,
            windowSize = windowSize,
            popupContentSize = popupContentSize,
            selectedCenterY = selectedCenterY,
            windowPadding = windowPadding,
            fallback = SelectionPopupFallback.Directional
        )

        revealOriginY = position.revealOriginY
        placement = position.placement
        targetPlacement = when (position.placement) {
            SelectionPopupPlacement.Overlap -> FlyoutPlacement.Full
            SelectionPopupPlacement.Above -> FlyoutPlacement.Top
            SelectionPopupPlacement.Below -> FlyoutPlacement.Bottom
        }
        applyAnimation = true
        return position.offset
    }
}

private fun formatMinute(value: Int): String =
    if (value < 10) "0$value"
    else value.toString()
