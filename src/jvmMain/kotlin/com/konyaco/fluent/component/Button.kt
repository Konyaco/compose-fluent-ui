package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing

object DarkButtonDefaults {
    val textPrimary = Color(0xFFFFFFFF)
    val textSecondary = Color(0xC5FFFFFF)
    val textTertiary = Color(0x87FFFFFF)
    val textDisabled = Color(0x5DFFFFFF)

    val fillDefault = Color(0x0FFFFFFF)
    val fillSecondary = Color(0x15FFFFFF)
    val fillTertiary = Color(0x0BFFFFFF)
    val fillQuarternary = Color(0x0FFFFFFF)
    val fillDisabled = Color(0x4DF9F9F9)
    val fillTransparent = Color(0x00FFFFFF)
    val fillInputActive = Color(0xB31E1E1E)
}

@Composable
fun Button(
    onClick: () -> Unit,
    isDisabled: Boolean = false,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val fillColor by animateColorAsState(
        when {
            isDisabled -> DarkButtonDefaults.fillDisabled
            pressed -> DarkButtonDefaults.fillTertiary
            hovered -> DarkButtonDefaults.fillSecondary
            else -> DarkButtonDefaults.fillDefault
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        when {
            isDisabled -> DarkButtonDefaults.textDisabled
            pressed -> DarkButtonDefaults.textTertiary
            hovered -> DarkButtonDefaults.textSecondary
            else -> DarkButtonDefaults.textPrimary
        },
        animationSpec = tween(FluentDuration.MediumDuration, easing = FluentEasing.FastInvokeEasing)
    )

    // 上 35
    // 侧 下 30
    Layer(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(
            1.dp,
            Brush.verticalGradient(
                listOf(DarkButtonDefaults.fillDefault, DarkButtonDefaults.fillSecondary)
            )
        ),
        color = fillColor,
        contentColor = contentColor,
//        elevation = 1.dp
    ) {
        ProvideTextStyle(FluentTheme.typography.body.copy(color = FluentTheme.colors.onBackground)) {
            Row(
                Modifier
                    .clickable(
                        onClick = onClick,
                        interactionSource = interaction,
                        indication = null
                    )
                    .defaultMinSize(
                        minWidth = 80.dp,
                        minHeight = 32.dp
                    )
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Layer(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(
            Dp.Hairline,
            Brush.verticalGradient(
                0f to FluentTheme.colors.onBackground.copy(0.0625f),
                0.9f to FluentTheme.colors.onBackground.copy(0.0625f),
                1f to FluentTheme.colors.onBackground.copy(0.03125f)
            )
        ),
        color = FluentTheme.colors.accent,
        contentColor = FluentTheme.colors.onAccent
    ) {
        ProvideTextStyle(FluentTheme.typography.body) {
            Row(
                Modifier.clickable(onClick = onClick)
                    .defaultMinSize(
                        minWidth = 80.dp,
                        minHeight = 32.dp
                    )
                    .padding(horizontal = 24.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.Center,
                content = content
            )
        }
    }
}