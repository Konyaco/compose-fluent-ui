package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.toggleableState
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState

/**
 * A composable function that renders a CheckBox with an optional label.
 *
 * @param checked Whether the checkbox is checked or not.
 * @param label The optional label to display next to the checkbox.
 * @param modifier Modifier to be applied to the row containing the checkbox and label.
 * @param enabled Whether the checkbox is enabled or not.
 * @param colors The color scheme to use for the checkbox. Defaults to `selectedCheckBoxColors` when checked, and `defaultCheckBoxColors` otherwise.
 * @param onCheckStateChange Callback to be invoked when the checked state of the checkbox changes.
 */
@Composable
fun CheckBox(
    checked: Boolean,
    label: String? = null,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: VisualStateScheme<CheckBoxColor> = if(checked) {
        CheckBoxDefaults.selectedCheckBoxColors()
    } else {
        CheckBoxDefaults.defaultCheckBoxColors()
    },
    onCheckStateChange: (checked: Boolean) -> Unit
) {
    TriStateCheckBox(
        state = if (checked) ToggleableState.On else ToggleableState.Off,
        label = label,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        onClick = { onCheckStateChange(!checked) }
    )
}

/**
 * A composable function that renders a tri-state CheckBox with an optional label.
 *
 * [onClick] is responsible for updating [state]. This allows callers to decide how an
 * indeterminate state should transition instead of treating it as a third selectable option.
 *
 * @param state The current state of the checkbox.
 * @param label The optional label to display next to the checkbox.
 * @param modifier Modifier to be applied to the row containing the checkbox and label.
 * @param enabled Whether the checkbox is enabled.
 * @param colors The color scheme to use for the checkbox.
 * @param onClick Callback invoked when the checkbox is clicked, or `null` for a non-interactive checkbox.
 */
@Composable
fun TriStateCheckBox(
    state: ToggleableState,
    label: String? = null,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: VisualStateScheme<CheckBoxColor> = if (state == ToggleableState.Off) {
        CheckBoxDefaults.defaultCheckBoxColors()
    } else {
        CheckBoxDefaults.selectedCheckBoxColors()
    },
    onClick: (() -> Unit)?
) {
    val interactionSource = remember { MutableInteractionSource() }
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled))
    val iconTransition = remember { CheckBoxIconTransition(state) }
    iconTransition.update(state)

    val interactionModifier = if (onClick != null) {
        Modifier.triStateToggleable(
            state = state,
            enabled = enabled,
            role = Role.Checkbox,
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick
        )
    } else {
        Modifier.semantics(mergeDescendants = true) {
            toggleableState = state
            role = Role.Checkbox
            if (!enabled) disabled()
        }
    }

    Row(
        modifier = modifier.then(
            if (label != null) Modifier.defaultMinSize(minWidth = 120.dp)
            else Modifier
        ).then(interactionModifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val fillColor by animateColorAsState(color.fillColor,
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FadeInFadeOutEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = FluentTheme.shapes.control,
            color = fillColor,
            contentColor = color.contentColor,
            border = BorderStroke(1.dp, color.borderColor),
            backgroundSizing = if (state == ToggleableState.Off) {
                BackgroundSizing.InnerBorderEdge
            } else {
                BackgroundSizing.OuterBorderEdge
            }
        ) {
            Box(contentAlignment = Alignment.CenterStart) {
                if (state == ToggleableState.Indeterminate) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Box(
                            Modifier
                                .size(width = 8.dp, height = 1.dp)
                                .background(
                                    color = color.contentColor,
                                    shape = androidx.compose.foundation.shape.RoundedCornerShape(50)
                                )
                        )
                    }
                }
                androidx.compose.animation.AnimatedVisibility(
                    visible = state == ToggleableState.On,
                    enter = if (iconTransition.animate) {
                        expandHorizontally(
                            expandFrom = Alignment.Start
                        )
                    } else {
                        EnterTransition.None
                    },
                    exit = if (iconTransition.animate) {
                        fadeOut(
                            tween(durationMillis = FluentDuration.QuickDuration, easing = FluentEasing.FadeInFadeOutEasing)
                        )
                    } else {
                        ExitTransition.None
                    }
                ) {
                    Box(Modifier.fillMaxSize(), Alignment.Center) {
                        FontIcon(
                            type = FontIconPrimitive.Accept,
                            contentDescription = null,
                            size = FontIconSize.Small
                        )
                    }
                }
            }
        }

        label?.let {
            Spacer(Modifier.width(8.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = it,
                style = FluentTheme.typography.body.copy(color = color.labelTextColor)
            )
        }
    }
}

