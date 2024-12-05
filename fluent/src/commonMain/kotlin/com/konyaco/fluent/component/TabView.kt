package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.relocation.BringIntoViewResponder
import androidx.compose.foundation.relocation.bringIntoViewResponder
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

@Composable
fun TabRow(
    selectedKey: () -> Any,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    header: @Composable () -> Unit = {},
    footer: @Composable () -> Unit = {},
    borderColor: Color = TabViewDefaults.defaultBorderColor,
    scrollActionButtonColors: VisualStateScheme<ButtonColor> = TabViewDefaults.scrollActionColors(),
    content: LazyListScope.() -> Unit
) {
    val rowRect = remember { mutableStateOf(Rect.Zero) }
    val containerWidth = remember { mutableIntStateOf(0) }
    Box(
        contentAlignment = Alignment.BottomStart
    ) {
        val padding = 8.dp
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = modifier
                .zIndex(1f)
                .clip(RectangleShape)
                .onSizeChanged { containerWidth.value = it.width }
        ) {

            val selectedItem = remember {
                derivedStateOf {
                    state.layoutInfo.visibleItemsInfo.firstOrNull { it.key == selectedKey() }
                }
            }
            Box(modifier = Modifier
                .zIndex(2f)
                .height(2.dp)
                .drawTabRowBorder(
                    bottomRadius = FluentTheme.cornerRadius.control,
                    borderColor = borderColor,
                    containerWidth = { containerWidth.value },
                    rowRect = { rowRect.value },
                    selectedItem = { selectedItem.value }
                )
            )
            Box(modifier = Modifier.widthIn(padding)) {
                header()
            }
            val displayScrollController by remember {
                derivedStateOf { state.canScrollForward || state.canScrollBackward }
            }
            val coroutineScope = rememberCoroutineScope()
            AnimatedVisibility(displayScrollController) {
                TabScrollActionButton(
                    onClick = { coroutineScope.launch { state.animateScrollBy(-state.layoutInfo.viewportSize.width / 3f) } },
                    icon = FontIconPrimitive.CaretLeft,
                    enabled = state.canScrollBackward,
                    colors = scrollActionButtonColors,
                    modifier = Modifier.padding(end = 4.dp)
                )
            }
            LazyRow(
                state = state,
                content = content,
                contentPadding = PaddingValues(horizontal = 4.dp),
                modifier = Modifier
                    .onGloballyPositioned { rowRect.value = it.boundsInParent() }
                    .weight(1f)
                    .wrapContentWidth(Alignment.Start)
                    .height(TabViewHeight)
                    .zIndex(1f)
            )
            AnimatedVisibility(displayScrollController) {
                TabScrollActionButton(
                    onClick = { coroutineScope.launch { state.animateScrollBy(state.layoutInfo.viewportSize.width / 3f) } },
                    icon = FontIconPrimitive.CaretRight,
                    enabled = state.canScrollForward,
                    colors = scrollActionButtonColors,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Box(modifier = Modifier.widthIn(padding)) {
                footer()
            }
        }
    }
}

@Composable
fun TabItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    endDividerVisible: Boolean = !selected,
    interactionSource: MutableInteractionSource? = null,
    colors: VisualStateScheme<TabViewItemColor> = if (selected) {
        TabViewDefaults.selectedItemColors()
    } else {
        TabViewDefaults.defaultItemColors()
    },
    icon: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {}
) {
    TabItem(
        selected = selected,
        onSelectedChanged = onSelectedChanged,
        modifier = modifier,
        endDividerVisible = endDividerVisible,
        interactionSource = interactionSource,
        colors = colors,
        content = {
            Row(
                horizontalArrangement = TabItemContentArrangement,
                verticalAlignment = Alignment.CenterVertically
            ) {
                icon()
                text()
                trailing()
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    endDividerVisible: Boolean = !selected,
    interactionSource: MutableInteractionSource? = null,
    colors: VisualStateScheme<TabViewItemColor> = if (selected) {
        TabViewDefaults.selectedItemColors()
    } else {
        TabViewDefaults.defaultItemColors()
    },
    content: @Composable () -> Unit
) {
    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }

    val direction = LocalLayoutDirection.current
    val color = colors.schemeFor(targetInteractionSource.collectVisualState(false))
    val density = LocalDensity.current
    val selectedValue = rememberUpdatedState(selected)
    val bottomRadius = FluentTheme.cornerRadius.control
    val topRadius = FluentTheme.cornerRadius.overlay
    Box(
        contentAlignment = Alignment.CenterStart,
        propagateMinConstraints = true,
        modifier = modifier
            .then(
                if (selected) {
                    Modifier.drawTabViewItemBorder(
                        color = color.borderColor,
                        shape = TabViewSelectedShape(
                            isInner = false,
                            topRadius = topRadius,
                            bottomRadius = bottomRadius
                        ),
                        direction = direction
                    )
                } else {
                    Modifier
                }
            )
            .bringIntoViewResponder(
                remember(density, selectedValue, bottomRadius) {
                    TabItemBringIntoViewResponder(density, bottomRadius) { selectedValue.value }
                }
            )
            .clickable(
                indication = null,
                interactionSource = targetInteractionSource
            ) { onSelectedChanged(!selected) }
            .background(
                color = color.fillColor,
                shape = if (selected) {
                    TabViewSelectedShape(isInner = true, topRadius, bottomRadius)
                } else {
                    RoundedCornerShape(topStart = topRadius, topEnd = topRadius)
                }
            )
            .heightIn(TabViewHeight)
            .zIndex(if (selected) 1f else 0f)
    ) {
        Box(
            contentAlignment = Alignment.CenterStart,
            propagateMinConstraints = true,
            modifier = Modifier
                .heightIn(TabViewHeight)
                .padding(start = 8.dp, end = 4.dp)
        ) {
            CompositionLocalProvider(
                LocalTextStyle provides if (selected) {
                    FluentTheme.typography.bodyStrong
                } else {
                    FluentTheme.typography.body
                },
                LocalContentColor provides color.contentColor,
                LocalContentAlpha provides color.contentColor.alpha
            ) {
                content()
            }
        }
        if (endDividerVisible) {
            Box(
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterEnd)
                    .size(1.dp, 16.dp)
                    .background(color.endDividerColor)
            )
        }
    }

}

@Stable
data class TabViewItemColor(
    val borderColor: Color,
    val fillColor: Color,
    val contentColor: Color,
    val endDividerColor: Color = Color.Transparent
)

object TabViewDefaults {

    val defaultBorderColor: Color
        @Composable
        get() = FluentTheme.colors.stroke.card.default

    @Stable
    @Composable
    fun defaultItemColors(
        default: TabViewItemColor = TabViewItemColor(
            borderColor = defaultBorderColor,
            fillColor = Color.Transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            endDividerColor = FluentTheme.colors.stroke.divider.default
        ),
        hovered: TabViewItemColor = default.copy(
            endDividerColor = Color.Transparent,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.secondary
        ),
        pressed: TabViewItemColor = default.copy(
            endDividerColor = Color.Transparent,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.default,
            contentColor = FluentTheme.colors.text.text.tertiary
        ),
        disabled: TabViewItemColor = default
    ): VisualStateScheme<TabViewItemColor> = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun selectedItemColors(
        default: TabViewItemColor = TabViewItemColor(
            borderColor = defaultBorderColor,
            fillColor = FluentTheme.colors.background.solid.tertiary,
            contentColor = FluentTheme.colors.text.text.primary,
            endDividerColor = Color.Transparent
        ),
        hovered: TabViewItemColor = default,
        pressed: TabViewItemColor = default,
        disabled: TabViewItemColor = default
    ): VisualStateScheme<TabViewItemColor> = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun defaultItemTitleBarColors(
        default: TabViewItemColor = TabViewItemColor(
            borderColor = defaultBorderColor,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            endDividerColor = FluentTheme.colors.stroke.divider.default
        ),
        hovered: TabViewItemColor = default.copy(
            endDividerColor = Color.Transparent,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.secondary
        ),
        pressed: TabViewItemColor = default.copy(
            endDividerColor = Color.Transparent,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.default,
            contentColor = FluentTheme.colors.text.text.tertiary
        ),
        disabled: TabViewItemColor = default
    ): VisualStateScheme<TabViewItemColor> = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun selectedItemTitleBarColors(
        default: TabViewItemColor = TabViewItemColor(
            borderColor = FluentTheme.colors.stroke.card.default,
            fillColor = FluentTheme.colors.background.layerOnMicaBaseAlt.default,
            contentColor = FluentTheme.colors.text.text.primary,
            endDividerColor = Color.Transparent
        ),
        hovered: TabViewItemColor = default,
        pressed: TabViewItemColor = default,
        disabled: TabViewItemColor = default
    ): VisualStateScheme<TabViewItemColor> = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun scrollActionColors() = ButtonDefaults.subtleButtonColors(
        default = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(Color.Transparent)
        )
    )

    @Composable
    fun TabCloseButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        padding: PaddingValues = PaddingValues(start = 4.dp),
        enabled: Boolean = true,
        colors: VisualStateScheme<ButtonColor> = ButtonDefaults.subtleButtonColors()
    ) {
        Button(
            onClick = onClick,
            content = {
                FontIcon(type = FontIconPrimitive.Close, contentDescription = null)
            },
            iconOnly = true,
            buttonColors = colors,
            disabled = !enabled,
            modifier = modifier
                .padding(padding)
                .heightIn(TabViewHeight)
                .wrapContentHeight(Alignment.CenterVertically)
                .defaultMinSize(minWidth = TabButtonSize.width, minHeight = TabButtonSize.height),
        )
    }

    @Composable
    fun TabAddButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        padding: PaddingValues = PaddingValues(start = 4.dp),
        enabled: Boolean = true,
        colors: VisualStateScheme<ButtonColor> = ButtonDefaults.subtleButtonColors()
    ) {
        Button(
            onClick = onClick,
            content = {
                FontIcon(type = FontIconPrimitive.Add, contentDescription = null)
            },
            iconOnly = true,
            buttonColors = colors,
            disabled = !enabled,
            modifier = modifier
                .padding(padding)
                .heightIn(TabViewHeight)
                .wrapContentHeight(Alignment.CenterVertically)
                .defaultMinSize(minWidth = TabButtonSize.width, minHeight = TabButtonSize.height),
        )
    }

}

