package io.github.composefluent.component

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
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalAcrylicPopupEnabled
import io.github.composefluent.LocalWindowAcrylicContainer
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.MaterialContainerScope
import io.github.composefluent.background.MaterialDefaults
import io.github.composefluent.background.Material
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.ElevationDefaults
import io.github.composefluent.background.Layer
import io.github.composefluent.background.calculateBorderPadding

/**
 * A container composable that displays a flyout and its content.
 *
 * The [FlyoutContainer] manages the visibility and placement of a flyout, while also providing a
 * [FlyoutContainerScope] for defining the flyout and the main content.
 *
 * @param flyout A composable lambda representing the content of the flyout.
 *               It has access to the [FlyoutContainerScope].
 * @param modifier The modifier to be applied to the container.
 * @param initialVisible The initial visibility state of the flyout. Defaults to `false`.
 * @param placement The placement strategy for the flyout. Defaults to [FlyoutPlacement.Auto].
 * @param adaptivePlacement If `true`, the flyout will try to adapt to the available space.
 *                          Defaults to `false`.
 * @param onKeyEvent An optional callback invoked when a key event is dispatched to the flyout.
 *                   If not null, it will be focusable.
 * @param onPreviewKeyEvent An optional callback invoked when a key event is dispatched to the flyout
 *                          before it is dispatched to any focused view. If not null, it will be
 *                          focusable.
 * @param focusable Determines whether the flyout is focusable. Setting to false allows user to interact
 * with the outside area of the flyout. Defaults to `true`.
 * @param content A composable lambda representing the main content within the container.
 *                It also has access to the [FlyoutContainerScope].
 */
@Composable
fun FlyoutContainer(
    flyout: @Composable FlyoutContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    adaptivePlacement: Boolean = false,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    focusable: Boolean = true,
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
                focusable = focusable,
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

/**
 * Defines the possible placement positions of a flyout relative to its anchor.
 *
 * - **Auto**: The system automatically determines the best placement based on available space.
 * - **Full**: The flyout will occupy the full available space.
 * - **Start**: The flyout will be placed at the start side of the anchor.
 * - **StartAlignedTop**: The flyout will be placed at the start side of the anchor, with its top edge aligned with the anchor's top edge.
 * - **StartAlignedBottom**: The flyout will be placed at the start side of the anchor, with its bottom edge aligned with the anchor's bottom edge.
 * - **Top**: The flyout will be placed above the anchor.
 * - **TopAlignedStart**: The flyout will be placed above the anchor, with its start edge aligned with the anchor's start edge.
 * - **TopAlignedEnd**: The flyout will be placed above the anchor, with its end edge aligned with the anchor's end edge.
 * - **End**: The flyout will be placed at the end side of the anchor.
 * - **EndAlignedTop**: The flyout will be placed at the end side of the anchor, with its top edge aligned with the anchor's top edge.
 * - **EndAlignedBottom**: The flyout will be placed at the end side of the anchor, with its bottom edge aligned with the anchor's bottom edge.
 * - **Bottom**: The flyout will be placed below the anchor.
 * - **BottomAlignedStart**: The flyout will be placed below the anchor, with its start edge aligned with the anchor's start edge.
 * - **BottomAlignedEnd**: The flyout will be placed below the anchor, with its end edge aligned with the anchor's end edge.
 */
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

/**
 * A Flyout is a transient view that displays content that is either contextual to or provides additional
 * information about a specific UI element. Flyouts are meant to be temporary and are dismissed when the
 * user interacts outside of the flyout or when the parent UI element is hidden or removed.
 *
 * @param visible Whether the flyout is currently visible.
 * @param onDismissRequest Callback invoked when the flyout should be dismissed. This typically happens
 * when the user clicks outside the flyout or presses the back button.
 * @param modifier Modifier to be applied to the flyout.
 * @param placement The preferred placement of the flyout relative to its anchor.
 * Defaults to [FlyoutPlacement.Auto].
 * @param adaptivePlacement If `true`, the flyout will automatically adjust its placement to ensure
 * it remains within the bounds of the screen. If `false`, the flyout will stick to the specified
 * placement, potentially overflowing the screen. Defaults to `false`.
 * @param shape The shape of the flyout's background. Defaults to [FluentTheme.shapes.overlay].
 * @param onKeyEvent Optional callback to intercept and handle key events while the flyout is
 * visible. Return `true` to consume the event, `false` to allow it to propagate. Defaults to `null`.
 * @param onPreviewKeyEvent Optional callback to preview key events before they are dispatched to
 * the flyout's content. Return `true` to consume the event, `false` to allow it to propagate.
 * Defaults to `null`.
 * @param focusable Determines whether the flyout is focusable. Setting to false allows user to interact
 * with the outside area of the flyout. Defaults to `true`.
 * @param content The content to be displayed within the flyout.
 */
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
    focusable: Boolean = true,
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
        focusable = focusable,
        content = content
    )
}

@Composable
fun BasicFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    enterPlacementAnimation: (placement: FlyoutPlacement) -> EnterTransition = ::defaultFlyoutEnterPlacementAnimation,
    shape: Shape = FluentTheme.shapes.overlay,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    positionProvider: FlyoutPositionProvider = rememberFlyoutPositionProvider(),
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    focusable: Boolean = true,
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
                focusable = focusable
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

/**
 * Scope for the content of a [FlyoutContainer].
 *
 * This scope provides access to the [isFlyoutVisible] state, which determines whether the flyout is currently visible.
 * You can use this scope to control the visibility of the flyout and interact with the anchor.
 *
 * The [isFlyoutVisible] property should be set to true to show the flyout and false to hide it.
 * It's a two-way binding that updates the flyout's visibility and is updated when the flyout is dismissed.
 *
 *  **Example:**
 *
 * ```kotlin
 * FlyoutContainer(
 *   flyout = {
 *      Text("Flyout Content")
 *   }
 * ) {
 *    Button(onClick = { isFlyoutVisible = true }) {
 *       Text("Show Flyout")
 *    }
 * }
 * ```
 * In this example, clicking the "Show Flyout" button will set `isFlyoutVisible` to true, causing the flyout to appear.
 * Clicking outside of the flyout will set `isFlyoutVisible` to false, hiding the flyout.
 */
@OptIn(ExperimentalFluentApi::class)
interface FlyoutContainerScope : FlyoutAnchorScope {

    var isFlyoutVisible: Boolean

}

/**
 * Scope for configuring the anchor and size of a flyout.
 *
 * This interface provides functions to define the flyout's anchoring point and control its size relative to the anchor.
 */
@ExperimentalFluentApi
interface FlyoutAnchorScope {

    fun Modifier.flyoutAnchor(): Modifier

    fun Modifier.flyoutSize(matchAnchorWidth: Boolean = false): Modifier
}

/**
 * Provides a scope for defining the anchor point and size constraints for a Flyout.
 *
 * This composable establishes a context where the anchor for a Flyout can be defined,
 * allowing subsequent components within the scope to be positioned relative to this anchor.
 * It also manages the padding around the anchor, ensuring proper spacing between the anchor
 * and the flyout.
 *
 * @param anchorPadding The padding to be applied around the flyout anchor.
 *  Defaults to `flyoutPopPaddingFixShadowRender + flyoutDefaultPadding`, which
 *  considers adjustments for shadow rendering and a default padding value.
 * @param content The composable content that defines the Flyout anchor and
 *  any additional components that should be part of the Flyout's context.
 *  This lambda receives a `FlyoutAnchorScope` instance, allowing the use of
 *  modifier functions like `flyoutAnchor()` and `flyoutSize()` within this context.
 */
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