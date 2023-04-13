package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Home
import com.konyaco.fluent.icons.regular.Navigation

@Composable
fun SideNav(modifier: Modifier) {
    var expanded by remember { mutableStateOf(true) }

    val width by animateDpAsState(
        if (expanded) 320.dp else 48.dp,
        tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Column(modifier.width(width)) {
        Spacer(Modifier.height(8.dp))
        SubtleButton(
            modifier = Modifier.padding(4.dp).size(38.dp, 34.dp),
            onClick = { expanded = !expanded },
            iconOnly = true
        ) {
            Icon(Icons.Default.Navigation, "Expand")
        }
        var selected by remember { mutableStateOf(0) }

        repeat(10) {
            Item(
                modifier = Modifier.fillMaxWidth().height(36.dp),
                selected = selected == it,
                onClick = { _ ->
                    selected = it
                },
                icon = {
                    Icon(Icons.Default.Home, contentDescription = null)
                },
                content = {
                    Text("Item $it")
                },
                expand = expanded
            )
        }
        Spacer(Modifier.height(8.dp))
    }
    // Item

}

@Composable
fun Item(
    modifier: Modifier,
    selected: Boolean,
    expand: Boolean,
    onClick: (Boolean) -> Unit,
    icon: @Composable (() -> Unit)? = null,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val color = when {
        selected && hovered -> FluentTheme.colors.subtleFill.tertiary
        selected -> FluentTheme.colors.subtleFill.secondary
        hovered -> FluentTheme.colors.subtleFill.secondary
        pressed -> FluentTheme.colors.subtleFill.tertiary
        else -> FluentTheme.colors.subtleFill.transparent
    }

    Box(Modifier.height(40.dp).fillMaxWidth().padding(4.dp, 2.dp)) {
        Layer(
            modifier = modifier,
            shape = RoundedCornerShape(4.dp),
            color = color,
            contentColor = FluentTheme.colors.text.text.primary,
            outsideBorder = false,
            cornerRadius = 4.dp,
            border = null
        ) {
            Box(
                Modifier.clickable(
                    onClick = { onClick(!selected) },
                    interactionSource = interaction,
                    indication = null
                ),
                Alignment.CenterStart
            ) {
                if (icon != null) Box(Modifier.padding(start = 12.dp).size(16.dp), Alignment.Center) {
                    icon()
                }
                if (expand) {
                    Row(
                        modifier = Modifier.padding(start = 44.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        content()
                    }
                }
            }
        }
        // TODO: Animation
        if (selected) Indicator(Modifier.align(Alignment.CenterStart))
    }
}

@Composable
private fun Indicator(modifier: Modifier) {
    Box(modifier.size(3.dp, 16.dp).background(FluentTheme.colors.fillAccent.default, CircleShape))
}