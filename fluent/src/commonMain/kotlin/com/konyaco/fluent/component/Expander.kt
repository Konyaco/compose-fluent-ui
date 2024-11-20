package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import com.konyaco.fluent.surface.Card
import com.konyaco.fluent.surface.CardColor

@Composable
fun Expander(
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    heading: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = FluentTheme.shapes.control,
    icon: (@Composable () -> Unit)? = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    expandContent: (@Composable ColumnScope.() -> Unit) = {},
) {
    Layer(
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        modifier = modifier,
        color = Color.Transparent,
        shape = shape,
        clipContent = true
    ) {
        Column {
            val targetInteractionSource =
                interactionSource ?: remember { MutableInteractionSource() }

            ExpanderItemContent(
                icon = icon,
                heading = heading,
                caption = caption,
                trailing = trailing,
                dropdown = {
                    SubtleButton(
                        interaction = targetInteractionSource,
                        onClick = { onExpandedChanged(!expanded) },
                        content = {
                            val degrees by animateFloatAsState(if (expanded) 180f else 0f)
                            FontIcon(
                                type = FontIconPrimitive.ChevronDown,
                                contentDescription = null,
                                modifier = Modifier.graphicsLayer { rotationZ = degrees }
                            )
                        },
                        iconOnly = true,
                        disabled = !enabled
                    )
                },
                modifier = Modifier.padding(top = 1.dp)
                    .heightIn(ExpanderHeaderHeight)
                    .background(FluentTheme.colors.background.card.default)
                    .clickable(
                        interactionSource = targetInteractionSource,
                        indication = null,
                        onClick = { onExpandedChanged(!expanded) },
                        enabled = enabled
                    )
            )
            ExpanderItemSeparator(color = FluentTheme.colors.stroke.card.default)
            AnimatedVisibility(
                visible = expanded,
                enter = expandVertically(
                    tween(FluentDuration.MediumDuration, 0, FluentEasing.FastInvokeEasing)
                ),
                exit = shrinkVertically(
                    tween(FluentDuration.QuickDuration, 0, FluentEasing.SoftDismissEasing)
                )
            ) {
                Column(modifier = Modifier.padding(bottom = 1.dp)) {
                    expandContent()
                }
            }
        }
    }
}

@Composable
fun ExpanderItem(
    heading: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.background.card.secondary,
    icon: (@Composable () -> Unit)? = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    dropdown: (@Composable () -> Unit)? = {}
) {
    ExpanderItemContent(
        icon = icon,
        heading = heading,
        caption = caption,
        trailing = trailing,
        dropdown = dropdown,
        modifier = modifier.background(color)
    )
}

@Composable
fun CardExpanderItem(
    onClick: () -> Unit,
    heading: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.control,
    enabled: Boolean = true,
    colors: VisualStateScheme<CardColor> = ExpanderDefaults.cardExpanderItemColors(),
    captionColors: VisualStateScheme<Color> = PentaVisualScheme(
        default = FluentTheme.colors.text.text.secondary,
        hovered = FluentTheme.colors.text.text.secondary,
        pressed = FluentTheme.colors.text.text.tertiary,
        disabled = FluentTheme.colors.text.text.disabled
    ),
    interactionSource: MutableInteractionSource? = null,
    icon: (@Composable () -> Unit)? = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    dropdown: (@Composable () -> Unit)? = null,
) {
    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }
    val captionTextColor = captionColors.schemeFor(targetInteractionSource.collectVisualState(!enabled))
    Card(
        onClick = onClick,
        modifier = modifier,
        disabled = !enabled,
        cardColors = colors,
        shape = shape,
        interactionSource = targetInteractionSource
    ) {
        ExpanderItemContent(
            icon = icon,
            heading = heading,
            caption = caption,
            trailing = trailing,
            dropdown = dropdown,
            modifier = Modifier.heightIn(ExpanderHeaderHeight),
            captionTextColor = captionTextColor
        )
    }
}

@Composable
fun CardExpanderItem(
    heading: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.control,
    color: Color = FluentTheme.colors.background.card.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    captionTextColor: Color = FluentTheme.colors.text.text.secondary,
    icon: (@Composable () -> Unit)? = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    dropdown: (@Composable () -> Unit)? = null
) {
    Layer(
        modifier = modifier,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        shape = shape,
        color = color,
        contentColor = contentColor
    ) {
        ExpanderItemContent(
            icon = icon,
            heading = heading,
            caption = caption,
            trailing = trailing,
            dropdown = dropdown,
            modifier = Modifier.heightIn(ExpanderHeaderHeight),
            captionTextColor = captionTextColor
        )
    }
}

@Composable
fun ExpanderItemSeparator(
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.stroke.divider.default
) {
    Box(
        modifier = modifier.fillMaxWidth().height(1.dp).background(color)
    )
}

object ExpanderDefaults {

    @Stable
    @Composable
    fun cardExpanderItemColors(
        default: CardColor = CardColor(
            fillColor = FluentTheme.colors.background.card.default,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.card.default)
        ),
        hovered: CardColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary,
            borderBrush = FluentTheme.colors.borders.control
        ),
        pressed: CardColor = CardColor(
            fillColor = FluentTheme.colors.control.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        disabled: CardColor = pressed.copy(
            fillColor = FluentTheme.colors.background.card.default,
            contentColor = FluentTheme.colors.text.text.disabled,
            borderBrush = SolidColor(FluentTheme.colors.stroke.card.default)
        )
    ) = PentaVisualScheme(default, hovered, pressed, disabled)
}

@Composable
internal fun ExpanderItemContent(
    modifier: Modifier = Modifier,
    captionTextColor: Color = FluentTheme.colors.text.text.secondary,
    icon: (@Composable () -> Unit)? = {},
    heading: @Composable () -> Unit = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    dropdown: (@Composable () -> Unit)? = {}
) {
    Row(
        modifier = Modifier.then(modifier)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (icon != null) {
            Box(
                modifier = Modifier.widthIn(48.dp).defaultMinSize(16.dp),
                contentAlignment = Alignment.Center
            ) {
                icon()
            }
        } else {
            Spacer(modifier = Modifier.width(16.dp))
        }
        Column(modifier = Modifier.padding(vertical = 13.dp)) {
            heading()
            ProvideTextStyle(FluentTheme.typography.caption.copy(captionTextColor)) {
                caption()
            }
        }
        Spacer(modifier = Modifier.weight(1f).height(1.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(end = 8.dp)
        ) {
            trailing()
            if (dropdown != null) {
                Box(
                    modifier = Modifier.padding(start = 4.dp).defaultMinSize(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    dropdown()
                }
            } else {
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

private val ExpanderHeaderHeight = 62.dp
