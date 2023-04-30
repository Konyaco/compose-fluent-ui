package com.konyaco.fluent

import androidx.compose.runtime.Composable

@Composable
expect fun PlatformCompositionLocalProvider(content: @Composable () -> Unit)

