package com.konyaco.fluent

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Brush
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
    var borders by mutableStateOf(generateBorders(fillAccent, stroke, darkMode))
        internal set
}

data class Borders(
    val control: Brush,
    val accentControl: Brush,
    val circle: Brush,
    val textControl: Brush,
    val textControlFocused: Brush
)

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
        base = Color(0xFF0078D4),
        light1 = Color(0xFF0093F9),
        light2 = Color(0xFF60CCFE),
        light3 = Color(0xFF98ECFE),
        dark1 = Color(0xFF005EB7),
        dark2 = Color(0xFF003D92),
        dark3 = Color(0xFF001968)
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
            primary = Color(0xFFFFFFFF),
            secondary = Color(0xC5FFFFFF),
            tertiary = Color(0x87FFFFFF),
            disabled = Color(0x5DFFFFFF)
        ),
        accent = ColorCompound(
            primary = shades.light3,
            secondary = shades.light3,
            tertiary = shades.light2,
            disabled = Color(0x5DFFFFFF)
        ),
        onAccent = ColorCompound(
            primary = Color(0xFF000000),
            secondary = Color(0x80000000),
            tertiary = Color(0x87FFFFFF),
            disabled = Color(0xFFFFFFFF)
        )
    )
    else TextColor(
        text = ColorCompound(
            primary = Color(0xE4000000),
            secondary = Color(0x9B000000),
            tertiary = Color(0x72000000),
            disabled = Color(0x5C000000)
        ),
        accent = ColorCompound(
            shades.dark2,
            shades.dark3,
            shades.dark1,
            Color(0x5C000000)
        ),
        onAccent = ColorCompound(
            primary = Color(0xFFFFFFFF),
            secondary = Color(0x83FFFFFF),
            tertiary = Color(0xFFFFFFFF),
            disabled = Color(0xFFFFFFFF)
        )
    )

internal fun generateControlColors(shades: Shades, darkMode: Boolean): ControlColors =
    if (darkMode) ControlColors(
        default = Color(0x0FFFFFFF),
        secondary = Color(0x15FFFFFF),
        tertiary = Color(0x0BFFFFFF),
        quaternary = Color(0x0FFFFFFF),
        disabled = Color(0x0BFFFFFF),
        transparent = Color(0x00FFFFFF),
        inputActive = Color(0xB31E1E1E)
    )
    else ControlColors(
        default = Color(0x83FFFFFF),
        secondary = Color(0x80F9F9F9),
        tertiary = Color(0x4DF9F9F9),
        quaternary = Color(0xC2F3F3F3),
        disabled = Color(0x4DF9F9F9),
        transparent = Color(0x00FFFFFF),
        inputActive = Color(0xFFFFFFFF)
    )

internal fun generateControlAltColors(shades: Shades, darkMode: Boolean): ControlAltColors =
    if (darkMode) ControlAltColors(
        transparent = Color(0x00FFFFFF),
        secondary = Color(0x19000000),
        tertiary = Color(0x0BFFFFFF),
        quaternary = Color(0x12FFFFFF),
        disabled = Color(0x00FFFFFF)
    ) else ControlAltColors(
        transparent = Color(0x00FFFFFF),
        secondary = Color(0x06000000),
        tertiary = Color(0x0F000000),
        quaternary = Color(0x18000000),
        disabled = Color(0x00FFFFFF)
    )

internal fun generateControlSolidColors(shades: Shades, darkMode: Boolean): ControlSolidColors =
    if (darkMode) ControlSolidColors(default = Color(0xFF454545))
    else ControlSolidColors(default = Color(0xFFFFFFFF))

internal fun generateControlStrongColors(shades: Shades, darkMode: Boolean): ControlStrongColors =
    if (darkMode) ControlStrongColors(
        default = Color(0x8BFFFFFF),
        disabled = Color(0x3FFFFFFF)
    )
    else ControlStrongColors(
        default = Color(0x72000000),
        disabled = Color(0x51000000)
    )

