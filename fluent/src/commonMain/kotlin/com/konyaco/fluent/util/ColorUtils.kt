package com.konyaco.fluent.util

import androidx.compose.ui.graphics.Color
import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

const val DefaultRoundingPrecision = 5

internal object ColorUtils {
    fun RGBToHSL(
        rgb: ARGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): HSL {
        return RGBToHSL(NormalizedRGB.fromRGB(rgb, false), round, roundingPrecision);
    }

    fun RGBToHSL(
        rgb: NormalizedRGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): HSL {
        val max = max(rgb.r, max(rgb.g, rgb.b))
        val min = min(rgb.r, min(rgb.g, rgb.b))
        val delta = max - min

        var hue = if (delta == 0.0) {
            0.0
        } else if (max == rgb.r) {
            60 * (((rgb.g - rgb.b) / delta) % 6)
        } else if (max == rgb.g) {
            60 * ((rgb.b - rgb.r) / delta + 2)
        } else {
            60 * ((rgb.r - rgb.g) / delta + 4)
        }

        if (hue < 0) {
            hue += 360.0
        }

        val lit = (max + min) / 2

        var sat = 0.0
        if (delta != 0.0) {
            sat = delta / (1f - abs(2f * lit - 1f))
        }

        return HSL.from(hue, sat, lit, round, roundingPrecision)
    }

