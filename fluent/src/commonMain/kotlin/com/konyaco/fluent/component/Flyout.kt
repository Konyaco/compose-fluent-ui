package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica

@Composable
fun FlyoutContainer(
    flyout: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    content: @Composable FlyoutScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            Flyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                placement = placement,
                content = flyout
            )
        },
        content = content,
        modifier = modifier,
        initialVisible = initialVisible
    )
}

@Composable
internal fun BasicFlyoutContainer(
    flyout: @Composable FlyoutScope.() -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    content: @Composable FlyoutScope.() -> Unit
) {
    val flyoutState = remember(initialVisible) {
        mutableStateOf(initialVisible)
    }
    val flyoutScope = remember(flyoutState) {
        FlyoutScopeImpl(flyoutState)
    }
    Box(modifier = modifier) {
        flyoutScope.content()
        flyoutScope.flyout()
    }
}

enum class FlyoutPlacement {
    Auto,
    Full,
    Start,
    StartAlignedTop,
    StartAlignedBottom,
    Top,
    TopAlignedStart,
    TopAlignedEnd,
    End,
    EndAlignedTop,
    EndAlignedBottom,
    Bottom,
    BottomAlignedStart,
    BottomAlignedEnd
}

@Composable
fun Flyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    shape: Shape = RoundedCornerShape(8.dp),
    content: @Composable () -> Unit
) {
    BasicFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        positionProvider = rememberFlyoutPositionProvider(initialPlacement = placement),
        shape = shape,
        content = content
    )
}

@Composable
internal fun BasicFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    enterPlacementAnimation: (placement: FlyoutPlacement) -> EnterTransition = ::defaultFlyoutEnterPlacementAnimation,
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(12.dp),
    positionProvider: FlyoutPositionProvider = rememberFlyoutPositionProvider(),
    content: @Composable () -> Unit
) {
    val visibleState = remember {
        MutableTransitionState(false)
    }
    visibleState.targetState = visible
    if (visibleState.currentState || visibleState.targetState) {
        Popup(
            onDismissRequest = onDismissRequest,
            properties = PopupProperties(clippingEnabled = false),
            popupPositionProvider = positionProvider,
        ) {
            if (positionProvider.applyAnimation) {
                FlyoutContent(
                    modifier = modifier,
                    visibleState = visibleState,
                    placement = positionProvider.targetPlacement,
                    shape = shape,
                    content = content,
                    contentPadding = contentPadding,
                    enterPlacementAnimation = enterPlacementAnimation
                )
            } else {
                /* this is the workaround for placement animation */
                Box(
                    Modifier.alpha(0f)
                        .padding(contentPadding)
                        .padding(flyoutPopPaddingFixShadowRender)
                ) {
                    content()
                }
            }
        }
    }
}

