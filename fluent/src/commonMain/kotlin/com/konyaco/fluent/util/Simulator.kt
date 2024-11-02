package com.konyaco.fluent.util

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.component.Text
import kotlin.math.abs

fun main() {
    application {
        Window(::exitApplication) {
            FluentTheme {
                Column {

                    var saturationAdjustmentCutoff by remember { mutableStateOf(0.05f) }
                    var saturationLight by remember { mutableStateOf(0.35f) }
                    var saturationDark by remember { mutableStateOf(1.25f) }
                    var clipLight by remember { mutableStateOf(0.185f) }
                    var clipDark by remember { mutableStateOf(0.160f) }
                    var overlayDark by remember { mutableStateOf(0.25f) }
                    Row {
                        Column(Modifier.width(240.dp)) {
                            Text("saturationAdjustmentCutoff: $saturationAdjustmentCutoff")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = saturationAdjustmentCutoff,
                                onValueChange = { saturationAdjustmentCutoff = it },
                                valueRange = 0f..0.3f
                            )

                            Text("saturationLight: $saturationLight")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = saturationLight,
                                onValueChange = { saturationLight = it },
                                valueRange = 0f..10f
                            )

                            Text("saturationDark: $saturationDark")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = saturationDark,
                                onValueChange = { saturationDark = it },
                                valueRange = 0f..10f
                            )

                            Text("clipLight: $clipLight")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = clipLight,
                                onValueChange = { clipLight = it },
                                valueRange = 0f..0.5f
                            )

                            Text("clipDark: $clipDark")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = clipDark,
                                onValueChange = { clipDark = it },
                                valueRange = 0f..0.5f
                            )

                            Text("overlayDark: $overlayDark")
                            Slider(
                                modifier = Modifier.width(240.dp),
                                value = overlayDark,
                                onValueChange = { overlayDark = it },
                                valueRange = 0f..0.5f
                            )
                        }

                        colors.take(16).forEach { c ->
                            val scale by derivedStateOf {
                                FluentColorScale.getPaletteScale(ARGB.fromColor(c.accent),
                                    FluentScaleConfig(
                                        saturationAdjustmentCutoff = saturationAdjustmentCutoff.toDouble(),
                                        saturationLight = saturationLight.toDouble(),
                                        saturationDark = saturationDark.toDouble(),
                                        clipLight = clipLight.toDouble(),
                                        clipDark = clipDark.toDouble(),
                                        overlayDark = overlayDark.toDouble()
                                    ))
                            }

                            Column(Modifier.weight(1f)) {
                                val baseColorText by remember { mutableStateOf(c.accent.format()) }
                                val targetColorText by remember { mutableStateOf(c.light1.format()) }
                                var actualColorText by remember { mutableStateOf("") }
                                var diffText by remember { mutableStateOf(0.0f) }
                                var posText by remember { mutableStateOf(0.0f) }
                                Text("Base:\n$baseColorText")
                                Text("Target:\n$targetColorText")
                                Text("Actual:\n$actualColorText")
                                Text("Diff: %.4f".format(diffText))
                                Text("Pos: %.4f".format(posText))

                                ColorPalette(scale, c.light1) { color, diff, pos ->
                                    actualColorText = color.toColor().format()
                                    diffText = diff.toFloat()
                                    posText = pos.toFloat()
                                }
                            }
                        }
                    }
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
        val density = 1000
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

internal class TestColorScale : ColorScale {
    constructor(color: List<String>) {

    }

    override fun getColor(position: Double): ARGB {
        TODO()
    }
}

data class ExportColor(
    val foreground: Color,
    val background: Color,
    val accent: Color,
    val dark1: Color,
    val dark2: Color,
    val dark3: Color,
    val light1: Color,
    val light2: Color,
    val light3: Color,
)


// 0-1
private fun diff(a: ARGB, b: ARGB): Double {
    return (abs(a.a - b.a) + abs(a.b - b.b) + abs(a.g - b.g)) / (255 * 3).toDouble()
}

