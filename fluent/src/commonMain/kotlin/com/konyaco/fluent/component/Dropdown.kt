package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalAcrylicPopupEnabled
import com.konyaco.fluent.LocalWindowAcrylicContainer
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.MaterialDefaults
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.ElevationDefaults
import com.konyaco.fluent.background.Layer

@Composable
fun DropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    focusable: Boolean = false,
    onPreviewKeyEvent: ((KeyEvent) -> Boolean) = { false },
    onKeyEvent: ((KeyEvent) -> Boolean) = { false },
    offset: DpOffset = DpOffset(0.dp, 0.dp), // TODO: Offset
    content: @Composable ColumnScope.() -> Unit
) {
    val expandedStates = remember { MutableTransitionState(false) }
    expandedStates.targetState = expanded

    if (expandedStates.currentState || expandedStates.targetState) {
        val density = LocalDensity.current

        val popupPositionProvider = DropdownMenuPositionProvider(density, offset)

        Popup(
            properties = PopupProperties(focusable = focusable),
            onDismissRequest = onDismissRequest,
            onKeyEvent = onKeyEvent,
            onPreviewKeyEvent = onPreviewKeyEvent,
            popupPositionProvider = popupPositionProvider,
        ) {
            DropdownMenuContent(
                expandedStates = expandedStates,
                modifier = modifier,
                content = content
            )
        }
    }
}

internal class DropdownMenuPositionProvider(val density: Density, val offset: DpOffset) : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val xCenter = (anchorBounds.right + anchorBounds.left) / 2
        val x = xCenter - (popupContentSize.width / 2)
        val gap = with(density) { 4.dp.roundToPx() }

        val topSpace = anchorBounds.top
        val bottomSpace = windowSize.height - anchorBounds.bottom
        val needSpace = popupContentSize.height + gap

        val popupToTop = bottomSpace < needSpace && topSpace > needSpace

        val y = if (popupToTop) {
            anchorBounds.top - needSpace
        } else {
            anchorBounds.bottom + gap
        }
        with(density) {
            offset.x.roundToPx()
            offset.y.roundToPx()
            return IntOffset(x + offset.x.roundToPx(), y + offset.y.roundToPx())
        }
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
internal fun DropdownMenuContent(
    expandedStates: MutableTransitionState<Boolean>,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    AnimatedVisibility(
        visibleState = expandedStates,
        enter = expandVertically(
            tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
        ), // TODO: If popup direction is upward, the expanding animation should be bottom-to-top.
        exit = fadeOut(tween(FluentDuration.ShortDuration, easing = FluentEasing.FastDismissEasing))
    ) {
        val shape = FluentTheme.shapes.overlay
        val useAcrylic = LocalAcrylicPopupEnabled.current
        Layer(
            elevation = ElevationDefaults.flyout,
            color = if (!useAcrylic) {
                FluentTheme.colors.background.acrylic.default
            } else {
                Color.Transparent
            },
            shape = shape,
            border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout),
            backgroundSizing = BackgroundSizing.InnerBorderEdge
        ) {

            with(LocalWindowAcrylicContainer.current) {
                FlyoutContentLayout(
                    contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
                    material = MaterialDefaults.acrylicDefault(),
                    content = {
                        Column(
                            modifier = modifier
                                .width(IntrinsicSize.Max)
                                .verticalScroll(rememberScrollState()),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            content = content
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun DropdownMenuItem(onClick: () -> Unit, content: @Composable RowScope.() -> Unit) {
    SubtleButton(modifier = Modifier.defaultMinSize(minWidth = 100.dp), onClick = onClick, iconOnly = true, content = {
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp), content = content)
    })
}