@file:OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)

package io.github.composefluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.rememberTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.layout.IntervalList
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
import androidx.compose.foundation.lazy.layout.MutableIntervalList
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.referentialEqualityPolicy
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalAcrylicPopupEnabled
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.ElevationDefaults
import io.github.composefluent.background.Layer
import io.github.composefluent.background.MaterialContainer
import io.github.composefluent.background.MaterialDefaults
import io.github.composefluent.layout.overflow.OverflowRowScope
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.collectVisualState
import kotlin.math.roundToInt

internal val LocalNavigationExpand = compositionLocalOf { false }
internal val LocalNavigationLevel = compositionLocalOf { 0 }
internal val LocalIndicatorState = compositionLocalOf<IndicatorState?> { null }

typealias NavigationItemColorScheme = PentaVisualScheme<NavigationItemColor>

/**
 * Represents the color scheme for a navigation item.
 *
 * @property fillColor The fill color of the navigation item.
 * @property contentColor The color of the content (text, icons) within the navigation item.
 * @property indicatorColor The color of the indicator associated with the navigation item.
 * @property trailingColor The color of trailing elements in the navigation item.
 */
@Immutable
data class NavigationItemColor(
    val fillColor: Color,
    val contentColor: Color,
    val indicatorColor: Color,
    val trailingColor: Color
)

/**
 * Enumeration class for defining the display mode of the navigation view.
 *
 * - **Top**: The navigation menu is displayed at the top of the screen.
 * - **Left**: The navigation menu is displayed on the left side of the screen.
 * - **LeftCompact**: The navigation menu is displayed in a compact mode on the left side.
 * - **LeftCollapsed**: The navigation menu is displayed in a collapsed mode on the left side.
 */
enum class NavigationDisplayMode {
    Top,
    Left,
    LeftCompact,
    LeftCollapsed
}

/**
 * Creates and remembers a [NavigationState] instance.
 *
 * This function is used to manage the state of a navigation component, including whether it is
 * expanded and its current offset.
 *
 * @param initialExpanded The initial expanded state of the navigation. Defaults to `true`.
 * @param initialOffset The initial offset of the navigation's indicator. Defaults to `Offset.Zero`.
 * @return A [NavigationState] instance that is remembered across recompositions.
 */
@Composable
fun rememberNavigationState(
    initialExpanded: Boolean = true,
    initialOffset: Offset = Offset.Zero
): NavigationState {
    return remember(initialExpanded, initialOffset) {
        NavigationState(initialExpanded, initialOffset)
    }
}

/**
 * Represents the state of the navigation view.
 *
 * @param initialExpanded The initial expanded state of the navigation view.
 * @param initialOffset The initial offset of the indicator.
 */
@Stable
class NavigationState(
    initialExpanded: Boolean,
    initialOffset: Offset
) {
    var expanded by mutableStateOf(initialExpanded)
    val indicatorState = IndicatorState(initialOffset)
}

/**
 * A composable function that creates a navigation view with different display modes.
 *
 * The navigation view can be displayed in four different modes:
 * - [NavigationDisplayMode.Top]: A horizontal navigation bar at the top.
 * - [NavigationDisplayMode.Left]: A vertical navigation pane on the left.
 * - [NavigationDisplayMode.LeftCompact]: A compact vertical navigation pane on the left.
 * - [NavigationDisplayMode.LeftCollapsed]: A collapsed vertical navigation pane on the left.
 *
 * @param menuItems A lambda that defines the menu items to be displayed in the navigation view.
 *                  It uses a [NavigationMenuScope] to add items.
 * @param modifier The modifier to be applied to the navigation view.
 * @param displayMode The display mode of the navigation view.
 * @param title A composable function that defines the title to be displayed in the navigation view.
 *              This is only applicable for [NavigationDisplayMode.Left], [NavigationDisplayMode.LeftCompact], and [NavigationDisplayMode.LeftCollapsed].
 * @param state The [NavigationState] that controls the state of the navigation view.
 *              Use [rememberNavigationState] to create and remember the state.
 * @param expandedButton A composable function that defines the button to be used to expand or collapse the navigation view.
 *                       This is only applicable for [NavigationDisplayMode.Left], [NavigationDisplayMode.LeftCompact], and [NavigationDisplayMode.LeftCollapsed].
 * @param backButton A composable function that defines the back button to be displayed in the navigation view.
 *                   This is only applicable for [NavigationDisplayMode.Left], [NavigationDisplayMode.LeftCompact], and [NavigationDisplayMode.LeftCollapsed].
 * @param autoSuggestBox An optional composable function that defines the auto-suggest box to be displayed in the navigation view.
 *                       It uses a [NavigationAutoSuggestBoxScope] to control the focus.
 * @param footerItems A lambda that defines the footer items to be displayed in the navigation view.
 *                    It uses a [NavigationMenuScope] to add items.
 * @param contentPadding The padding to be applied to the content area of the navigation view.
 * @param color The background color of the navigation view.
 * @param border The border to be applied to the navigation view.
 */
@Composable
fun NavigationView(
    menuItems: NavigationMenuScope.() -> Unit,
    modifier: Modifier = Modifier,
    displayMode: NavigationDisplayMode = NavigationDisplayMode.Left,
    title: @Composable () -> Unit = {},
    state: NavigationState = rememberNavigationState(
        initialExpanded = displayMode != NavigationDisplayMode.LeftCompact
    ),
    expandedButton: @Composable () -> Unit = {
        NavigationDefaults.ExpandedButton(
            onClick = { state.expanded = !state.expanded }
        )
    },
    backButton: @Composable () -> Unit = {},
    autoSuggestBox: (@Composable NavigationAutoSuggestBoxScope.() -> Unit)? = null,
    footerItems: NavigationMenuScope.() -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(),
    color: Color = FluentTheme.colors.background.layer.default,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    pane: @Composable () -> Unit
) {
    val footerItemIntervals = rememberNavigationMenuInterval(footerItems)
    when (displayMode) {
        NavigationDisplayMode.Top -> {
            TopLayout(
                modifier = modifier,
                autoSuggestBox = autoSuggestBox,
                state = state,
                footerItemIntervals = footerItemIntervals,
                displayMode = displayMode,
                menuItems = menuItems,
                contentPadding = contentPadding,
                pane = pane,
                color = color,
                border = border
            )
        }

        NavigationDisplayMode.Left -> {
            LeftLayout(
                modifier = modifier,
                autoSuggestBox = autoSuggestBox,
                state = state,
                footerItemIntervals = footerItemIntervals,
                displayMode = displayMode,
                menuItems = menuItems,
                contentPadding = contentPadding,
                pane = pane,
                title = title,
                backButton = backButton,
                expandedButton = expandedButton,
                color = color,
                border = border
            )
        }

        NavigationDisplayMode.LeftCompact -> {
            LeftCompactLayout(
                modifier = modifier,
                autoSuggestBox = autoSuggestBox,
                state = state,
                footerItemIntervals = footerItemIntervals,
                displayMode = displayMode,
                menuItems = menuItems,
                contentPadding = contentPadding,
                pane = pane,
                title = title,
                backButton = backButton,
                expandedButton = expandedButton,
                color = color,
                border = border
            )
        }

        NavigationDisplayMode.LeftCollapsed -> {
            LeftCollapsedLayout(
                modifier = modifier,
                autoSuggestBox = autoSuggestBox,
                state = state,
                footerItemIntervals = footerItemIntervals,
                displayMode = displayMode,
                menuItems = menuItems,
                contentPadding = contentPadding,
                pane = pane,
                title = title,
                backButton = backButton,
                expandedButton = expandedButton,
                color = color,
                border = border
            )
        }
    }
}

