package com.konyaco.fluent.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.LayerShapeHelper
import com.konyaco.fluent.background.calculateBorderPadding
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import kotlin.jvm.JvmInline

@Composable
fun MultiSelectGridViewItem(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: VisualStateScheme<GridViewItemColor> = if (selected) {
        GridViewItemDefaults.selectedColors()
    } else {
        GridViewItemDefaults.defaultColors()
    },
    checkBoxColorScheme: VisualStateScheme<CheckBoxColor> = if (selected) {
        GridViewItemDefaults.selectedCheckBoxColors()
    } else {
        GridViewItemDefaults.defaultCheckBoxColors()
    },
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit
) {
    GridViewItem(
        selected = selected,
        onSelectedChange = onSelectedChange,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        colors = colors,
        content = { content() },
        overlay = {
            CheckBox(
                checked = selected,
                onCheckStateChange = onSelectedChange,
                colors = checkBoxColorScheme,
                enabled = enabled,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 4.dp, end = 4.dp)
            )
        }
    )
}

@Composable
fun GridViewItem(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    colors: VisualStateScheme<GridViewItemColor> = if (selected) {
        GridViewItemDefaults.selectedColors()
    } else {
        GridViewItemDefaults.defaultColors()
    },
    content: @Composable () -> Unit
) {
    GridViewItem(
        selected = selected,
        onSelectedChange = onSelectedChange,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        colors = colors,
        content = { content() },
        overlay = null
    )
}

@Stable
data class GridViewItemColor(
    val borderColor: Color,
    val backgroundColor: Color
)

typealias GridViewItemColorScheme = PentaVisualScheme<GridViewItemColor>

object GridViewItemDefaults {

    val spacing = 4.dp

    @Stable
    @Composable
    fun defaultColors(
        default: GridViewItemColor = GridViewItemColor(
            borderColor = Color.Transparent,
            backgroundColor = FluentTheme.colors.subtleFill.transparent
        ),
        hovered: GridViewItemColor = GridViewItemColor(
            borderColor = FluentTheme.colors.stroke.control.onAccentTertiary,
            backgroundColor = FluentTheme.colors.subtleFill.secondary
        ),
        pressed: GridViewItemColor = GridViewItemColor(
            borderColor = Color.Transparent,
            backgroundColor = FluentTheme.colors.subtleFill.tertiary
        ),
        disabled: GridViewItemColor = default,
    ): GridViewItemColorScheme = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Stable
    @Composable
    fun selectedColors(
        default: GridViewItemColor = GridViewItemColor(
            borderColor = FluentTheme.colors.fillAccent.default,
            backgroundColor = FluentTheme.colors.subtleFill.tertiary
        ),
        hovered: GridViewItemColor = GridViewItemColor(
            borderColor = FluentTheme.colors.fillAccent.secondary,
            backgroundColor = FluentTheme.colors.subtleFill.secondary
        ),
        pressed: GridViewItemColor = GridViewItemColor(
            borderColor = FluentTheme.colors.fillAccent.tertiary,
            backgroundColor = FluentTheme.colors.subtleFill.tertiary
        ),
        disabled: GridViewItemColor = GridViewItemColor(
            borderColor = FluentTheme.colors.fillAccent.disabled,
            backgroundColor = FluentTheme.colors.subtleFill.secondary
        ),
    ): GridViewItemColorScheme = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    //TODO ColorOnImage
    @Stable
    @Composable
    fun defaultCheckBoxColors() = CheckBoxDefaults.defaultCheckBoxColors()

    //TODO ColorOnImage
    @Stable
    @Composable
    fun selectedCheckBoxColors() = CheckBoxDefaults.selectedCheckBoxColors()
}

@Composable
private fun GridViewItem(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    colors: VisualStateScheme<GridViewItemColor>,
    interactionSource: MutableInteractionSource?,
    overlay: (@Composable BoxScope.() -> Unit)?,
    content: @Composable BoxScope.() -> Unit
) {
    val itemShape = FluentTheme.shapes.control
    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }
    val currentColor = colors.schemeFor(targetInteractionSource.collectVisualState(!enabled))
    Box(
        propagateMinConstraints = true,
        modifier = modifier
            .clip(itemShape)
            .selectable(
                enabled = enabled,
                selected = selected,
                onClick = { onSelectedChange(!selected) },
                indication = null,
                interactionSource = targetInteractionSource
            )
            .border(SelectedItemBorderSize, currentColor.borderColor, shape = itemShape)
    ) {
        Box(
            propagateMinConstraints = true,
            modifier = if (selected) {
                val innerShape = remember(itemShape) {
                    if (itemShape is CornerBasedShape) {
                        GridViewItemInnerShape(itemShape)
                    } else {
                        itemShape
                    }
                }
                Modifier
                    .clip(innerShape)
                    .background(
                        color = currentColor.backgroundColor,
                        shape = innerShape
                    )
            } else {
                Modifier.background(
                    color = currentColor.backgroundColor,
                    shape = itemShape
                )
            }
        ) {
            content()
        }
        if (overlay != null) {
            Box(
                content = overlay,
                modifier = Modifier
                    .matchParentSize()
            )
        }

    }
}

@Stable
@Immutable
@JvmInline
private value class GridViewItemInnerShape(private val itemShape: CornerBasedShape): Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return LayerShapeHelper.createInnerOutline(
            outsideShape = itemShape,
            size = size,
            density = density,
            layoutDirection = layoutDirection,
            paddingPx = itemShape.calculateBorderPadding(density, InnerPaddingSize)
        )
    }
}

private val SelectedItemBorderSize = 2.dp
private val InnerPaddingSize = 3.dp