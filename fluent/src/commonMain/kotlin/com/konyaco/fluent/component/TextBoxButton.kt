package com.konyaco.fluent.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.scheme.VisualStateScheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TextBoxButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: (() -> Unit)? = null,
    colors: VisualStateScheme<ButtonColor> = ButtonDefaults.subtleButtonColors(),
    outsideBorder: Boolean = false,
    interactionSource: MutableInteractionSource? = null,
    focusable: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = interactionSource ?: remember { MutableInteractionSource() }
    ButtonLayer(
        shape = FluentTheme.shapes.control,
        displayBorder = true,
        buttonColors = colors,
        interaction = interaction,
        disabled = !enabled,
        accentButton = !outsideBorder,
        modifier = modifier.defaultMinSize(minWidth = 28.dp, minHeight = 24.dp)
    ) {
        Row(
            Modifier
                .then(
                    if (onClick != null) {
                        Modifier.focusProperties { canFocus = focusable }
                            .clickable(
                                onClick = onClick,
                                interactionSource = interaction,
                                indication = null,
                                enabled = enabled
                            ).pointerHoverIcon(PointerIcon.Default, !enabled)

                    } else {
                        Modifier
                    }
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            content = content
        )
    }
}

@Composable
fun ToggleTextButton(
    checked: Boolean,
    onCheckedChanged: ((Boolean) -> Unit),
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: VisualStateScheme<ButtonColor> = if (checked) {
        ButtonDefaults.accentButtonColors()
    } else {
        ButtonDefaults.subtleButtonColors()
    },
    outsideBorder: Boolean = checked,
    interactionSource: MutableInteractionSource? = null,
    focusable: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = interactionSource ?: remember { MutableInteractionSource() }
    TextBoxButton(
        enabled = enabled,
        onClick = null,
        colors = colors,
        outsideBorder = outsideBorder,
        interactionSource = interaction,
        focusable = focusable,
        content = content,
        modifier = modifier
            .focusProperties { canFocus = focusable }
            .pointerHoverIcon(PointerIcon.Default, !enabled)
            .selectable(
                selected = checked,
                onClick = { onCheckedChanged(!checked) },
                enabled = enabled,
                role = Role.Checkbox,
                interactionSource = interaction,
                indication = null
            )
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RepeatTextBoxButton(
    onClick: (() -> Unit),
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    delay: Long = 200,
    interval: Long = 50,
    colors: VisualStateScheme<ButtonColor> = ButtonDefaults.subtleButtonColors(),
    outsideBorder: Boolean = false,
    interactionSource: MutableInteractionSource? = null,
    focusable: Boolean = false,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = interactionSource ?: remember { MutableInteractionSource() }
    val pressed = interaction.collectIsPressedAsState()
    val scope = rememberCoroutineScope()

    TextBoxButton(
        modifier = modifier
            .focusProperties { canFocus = focusable }
            .pointerHoverIcon(PointerIcon.Default, !enabled)
            .combinedClickable(
                interactionSource = interaction,
                indication = null,
                enabled = enabled,
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
        interactionSource = interaction,
        enabled = enabled,
        colors = colors,
        outsideBorder = outsideBorder,
        onClick = null,
        content = content
    )
}

object TextBoxButtonDefaults {

    @Composable
    fun SearchIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.Search,
            contentDescription = "Search",
            size = size,
            modifier = modifier
        )
    }

    @Composable
    fun ClearIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.Close,
            contentDescription = "Clear",
            size = size,
            modifier = modifier
        )
    }

    @Composable
    fun RevealPasswordIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.RevealPassword,
            contentDescription = "Reveal Password",
            size = size,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowRightIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.ArrowRight,
            contentDescription = "Arrow Right",
            size = size,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronUpIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.ChevronUp,
            contentDescription = "Chevron Up",
            size = size,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronDownIcon(
        size: FontIconSize = FontIconSize.Small,
        modifier: Modifier = Modifier,
    ) {
        FontIcon(
            type = FontIconPrimitive.ChevronDown,
            contentDescription = "Chevron Down",
            size = size,
            modifier = modifier
        )
    }
}