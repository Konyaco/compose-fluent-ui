package com.konyaco.fluent.component

import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.text.platform.FontLoadResult

@OptIn(ExperimentalTextApi::class)
@Composable
internal actual fun ProvideFontIcon(content: @Composable () -> Unit) {
    val localFontFamilyResolver = runCatching { LocalFontFamilyResolver.current }.getOrNull()
    val fontFamilyResolver = remember(localFontFamilyResolver) {
        localFontFamilyResolver ?: createFontFamilyResolver()
    }
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