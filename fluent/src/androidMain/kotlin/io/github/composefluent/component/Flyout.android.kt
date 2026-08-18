package io.github.composefluent.component

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

@Composable
internal actual fun rememberFlyoutAvailableSpace(
    padding: Dp
): (anchorCoordinates: LayoutCoordinates) -> FlyoutAvailableSpace {
    val configuration = LocalConfiguration.current
    val view = LocalView.current
    val density = LocalDensity.current
    val verticalMargin = with(density) { padding.roundToPx() }
    return remember(configuration, view, density, verticalMargin) {
        { coordinates ->
            val viewPositionOnScreen = IntArray(2).also(view::getLocationOnScreen)
            val viewPositionInWindow = IntArray(2).also(view::getLocationInWindow)
            val windowOriginX = viewPositionOnScreen[0] - viewPositionInWindow[0]
            val windowOriginY = viewPositionOnScreen[1] - viewPositionInWindow[1]
            val windowBounds = android.graphics.Rect().let { rect ->
                view.getWindowVisibleDisplayFrame(rect)
                rect.offset(-windowOriginX, -windowOriginY)
                rect.toComposeRect()
            }
            val anchorBounds = Rect(coordinates.positionInWindow(), coordinates.size.toSize())
            val marginedWindowTop = windowBounds.top + verticalMargin
            val marginedWindowBottom = windowBounds.bottom - verticalMargin
            val availableWindowHeight =
                (marginedWindowBottom - marginedWindowTop).coerceAtLeast(0f)
            with(density) {
                FlyoutAvailableSpace(
                    above = (anchorBounds.top - marginedWindowTop)
                        .coerceIn(0f, availableWindowHeight).toDp(),
                    below = (marginedWindowBottom - anchorBounds.bottom)
                        .coerceIn(0f, availableWindowHeight).toDp(),
                    anchorHeight = anchorBounds.height.toDp()
                )
            }
        }
    }
}
