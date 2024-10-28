package com.konyaco.fluent.util

import com.konyaco.fluent.util.ColorUtils.LABToRGB
import com.konyaco.fluent.util.ColorUtils.RGBToLAB
import com.konyaco.fluent.util.ColorUtils.RGBToXYZ
import com.konyaco.fluent.util.ColorUtils.XYZToRGB

internal enum class ColorScaleInterpolationMode {
    RGB, LAB, XYZ
};

internal data class ColorScaleStop(
    val color: ARGB,
    val position: Double,
)

internal class ColorScale {
    private var _stops: MutableList<ColorScaleStop> = mutableListOf()

    constructor(stops: List<ColorScaleStop>) {
        if (stops.isEmpty()) {
            throw IllegalArgumentException("stops should not be empty");
        }
        val count = stops.size
        _stops = ArrayList(count);

        for ((index, stop) in stops.withIndex()) {
//            _stops[index] = ColorScaleStop(stop.color, stop.position)
            _stops.add(ColorScaleStop(stop.color, stop.position))
        }
    }

    fun getColor(
        position: Double,
        mode: ColorScaleInterpolationMode = ColorScaleInterpolationMode.RGB
    ): ARGB {
        if (_stops.size == 1) {
            return _stops[0].color
        }
        if (position <= 0) {
            return _stops[0].color
        } else if (position >= 1) {
            return _stops[_stops.size - 1].color
        }
        var lowerIndex = 0
        for (i in 0 until _stops.size) {
            if (_stops[i].position <= position) {
                lowerIndex = i
            }
        }
        var upperIndex = lowerIndex + 1
        if (upperIndex >= _stops.size) {
            upperIndex = _stops.size - 1
        }
        val scalePosition: Double =
            (position - _stops[lowerIndex].position) * (1.0 / (_stops[upperIndex].position - _stops[lowerIndex].position))

        when (mode) {
            ColorScaleInterpolationMode.LAB -> {
                val leftLAB = RGBToLAB(_stops[lowerIndex].color, false)
                val rightLAB = RGBToLAB(_stops[upperIndex].color, false)
                val targetLAB: LAB = ColorUtils.interpolateLAB(leftLAB, rightLAB, scalePosition)
                return LABToRGB(targetLAB, false).denormalized()
            }

            ColorScaleInterpolationMode.XYZ -> {
                val leftXYZ = RGBToXYZ(_stops[lowerIndex].color, false)
                val rightXYZ = RGBToXYZ(_stops[upperIndex].color, false)
                val targetXYZ: XYZ = ColorUtils.interpolateXYZ(leftXYZ, rightXYZ, scalePosition)
                return XYZToRGB(targetXYZ, false).denormalized()
            }

            else -> return ColorUtils.interpolateRGB(
                _stops[lowerIndex].color,
                _stops[upperIndex].color,
                scalePosition
            )
        }
    }

    fun trim(
        lowerBound: Double,
        upperBound: Double,
        mode: ColorScaleInterpolationMode = ColorScaleInterpolationMode.RGB
    ): ColorScale {
        if (lowerBound < 0 || upperBound > 1 || upperBound < lowerBound) {
            throw IllegalArgumentException("Invalid bounds")
        }
        if (lowerBound == upperBound) {
            return ColorScale.fromColors(listOf(getColor(lowerBound, mode)))
        }
        val containedStops: MutableList<ColorScaleStop> = ArrayList()

        for (i in 0 until _stops.size) {
            if (_stops[i].position >= lowerBound && _stops[i].position <= upperBound) {
                containedStops.add(_stops[i]);
            }
        }

        if (containedStops.size == 0) {
            return ColorScale.fromColors(
                listOf(
                    getColor(lowerBound, mode),
                    getColor(upperBound, mode)
                )
            )
        }

        if (containedStops.first().position != lowerBound) {
            containedStops.add(0, ColorScaleStop(getColor(lowerBound, mode), lowerBound))
        }

        if (containedStops.last().position != upperBound) {
            containedStops.add(ColorScaleStop(getColor(upperBound, mode), upperBound))
        }

        val range: Double = upperBound - lowerBound;

        val finalStopsSize = containedStops.size
        val finalStops: MutableList<ColorScaleStop> =
            ArrayList(finalStopsSize) // size: containedStops.Count

        for (i in 0 until finalStopsSize) {
            val adjustedPosition: Double = (containedStops[i].position - lowerBound) / range;
//            finalStops[i] = ColorScaleStop(containedStops[i].color, adjustedPosition);
            finalStops.add(ColorScaleStop(containedStops[i].color, adjustedPosition))
        }
        return ColorScale(finalStops);
    }

