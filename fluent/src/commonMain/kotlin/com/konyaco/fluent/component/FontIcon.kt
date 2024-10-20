package com.konyaco.fluent.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
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

@Composable
internal fun FontIcon(
    glyph: Char,
    vector: ImageVector?,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    iconSize: TextUnit = FontIconDefaults.fontSizeStandard,
    vectorSize: Dp = with(LocalDensity.current) { iconSize.toDp() }
) {
    FontIcon(
        glyph = glyph,
        modifier = modifier,
        iconSize = iconSize,
        fallback = if (vector == null) {
            null
        } else {
            { Icon(vector, contentDescription, modifier = modifier.size(vectorSize)) }
        }
    )
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
