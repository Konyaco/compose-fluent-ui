package com.konyaco.fluent.component

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.MoreHorizontal
import com.konyaco.fluent.layout.HorizontalIndicatorContentLayout
import com.konyaco.fluent.layout.overflow.OverflowRow
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.layout.overflow.rememberOverflowRowState
import com.konyaco.fluent.scheme.collectVisualState

@ExperimentalFluentApi
@Composable
fun TopNav(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    indicatorState: IndicatorState? = rememberIndicatorState(),
    header: (@Composable () -> Unit)? = null,
    title: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    autoSuggestBox: (@Composable NavigationAutoSuggestBoxScope.() -> Unit)? = null,
    content: OverflowRowScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalNavigationExpand provides true,
        LocalNavigationLevel provides 0,
        LocalIndicatorState provides indicatorState
    ) {
        val overflowRowState = rememberOverflowRowState()
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 4.dp)
        ) {
            header?.invoke()
            title?.let { TopNavHeader(content = it) }
            OverflowRow(
                state = overflowRowState,
                modifier = modifier.weight(1f).height(48.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                overflowAction = {
                    Box {
                        MenuFlyout(
                            visible = expanded,
                            onDismissRequest = { onExpandedChanged(false) },
                            placement = FlyoutPlacement.Auto,
                            content = {
                                repeat(overflowItemCount) { index ->
                                    overflowItem(index)
                                }
                            }
                        )
                        TopNavItem(
                            selected = false,
                            icon = {
                                FontIcon(
                                    glyph = '\uE712',
                                    vector = Icons.Default.MoreHorizontal,
                                    contentDescription = null,
                                )
                            },
                            onClick = { onExpandedChanged(true) }
                        )
                    }
                },
                content = content
            )
            if (footer != null || autoSuggestBox != null) {
                Spacer(modifier = Modifier.width(48.dp))
            }
            autoSuggestBox?.let {
                Box(
                    propagateMinConstraints = true,
                    modifier = Modifier
                        .size(180.dp, 40.dp)
                        .padding(horizontal = 4.dp, vertical = 4.dp)
                ) {
                    val focusRequester = remember { FocusRequester() }
                    val scope = NavigationAutoSuggestBoxScopeImpl(focusRequester)
                    scope.it()
                }
            }
            footer?.invoke()
        }
    }
}

@ExperimentalFluentApi
@Composable
fun TopNavItem(
    selected: Boolean,
    onClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    flyoutVisible: Boolean = false,
    onFlyoutVisibleChanged: (Boolean) -> Unit = {},
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    colors: NavigationItemColorScheme = if (selected) {
        NavigationDefaults.selectedTopItemColors()
    } else {
        NavigationDefaults.defaultTopItemColors()
    },
    icon: @Composable (() -> Unit)? = null,
    items: (@Composable MenuFlyoutContainerScope.() -> Unit)? = null,
    indicatorState: IndicatorState? = LocalIndicatorState.current,
    indicator: @Composable IndicatorScope.(color: Color) -> Unit = {
        NavigationDefaults.HorizontalIndicator(
            modifier = Modifier.indicatorOffset { selected },
            color = it
        )
    },
    badge: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null
) {
    val iconOnly = icon != null && text == null

    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }
    val currentColor = colors.schemeFor(targetInteractionSource.collectVisualState(!enabled))


    Layer(
        color = currentColor.fillColor,
        contentColor = currentColor.contentColor,
        border = null,
        modifier = modifier.widthIn(if (iconOnly) 40.dp else 49.dp)
            .heightIn(40.dp)
            .indicatorRect(indicatorState, selected)
            .clickable(
                enabled = enabled,
                interactionSource = targetInteractionSource,
                indication = null,
                onClick = {
                    onClick(!selected)
                }
            )
    ) {
        MenuFlyout(
            visible = flyoutVisible && items != null,
            onDismissRequest = {
                onFlyoutVisibleChanged(false)
            },
            placement = FlyoutPlacement.Bottom
        ) {
            items?.invoke(rememberNavigationItemsFlyoutScope(flyoutVisible, onFlyoutVisibleChanged))
        }
        Box {
            HorizontalIndicatorContentLayout(
                modifier = Modifier.height(40.dp),
                text = text,
                icon = icon,
                trailing = items?.let {
                    {
                        val rotation by animateFloatAsState(
                            if (flyoutVisible) {
                                180f
                            } else {
                                00f
                            }
                        )
                        FontIcon(
                            glyph = '\uE972',
                            iconSize = FontIconDefaults.fontSizeSmall,
                            vector = Icons.Default.ChevronDown,
                            contentDescription = null,
                            modifier = Modifier
                                .graphicsLayer {
                                    rotationZ = rotation
                                }
                        )
                    }
                },
                indicator = {
                    val scope = TopNavigationIndicatorScope(indicatorState = indicatorState)
                    scope.indicator(currentColor.indicatorColor)
                }
            )
            if (badge != null) {
                Box(
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier.matchParentSize()
                        .padding(top = 4.dp, end = if (iconOnly) 2.dp else 0.dp)
                ) {
                    badge()
                }
            }
        }
    }

}

@Composable
fun TopNavHeader(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier
            .height(TopNavItemHeight)
            .padding(horizontal = 12.dp)
    ) {
        CompositionLocalProvider(
            LocalTextStyle provides FluentTheme.typography.bodyStrong,
            content = content
        )
    }
}

@Immutable
private class TopNavigationIndicatorScope(
    private val indicatorState: IndicatorState?
) : IndicatorScope {

    @Composable
    override fun Modifier.indicatorOffset(visible: () -> Boolean): Modifier {
        val display by rememberUpdatedState(visible)
        val selectionState = indicatorState?.selectedItem
        val indicatorState = remember {
            MutableTransitionState(display())
        }
        indicatorState.targetState = display()
        val animationModifier = if (selectionState != null) {
            Modifier.indicatorOffsetAnimation(16.dp, indicatorState, selectionState, false)
        } else {
            val width by updateTransition(display()).animateDp(transitionSpec = {
                if (targetState) tween(
                    FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing
                )
                else tween(FluentDuration.QuickDuration, easing = FluentEasing.SoftDismissEasing)
            }, targetValueByState = { if (it) 16.dp else 0.dp })
            Modifier.width(width)
        }
        return then(animationModifier)
    }
}

private val TopNavItemHeight = 40.dp