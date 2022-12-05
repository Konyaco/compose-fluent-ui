package com.konyaco.fluent

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import com.konyaco.fluent.FluentTheme

@Stable
class Colors(
    accent: Color,
    onAccent: Color,
    background: Color,
    onBackground: Color
) {
    var accent by mutableStateOf(accent, structuralEqualityPolicy())
        internal set
    var onAccent by mutableStateOf(onAccent, structuralEqualityPolicy())
        internal set
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var onBackground by mutableStateOf(onBackground, structuralEqualityPolicy())
        internal set
}

@Composable
@ReadOnlyComposable
fun contentColorFor(backgroundColor: Color) =
    FluentTheme.colors.contentColorFor(backgroundColor).takeOrElse { LocalContentColor.current }

fun Colors.contentColorFor(backgroundColor: Color): Color {
    return when (backgroundColor) {
        accent -> onAccent
        background -> onBackground
        else -> Color.Unspecified
    }
}