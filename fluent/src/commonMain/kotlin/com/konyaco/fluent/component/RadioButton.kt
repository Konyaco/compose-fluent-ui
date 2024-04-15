package com.konyaco.fluent.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.scheme.ValueVisualStateScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlin.math.roundToInt

@Composable
fun RadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    label: String? = null,
    enabled: Boolean = true,
    styles: VisualStateScheme<RadioButtonStyle> = if(selected) {
        RadioButtonDefaults.selectedRadioButtonStyle()
    } else {
        RadioButtonDefaults.defaultRadioButtonStyle()
    },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    // TODO: Extract same logic
    val style = styles.schemeFor(interactionSource.collectVisualState( !enabled))
    Row(modifier.then(
        if (label != null) Modifier.defaultMinSize(minWidth = 120.dp)
        else Modifier
    ).clickable(interactionSource, null) {
        onClick?.invoke()
    }) {
        val fillColor by animateColorAsState(
            style.fillColor,
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = CircleShape,
            color = fillColor,
            border = BorderStroke(
                1.dp,
                style.borderColor
            ),
            backgroundSizing = BackgroundSizing.InnerBorderEdge
        ) {
            Box(contentAlignment = FixedCenterAlignment) {
                // Bullet, Only displays when selected, or is pressed

                val size by animateDpAsState(
                    style.dotSize,
                    tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
                )
                // Inner
                Layer(
                    modifier = Modifier.size(if (size == 0.dp || !selected) size else size + 2.dp), // TODO: Remove this 2dp if outside border is provided
                    shape = CircleShape,
                    color = style.dotColor,
                    border = if (selected) BorderStroke(
                        1.dp,
                        style.dotBorderBrush
                    ) else null,
                    backgroundSizing = BackgroundSizing.InnerBorderEdge,
                    content = {}
                )
            }
        }
        label?.let {
            Spacer(Modifier.width(8.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = it,
                style = FluentTheme.typography.body.copy(
                    color = style.labelColor
                )
            )
        }
    }
}

typealias RadioButtonStyleScheme = ValueVisualStateScheme<RadioButtonStyle>

@Immutable
data class RadioButtonStyle(
    val fillColor: Color,
    val borderColor: Color,
    val labelColor: Color,
    val dotSize: Dp,
    val dotColor: Color,
    val dotBorderBrush: Brush
)

object RadioButtonDefaults {

    @Stable
    @Composable
    fun defaultRadioButtonStyle(
        default: RadioButtonStyle = RadioButtonStyle(
            fillColor = FluentTheme.colors.controlAlt.secondary,
            borderColor = FluentTheme.colors.stroke.controlStrong.default,
            labelColor = FluentTheme.colors.text.text.primary,
            dotSize = 0.dp,
            dotColor = FluentTheme.colors.text.onAccent.primary,
            dotBorderBrush = FluentTheme.colors.borders.circle
        ),
        hovered: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.controlAlt.tertiary,
        ),
        pressed: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.controlAlt.quaternary,
            borderColor = FluentTheme.colors.stroke.controlStrong.disabled,
            dotSize = 10.dp
        ),
        disabled: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.controlAlt.disabled,
            borderColor = FluentTheme.colors.stroke.controlStrong.disabled,
            labelColor = FluentTheme.colors.text.text.disabled
        )
    ) = RadioButtonStyleScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun selectedRadioButtonStyle(
        default: RadioButtonStyle = RadioButtonStyle(
            fillColor = FluentTheme.colors.fillAccent.default,
            borderColor = FluentTheme.colors.fillAccent.default,
            labelColor = FluentTheme.colors.text.text.primary,
            dotSize = 8.dp,
            dotColor = FluentTheme.colors.text.onAccent.primary,
            dotBorderBrush = FluentTheme.colors.borders.circle
        ),
        hovered: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.fillAccent.secondary,
            dotSize = 10.dp,
        ),
        pressed: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.fillAccent.tertiary,
            dotSize = 6.dp
        ),
        disabled: RadioButtonStyle = default.copy(
            fillColor = FluentTheme.colors.fillAccent.disabled,
            borderColor = FluentTheme.colors.fillAccent.disabled,
            labelColor = FluentTheme.colors.text.text.disabled
        )
    ) = RadioButtonStyleScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

private val FixedCenterAlignment = Alignment { size, space, _ ->
    val centerX = (space.width - size.width).toFloat() / 2f
    val centerY = (space.height - size.height).toFloat() / 2f
    IntOffset(x = centerX.toInt(), y = centerY.roundToInt())
}