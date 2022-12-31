package com.konyaco.fluent.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor

@Composable
fun Mica(modifier: Modifier, content: @Composable () -> Unit) {
    // TODO: Tint opacity and Luminosity opacity
    Box(modifier.background(FluentTheme.colors.background.mica.base)) {
        CompositionLocalProvider(LocalContentColor provides FluentTheme.colors.text.text.primary) {
            content()
        }
    }
}