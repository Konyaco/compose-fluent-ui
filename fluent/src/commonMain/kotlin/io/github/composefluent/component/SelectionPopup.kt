package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.ElevationDefaults
import kotlin.math.abs
import kotlin.math.max

internal enum class SelectionPopupPlacement {
    Overlap,
    Above,
    Below
}

internal enum class SelectionPopupFallback {
    Clamp,
    Directional
}

@Stable
internal data class SelectionPopupPosition(
    val offset: IntOffset,
    val revealOriginY: Int,
    val placement: SelectionPopupPlacement
)

internal fun selectionPopupVerticalRange(
    windowHeight: Int,
    popupHeight: Int,
    preferredPadding: Int
): IntRange {
    val availablePosition = (windowHeight - popupHeight).coerceAtLeast(0)
    val windowPadding = preferredPadding.coerceAtMost(availablePosition / 2)
    return windowPadding..(availablePosition - windowPadding)
}

internal fun calculateSelectionPopupPosition(
    anchorBounds: IntRect,
    windowSize: IntSize,
    popupContentSize: IntSize,
    selectedCenterY: Int,
    windowPadding: Int,
    anchorPadding: Int = 0,
    fallback: SelectionPopupFallback = SelectionPopupFallback.Directional
): SelectionPopupPosition {
    val verticalRange = selectionPopupVerticalRange(
        windowHeight = windowSize.height,
        popupHeight = popupContentSize.height,
        preferredPadding = windowPadding
    )
    val overlapY = anchorBounds.center.y - selectedCenterY
    val overlapFits = overlapY in verticalRange

    val placement = when {
        overlapFits || fallback == SelectionPopupFallback.Clamp -> SelectionPopupPlacement.Overlap
        else -> {
            val availableAbove = anchorBounds.top - windowPadding - anchorPadding
            val availableBelow = windowSize.height - windowPadding - anchorBounds.bottom - anchorPadding
            val fitsAbove = availableAbove >= popupContentSize.height
            val fitsBelow = availableBelow >= popupContentSize.height
            when {
                fitsAbove && fitsBelow -> {
                    if (availableAbove >= availableBelow) SelectionPopupPlacement.Above
                    else SelectionPopupPlacement.Below
                }

                fitsAbove -> SelectionPopupPlacement.Above
                fitsBelow -> SelectionPopupPlacement.Below
                availableAbove >= availableBelow -> SelectionPopupPlacement.Above
                else -> SelectionPopupPlacement.Below
            }
        }
    }

    val popupY = when (placement) {
        SelectionPopupPlacement.Overlap -> overlapY.coerceIn(verticalRange)
        SelectionPopupPlacement.Above -> {
            (anchorBounds.top - anchorPadding - popupContentSize.height).coerceIn(verticalRange)
        }

        SelectionPopupPlacement.Below -> {
            (anchorBounds.bottom + anchorPadding).coerceIn(verticalRange)
        }
    }
    val popupX = (anchorBounds.center.x - popupContentSize.width / 2).let { idealX ->
        if (popupContentSize.width >= windowSize.width) 0
        else idealX.coerceIn(0, windowSize.width - popupContentSize.width)
    }

    return SelectionPopupPosition(
        offset = IntOffset(popupX, popupY),
        revealOriginY = (anchorBounds.center.y - popupY).coerceIn(0, popupContentSize.height),
        placement = placement
    )
}

@Composable
internal fun SelectionPopupSurface(
    expanded: Boolean,
    positionProvider: FlyoutPositionProvider,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.overlay,
    contentPadding: PaddingValues = PaddingValues(),
    initialElevation: Dp = 1.dp,
    revealOriginY: () -> Int = { 0 },
    placement: () -> SelectionPopupPlacement = { SelectionPopupPlacement.Overlap },
    content: @Composable () -> Unit
) {
    if (!expanded) return

    val revealProgress = remember(positionProvider) { Animatable(0f) }
    val shadowElevationProgress = remember(positionProvider) { Animatable(0f) }

    LaunchedEffect(positionProvider.applyAnimation) {
        if (positionProvider.applyAnimation) {
            revealProgress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing
                )
            )
            shadowElevationProgress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = FluentDuration.LongDuration,
                    easing = FluentEasing.PointToPointEasing
                )
            )
        }
    }

    BasicFlyout(
        visible = true,
        onDismissRequest = onDismissRequest,
        modifier = modifier.drawWithContent {
            val progress = revealProgress.value
            if (progress < 1f) {
                when (placement()) {
                    SelectionPopupPlacement.Overlap -> {
                        val origin = revealOriginY().toFloat().coerceIn(0f, size.height)
                        val offsetFromCenter = abs(origin - size.height / 2f)
                        val initialHalfHeight = max(size.height / 4f, offsetFromCenter)
                        val finalHalfHeight = max(origin, size.height - origin)
                        val halfHeight = initialHalfHeight +
                            (finalHalfHeight - initialHalfHeight) * progress
                        clipRect(
                            left = -size.width,
                            top = (origin - halfHeight).coerceAtLeast(0f),
                            right = size.width * 2f,
                            bottom = (origin + halfHeight).coerceAtMost(size.height)
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }

                    SelectionPopupPlacement.Above -> {
                        clipRect(
                            left = -size.width,
                            top = size.height * (1f - progress),
                            right = size.width * 2f,
                            bottom = size.height
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }

                    SelectionPopupPlacement.Below -> {
                        clipRect(
                            left = -size.width,
                            top = 0f,
                            right = size.width * 2f,
                            bottom = size.height * progress
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }
                }
            } else {
                drawContent()
            }
        },
        enterPlacementAnimation = { EnterTransition.None },
        exitTransition = ExitTransition.None,
        shape = shape,
        contentPadding = contentPadding,
        positionProvider = positionProvider,
        elevation = initialElevation +
            (ElevationDefaults.flyout - initialElevation) * shadowElevationProgress.value
    ) {
        content()
    }
}
