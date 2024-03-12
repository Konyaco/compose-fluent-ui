package com.konyaco.fluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.loadSvgPainter

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun rememberResourcePainter(resPath: String): Painter {
    val density = LocalDensity.current
    val svg = remember(density) {
        val file = ResourceLoader.Default.load(resPath)
        loadSvgPainter(file, density)
    }
    return svg
}