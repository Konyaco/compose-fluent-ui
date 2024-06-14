package com.konyaco.fluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
internal actual fun ProvideFontIcon(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalFontIconFontFamily provides null,
        content = content
    )
}