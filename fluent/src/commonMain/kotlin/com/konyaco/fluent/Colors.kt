package com.konyaco.fluent

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
    var subtleFill by mutableStateOf(generateSubtleFillColors(shades, darkMode))
        internal set
    var fillAccent by mutableStateOf(generateFillAccentColors(shades, darkMode))
        internal set
    var background by mutableStateOf(generateBackground(shades, darkMode))
        internal set
    var stroke by mutableStateOf(generateStroke(shades, darkMode))
        internal set
    var borders by mutableStateOf(generateBorders(fillAccent, stroke, darkMode))
        internal set
    var system by mutableStateOf(generateSystemColors(darkMode))
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
    val controlStrong: ControlStrong,
    val surface: Surface,
    val card: Card,
    val divider: Divider
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

    data class Surface(
        val default: Color,
        val flyout: Color
    )
    
    data class Card(
        val default: Color,
        val defaultSolid: Color
    )

    data class Divider(
        val default: Color
    )
}

data class SubtleFillColors(
    val transparent: Color,
    val secondary: Color,
    val tertiary: Color,
    val disabled: Color
)

data class Background(
    val card: Card,
    val smoke: Smoke,
    val mica: Mica,
    val layer: Layer,
    val layerOnAcrylic: LayerOnAcrylic,
    val layerOnMicaBaseAlt: LayerOnMicaBaseAlt,
    val solid: Solid,
    val acrylic: Acrylic,
    val accentAcrylic: AccentAcrylic
) {
    /**
     * Used to create ‘cards’ - content blocks that live on  page and layer backgrounds.
     */
    data class Card(
        /**
         * Default card color
         */
        val default: Color,
        /**
         * Alternate card color: slightly darker
         */
        val secondary: Color,
        /**
         * Default card hover and pressed color
         */
        val tertiary: Color
    )

    /**
     * Used over windows and desktop to block them out as inaccessible.
     */
    data class Smoke(
        /**
         * Dims backgrounds behinds dialogs
         */
        val default: Color
    )

    /**
     * Used on background colors of any material to create layering.
     */
    data class Layer(
        /**
         * Content layer color
         */
        val default: Color,
        /**
         * Alternate content layer color
         */
        val alt: Color
    )

    /**
     * Used on background colors of any material to create layering.
     */
    data class LayerOnAcrylic(
        /**
         * Content layer color on acrylic surfaces
         */
        val default: Color
    )

    /**
     * Used for fills on Tab control.
     */
    data class LayerOnMicaBaseAlt(
        /**
         * Active Tab Rest
         * Content layer
         */
        val default: Color,
        /**
         * Active Tab Drag
         */
        val tertiary: Color,
        /**
         * Inactive Tab Rest
         */
        val transparent: Color,
        /**
         * Inactive Tab Hover
         */
        val secondary: Color
    )

    /**
     * Solid background colors to place layers, cards, or controls on.
     */
    data class Solid(
        /**
         * Used for the bottom most layer of an experience.
         */
        val base: Color,
        /**
         * Used for the bottom most layer of an experience.
         */
        val baseAlt: Color,
        /**
         * Alternate base color for those who need a darker background color.
         */
        val secondary: Color,
        /**
         * Content layer color
         */
        val tertiary: Color,
        /**
         * Alt content layer color
         */
        val quaternary: Color,
        /**
         * Used for solid default card colors
         */
        val quinary: Color,
        /**
         * Used for solid default card color
         */
        val senary: Color
    )

    /**
     * Mica background colors to place layers, cards, or controls on.
     */
    data class Mica(
        /**
         * Used for the bottom most layer of an experience.
         *
         * Light: #F3F3F3 (FF, 100%), 50% Tint Opacity, 100% Luminosity Opacity
         *
         * Dark: #202020, 80% Tint Opacity, 100% Luminosity opacity
         */
        val base: Color,
        /**
         * Used for the bottom most layer of an experience.
         *
         * Fallback Light: Solid Background / Base (#F3F3F3, 100%)
         *
         * Fallback Dark: Solid Background / Base (#202020, 100%)
         */
        val baseFallback: Color,
        /**
         * Default tab band background color。
         *
         * Light: #DADADA(80, 50%), 100% Luminosity Opacity
         *
         * Dark: #0A0A0A (00, 0%), 100% Luminosity Opacity
         */
        val baseAlt: Color,
        /**
         * Default tab band background color.
         *
         * Fallback Light: Solid Background / Base Alt (#DADADA, 100%)
         *
         * Fallback Dark: Solid Background / Base Alt (#0A0A0A, 100%)
         */
        val baseAltFallback: Color
    )

    /**
     * Acrylic background colors to place layers, cards, or controls on.
     */
    data class Acrylic(
        /**
         * Used for the bottom most layer of an acrylic surface only when the surface will use layers.
         *
         * Light: #F3F3F3 (FF, 100%), 0% Tint Opacity, 90% Luminosity Opacity
         *
         * Dark: #202020, 50% TInt Opacity, 96% Luminosity Opacity
         */
        val base: Color,
        /**
         * Used for the bottom most layer of an acrylic surface only when the surface will use layers.
         *
         * Light Fallback: #EEEEEE (FF, 100%)
         *
         * Dark Fallback: #1C1C1C
         */
        val baseFallback: Color,
        /**
         * Default acrylic recipe used for control flyouts and surfaces that live with in the context of an app.
         *
         * Light: #FCFCFC (FF, 100%), 0% Tint Opacity, 85% Luminosity Opacity
         *
         * Dark: #2C2C2C, 15% Tint Opacity, 96% Luminosity Opacity
         */
        val default: Color,
        /**
         * Default acrylic recipe used for control flyouts and surfaces that live with in the context of an app.
         *
         * Light Fallback: #F9F9F9 (FF, 100%)
         *
         * Dark Fallback: #2C2C2C
         */
        val defaultFallback: Color
    )

    /**
     * Acrylic background colors to place layers, cards, or controls on.
     */
    data class AccentAcrylic(
        /**
         * Used for the bottom most layer of an acrylic surface only when the surface will use layers.
         *
         * Light: Light 3, 80% Tint Opacity, 80% Luminosity Opacity
         *
         * Dark: Dark 2, 80% Tint Opacity, 80% Luminosity Opacity
         */
        val base: Color,
        val baseFallback: Color,
        /**
         * Default acrylic recipe used for control flyouts and surfaces that live with in the context of an app.
         *
         * Light: Light 3, 80% Tint Opacity, 90% Luminosity Opacity
         *
         * Dark: Dark 1, 80% Tint Opacity, 80% Luminosity Opacity
         */
        val default: Color,
        val defaultFallback: Color
    )
}

