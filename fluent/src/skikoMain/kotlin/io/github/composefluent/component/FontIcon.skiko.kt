package io.github.composefluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.FontLoadResult
import androidx.compose.ui.text.platform.SystemFont

@Composable
@OptIn(ExperimentalTextApi::class)
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

@OptIn(ExperimentalTextApi::class)
@Stable
private fun FontFamily(familyName: String): FontFamily = FontFamily(
    listOf(
        SystemFont(familyName, FontWeight.W100, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W200, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W300, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W400, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W500, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W600, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W700, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W800, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W900, FontStyle.Normal),
        SystemFont(familyName, FontWeight.W100, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W200, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W300, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W400, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W500, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W600, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W700, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W800, FontStyle.Italic),
        SystemFont(familyName, FontWeight.W900, FontStyle.Italic),
    )
)