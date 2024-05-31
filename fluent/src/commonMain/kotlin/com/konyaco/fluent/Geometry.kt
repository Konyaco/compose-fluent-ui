package com.konyaco.fluent

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/** https://learn.microsoft.com/en-us/windows/apps/design/signature-experiences/geometry */

/** align Shape and CornerRadius style properties */
interface Geometry<Type> {
    val overlay: Type
    val control: Type
    val intersectionEdge: Type
}

@Immutable
class Shapes(
    override val overlay: Shape,
    override val control: Shape,
    override val intersectionEdge: Shape,
): Geometry<Shape>

internal val LocalShapes = staticCompositionLocalOf {
    Shapes(
        overlay = createShape(overlayCornerRadius),
        control = createShape(controlCornerRadius),
        intersectionEdge = createShape(intersectionEdgeCornerRadius)
    )
}

internal fun createShape(cornerRadius: Dp): Shape {
    return if (cornerRadius == 0.dp) {
        RectangleShape
    } else {
        RoundedCornerShape(cornerRadius)
    }
}

fun CornerRadius.toShapes(): Shapes {
    return Shapes(
        overlay = createShape(overlay),
        control = createShape(control),
        intersectionEdge = createShape(intersectionEdge)
    )
}

@Immutable
class CornerRadius(
    override val overlay: Dp,
    override val control: Dp,
    override val intersectionEdge: Dp
): Geometry<Dp>

internal val LocalCornerRadius = staticCompositionLocalOf {
    CornerRadius(
        overlay = overlayCornerRadius,
        control = controlCornerRadius,
        intersectionEdge = intersectionEdgeCornerRadius
    )
}

private val overlayCornerRadius = 8.dp
private val controlCornerRadius = 4.dp
private val intersectionEdgeCornerRadius = 0.dp