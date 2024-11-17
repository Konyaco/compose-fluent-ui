package com.konyaco.fluent.background

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme

@Composable
fun Modifier.elevation(
    elevation: Dp,
    shape: Shape,
    strokeShadow: Brush = if (shape == CircleShape) {
        FluentTheme.colors.borders.circle
    } else {
        FluentTheme.colors.borders.control
    },
    isDarkTheme: Boolean = FluentTheme.colors.darkMode,
) = when {
    elevation.value < 1f -> this
    elevation.value < 3f -> border(
        width = 1.dp,
        brush = if (elevation.value < 2f) {
            SolidColor(FluentTheme.colors.stroke.card.default)
        } else {
            strokeShadow
        },
        shape = shape
    )

    else -> platformElevation(shape = shape, elevation = elevation, isDarkTheme = isDarkTheme)
}

internal fun Modifier.platformElevation(
    elevation: Dp,
    shape: Shape,
    isDarkTheme: Boolean,
    borderWidth: Dp = 1.dp,
): Modifier {
    if (elevation.value <= 2f) return this
    val spotColorOpacity: Float
    val ambientColorOpacity: Float
    when {
        isDarkTheme && elevation.value <= 32 -> {
            spotColorOpacity = 0.26f
            ambientColorOpacity = 0f
        }

        isDarkTheme -> {
            spotColorOpacity = 0.37f
            ambientColorOpacity = 0.37f
        }

        elevation.value <= 32 -> {
            spotColorOpacity = minOf(14f, elevation.value + 6) / 100
            ambientColorOpacity = 0f
        }

        else -> {
            spotColorOpacity = 0.19f
            ambientColorOpacity = 0.15f
        }
    }
    val spotColor = Color.Black.copy(alpha = spotColorOpacity.coerceIn(0f, 1f))
    val ambientColor = Color.Black.copy(alpha = ambientColorOpacity.coerceIn(0f, 1f))
    return if (!supportFluentElevation()) {
        shadow(
            elevation = elevation / 2,
            shape = shape,
            spotColor = spotColor,
            ambientColor = ambientColor
        )
    } else {
        drawWithCache {
            val spotPaint = Paint()
            val ambientPaint = Paint()
            val spotBlurRadius = 0.5f * elevation.toPx()
            val ambientBlurRadius = 0.167f * elevation.toPx()

            spotPaint.color = spotColor
            ambientPaint.color = ambientColor
            spotPaint.isAntiAlias = false
            spotPaint.applyShadowMaskFilter(spotBlurRadius)
            ambientPaint.isAntiAlias = false
            ambientPaint.applyShadowMaskFilter(ambientBlurRadius)
            val borderWidthPx = borderWidth.toPx()
            val path = Path().apply {
                addOutline(
                    shape.createOutline(
                        size = Size(width = size.width - 2 * borderWidthPx, height = size.height - 2 * borderWidthPx),
                        layoutDirection = layoutDirection,
                        density = this@drawWithCache
                    )
                )
            }
            onDrawWithContent {
                val offsetY = elevation.toPx() * 0.25f
                withTransform({
                    translate(left = borderWidthPx, top = borderWidthPx)
                    clipPath(path = path, clipOp = ClipOp.Difference)
                    translate(left = 0f, top = offsetY)
                }) {
                    drawContext.canvas.drawPath(path, spotPaint)
                }

                if (elevation.value > 32f) {
                    // ambient shadow
                    withTransform({
                        translate(left = 0.5f * borderWidthPx, top = 0.5f * borderWidthPx)
                        clipPath(path = path, clipOp = ClipOp.Difference)
                    }) {
                        drawContext.canvas.drawPath(path, ambientPaint)
                    }
                }
                drawContent()
            }
        }
    }
}

object ElevationDefaults {
    val layer: Dp = 0.dp
    val control: Dp = 2.dp
    val cardRest: Dp = 8.dp
    val tooltip: Dp = 16.dp
    val flyout: Dp = 32.dp
    val dialog: Dp = 128.dp
}

internal expect fun Paint.applyShadowMaskFilter(radius: Float)

internal expect fun supportFluentElevation(): Boolean