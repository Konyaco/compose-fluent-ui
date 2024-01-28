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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Checkmark

@Composable
fun CheckBox(
    checked: Boolean,
    label: String? = null,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheckStateChange: (checked: Boolean) -> Unit
) {
    // TODO: Animation, TripleStateCheckbox
    val interactionSource = remember { MutableInteractionSource() }
    val hovered by interactionSource.collectIsHoveredAsState()
    val pressed by interactionSource.collectIsPressedAsState()

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
        val colors = FluentTheme.colors
        val fillColor by animateColorAsState(
            if (checked) when {
                !enabled -> colors.fillAccent.disabled
                pressed -> colors.fillAccent.tertiary
                hovered -> colors.fillAccent.secondary
                else -> colors.fillAccent.default
            } else when {
                !enabled -> colors.controlAlt.disabled
                pressed -> colors.controlAlt.quaternary
                hovered -> colors.controlAlt.tertiary
                else -> colors.controlAlt.secondary
            },
            tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
        )
        Layer(
            modifier = Modifier.size(20.dp),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                1.dp, if (checked) when {
                    !enabled -> colors.fillAccent.disabled
                    else -> Color.Transparent
                } else when {
                    !enabled -> colors.controlStrong.disabled
                    else -> colors.controlStrong.default
                }
            ),
            color = fillColor,
            contentColor = when {
                !enabled -> colors.text.onAccent.disabled
                pressed -> colors.text.onAccent.secondary
                else -> colors.text.onAccent.primary
            },
            outsideBorder = !checked,
            cornerRadius = 4.dp
        ) {
            // TODO: Animation
            Box(contentAlignment = Alignment.Center) {
                if (checked) Icon(
                    modifier = Modifier.size(16.dp),
                    imageVector = Icons.Default.Checkmark,
                    contentDescription = null
                )
            }
        }

        label?.let {
            Spacer(Modifier.width(8.dp))
            Text(
                modifier = Modifier.offset(y = (-1).dp),
                text = it,
                style = FluentTheme.typography.body.copy(color = colors.text.text.primary)
            )
        }
    }
}