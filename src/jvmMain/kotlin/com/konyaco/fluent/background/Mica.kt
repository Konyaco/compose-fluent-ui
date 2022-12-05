package com.konyaco.fluent.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.color.Colors

@Composable
fun Mica(modifier: Modifier, content: @Composable () -> Unit) {
    // TODO: Tint opacity and Luminosity opacity
    Box(modifier.background(Colors.Background.Mica.Base)) {
        content()
    }
}