    fun RGBToLCH(
        rgb: NormalizedRGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LCH {
        // The discontinuity near 0 in LABToLCH means we should round here even if the bound param is false
        val lab: LAB = RGBToLAB(rgb, true, 4)

        // This appears redundant but is actually nescessary in order to prevent floating point rounding errors from throwing off the Atan2 computation in LABToLCH
        // https://msdn.microsoft.com/en-us/library/system.math.atan2(v=vs.110).aspx
        // For the RGB value 255,255,255 what happens is the a value appears to be rounded to 0 but is still treated as negative by Atan2 which then returns PI instead of 0
        val l: Double = if (lab.l == 0.0) 0.0 else lab.l
        val a: Double = if (lab.a == 0.0) 0.0 else lab.a
        val b: Double = if (lab.b == 0.0) 0.0 else lab.b

        return LABToLCH(LAB.from(l, a, b, false), round, roundingPrecision)
    }

    fun LCHToLAB(
        lch: LCH,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LAB {
        // LCH lit == LAB lit
        var a = 0.0
        var b = 0.0
        // In chroma.js this case is handled by having the rgb -> lch conversion special case h == 0. In that case it changes h to NaN. Which then requires some NaN checks elsewhere.
        // it seems preferable to handle the case of h = 0 here
        if (lch.h != 0.0) {
            a = cos(MathUtils.degreesToRadians(lch.h)) * lch.c
            b = sin(MathUtils.degreesToRadians(lch.h)) * lch.c
        }

        return LAB.from(lch.l, a, b, round, roundingPrecision);
    }

    fun LCHToRGB(
        lch: LCH,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): NormalizedRGB {
        val lab: LAB = LCHToLAB(lch, false)
        return LABToRGB(lab, round, roundingPrecision)
    }

    fun RGBToLAB(
        rgb: ARGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LAB {
        return RGBToLAB(NormalizedRGB.fromRGB(rgb, false), round, roundingPrecision)
    }

    fun RGBToLAB(
        rgb: NormalizedRGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LAB {
        val xyz: XYZ = RGBToXYZ(rgb, false)
        return XYZToLAB(xyz, round, roundingPrecision)
    }

    fun LABToRGB(
        lab: LAB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): NormalizedRGB {
        val xyz: XYZ = LABToXYZ(lab, false)
        return XYZToRGB(xyz, round, roundingPrecision)
    }

    fun LABToLCH(
        lab: LAB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LCH {
        // LCH lit == LAB lit
        val h: Double = (MathUtils.radiansToDegrees(atan2(lab.b, lab.a)) + 360) % 360
        val c: Double = sqrt(lab.a * lab.a + lab.b * lab.b)

        return LCH.from(lab.l, c, h, round, roundingPrecision)
    }

    fun LABToXYZ(
        lab: LAB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): XYZ {
        var y = (lab.l + 16.0) / 116.0
        var x = y + (lab.a / 500.0)
        var z = y - (lab.b / 200.0)

        fun LABToXYZHelper(i: Double): Double = if (i > 0.206896552) {
            i.pow(3)
        } else {
            0.12841855 * (i - 0.137931034)
        }

        x = 0.95047 * LABToXYZHelper(x)
        y = LABToXYZHelper(y)
        z = 1.08883 * LABToXYZHelper(z)

        return XYZ.from(x, y, z, round, roundingPrecision)
    }

    fun RGBToXYZ(
        rgb: ARGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): XYZ {
        return RGBToXYZ(NormalizedRGB.fromRGB(rgb, false), round, roundingPrecision)
    }

    fun RGBToXYZ(
        rgb: NormalizedRGB,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): XYZ {
        fun RGBToXYZHelper(i: Double): Double = if (i <= 0.04045) {
            i / 12.92;
        } else {
            ((i + 0.055) / 1.055).pow(2.4);
        }

        val r = RGBToXYZHelper(rgb.r)
        val g = RGBToXYZHelper(rgb.g)
        val b = RGBToXYZHelper(rgb.b)

        val x = r * 0.4124564 + g * 0.3575761 + b * 0.1804375;
        val y = r * 0.2126729 + g * 0.7151522 + b * 0.0721750;
        val z = r * 0.0193339 + g * 0.1191920 + b * 0.9503041;

        return XYZ.from(x, y, z, round, roundingPrecision);
    }

    fun XYZToRGB(
        xyz: XYZ,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): NormalizedRGB {
        fun XYZToRGBHelper(i: Double) = if (i <= 0.0031308) {
            i * 12.92;
        } else {
            1.055 * i.pow(1 / 2.4) - 0.055;
        }

        val r = XYZToRGBHelper(xyz.x * 3.2404542 - xyz.y * 1.5371385 - xyz.z * 0.4985314);
        val g = XYZToRGBHelper(xyz.x * -0.9692660 + xyz.y * 1.8760108 + xyz.z * 0.0415560);
        val b = XYZToRGBHelper(xyz.x * 0.0556434 - xyz.y * 0.2040259 + xyz.z * 1.0572252);

        return NormalizedRGB.from(
            MathUtils.clampToUnit(r),
            MathUtils.clampToUnit(g),
            MathUtils.clampToUnit(b),
            round,
            roundingPrecision
        );
    }

    fun XYZToLAB(
        xyz: XYZ,
        round: Boolean = true,
        roundingPrecision: Int = DefaultRoundingPrecision
    ): LAB {
        fun XYZToLABHelper(i: Double): Double =
            if (i > 0.008856452) {
                i.pow(1.0 / 3.0);
            } else {
                i / 0.12841855 + 0.137931034;
            }

        val x = XYZToLABHelper(xyz.x / 0.95047)
        val y = XYZToLABHelper(xyz.y)
        val z = XYZToLABHelper(xyz.z / 1.08883)

        val l = (116.0 * y) - 16.0;
        val a = 500.0 * (x - y);
        val b = -200.0 * (z - y);

        return LAB.from(l, a, b, round, roundingPrecision);
    }

    fun interpolateLAB(left: LAB, right: LAB, position: Double): LAB {
        if (position <= 0) {
            return left
        }
        if (position >= 1) {
            return right
        }
        return LAB.from(
            MathUtils.lerp(left.l, right.l, position),
            MathUtils.lerp(left.a, right.a, position),
            MathUtils.lerp(left.b, right.b, position),
            false
        )
    }

    fun interpolateXYZ(left: XYZ, right: XYZ, position: Double): XYZ {
        if (position <= 0) {
            return left
        }
        if (position >= 1) {
            return right
        }
        return XYZ.from(
            MathUtils.lerp(left.x, right.x, position),
            MathUtils.lerp(left.y, right.y, position),
            MathUtils.lerp(left.z, right.z, position),
            false
        )
    }

    fun interpolateRGB(left: ARGB, right: ARGB, position: Double): ARGB {
        if (position <= 0) {
            return left
        }
        if (position >= 1) {
            return right
        }
        return ARGB(
            MathUtils.lerp(left.a, right.a, position),
            MathUtils.lerp(left.r, right.r, position),
            MathUtils.lerp(left.g, right.g, position),
            MathUtils.lerp(left.b, right.b, position)
        )
    }

    fun interpolateRGB(left: NormalizedRGB, right: NormalizedRGB, position: Double): NormalizedRGB {
        if (position <= 0) {
            return left
        }
        if (position >= 1) {
            return right
        }
        return NormalizedRGB.from(
            MathUtils.lerp(left.r, right.r, position),
            MathUtils.lerp(left.g, right.g, position),
            MathUtils.lerp(left.b, right.b, position),
            false
        )
    }

    fun interpolateColor(
        left: NormalizedRGB,
        right: NormalizedRGB,
        position: Double,
        mode: ColorScaleInterpolationMode
    ): NormalizedRGB {
        when (mode) {
            ColorScaleInterpolationMode.LAB -> {
                val leftLAB = RGBToLAB(left, false)
                val rightLAB = RGBToLAB(right, false)
                return LABToRGB(interpolateLAB(leftLAB, rightLAB, position))
            }

            ColorScaleInterpolationMode.XYZ -> {
                val leftXYZ = RGBToXYZ(left, false)
                val rightXYZ = RGBToXYZ(right, false)
                return XYZToRGB(interpolateXYZ(leftXYZ, rightXYZ, position))
            }

            else -> return interpolateRGB(left, right, position)
        }
    }
}

internal data class NormalizedRGB(
    val r: Double,
    val g: Double,
    val b: Double
) {
    internal companion object {
        fun from(
            r: Double,
            g: Double,
            b: Double,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): NormalizedRGB {
            return if (round) {
                NormalizedRGB(round(r, precision), round(g, precision), round(b, precision))
            } else {
                NormalizedRGB(r, g, b)
            }
        }

        fun fromRGB(
            rgb: ARGB,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): NormalizedRGB {
            return if (round) {
                NormalizedRGB(
                    round(rgb.r / 255.0, precision),
                    round(rgb.g / 255.0, precision),
                    round(rgb.b / 255.0, precision)
                )
            } else {
                NormalizedRGB(rgb.r / 255.0, rgb.g / 255.0, rgb.b / 255.0)
            }
        }

    }

    fun denormalized(a: Int = 255): ARGB {
        return ARGB(
            a,
            MathUtils.clampToByte(r * 255.0),
            MathUtils.clampToByte(g * 255.0),
            MathUtils.clampToByte(b * 255.0)
        )
    }
}

internal data class ARGB(
    val a: Int,
    val r: Int,
    val g: Int,
    val b: Int
) {
    companion object {
        fun fromColor(color: Color): ARGB {
            // 0xFF_FF_FF_FF_00_00_00_00
            return ARGB(
                a = ((color.value shr 56) and 0xFFUL).toInt(),
                r = ((color.value shr 48) and 0xFFUL).toInt(),
                g = ((color.value shr 40) and 0xFFUL).toInt(),
                b = ((color.value shr 32) and 0xFFUL).toInt()
            )
        }

    }

    fun toColor(): Color {
        return Color(r, g, b)
    }
}

internal data class HSL(
    val h: Double,
    val s: Double,
    val l: Double
) {
    internal companion object {
        fun from(
            h: Double,
            s: Double,
            l: Double,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): HSL {
            return if (round) {
                HSL(round(h, precision), round(s, precision), round(l, precision))
            } else {
                HSL(h, s, l)
            }
        }
    }
}

internal data class LCH(
    val l: Double,
    val c: Double,
    val h: Double
) {
    internal companion object {
        fun from(
            l: Double,
            c: Double,
            h: Double,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): LCH {
            return if (round) {
                LCH(round(l, precision), round(c, precision), round(h, precision))
            } else {
                LCH(l, c, h)
            }
        }
    }
}

internal data class LAB(
    val l: Double,
    val a: Double,
    val b: Double
) {
    internal companion object {
        fun from(
            l: Double,
            a: Double,
            b: Double,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): LAB {
            return if (round) {
                LAB(round(l, precision), round(a, precision), round(b, precision))
            } else {
                LAB(l, a, b)
            }
        }
    }
}

internal data class XYZ(
    val x: Double,
    val y: Double,
    val z: Double
) {
    internal companion object {
        fun from(
            x: Double,
            y: Double,
            z: Double,
            round: Boolean = true,
            precision: Int = DefaultRoundingPrecision
        ): XYZ {
            return if (round) {
                XYZ(round(x, precision), round(y, precision), round(z, precision))
            } else {
                XYZ(x, y, z)
            }
        }
    }
}

internal fun round(number: Double, precision: Int): Double {
    val digits = 10.0.pow(precision)
    return kotlin.math.round(number * digits) / digits
}