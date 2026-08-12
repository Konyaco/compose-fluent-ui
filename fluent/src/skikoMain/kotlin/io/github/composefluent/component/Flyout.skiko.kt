package io.github.composefluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.Dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal actual fun rememberFlyoutAvailableSpace(
    padding: Dp
): (anchorCoordinates: LayoutCoordinates) -> FlyoutAvailableSpace {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current
    val verticalMargin = with(density) { padding.roundToPx() }
    return remember(windowInfo, density, verticalMargin) {
        { coordinates ->
            val anchorBounds = coordinates.boundsInWindow()
            val marginedWindowTop = verticalMargin.toFloat()
            val marginedWindowBottom = windowInfo.containerSize.height - verticalMargin.toFloat()
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
