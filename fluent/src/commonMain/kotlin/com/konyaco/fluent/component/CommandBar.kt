package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.layout.alignLast
import com.konyaco.fluent.layout.overflow.OverflowActionScope
import com.konyaco.fluent.layout.overflow.OverflowRow
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.layout.overflow.rememberOverflowRowState

@Composable
fun CommandBar(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    color: Color = if (expanded) {
        FluentTheme.colors.background.acrylic.default
    } else {
        FluentTheme.colors.background.acrylic.default.copy(0f)
    },
    border: BorderStroke? = if (expanded) {
        BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout)
    } else {
        null
    },
    placement: FlyoutPlacement = FlyoutPlacement.BottomAlignedEnd,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)? = null,
    spacing: Dp = 0.dp,
    content: OverflowRowScope.() -> Unit
) {
    BasicCommandBar(
        expanded = expanded,
        onExpandedChanged = onExpandedChanged,
        modifier = modifier,
        color = color,
        border = border,
        placement = placement,
        secondary = secondary,
        isLarge = false,
        content = content,
        spacing = spacing
    )
}

@Composable
fun LargeCommandBar(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    color: Color = if (expanded) {
        FluentTheme.colors.background.acrylic.default
    } else {
        FluentTheme.colors.background.acrylic.default.copy(0f)
    },
    border: BorderStroke? = if (expanded) {
        BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout)
    } else {
        null
    },
    placement: FlyoutPlacement = FlyoutPlacement.BottomAlignedEnd,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)? = null,
    spacing: Dp = 0.dp,
    content: OverflowRowScope.() -> Unit
) {
    BasicCommandBar(
        expanded = expanded,
        onExpandedChanged = onExpandedChanged,
        modifier = modifier,
        color = color,
        border = border,
        placement = placement,
        secondary = secondary,
        isLarge = true,
        content = content,
        spacing = spacing
    )
}

@Composable
private fun BasicCommandBar(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier,
    color: Color,
    border: BorderStroke?,
    placement: FlyoutPlacement,
    isLarge: Boolean,
    secondary: (@Composable MenuFlyoutScope.(hasOverFlowItem: Boolean) -> Unit)?,
    spacing: Dp,
    content: OverflowRowScope.() -> Unit
) {
    val currentColor by animateColorAsState(
        targetValue = color,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )
    val state = rememberOverflowRowState()
    val scope = remember(content) { mutableStateOf<OverflowActionScope?>(null) }
    Layer(
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        modifier = modifier.height(
            if (isLarge) {
                CommandBarDefaults.CommandBarLargeHeight
            } else {
                CommandBarDefaults.CommandBarStandardHeight
            }
        ),
        color = currentColor,
        contentColor = LocalContentColor.current,
        border = border
    ) {
        val arrangement = Arrangement.spacedBy(spacing, Alignment.Start)
        OverflowRow(
            state = state,
            horizontalArrangement = if (!state.overflowRange.isEmpty() || secondary != null) {
                Arrangement.alignLast(arrangement, Alignment.End)
            } else {
                arrangement
            },
            overflowAction = {
                CommandBarMoreButton(isLarge = isLarge) {
                    onExpandedChanged(true)
                }
                SideEffect {
                    scope.value = this@OverflowRow
                }
            },
            content = content,
            alwaysShowOverflowAction = secondary != null,
            contentPadding = PaddingValues(horizontal = 8.dp)
        )
        MenuFlyout(
            visible = expanded,
            onDismissRequest = {
                onExpandedChanged(false)
            },
            positionProvider = rememberFlyoutPositionProvider(
                initialPlacement = placement,
                paddingToAnchor = PaddingValues()
            ),
            content = {
                scope.value?.apply {
                    repeat(overflowItemCount) {
                        overflowItem(it)
                    }
                }
                secondary?.invoke(this, state.overflowRange.isEmpty().not())
            }
        )
    }

}

@Composable
fun CommandBarButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColors: ButtonColorScheme = ButtonDefaults.subtleButtonColors(),
    outsideBorder: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit
) {
    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }
    ButtonLayer(
        buttonColors = buttonColors,
        disabled = !enabled,
        modifier = modifier.defaultMinSize(
            minHeight = CommandBarDefaults.CommandBarLargeButtonHeight,
            minWidth = CommandBarDefaults.CommandBarButtonWidth
        ),
        accentButton = !outsideBorder,
        shape = FluentTheme.shapes.control,
        interaction = targetInteractionSource,
        displayBorder = true,
        content = {
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable(
                    interactionSource = targetInteractionSource,
                    indication = null,
                    onClick = onClick,
                    enabled = enabled
                )
            ) {
                content()
            }
        }
    )
}

@Composable
internal fun CommandBarMoreButton(isLarge: Boolean, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
        SubtleButton(
            onClick = onClick,
            iconOnly = true,
            content = {
                FontIcon(type = FontIconPrimitive.More, contentDescription = null)
            },
            modifier = if (isLarge) {
                Modifier.sizeIn(
                    minHeight = CommandBarDefaults.CommandBarLargeButtonHeight,
                    minWidth = CommandBarDefaults.CommandBarIconButtonWidth
                )
            } else {
                Modifier.commandBarIconButtonSize()
            }
        )
    }
}

@Composable
fun CommandBarSeparator(modifier: Modifier = Modifier) {
    Spacer(
        modifier = modifier
            .fillMaxHeight()
            .padding(start = 1.dp, end = 2.dp, top = 8.dp, bottom = 8.dp)
            .width(1.dp)
            .background(FluentTheme.colors.stroke.divider.default)
    )
}

fun Modifier.commandBarIconButtonSize() = then(
    Modifier.sizeIn(
        minHeight = CommandBarDefaults.CommandBarButtonHeight,
        minWidth = CommandBarDefaults.CommandBarIconButtonWidth
    )
)

fun Modifier.commandBarButtonSize() = then(
    Modifier.sizeIn(
        minHeight = CommandBarDefaults.CommandBarButtonHeight,
        minWidth = CommandBarDefaults.CommandBarButtonWidth
    )
)

object CommandBarDefaults {
    val CommandBarIconButtonWidth = 36.dp
    val CommandBarButtonWidth = 64.dp
    val CommandBarLargeButtonHeight = 52.dp
    val CommandBarButtonHeight = 36.dp

    val CommandBarStandardHeight = 48.dp

    /*
    Container height for icon above button.
     */
    val CommandBarLargeHeight = 64.dp
}