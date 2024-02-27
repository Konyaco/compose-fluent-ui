package com.konyaco.fluent.surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.shape.FluentRoundedCornerShape

@Composable
fun Card(
    modifier: Modifier,
    shape: Shape = FluentRoundedCornerShape(8.dp),
    content: @Composable () -> Unit
) {
    Layer(modifier = modifier, shape = shape, outsideBorder = true, content = content)
}