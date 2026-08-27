package io.github.composefluent.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

@Composable
internal fun rememberTeachingTipPositionProvider(
    visible: Boolean,
    target: Rect?,
    usesContainerTarget: Boolean,
    preferredPlacement: FlyoutPlacement,
    cornerRadius: Dp,
): TeachingTipPositionProvider {
    val density = LocalDensity.current
    val positionProvider = remember(target, usesContainerTarget, preferredPlacement, cornerRadius, density) {
        TeachingTipPositionProvider(
            density = density,
            target = target,
            usesContainerTarget = usesContainerTarget,
            preferredPlacement = preferredPlacement,
            cornerRadius = cornerRadius,
        )
    }
    SideEffect {
        positionProvider.updateVisibility(visible)
    }
    return positionProvider
}

@Stable
internal class TeachingTipPositionProvider(
    private val density: Density,
    private val target: Rect?,
    private val usesContainerTarget: Boolean,
    private val preferredPlacement: FlyoutPlacement,
    private val cornerRadius: Dp,
) : FlyoutPositionProvider(
    density = density,
    initialPlacement = preferredPlacement,
    paddingToAnchor = PaddingValues(0.dp),
    adaptivePlacement = true,
) {

    private var maximumPopupSize = IntSize.Zero
    private var lastPopupSize = IntSize.Zero
    private var lastMeasuredTailEdge = TeachingTipTailEdge.None
    private var wasVisible = false

    var tailEdge by mutableStateOf(TeachingTipTailEdge.None)
        private set

    var tailOffsetFraction by mutableStateOf(0.5f)
        private set

    var transformOrigin by mutableStateOf(TransformOrigin.Center)
        private set

    fun updateVisibility(visible: Boolean) {
        if (visible != wasVisible) {
            resetPopupSizeCache()
            wasVisible = visible
        }
    }

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize,
    ): IntOffset {
        applyAnimation = false

        val targetBounds = target ?: if (usesContainerTarget) {
            Rect(
                left = anchorBounds.left.toFloat(),
                top = anchorBounds.top.toFloat(),
                right = anchorBounds.right.toFloat(),
                bottom = anchorBounds.bottom.toFloat(),
            )
        } else {
            null
        }
        if (targetBounds == null) {
            targetPlacement = FlyoutPlacement.Full
            tailEdge = TeachingTipTailEdge.None
            tailOffsetFraction = 0.5f
            transformOrigin = TransformOrigin.Center
            applyAnimation = true
            return IntOffset(
                x = ((windowSize.width - popupContentSize.width) / 2).coerceAtLeast(0),
                y = ((windowSize.height - popupContentSize.height) / 2).coerceAtLeast(0),
            )
        }

        updatePopupSizeCache(popupContentSize)
        val tailLengthPx = with(density) { TeachingTipDefaults.TailLength.toPx() }
        val measuredBodySize = BodySize(
            width = (maximumPopupSize.width - tailLengthPx * 2f).coerceAtLeast(0f),
            height = (maximumPopupSize.height - tailLengthPx * 2f).coerceAtLeast(0f),
        )
        val actualBodySize = BodySize(
            width = (popupContentSize.width - tailLengthPx * 2f).coerceAtLeast(0f),
            height = (popupContentSize.height - tailLengthPx * 2f).coerceAtLeast(0f),
        )
        val candidates = placementOrder(preferredPlacement).map { placement ->
            placementCandidate(
                placement = placement,
                targetBounds = targetBounds,
                windowSize = windowSize,
                layoutDirection = layoutDirection,
                bodySize = measuredBodySize,
                tailLength = tailLengthPx,
            )
        }
        val windowMarginPx = with(density) { TeachingTipDefaults.WindowMargin.toPx() }
        val selected = candidates.firstOrNull {
            overflow(it.outerBounds, windowSize, windowMarginPx) == 0f
        } ?: candidates.minBy { overflow(it.outerBounds, windowSize, windowMarginPx) }

        val actualCandidate = placementCandidate(
            placement = selected.placement,
            targetBounds = targetBounds,
            windowSize = windowSize,
            layoutDirection = layoutDirection,
            bodySize = actualBodySize,
            tailLength = tailLengthPx,
        )
        val outerOffset = IntOffset(
            x = constrainToWindow(
                value = actualCandidate.outerBounds.left,
                contentSize = popupContentSize.width.toFloat(),
                windowSize = windowSize.width.toFloat(),
                margin = windowMarginPx,
            ).toInt(),
            y = constrainToWindow(
                value = actualCandidate.outerBounds.top,
                contentSize = popupContentSize.height.toFloat(),
                windowSize = windowSize.height.toFloat(),
                margin = windowMarginPx,
            ).toInt(),
        )
        val bodyBounds = Rect(
            left = outerOffset.x + tailLengthPx,
            top = outerOffset.y + tailLengthPx,
            right = outerOffset.x + tailLengthPx + actualBodySize.width,
            bottom = outerOffset.y + tailLengthPx + actualBodySize.height,
        )
        val tail = nearestTail(
            bodyBounds = bodyBounds,
            targetBounds = targetBounds,
            preferredEdge = selected.placement.tailEdge(layoutDirection),
            tailLength = tailLengthPx,
            tailWidth = with(density) { TeachingTipDefaults.TailWidth.toPx() },
            cornerRadius = with(density) { cornerRadius.toPx() },
        )

        targetPlacement = selected.placement
        tailEdge = tail.edge
        tailOffsetFraction = tail.offsetFraction
        val tailVertexX = when (tail.edge) {
            TeachingTipTailEdge.Top,
            TeachingTipTailEdge.Bottom -> tailLengthPx + actualBodySize.width * tail.offsetFraction

            TeachingTipTailEdge.Left -> 0f
            TeachingTipTailEdge.Right -> popupContentSize.width.toFloat()
            TeachingTipTailEdge.None -> popupContentSize.width / 2f
        }
        val tailVertexY = when (tail.edge) {
            TeachingTipTailEdge.Top -> 0f
            TeachingTipTailEdge.Bottom -> popupContentSize.height.toFloat()
            TeachingTipTailEdge.Left,
            TeachingTipTailEdge.Right -> tailLengthPx + actualBodySize.height * tail.offsetFraction

            TeachingTipTailEdge.None -> popupContentSize.height / 2f
        }
        transformOrigin = TransformOrigin(
            pivotFractionX = if (popupContentSize.width == 0) {
                0.5f
            } else {
                tailVertexX / popupContentSize.width.toFloat()
            },
            pivotFractionY = if (popupContentSize.height == 0) {
                0.5f
            } else {
                tailVertexY / popupContentSize.height.toFloat()
            },
        )
        applyAnimation = true
        return outerOffset
    }

    private fun updatePopupSizeCache(popupContentSize: IntSize) {
        val tailEdgeChanged = tailEdge != lastMeasuredTailEdge
        val popupSizeChanged = popupContentSize != lastPopupSize
        maximumPopupSize = if (
            maximumPopupSize == IntSize.Zero || (!tailEdgeChanged && popupSizeChanged)
        ) {
            popupContentSize
        } else {
            IntSize(
                width = maxOf(maximumPopupSize.width, popupContentSize.width),
                height = maxOf(maximumPopupSize.height, popupContentSize.height),
            )
        }
        lastPopupSize = popupContentSize
        lastMeasuredTailEdge = tailEdge
    }

    private fun resetPopupSizeCache() {
        maximumPopupSize = IntSize.Zero
        lastPopupSize = IntSize.Zero
        lastMeasuredTailEdge = tailEdge
    }

    private fun placementCandidate(
        placement: FlyoutPlacement,
        targetBounds: Rect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        bodySize: BodySize,
        tailLength: Float,
    ): PlacementCandidate {
        val targetCenter = targetBounds.center
        val centeredX = targetCenter.x - bodySize.width / 2f
        val centeredY = targetCenter.y - bodySize.height / 2f
        val alignedStartX = if (layoutDirection == LayoutDirection.Ltr) {
            targetBounds.left
        } else {
            targetBounds.right - bodySize.width
        }
        val alignedEndX = if (layoutDirection == LayoutDirection.Ltr) {
            targetBounds.right - bodySize.width
        } else {
            targetBounds.left
        }
        val startX = if (layoutDirection == LayoutDirection.Ltr) {
            targetBounds.left - tailLength - bodySize.width
        } else {
            targetBounds.right + tailLength
        }
        val endX = if (layoutDirection == LayoutDirection.Ltr) {
            targetBounds.right + tailLength
        } else {
            targetBounds.left - tailLength - bodySize.width
        }
        val topY = targetBounds.top - tailLength - bodySize.height
        val bottomY = targetBounds.bottom + tailLength

        val bodyOffset = when (placement) {
            FlyoutPlacement.Top -> Offset(centeredX, topY)
            FlyoutPlacement.TopAlignedStart -> Offset(alignedStartX, topY)
            FlyoutPlacement.TopAlignedEnd -> Offset(alignedEndX, topY)
            FlyoutPlacement.Bottom -> Offset(centeredX, bottomY)
            FlyoutPlacement.BottomAlignedStart -> Offset(alignedStartX, bottomY)
            FlyoutPlacement.BottomAlignedEnd -> Offset(alignedEndX, bottomY)
            FlyoutPlacement.Start -> Offset(startX, centeredY)
            FlyoutPlacement.StartAlignedTop -> Offset(startX, targetBounds.top)
            FlyoutPlacement.StartAlignedBottom -> Offset(startX, targetBounds.bottom - bodySize.height)
            FlyoutPlacement.End -> Offset(endX, centeredY)
            FlyoutPlacement.EndAlignedTop -> Offset(endX, targetBounds.top)
            FlyoutPlacement.EndAlignedBottom -> Offset(endX, targetBounds.bottom - bodySize.height)
            FlyoutPlacement.Full, FlyoutPlacement.Auto -> Offset(
                x = (windowSize.width - bodySize.width) / 2f,
                y = (windowSize.height - bodySize.height) / 2f,
            )
        }
        return PlacementCandidate(
            placement = placement,
            outerBounds = Rect(
                left = bodyOffset.x - tailLength,
                top = bodyOffset.y - tailLength,
                right = bodyOffset.x + bodySize.width + tailLength,
                bottom = bodyOffset.y + bodySize.height + tailLength,
            ),
        )
    }
}

