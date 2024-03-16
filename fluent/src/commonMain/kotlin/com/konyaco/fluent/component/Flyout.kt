package com.konyaco.fluent.component

import androidx.compose.animation.*
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.konyaco.fluent.*
import com.konyaco.fluent.LocalAcrylicPopupEnabled
import com.konyaco.fluent.LocalWindowAcrylicContainer
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.AcrylicDefaults
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica

@Composable
fun FlyoutContainer(
    flyout: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    adaptivePlacement: Boolean = false,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable FlyoutScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            Flyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                placement = placement,
                adaptivePlacement = adaptivePlacement,
                onKeyEvent = onKeyEvent,
                onPreviewKeyEvent = onPreviewKeyEvent,
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
    adaptivePlacement: Boolean = false,
    shape: Shape = RoundedCornerShape(8.dp),
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable () -> Unit
) {
    BasicFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        positionProvider = rememberFlyoutPositionProvider(
            initialPlacement = placement,
            adaptivePlacement = adaptivePlacement
        ),
        shape = shape,
        onKeyEvent = onKeyEvent,
        onPreviewKeyEvent = onPreviewKeyEvent,
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
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable () -> Unit
) {
    val visibleState = remember {
        MutableTransitionState(false)
    }
    visibleState.targetState = visible
    if (visibleState.currentState || visibleState.targetState) {
        Popup(
            onDismissRequest = onDismissRequest,
            properties = PopupProperties(
                clippingEnabled = false,
                focusable = onKeyEvent != null || onPreviewKeyEvent != null
            ),
            popupPositionProvider = positionProvider,
            onKeyEvent = onKeyEvent,
            onPreviewKeyEvent = onPreviewKeyEvent
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
    AcrylicPopupContent(
        visibleState = visibleState,
        enterTransition = enterPlacementAnimation(placement),
        exitTransition = fadeOut(flyoutExitSpec()),
        content = content,
        contentPadding = contentPadding,
        elevation = 8.dp,
        shape = shape,
        modifier = modifier
    )
}

@OptIn(ExperimentalFluentApi::class)
@Composable
internal fun AcrylicPopupContent(
    visibleState: MutableTransitionState<Boolean>,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
    modifier: Modifier = Modifier,
    elevation: Dp,
    shape: Shape,
    contentPadding: PaddingValues,
    content: @Composable () -> Unit
) {
    with(LocalWindowAcrylicContainer.current) {
        val userAcrylic = LocalAcrylicPopupEnabled.current
        AnimatedVisibility(
            visibleState = visibleState,
            enter = enterTransition,
            exit = exitTransition,
            modifier = Modifier.then(
                if (userAcrylic) {
                    Modifier.padding(flyoutPopPaddingFixShadowRender)
                } else {
                    Modifier
                }
            )
        ) {
            if (!userAcrylic) {
                Mica(modifier = modifier.padding(flyoutPopPaddingFixShadowRender).graphicsLayer {
                    this.shape = shape
                    shadowElevation = elevation.toPx()
                    clip = true
                }) {
                    Layer(shape = shape) {
                        Box(modifier = modifier.padding(contentPadding)) {
                            content()
                        }
                    }
                }
            } else {
                Box(
                    modifier = Modifier
                        .border(BorderStroke(1.dp, FluentTheme.colors.stroke.card.default), shape = shape)
                        .acrylicOverlay(
                            tint = AcrylicDefaults.tintColor,
                            enabled = { visibleState.targetState || (visibleState.currentState && visibleState.isIdle) },
                            shape = shape
                        )
                        .padding(contentPadding)
                        .clip(shape)
                ) {
                    content()
                }
            }
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