package io.github.composefluent.component

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
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.node.DelegatingNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.requireLayoutCoordinates
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.relocation.BringIntoViewModifierNode
import androidx.compose.ui.relocation.bringIntoView
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentAlpha
import io.github.composefluent.LocalContentColor
import io.github.composefluent.LocalTextStyle
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

/**
 * A composable function that creates a row of tabs with a dynamic underline indicator.
 *
 * This function provides a layout for a row of tabs with the following features:
 * - **Selected Tab Underline:** Displays a dynamic underline that moves and resizes to match the currently selected tab.
 * - **Scrolling:** Supports horizontal scrolling of tabs when they exceed the available space.
 * - **Header and Footer:** Allows for adding custom composable content before and after the tab list.
 * - **Scroll Actions:** Includes scroll action buttons (left/right arrows) to navigate the tabs when scrolling is needed.
 * - **Customization:** Offers options to customize the border color and the visual style of the scroll action buttons.
 *
 * @param selectedKey A lambda that returns the key of the currently selected tab. This key should uniquely identify each tab item.
 * @param modifier The [Modifier] to be applied to the root container of the TabRow.
 * @param state The [LazyListState] for the underlying [LazyRow] used to display the tabs, allowing control over the scroll state. Defaults to a new [rememberLazyListState].
 * @param header A composable function that provides the header content to be placed before the tab list. Defaults to an empty composable.
 * @param footer A composable function that provides the footer content to be placed after the tab list. Defaults to an empty composable.
 * @param borderColor The color of the underline indicator displayed beneath the selected tab. Defaults to [TabViewDefaults.defaultBorderColor].
 * @param scrollActionButtonColors A [VisualStateScheme] that defines the colors of the scroll action buttons in different interaction states. Defaults to [TabViewDefaults.scrollActionColors].
 * @param content A [LazyListScope] lambda that defines the content of the tab items within the [LazyRow].
 */
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
                    val currentKey = selectedKey()
                    state.layoutInfo.visibleItemsInfo.firstOrNull { it.key == currentKey }
                }
            }
            val selectedItemScrollOffset = remember(selectedItem, state) {
                derivedStateOf {
                    val selectedItem = selectedItem.value ?: return@derivedStateOf 0
                    selectedItem.offset + state.firstVisibleItemScrollOffset - state.firstVisibleItemScrollOffset
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
                    selectedItem = { selectedItem.value },
                    selectedItemScrollOffset = { selectedItemScrollOffset.value }
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

/**
 * A composable function that represents a single item within a tab view.
 *
 * This function provides a customizable tab item with text, icon, and trailing content,
 * along with visual feedback for selection and interaction states.
 *
 * @param selected Indicates whether the tab item is currently selected.
 * @param onSelectedChanged A callback function triggered when the selection state of the tab item changes.
 *                          It receives the new selection state as a boolean parameter.
 * @param text A composable lambda that defines the text content to be displayed in the tab item.
 * @param modifier A [Modifier] to customize the layout and appearance of the tab item.
 * @param endDividerVisible Indicates whether a divider should be displayed at the end of the tab item.
 *                          Defaults to `true` when the item is not selected.
 * @param interactionSource An optional [MutableInteractionSource] to observe and control the interactions
 *                          with the tab item.
 * @param colors A [VisualStateScheme] that defines the colors to be used for different states of the tab item
 *               (e.g., selected, unselected, hovered).
 *               Defaults to `TabViewDefaults.selectedItemColors()` when the item is selected,
 *               and `TabViewDefaults.defaultItemColors()` otherwise.
 * @param icon A composable lambda that defines the icon content to be displayed in the tab item.
 *             Defaults to an empty composable.
 * @param trailing A composable lambda that defines the trailing content to be displayed in the tab item.
 *                 Defaults to an empty composable.
 */
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
                Box(modifier = Modifier.weight(1f, fill = false)) { text() }
                trailing()
            }
        }
    )
}