@ExperimentalFluentApi
@Composable
fun rememberTabItemEndDividerController(
    state: LazyListState,
    selectedKey: () -> Any
): TabItemEndDividerController {
    val controller = remember(state, selectedKey) {
        TabItemEndDividerController(state, selectedKey)
    }
    controller.collectState()
    return controller
}

@ExperimentalFluentApi
class TabItemEndDividerController(
    private val state: LazyListState,
    private val selectedKey: () -> Any,
) {
    private val hoveredItems = mutableStateMapOf<Any, Int>()
    private var hideDividerItems by mutableStateOf(emptySet<Any>())

    @Composable
    internal fun collectState() {
        LaunchedEffect(state) {
            combine(
                snapshotFlow { hoveredItems.toMap() },
                snapshotFlow { selectedKey() },
                snapshotFlow { state.layoutInfo.visibleItemsInfo }
            ) { hoveredItems, selectedKey, itemsInfo ->
                buildSet {
                    itemsInfo.forEachIndexed { index, lazyListItemInfo ->
                        if (lazyListItemInfo.key == selectedKey || hoveredItems.any { it.key == lazyListItemInfo.key }) {
                            val previousKey = itemsInfo.getOrNull(index - 1)?.key
                            previousKey?.let(this::add)
                        }
                    }
                }

            }.collectLatest {
                hideDividerItems = it
            }
        }
    }

    @Composable
    fun attach(key: Any, interactionSource: InteractionSource): Boolean {
        val isHovered = interactionSource.collectIsHoveredAsState()
        LaunchedEffect(interactionSource) {
            snapshotFlow {
                isHovered.value
            }.collectLatest { hovered ->
                if (hovered) {
                    hoveredItems[key] = 0
                } else {
                    hoveredItems.remove(key)
                }
            }
        }
        DisposableEffect(interactionSource) {
            onDispose {
                hoveredItems.remove(key)
            }
        }
        val state = remember { mutableStateOf(true) }
        LaunchedEffect(hideDividerItems) {
            state.value = !hideDividerItems.contains(key)
        }
        return state.value
    }
}