@Composable
private fun TopLayout(
    modifier: Modifier,
    autoSuggestBox: @Composable (NavigationAutoSuggestBoxScope.() -> Unit)?,
    state: NavigationState,
    footerItemIntervals: IntervalList<NavigationViewMenuInterval>,
    displayMode: NavigationDisplayMode,
    menuItems: NavigationMenuScope.() -> Unit,
    contentPadding: PaddingValues,
    color: Color,
    border: BorderStroke?,
    pane: @Composable () -> Unit
) {
    Column(
        content = {
            val expandedState = remember { mutableStateOf(false) }
            TopNav(
                expanded = expandedState.value,
                onExpandedChanged = { expandedState.value = it },
                autoSuggestBox = autoSuggestBox,
                indicatorState = state.indicatorState,
                footer = if (footerItemIntervals.size > 0) {
                    {
                        val scope = ValueNavigationMenuItemScope(
                            displayMode = displayMode,
                            isFooter = true,
                            onFlyoutDismissRequest = { expandedState.value = false }
                        )
                        footerItemIntervals.forEachItem { item(scope, it) }
                    }
                } else {
                    null
                }
            ) {
                TopNavigationMenuScope(
                    overflowRowScope = this,
                    onFlyoutDismissRequest = { expandedState.value = false }
                ).menuItems()
            }
            Layer(
                modifier = Modifier.weight(1f).padding(contentPadding),
                shape = FluentTheme.shapes.intersectionEdge,
                color = color,
                border = border,
                content = pane
            )
        },
        modifier = modifier
    )
}

@Composable
private fun LeftLayout(
    menuItems: NavigationMenuScope.() -> Unit,
    modifier: Modifier,
    autoSuggestBox: @Composable (NavigationAutoSuggestBoxScope.() -> Unit)?,
    title: @Composable () -> Unit,
    backButton: @Composable () -> Unit,
    expandedButton: @Composable () -> Unit,
    state: NavigationState,
    footerItemIntervals: IntervalList<NavigationViewMenuInterval>,
    displayMode: NavigationDisplayMode,
    contentPadding: PaddingValues,
    color: Color,
    border: BorderStroke?,
    pane: @Composable () -> Unit
) {
    val menuItemIntervals = rememberNavigationMenuInterval(menuItems)
    Row(modifier = modifier) {
        SideNav(
            autoSuggestionBox = autoSuggestBox,
            header = {
                SideNavHeaderArea(
                    title = title,
                    backButton = backButton,
                    expandButton = expandedButton
                )
            },
            expanded = state.expanded,
            onExpandStateChange = { state.expanded = it },
            indicatorState = state.indicatorState,
            footer = if (footerItemIntervals.size > 0) {
                {
                    val scope = ValueNavigationMenuItemScope(
                        displayMode = displayMode,
                        isFooter = true
                    )
                    footerItemIntervals.forEachItem { item(scope, it) }
                }
            } else {
                null
            },
            modifier = Modifier.fillMaxHeight()
        ) {
            val scope = ValueNavigationMenuItemScope(
                displayMode = displayMode,
                isFooter = false
            )
            menuItemIntervals.forEachItem { item(scope, it) }
        }
        Box(
            content = {
                Layer(
                    color = color,
                    border = border,
                    shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.overlay),
                    content = pane
                )
            },
            modifier = Modifier.weight(1f).padding(contentPadding)
        )
    }
}

@Composable
private fun LeftCollapsedLayout(
    modifier: Modifier,
    state: NavigationState,
    contentPadding: PaddingValues,
    pane: @Composable () -> Unit,
    autoSuggestBox: @Composable (NavigationAutoSuggestBoxScope.() -> Unit)?,
    footerItemIntervals: IntervalList<NavigationViewMenuInterval>,
    displayMode: NavigationDisplayMode,
    menuItems: NavigationMenuScope.() -> Unit,
    title: @Composable () -> Unit,
    backButton: @Composable () -> Unit,
    color: Color,
    border: BorderStroke?,
    expandedButton: @Composable () -> Unit
) {
    MaterialContainer(modifier = modifier) {
        Box(
            content = {
                Layer(
                    color = color,
                    border = border,
                    shape = FluentTheme.shapes.intersectionEdge,
                    content = pane
                )
            },
            modifier = Modifier
                .behindMaterial()
                .then(
                    if (state.expanded) {
                        Modifier.pointerInput(Unit) {
                            awaitEachGesture {
                                awaitFirstDown(pass = PointerEventPass.Initial)
                                waitForUpOrCancellation(PointerEventPass.Initial)?.let {
                                    it.consume()
                                    state.expanded = false
                                }
                            }
                        }
                    } else {
                        Modifier
                    }
                ).padding(contentPadding)
        )
        val expandedTransition = updateTransition(state.expanded)

        var backButtonSize by remember { mutableStateOf(IntSize.Zero) }
        var expandedButtonSize by remember { mutableStateOf(IntSize.Zero) }
        AnimatedVisibility(
            visible = state.expanded,
            enter = expandHorizontally(
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing,
                    delayMillis = FluentDuration.QuickDuration
                )
            ),
            exit = shrinkHorizontally(
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastDismissEasing,
                    delayMillis = FluentDuration.QuickDuration
                )
            )
        ) {
            val useAcrylic = LocalAcrylicPopupEnabled.current
            Layer(
                backgroundSizing = BackgroundSizing.InnerBorderEdge,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout),
                color = if (useAcrylic) Color.Transparent else FluentTheme.colors.background.acrylic.default,
                shape = FluentTheme.shapes.overlay,
                elevation = expandedTransition.animateDp(
                    targetValueByState = { if (it) ElevationDefaults.flyout else 0.dp },
                    transitionSpec = {
                        tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FadeInFadeOutEasing,
                            delayMillis = FluentDuration.QuickDuration
                        )
                    }
                ).value,
                modifier = Modifier.clickable(
                    interactionSource = null,
                    onClick = {},
                    indication = null
                )
            ) {
                FlyoutContentLayout(
                    shape = FluentTheme.shapes.overlay,
                    material = MaterialDefaults.acrylicDefault(),
                    contentPadding = PaddingValues()
                ) {
                    SideNav(
                        expanded = true,
                        autoSuggestionBox = autoSuggestBox,
                        onExpandStateChange = { state.expanded = it },
                        header = {
                            SideNavHeaderArea(
                                title = {},
                                backButton = {
                                    Spacer(
                                        modifier = Modifier.size(
                                            size = with(LocalDensity.current) {
                                                backButtonSize.toSize().toDpSize()
                                            }
                                        )
                                    )
                                },
                                expandButton = {
                                    Spacer(
                                        modifier = Modifier.size(
                                            size = with(LocalDensity.current) {
                                                expandedButtonSize.toSize().toDpSize()
                                            }
                                        )
                                    )
                                },
                                displayMode = NavigationDisplayMode.LeftCollapsed
                            )
                        },
                        indicatorState = state.indicatorState,
                        footer = if (footerItemIntervals.size > 0) {
                            {
                                val scope = ValueNavigationMenuItemScope(
                                    displayMode = displayMode,
                                    isFooter = true,
                                    onFlyoutDismissRequest = { state.expanded = false }
                                )
                                footerItemIntervals.forEachItem { item(scope, it) }
                            }
                        } else {
                            null
                        },
                        content = {
                            val menuItemIntervals = rememberNavigationMenuInterval(menuItems)
                            val scope =
                                ValueNavigationMenuItemScope(
                                    displayMode = displayMode,
                                    isFooter = true,
                                    onFlyoutDismissRequest = { state.expanded = false }
                                )
                            menuItemIntervals.forEachItem { item(scope, it) }
                        }
                    )
                }
            }
        }
        SideNavHeaderArea(
            title = title,
            backButton = {
                Box(
                    content = { backButton() },
                    modifier = Modifier.onSizeChanged { backButtonSize = it }
                )
            },
            expandButton = {
                Box(
                    content = { expandedButton() },
                    modifier = Modifier.onSizeChanged { expandedButtonSize = it }
                )
            },
            modifier = Modifier.padding(top = 4.dp),
            displayMode = NavigationDisplayMode.LeftCollapsed
        )
    }
}

