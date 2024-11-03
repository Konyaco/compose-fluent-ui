package com.konyaco.fluent.component

import androidx.compose.runtime.Composable

@Composable
internal actual fun ProvideFontIcon(content: @Composable () -> Unit) {
    content()
}