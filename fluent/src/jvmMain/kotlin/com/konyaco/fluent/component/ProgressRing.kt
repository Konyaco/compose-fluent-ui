package com.konyaco.fluent.component

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration

data class ProgressRingSize(
    val size: Dp,
    val width: Dp
) {
    companion object {
        val Large = ProgressRingSize(64.dp, 6.dp)
        val Medium = ProgressRingSize(32.dp, 3.dp)
        val Small = ProgressRingSize(16.dp, 1.5.dp)
    }
}

@Composable
fun ProgressRing(
    progress: Float,
    modifier: Modifier = Modifier,
    size: ProgressRingSize = ProgressRingSize.Medium,
    color: Color = FluentTheme.colors.fillAccent.default
) {
    Box(modifier.size(size.size)) {
        val density = LocalDensity.current
        val widthPx by remember(density) { derivedStateOf { with(density) { size.width.toPx() } } }
        Canvas(Modifier.fillMaxSize()) {
            drawArc(
                color = color,
                startAngle = -90f,
                sweepAngle = progress * 360f,
                useCenter = false,
                size = this.size,
                style = Stroke(widthPx, cap = StrokeCap.Round)
            )
        }
    }
}

@Composable
fun ProgressRing(
    modifier: Modifier = Modifier,
    size: ProgressRingSize = ProgressRingSize.Medium,
    color: Color = FluentTheme.colors.fillAccent.default
) {
    Box(modifier.size(size.size)) {
        val density = LocalDensity.current
        val widthPx by remember(density) { derivedStateOf { with(density) { size.width.toPx() } } }

        val length by rememberInfiniteTransition().animateFloat(
            initialValue = 0f,
            targetValue = 180f,
            infiniteRepeatable(
                animation = tween(
                    easing = LinearEasing,
                    durationMillis = (FluentDuration.VeryLongDuration * 1.5f).toInt()
                ), repeatMode = RepeatMode.Reverse
            )
        )

        val progress by rememberInfiniteTransition().animateFloat(
            initialValue = 0f,
            targetValue = 360f,
            infiniteRepeatable(
                animation = tween(
                    easing = LinearEasing,
                    durationMillis = FluentDuration.VeryLongDuration
                )
            )
        )

        val start by remember { derivedStateOf { progress - length - 90f } }

        Canvas(Modifier.fillMaxSize()) {
            drawArc(
                color = color,
                startAngle = start,
                sweepAngle = length,
                useCenter = false,
                size = this.size,
                style = Stroke(widthPx, cap = StrokeCap.Round)
            )
        }
    }
}