@Composable
private fun LeftCompactLayout(
    modifier: Modifier,
    state: NavigationState,
    contentPadding: PaddingValues,
    pane: @Composable () -> Unit,
    autoSuggestBox: @Composable (NavigationAutoSuggestBoxScope.() -> Unit)?,
    title: @Composable () -> Unit,
    backButton: @Composable () -> Unit,
    expandedButton: @Composable () -> Unit,
    footerItemIntervals: IntervalList<NavigationViewMenuInterval>,
    displayMode: NavigationDisplayMode,
    color: Color,
    border: BorderStroke?,
    menuItems: NavigationMenuScope.() -> Unit
) {
    MaterialContainer(modifier = modifier) {
        Box(
            content = {
                Layer(
                    color = color,
                    border = border,
                    shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.overlay),
                    content = pane
                )
            },
            modifier = Modifier
                .behindMaterial()
                .then(
                    if (state.expanded) {
                        Modifier.pointerInput(Unit) {
                            awaitEachGesture {
                                awaitFirstDown(pass = PointerEventPass.Initial)
                                waitForUpOrCancellation(PointerEventPass.Initial)?.let {
                                    it.consume()
                                    state.expanded = false
                                }
                            }
                        }
                    } else {
                        Modifier
                    }
                )
                .padding(start = 48.dp).padding(contentPadding)
        )
        val expandedTransition = updateTransition(state.expanded)
        val isCollapsed by remember {
            derivedStateOf {
                !expandedTransition.currentState && !expandedTransition.isRunning
            }
        }
        val useAcrylic = LocalAcrylicPopupEnabled.current
        Layer(
            backgroundSizing = BackgroundSizing.InnerBorderEdge,
            border = if (isCollapsed) {
                null
            } else {
                BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout)
            },
            color = if (useAcrylic || (!expandedTransition.currentState && !expandedTransition.isRunning)) Color.Transparent else FluentTheme.colors.background.acrylic.default,
            shape = FluentTheme.shapes.overlay,
            elevation = expandedTransition.animateDp(
                transitionSpec = {
                    tween(
                        FluentDuration.ShortDuration,
                        easing = FluentEasing.FadeInFadeOutEasing,
                        delayMillis = FluentDuration.QuickDuration
                    )
                },
                targetValueByState = { if (it) ElevationDefaults.flyout else 0.dp }
            ).value,
            modifier = Modifier.clickable(
                interactionSource = null,
                onClick = {},
                indication = null
            )
        ) {
            FlyoutContentLayout(
                shape = FluentTheme.shapes.overlay,
                material = if (isCollapsed) {
                    MaterialDefaults.customAcrylic(
                        tint = Color.Transparent,
                        fallback = Color.Transparent,
                        backgroundColor = Color.Transparent,
                        lightLuminosityOpacity = 0f,
                        lightTintOpacity = 0f
                    )
                } else {
                    MaterialDefaults.acrylicDefault()
                },
                contentPadding = PaddingValues()
            ) {
                SideNav(
                    expanded = state.expanded,
                    autoSuggestionBox = autoSuggestBox,
                    header = {
                        SideNavHeaderArea(
                            title = title,
                            backButton = backButton,
                            expandButton = expandedButton
                        )
                    },
                    onExpandStateChange = { state.expanded = it },
                    indicatorState = state.indicatorState,
                    footer = if (footerItemIntervals.size > 0) {
                        {
                            val scope = ValueNavigationMenuItemScope(
                                displayMode = displayMode,
                                isFooter = true,
                                onFlyoutDismissRequest = { state.expanded = false }
                            )
                            footerItemIntervals.forEachItem { item(scope, it) }
                        }
                    } else {
                        null
                    },
                    content = {
                        val menuItemIntervals = rememberNavigationMenuInterval(menuItems)
                        val scope = ValueNavigationMenuItemScope(
                            displayMode = displayMode,
                            isFooter = true,
                            onFlyoutDismissRequest = { state.expanded = false }
                        )
                        menuItemIntervals.forEachItem { item(scope, it) }
                    }
                )
            }
        }
    }
}

/**
 * Scope for defining the content of a navigation menu item.
 *
 * This interface provides access to the current [displayMode] and [isFooter] status of the
 * navigation menu item, along with a function to request the dismissal of a flyout.
 *
 * @property displayMode The [NavigationDisplayMode] of the navigation view.
 * @property isFooter `true` if the item is part of the footer section; `false` otherwise.
 */
interface NavigationMenuItemScope {

    val displayMode: NavigationDisplayMode

    val isFooter: Boolean

    fun flyoutDismissRequest() {}
}

/**
 * Scope for building the content of a navigation menu.
 *
 * This interface provides methods to add individual items or multiple items to a
 * navigation menu. It's used within the [NavigationView] composable to define the
 * structure and content of the navigation menu items.
 */
interface NavigationMenuScope {

    /**
     * Adds a single item to the navigation menu.
     *
     * This function allows you to define a single navigation item with a specific [content].
     *
     * @param key An optional key to uniquely identify this item. Useful for tracking
     *            the item's position and identity across recompositions. If not provided,
     *            a default key will be used.
     * @param contentType An optional type identifier for the item's content. This can be
     *                    useful for optimization purposes, allowing the framework to
     *                    recognize and potentially reuse content of the same type.
     *                    If not provided, the content type is considered undefined.
     * @param content A composable lambda function that defines the content of the navigation
     *                item. It provides a [NavigationMenuItemScope] receiver, which offers
     *                additional context and functions for configuring the item.
     */
    fun item(
        key: Any? = null,
        contentType: Any? = null,
        content: @Composable NavigationMenuItemScope.() -> Unit
    )