    companion object {
        fun fromColors(colors: List<ARGB>): ColorScale {
            if (colors.isEmpty()) {
                throw IllegalArgumentException("colors should not be empty");
            }

            val count = colors.size
            val _stops = mutableListOf<ColorScaleStop>()

            for ((index, color) in colors.withIndex()) {
                // Clean up floating point jaggies
                if (index == 0) {
//                    _stops[index] = ColorScaleStop(color, 0.0)
                    _stops.add(ColorScaleStop(color, 0.0))
                } else if (index == count - 1) {
//                    _stops[index] = ColorScaleStop(color, 1.0)
                    _stops.add(ColorScaleStop(color, 1.0))
                } else {
//                    _stops[index] = ColorScaleStop(color, index.toDouble() * (1.0 / (count - 1).toDouble()))
                    _stops.add(
                        ColorScaleStop(
                            color,
                            index.toDouble() * (1.0 / (count - 1).toDouble())
                        )
                    )
                }
            }
            return ColorScale(_stops)
        }

        // These presets are copied from Fluent-XAML-Theme-Editor
        val _scaleColorLight = ARGB(0xFF, 0xFF, 0xFF, 0xFF)
        val _scaleColorDark = ARGB(0xFF, 0x00, 0x00, 0x00)

        val _saturationAdjustmentCutoff = 0.05
        val _saturationLight = 0.35
        val _saturationDark = 1.25

        val _clipLight: Double = 0.185
        val _clipDark: Double = 0.160

        val _interpolationMode = ColorScaleInterpolationMode.RGB

        val _overlayDark: Double = 0.25

        fun getPaletteScale(baseColor: ARGB): ColorScale {
            val baseColorRGB = baseColor
            // RGB to HSL

            val baseColorHSL = ColorUtils.RGBToHSL(baseColorRGB)
             var baseColorNormalized = NormalizedRGB.fromRGB(baseColorRGB);

            val baseScale =
                ColorScale.fromColors(listOf(_scaleColorLight, baseColorRGB, _scaleColorDark))

            val trimmedScale = baseScale.trim(_clipLight, 1.0 - _clipDark)
            val trimmedLight = NormalizedRGB.fromRGB(trimmedScale.getColor(0.0, _interpolationMode))
            val trimmedDark = NormalizedRGB.fromRGB(trimmedScale.getColor(1.0, _interpolationMode))

            var adjustedLight = trimmedLight
            var adjustedDark = trimmedDark

            if (baseColorHSL.s >= _saturationAdjustmentCutoff) {
                adjustedLight =
                    ColorBlending.saturateViaLCH(adjustedLight, _saturationLight)
                adjustedDark =
                    ColorBlending.saturateViaLCH(adjustedDark, _saturationDark)
            }

            /*if (_multiplyLight != 0)
            {
                var multiply = ColorBlending.Blend(baseColorNormalized, adjustedLight, ColorBlendMode.Multiply);
                adjustedLight = ColorUtils.InterpolateColor(adjustedLight, multiply, _multiplyLight, _interpolationMode);
            }

            if (_multiplyDark != 0)
            {
                var multiply = ColorBlending.Blend(baseColorNormalized, adjustedDark, ColorBlendMode.Multiply);
                adjustedDark = ColorUtils.InterpolateColor(adjustedDark, multiply, _multiplyDark, _interpolationMode);
            }

            if (_overlayLight != 0)
            {
                var overlay = ColorBlending.Blend(baseColorNormalized, adjustedLight, ColorBlendMode.Overlay);
                adjustedLight = ColorUtils.InterpolateColor(adjustedLight, overlay, _overlayLight, _interpolationMode);
            }*/

            if (_overlayDark != 0.0) {
                val overlay =
                    ColorBlending.blend(baseColorNormalized, adjustedDark, ColorBlendMode.Overlay)
                adjustedDark = ColorUtils.interpolateRGB(
                    adjustedDark,
                    overlay,
                    _overlayDark
                )
            }
            val finalScale = ColorScale.fromColors(
                listOf(
                    adjustedLight.denormalized(),
                    baseColorRGB,
                    adjustedDark.denormalized()
                )
            )
            return finalScale
        }
    }
}