@Composable
private fun TabScrollActionButton(
    onClick: () -> Unit,
    icon: FontIconPrimitive,
    modifier: Modifier = Modifier,
    enabled: Boolean = false,
    colors: VisualStateScheme<ButtonColor>
) {
    RepeatButton(
        onClick = onClick,
        content = {
            FontIconSolid8(
                type = icon,
                contentDescription = null,
                modifier = Modifier
            )
        },
        iconOnly = true,
        buttonColors = colors,
        disabled = !enabled,
        modifier = modifier
            .heightIn(TabViewHeight)
            .wrapContentHeight(Alignment.CenterVertically)
            .defaultMinSize(minWidth = TabButtonSize.width, minHeight = TabButtonSize.height),
    )
}

@Immutable
@Stable
private class TabViewSelectedShape(val isInner: Boolean, val topRadius: Dp, val bottomRadius: Dp) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return with(density) {
            Outline.Generic(Path().apply {
                val strokePadding = StrokeSize.toPx() / 2f
                val innerPadding = if (isInner) strokePadding else 0f
                val bottomRadius = bottomRadius.toPx() - innerPadding
                val topRadius = topRadius.toPx() - innerPadding
                val topPadding = StrokeSize.toPx() + innerPadding
                val horizontalOffset = bottomRadius - StrokeSize.toPx() / 2f - innerPadding

                moveTo(-horizontalOffset, size.height - strokePadding + innerPadding / 2)
                cubicTo(
                    x1 = bottomRadius - horizontalOffset,
                    y1 = size.height - strokePadding,
                    x2 = bottomRadius - horizontalOffset,
                    y2 = size.height - bottomRadius - strokePadding,
                    x3 = bottomRadius - horizontalOffset,
                    y3 = size.height - bottomRadius - strokePadding
                )
                lineTo(bottomRadius - horizontalOffset, topRadius + topPadding)
                cubicTo(
                    x1 = bottomRadius - horizontalOffset,
                    y1 = topPadding,
                    x2 = bottomRadius - horizontalOffset + topRadius,
                    y2 = topPadding,
                    x3 = bottomRadius - horizontalOffset + topRadius,
                    y3 = topPadding
                )
                lineTo(size.width - bottomRadius - topRadius + horizontalOffset, topPadding)
                cubicTo(
                    x1 = size.width - bottomRadius + horizontalOffset,
                    y1 = topPadding,
                    x2 = size.width - bottomRadius + horizontalOffset,
                    y2 = topPadding + topRadius,
                    x3 = size.width - bottomRadius + horizontalOffset,
                    y3 = topRadius + topPadding
                )
                lineTo(size.width - bottomRadius + horizontalOffset, size.height - bottomRadius - strokePadding)
                cubicTo(
                    x1 = size.width - bottomRadius + horizontalOffset,
                    y1 = size.height - strokePadding + innerPadding / 2,
                    x2 = size.width + horizontalOffset,
                    y2 = size.height - strokePadding + innerPadding / 2,
                    x3 = size.width + horizontalOffset,
                    y3 = size.height - strokePadding + innerPadding / 2
                )
                lineTo(size.width + horizontalOffset, size.height + strokePadding * 2)
                lineTo(0f - horizontalOffset, size.height + strokePadding * 2)
                lineTo(0f - horizontalOffset, size.height)
                close()
            })
        }
    }
}


