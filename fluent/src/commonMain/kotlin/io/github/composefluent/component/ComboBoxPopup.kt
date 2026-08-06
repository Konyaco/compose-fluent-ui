package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.ElevationDefaults
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt

internal val ComboBoxItemHeight = 36.dp
private val ComboBoxPopupContentPadding = 4.dp
private val ComboBoxItemSpacing = 2.dp

@Composable
internal fun ComboBoxPopup(
    expanded: Boolean,
    minWidth: Dp,
    maxHeight: Dp,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ComboBoxPopupScope.() -> Unit
) {
    if (!expanded) return

    val density = LocalDensity.current
    val scrollState = rememberScrollState()
    val positionProvider = remember(density, scrollState) {
        ComboBoxPopupPositionProvider(
            density = density,
            scrollState = scrollState
        )
    }
    val scope = remember(positionProvider, scrollState) {
        ComboBoxPopupScopeImpl { center ->
            if (scrollState.value == 0) {
                positionProvider.selectedItemCenter = center
            }
        }
    }
    val revealProgress = remember { Animatable(0f) }
    val shadowElevationProgress = remember { Animatable(0f) }

    LaunchedEffect(positionProvider.requestedScrollOffset) {
        scrollState.scrollTo(positionProvider.requestedScrollOffset)
    }

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
            val origin = positionProvider.revealOriginY.toFloat().coerceIn(0f, size.height)
            val progress = revealProgress.value
            if (progress < 1f) {
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
            } else {
                drawContent()
            }
        },
        enterPlacementAnimation = { EnterTransition.None },
        exitTransition = ExitTransition.None,
        contentPadding = PaddingValues(vertical = ComboBoxPopupContentPadding),
        positionProvider = positionProvider,
        elevation = 1.dp + (ElevationDefaults.flyout - 1.dp) * shadowElevationProgress.value
    ) {
        Column(
            modifier = Modifier
                .width(IntrinsicSize.Max)
                .widthIn(min = (minWidth).coerceAtLeast(0.dp))
                .heightIn(max = maxHeight)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(ComboBoxItemSpacing),
            content = { scope.content() }
        )
    }
}

@Stable
internal interface ComboBoxPopupScope {
    @Composable
    fun item(
        selected: Boolean,
        content: @Composable () -> Unit
    )
}

private class ComboBoxPopupScopeImpl(
    private val onSelectedItemPositioned: (center: Int) -> Unit
) : ComboBoxPopupScope {
    @Composable
    override fun item(
        selected: Boolean,
        content: @Composable () -> Unit
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .then(
                    if (selected) {
                        Modifier.onGloballyPositioned { coordinates ->
                            onSelectedItemPositioned(
                                coordinates.positionInParent().y.roundToInt() +
                                    coordinates.size.height / 2
                            )
                        }
                    } else {
                        Modifier
                    }
                )
        ) {
            content()
        }
    }
}

@Stable
private class ComboBoxPopupPositionProvider(
    density: Density,
    private val scrollState: ScrollState
) : FlyoutPositionProvider(density) {
    private val contentPadding = with(density) { ComboBoxPopupContentPadding.roundToPx() }

    var revealOriginY by mutableIntStateOf(0)
        private set

    var requestedScrollOffset by mutableIntStateOf(0)
        private set

    var selectedItemCenter by mutableIntStateOf(Int.MIN_VALUE)

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val selectedItemCenter = if (this.selectedItemCenter != Int.MIN_VALUE) {
            this.selectedItemCenter + contentPadding
        } else {
            popupContentSize.height / 2
        }
        val maxScroll = scrollState.maxValue
        val maxPopupY = (windowSize.height - popupContentSize.height).coerceAtLeast(0)
        val anchorCenterY = anchorBounds.center.y

        val unscrolledY = anchorCenterY - selectedItemCenter
        val boundedY = unscrolledY.coerceIn(0, maxPopupY)
        val scrollOffset = (selectedItemCenter - (anchorCenterY - boundedY)).coerceIn(0, maxScroll)
        val selectedItemCenterInPopup = selectedItemCenter - scrollOffset
        val popupY = (anchorCenterY - selectedItemCenterInPopup).coerceIn(0, maxPopupY)

        val popupX = (anchorBounds.center.x - popupContentSize.width / 2).let { idealX ->
            if (popupContentSize.width >= windowSize.width) 0
            else idealX.coerceIn(0, windowSize.width - popupContentSize.width)
        }

        requestedScrollOffset = scrollOffset
        revealOriginY = (anchorCenterY - popupY).coerceIn(0, popupContentSize.height)
        targetPlacement = FlyoutPlacement.Full
        applyAnimation = true

        return IntOffset(popupX, popupY)
    }
}
