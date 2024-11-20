package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalCompactMode
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

/**
 * Design guide: [WinUI 3 Figma design file](https://www.figma.com/community/file/1159947337437047524)/Primitives/ListItem
 */
@Composable
fun ListItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    selectionType: ListItemSelectionType = ListItemSelectionType.Standard,
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = if (selected) {
        ListItemDefaults.selectedListItemColors()
    } else {
        ListItemDefaults.defaultListItemColors()
    },
) {
    ListItem(
        indicator = if (selectionType == ListItemSelectionType.Standard) {
            { ListItemDefaults.Indicator(selected, enabled) }
        } else {
            null
        },
        selectionIcon = when (selectionType) {
            ListItemSelectionType.Standard -> null
            ListItemSelectionType.Check -> { {
                if (selected) { ListItemDefaults.CheckIcon() }
            } }
            ListItemSelectionType.Radio -> { {
                if (selected) { ListItemDefaults.RadioIcon() }
            } }
        },
        text = text,
        icon = icon,
        trailing = trailing,
        interaction = interaction,
        enabled = enabled,
        onClick = { onSelectedChanged(!selected) },
        colors = colors,
        modifier = modifier
    )
}

/**
 * Design guide: [WinUI 3 Figma design file](https://www.figma.com/community/file/1159947337437047524)/Primitives/ListItem
 */
@Composable
fun ListItem(
    onClick: () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    selectionIcon: (@Composable () -> Unit)? = null,
    indicator: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = ListItemDefaults.defaultListItemColors(),
) {
    val actualInteraction = interaction ?: remember { MutableInteractionSource() }
    val color = colors.schemeFor(actualInteraction.collectVisualState(!enabled))

    val fillColor by animateColorAsState(
        color.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        color.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )
    Layer(
        modifier = modifier
            .defaultMinSize(minWidth = 108.dp, if (LocalCompactMode.current) ListItemCompactHeight else ListItemHeight)
            .padding(horizontal = 5.dp, vertical = 2.dp)
            .fillMaxWidth(),
        shape = FluentTheme.shapes.control,
        color = fillColor,
        contentColor = contentColor,
        border = BorderStroke(1.dp, color.borderBrush),
        backgroundSizing = BackgroundSizing.OuterBorderEdge
    ) {
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier
        ) {
            indicator?.invoke()
            Row(
                modifier = Modifier
                    .clickable(
                        onClick = onClick,
                        interactionSource = actualInteraction,
                        indication = null,
                        enabled = enabled
                    )
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (selectionIcon != null && indicator == null) {
                    Box(
                        contentAlignment = Alignment.CenterStart,
                        modifier = Modifier.padding(horizontal = 2.dp).size(12.dp)
                    ) {
                        selectionIcon()
                    }
                }
                if (icon != null) {
                    Box(
                        modifier = Modifier.size(ListItemDefaults.iconSize),
                        contentAlignment = Alignment.Center
                    ) {
                        icon()
                    }
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                    text()
                }
                CompositionLocalProvider(
                    LocalContentColor provides color.trailingColor,
                    LocalContentAlpha provides color.trailingColor.alpha,
                    LocalTextStyle provides FluentTheme.typography.caption.copy(fontWeight = FontWeight.Normal)
                ) {
                    trailing?.invoke()
                }
            }
        }
    }
}

@Composable
fun ListHeader(
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.text.text.secondary
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier
            .padding(horizontal = 16.dp)
            .height(
                height = if (LocalCompactMode.current) {
                    ListItemCompactHeight
                } else {
                    ListItemHeight
                }
            )
    ) {
        CompositionLocalProvider(
            LocalTextStyle provides FluentTheme.typography.caption.copy(fontWeight = FontWeight.Normal),
            LocalContentAlpha provides color.alpha,
            LocalContentColor provides color,
            content = content
        )
    }
}

@Composable
fun ListItemSeparator(modifier: Modifier) {
    Box(
        Modifier
            .then(modifier)
            .padding(top = 1.dp, bottom = 2.dp)
            .fillMaxWidth().height(1.dp)
            .background(FluentTheme.colors.stroke.divider.default)
    )
}

object ListItemDefaults {

    val iconSize = 16.dp

    @Composable
    fun CheckIcon() {
        FontIconSolid8(
            type = FontIconPrimitive.Accept,
            contentDescription = "Check",
            size = FontIconSize.Small,
        )
    }

    @Composable
    fun RadioIcon() {
        Box(modifier = Modifier
            .size(12.dp)
            .wrapContentSize(Alignment.Center)
            .size(4.dp)
            .background(LocalContentColor.current.copy(LocalContentAlpha.current), CircleShape)
        )
    }

    @Composable
    fun CascadingIcon() {
        FontIcon(
            type = FontIconPrimitive.ChevronRight,
            contentDescription = "cascading",
            size = FontIconSize.Small,
        )
    }

    @Composable
    fun Indicator(
        visible: Boolean = true,
        enabled: Boolean = true,
        color: Color = FluentTheme.colors.fillAccent.default,
        disabledColor: Color = FluentTheme.colors.fillAccent.disabled
    ) {
        val height by updateTransition(visible).animateDp(transitionSpec = {
            if (targetState) tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
            else tween(FluentDuration.QuickDuration, easing = FluentEasing.SoftDismissEasing)
        }, targetValueByState = { if (it) 16.dp else 0.dp })
        Box(
            modifier = Modifier
                .size(width = 3.dp, height = height)
                .background(
                    color = if (enabled) {
                        color
                    } else {
                        disabledColor
                    },
                    shape = CircleShape
                )
        )

    }

    @Composable
    @Stable
    fun defaultListItemColors(
        default: ListItemColor = ListItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ListItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary
        ),
        pressed: ListItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ListItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
        )
    ) = ListItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    @Stable
    fun selectedListItemColors(
        default: ListItemColor = ListItemColor(
            fillColor = FluentTheme.colors.subtleFill.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            trailingColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ListItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary
        ),
        pressed: ListItemColor = default.copy(
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ListItemColor = default.copy(
            contentColor = FluentTheme.colors.text.text.disabled,
            trailingColor = FluentTheme.colors.text.text.disabled,
        )
    ) = ListItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

enum class ListItemSelectionType {
    Standard, Radio, Check
}

@Immutable
data class ListItemColor(
    val fillColor: Color,
    val contentColor: Color,
    val trailingColor: Color,
    val borderBrush: Brush
)

typealias ListItemColorScheme = PentaVisualScheme<ListItemColor>

private val ListItemHeight = 40.dp
private val ListItemCompactHeight = 32.dp