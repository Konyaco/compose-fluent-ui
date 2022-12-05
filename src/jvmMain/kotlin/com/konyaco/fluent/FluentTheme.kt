package com.konyaco.fluent

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        content = content
    )
}

object FluentTheme {
    @Deprecated("Not fully implemented")
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }


fun lightColors(
    accent: Color = Color(0xFF0078D4),
    onAccent: Color = Color.White,
    background: Color = Color(0xFFF3F3F3),
    onBackground: Color = Color.Black
): Colors = Colors(accent, onAccent, background, onBackground)

fun darkColors(
    accent: Color = Color(0xFF0078D4),
    onAccent: Color = Color.White,
    background: Color = Color(0xFF202020),
    onBackground: Color = Color.White,
): Colors = Colors(accent, onAccent, background, onBackground)