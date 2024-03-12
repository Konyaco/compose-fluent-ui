package com.konyaco.fluent.component

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

//TODO Public
@Composable
internal fun FontIcon(
    glyph: Char,
    modifier: Modifier = Modifier,
    iconSize: TextUnit = FontIconDefaults.fontSizeStandard,
    fallback: (@Composable () -> Unit)? = null,
) {
    if (LocalFontIconFontFamily.current != null || fallback == null) {
        Text(
            text = glyph.toString(),
            fontFamily = LocalFontIconFontFamily.current,
            fontSize = iconSize,
            modifier = Modifier.then(modifier)
                .height(with(LocalDensity.current) { iconSize.toDp() }),
            onTextLayout = {
            }
        )
    } else {
        fallback()
    }
}

internal object FontIconDefaults {
    val fontSizeStandard = 16.sp
    val fontSizeSmall = 12.sp
}

@Composable
internal expect fun ProvideFontIcon(
    content: @Composable () -> Unit
)

internal val LocalFontIconFontFamily =
    staticCompositionLocalOf<FontFamily?> { error("No Font provide for load font icon") }
