package com.konyaco.fluent.component

import androidx.compose.animation.*
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.InspectableValue
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalAcrylicPopupEnabled
import com.konyaco.fluent.LocalWindowAcrylicContainer
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.MaterialContainerScope
import com.konyaco.fluent.background.MaterialDefaults
import com.konyaco.fluent.background.Material
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.ElevationDefaults
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.calculateBorderPadding

@Composable
fun FlyoutContainer(
    flyout: @Composable FlyoutContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    adaptivePlacement: Boolean = false,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable FlyoutContainerScope.() -> Unit
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
                content = { flyout() }
            )
        },
        content = content,
        modifier = modifier,
        initialVisible = initialVisible
    )
}

@OptIn(ExperimentalFluentApi::class)
@Composable
internal fun BasicFlyoutContainer(
    flyout: @Composable FlyoutContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    content: @Composable FlyoutContainerScope.() -> Unit
) {
    val flyoutState = remember(initialVisible) {
        mutableStateOf(initialVisible)
    }
    FlyoutAnchorScope {
        val flyoutScope = remember(flyoutState, this) {
            FlyoutContainerScopeImpl(flyoutState, this)
        }
        Box(modifier = modifier) {
            flyoutScope.content()
            flyoutScope.flyout()
        }
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
    shape: Shape = FluentTheme.shapes.overlay,
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
    shape: Shape = FluentTheme.shapes.overlay,
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
    shape: Shape = FluentTheme.shapes.overlay,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    content: @Composable () -> Unit
) {
    AcrylicPopupContent(
        visibleState = visibleState,
        enterTransition = enterPlacementAnimation(placement),
        exitTransition = fadeOut(flyoutExitSpec()),
        content = content,
        contentPadding = contentPadding,
        elevation = ElevationDefaults.flyout,
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
        val useAcrylic = LocalAcrylicPopupEnabled.current
        AnimatedVisibility(
            visibleState = visibleState,
            enter = enterTransition,
            exit = exitTransition,
            modifier = Modifier.then(
                if (useAcrylic) {
                    Modifier.padding(flyoutPopPaddingFixShadowRender)
                } else {
                    Modifier
                }
            )
        ) {
            Layer(
                backgroundSizing = BackgroundSizing.InnerBorderEdge,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.flyout),
                shape = shape,
                elevation = elevation,
                color = if (useAcrylic) {
                    Color.Transparent
                } else {
                    FluentTheme.colors.background.acrylic.default
                },
                modifier = modifier
            ) {
                FlyoutContentLayout(
                    contentPadding = contentPadding,
                    material = MaterialDefaults.acrylicDefault(),
                    shape = shape,
                    content = content
                )
            }
        }
    }
}

//Workaround for acrylic PaddingBorder
@OptIn(ExperimentalFluentApi::class)
@Composable
internal fun MaterialContainerScope.FlyoutContentLayout(
    material: Material,
    shape: Shape,
    contentPadding: PaddingValues,
    content: @Composable () -> Unit
) {
    Layout(
        content = {
            val acrylicShape = if (shape is RoundedCornerShape) {
                with(LocalDensity.current) {
                    val borderPadding = shape.calculateBorderPadding(this).toDp()
                    RoundedCornerShape(
                        topStart = PaddingCornerSize(shape.topStart, borderPadding),
                        topEnd = PaddingCornerSize(shape.topEnd, borderPadding),
                        bottomEnd = PaddingCornerSize(shape.bottomEnd, borderPadding),
                        bottomStart = PaddingCornerSize(shape.bottomStart, borderPadding)
                    )
                }
            } else {
                shape
            }
            Box(
                modifier = Modifier
                    .layoutId("placeholder")
                    .padding(1.dp)
                    .clip(acrylicShape)
                    .materialOverlay(material = material)
            )
            Box(modifier = Modifier.padding(contentPadding).layoutId("content")) { content() }
        }
    ) { mesurables, constraints ->
        val contentPlaceable = mesurables.first { it.layoutId == "content" }.measure(constraints)
        val placeholder = mesurables.first { it.layoutId == "placeholder" }.measure(
            Constraints.fixed(contentPlaceable.width, contentPlaceable.height)
        )
        layout(contentPlaceable.width, contentPlaceable.height) {
            placeholder.place(0, 0)
            contentPlaceable.place(0, 0)
        }
    }
}

