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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowRight
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.ChevronUp
import com.konyaco.fluent.icons.regular.Dismiss
import com.konyaco.fluent.icons.regular.Eye
import com.konyaco.fluent.icons.regular.Search
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

    val iconFontSmallSize = 12.sp

    val iconVectorSmallSize = 12.dp

    val iconFontMediumSize = 16.sp

    val iconVectorMediumSize = 16.dp

    @Composable
    fun SearchIcon(fontSize: TextUnit = iconFontSmallSize, vectorSize: Dp = iconVectorSmallSize) {
        FontIcon(
            glyph = '\uF78B',
            vector = Icons.Default.Search,
            contentDescription = "Search",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }

    @Composable
    fun ClearIcon(fontSize: TextUnit = iconFontSmallSize, vectorSize: Dp = iconVectorSmallSize) {
        FontIcon(
            glyph = '\uE624',
            vector = Icons.Default.Dismiss,
            contentDescription = "Clear",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }

    @Composable
    fun RevealPasswordIcon(
        fontSize: TextUnit = iconFontSmallSize,
        vectorSize: Dp = iconVectorSmallSize
    ) {
        FontIcon(
            glyph = '\uF78D',
            vector = Icons.Default.Eye,
            contentDescription = "Reveal Password",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }

    @Composable
    fun ArrowRightIcon(
        fontSize: TextUnit = iconFontSmallSize,
        vectorSize: Dp = iconVectorSmallSize
    ) {
        FontIcon(
            glyph = '\uE64D',
            vector = Icons.Default.ArrowRight,
            contentDescription = "Arrow Right",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }

    @Composable
    fun ChevronUpIcon(
        fontSize: TextUnit = iconFontSmallSize,
        vectorSize: Dp = iconVectorSmallSize
    ) {
        FontIcon(
            glyph = '\uE70E',
            vector = Icons.Default.ChevronUp,
            contentDescription = "Chevron Up",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }

    @Composable
    fun ChevronDownIcon(
        fontSize: TextUnit = iconFontSmallSize,
        vectorSize: Dp = iconVectorSmallSize
    ) {
        FontIcon(
            glyph = '\uE70F',
            vector = Icons.Default.ChevronDown,
            contentDescription = "Chevron Down",
            iconSize = fontSize,
            vectorSize = vectorSize
        )
    }
}