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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.TransformOrigin
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
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica

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
        val transformOriginState = remember { mutableStateOf(TransformOrigin.Center) } // TODO: Transform Origin
        val density = LocalDensity.current

        val popupPositionProvider = DropdownMenuPositionProvider(density)

        Popup(
            properties = PopupProperties(focusable = focusable),
            onDismissRequest = onDismissRequest,
            onKeyEvent = onKeyEvent,
            onPreviewKeyEvent = onPreviewKeyEvent,
            popupPositionProvider = popupPositionProvider,
        ) {
            DropdownMenuContent(
                expandedStates = expandedStates,
                transformOriginState = transformOriginState,
                modifier = modifier,
                content = content
            )
        }
    }
}

internal class DropdownMenuPositionProvider(val density: Density) : PopupPositionProvider {
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

        val y = if(popupToTop) {
            anchorBounds.top - needSpace
        } else {
            anchorBounds.bottom + gap
        }

        return IntOffset(x, y)
    }
}

@Composable
internal fun DropdownMenuContent(
    expandedStates: MutableTransitionState<Boolean>,
    transformOriginState: MutableState<TransformOrigin>,
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
        Mica(Modifier.shadow(8.dp, RoundedCornerShape(8.dp)).clip(RoundedCornerShape(8.dp))) {
            // TODO: Dropdown should use Acrylic material.
            Layer(
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout),
                outsideBorder = true
            ) {
                Column(
                    modifier = modifier
                        .padding(vertical = 4.dp, horizontal = 4.dp)
                        .width(IntrinsicSize.Max)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    content = content
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