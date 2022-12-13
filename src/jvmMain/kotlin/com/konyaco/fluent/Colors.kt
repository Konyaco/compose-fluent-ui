package com.konyaco.fluent

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

@Stable
class Colors(
    shades: Shades,
    darkMode: Boolean
) {
    var darkMode by mutableStateOf(darkMode)
        internal set
    var shades by mutableStateOf(shades)
        internal set
    var text by mutableStateOf(generateTextColors(shades, darkMode))
        internal set
    var control by mutableStateOf(generateControlColors(shades, darkMode))
        internal set
    var controlAlt by mutableStateOf(generateControlAltColors(shades, darkMode))
        internal set
    var controlSolid by mutableStateOf(generateControlSolidColors(shades, darkMode))
        internal set
    var controlStrong by mutableStateOf(generateControlStrongColors(shades, darkMode))
        internal set
    var fillAccent by mutableStateOf(generateFillAccentColors(shades, darkMode))
        internal set
    var background by mutableStateOf(generateBackground(shades, darkMode))
        internal set

    var stroke by mutableStateOf(generateStroke(shades, darkMode))
        internal set
}

data class Shades(
    val base: Color,
    val light1: Color,
    val light2: Color,
    val light3: Color,
    val dark1: Color,
    val dark2: Color,
    val dark3: Color,
)

data class TextColor(
    val text: ColorCompound,
    val accent: ColorCompound,
    val onAccent: ColorCompound
)

data class ColorCompound(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val disabled: Color
)

data class ControlColors(
    val default: Color,
    val secondary: Color,
    val tertiary: Color,
    val quaternary: Color,
    val disabled: Color,
    val transparent: Color,
    val inputActive: Color,
)

data class ControlAltColors(
    val transparent: Color,
    val secondary: Color,
    val tertiary: Color,
    val quaternary: Color,
    val disabled: Color
)

data class ControlSolidColors(
    val default: Color
)

data class ControlStrongColors(
    val default: Color,
    val disabled: Color
)

data class FillAccentColors(
    val default: Color,
    val secondary: Color,
    val tertiary: Color,
    val disabled: Color,
    val selectedTextBackground: Color
)

data class Stroke(
    val control: Control,
    val controlStrong: ControlStrong
) {
    data class Control(
        val default: Color,
        val secondary: Color,
        val onAccentDefault: Color,
        val onAccentSecondary: Color,
        val onAccentTertiary: Color,
        val disabled: Color,
        val forStrongFillWhenOnImage: Color
    )

    data class ControlStrong(
        val default: Color,
        val disabled: Color
    )
}

data class Background(
    val mica: Mica,
    val layer: Layer
) {
    data class Mica(
        val base: Color,
        val baseAlt: Color
    )

    data class Layer(
        val default: Color,
        val alt: Color
    )
}

fun generateShades(accent: Color): Shades {
    return getAccentShades()[accent] ?: getDefaultShades()
}

internal fun getDefaultShades(): Shades = getAccentShades().entries.first().value

internal fun getAccentShades() = mapOf<Color, Shades>(
    Color(0xFF0078D4) to Shades(
        Color(0xFF0078D4),
        Color(0xFF0093F9),
        Color(0xFF60CCFE),
        Color(0xFF98ECFE),
        Color(0xFF005EB7),
        Color(0xFF003D92),
        Color(0xFF001968)
    ),
)


@Composable
@ReadOnlyComposable
fun contentColorFor(backgroundColor: Color) =
    FluentTheme.colors.contentColorFor(backgroundColor).takeOrElse { LocalContentColor.current }

fun Colors.contentColorFor(backgroundColor: Color): Color {
    // TODO: Remove this
    return when (backgroundColor) {
        shades.base, shades.dark1, shades.dark2, shades.dark3,
        shades.light1, shades.light2, shades.light3 -> text.onAccent.primary

        else -> text.text.primary
    }
}

internal fun generateTextColors(shades: Shades, darkMode: Boolean): TextColor =
    if (darkMode) TextColor(
        text = ColorCompound(
            Color(0xFFFFFFFF),
            Color(0xC5FFFFFF),
            Color(0x87FFFFFF),
            Color(0x5DFFFFFF)
        ),
        accent = ColorCompound(
            shades.light3,
            shades.light3,
            shades.light2,
            Color(0x5DFFFFFF)
        ),
        onAccent = ColorCompound(
            Color(0xFF0000000),
            Color(0x80000000),
            Color(0x87FFFFFF),
            Color(0xFFFFFFFF)
        )
    )
    else TODO()

internal fun generateControlColors(shades: Shades, darkMode: Boolean): ControlColors =
    if (darkMode) ControlColors(
        Color(0x0FFFFFFF),
        Color(0x15FFFFFF),
        Color(0x0BFFFFFF),
        Color(0x0FFFFFFF),
        Color(0x0BFFFFFF),
        Color(0x00FFFFFF),
        Color(0xB31E1E1E)
    )
    else TODO()

internal fun generateControlAltColors(shades: Shades, darkMode: Boolean): ControlAltColors =
    if (darkMode) ControlAltColors(
        Color(0x00FFFFFF),
        Color(0x19000000),
        Color(0x0BFFFFFF),
        Color(0x12FFFFFF),
        Color(0x00FFFFFF)
    ) else TODO()

internal fun generateControlSolidColors(shades: Shades, darkMode: Boolean): ControlSolidColors =
    if (darkMode) ControlSolidColors(Color(0xFF454545))
    else TODO()

internal fun generateControlStrongColors(shades: Shades, darkMode: Boolean): ControlStrongColors =
    if (darkMode) ControlStrongColors(
        Color(0x8BFFFFFF),
        Color(0x3FFFFFFF)
    )
    else TODO()

internal fun generateFillAccentColors(shades: Shades, darkMode: Boolean): FillAccentColors =
    if (darkMode) FillAccentColors(
        shades.light2,
        shades.light2.copy(0.9f),
        shades.light2.copy(0.8f),
        Color(0x28FFFFFF),
        shades.base
    )
    else TODO()

internal fun generateBackground(shades: Shades, darkMode: Boolean): Background =
    if (darkMode) Background(
        Background.Mica(Color(0xFF202020), Color(0xFF0A0A0A)),
        Background.Layer(Color(0x4C3A3A3A), Color(0x0DFFFFFF))
    )
    else TODO()

internal fun generateStroke(shades: Shades, darkMode: Boolean): Stroke =
    if (darkMode) Stroke(
        Stroke.Control(
            Color(0x12FFFFFF),
            Color(0x18FFFFFF),
            Color(0x14FFFFFF),
            Color(0x23000000),
            Color(0x37000000),
            Color(0x33000000),
            Color(0x6B000000)
        ),
        Stroke.ControlStrong(
            Color(0x9AFFFFFF),
            Color(0x28FFFFFF)
        )
    )
    else TODO()