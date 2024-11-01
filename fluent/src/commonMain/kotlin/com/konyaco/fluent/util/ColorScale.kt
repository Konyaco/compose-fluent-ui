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

// 0-1
private fun diff(a: ARGB, b: ARGB): Double {
    return (abs(a.a - b.a) + abs(a.b - b.b) + abs(a.g - b.g)) / (255 * 3).toDouble()
}

fun main() {
    val shades = Shades.generate(Color(0xFF4A78A4), false)
    println("Light 1: ${shades.light1.format()}")
    println("Light 2: ${shades.light2.format()}")
    println("Light 3: ${shades.light3.format()}")
    println("Dark 1: ${shades.dark1.format()}")
    println("Dark 2: ${shades.dark2.format()}")
    println("Dark 3: ${shades.dark3.format()}")
    val base = 0xFFe289d4

//    val base = 0xFF4A78A4
//    val target = 0xFF9CC6D9 // Accent/Default
//    val target = 0xFF8FB5C6 // Accent/Secondary
//    val target = 0xFF82A4B3 // Accent/Tertiary
    /*
        val base = 0xFFe289d4
        val target = 0xFFdda7d8 // Accent/Default
        val density = 10000
        val scale = ColorScale.getPaletteScale(ARGB.fromColor(Color(base)))

        var minimumDiff = 1.0
        var minimumPos = 0.0

        repeat(density) {
            val position = it / density.toDouble()
            val color = scale.getColor(position)

            val diff = diff(color, ARGB.fromColor(Color(target)))
            if (diff < minimumDiff) {
                minimumDiff = diff
                minimumPos = position
            }
            println("Position: ${position} Diff: ${diff}, ${color}")
        }

        println("Min diff: ${minimumDiff}, pos: $minimumPos")*/
    // Result: Accent/Default: 0.1
    // Result: Accent/Secondary: 0.246
    // Result: Accent/Tertiary: 0.3863

    application {
        Window(::exitApplication) {
            FluentTheme {
                var baseColor by remember { mutableStateOf(Color(base)) }
                var targetColor by remember { mutableStateOf(Color(base)) }

                val scale by remember(baseColor.value) {
                    mutableStateOf(
                        ColorScale.getPaletteScale(
                            ARGB.fromColor(baseColor)
                        )
                    )
                }

                var diffText by remember { mutableStateOf(0.0f) }
                var posText by remember { mutableStateOf(0.0f) }

                Column {
                    val (baseColorText, setBaseColorText) = remember { mutableStateOf("") }
                    val (targetColorText, setTargetColorText) = remember { mutableStateOf("") }

                    Row {
                        TextField(
                            value = baseColorText,
                            onValueChange = setBaseColorText,
                            isClearable = false,
                            header = {
                                Text("Base Color")
                            })

                        TextField(
                            value = targetColorText,
                            onValueChange = setTargetColorText,
                            isClearable = false,
                            header = {
                                Text("Target Color")
                            })

                        Button(onClick = {
                            val color = java.lang.Long.valueOf(baseColorText, 16)
                            baseColor = Color(color)

                            val tColor = java.lang.Long.valueOf(targetColorText, 16)
                            targetColor = Color(tColor)
                        }) { Text("Apply") }

                        Text("Diff: ${diffText}, Pos: ${posText}")
                    }


                    ColorPalette(scale, targetColor, { color, diff, pos ->
                        diffText = diff.toFloat()
                        posText = pos.toFloat()
                    })
                }
            }
        }
    }
}

@Composable
private fun ColorPalette(
    scale: ColorScale,
    targetColor: Color,
    onDiffChange: (ARGB, Double, Double) -> Unit
) {
    Canvas(Modifier.fillMaxSize()) {
        val density = 10000
        val height = this.size.height
        val thickness = 1f

        var minimumDiff = 1.0
        var minimumPos = 0.0
        var closestColor = ARGB.fromColor(Color.Transparent)

        repeat(density) {
            val position = it / density.toDouble()
            val color = scale.getColor(position)
            val y = (position * height).toFloat()
            drawLine(
                color.toColor(),
                Offset(0f, y),
                Offset(this.size.width, y),
                strokeWidth = thickness
            )

            val diff = diff(color, ARGB.fromColor(targetColor))
            if (diff < minimumDiff) {
                minimumDiff = diff
                minimumPos = position
                closestColor = color
            }
        }

        drawCircle(
            color = Color.White,
            radius = 12f,
            center = this.center.copy(y = height * minimumPos.toFloat()),
            style = Stroke(width = 2f)
        )
        onDiffChange(closestColor, minimumDiff, minimumPos)
    }
}

@OptIn(ExperimentalStdlibApi::class)
private fun Color.format() = toArgb().toHexString()

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

internal class TestColorScale : ColorScale {
    constructor(color: List<String>) {

    }

    override fun getColor(position: Double): ARGB {
        TODO()
    }
}

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

            val baseScale = fromColors(listOf(_scaleColorLight, baseColorRGB, _scaleColorDark))

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
            }
*/

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