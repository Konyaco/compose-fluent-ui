package com.konyaco.fluent.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.layout.overflow.OverflowActionScope
import com.konyaco.fluent.layout.overflow.OverflowFlyoutContainer
import com.konyaco.fluent.layout.overflow.OverflowPosition
import com.konyaco.fluent.layout.overflow.OverflowRow
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualState
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

@Composable
fun BreadcrumbBar(
    modifier: Modifier = Modifier,
    overflow: OverflowPosition = OverflowPosition.Start,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    overflowAction: @Composable OverflowActionScope.() -> Unit = {
        OverflowFlyoutContainer {
            BreadcrumbBarDefaults.OverflowTag(onClick = {
                isFlyoutVisible = true
            })
        }
    },
    items: OverflowRowScope.() -> Unit
) {
    OverflowRow(
        overflow = overflow,
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
        overflowAction = overflowAction,
        content = items,
        modifier = modifier
    )
}

object BreadcrumbBarDefaults {

    @Composable
    fun breadcrumbItemColors(
        default: Color = FluentTheme.colors.text.text.primary,
        hovered: Color = FluentTheme.colors.text.text.secondary,
        pressed: Color = FluentTheme.colors.text.text.tertiary,
        disabled: Color = FluentTheme.colors.text.text.disabled,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun breadcrumbItemInactiveColors(
        default: Color = FluentTheme.colors.text.text.primary,
        hovered: Color = FluentTheme.colors.text.text.secondary,
        pressed: Color = FluentTheme.colors.text.text.tertiary,
        disabled: Color = FluentTheme.colors.text.text.disabled,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun largeBreadcrumbItemColors(
        default: Color = FluentTheme.colors.text.text.primary,
        hovered: Color = FluentTheme.colors.text.text.secondary,
        pressed: Color = FluentTheme.colors.text.text.tertiary,
        disabled: Color = FluentTheme.colors.text.text.disabled,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun largeBreadcrumbItemInactiveColors(
        default: Color = FluentTheme.colors.text.text.secondary,
        hovered: Color = FluentTheme.colors.text.text.primary,
        pressed: Color = FluentTheme.colors.text.text.tertiary,
        disabled: Color = FluentTheme.colors.text.text.disabled,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun overflowTagColors(
        default: Color = FluentTheme.colors.text.text.secondary,
        hovered: Color = FluentTheme.colors.text.text.primary,
        pressed: Color = FluentTheme.colors.text.text.tertiary,
        disabled: Color = FluentTheme.colors.text.text.disabled,
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    fun OverflowTag(
        modifier: Modifier = Modifier,
        colorScheme: VisualStateScheme<Color> = overflowTagColors(),
        chevronVisible: Boolean = true,
        enabled: Boolean = true,
        onClick: () -> Unit
    ) {
        BreadcrumbBarItem(
            onClick = onClick,
            colorScheme = colorScheme,
            chevronVisible = chevronVisible,
            modifier = modifier,
            enabled = enabled
        ) {
            FontIcon(
                type = FontIconPrimitive.More,
                contentDescription = null,
                size = FontIconSize.Small
            )
        }
    }

    @Composable
    fun LargeOverflowTag(
        modifier: Modifier = Modifier,
        colorScheme: VisualStateScheme<Color> = overflowTagColors(),
        chevronVisible: Boolean = true,
        enabled: Boolean = true,
        onClick: () -> Unit
    ) {
        LargeBreadcrumbBarItem(
            onClick = onClick,
            colorScheme = colorScheme,
            chevronVisible = chevronVisible,
            modifier = modifier,
            enabled = enabled
        ) {
            FontIcon(
                type = FontIconPrimitive.More,
                contentDescription = null,
                size = FontIconSize.Standard
            )
        }
    }
}

@Composable
fun BreadcrumbBarItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    chevronVisible: Boolean = true,
    enabled: Boolean = true,
    inactive: Boolean = false,
    colorScheme: VisualStateScheme<Color> = if (inactive) {
        BreadcrumbBarDefaults.breadcrumbItemInactiveColors()
    } else {
        BreadcrumbBarDefaults.breadcrumbItemColors()
    },
    chevronColors: VisualStateScheme<Color> = BreadcrumbBarDefaults.overflowTagColors(),
    content: @Composable () -> Unit
) {
    BasicBreadcrumbBarItem(
        onClick = onClick,
        colorScheme = colorScheme,
        chevronColors = chevronColors,
        textStyle = FluentTheme.typography.body,
        chevronSize = FontIconSize.Small,
        modifier = modifier,
        chevronVisible = chevronVisible,
        enabled = enabled,
        content = content
    )
}

@Composable
fun LargeBreadcrumbBarItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    chevronVisible: Boolean = true,
    enabled: Boolean = true,
    inactive: Boolean = false,
    colorScheme: VisualStateScheme<Color> = if (inactive) {
        BreadcrumbBarDefaults.largeBreadcrumbItemInactiveColors()
    } else {
        BreadcrumbBarDefaults.largeBreadcrumbItemColors()
    },
    chevronColors: VisualStateScheme<Color> = BreadcrumbBarDefaults.overflowTagColors(),
    content: @Composable () -> Unit
) {
    BasicBreadcrumbBarItem(
        onClick = onClick,
        colorScheme = colorScheme,
        chevronColors = chevronColors,
        textStyle = FluentTheme.typography.title,
        chevronSize = FontIconSize.Standard,
        modifier = modifier,
        chevronVisible = chevronVisible,
        enabled = enabled,
        content = content
    )
}

@Composable
fun OverflowBreadcrumbBarItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interaction: MutableInteractionSource? = null,
    colors: VisualStateScheme<ListItemColor> = ListItemDefaults.defaultListItemColors(),
    content: @Composable () -> Unit
) {
    ListItem(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interaction = interaction,
        text = content,
        colors = colors
    )
}

@Composable
private fun BasicBreadcrumbBarItem(
    onClick: () -> Unit,
    colorScheme: VisualStateScheme<Color>,
    chevronColors: VisualStateScheme<Color>,
    textStyle: TextStyle,
    chevronSize: FontIconSize,
    modifier: Modifier = Modifier,
    chevronVisible: Boolean = true,
    enabled: Boolean = true,
    interaction: MutableInteractionSource? = null,
    content: @Composable () -> Unit
) {
    val targetInteraction = interaction ?: remember { MutableInteractionSource() }
    val visualState = targetInteraction.collectVisualState(!enabled)
    val currentColor = colorScheme.schemeFor(visualState)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier.clickable(
                onClick = onClick,
                indication = null,
                interactionSource = targetInteraction
            )
        ) {
            CompositionLocalProvider(
                LocalContentColor provides currentColor,
                LocalContentAlpha provides currentColor.alpha,
                LocalTextStyle provides LocalTextStyle.current.merge(textStyle.copy(color = currentColor)),
                content = content
            )
        }
        if (chevronVisible) {
            val chevronColor = if (enabled) {
                chevronColors.schemeFor(VisualState.Default)
            } else {
                chevronColors.schemeFor(VisualState.Disabled)
            }
            CompositionLocalProvider(
                LocalContentColor provides chevronColor,
                LocalContentAlpha provides chevronColor.alpha,
                LocalTextStyle provides LocalTextStyle.current.copy(chevronColor)
            ) {
                FontIcon(
                    type = FontIconPrimitive.ChevronRight,
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 4.dp),
                    size = chevronSize
                )
            }
        }
    }
}