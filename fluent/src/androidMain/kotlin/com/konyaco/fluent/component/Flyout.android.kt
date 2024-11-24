package com.konyaco.fluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.toComposeRect
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.toSize
import kotlin.math.max
import kotlin.math.roundToInt

@Composable
actual fun rememberFlyoutCalculateMaxHeight(padding: Dp): (LayoutCoordinates) -> Int {
    val config = LocalConfiguration.current
    val view = LocalView.current
    val verticalMargin = with(LocalDensity.current) { padding.roundToPx() }
    return remember(config, view) {
        {
            val windowBounds = android.graphics.Rect().let { rect ->
                view.getWindowVisibleDisplayFrame(rect)
                rect.toComposeRect()
            }
            val anchorBounds = Rect(it.positionInWindow(), it.size.toSize())
            val marginedWindowTop = windowBounds.top + verticalMargin
            val marginedWindowBottom = windowBounds.bottom - verticalMargin
            val availableHeight =
                if (anchorBounds.top > windowBounds.bottom || anchorBounds.bottom < windowBounds.top) {
                    (marginedWindowBottom - marginedWindowTop).roundToInt()
                } else {
                    val heightAbove = anchorBounds.top - marginedWindowTop
                    val heightBelow = marginedWindowBottom - anchorBounds.bottom
                    max(heightAbove, heightBelow).roundToInt()
                }

            max(availableHeight, 0)
        }
    }
}