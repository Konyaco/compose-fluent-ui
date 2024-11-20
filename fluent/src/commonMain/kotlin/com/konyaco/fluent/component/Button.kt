package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualState
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Deprecated(
    message = "use ButtonColorScheme instead.",
    replaceWith = ReplaceWith("ButtonColorScheme", imports = arrayOf("com.konyaco.fluent.component.ButtonColorScheme"))
)
typealias ButtonColors = ButtonColorScheme

typealias ButtonColorScheme = PentaVisualScheme<ButtonColor>

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
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    contentArrangement: Arrangement.Horizontal = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        interaction = interaction,
        disabled = disabled,
        buttonColors = buttonColors,
        accentButton = false,
        onClick = onClick,
        iconOnly = iconOnly,
        contentArrangement = contentArrangement,
        content = content
    )
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.accentButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    contentArrangement: Arrangement.Horizontal = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        interaction = interaction,
        disabled = disabled,
        buttonColors = buttonColors,
        accentButton = true,
        onClick = onClick,
        iconOnly = iconOnly,
        contentArrangement = contentArrangement,
        content = content
    )
}

@Composable
fun SubtleButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.subtleButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    contentArrangement: Arrangement.Horizontal = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        interaction = interaction,
        disabled = disabled,
        buttonColors = buttonColors,
        accentButton = true,
        onClick = onClick,
        iconOnly = iconOnly,
        contentArrangement = contentArrangement,
        content = content
    )
}

@Composable
fun HyperlinkButton(
    navigateUri: String,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.hyperlinkButtonColors(),
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
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.hyperlinkButtonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    contentArrangement: Arrangement.Horizontal = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
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
        contentArrangement = contentArrangement,
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
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.buttonColors(),
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
        accentButton = false,
        onClick = null,
        iconOnly = iconOnly,
        content = content,
        contentArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    )
}

@Composable
fun DropDownButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.buttonColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    contentArrangement: Arrangement.Horizontal = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        disabled = disabled,
        buttonColors = buttonColors,
        interaction = interaction,
        iconOnly = iconOnly,
        modifier = modifier,
        contentArrangement = contentArrangement
    ) {
        content()
        AnimatedDropDownIcon(interaction)
    }
}

@Composable
fun ToggleButton(
    checked: Boolean,
    onCheckedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    colors: VisualStateScheme<ButtonColor> = if(checked) {
        ButtonDefaults.accentButtonColors()
    } else {
        ButtonDefaults.buttonColors()
    },
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    iconOnly: Boolean = false,
    outsideBorder: Boolean = !checked,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier.selectable(
            selected = checked,
            interactionSource = interaction,
            indication = null,
            onClick = { onCheckedChanged(!checked) },
            role = Role.Checkbox,
            enabled = !disabled
        ),
        interaction = interaction,
        disabled = disabled,
        buttonColors = colors,
        accentButton = !outsideBorder,
        onClick = null,
        iconOnly = iconOnly,
        content = content,
        contentArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    )
}

@Composable
fun SplitButton(
    flyoutClick: () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColors: VisualStateScheme<ButtonColor> = ButtonDefaults.buttonColors(),
    accentButton: Boolean = false,
    disabled: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val currentColor = if (!disabled) {
        buttonColors.schemeFor(VisualState.Default)
    } else {
        buttonColors.schemeFor(VisualState.Disabled)
    }
    val borderBrush = currentColor.borderBrush
    val endContentOffset = remember { mutableStateOf(0f) }
    Layer(
        modifier = modifier.border(BorderStroke(buttonBorderStrokeWidth, currentColor.borderBrush), FluentTheme.shapes.control)
            .drawWithCache {
                /* draw split broder */
                val path = Path()
                val strokeWidth = buttonBorderStrokeWidth.toPx()
                path.moveTo(endContentOffset.value, strokeWidth)
                path.lineTo(endContentOffset.value, size.height - 2 * strokeWidth)
                path.close()
                onDrawWithContent {
                    drawContent()
                    drawPath(path, borderBrush, style = Stroke(strokeWidth))
                }
            },
        shape = FluentTheme.shapes.control,
        color = Color.Transparent,
        contentColor = currentColor.contentColor,
        /* workaround for outside border padding */
        border = null,
        backgroundSizing = if (!accentButton
        ) BackgroundSizing.InnerBorderEdge else BackgroundSizing.OuterBorderEdge
    ) {
        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
            val contentInteraction = remember { MutableInteractionSource() }
            ButtonLayer(
                shape = RectangleShape,
                buttonColors = buttonColors,
                interaction = contentInteraction,
                disabled = disabled,
                accentButton = false,
                displayBorder = false,
                modifier = Modifier.clickable(
                    interactionSource = contentInteraction,
                    indication = null,
                    onClick = onClick,
                    enabled = !disabled
                ).heightIn(buttonMinHeight)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    content()
                }
            }
            val dropDownInteraction = remember { MutableInteractionSource() }
            ButtonLayer(
                shape = RectangleShape,
                buttonColors = buttonColors,
                interaction = dropDownInteraction,
                disabled = disabled,
                accentButton = false,
                displayBorder = false,
                modifier = Modifier.clickable(
                    interactionSource = dropDownInteraction,
                    indication = null,
                    onClick = flyoutClick,
                    enabled = !disabled
                ).fillMaxHeight().onGloballyPositioned {
                    endContentOffset.value = it.positionInParent().x.toInt().toFloat()
                },
            ) {
                Box(
                    modifier = Modifier.fillMaxHeight().padding(start = 1.dp).size(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    AnimatedDropDownIcon(dropDownInteraction)
                }
            }
        }
    }
}

