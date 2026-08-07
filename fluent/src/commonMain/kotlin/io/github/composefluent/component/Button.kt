package io.github.composefluent.component

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
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.VisualState
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Deprecated(
    message = "use ButtonColorScheme instead.",
    replaceWith = ReplaceWith("ButtonColorScheme", imports = arrayOf("io.github.composefluent.component.ButtonColorScheme"))
)
typealias ButtonColors = ButtonColorScheme

typealias ButtonColorScheme = PentaVisualScheme<ButtonColor>

/**
 * Represents the color scheme for a button in different states.
 *
 * @property fillColor The background color of the button.
 * @property contentColor The color of the content (text, icons) within the button.
 * @property borderBrush The brush used to draw the border around the button.
 */
@Immutable
data class ButtonColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderBrush: Brush
)

/**
 * A basic button composable.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 * @param disabled Whether the button is enabled or disabled. Defaults to `false`.
 * @param buttonColors The color scheme for the button in different states.
 * Defaults to [ButtonDefaults.buttonColors].
 * @param interaction The [MutableInteractionSource] representing the stream of
 * [androidx.compose.foundation.interaction.Interaction]s for this button. You can create and
 * pass in your own `remember`ed instance to observe [Interaction]s and customize the
 * appearance / behavior of the button in different states.
 * @param iconOnly Whether the button is used to display only an icon. Defaults to `false`.
 * If true, the button's minimum width and height will be constrained to 32.dp.
 * @param contentArrangement The horizontal arrangement of the content within the button.
 * Defaults to [Arrangement.spacedBy] with a spacing of 8.dp and alignment to the center horizontally.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button with an accent style, typically used for primary actions.
 *
 * This button is visually distinct from the standard [Button], using a more prominent color scheme
 * to draw attention to the primary action.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier Optional [Modifier] to be applied to the button.
 * @param disabled Controls the enabled state of the button. When true, the button is not clickable
 *   and its appearance changes to indicate that it is disabled.
 * @param buttonColors The color scheme for the button in its different states (default, hovered,
 *   pressed, disabled). Defaults to the accent button colors defined in [ButtonDefaults].
 * @param interaction The [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this button. You can create and pass in your own `remember`ed instance to observe
 *   [Interaction]s and customize the button's appearance in response to different [Interaction]s.
 * @param iconOnly Determines if the button will only contain an icon. If true, the button's size
 *   is adjusted to fit only an icon.
 * @param contentArrangement The horizontal arrangement of the button's content, such as the space
 *  between an icon and the text. Defaults to a horizontal space of 8.dp.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A subtle button variant, designed for less prominent actions or secondary operations.
 *
 * This button is visually subdued, making it suitable for actions that don't need to stand out as much as
 * those performed by an [AccentButton]. It provides a cleaner, more minimalist look.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier Optional [Modifier] to be applied to the button for layout and styling.
 * @param disabled When true, the button is disabled and does not respond to user interactions.
 * @param buttonColors The color scheme to use for the button in its different states. Defaults to the
 *   subtle button colors defined in [ButtonDefaults].
 * @param interaction The [MutableInteractionSource] to observe interactions with the button.
 * @param iconOnly If true, the button is designed to contain only an icon.
 * @param contentArrangement The arrangement of content within the button. Defaults to spaced by 8.dp.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button that behaves like a hyperlink, opening a specified URI when clicked.
 *
 * This composable provides a button that, when clicked, opens the given [navigateUri] in the system's
 * default URI handler (e.g., a web browser for HTTP URLs). It is typically used to create links
 * within your application that lead to external content.
 *
 * @param navigateUri The URI to navigate to when the button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 * @param disabled Whether the button is enabled or disabled. Defaults to `false`.
 * @param buttonColors The color scheme for the button in different states.
 * Defaults to [ButtonDefaults.hyperlinkButtonColors].
 * @param interaction The [MutableInteractionSource] representing the stream of
 * [androidx.compose.foundation.interaction.Interaction]s for this button. You can create and
 * pass in your own `remember`ed instance to observe [Interaction]s and customize the
 * appearance / behavior of the button in different states.
 * @param iconOnly Whether the button is used to display only an icon. Defaults to `false`.
 * If true, the button's minimum width and height will be constrained to 32.dp.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button that behaves like a hyperlink, commonly used for navigation.
 *
 * This button is designed to look like a hyperlink, with an underline or a distinct text color,
 * indicating to the user that it will navigate to another location or perform a navigation-related action.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier Optional [Modifier] to be applied to the button.
 * @param disabled Controls the enabled state of the button. When true, the button is not clickable
 *   and its appearance changes to indicate that it is disabled.
 * @param buttonColors The color scheme for the button in its different states (default, hovered,
 *   pressed, disabled). Defaults to the hyperlink button colors defined in [ButtonDefaults].
 * @param interaction The [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this button. You can create and pass in your own `remember`ed instance to observe
 *   [Interaction]s and customize the button's appearance in response to different [Interaction]s.
 * @param iconOnly Determines if the button will only contain an icon. If true, the button's size
 *   is adjusted to fit only an icon.
 * @param contentArrangement The horizontal arrangement of the button's content, such as the space
 *  between an icon and the text. Defaults to a horizontal space of 8.dp.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button that repeats its action when long-pressed.
 *
 * This composable provides a button that, in addition to a normal click action,
 * repeats the `onClick` action continuously while it is being long-pressed.
 *
 * @param onClick The callback to be invoked when the button is clicked or repeated.
 * @param modifier Optional [Modifier] to be applied to the button.
 * @param delay The initial delay (in milliseconds) before the action starts repeating
 *   after the button is long-pressed. Defaults to 200ms.
 * @param interval The time interval (in milliseconds) between each repeated `onClick` action
 *   while the button is being long-pressed. Defaults to 50ms.
 * @param disabled Controls the enabled state of the button. When true, the button is not
 *   clickable and does not respond to user interactions. Defaults to `false`.
 * @param buttonColors The color scheme for the button in its different states (default, hovered,
 *   pressed, disabled). Defaults to the standard button colors defined in [ButtonDefaults].
 * @param interaction The [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this button. You can create and pass in your own `remember`ed instance to observe
 *   [Interaction]s and customize the button's appearance in response to different [Interaction]s.
 * @param iconOnly Determines if the button will only contain an icon. If true, the button's size
 *   is adjusted to fit only an icon. Defaults to `false`.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button with a built-in dropdown icon, indicating that clicking it will reveal a dropdown menu.
 *
 * This button is visually similar to a standard [Button] but includes an animated chevron icon that
 * indicates the presence of a dropdown. It's suitable for actions that also have additional options
 * available in a flyout or dropdown menu.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 * @param disabled Whether the button is enabled or disabled. Defaults to `false`.
 * @param buttonColors The color scheme for the button in different states.
 * Defaults to [ButtonDefaults.buttonColors].
 * @param interaction The [MutableInteractionSource] representing the stream of
 * [androidx.compose.foundation.interaction.Interaction]s for this button. You can create and
 * pass in your own `remember`ed instance to observe [Interaction]s and customize the
 * appearance / behavior of the button in different states.
 * @param iconOnly Whether the button is used to display only an icon. Defaults to `false`.
 * If true, the button's minimum width and height will be constrained to 32.dp.
 * @param contentArrangement The horizontal arrangement of the content within the button.
 * Defaults to [Arrangement.spacedBy] with a spacing of 8.dp and alignment to the center horizontally.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A toggle button that can be in a checked or unchecked state.
 *
 * This button is visually similar to a checkbox, allowing the user to toggle between two states.
 *
 * @param checked The current checked state of the button.
 * @param onCheckedChanged Callback invoked when the checked state is toggled.
 * @param modifier Optional [Modifier] to be applied to the button.
 * @param disabled Controls the enabled state of the button. When true, the button is not clickable
 *   and its appearance changes to indicate that it is disabled.
 * @param colors The color scheme for the button in its different states. If `checked` is true, it defaults
 *   to [ButtonDefaults.accentButtonColors]; otherwise, it defaults to [ButtonDefaults.buttonColors].
 * @param interaction The [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this button. You can create and pass in your own `remember`ed instance to observe
 *   [Interaction]s and customize the button's appearance in response to different [Interaction]s.
 * @param iconOnly Determines if the button will only contain an icon. If true, the button's size
 *   is adjusted to fit only an icon.
 * @param outsideBorder If `true` when `checked` is `false`, the button has an outside border. Otherwise has no border.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * A button divided into two parts: a primary action area and a flyout toggle.
 *
 * This composable presents a button with a distinct split, where one part triggers a primary
 * action (defined by [onClick]), and the other part (usually visually differentiated by a
 * dropdown icon) reveals additional options or a flyout menu (defined by [flyoutClick]).
 *
 * @param flyoutClick The callback to be invoked when the flyout part of the button is clicked.
 * @param onClick The callback to be invoked when the main part of the button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 * @param buttonColors The color scheme for the button in different states.
 * Defaults to [ButtonDefaults.buttonColors].
 * @param accentButton Determines if the button is styled as an accent button. Defaults to `false`.
 * @param disabled Whether the button is enabled or disabled. Defaults to `false`.
 * @param content The composable content inside the main part of the button.
 * This should typically be a text label or an icon, or a combination of both.
 */
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