/**
 * A single item within a [TabRow].
 *
 * @param selected Whether this item is currently selected.
 * @param onSelectedChanged Called when the selected state of this item changes.
 * @param modifier Modifier to be applied to the item.
 * @param endDividerVisible Whether the divider on the end of the item should be visible. Defaults to `false` if `selected` is `true`, `true` otherwise.
 * @param interactionSource The [MutableInteractionSource] representing the stream of [androidx.compose.foundation.interaction.Interaction]s for this item.
 * @param colors The [VisualStateScheme] that defines the colors used for different interaction states. Defaults to [TabViewDefaults.selectedItemColors] when `selected` is true, [TabViewDefaults.defaultItemColors] otherwise.
 * @param content The composable content of this item.
 */
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
            .then(TabItemBringIntoViewModifierNodeElement(
                density = density,
                bottomRadius = bottomRadius
            ))
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

/**
 * Represents the color scheme for a tab view item.
 *
 * @property borderColor The color of the border around the tab item.
 * @property fillColor The fill color of the tab item's background.
 * @property contentColor The color of the content (text, icons) within the tab item.
 * @property endDividerColor The color of the divider displayed at the end of the tab item.
 * Defaults to [Color.Transparent].
 */
@Stable
data class TabViewItemColor(
    val borderColor: Color,
    val fillColor: Color,
    val contentColor: Color,
    val endDividerColor: Color = Color.Transparent
)

/**
 * Contains the default values used for [TabItem] and [TabRow].
 */
object TabViewDefaults {

    /**
     * The default border color used for the tab row and tab items.
     * This color is derived from the Fluent theme's card stroke color.
     */
    val defaultBorderColor: Color
        @Composable
        get() = FluentTheme.colors.stroke.card.default

    /**
     * Creates a [VisualStateScheme] for the default colors of a [TabItem].
     *
     * @param default The default [TabViewItemColor] to use when the [TabItem] is in its default state.
     * @param hovered The [TabViewItemColor] to use when the [TabItem] is hovered.
     * @param pressed The [TabViewItemColor] to use when the [TabItem] is pressed.
     * @param disabled The [TabViewItemColor] to use when the [TabItem] is disabled.
     * @return A [VisualStateScheme] that defines the color scheme for the [TabItem] in different states.
     */
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

    /**
     * Creates a [VisualStateScheme] for the colors of a selected [TabItem].
     *
     * @param default The default color scheme for a selected tab item.
     * @param hovered The color scheme for a selected tab item when hovered.
     * @param pressed The color scheme for a selected tab item when pressed.
     * @param disabled The color scheme for a selected tab item when disabled.
     * @return A [VisualStateScheme] representing the color states of a selected tab item.
     */
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

    /**
     * Creates a [VisualStateScheme] for the colors of a [TabItem] in a title bar style, where the item
     * appears on a layered background.
     *
     * @param default The default [TabViewItemColor] for the item.
     * @param hovered The [TabViewItemColor] for the item when it is hovered.
     * @param pressed The [TabViewItemColor] for the item when it is pressed.
     * @param disabled The [TabViewItemColor] for the item when it is disabled.
     * @return A [VisualStateScheme] containing the specified colors for different interaction states.
     */
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

    /**
     * Creates a [VisualStateScheme] for the colors of a selected TabView item in the title bar style.
     *
     * This function defines the visual appearance of a selected tab item when it is part of a title bar,
     * providing different colors for default, hovered, pressed, and disabled states.
     *
     * @param default The default [TabViewItemColor] to use.
     * @param hovered The [TabViewItemColor] to use when the tab is hovered over.
     * @param pressed The [TabViewItemColor] to use when the tab is pressed.
     * @param disabled The [TabViewItemColor] to use when the tab is disabled.
     * @return A [VisualStateScheme] containing the colors for each visual state.
     */
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