@Stable
private fun Modifier.drawTabRowBorder(
    bottomRadius: Dp,
    borderColor: Color,
    containerWidth: () -> Int,
    rowRect: () -> Rect,
    selectedItem: () -> LazyListItemInfo?,
) = drawWithCache {
    val path = Path()
    val strokeSizePx = StrokeSize.toPx()
    onDrawWithContent {
        path.rewind()
        path.apply {
            moveTo(strokeSizePx / 2, size.height - strokeSizePx)
            val currentItem = selectedItem()
            val itemPadding = bottomRadius.toPx()
            if (currentItem != null) {
                val rowRectValue = rowRect()
                val currentItemOffset = (rowRectValue.left + currentItem.offset)
                lineTo(
                    (currentItemOffset).coerceIn(
                        rowRectValue.left,
                        rowRectValue.right
                    ),
                    size.height - strokeSizePx / 2
                )
                moveTo(
                    (currentItemOffset + currentItem.size + 2 * itemPadding).coerceIn(
                        rowRectValue.left,
                        rowRectValue.right
                    ),
                    size.height - strokeSizePx / 2
                )
                lineTo(
                    containerWidth() - strokeSizePx / 2,
                    size.height - strokeSizePx / 2
                )

            } else {
                lineTo(
                    containerWidth() - strokeSizePx / 2,
                    size.height - strokeSizePx / 2
                )
            }
        }
        drawPath(
            path = path,
            color = borderColor,
            style = Stroke(strokeSizePx)
        )
        drawContent()
    }
}