    /**
     * Adds multiple items to the navigation menu.
     *
     * @param count The number of items to add.
     * @param key An optional function to provide a unique key for each item.
     *        If null, the index will be used as the key.
     * @param contentType A function to define the content type for each item.
     * @param itemContent A composable function that defines the content of each item.
     *                    It provides the [NavigationMenuItemScope] and the index of the item.
     */
    fun items(
        count: Int,
        key: ((index: Int) -> Any)? = null,
        contentType: (index: Int) -> Any? = { null },
        itemContent: @Composable NavigationMenuItemScope.(index: Int) -> Unit
    )
}

/**
 * Adds a menu item to the navigation menu.
 *
 * This function provides a way to add a single menu item to the navigation view.
 * It allows you to define the item's behavior, appearance, and content.
 *
 * @param selected Indicates whether the menu item is currently selected.
 * @param onClick A callback that is invoked when the menu item is clicked. It provides the updated
 *   `selected` state.
 * @param text A composable function that defines the text to be displayed for the menu item.
 * @param icon An optional composable function that defines the icon to be displayed for the menu
 *   item.
 * @param badge An optional composable function that defines a badge to be displayed on the menu
 *   item.
 * @param key An optional key to identify the menu item uniquely.
 * @param contentType An optional content type to further distinguish the menu item.
 * @param expandItems Indicates whether the menu item can expand to show sub-items.
 * @param enabled Indicates whether the menu item is enabled.
 * @param onExpandItemsChanged A callback that is invoked when the expansion state of sub-items
 *   changes.
 * @param interactionSource An optional [MutableInteractionSource] to handle interactions with the
 *   menu item.
 * @param items An optional composable lambda that defines the sub-items to be displayed when the
 *   menu item is expanded. It uses a [MenuFlyoutContainerScope].
 */
fun NavigationMenuScope.menuItem(
    selected: Boolean,
    onClick: (selected: Boolean) -> Unit,
    text: @Composable () -> Unit,
    icon: (@Composable () -> Unit)?,
    badge: (@Composable () -> Unit)? = null,
    key: Any? = null,
    contentType: Any? = null,
    expandItems: Boolean = false,
    enabled: Boolean = true,
    onExpandItemsChanged: (Boolean) -> Unit = {},
    interactionSource: MutableInteractionSource? = null,
    items: (@Composable MenuFlyoutContainerScope.() -> Unit)? = null
) {
    item(key, contentType) {
        MenuItem(
            selected = selected,
            onClick = onClick,
            text = text,
            icon = icon,
            expandItems = expandItems,
            onExpandItemsChanged = onExpandItemsChanged,
            interactionSource = interactionSource,
            items = items,
            enabled = enabled,
            badge = badge
        )
    }
}

/**
 * A composable function that creates a menu item for navigation.
 *
 * This function is used to create a menu item within a [NavigationView]. It can be
 * displayed in different display modes and has various customization options.
 *
 * @param selected Indicates whether the menu item is currently selected.
 * @param onClick A callback function that is invoked when the menu item is clicked.
 *                It provides a boolean indicating the new selected state.
 * @param text A composable function that defines the text to be displayed in the menu item.
 * @param icon An optional composable function that defines the icon to be displayed in the menu item.
 * @param expandItems A boolean indicating whether the menu item has expandable sub-items.
 *                    Defaults to `false`.
 * @param enabled A boolean indicating whether the menu item is enabled. Defaults to `true`.
 * @param indicatorState The state of the indicator for the menu item.
 *                       Defaults to the current [LocalIndicatorState].
 * @param onExpandItemsChanged A callback function that is invoked when the expandable state of the menu item changes.
 *                             It provides a boolean indicating whether the items are expanded. Defaults to an empty function.
 * @param interactionSource An optional [MutableInteractionSource] that can be used to track the interaction state of the menu item.
 *                          Defaults to `null`.
 * @param colors The color scheme for the menu item. It determines the colors for different states such as selected, hovered, and default.
 *               Defaults to different sets of colors based on the `displayMode` and `selected` state.
 * @param indicator A composable function that defines the indicator to be displayed for the menu item.
 *                  It takes an [IndicatorScope] and a [Color] as parameters.
 *                  Defaults to either [NavigationDefaults.HorizontalIndicator] for [NavigationDisplayMode.Top]
 *                  or [NavigationDefaults.VerticalIndicator] for other modes.
 * @param badge An optional composable function that defines a badge to be displayed on the menu item.
 * @param items An optional composable function that defines the sub-items (flyout) to be displayed when the menu item is expanded.
 *              It uses a [MenuFlyoutContainerScope] to add sub-items.
 */
@Composable
fun NavigationMenuItemScope.MenuItem(
    selected: Boolean,
    onClick: (selected: Boolean) -> Unit,
    text: @Composable () -> Unit,
    icon: (@Composable () -> Unit)?,
    expandItems: Boolean = false,
    enabled: Boolean = true,
    indicatorState: IndicatorState? = LocalIndicatorState.current,
    onExpandItemsChanged: (Boolean) -> Unit = {},
    interactionSource: MutableInteractionSource? = null,
    colors: NavigationItemColorScheme = when {
        displayMode == NavigationDisplayMode.Top && selected -> NavigationDefaults.selectedTopItemColors()
        displayMode == NavigationDisplayMode.Top -> NavigationDefaults.defaultTopItemColors()
        selected -> NavigationDefaults.selectedSideItemColors()
        else -> NavigationDefaults.defaultSideItemColors()
    },
    indicator: @Composable IndicatorScope.(color: Color) -> Unit = if (displayMode == NavigationDisplayMode.Top) {
        { color ->
            NavigationDefaults.HorizontalIndicator(
                color = color,
                modifier = Modifier.indicatorOffset { selected })
        }
    } else {
        { color ->
            NavigationDefaults.VerticalIndicator(
                color = color,
                modifier = Modifier.indicatorOffset { selected })
        }
    },
    badge: (@Composable () -> Unit)? = null,
    items: (@Composable MenuFlyoutContainerScope.() -> Unit)? = null
) {

    if (displayMode == NavigationDisplayMode.Top) {
        var flyoutVisible by remember { mutableStateOf(false) }
        TooltipBox(
            tooltip = text,
            enabled = isFooter
        ) {
            TopNavItem(
                selected = selected,
                onClick = {
                    onClick(!selected)
                    flyoutVisible = !flyoutVisible
                },
                text = if (isFooter) null else text,
                icon = icon,
                flyoutVisible = flyoutVisible,
                onFlyoutVisibleChanged = { flyoutVisible = it },
                indicatorState = indicatorState,
                items = items,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = colors,
                indicator = indicator,
                badge = badge
            )
        }
    } else {
        val isExpanded = LocalNavigationExpand.current
        var flyoutVisible by remember(isExpanded) { mutableStateOf(false) }

        SideNavItem(
            selected = selected,
            onSelectedChanged = {
                onClick(!selected)
                if (!isExpanded) {
                    flyoutVisible = !flyoutVisible
                }
            },
            text = { text() },
            indicatorState = indicatorState,
            flyoutVisible = flyoutVisible && !isExpanded,
            onFlyoutVisibleChanged = { flyoutVisible = it },
            icon = icon,
            expandItems = expandItems,
            onExpandItemsChanged = onExpandItemsChanged,
            items = items,
            enabled = enabled,
            interactionSource = interactionSource,
            colors = colors,
            indicator = indicator,
            badge = badge
        )
    }
}

