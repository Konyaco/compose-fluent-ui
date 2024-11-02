package com.konyaco.fluent.util

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.Shades
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.util.ColorUtils.LABToRGB
import com.konyaco.fluent.util.ColorUtils.RGBToLAB
import com.konyaco.fluent.util.ColorUtils.RGBToXYZ
import com.konyaco.fluent.util.ColorUtils.XYZToRGB
import kotlin.math.abs

internal enum class ColorScaleInterpolationMode {
    RGB, LAB, XYZ
};

internal data class ColorScaleStop(
    val color: ARGB,
    val position: Double,
)


internal interface ColorScale {
    fun getColor(position: Double): ARGB

    companion object {
        fun fromColors(colors: List<ARGB>): ColorScale {
            return FluentColorScale.fromColors(colors)
        }

        fun getPaletteScale(baseColor: ARGB): ColorScale {
            return FluentColorScale.getPaletteScale(baseColor)
        }
    }
}

// These presets are copied from Fluent-XAML-Theme-Editor
internal data class FluentScaleConfig(
    val saturationAdjustmentCutoff: Double = 0.05,
    val saturationLight: Double = 0.35,
    val saturationDark: Double = 1.25,
    val clipLight: Double = 0.185,
    val clipDark: Double = 0.160,
    val overlayDark: Double = 0.25,
    val scaleColorLight: ARGB = ARGB(0xFF, 0xFF, 0xFF, 0xFF),
    val scaleColorDark: ARGB = ARGB(0xFF, 0x00, 0x00, 0x00),
    val interpolationMode: ColorScaleInterpolationMode = ColorScaleInterpolationMode.RGB,
)


internal class FluentColorScale : ColorScale {

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

    override fun getColor(position: Double) = getColor(position, ColorScaleInterpolationMode.RGB)

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
    ): FluentColorScale {
        if (lowerBound < 0 || upperBound > 1 || upperBound < lowerBound) {
            throw IllegalArgumentException("Invalid bounds")
        }
        if (lowerBound == upperBound) {
            return fromColors(listOf(getColor(lowerBound, mode)))
        }
        val containedStops: MutableList<ColorScaleStop> = ArrayList()

        for (i in 0 until _stops.size) {
            if (_stops[i].position >= lowerBound && _stops[i].position <= upperBound) {
                containedStops.add(_stops[i]);
            }
        }

        if (containedStops.size == 0) {
            return fromColors(
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
        return FluentColorScale(finalStops);
    }

    companion object {
        fun fromColors(colors: List<ARGB>): FluentColorScale {
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
            return FluentColorScale(_stops)
        }



        fun getPaletteScale(baseColor: ARGB, config: FluentScaleConfig = FluentScaleConfig()): ColorScale {
            val baseColorRGB = baseColor
            // RGB to HSL

            val baseColorHSL = ColorUtils.RGBToHSL(baseColorRGB)
            var baseColorNormalized = NormalizedRGB.fromRGB(baseColorRGB);

            val baseScale = fromColors(listOf(config.scaleColorLight, baseColorRGB, config.scaleColorDark))

            val trimmedScale = baseScale.trim(config.clipLight, 1.0 - config.clipDark)
            val trimmedLight = NormalizedRGB.fromRGB(trimmedScale.getColor(0.0, config.interpolationMode))
            val trimmedDark = NormalizedRGB.fromRGB(trimmedScale.getColor(1.0, config.interpolationMode))

            var adjustedLight = trimmedLight
            var adjustedDark = trimmedDark

            if (baseColorHSL.s >= config.saturationAdjustmentCutoff) {
                adjustedLight =
                    ColorBlending.saturateViaLCH(adjustedLight, config.saturationLight)
                adjustedDark =
                    ColorBlending.saturateViaLCH(adjustedDark, config.saturationDark)
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
            }
*/

            if (config.overlayDark != 0.0) {
                val overlay =
                    ColorBlending.blend(baseColorNormalized, adjustedDark, ColorBlendMode.Overlay)
                adjustedDark = ColorUtils.interpolateRGB(
                    adjustedDark,
                    overlay,
                    config.overlayDark
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