private class CheckBoxIconTransition(initialState: ToggleableState) {
    private var state = initialState
    var animate = initialState != ToggleableState.Indeterminate
        private set

    fun update(newState: ToggleableState) {
        if (newState == state) return
        animate = state != ToggleableState.Indeterminate &&
                newState != ToggleableState.Indeterminate
        state = newState
    }
}

typealias CheckBoxColorScheme = PentaVisualScheme<CheckBoxColor>

/**
 * Represents the color scheme for a [CheckBox] in different states.
 *
 * @property fillColor The background color of the checkbox.
 * @property contentColor The color of the content (like the checkmark) inside the checkbox.
 * @property borderColor The color of the border around the checkbox.
 * @property labelTextColor The color of the text label associated with the checkbox.
 */
@Immutable
data class CheckBoxColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderColor: Color,
    val labelTextColor: Color
)

/**
 * Contains the default values used for [CheckBox].
 */
object CheckBoxDefaults {

    /**
     * Creates a [CheckBoxColorScheme] with the default colors for a standard checkbox.
     *
     * @param default The default colors for a selected checkbox.
     * @param hovered The colors for a selected checkbox when it is hovered.
     * @param pressed The colors for a selected checkbox when it is pressed.
     * @param disabled The colors for a selected checkbox when it is disabled.
     * @return A [CheckBoxColorScheme] containing the specified colors for the checkbox states.
     */
    @Stable
    @Composable
    fun defaultCheckBoxColors(
        default: CheckBoxColor = CheckBoxColor(
            fillColor = FluentTheme.colors.controlAlt.secondary,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderColor = FluentTheme.colors.controlStrong.default,
            labelTextColor = FluentTheme.colors.text.text.primary
        ),
        hovered: CheckBoxColor = default.copy(
            fillColor = FluentTheme.colors.controlAlt.tertiary,
        ),
        pressed: CheckBoxColor = default.copy(
            fillColor = FluentTheme.colors.controlAlt.quaternary,
            contentColor = FluentTheme.colors.text.onAccent.secondary
        ),
        disabled: CheckBoxColor = CheckBoxColor(
            fillColor = FluentTheme.colors.controlAlt.disabled,
            contentColor = FluentTheme.colors.text.onAccent.disabled,
            borderColor = FluentTheme.colors.controlStrong.disabled,
            labelTextColor = FluentTheme.colors.text.text.primary
        )
    ) = CheckBoxColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    /**
     * Creates a [CheckBoxColorScheme] for a selected [CheckBox].
     *
     * @param default The default colors for a selected checkbox.
     * @param hovered The colors for a selected checkbox when it is hovered.
     * @param pressed The colors for a selected checkbox when it is pressed.
     * @param disabled The colors for a selected checkbox when it is disabled.
     */
    @Stable
    @Composable
    fun selectedCheckBoxColors(
        default: CheckBoxColor = CheckBoxColor(
            fillColor = FluentTheme.colors.fillAccent.default,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderColor = Color.Transparent,
            labelTextColor = FluentTheme.colors.text.text.primary
        ),
        hovered: CheckBoxColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.secondary,
        ),
        pressed: CheckBoxColor = default.copy(
            fillColor = FluentTheme.colors.fillAccent.tertiary,
            contentColor = FluentTheme.colors.text.onAccent.secondary
        ),
        disabled: CheckBoxColor = CheckBoxColor(
            fillColor = FluentTheme.colors.fillAccent.disabled,
            contentColor = FluentTheme.colors.text.onAccent.disabled,
            borderColor = FluentTheme.colors.fillAccent.disabled,
            labelTextColor = FluentTheme.colors.text.text.primary
        )
    ) = CheckBoxColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}