internal enum class TeachingTipTailEdge {
    None,
    Top,
    Bottom,
    Left,
    Right,
}

private data class BodySize(
    val width: Float,
    val height: Float,
)

private data class PlacementCandidate(
    val placement: FlyoutPlacement,
    val outerBounds: Rect,
)

private data class TeachingTipTail(
    val edge: TeachingTipTailEdge,
    val offsetFraction: Float,
)

private fun placementOrder(preferredPlacement: FlyoutPlacement): List<FlyoutPlacement> {
    val top = listOf(
        FlyoutPlacement.Top,
        FlyoutPlacement.TopAlignedStart,
        FlyoutPlacement.TopAlignedEnd,
    )
    val bottom = listOf(
        FlyoutPlacement.Bottom,
        FlyoutPlacement.BottomAlignedStart,
        FlyoutPlacement.BottomAlignedEnd,
    )
    val start = listOf(
        FlyoutPlacement.Start,
        FlyoutPlacement.StartAlignedTop,
        FlyoutPlacement.StartAlignedBottom,
    )
    val end = listOf(
        FlyoutPlacement.End,
        FlyoutPlacement.EndAlignedTop,
        FlyoutPlacement.EndAlignedBottom,
    )
    val fallback = when (preferredPlacement) {
        in top -> top + bottom + end + start
        in bottom -> bottom + top + end + start
        in start -> start + end + top + bottom
        in end -> end + start + top + bottom
        else -> top + bottom + end + start
    } + FlyoutPlacement.Full
    return if (preferredPlacement == FlyoutPlacement.Auto) {
        fallback
    } else {
        listOf(preferredPlacement) + fallback.filterNot { it == preferredPlacement }
    }
}

