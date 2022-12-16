package com.konyaco.fluent.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme

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
            val y = (TrackWidth / 2).toPx()
            drawLine(
                color,
                start = Offset(0f, y),
                strokeWidth = TrackWidth.toPx(),
                end = Offset(progress * size.width, y),
                cap = StrokeCap.Round
            )
        }
    }
}