package com.konyaco.fluent.component

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
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.ElevationDefaults
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.MaterialContainer
import com.konyaco.fluent.background.MaterialDefaults
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowLeft
import com.konyaco.fluent.icons.regular.Navigation
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.scheme.PentaVisualScheme
import kotlin.math.roundToInt

internal val LocalNavigationExpand = compositionLocalOf { false }
internal val LocalNavigationLevel = compositionLocalOf { 0 }
internal val LocalIndicatorState = compositionLocalOf<IndicatorState?> { null }

typealias NavigationItemColorScheme = PentaVisualScheme<NavigationItemColor>

@Immutable
data class NavigationItemColor(
    val fillColor: Color,
    val contentColor: Color,
    val indicatorColor: Color,
    val trailingColor: Color
)

enum class NavigationDisplayMode {
    Top,
    Left,
    LeftCompact,
    LeftCollapsed
}

@Composable
fun rememberNavigationState(
    initialExpanded: Boolean = true,
    initialOffset: Offset = Offset.Zero
): NavigationState {
    return remember(initialExpanded, initialOffset) {
        NavigationState(initialExpanded, initialOffset)
    }
}

class NavigationState(
    initialExpanded: Boolean,
    initialOffset: Offset
) {
    var expanded by mutableStateOf(initialExpanded)
    val indicatorState = IndicatorState(initialOffset)
}

@OptIn(ExperimentalFoundationApi::class)
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

@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
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

@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
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

@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
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
            Layer(
                backgroundSizing = BackgroundSizing.InnerBorderEdge,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout),
                color = Color.Transparent,
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

@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
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
        Layer(
            backgroundSizing = BackgroundSizing.InnerBorderEdge,
            border = if (isCollapsed) {
                null
            } else {
                BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout)
            },
            color = Color.Transparent,
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

interface NavigationMenuItemScope {

    val displayMode: NavigationDisplayMode

    val isFooter: Boolean

    fun flyoutDismissRequest() {}
}

interface NavigationMenuScope {

    fun item(
        key: Any? = null,
        contentType: Any? = null,
        content: @Composable NavigationMenuItemScope.() -> Unit
    )

    fun items(
        count: Int,
        key: ((index: Int) -> Any)? = null,
        contentType: (index: Int) -> Any? = { null },
        itemContent: @Composable NavigationMenuItemScope.(index: Int) -> Unit
    )
}

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

@OptIn(ExperimentalFluentApi::class)
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
        TopNavItem(
            selected = selected,
            onClick = {
                onClick(!selected)
                flyoutVisible = !flyoutVisible
            },
            text = if (isFooter) null else text,
            flyoutVisible = flyoutVisible,
            onFlyoutVisibleChanged = { flyoutVisible = it },
            indicatorState = indicatorState,
            icon = icon,
            items = items,
            enabled = enabled,
            interactionSource = interactionSource,
            colors = colors,
            indicator = indicator,
            badge = badge
        )
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

fun NavigationMenuScope.menuItemSeparator(key: Any? = null, contentType: Any? = null) {
    item(key, contentType) { MenuItemSeparator() }
}

@Composable
fun NavigationMenuItemScope.MenuItemSeparator() {
    val isVertical = displayMode == NavigationDisplayMode.Top
    NavigationItemSeparator(isVertical = isVertical)
}

object NavigationDefaults {

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

    @Composable
    fun VerticalIndicator(
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.fillAccent.default,
        shape: Shape = CircleShape,
        thickness: Dp = 3.dp
    ) {
        Box(modifier.width(thickness).background(color, shape))
    }

    @Composable
    fun HorizontalIndicator(
        modifier: Modifier = Modifier,
        color: Color = FluentTheme.colors.fillAccent.default,
        shape: Shape = CircleShape,
        thickness: Dp = 3.dp
    ) {
        Box(modifier.height(thickness).background(color, shape))
    }

