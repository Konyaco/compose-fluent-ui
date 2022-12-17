package com.konyaco.fluent.component

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration

/**
 * Progress bar
 * @param progress `0f` to `1f`
 * @param color Line color
 */
@Composable
fun ProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.fillAccent.default
) {
    Box(
        modifier = modifier.defaultMinSize(minWidth = 130.dp, minHeight = 3.dp),
        propagateMinConstraints = true,
        contentAlignment = Alignment.CenterStart
    ) {
        Rail()
        Box(Modifier.matchParentSize()) {
            Track(progress, color)
        }
    }
}

@Composable
private fun Rail() {
    Box(Modifier.requiredHeight(1.dp).background(FluentTheme.colors.controlStrong.default, CircleShape))
}

private val TrackWidth = 3.dp

@Composable
private fun Track(
    progress: Float,
    color: Color
) {
    Canvas(Modifier.fillMaxSize()) {
        if (progress > 0f) {
            val half = (TrackWidth / 2).toPx()
            drawLine(
                color,
                start = Offset(half, half),
                strokeWidth = TrackWidth.toPx(),
                end = Offset(progress * (size.width - half), half),
                cap = StrokeCap.Round
            )
        }
    }
}

private val LongWidth = 100.dp
private val ShortWidth = 50.dp
private val Easing = CubicBezierEasing(0.5f, 0f, 0.5f, 1.0f)

/**
 * Undetermined progress bar
 * @param color Line color
 */
@Composable
fun ProgressBar(
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.fillAccent.default
) {
    Box(
        modifier.defaultMinSize(minWidth = 130.dp, minHeight = 3.dp),
        contentAlignment = Alignment.CenterStart,
        propagateMinConstraints = true
    ) {
        // TODO: In Fluent Design Specification, the undetermined ProgressBar has a rail. But the rail does not present in WinUI3 Gallery
        // Rail()
        Box(Modifier.matchParentSize()) {
            val infinite = rememberInfiniteTransition()
            val progress by infinite.animateFloat(
                0f, 1f, InfiniteRepeatableSpec(
                    animation = tween(
                        durationMillis = FluentDuration.VeryLongDuration * 3,
                        easing = Easing
                    )
                )
            )

            /*
                |               totalWidth                 |
                |          preWidth         |  size.width  |
                |  long  | size.width |short|  size.width  |
                 --------[            ]-----[ display area ]
                |          preWidth         |  size.width  |  long  | size.width |short|
                                            [ display area ]--------[            ]-----
             */
            Canvas(Modifier.fillMaxSize().clip(CircleShape)) {
                val trackWidth = TrackWidth.toPx()
                val half = trackWidth / 2

                val shortWidthPx = ShortWidth.toPx()
                val longWidthPx = LongWidth.toPx()

                val preWidth = shortWidthPx + size.width + longWidthPx
                val totalWidth = size.width + preWidth

                val shortOffset = (progress * totalWidth + longWidthPx + size.width) - preWidth
                val shortStart = half + shortOffset
                val shortEnd = shortStart + shortWidthPx - half

                val longOffset = (progress * totalWidth) - preWidth
                val longStart = half + longOffset
                val longEnd = longStart + longWidthPx - half

                // Short
                drawLine(
                    color,
                    start = Offset(shortStart, half),
                    strokeWidth = TrackWidth.toPx(),
                    end = Offset(shortEnd, half),
                    cap = StrokeCap.Round
                )

                // Long
                drawLine(
                    color,
                    start = Offset(longStart, half),
                    strokeWidth = TrackWidth.toPx(),
                    end = Offset(longEnd, half),
                    cap = StrokeCap.Round
                )
            }
        }
    }
}
