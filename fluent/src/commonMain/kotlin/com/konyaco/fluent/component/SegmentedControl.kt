package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
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
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.layout.HorizontalIndicatorContentLayout
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

@Composable
fun SegmentedControl(
    modifier: Modifier = Modifier,
    color: Color = FluentTheme.colors.controlAlt.secondary,
    borderStroke: BorderStroke? = BorderStroke(
        buttonBorderStrokeWidth,
        FluentTheme.colors.stroke.control.default
    ),
    content: @Composable RowScope.() -> Unit,
) {
    Layer(
        color = color,
        border = borderStroke,
        shape = FluentTheme.shapes.control,
        backgroundSizing = BackgroundSizing.OuterBorderEdge,
        modifier = modifier
    ) {
        Row(content = content)
    }
}

@Composable
fun SegmentedButton(
    checked: Boolean,
    onCheckedChanged: (Boolean) -> Unit,
    colors: VisualStateScheme<ButtonColor> = if (checked) {
        ButtonDefaults.buttonColors()
    } else {
        ButtonDefaults.subtleButtonColors()
    },
    indicator: @Composable () -> Unit = {
        HorizontalIndicator(
            visible = checked,
            modifier = Modifier.padding(bottom = buttonBorderStrokeWidth)
        )
    },
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    position: SegmentedItemPosition = SegmentedItemPosition.Center,
    interactionSource: MutableInteractionSource? = null,
    icon: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null
) {
    val targetInteractionSource = interactionSource ?: remember { MutableInteractionSource() }
    val currentColors = colors.schemeFor(targetInteractionSource.collectVisualState(!enabled))
    val shape = if (checked) {
        FluentTheme.shapes.control
    } else {
        val padding = when (position) {
            SegmentedItemPosition.Start -> PaddingValues(
                top = 3.dp,
                bottom = 3.dp,
                start = 3.dp,
                end = 1.dp
            )

            SegmentedItemPosition.Center -> PaddingValues(
                horizontal = 1.dp,
                vertical = 3.dp
            )

            SegmentedItemPosition.End -> PaddingValues(
                top = 3.dp,
                bottom = 3.dp,
                start = 1.dp,
                end = 3.dp
            )
        }
        PaddingBackgroundShape(2.dp, padding)
    }
    Layer(
        color = currentColors.fillColor,
        contentColor = currentColors.contentColor,
        border = BorderStroke(buttonBorderStrokeWidth, currentColors.borderBrush),
        backgroundSizing = BackgroundSizing.OuterBorderEdge,
        modifier = modifier.clickable(
            enabled = enabled,
            interactionSource = targetInteractionSource,
            indication = null,
            onClick = { onCheckedChanged(!checked) }
        ),
        shape = shape,
    ) {
        HorizontalIndicatorContentLayout(
            indicator = indicator,
            icon = icon,
            text = text,
            trailing = null,
            modifier = Modifier.defaultMinSize(minHeight = buttonMinHeight)
        )
    }
}

enum class SegmentedItemPosition { Start, Center, End }

@Composable
fun HorizontalIndicator(
    modifier: Modifier = Modifier,
    visible: Boolean = true,
    enabled: Boolean = true,
    color: Color = FluentTheme.colors.fillAccent.default,
    disabledColor: Color = FluentTheme.colors.fillAccent.disabled
) {
    val width by updateTransition(visible).animateDp(transitionSpec = {
        if (targetState) tween(
            FluentDuration.QuickDuration,
            easing = FluentEasing.FastInvokeEasing
        )
        else tween(FluentDuration.QuickDuration, easing = FluentEasing.FastDismissEasing)
    }, targetValueByState = { if (it) 16.dp else 0.dp })
    Box(
        modifier = modifier
            .size(width = width, height = 3.dp)
            .background(
                color = if (enabled) {
                    color
                } else {
                    disabledColor
                },
                shape = CircleShape
            )
    )
}

@Stable
private class PaddingBackgroundShape(corner: Dp, private val padding: PaddingValues) : Shape {
    private val shape = RoundedCornerShape(corner)
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return with(density) {
            val leftPadding = padding.calculateLeftPadding(layoutDirection).toPx()
            val topPadding = padding.calculateTopPadding().toPx()
            val rightPadding = padding.calculateRightPadding(layoutDirection).toPx()
            val bottomPadding = padding.calculateBottomPadding().toPx()
            val paddingSize = Size(
                size.width - leftPadding - rightPadding,
                size.height - topPadding - bottomPadding
            )
            when (val oldOutline = shape.createOutline(paddingSize, layoutDirection, density)) {
                is Outline.Rectangle -> Outline.Rectangle(
                    oldOutline.rect.translate(
                        Offset(
                            leftPadding,
                            topPadding
                        )
                    )
                )

                is Outline.Rounded -> Outline.Rounded(
                    oldOutline.roundRect.translate(
                        Offset(
                            leftPadding,
                            topPadding
                        )
                    )
                )

                is Outline.Generic -> Outline.Generic(oldOutline.path.apply {
                    translate(
                        Offset(
                            leftPadding,
                            topPadding
                        )
                    )
                })
                else -> oldOutline
            }
        }
    }
}