private fun overflow(bounds: Rect, windowSize: IntSize, margin: Float): Float {
    val effectiveMarginX = margin.coerceAtMost(windowSize.width / 2f)
    val effectiveMarginY = margin.coerceAtMost(windowSize.height / 2f)
    return (effectiveMarginX - bounds.left).coerceAtLeast(0f) +
            (effectiveMarginY - bounds.top).coerceAtLeast(0f) +
            (bounds.right - windowSize.width + effectiveMarginX).coerceAtLeast(0f) +
            (bounds.bottom - windowSize.height + effectiveMarginY).coerceAtLeast(0f)
}

private fun constrainToWindow(
    value: Float,
    contentSize: Float,
    windowSize: Float,
    margin: Float,
): Float {
    val effectiveMargin = margin.coerceAtMost(windowSize / 2f)
    val max = windowSize - effectiveMargin - contentSize
    return if (max >= effectiveMargin) {
        value.coerceIn(effectiveMargin, max)
    } else {
        (windowSize - contentSize) / 2f
    }
}

private fun nearestTail(
    bodyBounds: Rect,
    targetBounds: Rect,
    preferredEdge: TeachingTipTailEdge,
    tailLength: Float,
    tailWidth: Float,
    cornerRadius: Float,
): TeachingTipTail {
    val safeInset = cornerRadius + tailWidth / 2f
    val targetCenter = targetBounds.center
    val horizontalPosition = constrainTailPosition(
        value = targetCenter.x,
        min = bodyBounds.left + safeInset,
        max = bodyBounds.right - safeInset,
    )
    val verticalPosition = constrainTailPosition(
        value = targetCenter.y,
        min = bodyBounds.top + safeInset,
        max = bodyBounds.bottom - safeInset,
    )
    val points = mapOf(
        TeachingTipTailEdge.Top to Offset(horizontalPosition, bodyBounds.top - tailLength),
        TeachingTipTailEdge.Bottom to Offset(horizontalPosition, bodyBounds.bottom + tailLength),
        TeachingTipTailEdge.Left to Offset(bodyBounds.left - tailLength, verticalPosition),
        TeachingTipTailEdge.Right to Offset(bodyBounds.right + tailLength, verticalPosition),
    )
    val edgeOrder = listOf(preferredEdge) + points.keys.filterNot { it == preferredEdge }
    val edge = edgeOrder.filter { it != TeachingTipTailEdge.None }.minBy { candidate ->
        distanceSquared(points.getValue(candidate), targetBounds)
    }
    val point = points.getValue(edge)
    val fraction = when (edge) {
        TeachingTipTailEdge.Top, TeachingTipTailEdge.Bottom -> {
            if (bodyBounds.width == 0f) 0.5f else (point.x - bodyBounds.left) / bodyBounds.width
        }

        TeachingTipTailEdge.Left, TeachingTipTailEdge.Right -> {
            if (bodyBounds.height == 0f) 0.5f else (point.y - bodyBounds.top) / bodyBounds.height
        }

        TeachingTipTailEdge.None -> 0.5f
    }
    return TeachingTipTail(edge, fraction.coerceIn(0f, 1f))
}