data class SystemColors(
    val attention: Color,
    val attentionBackground: Color,
    val solidAttentionBackground: Color,
    val success: Color,
    val successBackground: Color,
    val caution: Color,
    val cautionBackground: Color,
    val critical: Color,
    val criticalBackground: Color,
    val neutral: Color,
    val neutralBackground: Color,
    val solidNeutral: Color,
    val solidNeutralBackground: Color,
)

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
        shades.light1, shades.light2, shades.light3,
        system.caution, system.attention, system.success,
        system.critical, system.solidNeutral -> text.onAccent.primary

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

internal fun generateSubtleFillColors(shades: Shades, darkMode: Boolean): SubtleFillColors =
    if (darkMode) SubtleFillColors(
        transparent = Color(0x00FFFFFF),
        secondary = Color(0x0FFFFFFF),
        tertiary = Color(0x0AFFFFFF),
        disabled = Color(0x00FFFFFF)
    ) else SubtleFillColors(
        transparent = Color(0x00000000),
        secondary = Color(0x09000000),
        tertiary = Color(0x06000000),
        disabled = Color(0x00000000)
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
        card = Background.Card(
            default = Color(0x0DFFFFFF),
            secondary = Color(0x08FFFFFF),
            tertiary = Color(0x12FFFFFF)
        ),
        smoke = Background.Smoke(
            default = Color(0x4D000000)
        ),
        layer = Background.Layer(default = Color(0x4C3A3A3A), alt = Color(0x0DFFFFFF)),
        layerOnAcrylic = Background.LayerOnAcrylic(
            default = Color(0x09FFFFFF)
        ),
        layerOnMicaBaseAlt = Background.LayerOnMicaBaseAlt(
            default = Color(0x733A3A3A),
            tertiary = Color(0xFFF9F9F9),
            transparent = Color.Transparent,
            secondary = Color(0x0FFFFFFF)
        ),
        solid = Background.Solid(
            base = Color(0xFF202020),
            baseAlt = Color(0xFF0A0A0A),
            secondary = Color(0xFF1C1C1C),
            tertiary = Color(0xFF282828),
            quaternary = Color(0xFF2C2C2C),
            quinary = Color(0xFF333333),
            senary = Color(0xFF373737)
        ),
        mica = Background.Mica(
            base = Color(0xFF202020),
            baseFallback = Color(0xFF202020),
            baseAlt = Color(0x000A0A0A),
            baseAltFallback = Color(0xFF0A0A0A),
        ),
        acrylic = Background.Acrylic(
            base = Color(0xFF202020),
            baseFallback = Color(0xFF1C1C1C),
            default = Color(0xFF2C2C2C),
            defaultFallback = Color(0xFF2C2C2C)
        ),
        accentAcrylic = Background.AccentAcrylic(
            base = shades.dark2,
            baseFallback = shades.dark2,
            default = shades.dark1,
            defaultFallback = shades.dark1
        )
    )
    else Background(
        card = Background.Card(
            default = Color(0xB3FFFFFF),
            secondary = Color(0x80F6F6F6),
            tertiary = Color(0xFFFFFFFF)
        ),
        smoke = Background.Smoke(
            default = Color(0x4D000000)
        ),
        layer = Background.Layer(default = Color(0x80FFFFFF), alt = Color(0xFFFFFFFF)),
        layerOnAcrylic = Background.LayerOnAcrylic(
            default = Color(0x40FFFFFF)
        ),
        layerOnMicaBaseAlt = Background.LayerOnMicaBaseAlt(
            default = Color(0xB3FFFFFF),
            tertiary = Color(0xFFF9F9F9),
            transparent = Color.Transparent,
            secondary = Color(0x0A000000)
        ),
        solid = Background.Solid(
            base = Color(0xFFF3F3F3),
            baseAlt = Color(0xFFDADADA),
            secondary = Color(0xFFEEEEEE),
            tertiary = Color(0xFFF9F9F9),
            quaternary = Color(0xFFFFFFFF),
            quinary = Color(0xFFFDFDFD),
            senary = Color(0xFFFFFFFF)
        ),
        mica = Background.Mica(
            base = Color(0xFFF3F3F3),
            baseFallback = Color(0xFFF3F3F3),
            baseAlt = Color(0xFFDADADA),
            baseAltFallback = Color(0xFFDADADA)
        ),
        acrylic = Background.Acrylic(
            base = Color(0xFFF3F3F3),
            baseFallback = Color(0xFFEEEEEE),
            default = Color(0xFFFCFCFC),
            defaultFallback = Color(0xFFF9F9F9)
        ),
        accentAcrylic = Background.AccentAcrylic(
            base = shades.light3,
            baseFallback = shades.light3,
            default = shades.light3,
            defaultFallback = shades.light3
        )
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
        ),
        surface = Stroke.Surface(
            default = Color(0x66757575),
            flyout = Color(0x33000000),
        ),
        card = Stroke.Card(
            default = Color(0x19000000),
            defaultSolid = Color(0xFF1C1C1C)
        ),
        divider = Stroke.Divider(
            default = Color(0x15FFFFFF)
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
        ),
        surface = Stroke.Surface(
            default = Color(0x66757575),
            flyout = Color(0x0F000000)
        ),
        card = Stroke.Card(
            default = Color(0x0F000000),
            defaultSolid = Color(0xFFEBEBEB)
        ),
        divider = Stroke.Divider(
            default = Color(0x14000000)
        )
    )

