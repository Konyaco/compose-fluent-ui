package io.github.composefluent.gallery.screen.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentColor
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.CopyButton
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.component.HeaderItemRow
import io.github.composefluent.gallery.component.ItemRow
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 1, icon = "Shapes")
@Composable
fun GeometryScreen() {
    GalleryPage(
        title = "Geometry",
        description = "Geometry describes the shape, size and position of Ul elements on screen. " +
                "These fundamental design elements help experiences feel coherent across the entire design system. " +
                "Fluent Design System uses three levels of rounding depending on" +
                "component is being rounded and how that component is aranged relative to neighboring elements.",
        componentPath = FluentSourceFile.Geometry,
        galleryPath = ComponentPagePath.GeometryScreen
    ) {

        Section(
            title = "Corner Radius",
            sourceCode = sourceCodeOfCornerRadiusSample,
            content = { CornerRadiusItems() }
        )

        Section(
            title = "Shapes",
            sourceCode = sourceCodeOfShapesSample,
            content = { ShapesItems() }
        )
    }
}

@Sample
@Composable
private fun CornerRadiusSample() {
    Column {
        Box(shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.overlay))
        Box(shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.control))
        Box(shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.intersectionEdge))
    }
}

@Sample
@Composable
private fun ShapesSample() {
    Column {
        Box(shape = FluentTheme.shapes.overlay)
        Box(shape = FluentTheme.shapes.control)
        Box(shape = FluentTheme.shapes.intersectionEdge)
    }
}

@Composable
private fun Box(shape: Shape) {
    Box(
        modifier = Modifier.size(20.dp).background(
            color = FluentTheme.colors.fillAccent.default,
            shape = shape
        )
    )
}

@Composable
private fun CornerRadiusItems() {
    Column {
        HeaderItemRow(
            text = "Corner Radius",
            secondary = "Usage",
            third = "Style",
            fourth = "",
            textWidth = textWidth,
            secondaryWidth = secondaryWidth,
            thirdWidth = thirdWidth
        )
        CornerRadiusList().forEachIndexed { index, (property, value) ->
            ItemRow(
                text = {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Box(shape = RoundedCornerShape(topStart = value))
                        Text("${value.value.toInt()}dp")
                    }
                },
                secondary = { UsageText(value) },
                third = {
                    val content = "FluentTheme.cornerRadius.$property"
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = content,
                            modifier = Modifier.weight(1f),
                            style = FluentTheme.typography.caption.copy(LocalContentColor.current)
                        )
                        CopyButton(content)
                    }
                },
                fourth = {},
                index = index + 1,
                textWidth = textWidth,
                secondaryWidth = secondaryWidth,
                thirdWidth = thirdWidth
            )
        }
    }
}

@Composable
fun ShapesItems() {
    Column {
        HeaderItemRow(
            text = "Shape",
            secondary = "Usage",
            third = "Style",
            fourth = "",
            textWidth = textWidth,
            secondaryWidth = secondaryWidth,
            thirdWidth = thirdWidth
        )
        ShapesList().forEachIndexed { index, (radius, property, value) ->
            ItemRow(
                text = {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Box(shape = value)
                        Text("${radius.value.toInt()}dp")
                    }
                },
                secondary = { UsageText(radius) },
                third = {
                    val content = "FluentTheme.shapes.$property"
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = content,
                            modifier = Modifier.weight(1f),
                            style = FluentTheme.typography.caption.copy(LocalContentColor.current)
                        )
                        CopyButton(content)
                    }
                },
                fourth = {},
                index = index + 1,
                textWidth = textWidth,
                secondaryWidth = secondaryWidth,
                thirdWidth = thirdWidth
            )
        }
    }
}

@Stable
@Composable
private fun CornerRadiusList(): List<Pair<String, Dp>> {
    val geometry = FluentTheme.cornerRadius
    return listOf(
        Pair( geometry::overlay.name, geometry.overlay),
        Pair(geometry::control.name, geometry.control),
        Pair(geometry::intersectionEdge.name, geometry.intersectionEdge)
    )
}

@Stable
@Composable
private fun ShapesList(): List<Triple<Dp, String, Shape>> {
    val shapes = FluentTheme.shapes
    val geometry = FluentTheme.cornerRadius
    return listOf(
        Triple(geometry.overlay, shapes::overlay.name, shapes.overlay),
        Triple(geometry.control, shapes::control.name, shapes.control),
        Triple(geometry.intersectionEdge, shapes::intersectionEdge.name, shapes.intersectionEdge)
    )
}

@Composable
private fun UsageText(cornerRadius: Dp) {
    Text(
        text = when (cornerRadius) {
            FluentTheme.cornerRadius.overlay -> "Top-level containers such as app windows, flyouts, cards and dialogs."
            FluentTheme.cornerRadius.control -> "In-page elements such as controls and list backplates."
            FluentTheme.cornerRadius.intersectionEdge -> "Straight edges that intersect with other straight edges."
            else -> ""
        },
        style = FluentTheme.typography.caption.copy(LocalContentColor.current)
    )
}

private val textWidth = 120.dp
private val secondaryWidth = 400.dp
private val thirdWidth = 320.dp