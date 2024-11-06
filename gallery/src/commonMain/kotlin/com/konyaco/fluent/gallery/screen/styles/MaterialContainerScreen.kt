@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.styles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Material
import com.konyaco.fluent.background.MaterialContainer
import com.konyaco.fluent.background.MaterialContainerScope
import com.konyaco.fluent.background.MaterialDefaults
import com.konyaco.fluent.component.ColorPicker
import com.konyaco.fluent.component.DropDownButton
import com.konyaco.fluent.component.FlyoutContainer
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@OptIn(ExperimentalTextApi::class, ExperimentalStdlibApi::class)
@Component(
    index = 3,
    description = "A translucent material recommended for panel backgrounds.",
)
@Composable
fun MaterialContainerScreen() {
    val linkTextColor = FluentTheme.colors.text.accent.primary
    GalleryPage(
        title = AnnotatedString("MaterialContainer"),
        description = buildAnnotatedString {
            append("A translucent material recommended for panel backgrounds. ")
            append("supported by ")
            withLink(LinkAnnotation.Url("https://github.com/chrisbanes/haze")) {
                append(AnnotatedString("haze", spanStyle = SpanStyle(color = linkTextColor)))
            }
            append(".")
        },
        componentPath = FluentSourceFile.Material,
        galleryPath = ComponentPagePath.MaterialContainerScreen
    ) {
        Section(
            title = "A Basic Acrylic sample",
            sourceCode = sourceCodeOfBasicAcrylicSample,
            content = { BasicAcrylicSample() }
        )

        val index = remember { mutableStateOf(2) }

        Section(
            title = "Default Material",
            sourceCode = sourceCodeOfDefaultMaterialSample,
            content = { DefaultMaterialSample(index.value) },
            options = {
                repeat(7) {
                    RadioButton(
                        selected = index.value == it,
                        onClick = { index.value = it },
                        label = when (it) {
                            0 -> "Thin Acrylic"
                            1 -> "Acrylic Base"
                            3 -> "Accent Acrylic Base"
                            4 -> "Accent Acrylic Default"
                            5 -> "Mica"
                            6 -> "Mica Alt"
                            else -> "Acrylic Default"
                        }
                    )

                }
            }
        )

        val tintOpacity = remember { mutableStateOf(0.8f) }
        val luminosityOpacity = remember { mutableStateOf(0.8f) }
        val color = remember { mutableStateOf(Color.White) }

        Section(
            title = "Custom Acrylic Material",
            sourceCode = sourceCodeOfCustomMaterialSample,
            content = {
                CustomMaterialSample(
                    color = color.value,
                    tintOpacity = tintOpacity.value,
                    luminosityOpacity = luminosityOpacity.value
                )
            },
            options = {
                Text("Tint Color")
                FlyoutContainer(
                    content = {
                        DropDownButton(
                            content = {
                                Box(modifier = Modifier.size(16.dp).background(color.value))
                                val hexFormat = remember {
                                    HexFormat {
                                        number {
                                            prefix = "#"
                                        }
                                        upperCase = true
                                    }
                                }
                                Text(
                                    color.value.value.toHexString(hexFormat).substring(0..8),
                                    modifier = Modifier.widthIn(90.dp)
                                )
                            },
                            onClick = {
                                isFlyoutVisible = true
                            }
                        )
                    },
                    flyout = {
                        ColorPicker(
                            color = color.value,
                            onSelectedColorChanged = {
                                color.value = it
                            }
                        )
                    }
                )
                Text("Tint Opacity")
                Slider(value = tintOpacity.value, onValueChange = { tintOpacity.value = it }, modifier = Modifier.width(200.dp).height(32.dp))
                Text("Luminosity Opacity")
                Slider(value = luminosityOpacity.value, onValueChange = { luminosityOpacity.value = it }, modifier = Modifier.width(200.dp).height(32.dp))

            }
        )
    }
}

@Sample
@Composable
private fun BasicAcrylicSample() {
    SampleContainer {
        Material(
            material = MaterialDefaults.acrylicDefault(),
            modifier = Modifier.align(Alignment.Center)
        ) {
            MaterialOverlayContent()
        }
    }
}

@Sample
@Composable
private fun DefaultMaterialSample(index: Int) {
    SampleContainer {
        Material(
            material = when (index) {
                0 -> MaterialDefaults.thinAcrylic()
                1 -> MaterialDefaults.acrylicBase()
                3 -> MaterialDefaults.accentAcrylicBase()
                4 -> MaterialDefaults.accentAcrylicDefault()
                5 -> MaterialDefaults.mica()
                6 -> MaterialDefaults.micaAlt()
                else -> MaterialDefaults.acrylicDefault()
            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            MaterialOverlayContent()
        }
    }
}

@Sample
@Composable
private fun CustomMaterialSample(
    color: Color,
    tintOpacity: Float,
    luminosityOpacity: Float
) {
    SampleContainer {
        Material(
            material = MaterialDefaults.customAcrylic(
                isDark = FluentTheme.colors.darkMode,
                tint = color,
                lightTintOpacity = tintOpacity,
                lightLuminosityOpacity = luminosityOpacity,
                backgroundColor = FluentTheme.colors.background.acrylic.default
            ),
            modifier = Modifier.align(Alignment.Center)
        ) {
            MaterialOverlayContent()
        }
    }
}

@Composable
private fun MaterialOverlayContent() {
    Box(Modifier.width(336.dp).height(226.dp))
}

@Composable
private fun SampleContainer(content: @Composable MaterialContainerScope.() -> Unit) {
    MaterialContainer {
        Box(modifier = Modifier.defaultMinSize(minWidth = 360.dp).height(250.dp).behindMaterial()) {
            Box(Modifier.align(Alignment.TopStart).size(100.dp, 200.dp).background(Color.Cyan))
            Box(
                Modifier.align(Alignment.Center).size(152.dp)
                    .background(Color.Magenta, shape = CircleShape)
            )
            Box(Modifier.align(Alignment.BottomEnd).size(80.dp, 100.dp).background(Color.Yellow))

        }
        content()
    }
}