package com.konyaco.fluent

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
//    defaultFontFamily: FontFamily? = defaultFontFamily(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography/*(defaultFontFamily?.let {
            Typography(
                caption = typography.caption.copy(fontFamily = defaultFontFamily),
                body = typography.body.copy(fontFamily = defaultFontFamily),
                bodyStrong = typography.bodyStrong.copy(fontFamily = defaultFontFamily),
                bodyLarge = typography.bodyLarge.copy(fontFamily = defaultFontFamily),
                subtitle = typography.subtitle.copy(fontFamily = defaultFontFamily),
                title = typography.title.copy(fontFamily = defaultFontFamily),
                titleLarge = typography.titleLarge.copy(fontFamily = defaultFontFamily),
                display = typography.display.copy(fontFamily = defaultFontFamily),
            )
        } ?: typography)*/,
        content = content
    )
}

object FluentTheme {
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


fun lightColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), false)
fun darkColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), true)