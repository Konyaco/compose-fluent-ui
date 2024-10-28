package com.konyaco.fluent.util


internal enum class ColorBlendMode {
    Burn, Darken, Dodge, Lighten, Multiply, Overlay, Screen
}

internal object ColorBlending {
    private const val DefaultSaturationConstant: Double = 18.0

    fun saturateViaLCH(
        input: NormalizedRGB,
        saturation: Double,
        saturationConstant: Double = DefaultSaturationConstant
    ): NormalizedRGB {
        val lch: LCH = ColorUtils.RGBToLCH(input, false)
        var saturated: Double = lch.c + saturation * saturationConstant
        if (saturated < 0) {
            saturated = 0.0
        }
        return ColorUtils.LCHToRGB(LCH.from(lch.l, saturated, lch.h, false), false)
    }


    fun blend(bottom: NormalizedRGB, top: NormalizedRGB, mode: ColorBlendMode): NormalizedRGB {
        when (mode) {
            ColorBlendMode.Burn -> {
                TODO()
//                return blendBurn(bottom, top)
            }

            ColorBlendMode.Darken -> {
                TODO()
//                return blendDarken(bottom, top)
            }

            ColorBlendMode.Dodge -> {
                TODO()
//                return blendDodge(bottom, top)
            }

            ColorBlendMode.Lighten -> {
                TODO()
//                return blendLighten(bottom, top)
            }

            ColorBlendMode.Multiply -> {
                TODO()
//                return blendMultiply(bottom, top)
            }

            ColorBlendMode.Overlay -> {
                return blendOverlay(bottom, top)
            }

            ColorBlendMode.Screen -> {
                TODO()
//                return blendScreen(bottom, top)
            }
        }
    }

    private fun blendOverlay(bottom: NormalizedRGB, top: NormalizedRGB): NormalizedRGB {
        return NormalizedRGB.from(
            blendOverlay(bottom.r, top.r),
            blendOverlay(bottom.g, top.g),
            blendOverlay(bottom.b, top.b),
            false
        )
    }

    private fun blendOverlay(bottom: Double, top: Double): Double {
        return if (bottom < 0.5) {
            MathUtils.clampToUnit(2.0 * top * bottom)
        } else {
            MathUtils.clampToUnit(1.0 - 2.0 * (1.0 - top) * (1.0 - bottom))
        }
    }
}