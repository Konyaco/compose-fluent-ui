package com.konyaco.fluent.surface

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer

@Composable
fun Card(
    modifier: Modifier,
    shape: Shape = RoundedCornerShape(size = 8.dp),
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier,
        shape = shape,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        content = content
    )
}