package com.konyaco.fluent.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.layout.HorizontalIndicatorContentLayout
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

@Composable
inline fun SelectorBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        content = content
    )
}

@Composable
fun SelectorBarItem(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    text: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    colors: VisualStateScheme<SelectorBarItemColor> = if (selected) {
        SelectorBarDefaults.selectedItemColors()
    } else {
        SelectorBarDefaults.defaultItemColors()
    },
    enabled: Boolean = true,
    indicator: @Composable (color: Color) -> Unit = { HorizontalIndicator(color = it, visible = selected) },
    interactionSource: MutableInteractionSource? = null,
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
            .selectable(
                selected = selected,
                enabled = enabled,
                interactionSource = targetInteractionSource,
                indication = null,
                onClick = { onSelectedChange(!selected) }
            )
    ) {
        HorizontalIndicatorContentLayout(
            modifier = Modifier.height(40.dp),
            text = text,
            icon = icon,
            trailing = null,
            indicator = { indicator(currentColor.indicatorColor) }
        )
    }
}

object SelectorBarDefaults {

    @Composable
    @Stable
    fun defaultItemColors(
        default: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        pressed: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        disabled: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = SelectorBarItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
    
    @Composable
    @Stable
    fun selectedItemColors(
        default: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        hovered: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.secondary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        pressed: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.tertiary,
            indicatorColor = FluentTheme.colors.fillAccent.default
        ),
        disabled: SelectorBarItemColor = SelectorBarItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.disabled,
            indicatorColor = FluentTheme.colors.fillAccent.disabled
        )
    ) = SelectorBarItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

@Immutable
data class SelectorBarItemColor(
    val fillColor: Color,
    val contentColor: Color,
    val indicatorColor: Color,
)

typealias SelectorBarItemColorScheme = PentaVisualScheme<SelectorBarItemColor>