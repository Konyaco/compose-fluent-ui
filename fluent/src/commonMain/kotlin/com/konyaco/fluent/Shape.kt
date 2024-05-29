package com.konyaco.fluent

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/** https://learn.microsoft.com/en-us/windows/apps/design/signature-experiences/geometry */
@Immutable
class Shapes(
    val overlay: Shape,
    val control: Shape,
    val intersectionEdge: Shape,
)

internal val LocalShapes = staticCompositionLocalOf {
    Shapes(
        overlay = RoundedCornerShape(8.dp),
        control = RoundedCornerShape(4.dp),
        intersectionEdge = RectangleShape
    )
}
