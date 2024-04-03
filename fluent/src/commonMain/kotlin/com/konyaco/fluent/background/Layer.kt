package com.konyaco.fluent.background

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.ProvideTextStyle
import com.konyaco.fluent.shape.FluentCircleShape
import com.konyaco.fluent.shape.FluentDpCornerSize
import com.konyaco.fluent.shape.FluentRoundedCornerShape
import kotlin.math.ceil
import kotlin.math.floor

/**
 * Defines constants that specify how far an element's background extends in relation to the element's border.
 */
enum class BackgroundSizing {
    /**
     * The element's background extends to the inner edge of the border, but does not extend under the border.
     */
    InnerBorderEdge,

    /**
     * The element's background extends under the border to its outer edge, and is visible if the border is transparent.
     */
    OuterBorderEdge
}
@Deprecated(
    message = "Use backgroundSizing",
    replaceWith = ReplaceWith(
        expression = "Layer(modifier=modifier,shape=shape,color=color,contentColor=contentColor,border=border,backgroundSizing=if (outsideBorder) BackgroundSizing.InnerBorderEdge else BackgroundSizing.OuterBorderEdge,elevation=elevation,content=content)",
        imports = arrayOf("com.konyaco.fluent.background.BackgroundSizing")
    )
)
@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = FluentRoundedCornerShape(4.dp),
    color: Color = FluentTheme.colors.background.layer.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    outsideBorder: Boolean = false,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            val innerShape = remember(shape, outsideBorder) {
                if (shape is FluentRoundedCornerShape && shape != FluentCircleShape && outsideBorder) {
                    if (shape.fluentTopStart is FluentDpCornerSize) {
                        RoundedCornerShape(
                            topStart = (shape.fluentTopStart.size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            topEnd = ((shape.fluentTopEnd as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            bottomStart = ((shape.fluentBottomStart as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            bottomEnd = ((shape.fluentBottomEnd as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity)
                        )
                    } else {
                        shape
                    }
                } else {
                    shape
                }
            }
            Box(
                modifier.layerLegacy(
                    elevation,
                    shape,
                    border,
                    outsideBorder,
                    color,
                    innerShape
                ),
                propagateMinConstraints = true
            ) {
                content()
            }
        }
    }
}

private fun Modifier.layerLegacy(
    elevation: Dp,
    shape: Shape,
    border: BorderStroke?,
    outsideBorder: Boolean,
    color: Color,
    innerShape: Shape
) = this.shadow(elevation, shape, clip = false)
    .then(if (border != null) Modifier.border(border, shape) else Modifier)
    .layout { measurable, constraints ->
        val circular = shape == FluentCircleShape
        // TODO: A better way to implement outside border
        val paddingValue = when {
            outsideBorder && circular -> calcCircularPadding(this)
            outsideBorder -> calcPadding(this)
            else -> 0.dp
        }.roundToPx()
        val placeable = measurable.measure(constraints.offset(-paddingValue * 2, -paddingValue * 2))
        val width = constraints.constrainWidth(placeable.width + paddingValue * 2)
        val height = constraints.constrainHeight(placeable.height + paddingValue * 2)
        layout(width, height) {
            placeable.place(paddingValue, paddingValue)
        }
    }
    .background(color = color, shape = innerShape)
    .clip(shape = innerShape)

@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = FluentRoundedCornerShape(4.dp),
    color: Color = FluentTheme.colors.background.layer.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    backgroundSizing: BackgroundSizing,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            val innerShape = remember(shape, backgroundSizing) {
                if (shape is FluentRoundedCornerShape && shape != FluentCircleShape && backgroundSizing == BackgroundSizing.InnerBorderEdge) {
                    if (shape.fluentTopStart is FluentDpCornerSize) {
                        RoundedCornerShape(
                            topStart = (shape.fluentTopStart.size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            topEnd = ((shape.fluentTopEnd as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            bottomStart = ((shape.fluentBottomStart as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity),
                            bottomEnd = ((shape.fluentBottomEnd as FluentDpCornerSize).size - 1.dp).coerceIn(0.dp, Dp.Infinity)
                        )
                    } else {
                        shape
                    }
                } else {
                    shape
                }
            }
            Box(
                modifier.layer(
                    elevation,
                    shape,
                    border,
                    backgroundSizing,
                    color,
                    innerShape
                ), // TODO: A better way to set content corner
                propagateMinConstraints = true
            ) {
                content()
            }
        }
    }
}

private fun Modifier.layer(
    elevation: Dp,
    shape: Shape,
    border: BorderStroke?,
    backgroundSizing: BackgroundSizing,
    color: Color,
    innerShape: Shape
) = this.shadow(elevation, shape, clip = false)
    .then(
        if (border != null) {
            Modifier.border(border, shape)
                .then(
                    if (backgroundSizing == BackgroundSizing.InnerBorderEdge) {
                        Modifier.paddingToBorder(shape)
                            .background(color = color, shape = innerShape)
                    } else {
                        /* Never draw content in the border. */
                        Modifier.background(color = color, shape = shape)
                            .paddingToBorder(shape)
                    }
                ).clip(innerShape)
        } else {
            Modifier.background(color = color, shape = shape).clip(shape)
        }
    )

private fun Modifier.paddingToBorder(shape: Shape) = then(
    Modifier.layout { measurable, constraints ->
        val circular = shape == FluentCircleShape
        // TODO: A better way to implement outside border
        val paddingValue = when {
            circular -> calcCircularPadding(this)
            else -> calcPadding(this)
        }.roundToPx()
        val placeable = measurable.measure(constraints.offset(-paddingValue * 2, -paddingValue * 2))
        val width = constraints.constrainWidth(placeable.width + paddingValue * 2)
        val height = constraints.constrainHeight(placeable.height + paddingValue * 2)
        layout(width, height) {
            placeable.place(paddingValue, paddingValue)
        }
    }
)

/**
 * This is a workaround solution to eliminate 1 pixel gap
 * when density is not integer or `(density % 1) < 0.5`
 */
@Stable
private fun calcPadding(density: Density): Dp {
    val remainder = density.density % 1f

    return when {
        remainder == 0f -> 1.dp
        remainder < 0.5f -> with(density) {
//            (1.dp.toPx() + 1).toDp()
            ceil(1.dp.toPx()).toDp()
        }
        else -> 1.dp
    }
}

@Stable
private fun calcCircularPadding(density: Density): Dp {
    val remainder = density.density % 1f

    return with(density) {
        if (remainder == 0f) (1.dp.toPx() - 1f).toDp() // floor(1.dp.toPx() - 0.5f).toDp()
        else floor(1.dp.toPx()).toDp()
    }
}