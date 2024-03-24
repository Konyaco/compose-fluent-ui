package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.shape.FluentRoundedCornerShape
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Immutable
data class ButtonColors(
    val default: ButtonColor,
    val hovered: ButtonColor,
    val pressed: ButtonColor,
    val disabled: ButtonColor
)

@Immutable
data class ButtonColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderBrush: Brush
)

@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, buttonColors, false, onClick, iconOnly, content)
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = accentButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, buttonColors, true, onClick, iconOnly, content)
}

@Composable
fun SubtleButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = subtleButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    Button(modifier, interaction, disabled, buttonColors, true, onClick, iconOnly, content)
}

@Composable
fun HyperlinkButton(
    navigateUri: String,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = hyperlinkButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val uriHandler = LocalUriHandler.current
    HyperlinkButton(
        modifier = modifier,
        disabled = disabled,
        buttonColors = buttonColors,
        interaction = interaction,
        iconOnly = iconOnly,
        content = content,
        onClick = { uriHandler.openUri(navigateUri) }
    )
}

@Composable
fun HyperlinkButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = hyperlinkButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier.pointerHoverIcon(if (!disabled) PointerIcon.Hand else PointerIcon.Default),
        interaction = interaction,
        disabled = disabled,
        buttonColors = buttonColors,
        true,
        onClick = onClick,
        iconOnly = iconOnly,
        content = content
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RepeatButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    delay: Long = 200,
    interval: Long = 50,
    disabled: Boolean = false,
    buttonColors: ButtonColors = buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val pressed = interaction.collectIsPressedAsState()
    val scope = rememberCoroutineScope()

    Button(
        modifier = modifier.combinedClickable(
            interactionSource = interaction,
            indication = null,
            enabled = !disabled,
            onClick = onClick,
            onLongClick = {
                onClick()
                scope.launch {
                    delay(delay)
                    do {
                        onClick()
                        delay(interval)
                    } while (pressed.value)
                }
            },
            onDoubleClick = {
                onClick()
                onClick()
            }
        ),
        interaction = interaction,
        disabled = disabled,
        buttonColors = buttonColors,
        accentButton = true,
        onClick = null,
        iconOnly = iconOnly,
        content = content
    )
}

@Composable
fun DropDownButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: ButtonColors = buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        disabled = disabled,
        buttonColors = buttonColors,
        interaction = interaction,
        iconOnly = iconOnly,
        modifier = modifier
    ) {
        content()
        AnimatedDropDownIcon(interaction)
    }
}

@Composable
private fun Button(
    modifier: Modifier,
    interaction: MutableInteractionSource,
    disabled: Boolean,
    buttonColors: ButtonColors,
    accentButton: Boolean,
    onClick: (() -> Unit)?,
    iconOnly: Boolean,
    content: @Composable RowScope.() -> Unit
) {
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val buttonColor = when {
        disabled -> buttonColors.disabled
        pressed -> buttonColors.pressed
        hovered -> buttonColors.hovered
        else -> buttonColors.default
    }

    val fillColor by animateColorAsState(
        buttonColor.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        buttonColor.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Layer(
        modifier = modifier.let {
            if (iconOnly) {
                it.defaultMinSize(32.dp, 32.dp)
            } else {
                it.defaultMinSize(
                    minHeight = 32.dp
                )
            }
        },
        shape = FluentRoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, buttonColor.borderBrush),
        color = fillColor,
        contentColor = contentColor,
        outsideBorder = !accentButton
    ) {
        Row(
            Modifier
                .then(
                    if (onClick != null) {
                        Modifier.clickable(
                            onClick = onClick,
                            interactionSource = interaction,
                            indication = null,
                            enabled = !disabled
                        )
                    } else {
                        Modifier
                    }
                )
                .then(if (iconOnly) Modifier else Modifier.padding(horizontal = 12.dp)),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

@Composable
private fun buttonColors(): ButtonColors {
    val colors = FluentTheme.colors

    return remember(colors) {
        ButtonColors(
            default = ButtonColor(
                colors.control.default,
                colors.text.text.primary,
                colors.borders.control
            ),
            hovered = ButtonColor(
                colors.control.secondary,
                colors.text.text.primary,
                colors.borders.control
            ),
            pressed = ButtonColor(
                colors.control.tertiary,
                colors.text.text.secondary,
                SolidColor(colors.stroke.control.default)
            ),
            disabled = ButtonColor(
                colors.control.disabled,
                colors.text.text.disabled,
                SolidColor(colors.stroke.control.default)
            )
        )
    }
}

@Composable
private fun accentButtonColors(): ButtonColors {
    val colors = FluentTheme.colors
    return remember(colors) {
        ButtonColors(
            default = ButtonColor(
                colors.fillAccent.default,
                colors.text.onAccent.primary,
                colors.borders.accentControl
            ),
            hovered = ButtonColor(
                colors.fillAccent.secondary,
                colors.text.onAccent.primary,
                colors.borders.accentControl
            ),
            pressed = ButtonColor(
                colors.fillAccent.tertiary,
                colors.text.onAccent.secondary,
                SolidColor(colors.stroke.control.onAccentDefault)
            ),
            disabled = ButtonColor(
                colors.fillAccent.disabled,
                colors.text.onAccent.disabled,
                SolidColor(Color.Transparent) // Disabled accent button does not have border
            )
        )
    }
}

@Composable
private fun subtleButtonColors(): ButtonColors {
    val colors = FluentTheme.colors
    return remember(colors) {
        ButtonColors(
            default = ButtonColor(
                colors.subtleFill.transparent,
                colors.text.text.primary,
                SolidColor(Color.Transparent)
            ),
            hovered = ButtonColor(
                colors.subtleFill.secondary,
                colors.text.text.primary,
                SolidColor(Color.Transparent)
            ),
            pressed = ButtonColor(
                colors.subtleFill.tertiary,
                colors.text.text.secondary,
                SolidColor(Color.Transparent)
            ),
            disabled = ButtonColor(
                colors.subtleFill.disabled,
                colors.text.text.disabled,
                SolidColor(Color.Transparent)
            ),
        )
    }
}

@Composable
private fun hyperlinkButtonColors(): ButtonColors {
    val colors = FluentTheme.colors
    return remember(colors) {
        ButtonColors(
            default = ButtonColor(
                colors.subtleFill.transparent,
                colors.text.accent.primary,
                SolidColor(Color.Transparent)
            ),
            hovered = ButtonColor(
                colors.subtleFill.secondary,
                colors.text.accent.primary,
                SolidColor(Color.Transparent)
            ),
            pressed = ButtonColor(
                colors.subtleFill.tertiary,
                colors.text.accent.secondary,
                SolidColor(Color.Transparent)
            ),
            disabled = ButtonColor(
                colors.subtleFill.disabled,
                colors.text.accent.disabled,
                SolidColor(Color.Transparent)
            ),
        )
    }
}

@Composable
private fun AnimatedDropDownIcon(interaction: MutableInteractionSource) {
    val isPressed by interaction.collectIsPressedAsState()
    val animatedOffset = animateDpAsState(
        targetValue = if (isPressed) 2.dp else 0.dp,
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )
    Icon(
        imageVector = Icons.Default.ChevronDown,
        contentDescription = null,
        modifier = Modifier.graphicsLayer { translationY = animatedOffset.value.toPx() }.size(12.dp)
    )
}