@Stable
private fun Modifier.drawTabViewItemBorder(
    color: Color,
    shape: Shape,
    direction: LayoutDirection,
) = drawWithCache {
    onDrawWithContent {
        drawContent()
        val outline = shape.createOutline(size, direction, this)
        val strokeSize = 1.dp.toPx()
        when (outline) {
            is Outline.Rectangle -> {
                drawRect(
                    color = color,
                    style = Stroke(strokeSize),
                    size = outline.rect.size,
                    topLeft = outline.rect.topLeft
                )
            }

            is Outline.Rounded -> {
                drawRoundRect(
                    color = color,
                    topLeft = Offset(outline.roundRect.top, outline.roundRect.left),
                    size = Size(
                        width = outline.roundRect.width,
                        height = outline.roundRect.height
                    ),
                    cornerRadius = outline.roundRect.topLeftCornerRadius,
                    style = Stroke(strokeSize)
                )
            }

            is Outline.Generic -> {
                drawPath(outline.path, color, style = Stroke(strokeSize))
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Stable
private class TabItemBringIntoViewResponder(
    density: Density,
    bottomRadius: Dp,
    val selected: () -> Boolean,
) : BringIntoViewResponder {
    val paddingSize = with(density) { bottomRadius.toPx() }

    override suspend fun bringChildIntoView(localRect: () -> Rect?) {}

    override fun calculateRectForParent(localRect: Rect): Rect {
        return Snapshot.withoutReadObservation {
            if (selected()) {
                localRect.copy(
                    left = localRect.left - paddingSize,
                    right = localRect.right + paddingSize
                )
            } else {
                localRect
            }
        }
    }
}

private val StrokeSize = 1.dp
private val TabButtonSize = DpSize(32.dp, 24.dp)

//TODO combine TextBoxContentArrangement
@Stable
private object TabItemContentArrangement : Arrangement.Horizontal {

    override val spacing: Dp = 8.dp

    override fun Density.arrange(
        totalSize: Int,
        sizes: IntArray,
        layoutDirection: LayoutDirection,
        outPositions: IntArray
    ) {
        with(Arrangement.Start) {
            arrange(totalSize, sizes, layoutDirection, outPositions)
        }
        if (sizes.size < 2) return
        if (layoutDirection == LayoutDirection.Rtl) {
            outPositions[outPositions.lastIndex] = 0
        } else {
            outPositions[outPositions.lastIndex] = totalSize - sizes.last()
        }
    }
}

private val TabViewHeight = 32.dp