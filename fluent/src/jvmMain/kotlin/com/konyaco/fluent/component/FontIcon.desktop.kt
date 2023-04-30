package com.konyaco.fluent.component

import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.text.platform.Font
import org.jetbrains.skiko.AwtFontManager

@Composable
actual fun ProvideFontIcon(content: @Composable () -> Unit) {
    var fontFamily: FontFamily? by remember { mutableStateOf(null) }
    LaunchedEffect(Unit) {
        fontFamily = AwtFontManager.DEFAULT.findFontFamilyFile("Segoe Fluent Icons")?.let { Font(it).toFontFamily() }
    }

    CompositionLocalProvider(
        LocalFontIconFontFamily provides fontFamily,
        content = content
    )
}