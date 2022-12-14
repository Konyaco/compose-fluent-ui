package com.konyaco.fluent.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme

@Composable
fun ProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.fillAccent.default
){
    BoxWithConstraints(
        modifier = modifier.defaultMinSize(minWidth = 220.dp, minHeight = 32.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        val maxWidth by rememberUpdatedState(maxWidth)
        ProgressBar(
            modifier = modifier,
            start = 0.dp,
            length = maxWidth * progress,
            color = color
        )
    }
}

@Composable
private fun ProgressBar(
    modifier: Modifier = Modifier,
    start: Dp,
    length: Dp,
    color: Color = FluentTheme.colors.fillAccent.default,
) {
    Box() {
        Box(
            modifier = modifier,
            contentAlignment = Alignment.CenterStart
        ) {
            Rail()
            Row {
                Spacer(Modifier.width(start))
                Track(length, color)
            }
        }
    }
}

@Composable
private fun Rail() {
    // Rail
    Box(Modifier
        .requiredHeight(1.dp)
        .fillMaxWidth()
        .padding(horizontal = 1.dp)
        .background(FluentTheme.colors.controlStrong.default, CircleShape)
    )
}

@Composable
private fun Track(
    length: Dp,
    color: Color
) {
    // Track
    Box(
        Modifier
            .width(length)
            .requiredHeight(3.dp)
            .background(color, CircleShape)
    )
}