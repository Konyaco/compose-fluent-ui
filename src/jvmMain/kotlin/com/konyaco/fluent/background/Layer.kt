package com.konyaco.fluent.background

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.color.Colors
import com.konyaco.fluent.contentColorFor

@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = Colors.Background.Layer.Default,
    contentColor: Color = contentColorFor(color),
    border: BorderStroke? = null,
    outsideBorder: Boolean = false,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            Box(
                modifier.shadow(elevation, shape, clip = false)
                    .composed { if (border != null) Modifier.border(border, shape) else Modifier }
                    .clip(shape)
                    .composed { if (outsideBorder) Modifier.padding((1.2).dp) else Modifier } // TODO: A better way to implement outside border
                    .background(color = color, shape = if (shape != CircleShape) RoundedCornerShape(2.5.dp) else shape), // TODO: A better way to set content corner
                propagateMinConstraints = true
            ) {
                content()
            }
        }
    }
}