private fun generateBorders(fillAccent: FillAccentColors, stroke: Stroke, darkMode: Boolean): Borders =
    if (darkMode) Borders(
        control = Brush.verticalGradient(
            0.0957f to stroke.control.secondary,
            1f to stroke.control.default
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

private fun generateSystemColors(darkMode: Boolean): SystemColors {
    return if (darkMode) {
        SystemColors(
            attention = Color(0xFF60CDFF),
            attentionBackground = Color(0x08FFFFFF),
            solidAttentionBackground = Color(0xFF2E2E2E),
            success = Color(0xFF6CCB5F),
            successBackground = Color(0xFF393D1B),
            caution = Color(0xFFFCE100),
            cautionBackground = Color(0xFF433519),
            critical = Color(0xFFFF99A4),
            criticalBackground = Color(0xFF442726),
            neutral = Color(0x8BFFFFFF),
            neutralBackground = Color(0x08FFFFFF),
            solidNeutral = Color(0xFF9D9D9D),
            solidNeutralBackground = Color(0xFF2E2E2E),
        )
    } else {
        SystemColors(
            attention = Color(0xFF0070CB),
            attentionBackground = Color(0x80F6F6F6),
            solidAttentionBackground = Color(0xFFF7F7F7),
            success = Color(0xFF0F7B0F),
            successBackground = Color(0xFFDFF6DD),
            caution = Color(0xFF9D5D00),
            cautionBackground = Color(0xFFFFF4CE),
            critical = Color(0xFFC42B1C),
            criticalBackground = Color(0xFFFDE7E9),
            neutral = Color(0xFF72000000),
            neutralBackground = Color(0x06000000),
            solidNeutral = Color(0xFF8A8A8A),
            solidNeutralBackground = Color(0xFFF3F3F3),
        )
    }
}