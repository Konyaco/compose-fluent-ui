package com.konyaco.fluent.surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.background.Layer

@Composable
fun Card(modifier: Modifier, content: @Composable () -> Unit) {
    Layer(modifier, outsideBorder = true, content = content)
}