/**
 * A split button that toggles its state (checked/unchecked) and also provides a separate flyout action.
 *
 * This button combines the functionality of a [SplitButton] and a toggleable element. It can be in a
 * checked or unchecked state, with the main button area handling the toggling and the flyout area
 * providing additional actions or options.
 *
 * @param flyoutClick The callback to be invoked when the flyout portion of the button is clicked.
 * @param onClick The callback to be invoked when the main button portion is clicked. This typically
 *   toggles the `checked` state.
 * @param checked Indicates whether the button is in a checked or unchecked state.
 * @param modifier The [Modifier] to be applied to this button.
 * @param colors The color scheme for the button in its different states. If `checked` is true,
 *   it defaults to [ButtonDefaults.accentButtonColors]; otherwise, it defaults to
 *   [ButtonDefaults.buttonColors].
 * @param accentButton Determines if the button should have an accent style. Defaults to the value
 *   of `checked`, meaning it will have an accent style when checked.
 * @param disabled Controls the enabled state of the button. When true, the button is not
 *   clickable and its appearance changes to indicate that it is disabled.
 * @param content The composable content inside the main button portion. This should typically be
 *   a text label or an icon, or a combination of both.
 */
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

/**
 * A pill-shaped button that can be toggled on or off.
 *
 * This button is designed to resemble a pill, featuring rounded ends, and is used to represent a
 * binary choice, such as selecting or deselecting an option.
 *
 * @param selected Indicates whether the button is currently selected.
 * @param onSelectedChanged The callback invoked when the button's selection state changes. It
 *   provides a `Boolean` parameter representing the new selection state.
 * @param modifier Optional [Modifier] to be applied to the button.
 * @param interaction The [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this button. If not provided, a new one is created.
 * @param disabled When true, the button is disabled and does not respond to user interactions.
 * @param colors The color scheme for the button in different states. Defaults to
 *   [ButtonDefaults.pillButtonSelectedColors] when selected, and
 *   [ButtonDefaults.pillButtonDefaultColors] when not selected.
 * @param outsideBorder Determines if a border should be drawn around the outside of the button
 *   when it is not selected. Defaults to true when not selected.
 * @param content The composable content inside the button. This should typically be a text label
 *   or an icon, or a combination of both.
 */
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

