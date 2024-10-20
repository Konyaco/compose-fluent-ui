package com.konyaco.fluent.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.PopupPositionProvider

@Composable
fun rememberFlyoutPositionProvider(
    initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    paddingToAnchor: PaddingValues = PaddingValues(flyoutDefaultPadding),
    adaptivePlacement: Boolean = false
): FlyoutPositionProvider {
    val density = LocalDensity.current
    return remember(initialPlacement, density, paddingToAnchor, adaptivePlacement) {
        FlyoutPositionProvider(density, initialPlacement, paddingToAnchor, adaptivePlacement)
    }
}

@Stable
open class FlyoutPositionProvider(
    private val density: Density,
    private val initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    private val paddingToAnchor: PaddingValues = PaddingValues(flyoutDefaultPadding),
    private val adaptivePlacement: Boolean = false,
) : PopupPositionProvider {

    var applyAnimation by mutableStateOf(false)
        private set

    var targetPlacement by mutableStateOf(initialPlacement)
        private set

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        applyAnimation = false
        with(density) {
            val popupPadding = flyoutPopPaddingFixShadowRender.toPx()
            val popupActualSize = Size(
                popupContentSize.width - popupPadding * 2,
                popupContentSize.height - popupPadding * 2
            )
            var (horizontalPlacement, verticalPlacement) = transformPlacement(initialPlacement)
            targetPlacement = when {
                initialPlacement != FlyoutPlacement.Auto && !adaptivePlacement -> initialPlacement

                initialPlacement != FlyoutPlacement.Auto && adaptivePlacement -> {
                    val (hasHorizontalSpace, hasVerticalSpace) = hasSpaceForTargetPlacement(
                        horizontalPlacement,
                        verticalPlacement,
                        layoutDirection,
                        popupActualSize,
                        anchorBounds,
                        windowSize
                    )
                    when {
                        hasHorizontalSpace && hasVerticalSpace -> initialPlacement
                        hasHorizontalSpace -> transformPlacement(
                            horizontalPlacement,
                            calculateTopOrBottomPlacement(
                                anchorBounds, windowSize, popupActualSize
                            ).apply {
                                verticalPlacement = this
                            }
                        )

                        hasVerticalSpace -> transformPlacement(
                            calculateStartOrEndPlacement(
                                anchorBounds, windowSize, layoutDirection, popupActualSize
                            ).apply {
                                horizontalPlacement = this
                            },
                            verticalPlacement
                        )

                        else -> {
                            val (targetHorizontalPlacement, targetVerticalPlacement) = calculateTargetPlacement(
                                anchorBounds,
                                windowSize,
                                layoutDirection,
                                popupActualSize
                            )
                            horizontalPlacement = targetHorizontalPlacement
                            verticalPlacement = targetVerticalPlacement
                            transformPlacement(horizontalPlacement, verticalPlacement)
                        }
                    }
                }

                else -> {
                    val (targetHorizontalPlacement, targetVerticalPlacement) = calculateTargetPlacement(
                        anchorBounds,
                        windowSize,
                        layoutDirection,
                        popupActualSize
                    )
                    horizontalPlacement = targetHorizontalPlacement
                    verticalPlacement = targetVerticalPlacement
                    transformPlacement(horizontalPlacement, verticalPlacement)
                }
            }
            applyAnimation = true
            if (targetPlacement == FlyoutPlacement.Full) {
                return IntOffset(
                    (windowSize.width - popupContentSize.width) / 2,
                    (windowSize.height - popupContentSize.height) / 2
                )
            }
            val popupActualCenter = popupActualSize.center
            val anchorCenter = anchorBounds.center
            return IntOffset(
                x = (getOffsetX(
                    horizontalPlacement,
                    layoutDirection,
                    anchorBounds,
                    anchorCenter,
                    popupActualSize,
                    popupActualCenter,
                    windowSize
                ) - popupPadding).toInt(),
                y = (getOffsetY(
                    verticalPlacement,
                    anchorBounds,
                    anchorCenter,
                    popupActualSize,
                    popupActualCenter,
                    windowSize
                ) - popupPadding).toInt()
            )
        }
    }

    private fun Density.getOffsetX(
        placement: HorizontalPlacement,
        layoutDirection: LayoutDirection,
        anchorBounds: IntRect,
        anchorCenter: IntOffset,
        popupContentSize: Size,
        popupContentCenter: Offset,
        windowSize: IntSize
    ): Float {
        val isLTR = layoutDirection == LayoutDirection.Ltr
        return if (isLTR) {
            when (placement) {
                HorizontalPlacement.Start -> anchorBounds.left - popupContentSize.width - paddingToAnchor.calculateLeftPadding(
                    layoutDirection
                ).toPx()

                HorizontalPlacement.End -> anchorBounds.right + paddingToAnchor.calculateRightPadding(
                    layoutDirection
                ).toPx()

                HorizontalPlacement.Center -> anchorCenter.x - popupContentCenter.x
                HorizontalPlacement.AlignedStart -> anchorBounds.left.toFloat()
                HorizontalPlacement.AlignedEnd -> anchorBounds.right - popupContentSize.width
                else -> windowSize.center.x - popupContentCenter.x
            }
        } else {
            when (placement) {
                HorizontalPlacement.End -> anchorBounds.left - popupContentSize.width - paddingToAnchor.calculateLeftPadding(
                    layoutDirection
                ).toPx()

                HorizontalPlacement.Start -> anchorBounds.right + paddingToAnchor.calculateRightPadding(
                    layoutDirection
                ).toPx()

                HorizontalPlacement.Center -> anchorCenter.x - popupContentCenter.x
                HorizontalPlacement.AlignedEnd -> anchorBounds.left.toFloat()
                HorizontalPlacement.AlignedStart -> anchorBounds.right - popupContentSize.width
                else -> windowSize.center.x - popupContentCenter.x
            }
        }
    }

    private fun Density.getOffsetY(
        placement: VerticalPlacement,
        anchorBounds: IntRect,
        anchorCenter: IntOffset,
        popupContentSize: Size,
        popupContentCenter: Offset,
        windowSize: IntSize
    ): Float {
        return when (placement) {
            VerticalPlacement.Top -> (anchorBounds.top - popupContentSize.height - paddingToAnchor.calculateTopPadding()
                .toPx())

            VerticalPlacement.Center -> anchorCenter.y - popupContentCenter.y
            VerticalPlacement.Bottom -> anchorBounds.bottom + paddingToAnchor.calculateBottomPadding()
                .toPx()

            VerticalPlacement.AlignedTop -> anchorBounds.top.toFloat()
            VerticalPlacement.AlignedBottom -> anchorBounds.bottom - popupContentSize.height
            else -> windowSize.center.y - popupContentCenter.y
        }
    }

    private fun hasSpaceForTargetPlacement(
        horizontalPlacement: HorizontalPlacement,
        verticalPlacement: VerticalPlacement,
        layoutDirection: LayoutDirection,
        popupContentSize: Size,
        anchorBounds: IntRect,
        windowSize: IntSize
    ): Pair<Boolean, Boolean> {
        with(density) {
            val hasVertical = when (verticalPlacement) {
                VerticalPlacement.Top -> popupContentSize.height + paddingToAnchor.calculateTopPadding()
                    .toPx() >= anchorBounds.top

                VerticalPlacement.AlignedTop -> windowSize.height >= anchorBounds.top + paddingToAnchor.calculateTopPadding()
                    .toPx() + popupContentSize.height

                VerticalPlacement.Bottom -> windowSize.height >= anchorBounds.bottom + paddingToAnchor.calculateBottomPadding()
                    .toPx() + popupContentSize.height

                VerticalPlacement.AlignedBottom -> anchorBounds.bottom >= popupContentSize.height + paddingToAnchor.calculateBottomPadding()
                    .toPx()

                VerticalPlacement.Center -> {
                    val center = anchorBounds.center
                    val halfHeight = popupContentSize.height / 2
                    windowSize.height >= center.y + halfHeight && center.y - halfHeight >= 0
                }

                else -> false
            }
            val isLrt = layoutDirection == LayoutDirection.Ltr
            val hasHorizontal = when {
                (isLrt && horizontalPlacement == HorizontalPlacement.Start) || (!isLrt && horizontalPlacement == HorizontalPlacement.End) -> {
                    anchorBounds.left >= popupContentSize.width + paddingToAnchor.calculateLeftPadding(layoutDirection)
                        .toPx()
                }

                (!isLrt && horizontalPlacement == HorizontalPlacement.Start) || (isLrt && horizontalPlacement == HorizontalPlacement.End)
                -> {
                    windowSize.width >= anchorBounds.right + paddingToAnchor.calculateRightPadding(layoutDirection)
                        .toPx()
                }

                (isLrt && horizontalPlacement == HorizontalPlacement.AlignedStart) || (!isLrt && horizontalPlacement == HorizontalPlacement.AlignedEnd) -> {
                    windowSize.width >= anchorBounds.left + paddingToAnchor.calculateLeftPadding(layoutDirection)
                        .toPx() + popupContentSize.width
                }

                (!isLrt && horizontalPlacement == HorizontalPlacement.AlignedStart) || (isLrt && horizontalPlacement == HorizontalPlacement.AlignedEnd)
                -> {
                    anchorBounds.right - paddingToAnchor.calculateRightPadding(layoutDirection)
                        .toPx() - popupContentSize.width >= 0
                }

                horizontalPlacement == HorizontalPlacement.Center -> {
                    val center = anchorBounds.center
                    val halfWidth = popupContentSize.width / 2
                    windowSize.width >= center.x + halfWidth && center.x - halfWidth >= 0
                }

                else -> false
            }
            return hasHorizontal to hasVertical
        }
    }

    protected open fun Density.calculateTargetPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        return calculatePlacementByVertical(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        )
    }

    private fun Density.calculatePlacementByVertical(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        val hasTopSpace = anchorBounds.top - paddingToAnchor.calculateTopPadding()
            .toPx() >= popupContentSize.height
        val hasBottomSpace = (windowSize.height - anchorBounds.bottom) - paddingToAnchor.calculateBottomPadding()
            .toPx() >= popupContentSize.height

        if (hasTopSpace) {
            return calculateAlignedStartOrEndOrCenter(
                anchorBounds,
                windowSize,
                layoutDirection,
                popupContentSize
            ) to VerticalPlacement.Top
        }
        if (hasBottomSpace) {
            return calculateAlignedStartOrEndOrCenter(
                anchorBounds,
                windowSize,
                layoutDirection,
                popupContentSize
            ) to VerticalPlacement.Bottom
        }
        return calculateAlignedStartOrEndOrCenter(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        ) to calculateTopOrBottomPlacement(anchorBounds, windowSize, popupContentSize)
    }

    private fun calculateTopOrBottomPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        popupContentSize: Size
    ): VerticalPlacement {
        return with(density) {
            val hasTopSpace = anchorBounds.top - paddingToAnchor.calculateTopPadding()
                .toPx() >= popupContentSize.height
            val hasBottomSpace = (windowSize.height - anchorBounds.bottom) - paddingToAnchor.calculateBottomPadding()
                .toPx() >= popupContentSize.height
            when {
                hasTopSpace -> VerticalPlacement.Top
                hasBottomSpace -> VerticalPlacement.Bottom
                else -> VerticalPlacement.Top
            }
        }
    }

    private fun calculateAlignedStartOrEndOrCenter(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): HorizontalPlacement {
        val halfContentWidth = popupContentSize.width / 2f
        val center = anchorBounds.center
        val hasLeftSpace = center.x >= halfContentWidth
        val hasRightSpace = windowSize.width - center.x >= halfContentWidth
        return when {
            hasRightSpace && hasLeftSpace -> HorizontalPlacement.Center
            (hasLeftSpace && layoutDirection == LayoutDirection.Ltr) or
                    (hasRightSpace && layoutDirection == LayoutDirection.Rtl) -> HorizontalPlacement.Start

            hasRightSpace -> HorizontalPlacement.Center
            hasLeftSpace -> HorizontalPlacement.End
            else -> HorizontalPlacement.None
        }
    }

    private fun calculateStartOrEndPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): HorizontalPlacement {
        with(density) {
            val isLRT = layoutDirection == LayoutDirection.Ltr
            val halfContentWidth = popupContentSize.width / 2f
            val center = anchorBounds.center
            val hasLeftSpace =
                center.x >= halfContentWidth + paddingToAnchor.calculateLeftPadding(layoutDirection)
                    .toPx()
            val hasRightSpace =
                windowSize.width - center.x >= halfContentWidth + paddingToAnchor.calculateRightPadding(
                    layoutDirection
                ).toPx()

            return when {
                hasRightSpace -> {
                    if (isLRT) {
                        HorizontalPlacement.End
                    } else {
                        HorizontalPlacement.Start
                    }
                }

                hasLeftSpace -> {
                    if (isLRT) {
                        HorizontalPlacement.Start
                    } else {
                        HorizontalPlacement.End
                    }
                }

                else -> HorizontalPlacement.End
            }
        }

    }

    protected fun calculatePlacementByHorizontal(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        val center = anchorBounds.center
        return calculateStartOrEndPlacement(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        ) to calculateAlignedTopOrBottomOrCenter(
            anchorBounds,
            windowSize,
            center,
            popupContentSize
        )
    }

    private fun calculateAlignedTopOrBottomOrCenter(
        anchorBounds: IntRect,
        windowSize: IntSize,
        anchorCenter: IntOffset,
        popupContentSize: Size
    ): VerticalPlacement {
        val halfContentHeight = popupContentSize.height / 2f
        val hasAlignedTopSpace = windowSize.height - anchorBounds.top >= popupContentSize.height
        val hasAlignedBottomSpace = anchorBounds.bottom >= popupContentSize.height
        if (hasAlignedTopSpace) {
            return VerticalPlacement.AlignedTop
        }
        if (hasAlignedBottomSpace) {
            return VerticalPlacement.AlignedBottom
        }
        if (anchorCenter.y - halfContentHeight > 0) {
            return VerticalPlacement.Center
        }
        return VerticalPlacement.None
    }

    private fun transformPlacement(
        horizontalPlacement: HorizontalPlacement,
        verticalPlacement: VerticalPlacement
    ): FlyoutPlacement {
        return when (horizontalPlacement) {
            HorizontalPlacement.Start -> {
                when (verticalPlacement) {
                    VerticalPlacement.AlignedTop -> FlyoutPlacement.StartAlignedTop
                    VerticalPlacement.AlignedBottom -> FlyoutPlacement.StartAlignedBottom
                    else -> FlyoutPlacement.Start
                }
            }

            HorizontalPlacement.End -> {
                when (verticalPlacement) {
                    VerticalPlacement.AlignedTop -> FlyoutPlacement.EndAlignedTop
                    VerticalPlacement.AlignedBottom -> FlyoutPlacement.EndAlignedBottom
                    else -> FlyoutPlacement.End
                }
            }

            HorizontalPlacement.Center -> {
                when (verticalPlacement) {
                    VerticalPlacement.Top -> FlyoutPlacement.Top
                    VerticalPlacement.Bottom -> FlyoutPlacement.Bottom
                    else -> FlyoutPlacement.Full
                }
            }

            HorizontalPlacement.AlignedStart -> {
                when (verticalPlacement) {
                    VerticalPlacement.Top -> FlyoutPlacement.TopAlignedStart
                    VerticalPlacement.Bottom -> FlyoutPlacement.BottomAlignedStart
                    else -> FlyoutPlacement.Full
                }
            }

            HorizontalPlacement.AlignedEnd -> {
                when (verticalPlacement) {
                    VerticalPlacement.Top -> FlyoutPlacement.TopAlignedEnd
                    VerticalPlacement.Bottom -> FlyoutPlacement.BottomAlignedEnd
                    else -> FlyoutPlacement.Full
                }
            }

            else -> FlyoutPlacement.Full
        }
    }

    private fun transformPlacement(flyoutPlacement: FlyoutPlacement): Pair<HorizontalPlacement, VerticalPlacement> {
        return when (flyoutPlacement) {
            FlyoutPlacement.Top -> HorizontalPlacement.Center to VerticalPlacement.Top
            FlyoutPlacement.Bottom -> HorizontalPlacement.Center to VerticalPlacement.Bottom
            FlyoutPlacement.Start -> HorizontalPlacement.Start to VerticalPlacement.Center
            FlyoutPlacement.End -> HorizontalPlacement.End to VerticalPlacement.Center
            FlyoutPlacement.TopAlignedStart -> HorizontalPlacement.AlignedStart to VerticalPlacement.Top
            FlyoutPlacement.TopAlignedEnd -> HorizontalPlacement.AlignedEnd to VerticalPlacement.Top
            FlyoutPlacement.BottomAlignedStart -> HorizontalPlacement.AlignedStart to VerticalPlacement.Bottom
            FlyoutPlacement.BottomAlignedEnd -> HorizontalPlacement.AlignedEnd to VerticalPlacement.Bottom
            FlyoutPlacement.StartAlignedTop -> HorizontalPlacement.Start to VerticalPlacement.AlignedTop
            FlyoutPlacement.StartAlignedBottom -> HorizontalPlacement.Start to VerticalPlacement.AlignedBottom
            FlyoutPlacement.EndAlignedTop -> HorizontalPlacement.End to VerticalPlacement.AlignedTop
            FlyoutPlacement.EndAlignedBottom -> HorizontalPlacement.End to VerticalPlacement.AlignedBottom
            FlyoutPlacement.Full -> HorizontalPlacement.Center to VerticalPlacement.Center
            else -> HorizontalPlacement.None to VerticalPlacement.None
        }
    }

    @JvmInline
    protected value class HorizontalPlacement(
        private val value: Int
    ) {
        companion object {
            val Start = HorizontalPlacement(0)
            val Center = HorizontalPlacement(1)
            val End = HorizontalPlacement(2)
            val None = HorizontalPlacement(-1)
            val AlignedStart = HorizontalPlacement(3)
            val AlignedEnd = HorizontalPlacement(4)
        }
    }

    @JvmInline
    protected value class VerticalPlacement(
        private val value: Int
    ) {
        companion object {
            val Top = VerticalPlacement(0)
            val Center = VerticalPlacement(1)
            val Bottom = VerticalPlacement(2)
            val AlignedTop = VerticalPlacement(3)
            val AlignedBottom = VerticalPlacement(4)
            val None = VerticalPlacement(-1)
        }
    }
}