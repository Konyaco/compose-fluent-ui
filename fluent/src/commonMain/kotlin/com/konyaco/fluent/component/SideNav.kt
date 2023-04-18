package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.*
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
import com.konyaco.fluent.icons.regular.Navigation

private val LocalExpand = compositionLocalOf { false }

@Composable
fun SideNav(
    modifier: Modifier,
    expanded: Boolean,
    onExpandStateChange: (Boolean) -> Unit,
    footer: @Composable (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    val width by animateDpAsState(
        if (expanded) 320.dp else 48.dp,
        tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Column(modifier.width(width)) {
        Spacer(Modifier.height(8.dp))
        SubtleButton(
            modifier = Modifier.padding(4.dp).size(38.dp, 34.dp),
            onClick = { onExpandStateChange(!expanded) },
            iconOnly = true
        ) {
            Icon(Icons.Default.Navigation, "Expand")
        }
        CompositionLocalProvider(LocalExpand provides expanded) {
            val scrollState = rememberScrollState()
            Box(Modifier.width(width).weight(1f)) {
                Column(Modifier.fillMaxSize().verticalScroll(scrollState)) {
                    content()
                }
                
                // TODO: Fluent scrollbar
                val interactionSource = remember { MutableInteractionSource() }
                val hovered by interactionSource.collectIsHoveredAsState()
                val pressed by interactionSource.collectIsPressedAsState()
                val thickness by animateDpAsState(if (hovered || pressed) 6.dp else 2.dp)
                
                VerticalScrollbar(
                    rememberScrollbarAdapter(scrollState),
                    Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                    style = ScrollbarStyle(
                        thickness = thickness,
                        unhoverColor = FluentTheme.colors.stroke.controlStrong.default,
                        hoverColor = FluentTheme.colors.stroke.controlStrong.default,
                        shape = CircleShape,
                        hoverDurationMillis = 300,
                        minimalHeight = 16.dp
                    ),
                    interactionSource = interactionSource
                )
            }
            footer?.let {
                // Divider
                Box(
                    Modifier.fillMaxWidth().padding(vertical = 8.dp).height(1.dp)
                        .background(FluentTheme.colors.stroke.surface.default.copy(0.2f))
                )
                it()
                Spacer(Modifier.height(4.dp))
            }
        }
    }
}

@Composable
fun SideNavItem(
    selected: Boolean,
    expand: Boolean = LocalExpand.current,
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
        pressed -> FluentTheme.colors.subtleFill.tertiary
        hovered -> FluentTheme.colors.subtleFill.secondary
        else -> FluentTheme.colors.subtleFill.transparent
    }

    Box(Modifier.height(40.dp).fillMaxWidth().padding(4.dp, 2.dp)) {
        Layer(
            modifier = Modifier.fillMaxWidth().height(36.dp),
            shape = RoundedCornerShape(4.dp),
            color = animateColorAsState(
                color, tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
            ).value,
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
        Indicator(Modifier.align(Alignment.CenterStart), selected)
    }
}

@Composable
private fun Indicator(modifier: Modifier, display: Boolean) {
    val height by updateTransition(display).animateDp(transitionSpec = {
        if (targetState) tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
        else tween(FluentDuration.QuickDuration, easing = FluentEasing.SoftDismissEasing)
    }, targetValueByState = { if (it) 16.dp else 0.dp })
    Box(modifier.size(3.dp, height).background(FluentTheme.colors.fillAccent.default, CircleShape))
}