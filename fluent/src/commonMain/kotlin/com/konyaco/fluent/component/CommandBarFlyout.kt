package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.layout.FixedWidthLayout
import com.konyaco.fluent.layout.alignLast
import com.konyaco.fluent.layout.overflow.OverflowActionScope
import com.konyaco.fluent.layout.overflow.OverflowRow
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.layout.overflow.rememberOverflowRowState

@Composable
fun CommandBarFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)? = null,
    spacing: Dp = 4.dp,
    positionProvider: FlyoutPositionProvider = rememberFlyoutPositionProvider(initialPlacement = FlyoutPlacement.BottomAlignedEnd),
    content: OverflowRowScope.() -> Unit
) {
    BasicCommandBarFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        expanded = expanded,
        onExpandedChanged = onExpandedChanged,
        modifier = modifier,
        secondary = secondary,
        spacing = spacing,
        positionProvider = positionProvider,
        content = content,
        isLarge = false
    )
}

@Composable
fun LargeCommandBarFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)? = null,
    spacing: Dp = 4.dp,
    positionProvider: FlyoutPositionProvider = rememberFlyoutPositionProvider(
        initialPlacement = FlyoutPlacement.BottomAlignedEnd
    ),
    content: OverflowRowScope.() -> Unit
) {
    BasicCommandBarFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        expanded = expanded,
        onExpandedChanged = onExpandedChanged,
        modifier = modifier,
        secondary = secondary,
        spacing = spacing,
        positionProvider = positionProvider,
        content = content,
        isLarge = true
    )
}

@Composable
private fun BasicCommandBarFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)? = null,
    spacing: Dp ,
    positionProvider: FlyoutPositionProvider,
    isLarge: Boolean,
    content: OverflowRowScope.() -> Unit
) {
    val state = rememberOverflowRowState()
    val scope = remember(content) { mutableStateOf<OverflowActionScope?>(null) }
    BasicFlyout(
        modifier = modifier,
        visible = visible,
        onDismissRequest = onDismissRequest,
        positionProvider = positionProvider,
        contentPadding = PaddingValues()
    ) {
        val menuFlyoutScope = remember { MenuFlyoutScopeImpl() }
        val arrangement = Arrangement.spacedBy(spacing, Alignment.Start)
        FixedWidthLayout(
            header = {
                OverflowRow(
                    state = state,
                    horizontalArrangement = if (!state.overflowRange.isEmpty() || secondary != null) {
                        Arrangement.alignLast(arrangement, Alignment.End)
                    } else {
                        arrangement
                    },
                    overflowAction = {
                        CommandBarMoreButton(isLarge) {
                            onExpandedChanged(!expanded)
                        }
                        SideEffect {
                            scope.value = this@OverflowRow
                        }
                    },
                    content = content,
                    alwaysShowOverflowAction = secondary != null,
                    contentPadding = PaddingValues(horizontal = 8.dp),
                    modifier = Modifier
                        .height(
                            if (isLarge) {
                                CommandBarDefaults.CommandBarLargeHeight
                            } else {
                                CommandBarDefaults.CommandBarStandardHeight
                            }
                        )
                        .animateContentSize(expandSpec())
                )
            },
            content = {
                AnimatedVisibility(
                    visible = expanded,
                    enter = expandIn(expandSpec()),
                    exit = shrinkOut(expandSpec()),
                ) {
                    Column {
                        MenuFlyoutSeparator(modifier = Modifier.padding(horizontal = 1.dp))
                        Column(
                            modifier = Modifier.padding(top = 0.dp, bottom = 3.dp)
                        ) {
                            scope.value?.apply {
                                repeat(overflowItemCount) {
                                    overflowItem(it)
                                }
                            }
                            secondary?.invoke(menuFlyoutScope, state.overflowRange.isEmpty().not())
                        }
                    }
                }
            }
        )
    }
}

private fun <T> expandSpec() =
    tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)