/**
 * A composable function that creates a menu item for navigation.
 *
 * This function is used to create a menu item within a [NavigationView]. It can be
 * displayed in different display modes and has various customization options.
 *
 * @param selected Indicates whether the menu item is currently selected.
 * @param onClick A callback function that is invoked when the menu item is clicked.
 *                It provides a boolean indicating the new selected state.
 * @param text A composable function that defines the text to be displayed in the menu item.
 * @param icon An optional composable function that defines the icon to be displayed in the menu item.
 * @param header An optional composable function that defines the header to be displayed in the menu item.
 * @param expandItems A boolean indicating whether the menu item has expandable sub-items.
 *                    Defaults to `false`.
 * @param enabled A boolean indicating whether the menu item is enabled. Defaults to `true`.
 * @param separatorVisible A boolean indicating whether the separator is visible. Defaults to `false`.
 * @param indicatorState The state of the indicator for the menu item.
 *                       Defaults to the current [LocalIndicatorState].
 * @param onExpandItemsChanged A callback function that is invoked when the expandable state of the menu item changes.
 *                             It provides a boolean indicating whether the items are expanded. Defaults to an empty function.
 * @param interactionSource An optional [MutableInteractionSource] that can be used to track the interaction state of the menu item.
 *                          Defaults to `null`.
 * @param colors The color scheme for the menu item. It determines the colors for different states such as selected, hovered, and default.
 *               Defaults to different sets of colors based on the `displayMode` and `selected` state.
 * @param indicator A composable function that defines the indicator to be displayed for the menu item.
 *                  It takes an [IndicatorScope] and a [Color] as parameters.
 *                  Defaults to either [NavigationDefaults.HorizontalIndicator] for [NavigationDisplayMode.Top]
 *                  or [NavigationDefaults.VerticalIndicator] for other modes.
 * @param badge An optional composable function that defines a badge to be displayed on the menu item.
 */
@Composable
fun NavigationMenuItemScope.MenuItem(
    selected: Boolean,
    onClick: (selected: Boolean) -> Unit,
    text: @Composable () -> Unit,
    icon: (@Composable () -> Unit)?,
    header: (@Composable () -> Unit)?,
    expandItems: Boolean = false,
    enabled: Boolean = true,
    separatorVisible: Boolean = false,
    indicatorState: IndicatorState? = LocalIndicatorState.current,
    onExpandItemsChanged: (Boolean) -> Unit = {},
    interactionSource: MutableInteractionSource? = null,
    colors: NavigationItemColorScheme = when {
        displayMode == NavigationDisplayMode.Top && selected -> NavigationDefaults.selectedTopItemColors()
        displayMode == NavigationDisplayMode.Top -> NavigationDefaults.defaultTopItemColors()
        selected -> NavigationDefaults.selectedSideItemColors()
        else -> NavigationDefaults.defaultSideItemColors()
    },
    indicator: @Composable IndicatorScope.(color: Color) -> Unit = if (displayMode == NavigationDisplayMode.Top) {
        { color ->
            NavigationDefaults.HorizontalIndicator(
                color = color,
                modifier = Modifier.indicatorOffset { selected })
        }
    } else {
        { color ->
            NavigationDefaults.VerticalIndicator(
                color = color,
                modifier = Modifier.indicatorOffset { selected })
        }
    },
    badge: (@Composable () -> Unit)? = null,
    items: (@Composable MenuFlyoutContainerScope.() -> Unit)? = null
) {
    if (displayMode == NavigationDisplayMode.Top) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            header?.let { TopNavHeader(content = it) }
            MenuItem(
                selected = selected,
                onClick = { onClick(!selected) },
                expandItems = expandItems,
                onExpandItemsChanged = onExpandItemsChanged,
                text = text,
                icon = icon,
                interactionSource = interactionSource,
                enabled = enabled,
                items = items,
                indicatorState = indicatorState,
                indicator = indicator,
                colors = colors,
                badge = badge
            )
            if (separatorVisible) {
                MenuItemSeparator()
            }
        }
    } else {
        Column {
            header?.let { SideNavHeader(content = it) }
            MenuItem(
                selected = selected,
                onClick = { onClick(!selected) },
                text = text,
                icon = icon,
                expandItems = expandItems,
                enabled = enabled,
                onExpandItemsChanged = onExpandItemsChanged,
                items = items,
                interactionSource = interactionSource,
                indicatorState = indicatorState,
                indicator = indicator,
                colors = colors,
                badge = badge
            )
            if (separatorVisible) {
                MenuItemSeparator()
            }
        }
    }
}

/**
 * Adds a separator item to the navigation menu.
 *
 * This function allows you to add a visual separator between menu items in the
 * navigation view. It uses the [MenuItemSeparator] composable to render the separator.
 *
 * @param key An optional key to uniquely identify this separator item.
 * @param contentType An optional content type for this separator item.
 */
fun NavigationMenuScope.menuItemSeparator(key: Any? = null, contentType: Any? = null) {
    item(key, contentType) { MenuItemSeparator() }
}

/**
 * Adds a separator to the navigation menu.
 *
 * This function adds a visual separator between menu items in the navigation view.
 * The separator is displayed as a horizontal line in [NavigationDisplayMode.Top] mode and
 * as a vertical line in other modes.
 */
@Composable
fun NavigationMenuItemScope.MenuItemSeparator() {
    val isVertical = displayMode == NavigationDisplayMode.Top
    NavigationItemSeparator(isVertical = isVertical)
}

/**
 * A collection of default values used by [NavigationView].
 *
 * This object provides pre-defined color schemes and indicator components for navigation
 * items. It also includes default buttons for common navigation tasks.
 */
object NavigationDefaults {

