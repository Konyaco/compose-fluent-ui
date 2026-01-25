package io.github.composefluent.gallery.screen.design

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.FluentThemeConfiguration
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.ElevationDefaults
import io.github.composefluent.background.Layer
import io.github.composefluent.component.Slider
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@OptIn(ExperimentalFluentApi::class)
@Component(index = 0, icon = "Layer")
@Composable
fun ElevationScreen() {
    GalleryPage(
        title = "Elevation",
        description = "Creating a visual hierarchy of elements in your UI makes the UI easy to scan and conveys what is important to focus on. " +
                "Elevation, the act of bringing select elements of your UI forward, is often used to achieve hierarchy.",
        componentPath = FluentSourceFile.Elevation,
        galleryPath = ComponentPagePath.ElevationScreen,
    ) {
        Section {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Elevation types", style = FluentTheme.typography.bodyStrong)
                FluentThemeConfiguration {
                    Layer(
                        border = null,
                        color = Color.Transparent,
                        backgroundSizing = BackgroundSizing.OuterBorderEdge,
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            val items = listOf(
                                ElevationDefaults::layer.name to ElevationDefaults.layer,
                                ElevationDefaults::control.name to ElevationDefaults.control,
                                ElevationDefaults::cardRest.name to ElevationDefaults.cardRest,
                                ElevationDefaults::tooltip.name to ElevationDefaults.tooltip,
                                ElevationDefaults::flyout.name to ElevationDefaults.flyout,
                                ElevationDefaults::dialog.name to ElevationDefaults.dialog
                            )
                            items.forEach { (name, elevation) ->
                                Column(
                                    modifier = Modifier.weight(1f)
                                        .wrapContentWidth(Alignment.Start),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(name.replaceFirstChar { it.uppercase() })
                                    ElevationBoxSample(
                                        elevation = elevation,
                                        modifier = Modifier.padding(vertical = 8.dp)
                                            .padding(bottom = 56.dp)
                                    )
                                }
                            }

                        }
                    }
                }
            }
        }
        val elevation = remember { mutableStateOf(0) }
        Section(
            title = "Basic Elevation",
            sourceCode = sourceCodeOfElevationBoxSample,
            content = {
                Box(modifier = Modifier.size(200.dp), contentAlignment = Alignment.Center) {
                    ElevationBoxSample(elevation.value.dp)
                }
            },
            options = {
                Slider(
                    value = elevation.value.toFloat(),
                    onValueChange = { elevation.value = it.toInt() },
                    valueRange = 0f..128f,
                    modifier = Modifier.height(32.dp).width(200.dp)
                )
            }
        )
    }
}

@Sample
@Composable
private fun ElevationBoxSample(
    elevation: Dp,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape
) {
    Layer(
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        border = BorderStroke(
            width = 1.dp,
            color = when {
                elevation.value > 2f -> FluentTheme.colors.stroke.surface.flyout
                elevation.value in 0f..1f -> FluentTheme.colors.stroke.card.default
                else -> Color.Transparent
            }
        ),
        color = FluentTheme.colors.background.solid.quaternary,
        shape = shape,
        elevation = elevation,
        modifier = modifier
    ) {
        Text(
            text = "depth\n${elevation.value.toInt()}",
            textAlign = TextAlign.Center,
            color = FluentTheme.colors.text.text.secondary,
            modifier = Modifier.size(boxSize).wrapContentSize(Alignment.Center)
        )
    }
}

private val boxSize = 80.dp