internal fun generateFillAccentColors(shades: Shades, darkMode: Boolean): FillAccentColors =
    if (darkMode) FillAccentColors(
        default = shades.light2,
        secondary = shades.light2.copy(0.9f),
        tertiary = shades.light2.copy(0.8f),
        disabled = Color(0x28FFFFFF),
        selectedTextBackground = shades.base
    )
    else FillAccentColors(
        default = shades.dark1,
        secondary = shades.dark1.copy(0.9f),
        tertiary = shades.dark1.copy(0.8f),
        disabled = Color(0x37000000),
        selectedTextBackground = shades.base
    )

internal fun generateBackground(shades: Shades, darkMode: Boolean): Background =
    if (darkMode) Background(
        mica = Background.Mica(base = Color(0xFF202020), baseAlt = Color(0xFF0A0A0A)),
        layer = Background.Layer(default = Color(0x4C3A3A3A), alt = Color(0x0DFFFFFF))
    )
    else Background(
        mica = Background.Mica(base = Color(0xFFF3F3F3), baseAlt = Color(0xFFDADADA)),
        layer = Background.Layer(default = Color(0x80FFFFFF), alt = Color(0xFFFFFFFF))
    )

internal fun generateStroke(shades: Shades, darkMode: Boolean): Stroke =
    if (darkMode) Stroke(
        control = Stroke.Control(
            default = Color(0x12FFFFFF),
            secondary = Color(0x18FFFFFF),
            onAccentDefault = Color(0x14FFFFFF),
            onAccentSecondary = Color(0x23000000),
            onAccentTertiary = Color(0x37000000),
            disabled = Color(0x33000000),
            forStrongFillWhenOnImage = Color(0x6B000000)
        ),
        controlStrong = Stroke.ControlStrong(
            default = Color(0x9AFFFFFF),
            disabled = Color(0x28FFFFFF)
        )
    )
    else Stroke(
        control = Stroke.Control(
            default = Color(0x0F000000),
            secondary = Color(0x29000000),
            onAccentDefault = Color(0x14FFFFFF),
            onAccentSecondary = Color(0x66000000),
            onAccentTertiary = Color(0x37000000),
            disabled = Color(0x0F000000),
            forStrongFillWhenOnImage = Color(0x59FFFFFF)
        ),
        controlStrong = Stroke.ControlStrong(
            default = Color(0x9C000000),
            disabled = Color(0x37000000)
        )
    )

private fun generateBorders(fillAccent: FillAccentColors, stroke: Stroke, darkMode: Boolean): Borders =
    if (darkMode) Borders(
        control = Brush.verticalGradient(
            0.0957f to stroke.control.default,
            1f to stroke.control.secondary
        ),
        accentControl = Brush.verticalGradient(
            0.9067f to stroke.control.onAccentDefault,
            1f to stroke.control.onAccentSecondary,
        ),
        circle = Brush.verticalGradient(
            0.5002f to stroke.control.default,
            0.9545f to stroke.control.secondary
        ),
        textControl = Brush.verticalGradient(
            1f to stroke.control.default,
            1f to stroke.controlStrong.default
        ),
        textControlFocused = Brush.verticalGradient(
            0.9395f to stroke.control.default,
            0.9414f to fillAccent.default
        )
    ) else Borders(
        control = Brush.verticalGradient(
            0.9058f to stroke.control.default,
            1f to stroke.control.secondary
        ),
        accentControl = Brush.verticalGradient(
            0.9067f to stroke.control.onAccentDefault,
            1f to stroke.control.onAccentSecondary,
        ),
        circle = Brush.verticalGradient(
            0f to stroke.control.default,
            0.5f to stroke.control.secondary
        ),
        textControl = Brush.verticalGradient(
            1f to stroke.control.default,
            1f to stroke.controlStrong.default
        ),
        textControlFocused = Brush.verticalGradient(
            0.9395f to stroke.control.default,
            0.9414f to fillAccent.default
        )
    )