    /**
     * Creates a default color scheme for a side navigation item.
     *
     * This function defines the default colors for a side navigation item in its various states:
     * default, hovered, pressed, and disabled. It uses the Fluent theme's color palette
     * for a consistent look and feel.
     *
     * @param default The color scheme for the default state of the item.
     * @param hovered The color scheme when the item is hovered over.
     * @param pressed The color scheme when the item is pressed.
     * @param disabled The color scheme when the item is disabled.
     * @return A [NavigationItemColorScheme] object containing the specified color schemes for each state.
     */
    @Composable
    @Stable
    fun defaultSideItemColors(
        default: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.secondary
        ),
        pressed: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            trailingColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.tertiary
        ),
        disabled: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = NavigationItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    /**
     * Creates a [NavigationItemColorScheme] with colors for a selected side navigation item.
     *
     * This function provides the color scheme for side navigation items when they are selected.
     * It defines colors for various states such as default, hovered, pressed, and disabled.
     *
     * @param default The default [NavigationItemColor] for the selected item.
     * @param hovered The [NavigationItemColor] for the hovered state of the selected item.
     * @param pressed The [NavigationItemColor] for the pressed state of the selected item.
     * @param disabled The [NavigationItemColor] for the disabled state of the selected item.
     * @return A [NavigationItemColorScheme] containing the color definitions for the selected item.
     */
    @Composable
    @Stable
    fun selectedSideItemColors(
        default: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.secondary
        ),
        pressed: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.secondary,
            trailingColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.tertiary
        ),
        disabled: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = NavigationItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    /**
     * Creates a default color scheme for a top navigation item.
     *
     * This function defines the default colors for a top navigation item in its various states:
     * default, hovered, pressed, and disabled. The colors are based on the Fluent theme.
     *
     * @param default The default color set for a selected top navigation item.
     * @param hovered The color set for a selected top navigation item when hovered.
     * @param pressed The color set for a selected top navigation item when pressed.
     * @param disabled The color set for a selected top navigation item when disabled.
     * @return A [NavigationItemColorScheme] instance that represents the color scheme for a top navigation item.
     */
    @Composable
    @Stable
    fun defaultTopItemColors(
        default: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        pressed: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.tertiary,
            trailingColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        disabled: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = NavigationItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    /**
     * Creates a color scheme for selected top navigation items.
     *
     * This function provides a set of colors for a top navigation item when it is in the selected state.
     * It defines different color variations for default, hovered, pressed, and disabled states.
     *
     * @param default The default color set for a selected top navigation item.
     * @param hovered The color set for a selected top navigation item when hovered.
     * @param pressed The color set for a selected top navigation item when pressed.
     * @param disabled The color set for a selected top navigation item when disabled.
     * @return A [NavigationItemColorScheme] representing the color scheme for a selected top navigation item.
     */
    @Composable
    @Stable
    fun selectedTopItemColors(
        default: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        pressed: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.tertiary,
            trailingColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        disabled: NavigationItemColor = NavigationItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = NavigationItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    /**
     * A composable function that displays a vertical indicator.
     *
     * This function creates a vertical bar that can be used as an indicator for selected items,
     * typically in a navigation menu. The indicator's appearance (color, shape, thickness) can be customized.
     *
     * @param modifier Modifier to be applied to the indicator.
     * @param color The color of the indicator. Defaults to the default accent color from the Fluent theme.
     * @param shape The shape of the indicator. Defaults to a circle shape.
     * @param thickness The thickness of the indicator. Defaults to 3 density-independent pixels (dp).
     */
    @Composable
    fun VerticalIndicator(
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.fillAccent.default,
        shape: Shape = CircleShape,
        thickness: Dp = 3.dp
    ) {
        Box(modifier.width(thickness).background(color, shape))
    }

    /**
     * A composable function that creates a horizontal indicator.
     *
     * This function is used to display a horizontal line or bar as an indicator, typically
     * to show selection or focus in a horizontal layout.
     *
     * @param modifier The modifier to be applied to the indicator.
     * @param color The color of the indicator. Defaults to the default accent color from the Fluent theme.
     * @param shape The shape of the indicator. Defaults to a circle shape.
     * @param thickness The thickness (height) of the indicator. Defaults to 3.dp.
     */
    @Composable
    fun HorizontalIndicator(
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.fillAccent.default,
        shape: Shape = CircleShape,
        thickness: Dp = 3.dp
    ) {
        Box(modifier.height(thickness).background(color, shape))
    }

    /**
     * A composable function that creates an expanded button for navigation.
     *
     * This function creates a button that, when clicked, can be used to expand or collapse the
     * navigation view. The button also displays a tooltip indicating its current state (open or close).
     *
     * @param onClick A lambda that is invoked when the button is clicked. It should handle the
     *                logic to expand or collapse the navigation.
     * @param modifier Modifier to be applied to the button.
     * @param disabled If `true`, the button will be disabled and not clickable. Defaults to `false`.
     * @param buttonColors The color scheme for the button. Defaults to subtle button colors.
     * @param interaction A [MutableInteractionSource] to handle interactions with the button, such as press,
     *                    hover, and focus.
     * @param expanded Indicates whether the navigation is currently expanded. Defaults to the value of
     *                 [LocalNavigationExpand.current], which typically represents the current expanded
     *                 state of the navigation.
     * @param icon A composable lambda that defines the icon to be displayed on the button.
     *             Defaults to the navigation icon from [FontIconDefaults].
     */
    @Composable
    fun ExpandedButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        disabled: Boolean = false,
        buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
        interaction: MutableInteractionSource = remember { MutableInteractionSource() },
        expanded: Boolean = LocalNavigationExpand.current,
        icon: @Composable (() -> Unit) = { FontIconDefaults.NavigationIcon(interaction) },
    ) {
        TooltipBox(
            tooltip = {
                Text(
                    text = if (expanded) "Close Navigation" else "Open Navigation"
                )
            },
            enabled = !disabled
        ) {
            Button(
                onClick = onClick,
                interaction = interaction,
                icon = { icon() },
                modifier = modifier,
                disabled = disabled,
                buttonColors = buttonColors
            )
        }
    }

    /**
     * A composable function that creates a button with an icon.
     *
     * This function creates a button that is designed to display only an icon, without any text.
     * It's useful for creating compact buttons for actions like navigation, settings, or other
     * icon-driven controls.
     *
     * @param onClick A lambda that is invoked when the button is clicked.
     * @param icon A composable lambda that defines the icon to be displayed on the button.
     * @param modifier The [Modifier] to be applied to the button. Defaults to an empty modifier.
     * @param disabled A boolean that determines if the button is enabled or disabled.
     *                 If `true`, the button will not respond to clicks and will appear visually
     *                 disabled. Defaults to `false` (enabled).
     * @param buttonColors The color scheme for the button, defining the colors for various states
     *                     (e.g., default, pressed, disabled). Defaults to a subtle button color scheme
     *                     provided by [ButtonDefaults.subtleButtonColors].
     * @param interaction The [MutableInteractionSource] for this button, used to track the
     *                    interaction state of the button (e.g., pressed, hovered). Defaults to a
     *                    newly remembered [MutableInteractionSource].
     */
    @Composable
    fun Button(
        onClick: () -> Unit,
        icon: @Composable (() -> Unit),
        modifier: Modifier = Modifier,
        disabled: Boolean = false,
        buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
        interaction: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        Button(
            onClick = onClick,
            iconOnly = true,
            interaction = interaction,
            content = { icon() },
            modifier = modifier
                .size(48.dp, 40.dp)
                .padding(horizontal = 4.dp, vertical = 2.dp),
            disabled = disabled,
            buttonColors = buttonColors
        )
    }

    /**
     * A composable function that creates a back button for navigation.
     *
     * This function creates a back button that can be used to navigate back in the application.
     *
     * @param onClick A callback function that is invoked when the back button is clicked.
     * @param modifier Modifier to be applied to the back button.
     * @param disabled Indicates whether the back button is disabled. Defaults to `false`.
     * @param buttonColors The color scheme for the back button. Defaults to [ButtonDefaults.subtleButtonColors].
     * @param interaction The [MutableInteractionSource] to handle interactions with the button.
     *                    Defaults to a newly remembered [MutableInteractionSource].
     * @param icon A composable function that defines the icon to be displayed on the back button.
     *             Defaults to [FontIconDefaults.BackIcon] with a small size.
     */
    @Composable
    fun BackButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        disabled: Boolean = false,
        buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
        interaction: MutableInteractionSource = remember { MutableInteractionSource() },
        icon: @Composable (() -> Unit) = { FontIconDefaults.BackIcon(interaction, size = FontIconSize.Small) },
    ) {
        TooltipBox(
            tooltip = {
                Text(text = "Back")
            },
            enabled = !disabled
        ) {
            Button(
                onClick = onClick,
                iconOnly = true,
                interaction = interaction,
                content = { icon() },
                modifier = modifier
                    .size(44.dp, 40.dp)
                    .padding(vertical = 2.dp)
                    .padding(start = 4.dp),
                disabled = disabled,
                buttonColors = buttonColors
            )
        }
    }

}