    /**
     * The default colors used for the scroll action buttons in a [TabRow].
     *
     * @return A [VisualStateScheme] containing the default [ButtonColor] for the scroll action buttons.
     */
    @Stable
    @Composable
    fun scrollActionColors() = ButtonDefaults.subtleButtonColors(
        default = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(Color.Transparent)
        )
    )

    /**
     * A button designed for closing tabs, typically used within a [TabRow].
     *
     * @param onClick The callback to be invoked when the button is clicked.
     * @param modifier Optional [Modifier] for styling the button.
     * @param padding The padding to apply around the button.
     * @param enabled Controls the enabled state of the button. If false, the button will be disabled and not interactable.
     * @param colors The [VisualStateScheme] that defines the colors for the button in its various interaction states.
     * Defaults to [ButtonDefaults.subtleButtonColors].
     */
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

    /**
     * A button that adds a new tab.
     *
     * @param onClick The callback to be invoked when this button is clicked.
     * @param modifier The [Modifier] to be applied to this button.
     * @param padding The padding to be applied around the button. Defaults to a start padding of 4.dp.
     * @param enabled Controls the enabled state of the button. When `false`, this button will not be clickable and will appear in a disabled state.
     * @param colors The color scheme for this button, by default [ButtonDefaults.subtleButtonColors].
     */
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

/**
 * Remembers and returns a [TabItemEndDividerController] instance.
 *
 * This controller is responsible for managing the visibility of the end dividers in a tab row.
 * It tracks hovered items and the selected item to determine which dividers should be hidden.
 *
 * @param state The [LazyListState] of the tab row.
 * @param selectedKey A lambda that returns the key of the currently selected tab item.
 * @return A [TabItemEndDividerController] instance.
 */
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

/**
 * [TabItemEndDividerController] is a controller that manages the visibility of end dividers
 * for tab items in a [LazyRow].
 *
 * It observes the hovered state of tab items and the currently selected tab item to determine
 * which end dividers should be hidden. Specifically, it hides the end divider of the tab item
 * immediately preceding a hovered item or the selected item.
 *
 * @param state The [LazyListState] of the [LazyRow] containing the tab items.
 * @param selectedKey A lambda that returns the key of the currently selected tab item.
 */
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

    /**
     * Attaches a key and an [InteractionSource] to this controller to manage the visibility of the end divider for the item.
     *
     * This function does the following:
     * 1. **Tracks Hover State:** It monitors the hover state of the provided [interactionSource].
     * 2. **Updates `hoveredItems`:** When the item is hovered, it adds the `key` to the `hoveredItems` map. When the item is no longer hovered, it removes the `key`.
     * 3. **Cleans Up on Dispose:** When the composable is disposed, it ensures the `key` is removed from `hoveredItems` to prevent leaks.
     * 4. **Determines Divider Visibility:** It checks whether the `key` is present in the `hideDividerItems` set, and returns `true` if the divider should be visible (i.e., the key is NOT in the set), and `false` otherwise.
     * 5. **Reacts to `hideDividerItems` changes:** When `hideDividerItems` is updated, it updates the `state` ,and then the result of the function will change.
     *
     * @param key The unique key associated with the item.
     * @param interactionSource The [InteractionSource] that provides interaction state information (like hover).
     * @return `true` if the end divider should be visible for this item, `false` otherwise.
     */
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
    selectedItemScrollOffset: () -> Int,
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
                val currentItemOffset = (rowRectValue.left + selectedItemScrollOffset())
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

private data class TabItemBringIntoViewModifierNodeElement(
    val density: Density,
    val bottomRadius: Dp,
): ModifierNodeElement<TabItemBringIntoViewModifierNode>() {
    override fun create(): TabItemBringIntoViewModifierNode {
        return TabItemBringIntoViewModifierNode(density, bottomRadius)
    }

    override fun update(node: TabItemBringIntoViewModifierNode) {
        node.density = density
        node.bottomRadius = bottomRadius
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Stable
private class TabItemBringIntoViewModifierNode(
    var density: Density,
    var bottomRadius: Dp,
) : BringIntoViewModifierNode, DelegatingNode() {

    override suspend fun bringIntoView(
        childCoordinates: LayoutCoordinates,
        boundsProvider: () -> Rect?
    ) {
        Snapshot.withoutReadObservation {
            if (!childCoordinates.isAttached || !isAttached) return@withoutReadObservation
            val localRect = requireLayoutCoordinates().localBoundingBoxOf(childCoordinates)
            val paddingSize = with(density) { bottomRadius.toPx() }
            val targetRect = localRect.copy(
                    left = localRect.left - paddingSize,
                    right = localRect.right + paddingSize
                )
            bringIntoView { targetRect }
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