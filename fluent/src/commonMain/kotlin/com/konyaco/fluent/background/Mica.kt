package com.konyaco.fluent.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild

@Composable
fun Mica(modifier: Modifier, content: @Composable () -> Unit) {
    Box(modifier.background(FluentTheme.colors.background.mica.base)) {
        CompositionLocalProvider(LocalContentColor provides FluentTheme.colors.text.text.primary) {
            content()
        }
    }
}

@Composable
fun Mica(
    background: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier,
        propagateMinConstraints = true
    ) {
        val hazeState = remember { HazeState() }
        Box(
            propagateMinConstraints = true,
            modifier = Modifier.matchParentSize().haze(state = hazeState)
        ) {
            background()
        }
        Box(modifier = Modifier.fillMaxSize().hazeChild(state = hazeState, style = MaterialDefaults.mica().style)) {
            CompositionLocalProvider(
                LocalContentColor provides FluentTheme.colors.text.text.primary
            ) {
                content()
            }
        }
    }
}