/**
 * Creates and remembers an [IndicatorState] instance.
 *
 * This function is used to manage the state of an indicator, such as its position and
 * whether it is currently active. The state is remembered across recompositions.
 *
 * @param initialOffset The initial offset of the indicator. Defaults to `Offset.Zero`.
 * @return An [IndicatorState] instance that is remembered across recompositions.
 */
@Composable
fun rememberIndicatorState(initialOffset: Offset = Offset.Zero): IndicatorState {
    return remember(initialOffset) { IndicatorState(initialOffset) }
}

/**
 * Represents the state of the indicator for a navigation item.
 *
 * This class manages the position of the indicator that highlights the currently
 * selected item in a navigation view. It uses a [MutableTransitionState] to animate
 * the indicator's movement between different positions.
 *
 * @property initialOffset The initial offset of the indicator.
 */
@Stable
class IndicatorState(initialOffset: Offset) {
    /**
     * The state of the selected item indicator.
     *
     * This is a [MutableTransitionState] that holds the current offset of the selected item indicator.
     * It is used to animate the position of the indicator when the selected item changes.
     */
    val selectedItem: MutableTransitionState<Offset> = MutableTransitionState(initialOffset)

    /**
     * Updates the target state of the selected item's position.
     *
     * This function is responsible for setting the desired position of the indicator
     * that highlights the currently selected item in the navigation. It takes an [Offset]
     * representing the new target position and updates the `targetState` of the
     * `selectedItem` transition. This effectively triggers an animation to move the indicator
     * to the specified position.
     *
     * @param offset The new [Offset] to which the indicator should move.
     */
    fun updateSelectedItem(offset: Offset) {
        selectedItem.targetState = offset
    }
}

/**
 * Scope for positioning the indicator.
 *
 * This scope provides a way to apply an offset to the indicator based on its visibility.
 */
interface IndicatorScope {

    /**
     * Applies an offset to the indicator based on the visibility state.
     *
     * This function is used to position the indicator (e.g., a visual cue for
     * selected items) relative to its associated item. The offset is applied
     * only when the indicator is deemed visible based on the `visible`
     * lambda. When the indicator is not visible, the offset will not be applied.
     *
     * @param visible A lambda function that returns `true` if the indicator
     * should be visible and thus have the offset applied, `false` otherwise.
     * @return A [Modifier] with the indicator offset applied.
     */
    @Composable
    fun Modifier.indicatorOffset(visible: () -> Boolean): Modifier
}

/**
 * Scope for providing custom behavior to the auto-suggest box within a [NavigationView].
 *
 * This scope allows for defining modifiers that handle focus interactions for the auto-suggest box.
 */
interface NavigationAutoSuggestBoxScope {
    fun Modifier.focusHandle(): Modifier
}

@Composable
internal fun Modifier.indicatorRect(indicatorState: IndicatorState?, selected: Boolean): Modifier {
    var currentPosition by remember {
        mutableStateOf(Offset.Zero)
    }
    LaunchedEffect(selected, currentPosition, indicatorState) {
        if (selected) {
            indicatorState?.updateSelectedItem(currentPosition)
        }
    }
    return then(
        Modifier.onGloballyPositioned { currentPosition = it.positionInRoot() }
    )
}

@Composable
internal fun Modifier.indicatorOffsetAnimation(
    size: Dp,
    indicatorState: MutableTransitionState<Boolean>,
    selectedPosition: MutableTransitionState<Offset>,
    isVertical: Boolean = true
): Modifier {
    // Keep State; read .value inside layout so indicator animation does not recompose every frame.
    val fraction = rememberTransition(indicatorState, label = "indicator-visibility").animateFloat(
        transitionSpec = {
            tween(FluentDuration.VeryLongDuration, easing = FluentEasing.PointToPointEasing)
        },
        label = "indicator-fraction",
        targetValueByState = { if (it) 1f else 0f }
    )
    // Drive selected-position transition while indicator is shown (animates layout via selectedPosition state).
    if (indicatorState.isIdle && indicatorState.targetState) {
        rememberTransition(selectedPosition, label = "selected-position").animateFloat(
            transitionSpec = {
                tween(
                    FluentDuration.QuickDuration,
                    easing = FluentEasing.FastInvokeEasing
                )
            },
            label = "selected-position-axis"
        ) { if (isVertical) it.y else it.x }
    }
    return layout { measurable, constraints ->
        val stickSize = size.toPx()
        val containerSize = if (isVertical) {
            constraints.maxHeight.toFloat()
        } else {
            constraints.maxWidth.toFloat()
        }
        val goBackward = if (isVertical) {
            selectedPosition.currentState.y > selectedPosition.targetState.y
        } else {
            selectedPosition.currentState.x > selectedPosition.targetState.x
        }
        val contentPadding = ((containerSize - stickSize) / 2).coerceAtLeast(0f)
        val extendSize = containerSize - contentPadding
        val fractionValue = fraction.value
        val currentFraction = if (indicatorState.targetState) {
            fractionValue
        } else {
            1 - fractionValue
        }
        val segmentFraction = when {
            currentFraction > 0.75 -> (currentFraction - 0.75f) * 4
            currentFraction > 0.5 -> (currentFraction - 0.5f) * 4
            currentFraction > 0.25 -> (currentFraction - 0.25f) * 4
            else -> currentFraction * 4
        }
        val currentSize = if (!indicatorState.targetState) {
            when {
                currentFraction <= 0.25 -> androidx.compose.ui.util.lerp(
                    stickSize,
                    extendSize,
                    segmentFraction
                )

                currentFraction <= 0.5f -> androidx.compose.ui.util.lerp(
                    extendSize,
                    0f,
                    segmentFraction
                )

                else -> 0f
            }
        } else {
            when {
                currentFraction > 0.75f -> androidx.compose.ui.util.lerp(
                    extendSize,
                    stickSize,
                    segmentFraction
                )

                currentFraction > 0.5f -> androidx.compose.ui.util.lerp(
                    0f,
                    extendSize,
                    segmentFraction
                )

                else -> 0f
            }
        }
        val sizeInt = currentSize.roundToInt().coerceAtLeast(0)
        val placeable = if (isVertical) {
            measurable.measure(Constraints.fixedHeight(sizeInt))
        } else {
            measurable.measure(Constraints.fixedWidth(sizeInt))
        }

        layout(
            width = if (isVertical) placeable.width else constraints.maxWidth,
            height = if (isVertical) constraints.maxHeight else placeable.height
        ) {
            val offset = when {
                goBackward && !indicatorState.targetState && currentFraction <= 0.25f -> extendSize - sizeInt
                goBackward && !indicatorState.targetState -> 0f
                !goBackward && !indicatorState.targetState && currentFraction <= 0.25f -> contentPadding
                !goBackward && !indicatorState.targetState -> containerSize - sizeInt
                goBackward && currentFraction > 0.75f -> contentPadding
                goBackward && currentFraction > 0.5f -> containerSize - sizeInt
                !goBackward && currentFraction > 0.75f -> extendSize - sizeInt
                !goBackward && currentFraction > 0.5f -> 0f
                else -> 0f
            }
            if (isVertical) {
                placeable.place(0, offset.roundToInt())
            } else {
                placeable.place(offset.roundToInt(), 0)
            }
        }
    }
}