@Composable
fun ToggleSplitButton(
    flyoutClick: () -> Unit,
    onClick: () -> Unit,
    checked: Boolean,
    modifier: Modifier = Modifier,
    colors: VisualStateScheme<ButtonColor> = if(checked) {
        ButtonDefaults.accentButtonColors()
    } else {
        ButtonDefaults.buttonColors()
    },
    accentButton: Boolean = checked,
    disabled: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    SplitButton(
        flyoutClick = flyoutClick,
        onClick = onClick,
        modifier = modifier,
        buttonColors = colors,
        accentButton = accentButton,
        disabled = disabled,
        content = content
    )
}

@Composable
fun PillButton(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    interaction: MutableInteractionSource? = null,
    disabled: Boolean = false,
    colors: VisualStateScheme<ButtonColor> = if (selected) {
        ButtonDefaults.pillButtonSelectedColors()
    } else {
        ButtonDefaults.pillButtonDefaultColors()
    },
    outsideBorder: Boolean = !selected,
    content: @Composable RowScope.() -> Unit
) {
    val targetInteraction = interaction ?: remember { MutableInteractionSource() }
    Button(
        modifier = modifier.selectable(
            selected = selected,
            interactionSource = targetInteraction,
            indication = null,
            onClick = { onSelectedChanged(!selected) },
            role = Role.Checkbox,
            enabled = !disabled
        ),
        interaction = targetInteraction,
        disabled = disabled,
        buttonColors = colors,
        accentButton = !outsideBorder,
        onClick = null,
        iconOnly = false,
        content = content,
        contentArrangement = Arrangement.spacedBy(ButtonDefaults.iconSpacing, Alignment.CenterHorizontally),
        shape = CircleShape
    )
}

@Composable
private fun Button(
    modifier: Modifier,
    interaction: MutableInteractionSource,
    disabled: Boolean,
    buttonColors: VisualStateScheme<ButtonColor>,
    accentButton: Boolean,
    onClick: (() -> Unit)?,
    iconOnly: Boolean,
    contentArrangement: Arrangement.Horizontal,
    shape: Shape = FluentTheme.shapes.control,
    content: @Composable (RowScope.() -> Unit),
) {
    ButtonLayer(
        shape = shape,
        displayBorder = true,
        buttonColors = buttonColors,
        interaction = interaction,
        disabled = disabled,
        accentButton = accentButton,
        modifier = modifier.let {
            if (iconOnly) {
                it.defaultMinSize(32.dp, buttonMinHeight)
            } else {
                it.defaultMinSize(
                    minHeight = buttonMinHeight
                )
            }
        }
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
            horizontalArrangement = contentArrangement,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

/*
common interaction layer for button and split button.
*/
@Composable
internal fun ButtonLayer(
    shape: Shape,
    buttonColors: VisualStateScheme<ButtonColor>,
    interaction: MutableInteractionSource,
    disabled: Boolean,
    accentButton: Boolean,
    displayBorder: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val buttonColor = buttonColors.schemeFor(interaction.collectVisualState(disabled))

    val fillColor by animateColorAsState(
        buttonColor.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        buttonColor.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )
    Layer(
        modifier = modifier,
        shape = shape,
        color = fillColor,
        contentColor = contentColor,
        border = if (displayBorder) BorderStroke(buttonBorderStrokeWidth, buttonColor.borderBrush) else null,
        backgroundSizing = if (!accentButton) BackgroundSizing.InnerBorderEdge else BackgroundSizing.OuterBorderEdge,
        content = content
    )
}

object ButtonDefaults {

    val iconSpacing = 8.dp

    @Stable
    @Composable
    fun buttonColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.control.default,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = FluentTheme.colors.borders.control
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary
        ),
        pressed: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.control.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        disabled: ButtonColor = pressed.copy(
            fillColor = FluentTheme.colors.control.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun accentButtonColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.fillAccent.default,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderBrush = FluentTheme.colors.borders.accentControl
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.secondary
        ),
        pressed: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.fillAccent.tertiary,
            contentColor = FluentTheme.colors.text.onAccent.secondary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.onAccentDefault)
        ),
        disabled: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.fillAccent.disabled,
            contentColor = FluentTheme.colors.text.onAccent.disabled,
            borderBrush = SolidColor(Color.Transparent) // Disabled accent button does not have border
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun subtleButtonColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary,
        ),
        pressed: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.text.disabled
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled,
    )

    @Stable
    @Composable
    fun hyperlinkButtonColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.accent.primary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary
        ),
        pressed: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.accent.secondary,
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.accent.disabled,
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun pillButtonDefaultColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.control.quaternary,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary,
        ),
        pressed: ButtonColor = hovered.copy(
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.control.disabled,
            contentColor = FluentTheme.colors.text.text.disabled
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun pillButtonSelectedColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.fillAccent.default,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.secondary,
            contentColor = FluentTheme.colors.text.onAccent.primary
        ),
        pressed: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.tertiary,
            contentColor = FluentTheme.colors.text.onAccent.secondary
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.disabled,
            contentColor = FluentTheme.colors.text.onAccent.disabled
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

@Composable
private fun AnimatedDropDownIcon(interaction: MutableInteractionSource) {
    val isPressed by interaction.collectIsPressedAsState()
    val animatedOffset = animateDpAsState(
        targetValue = if (isPressed) 2.dp else 0.dp,
        animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )
    FontIcon(
        type = FontIconPrimitive.ChevronDown,
        size = FontIconSize.Small,
        contentDescription = null,
        modifier = Modifier.graphicsLayer { translationY = animatedOffset.value.toPx() }
    )
}

internal val buttonMinHeight = 32.dp
internal val buttonBorderStrokeWidth = 1.dp