package com.konyaco.fluent.gallery.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.FontLoadResult

@OptIn(ExperimentalTextApi::class)
@Composable
internal actual fun ProvideFontIcon(content: @Composable () -> Unit) {
    val fontFamilyResolver = LocalFontFamilyResolver.current
    var fontIconFamily by remember {
        mutableStateOf<FontFamily?>(null)
    }
    LaunchedEffect(fontFamilyResolver) {
        val fontName = "Segoe Fluent Icons"
        val fontFamily = FontFamily(fontName)
        fontIconFamily = kotlin.runCatching {
            val result = fontFamilyResolver.resolve(fontFamily).value as FontLoadResult
            if (result.typeface == null || result.typeface?.familyName != fontName) {
                null
            } else {
                fontFamily
            }
        }.getOrNull()
    }
    CompositionLocalProvider(
        LocalFontIconFontFamily provides fontIconFamily,
        content = content
    )
}