package io.github.composefluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalTextStyle
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.scheme.collectVisualState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * A composable function that renders a side navigation view.
 *
 * @param expanded Whether the side navigation is expanded.
 * @param onExpandStateChange A callback that is invoked when the expand state changes.
 * @param modifier The modifier to be applied to the side navigation.
 * @param title A composable that renders the title of the side navigation. Defaults to an empty composable.
 * @param autoSuggestionBox A composable that renders the auto-suggestion box. Defaults to null.
 * @param footer A composable that renders the footer of the side navigation. Defaults to null.
 * @param content A composable that renders the main content of the side navigation.
 */
@OptIn(ExperimentalFluentApi::class)
@Composable
fun SideNav(
    expanded: Boolean,
    onExpandStateChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    title: @Composable (() -> Unit) = {},
    autoSuggestionBox: (@Composable NavigationAutoSuggestBoxScope.() -> Unit)? = null,
    footer: @Composable (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    SideNav(
        indicatorState = rememberIndicatorState(),
        expanded = expanded,
        onExpandStateChange = onExpandStateChange,
        modifier = modifier,
        header = {
            SideNavHeaderArea(
                title = title,
                backButton = {},
                expandButton = {
                    NavigationDefaults.ExpandedButton(
                        onClick = { onExpandStateChange(!expanded) }
                    )
                }
            )
        },
        autoSuggestionBox = autoSuggestionBox,
        footer = footer,
        content = content
    )
}

/**
 * A composable function that represents a side navigation panel.
 *
 * This composable provides a flexible side navigation area that can be expanded or collapsed.
 * It supports a header, footer, optional auto-suggestion box, and a main content area.
 *
 * @param indicatorState The state for managing the navigation indicator.
 * @param expanded Controls whether the navigation is expanded or collapsed.
 * @param onExpandStateChange Callback to notify when the expanded state changes.
 * @param modifier Modifier for the root Column of the side navigation.
 * @param autoSuggestionBox Optional composable to display a search or auto-suggestion box.
 * The scope of this lambda is [NavigationAutoSuggestBoxScope].
 * @param header Optional composable for the header area of the navigation.
 * @param flex Optional composable placed between the header and the main content.
 * @param footer Optional composable for the footer area of the navigation.
 * @param content Composable for the main content area of the navigation.
 */
@ExperimentalFluentApi
@Composable
fun SideNav(
    indicatorState: IndicatorState,
    expanded: Boolean,
    onExpandStateChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    autoSuggestionBox: (@Composable NavigationAutoSuggestBoxScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    flex: (@Composable () -> Unit)? = null,
    footer: @Composable (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    val width by animateDpAsState(
        targetValue = if (expanded) 320.dp else 48.dp,
        animationSpec = tween(
            durationMillis = FluentDuration.ShortDuration,
            easing = FluentEasing.FastInvokeEasing
        )
    )
    Column(
        modifier = modifier.width(width)
    ) {
        Spacer(modifier = Modifier.height(4.dp))
        CompositionLocalProvider(
            LocalNavigationExpand provides expanded,
            LocalNavigationLevel provides 0,
            LocalIndicatorState provides indicatorState,
        ) {
            header?.invoke()
            flex?.invoke()
            autoSuggestionBox?.let {
                val focusRequester = remember {
                    FocusRequester()
                }
                val autoSuggestionBoxScope = remember(focusRequester) {
                    NavigationAutoSuggestBoxScopeImpl(focusRequester)
                }
                val expandedScope = rememberCoroutineScope()
                if (expanded) {
                    Box(
                        content = { autoSuggestionBoxScope.it() },
                        modifier = Modifier
                            .height(48.dp)
                            .padding(horizontal = 16.dp)
                            .padding(top = 4.dp)
                    )
                } else {
                    SideNavItem(
                        selected = false,
                        onClick = {
                            onExpandStateChange(true)
                            expandedScope.launch {
                                delay(FluentDuration.ShortDuration.toLong())
                                focusRequester.requestFocus()
                            }

                        },
                        icon = {
                            FontIcon(type = FontIconPrimitive.Search, contentDescription = null)
                        },
                        content = { Text("Click to search") }
                    )
                }
            }
            val scrollState = rememberScrollState()
            Column(
                content = { content() },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .scrollbar(state = scrollState, orientation = Orientation.Vertical)
                    .verticalScroll(scrollState)
                    .padding(bottom = 8.dp)
            )
            footer?.let {
                // Divider
                NavigationItemSeparator()
                it()
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}

/**
 * A single item within a [SideNav].
 *
 * @param selected `true` if this item is the currently selected item.
 * @param onClick A callback that is invoked when the item is clicked. It provides the new
 *     selected state as a parameter.
 * @param modifier Optional [Modifier] for styling.
 * @param expand Whether the SideNav is currently expanded. Defaults to the current value of
 *     [LocalNavigationExpand].
 * @param expandItems `true` to expand the nested items if [items] are provided.
 * @param onExpandItemsChanged A callback that is invoked when the expanded state of nested items
 *     changes.
 * @param colors [NavigationItemColorScheme] to customize the colors of the item. Defaults to the
 *     selected or default colors based on [selected].
 * @param icon An optional icon to be displayed alongside the text.
 * @param items Optional nested menu items. If provided, the item will show an expand/collapse
 *     indicator.
 * @param enabled `true` if the item is enabled and can be clicked.
 * @param indicator A composable that is drawn as an indicator when the item is selected. Defaults
 *     to [NavigationDefaults.VerticalIndicator].
 * @param content The main text content to display for the item.
 */
@OptIn(ExperimentalFluentApi::class)
@Composable
fun SideNavItem(
    selected: Boolean,
    onClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    expand: Boolean = LocalNavigationExpand.current,
    expandItems: Boolean = false,
    onExpandItemsChanged: (Boolean) -> Unit = {},
    colors: NavigationItemColorScheme = if (selected) {
        NavigationDefaults.selectedSideItemColors()
    } else {
        NavigationDefaults.defaultSideItemColors()
    },
    icon: @Composable (() -> Unit)? = null,
    items: @Composable (MenuFlyoutContainerScope.() -> Unit)? = null,
    enabled: Boolean = true,
    indicator: @Composable IndicatorScope.(color: Color) -> Unit = {
        NavigationDefaults.VerticalIndicator(
            modifier = Modifier.indicatorOffset { selected },
            color = it
        )
    },
    content: @Composable RowScope.() -> Unit
) {
    SideNavItem(
        selected = selected,
        onSelectedChanged = onClick,
        modifier = modifier,
        expand = expand,
        expandItems = expandItems,
        onExpandItemsChanged = onExpandItemsChanged,
        flyoutVisible = false,
        onFlyoutVisibleChanged = {},
        colors = colors,
        icon = icon,
        items = items,
        enabled = enabled,
        indicator = indicator,
        text = content,
        indicatorState = LocalIndicatorState.current
    )
}

/**
 * A composable function that represents a single item in a side navigation menu.
 *
 * @param selected Whether the item is currently selected.
 * @param onSelectedChanged Callback invoked when the selection state of the item changes.
 * @param indicatorState The state of the indicator for this navigation item.
 * @param modifier Modifier for styling and layout adjustments of the navigation item.
 * @param expand Whether the navigation is in expanded mode. Defaults to the current state from [LocalNavigationExpand].
 * @param expandItems Whether to show the expanded sub-items.
 * @param onExpandItemsChanged Callback invoked when the expanded state of the sub-items changes.
 * @param flyoutVisible Whether the flyout menu for this item is visible. Default is true when `expandItems` is true and `expand` is false.
 * @param onFlyoutVisibleChanged Callback invoked when the visibility of the flyout menu changes. Defaults to [onExpandItemsChanged].
 * @param colors Color scheme for the navigation item, changes based on whether it is selected. Defaults to [NavigationDefaults.selectedSideItemColors] when selected, otherwise [NavigationDefaults.defaultSideItemColors].
 * @param icon Optional icon to display on the navigation item.
 * @param items Optional composable function to display a flyout of sub-items when this item is expanded.
 * @param enabled Whether the navigation item is enabled.
 * @param indicator Composable function to draw the selection indicator. Defaults to [NavigationDefaults.VerticalIndicator].
 * @param interactionSource Optional [MutableInteractionSource] to handle user interactions.
 * @param badge Optional composable function to display a badge next to the navigation item.
 * @param text Composable function to display the text label for the navigation item.
 */
@OptIn(ExperimentalFoundationApi::class)
@ExperimentalFluentApi
@Composable
fun SideNavItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    indicatorState: IndicatorState?,
    modifier: Modifier = Modifier,
    expand: Boolean = LocalNavigationExpand.current,
    expandItems: Boolean = false,
    onExpandItemsChanged: (Boolean) -> Unit = {},
    flyoutVisible: Boolean = expandItems && !expand,
    onFlyoutVisibleChanged: (Boolean) -> Unit = onExpandItemsChanged,
    colors: NavigationItemColorScheme = if (selected) {
        NavigationDefaults.selectedSideItemColors()
    } else {
        NavigationDefaults.defaultSideItemColors()
    },
    icon: @Composable (() -> Unit)? = null,
    items: @Composable (MenuFlyoutContainerScope.() -> Unit)? = null,
    enabled: Boolean = true,
    indicator: @Composable IndicatorScope.(color: Color) -> Unit = {
        NavigationDefaults.VerticalIndicator(
            modifier = Modifier.indicatorOffset { selected },
            color = it
        )
    },
    interactionSource: MutableInteractionSource? = null,
    badge: (@Composable () -> Unit)? = null,
    text: @Composable RowScope.() -> Unit
) {
    val interaction = interactionSource ?: remember { MutableInteractionSource() }

    val color = colors.schemeFor(interaction.collectVisualState(!enabled))

    TooltipBox(
        tooltip = {
            Row(content = text)
        },
        enabled = !expand && enabled
    ) {
        Column(
            modifier = modifier.indicatorRect(indicatorState, selected)
        ) {
            CompositionLocalProvider(
                LocalNavigationLevel provides 0,
                LocalNavigationExpand provides true
            ) {
                MenuFlyout(
                    visible = flyoutVisible,
                    onDismissRequest = { onFlyoutVisibleChanged(false) },
                    placement = FlyoutPlacement.End
                ) {
                    items?.invoke(
                        rememberNavigationItemsFlyoutScope(flyoutVisible, onFlyoutVisibleChanged)
                    )
                }
            }
            Box(
                Modifier.height(40.dp)
                    .widthIn(48.dp)
                    .fillMaxWidth()
                    .padding(4.dp, 2.dp)
            ) {
                val navigationLevelPadding = 28.dp * LocalNavigationLevel.current
                Layer(
                    modifier = Modifier.fillMaxWidth().height(36.dp),
                    shape = FluentTheme.shapes.control,
                    color = animateColorAsState(
                        targetValue = color.fillColor,
                        animationSpec = tween(
                            durationMillis = FluentDuration.QuickDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ).value,
                    contentColor = color.contentColor,
                    border = null,
                    backgroundSizing = BackgroundSizing.OuterBorderEdge
                ) {
                    Box(
                        modifier = Modifier
                            .clickable(
                                onClick = { onSelectedChanged(!selected) },
                                interactionSource = interaction,
                                indication = null,
                                enabled = enabled
                            )
                            .padding(start = navigationLevelPadding),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if (icon != null) {
                                Box(
                                    modifier = Modifier.padding(start = 12.dp).size(16.dp),
                                    contentAlignment = Alignment.Center,
                                    content = { icon() }
                                )
                            }
                            if (expand) {
                                Row(
                                    modifier = Modifier
                                        .weight(1f)
                                        .wrapContentWidth(Alignment.Start)
                                        .padding(start = 16.dp, end = 12.dp),
                                    horizontalArrangement = Arrangement.spacedBy(
                                        space = 8.dp,
                                        alignment = Alignment.CenterHorizontally
                                    ),
                                    verticalAlignment = Alignment.CenterVertically,
                                    content = text
                                )
                                if (badge != null) {
                                    Box(
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier.padding(
                                            end = if (items != null) {
                                                4.dp
                                            } else {
                                                12.dp
                                            }
                                        )
                                    ) {
                                        badge()
                                    }
                                }
                                if (items != null) {
                                    val rotation by animateFloatAsState(
                                        targetValue = if (expandItems) {
                                            180f
                                        } else {
                                            00f
                                        },
                                        animationSpec = tween(
                                            durationMillis = FluentDuration.ShortDuration,
                                            easing = FluentEasing.FastInvokeEasing
                                        )
                                    )

                                    val fraction by animateFloatAsState(
                                        targetValue = if (expand) 1f else 0f,
                                        animationSpec = tween(
                                            durationMillis = FluentDuration.ShortDuration,
                                            easing = FluentEasing.FastInvokeEasing
                                        )
                                    )
                                    FontIcon(
                                        type = FontIconPrimitive.ChevronDown,
                                        size = FontIconSize.Small,
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(start = 2.dp, end = 14.dp)
                                            .wrapContentWidth(Alignment.CenterHorizontally)
                                            .graphicsLayer {
                                                rotationZ = rotation
                                                alpha = if (fraction == 1f) {
                                                    1f
                                                } else {
                                                    0f
                                                }
                                            }
                                    )
                                }
                            }
                        }

                if (badge != null && !expand) {
                        Box(
                            modifier = Modifier.align(Alignment.TopEnd)
                                .padding(top = 2.dp, end = 2.dp)
                        ) {
                            badge()
                        }
                    }
                }}
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = navigationLevelPadding),
                    content = {
                        SideNavigationIndicatorScope(indicatorState).indicator(color.indicatorColor)
                    }
                )
            }

            if (items != null) {
                AnimatedVisibility(
                    visible = expandItems && expand,
                    enter = fadeIn(
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ) + expandVertically(
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ),
                    exit = fadeOut(
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ) + shrinkVertically(
                        animationSpec = tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CompositionLocalProvider(
                        value = LocalNavigationLevel provides LocalNavigationLevel.current + 1,
                        content = {
                            Column(
                                content = {
                                    items(FakeMenuFlyoutContainerScope)
                                }
                            )
                        }
                    )
                }
            }
        }
    }

}

/**
 * Composable function for rendering the header of a side navigation panel.
 *
 * This function displays a header within a side navigation panel, typically used for titles or important information.
 * It only renders its content when the side navigation is expanded.
 *
 * @param modifier The [Modifier] to be applied to the header's container.
 * @param visible Determines if the header should be visible. Defaults to [LocalNavigationExpand.current].
 * @param content The composable content to be displayed within the header.
 */
@Composable
fun SideNavHeader(
    modifier: Modifier = Modifier,
    visible: Boolean = LocalNavigationExpand.current,
    content: @Composable () -> Unit
) {
    if (visible) {
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = modifier
                .height(40.dp)
                .padding(horizontal = 16.dp),
            content = {
                CompositionLocalProvider(
                    value = LocalTextStyle provides FluentTheme.typography.bodyStrong,
                    content = content
                )
            }
        )
    }
}

/**
 * Composable function that renders the header area of a side navigation component.
 *
 * This function arranges the title, back button, and expand button in the header
 * based on the current [NavigationDisplayMode] and the expansion state.
 *
 * @param title The composable content for the header's title.
 * @param backButton The composable content for the back button.
 * @param expandButton The composable content for the expand/collapse button.
 * @param modifier The [Modifier] to be applied to the header area.
 * @param expand A boolean indicating whether the side navigation is expanded.
 *   Defaults to the value of [LocalNavigationExpand.current].
 * @param displayMode The [NavigationDisplayMode] determining how the header
 *   content is arranged. Defaults to [NavigationDisplayMode.Left].
 */
@Composable
fun SideNavHeaderArea(
    title: @Composable () -> Unit,
    backButton: @Composable () -> Unit,
    expandButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    expand: Boolean = LocalNavigationExpand.current,
    displayMode: NavigationDisplayMode = NavigationDisplayMode.Left
) {
    val titleStyle = FluentTheme.typography.bodyStrong
    when (displayMode) {
        NavigationDisplayMode.LeftCollapsed -> {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                backButton()
                expandButton()
                CompositionLocalProvider(
                    value = LocalTextStyle provides titleStyle,
                    content = title
                )
            }
        }

        else -> {
            Column(modifier = modifier) {
                backButton()
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.height(40.dp)
                ) {
                    expandButton()
                    if (expand) {
                        CompositionLocalProvider(
                            value = LocalTextStyle provides titleStyle,
                            content = title
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                }
            }
        }
    }
}

@Immutable
private class SideNavigationIndicatorScope(private val indicatorState: IndicatorState?) :
    IndicatorScope {

    @Composable
    override fun Modifier.indicatorOffset(visible: () -> Boolean): Modifier {
        val display by rememberUpdatedState(visible)
        val selectionState = indicatorState?.selectedItem
        val indicatorState = remember {
            MutableTransitionState(display())
        }
        indicatorState.targetState = display()
        val animationModifier = if (selectionState != null) {
            Modifier.indicatorOffsetAnimation(16.dp, indicatorState, selectionState)
        } else {
            val height by updateTransition(display()).animateDp(
                targetValueByState = { if (it) 16.dp else 0.dp },
                transitionSpec = {
                    if (targetState) {
                        tween(
                            durationMillis = FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    } else {
                        tween(
                            durationMillis = FluentDuration.QuickDuration,
                            easing = FluentEasing.SoftDismissEasing
                        )
                    }
                })
            Modifier.height(height)
        }
        return then(animationModifier)
    }
}

internal class NavigationAutoSuggestBoxScopeImpl(
    private val focusRequest: FocusRequester
) : NavigationAutoSuggestBoxScope {
    override fun Modifier.focusHandle() = focusRequester(focusRequest)
}

private object FakeMenuFlyoutContainerScope : MenuFlyoutContainerScope,
    MenuFlyoutScope by MenuFlyoutScopeImpl() {
    override var isFlyoutVisible: Boolean = false

    override fun Modifier.flyoutAnchor(): Modifier {
        return this
    }

    override fun Modifier.flyoutSize(matchAnchorWidth: Boolean): Modifier {
        return this
    }
}
