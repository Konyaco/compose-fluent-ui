package io.github.composefluent.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.*
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastCoerceAtLeast
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalTime
import kotlin.math.roundToInt

@Composable
expect fun TimePicker(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false
)

@Composable
internal fun TimePickerImpl(
    value: LocalTime?,
    onValueChange: (LocalTime?) -> Unit,
    modifier: Modifier = Modifier,
    is12hour: Boolean = false,
    disabled: Boolean = false,
    userScrollEnabled: Boolean
) {
    var open by remember { mutableStateOf(false) }

    BasicFlyoutContainer(
        flyout = {
            BasicFlyout(
                visible = open,
                onDismissRequest = { open = false },
                contentPadding = PaddingValues(0.dp)
            ) {
                var candidateHour by remember { mutableStateOf(0) }
                var candidateMinutes by remember { mutableStateOf(0) }
                var candidateSeconds by remember { mutableStateOf(0) }
                var candidateAmPm by remember { mutableStateOf("AM") }

                Column(
                    Modifier.width(300.dp)
                        // TODO[optimize](time-picker): Should we use acrylic effect?
                        // If we use acrylic effect, it would be difficult to hide the text below caret buttons
                        .background(FluentTheme.colors.background.acrylic.default)
                ) {
                    Box {
                        // Base indicator
                        BaseIndicator(is12hour)

                        // Wheels
                        Row(Modifier.height(360.dp)) {
                            // Hour
                            Box(Modifier.weight(1f)) {
                                InfiniteWheelPicker(
                                    items = if (is12hour) hours12 else hours24,
                                    initialValue = value?.hour?.toString(),
                                    onSelectedValueChange = { candidateHour = it.toInt() },
                                    visibleItemsCount = 9,
                                    ring = true,
                                    userScrollEnabled = userScrollEnabled
                                )
                            }
                            Box(
                                Modifier.width(1.dp).fillMaxHeight()
                                    .background(FluentTheme.colors.stroke.divider.default)
                            )
                            // Minute
                            Box(Modifier.weight(1f)) {
                                InfiniteWheelPicker(
                                    items = minutes,
                                    initialValue = value?.minute?.let(::formatMinute),
                                    onSelectedValueChange = { candidateMinutes = it.toInt() },
                                    visibleItemsCount = 9,
                                    ring = true,
                                    userScrollEnabled = userScrollEnabled
                                )
                            }
                            if (is12hour) {
                                Box(
                                    Modifier.width(1.dp).fillMaxHeight()
                                        .background(FluentTheme.colors.stroke.divider.default)
                                )
                                // AM/PM
                                Box(Modifier.weight(1f)) {
                                    InfiniteWheelPicker(
                                        items = amPm,
                                        initialValue = if ((value?.hour ?: 0) < 12) "AM" else "PM",
                                        onSelectedValueChange = { candidateAmPm = it },
                                        visibleItemsCount = 9,
                                        ring = false,
                                        userScrollEnabled = userScrollEnabled
                                    )
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
                                    onValueChange(LocalTime(candidateHour, candidateMinutes, candidateSeconds))
                                } else {
                                    onValueChange(
                                        LocalTime(
                                            hour12to24(candidateHour, candidateAmPm == "AM"),
                                            candidateMinutes,
                                            candidateSeconds
                                        )
                                    )
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
            modifier = modifier,
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

@Composable
private fun InfiniteWheelPicker(
    items: List<String>,
    visibleItemsCount: Int,
    initialValue: String?,
    onSelectedValueChange: (String) -> Unit,
    ring: Boolean,
    itemHeight: Dp = 40.dp,
    userScrollEnabled: Boolean,
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
    val contentPadding = if (items.size < visibleItemsCount) itemHeight * (visibleItemsCount / 2) else 0.dp

    // Set the initial position to the center of the list
    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex =
            if (ring)
                (virtualListSize / 2 - centerOffset + initialValueIndex).coerceAtLeast(0)
            else initialValueIndex
    )

    // 当前选中的值
    val selectedValue by remember {
        derivedStateOf {
            val centerIndex = listState.firstVisibleItemIndex + centerOffset
            items[centerIndex % items.size]
        }
    }

    LaunchedEffect(selectedValue) {
        onSelectedValueChange(selectedValue)
    }

    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()

    Box(modifier.hoverable(interactionSource)) {
        val scrollScope = rememberCoroutineScope()
        var currentTargetScrollIndex by remember { mutableStateOf(0) }

        fun scroll(offset: Int) {
            scrollScope.launch {
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

        val focusRequester = remember { FocusRequester() }

        LazyColumn(
            state = listState,
            flingBehavior = rememberSnapFlingBehavior(listState), // Only use fling behavior for touchpad gesture.
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = contentPadding),
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    awaitEachGesture {
                        val event = awaitPointerEvent()
                        if (event.type == PointerEventType.Scroll) {
                            val change = event.changes.first()
                            // TODO[optimize](time-picker): Detect gesture scroll
                            if (change.scrollDelta.y > 0F) {
                                next()
                            } else if (change.scrollDelta.y < 0F) {
                                previous()
                            }
                        } else if (event.type == PointerEventType.Enter) { // Focus for receiving key input
                            focusRequester.requestFocus()
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
                },
            userScrollEnabled = userScrollEnabled // TODO[optimize](time-picker): Detect gesture scroll
        ) {
            items(virtualListSize) { index ->
                val actualIndex = index % items.size
                val itemValue = items[actualIndex]
                // Hide to leave space for caret buttons
                val hide = false
                /*val hide = if (hovered) {
                    if (listState.isScrollInProgress) {
                        index <= listState.firstVisibleItemScrollOffset || index >= currentTargetScrollIndex + visibleItemsCount - 1
                    } else {
                        index <= listState.firstVisibleItemIndex || index >= listState.firstVisibleItemIndex + visibleItemsCount - 1
                    }
                } else {
                    false
                }*/

                SubtleButton(
                    modifier = Modifier.height(itemHeight).fillMaxWidth().padding(horizontal = 8.dp, vertical = 2.dp)
                        .graphicsLayer {
                            alpha = if (hide) 0f else 1f
                        },
                    onClick = {
                        // Select this item
                        scrollScope.launch {
                            listState.animateScrollToItem(index - actualCenterOffset)
                        }
                    }
                ) {
                    // TODO[optimize](time-picker): Use brush to implement color inversion?

                    // Inverse color after scrolling half of the item
                    val firstOffset = with(LocalDensity.current) {
                        listState.firstVisibleItemScrollOffset.toDp()
                    }
                    val offset = if (firstOffset >= itemHeight / 2) 1 else 0
                    val isCentered = (listState.firstVisibleItemIndex + actualCenterOffset + offset) == index

                    val textColor = if (isCentered) FluentTheme.colors.text.onAccent.primary
                    else FluentTheme.colors.text.text.primary

                    Text(
                        text = itemValue,
                        style = FluentTheme.typography.body,
                        color = textColor,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        if (hovered) {
            CaretButton(
                type = FontIconPrimitive.CaretUp,
                contentDescription = "Up",
                onClick = { previous() },
                modifier = Modifier.align(Alignment.TopCenter).fillMaxWidth()
            )

            CaretButton(
                type = FontIconPrimitive.CaretDown,
                contentDescription = "Down",
                onClick = { next() },
                modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth()
            )
        }
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
    Box(
        modifier = modifier.height(40.dp)
            .background(FluentTheme.colors.background.acrylic.default)
            .clickable(onClick = onClick, interactionSource = interactionSource, indication = null),
        contentAlignment = Alignment.Center
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

private val minutes = (0..59).map(::formatMinute)
private val amPm = listOf("AM", "PM")

private fun formatMinute(value: Int): String =
    if (value < 10) "0$value"
    else value.toString()

