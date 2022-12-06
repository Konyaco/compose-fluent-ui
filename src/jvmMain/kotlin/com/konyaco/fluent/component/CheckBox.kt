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
import androidx.compose.ui.composed
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.color.Colors

@Composable
fun CheckBox(
    checked: Boolean,
    label: String? = null,
    modifier: Modifier = Modifier,
    disabled: Boolean = false,
    onCheckStateChange: (checked: Boolean) -> Unit
) {
    // TODO: Animation, TripleStateCheckbox
    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

    Row(
        modifier = modifier.composed {
            if (label != null) Modifier.defaultMinSize(minWidth = 120.dp)
            else Modifier
        }.clickable(
            role = Role.Checkbox,
            indication = null,
            interactionSource = interactionSource
        ) { onCheckStateChange(!checked) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        val fillColor by animateColorAsState(
            if (checked) when {
                disabled -> Colors.Fill.Accent.Disabled
                pressed -> Colors.Fill.Accent.Tertiary
                hovered -> Colors.Fill.Accent.Secondary
                else -> Colors.Fill.Accent.Default
            } else when {
                disabled -> Colors.Fill.ControlAlt.Disabled
                pressed -> Colors.Fill.ControlAlt.Quarternary
                hovered -> Colors.Fill.ControlAlt.Tertiary
                else -> Colors.Fill.ControlAlt.Secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                Dp.Hairline, if (checked) Colors.Fill.Accent.Default else Colors.Stroke.ControlStrong.Default
            ),
            color = fillColor,
            contentColor = when {
                disabled -> Colors.Text.OnAccent.Disabled
                pressed -> Colors.Text.OnAccent.Secondary
                else -> Colors.Text.OnAccent.Primary
            },
            borderInside = checked
        ) {
            // TODO: Animation
            Box(contentAlignment = Alignment.Center) {
                if (checked) Icon(
                    painter = rememberResourcePainter("icon/AcceptMedium.svg"),
                    contentDescription = null,
                    modifier = Modifier.size(12.dp)
                )
            }
        }

        label?.let {
            Spacer(Modifier.width(8.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = it,
                style = FluentTheme.typography.body.copy(color = Colors.Text.Text.Primary)
            )
        }
    }
}