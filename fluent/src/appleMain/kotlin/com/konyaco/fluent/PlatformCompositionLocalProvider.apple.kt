package com.konyaco.fluent

import androidx.compose.runtime.Composable

@Composable
actual fun PlatformCompositionLocalProvider(content: @Composable () -> Unit) {
    content()
}