@Immutable
internal data class PaddingCornerSize(
    private val size: CornerSize,
    private val padding: Dp
) : CornerSize, InspectableValue {

    override fun toPx(shapeSize: Size, density: Density) =
        with(density) { (size.toPx(shapeSize, this) - padding.toPx()).coerceAtLeast(0f) }

    override fun toString(): String = size.toString()

    override val valueOverride: Dp
        get() = padding
}

@OptIn(ExperimentalFluentApi::class)
private class FlyoutContainerScopeImpl(
    visibleState: MutableState<Boolean>,
    scope: FlyoutAnchorScope,
) : FlyoutContainerScope, FlyoutAnchorScope by scope {

    override var isFlyoutVisible: Boolean by visibleState
}

@OptIn(ExperimentalFluentApi::class)
interface FlyoutContainerScope: FlyoutAnchorScope {

    var isFlyoutVisible: Boolean

}

@ExperimentalFluentApi
interface FlyoutAnchorScope {

    fun Modifier.flyoutAnchor(): Modifier

    fun Modifier.flyoutSize(matchAnchorWidth: Boolean = false): Modifier
}

@ExperimentalFluentApi
@Composable
fun FlyoutAnchorScope(
    anchorPadding: Dp = flyoutPopPaddingFixShadowRender + flyoutDefaultPadding,
    content: @Composable FlyoutAnchorScope.() -> Unit
) {
    content(rememberFlyoutAnchorScope(anchorPadding))
}

@ExperimentalFluentApi
@Stable
@Composable
internal fun rememberFlyoutAnchorScope(padding: Dp = flyoutPopPaddingFixShadowRender + flyoutDefaultPadding): FlyoutAnchorScope {
    val calculateMaxHeight = rememberFlyoutCalculateMaxHeight(padding)
    return remember(calculateMaxHeight) {
        FlyoutAnchorScopeImpl(calculateMaxHeight)
    }
}

@ExperimentalFluentApi
private class FlyoutAnchorScopeImpl(
    private val calculateMaxHeight: (anchorCoordinates: LayoutCoordinates) -> Int
) : FlyoutAnchorScope {
    private var anchorWidth by mutableIntStateOf(0)
    private var flyoutMaxHeight by mutableIntStateOf(0)

    override fun Modifier.flyoutAnchor(): Modifier = this.onGloballyPositioned {
        anchorWidth = it.size.width
        flyoutMaxHeight = calculateMaxHeight(it)
    }

    override fun Modifier.flyoutSize(matchAnchorWidth: Boolean): Modifier {
        return this.layout { measurable, constraints ->
            val flyoutWidth = constraints.constrainWidth(anchorWidth)
            val flyoutConstraints = constraints.copy(
                maxHeight = constraints.constrainHeight(flyoutMaxHeight),
                minWidth = if (matchAnchorWidth) flyoutWidth else constraints.minWidth,
                maxWidth = if (matchAnchorWidth) flyoutWidth else constraints.maxWidth,
            )
            val placeable = measurable.measure(flyoutConstraints)
            layout(placeable.width, placeable.height) {
                placeable.place(0, 0)
            }
        }
    }

}

@Composable
internal expect fun rememberFlyoutCalculateMaxHeight(padding: Dp): (anchorCoordinates: LayoutCoordinates) -> Int

//TODO Remove when shadow can show with animated visibility
internal val flyoutPopPaddingFixShadowRender = 0.dp
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