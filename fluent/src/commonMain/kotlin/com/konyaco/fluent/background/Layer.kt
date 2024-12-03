package com.konyaco.fluent.background

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.translate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.ProvideTextStyle
import kotlin.jvm.JvmInline
import kotlin.math.sqrt

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
    shape: Shape = FluentTheme.shapes.control,
    color: Color = FluentTheme.colors.background.layer.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    outsideBorder: Boolean,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        border = border,
        elevation = elevation,
        backgroundSizing = if (outsideBorder) {
            BackgroundSizing.InnerBorderEdge
        } else {
            BackgroundSizing.OuterBorderEdge
        },
        content = content
    )
}

@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.control,
    color: Color = FluentTheme.colors.background.layer.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    backgroundSizing: BackgroundSizing = BackgroundSizing.OuterBorderEdge,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        border = border,
        backgroundSizing = backgroundSizing,
        elevation = elevation,
        clipContent = false,
        content = content
    )
}

@Composable
fun Layer(
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.control,
    color: Color = FluentTheme.colors.background.layer.default,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    border: BorderStroke? = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
    backgroundSizing: BackgroundSizing = BackgroundSizing.OuterBorderEdge,
    clipContent: Boolean = false,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    ProvideTextStyle(FluentTheme.typography.body.copy(color = contentColor)) {
        CompositionLocalProvider(
            LocalContentColor provides contentColor,
            LocalContentAlpha provides contentColor.alpha
        ) {
            Box(
                modifier = modifier.layer(
                    elevation,
                    shape,
                    border,
                    backgroundSizing,
                    color,
                    clipContent
                ),
                propagateMinConstraints = true
            ) {
                content()
            }
        }
    }
}

@Composable
private fun Modifier.layer(
    elevation: Dp,
    shape: Shape,
    border: BorderStroke?,
    backgroundSizing: BackgroundSizing,
    color: Color,
    clipContent: Boolean
) = then(
    Modifier
        .elevation(elevation = elevation, shape = shape)
        .then(
            if (border != null) {
                val backgroundShape =
                    if (backgroundSizing == BackgroundSizing.InnerBorderEdge && shape is CornerBasedShape) {
                        BackgroundPaddingShape(shape)
                    } else {
                        shape
                    }
                Modifier.border(border, shape)
                    .background(color, backgroundShape)
                    .then(if (clipContent) Modifier.clip(backgroundShape) else Modifier)
            } else {
                Modifier.background(color, shape)
            }
        )
        .clip(shape)
)

/**
 * keep padding for background
 */
@Immutable
@JvmInline
internal value class BackgroundPaddingShape(private val borderShape: CornerBasedShape) : Shape {

    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
        return with(density) {
            createInnerOutline(size, density, layoutDirection, borderShape.calculateBorderPadding(density))
        }
    }

    /**
     * Fork from [CornerBasedShape.createOutline], add padding to corner size and outline rect size.
     */
    private fun createInnerOutline(size: Size, density: Density, layoutDirection: LayoutDirection, paddingPx: Float) =
        borderShape.run {
            val cornerPaddingPx = if (this is CutCornerShape) {
                /** padding for cut corner shape */
                (paddingPx / sqrt(2f)).toInt().toFloat()
            } else {
                paddingPx
            }
            val innerSize = Size(size.width - 2 * paddingPx, size.height - 2 * paddingPx)
            /** add padding to corner size */
            var topStart = (borderShape.topStart.toPx(size, density) - cornerPaddingPx).coerceAtLeast(0f)
            var topEnd = (borderShape.topEnd.toPx(size, density) - cornerPaddingPx).coerceAtLeast(0f)
            var bottomEnd = (borderShape.bottomEnd.toPx(size, density) - cornerPaddingPx).coerceAtLeast(0f)
            var bottomStart = (borderShape.bottomStart.toPx(size, density) - cornerPaddingPx).coerceAtLeast(0f)
            val minDimension = innerSize.minDimension
            if (topStart + bottomStart > minDimension) {
                val scale = minDimension / (topStart + bottomStart)
                topStart *= scale
                bottomStart *= scale
            }
            if (topEnd + bottomEnd > minDimension) {
                val scale = minDimension / (topEnd + bottomEnd)
                topEnd *= scale
                bottomEnd *= scale
            }
            require(topStart >= 0.0f && topEnd >= 0.0f && bottomEnd >= 0.0f && bottomStart >= 0.0f) {
                "Corner size in Px can't be negative(topStart = $topStart, topEnd = $topEnd, " +
                        "bottomEnd = $bottomEnd, bottomStart = $bottomStart)!"
            }
            /** add padding to outline rect size */
            val oldOutline = createOutline(
                size = innerSize,
                topStart = topStart,
                topEnd = topEnd,
                bottomEnd = bottomEnd,
                bottomStart = bottomStart,
                layoutDirection = layoutDirection
            )
            /** translate outline to the actual rect bounds */
            when (oldOutline) {
                is Outline.Rectangle -> Outline.Rectangle(oldOutline.rect.translate(Offset(paddingPx, paddingPx)))
                is Outline.Rounded -> Outline.Rounded(oldOutline.roundRect.translate(Offset(paddingPx, paddingPx)))
                is Outline.Generic -> Outline.Generic(oldOutline.path.apply { translate(Offset(paddingPx, paddingPx)) })
            }
        }
}

/**
 * This is a workaround solution to eliminate 1 pixel gap
 * when density is not integer or `(density % 1) < 0.5`
 */
@Stable
private fun calcPadding(density: Density): Dp {
    val remainder = density.density % 1f

    return with(density) {
        when {
            remainder == 0f -> 1.dp
            else -> (1.dp.toPx() - remainder + 1).toDp()
        }
    }
}

@Stable
private fun calcCircularPadding(density: Density): Dp {
    val remainder = density.density % 1f

    return with(density) {
        if (remainder == 0f) 1.dp
        else (1.dp.toPx() - remainder + 1).toDp()
    }
}

internal fun Shape.calculateBorderPadding(density: Density): Float {
    val circular = this == CircleShape
    return with(density) {
        when {
            circular -> calcCircularPadding(density)
            else -> calcPadding(density)
        }.toPx()
    }
}