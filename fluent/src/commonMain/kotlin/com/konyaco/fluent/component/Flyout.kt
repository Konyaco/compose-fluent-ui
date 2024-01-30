package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
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
    placement: FlyoutPlacement = FlyoutPlacement.Top,
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
    Top, Bottom
}

@Composable
fun Flyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Top,
    shape: Shape = RoundedCornerShape(8.dp),
    content: @Composable () -> Unit
) {
    BasicFlyout(
        visible,
        onDismissRequest,
        modifier,
        placement,
        shape,
        PaddingValues(12.dp),
        content
    )
}

@Composable
internal fun BasicFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Top,
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {
    val visibleState = remember {
        MutableTransitionState(false)
    }
    visibleState.targetState = visible
    if (visibleState.currentState || visibleState.targetState) {
        val targetPlacement = remember(placement) {
            mutableStateOf(placement)
        }
        val density = LocalDensity.current
        val flyoutPopupPositionProvider = remember(placement, density) {
            FlyoutPositionProvider(placement, density) {
                targetPlacement.value = it
            }
        }
        Popup(
            onDismissRequest = onDismissRequest,
            properties = PopupProperties(clippingEnabled = false),
            popupPositionProvider = flyoutPopupPositionProvider,
        ) {
            FlyoutContent(
                modifier = modifier,
                visibleState = visibleState,
                placement = targetPlacement.value,
                shape = shape,
                content = content,
                contentPadding = contentPadding
            )
        }
    }
}

@Composable
internal fun FlyoutContent(
    visibleState: MutableTransitionState<Boolean>,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Top,
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {
    fun <T> enterSpec() =
        tween<T>(FluentDuration.MediumDuration, easing = FluentEasing.PointToPointEasing)

    fun <T> exitSpec() =
        tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastDismissEasing)

    val animatedTransition = updateTransition(visibleState, label = "visibleTransition")
    val animatedElevation = animatedTransition.animateDp(
        transitionSpec = { if (targetState) enterSpec() else exitSpec() },
        targetValueByState = { targetState -> if (targetState) 8.dp else 0.dp },
        label = "visibleTransitionElevation"
    )
    val animatedAlpha = animatedTransition.animateFloat(
        transitionSpec = { if (targetState) enterSpec() else exitSpec() },
        targetValueByState = { targetState -> if (targetState) 1f else 0f },
        label = "visibleTransitionAlpha"
    )
    AnimatedVisibility(
        visibleState = visibleState,
        enter = fadeIn(enterSpec()) + slideInVertically(enterSpec()) {
            if (placement == FlyoutPlacement.Bottom) {
                -it / 2
            } else {
                (it * 2f / 3).toInt()
            }
        },
        exit = fadeOut(exitSpec())
    ) {
        Mica(
            modifier = modifier.padding(flyoutPopPaddingFixShadowRender).graphicsLayer {
                shadowElevation = animatedElevation.value.toPx()
                alpha = animatedAlpha.value
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

//TODO Remove when shadow can show with animated visibility
private val flyoutPopPaddingFixShadowRender = 16.dp
private val flyoutDefaultPadding = 8.dp

@Stable
private class FlyoutPositionProvider(
    private val initialPlacement: FlyoutPlacement,
    private val density: Density,
    private val targetPlacement: (targetPlacement: FlyoutPlacement) -> Unit
) : PopupPositionProvider {

    //TODO RTL support
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val maxWidth = maxOf(anchorBounds.width, popupContentSize.width)
        val anchorHalf = anchorBounds.width / 2
        val start = (anchorHalf + anchorBounds.left - maxWidth / 2).coerceAtLeast(0)
        val isPlaceToBottom = initialPlacement == FlyoutPlacement.Bottom
        val popupPadding = with(density) { flyoutPopPaddingFixShadowRender.toPx() }
        val flyoutDefaultPadding = with(density) { flyoutDefaultPadding.toPx() }
        val popupActualHeight = popupContentSize.height - popupPadding * 2
        val topSpace = anchorBounds.top - popupActualHeight - flyoutDefaultPadding
        val bottomSpace = windowSize.height - anchorBounds.bottom
        val y =
            if (bottomSpace >= (popupActualHeight + flyoutDefaultPadding) && (isPlaceToBottom || topSpace < popupContentSize.height)) {
                targetPlacement(FlyoutPlacement.Bottom)
                anchorBounds.bottom - popupPadding.toInt() + flyoutDefaultPadding.toInt()
            } else {
                targetPlacement(FlyoutPlacement.Top)
                (anchorBounds.top - popupActualHeight - popupPadding - flyoutDefaultPadding).toInt()
                    .coerceAtLeast(0)
            }
        return IntOffset(start, y)
    }
}

private class FlyoutScopeImpl(visibleState: MutableState<Boolean>) : FlyoutScope {

    override var isFlyoutVisible: Boolean by visibleState
}

interface FlyoutScope {

    var isFlyoutVisible: Boolean

}