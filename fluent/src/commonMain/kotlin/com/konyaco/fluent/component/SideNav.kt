package com.konyaco.fluent.component

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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
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
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.Search
import com.konyaco.fluent.scheme.collectVisualState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
                            Icon(Icons.Default.Search, null)
                        },
                        content = {}
                    )
                }
            }
            val scrollState = rememberScrollState()
            ScrollbarContainer(
                adapter = rememberScrollbarAdapter(scrollState),
                modifier = Modifier.weight(1f),
                content = {
                    Column(
                        content = { content() },
                        modifier = Modifier
                            .fillMaxHeight()
                            .verticalScroll(scrollState)
                            .padding(bottom = 8.dp)
                    )
                }
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
                                    glyph = '\uE972',
                                    iconSize = FontIconDefaults.fontSizeSmall,
                                    vector = Icons.Default.ChevronDown,
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
                }
            }
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
}