/**
 * Contains the default values used by [Button] and its related components.
 */
object ButtonDefaults {

    /**
     * The default spacing between the icon and the text content within a button.
     */
    val iconSpacing = 8.dp

    /**
     * Creates a [ButtonColorScheme] with the default colors for a standard button.
     *
     * @param default The default color scheme for the button.
     * @param hovered The color scheme when the button is hovered.
     * @param pressed The color scheme when the button is pressed.
     * @param disabled The color scheme when the button is disabled.
     * @return A [ButtonColorScheme] with the specified color scheme for each state.
     */
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

    /**
     * Creates a color scheme for accent buttons.
     *
     * Accent buttons are typically used for primary actions and have a distinct
     * color scheme to draw the user's attention.
     *
     * @param default The default color scheme for the button.
     * @param hovered The color scheme when the button is hovered.
     * @param pressed The color scheme when the button is pressed.
     * @param disabled The color scheme when the button is disabled.
     * @return A [ButtonColorScheme] that defines the colors for the button in its
     *   various states.
     */
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

    /**
     * Creates a color scheme for a subtle button.
     *
     * Subtle buttons are used for less prominent actions or secondary operations.
     *
     * @param default The color scheme for the default state of the button.
     *   Defaults to a transparent background, primary text color, and no border.
     * @param hovered The color scheme for the hovered state of the button.
     *   Defaults to a secondary subtle fill background and maintains the default text and border colors.
     * @param pressed The color scheme for the pressed state of the button.
     *   Defaults to a tertiary subtle fill background, secondary text color, and no border.
     * @param disabled The color scheme for the disabled state of the button.
     *   Defaults to a disabled subtle fill background, disabled text color, and no border.
     * @return A [ButtonColorScheme] representing the color scheme for the subtle button.
     */
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

    /**
     * Creates a color scheme for a hyperlink button.
     *
     * A hyperlink button is typically used for navigating to a different part of the
     * application or to an external website. These buttons are designed to look like
     * hyperlinks, often with text styling that indicates they are clickable links.
     *
     * @param default The default color scheme of the hyperlink button.
     * @param hovered The color scheme when the button is hovered over.
     * @param pressed The color scheme when the button is pressed.
     * @param disabled The color scheme when the button is disabled.
     * @return A [ButtonColorScheme] representing the color scheme for a hyperlink button.
     */
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

    /**
     * Defines the default color scheme for a pill-shaped button.
     *
     * This function provides a set of colors that can be used for a pill button in its various states:
     * default, hovered, pressed, and disabled. The colors are derived from the current [FluentTheme].
     *
     * @param default The default color scheme for the button.
     * @param hovered The color scheme when the button is hovered.
     * @param pressed The color scheme when the button is pressed.
     * @param disabled The color scheme when the button is disabled.
     * @return A [ButtonColorScheme] that represents the color scheme for the pill button.
     */
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

    /**
     * Creates a color scheme for a pill button when it is selected.
     *
     * @param default The default color scheme when the button is selected.
     * @param hovered The color scheme when the mouse is hovering over the selected button.
     * @param pressed The color scheme when the selected button is being pressed.
     * @param disabled The color scheme when the selected button is disabled.
     * @return A [ButtonColorScheme] representing the color scheme for a selected pill button.
     */
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

/**
 * Displays the shared drop-down chevron used by button-based selection controls.
 *
 * The chevron shifts down briefly while [interaction] is pressed.
 *
 * @param interaction Interaction source whose pressed state drives the animation.
 */
@Composable
internal fun AnimatedDropDownIcon(interaction: MutableInteractionSource) {
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
