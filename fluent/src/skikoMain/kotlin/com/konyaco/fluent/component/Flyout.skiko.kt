package com.konyaco.fluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.toIntRect
import kotlin.math.max

@OptIn(ExperimentalComposeUiApi::class)
@Composable
actual fun rememberFlyoutCalculateMaxHeight(padding: Dp): (LayoutCoordinates) -> Int {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current
    val verticalMarginInPx = with(LocalDensity.current) { padding.roundToPx() }
    return remember(windowInfo, density) {
        {
            val boundsInWindow = it.boundsInWindow()
            val visibleWindowBounds = windowInfo.containerSize.toIntRect()
            val heightAbove = boundsInWindow.top - visibleWindowBounds.top
            val heightBelow = visibleWindowBounds.height - boundsInWindow.bottom
            max(heightAbove, heightBelow).toInt() - verticalMarginInPx
        }
    }
}