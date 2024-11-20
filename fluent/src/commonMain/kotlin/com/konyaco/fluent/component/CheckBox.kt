package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

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
    // TODO: Animation, TripleStateCheckbox
    val interactionSource = remember { MutableInteractionSource() }
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled))
    Row(
        modifier = modifier.then(
            if (label != null) Modifier.defaultMinSize(minWidth = 120.dp)
            else Modifier
        ).clickable(
            role = Role.Checkbox,
            indication = null,
            interactionSource = interactionSource
        ) { onCheckStateChange(!checked) },
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
            backgroundSizing = if (!checked) BackgroundSizing.InnerBorderEdge else BackgroundSizing.OuterBorderEdge
        ) {
            Box(contentAlignment = Alignment.CenterStart) {
                androidx.compose.animation.AnimatedVisibility(
                    visible = checked,
                    enter = expandHorizontally(
                        expandFrom = Alignment.Start
                    ), exit = fadeOut(
                        tween(durationMillis = FluentDuration.QuickDuration, easing = FluentEasing.FadeInFadeOutEasing)
                    )
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

typealias CheckBoxColorScheme = PentaVisualScheme<CheckBoxColor>

@Immutable
data class CheckBoxColor(
    val fillColor: Color,
    val contentColor: Color,
    val borderColor: Color,
    val labelTextColor: Color
)

object CheckBoxDefaults {

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