/**
 * A composable function that displays a separator line for navigation items.
 *
 * This function creates a horizontal or vertical line that can be used to visually separate
 * navigation items in a [NavigationView]. The orientation of the separator (horizontal or
 * vertical) can be controlled by the `isVertical` parameter.
 *
 * @param isVertical If `true`, a vertical separator is displayed; otherwise, a horizontal separator
 *                   is shown. Defaults to `false` (horizontal).
 * @param modifier Modifier to be applied to the separator.
 * @param color The color of the separator. Defaults to the default divider color from the Fluent theme.
 */
@Composable
fun NavigationItemSeparator(
    isVertical: Boolean = false,
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.stroke.divider.default
) {
    val sizeModifier = if (!isVertical) {
        Modifier
            .fillMaxWidth()
            .padding(top = 3.dp, bottom = 4.dp)
            .height(1.dp)
    } else {
        Modifier
            .size(8.dp, 32.dp)
            .wrapContentSize(Alignment.Center)
            .height(24.dp).width(1.dp)
    }
    Box(
        modifier = Modifier
            .then(modifier)
            .then(sizeModifier)
            .background(color)
    )
}

@Immutable
private class TopNavigationMenuScope(
    private val overflowRowScope: OverflowRowScope,
    onFlyoutDismissRequest: () -> Unit = {}
) : NavigationMenuScope {

    private val overflowItemScope =
        ValueNavigationMenuItemScope(
            displayMode = NavigationDisplayMode.Left,
            isFooter = false,
            onFlyoutDismissRequest = onFlyoutDismissRequest
        )

    private val normalItemScope = ValueNavigationMenuItemScope(
        displayMode = NavigationDisplayMode.Top,
        isFooter = false
    )

    override fun item(
        key: Any?,
        contentType: Any?,
        content: @Composable NavigationMenuItemScope.() -> Unit
    ) {
        overflowRowScope.item(
            key = key,
            contentType = contentType,
            content = {
                if (isOverflow) {
                    content(overflowItemScope)
                } else {
                    content(normalItemScope)
                }
            }
        )
    }

    override fun items(
        count: Int,
        key: ((index: Int) -> Any)?,
        contentType: (index: Int) -> Any?,
        itemContent: @Composable NavigationMenuItemScope.(index: Int) -> Unit
    ) {
        overflowRowScope.items(
            count = count,
            key = key,
            contentType = contentType,
            itemContent = { index ->
                if (isOverflow) {
                    itemContent(overflowItemScope, index)
                } else {
                    itemContent(normalItemScope, index)
                }
            }
        )
    }
}

private data class ValueNavigationMenuItemScope(
    override val displayMode: NavigationDisplayMode,
    override val isFooter: Boolean,
    val onFlyoutDismissRequest: () -> Unit = {}
) : NavigationMenuItemScope {
    override fun flyoutDismissRequest() {
        onFlyoutDismissRequest()
    }
}

private inline fun <T> IntervalList<T>.forEachItem(action: T.(index: Int) -> Unit) {
    repeat(size) {
        val item = get(it)
        action(item.value, it - item.startIndex)
    }
}

@Composable
private fun rememberNavigationMenuInterval(
    content: NavigationMenuScope.() -> Unit
): IntervalList<NavigationViewMenuInterval> {
    val contentState = rememberUpdatedState(content)
    return remember {
        derivedStateOf(referentialEqualityPolicy()) {
            NavigationMenuScopeImpl(contentState.value).intervals
        }
    }.value
}

private class NavigationMenuScopeImpl(
    content: NavigationMenuScope.() -> Unit
) : NavigationMenuScope, LazyLayoutIntervalContent<NavigationViewMenuInterval>() {

    override val intervals = MutableIntervalList<NavigationViewMenuInterval>()

    init {
        apply(content)
    }

    override fun item(
        key: Any?,
        contentType: Any?,
        content: @Composable NavigationMenuItemScope.() -> Unit
    ) {
        intervals.addInterval(
            1,
            NavigationViewMenuInterval(
                key = key?.let { { key } },
                type = { contentType },
                item = { content() }
            )
        )
    }

    override fun items(
        count: Int,
        key: ((index: Int) -> Any)?,
        contentType: (index: Int) -> Any?,
        itemContent: @Composable NavigationMenuItemScope.(index: Int) -> Unit
    ) {
        intervals.addInterval(
            count,
            NavigationViewMenuInterval(
                key = key,
                type = contentType,
                item = itemContent
            )
        )
    }
}

private class NavigationViewMenuInterval(
    override val key: ((index: Int) -> Any)?,
    override val type: ((index: Int) -> Any?),
    val item: @Composable NavigationMenuItemScope.(Int) -> Unit
) : LazyLayoutIntervalContent.Interval

@Composable
internal fun rememberNavigationItemsFlyoutScope(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit
): MenuFlyoutContainerScope {
    val expandedState = rememberUpdatedState(expanded)
    val onExpandedChangedState = rememberUpdatedState(onExpandedChanged)
    val anchorScope = rememberFlyoutAnchorScope()
    return remember(anchorScope, expandedState, onExpandedChangedState) {
        object : MenuFlyoutContainerScope, MenuFlyoutScope by MenuFlyoutScopeImpl(),
            FlyoutAnchorScope by anchorScope {
            override var isFlyoutVisible: Boolean
                get() = expandedState.value
                set(value) {
                    onExpandedChangedState.value.invoke(value)
                }
        }
    }
}