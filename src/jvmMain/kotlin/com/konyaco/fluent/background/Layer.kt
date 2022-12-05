package com.konyaco.fluent.background

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.color.Colors
import com.konyaco.fluent.contentColorFor

@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = Colors.Background.Layer.Default,
    contentColor: Color = contentColorFor(color),
    border: BorderStroke? = null,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalContentColor provides contentColor) {
        Box(
            modifier.shadow(elevation, shape, clip = false)
                .clip(shape)
                .then(if (border != null) Modifier.border(border, shape) else Modifier)
                .background(
                    color = color,
                    shape = shape
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}