@Composable
internal fun FlyoutContent(
    visibleState: MutableTransitionState<Boolean>,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    enterPlacementAnimation: (placement: FlyoutPlacement) -> EnterTransition = ::defaultFlyoutEnterPlacementAnimation,
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {

    AnimatedVisibility(
        visibleState = visibleState,
        enter = enterPlacementAnimation(placement),
        exit = fadeOut(flyoutExitSpec())
    ) {
        Mica(
            modifier = modifier.padding(flyoutPopPaddingFixShadowRender).graphicsLayer {
                shadowElevation = 8.dp.toPx()
                this.shape = shape
                clip = true
            }
        ) {
            Layer(shape = shape) {
                Box(modifier = Modifier.padding(contentPadding)) {
                    content()
                }
            }
        }
    }
}

@Composable
internal fun rememberFlyoutPositionProvider(
    initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    paddingToAnchor: PaddingValues = PaddingValues(flyoutDefaultPadding)
): FlyoutPositionProvider {
    val density = LocalDensity.current
    return remember(initialPlacement, density, paddingToAnchor) {
        FlyoutPositionProvider(density, initialPlacement, paddingToAnchor)
    }
}

@Stable
internal open class FlyoutPositionProvider(
    private val density: Density,
    private val initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    private val paddingToAnchor: PaddingValues = PaddingValues(flyoutDefaultPadding),
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
            val horizontalPlacement: HorizontalPlacement
            val verticalPlacement: VerticalPlacement

            targetPlacement = if (initialPlacement != FlyoutPlacement.Auto) {
                initialPlacement.apply {
                    val (targetHorizontalPlacement, targetVerticalPlacement) = transformPlacement(
                        initialPlacement
                    )
                    horizontalPlacement = targetHorizontalPlacement
                    verticalPlacement = targetVerticalPlacement
                }
            } else {
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
            applyAnimation = true
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

    protected open fun Density.calculateTargetPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        return calculateVerticalPlacement(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        )
    }

    private fun Density.calculateVerticalPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        val hasTopSpace = anchorBounds.top - paddingToAnchor.calculateTopPadding()
            .toPx() >= popupContentSize.height
        val halfContentWidth = popupContentSize.width / 2f
        val center = anchorBounds.center

        fun calculateStartOrEndOrCenter(): HorizontalPlacement {
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

        if (hasTopSpace) {
            return calculateStartOrEndOrCenter() to VerticalPlacement.Top
        }
        val hasBottomSpace = anchorBounds.bottom - paddingToAnchor.calculateBottomPadding()
            .toPx() >= popupContentSize.height

        if (hasBottomSpace) {
            return calculateStartOrEndOrCenter() to VerticalPlacement.Bottom
        }
        return HorizontalPlacement.Center to VerticalPlacement.Top
    }

    protected fun Density.calculateHorizontalPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        val isLRT = layoutDirection == LayoutDirection.Ltr
        val halfContentWidth = popupContentSize.width / 2f
        val halfContentHeight = popupContentSize.height / 2f
        val center = anchorBounds.center
        val hasLeftSpace =
            center.x >= halfContentWidth + paddingToAnchor.calculateLeftPadding(layoutDirection)
                .toPx()
        val hasRightSpace =
            windowSize.width - center.x >= halfContentWidth + paddingToAnchor.calculateRightPadding(
                layoutDirection
            ).toPx()

        fun calculateTopOrBottomOrCenter(): VerticalPlacement {
            val hasAlignedTopSpace = windowSize.height - anchorBounds.top >= popupContentSize.height
            val hasAlignedBottomSpace = anchorBounds.bottom >= popupContentSize.height
            if (hasAlignedTopSpace) {
                return VerticalPlacement.AlignedTop
            }
            if (hasAlignedBottomSpace) {
                return VerticalPlacement.AlignedBottom
            }
            if (center.y - halfContentHeight > 0) {
                return VerticalPlacement.Center
            }
            return VerticalPlacement.None
        }

        if (isLRT) {
            if (hasRightSpace) {
                return HorizontalPlacement.End to calculateTopOrBottomOrCenter()
            }

            if (hasLeftSpace) {
                return HorizontalPlacement.Start to calculateTopOrBottomOrCenter()
            }
        } else {
            if (hasLeftSpace) {
                return HorizontalPlacement.End to calculateTopOrBottomOrCenter()
            }
            if (hasRightSpace) {
                return HorizontalPlacement.Start to calculateTopOrBottomOrCenter()
            }
        }

        return HorizontalPlacement.End to VerticalPlacement.AlignedTop
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

private class FlyoutScopeImpl(visibleState: MutableState<Boolean>) : FlyoutScope {

    override var isFlyoutVisible: Boolean by visibleState
}

interface FlyoutScope {

    var isFlyoutVisible: Boolean

}

//TODO Remove when shadow can show with animated visibility
internal val flyoutPopPaddingFixShadowRender = 16.dp
internal val flyoutDefaultPadding = 8.dp

internal fun <T> flyoutEnterSpec() =
    tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)

internal fun <T> flyoutExitSpec() =
    tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastDismissEasing)

internal fun defaultFlyoutEnterPlacementAnimation(placement: FlyoutPlacement): EnterTransition {
    return fadeIn(flyoutEnterSpec()) + when (placement) {
        FlyoutPlacement.Auto, FlyoutPlacement.Full -> scaleIn(flyoutEnterSpec())
        FlyoutPlacement.Top, FlyoutPlacement.TopAlignedEnd, FlyoutPlacement.TopAlignedStart -> slideInVertically(
            flyoutEnterSpec()
        ) { (it / 2f).toInt() }

        FlyoutPlacement.Bottom, FlyoutPlacement.BottomAlignedEnd, FlyoutPlacement.BottomAlignedStart -> slideInVertically(
            flyoutEnterSpec()
        )

        FlyoutPlacement.Start, FlyoutPlacement.StartAlignedTop, FlyoutPlacement.StartAlignedBottom -> slideInHorizontally(
            flyoutEnterSpec()
        ) { (it / 2f).toInt() }

        FlyoutPlacement.End, FlyoutPlacement.EndAlignedTop, FlyoutPlacement.EndAlignedBottom -> slideInHorizontally(
            flyoutEnterSpec()
        )
    }
}