    @Composable
    fun ExpandedButton(
        onClick: () -> Unit,
        icon: @Composable (() -> Unit) = {
            FontIcon(
                glyph = '\uE700',
                vector = Icons.Default.Navigation,
                contentDescription = "Expanded"
            )
        },
        modifier: Modifier = Modifier,
        disabled: Boolean = false,
        buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
        interaction: MutableInteractionSource = remember { MutableInteractionSource() },
        animationEnabled: Boolean = true,
    ) {
        Button(
            onClick = onClick,
            interaction = interaction,
            icon = {
                if (animationEnabled) {
                    val isPressed by interaction.collectIsPressedAsState()
                    val scaleX = animateFloatAsState(
                        targetValue = if (isPressed) 0.6f else 1f,
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    )
                    Box(
                        content = { icon() },
                        modifier = Modifier.graphicsLayer {
                            this.scaleX = scaleX.value
                        }
                    )
                } else {
                    icon()
                }
            },
            modifier = modifier,
            disabled = disabled,
            buttonColors = buttonColors
        )
    }

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

    @Composable
    fun BackButton(
        onClick: () -> Unit,
        icon: @Composable (() -> Unit) = {
            FontIcon(
                glyph = '\uE830',
                vector = Icons.Default.ArrowLeft,
                contentDescription = null,
            )
        },
        modifier: Modifier = Modifier,
        disabled: Boolean = false,
        buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
        interaction: MutableInteractionSource = remember { MutableInteractionSource() },
        animationEnabled: Boolean = true,
    ) {
        Button(
            onClick = onClick,
            iconOnly = true,
            interaction = interaction,
            content = {
                if (animationEnabled) {
                    val isPressed by interaction.collectIsPressedAsState()
                    val scaleX = animateFloatAsState(
                        targetValue = if (isPressed) 0.9f else 1f,
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    )
                    Box(
                        content = { icon() },
                        modifier = Modifier.graphicsLayer {
                            this.scaleX = scaleX.value
                            translationX = (1f - scaleX.value) * 6.dp.toPx()
                        }
                    )
                } else {
                    icon()
                }
            },
            modifier = modifier
                .size(44.dp, 40.dp)
                .padding(vertical = 2.dp)
                .padding(start = 4.dp),
            disabled = disabled,
            buttonColors = buttonColors
        )
    }

}

@Composable
fun rememberIndicatorState(initialOffset: Offset = Offset.Zero): IndicatorState {
    return remember(initialOffset) { IndicatorState(initialOffset) }
}

class IndicatorState(initialOffset: Offset) {
    val selectedItem: MutableTransitionState<Offset> = MutableTransitionState(initialOffset)

    fun updateSelectedItem(offset: Offset) {
        selectedItem.targetState = offset
    }
}

interface IndicatorScope {

    @Composable
    fun Modifier.indicatorOffset(visible: () -> Boolean): Modifier
}

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
    val fraction by rememberTransition(indicatorState).animateFloat(
        transitionSpec = {
            tween(FluentDuration.VeryLongDuration, easing = FluentEasing.PointToPointEasing)
        },
        targetValueByState = { if (it) 1f else 0f }
    )
    //Delay set selected position
    if (indicatorState.isIdle && indicatorState.targetState) {
        rememberTransition(selectedPosition).animateFloat(transitionSpec = {
            tween(
                FluentDuration.QuickDuration,
                easing = FluentEasing.FastInvokeEasing
            )
        }) { if (isVertical) it.y else it.x }
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
        val currentFraction = if (indicatorState.targetState) {
            fraction
        } else {
            1 - fraction
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

@OptIn(ExperimentalFoundationApi::class)
private inline fun <T> IntervalList<T>.forEachItem(action: T.(index: Int) -> Unit) {
    repeat(size) {
        val item = get(it)
        action(item.value, it - item.startIndex)
    }
}

@OptIn(ExperimentalFoundationApi::class)
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

@OptIn(ExperimentalFoundationApi::class)
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

@OptIn(ExperimentalFoundationApi::class)
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
    return remember {
        object : MenuFlyoutContainerScope, MenuFlyoutScope by MenuFlyoutScopeImpl() {
            override var isFlyoutVisible: Boolean
                get() = expandedState.value
                set(value) {
                    onExpandedChangedState.value.invoke(value)
                }
        }
    }
}