private fun constrainTailPosition(value: Float, min: Float, max: Float): Float {
    return if (max >= min) value.coerceIn(min, max) else (min + max) / 2f
}

private fun distanceSquared(point: Offset, bounds: Rect): Float {
    val horizontalDistance = when {
        point.x < bounds.left -> bounds.left - point.x
        point.x > bounds.right -> point.x - bounds.right
        else -> 0f
    }
    val verticalDistance = when {
        point.y < bounds.top -> bounds.top - point.y
        point.y > bounds.bottom -> point.y - bounds.bottom
        else -> 0f
    }
    return horizontalDistance * horizontalDistance + verticalDistance * verticalDistance
}

private fun FlyoutPlacement.tailEdge(layoutDirection: LayoutDirection): TeachingTipTailEdge {
    return when (this) {
        FlyoutPlacement.Top,
        FlyoutPlacement.TopAlignedStart,
        FlyoutPlacement.TopAlignedEnd -> TeachingTipTailEdge.Bottom

        FlyoutPlacement.Bottom,
        FlyoutPlacement.BottomAlignedStart,
        FlyoutPlacement.BottomAlignedEnd -> TeachingTipTailEdge.Top

        FlyoutPlacement.Start,
        FlyoutPlacement.StartAlignedTop,
        FlyoutPlacement.StartAlignedBottom -> {
            if (layoutDirection == LayoutDirection.Ltr) TeachingTipTailEdge.Right else TeachingTipTailEdge.Left
        }

        FlyoutPlacement.End,
        FlyoutPlacement.EndAlignedTop,
        FlyoutPlacement.EndAlignedBottom -> {
            if (layoutDirection == LayoutDirection.Ltr) TeachingTipTailEdge.Left else TeachingTipTailEdge.Right
        }

        FlyoutPlacement.Auto,
        FlyoutPlacement.Full -> TeachingTipTailEdge.None
    }
}
