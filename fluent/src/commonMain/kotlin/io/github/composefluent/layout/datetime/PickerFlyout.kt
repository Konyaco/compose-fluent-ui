package io.github.composefluent.layout.datetime

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.BasicFlyoutContainer
import io.github.composefluent.component.FontIcon
import io.github.composefluent.component.FontIconPrimitive
import io.github.composefluent.component.FlyoutAvailableSpace
import io.github.composefluent.component.FlyoutPlacement
import io.github.composefluent.component.FlyoutPositionProvider
import io.github.composefluent.component.SelectionPopupFallback
import io.github.composefluent.component.SelectionPopupPlacement
import io.github.composefluent.component.SelectionPopupSurface
import io.github.composefluent.component.SubtleButton
import io.github.composefluent.component.calculateSelectionPopupPosition
import io.github.composefluent.component.flyoutDefaultPadding
import io.github.composefluent.component.rememberFlyoutAvailableSpace

@Composable
internal fun PickerFlyoutContainer(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    flyoutContent: @Composable (visibleItemsCount: Int) -> Unit,
    anchor: @Composable (anchorModifier: Modifier) -> Unit,
) {
    val density = LocalDensity.current
    val calculatePopupAvailableSpace = rememberFlyoutAvailableSpace(flyoutDefaultPadding)
    var popupAvailableSpace by remember {
        mutableStateOf(
            FlyoutAvailableSpace(
                above = Dp.Infinity,
                below = Dp.Infinity,
                anchorHeight = 0.dp
            )
        )
    }
    val visibleItemsCount = pickerVisibleItemsCount(popupAvailableSpace)
    val popupPositionProvider = remember(density, visibleItemsCount, expanded) {
        PickerPopupPositionProvider(density, visibleItemsCount)
    }

    BasicFlyoutContainer(
        modifier = modifier,
        flyout = {
            SelectionPopupSurface(
                expanded = expanded,
                positionProvider = popupPositionProvider,
                onDismissRequest = onDismissRequest,
                contentPadding = PaddingValues(1.dp),
                revealOriginY = { popupPositionProvider.revealOriginY },
                placement = { popupPositionProvider.placement }
            ) {
                flyoutContent(visibleItemsCount)
            }
        }
    ) {
        anchor(
            Modifier.onGloballyPositioned { coordinates ->
                popupAvailableSpace = calculatePopupAvailableSpace(coordinates)
            }
        )
    }
}

@Composable
internal fun BoxScope.PickerSelectionIndicator(fieldWeights: List<Float>) {
    require(fieldWeights.isNotEmpty()) { "fieldWeights must not be empty" }
    require(fieldWeights.all { it.isFinite() && it > 0f }) {
        "fieldWeights must contain only finite values greater than zero"
    }

    Box(
        Modifier
            .height(PickerItemHeight)
            .fillMaxWidth()
            .align(Alignment.Center)
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 4.dp)
                .background(
                    color = FluentTheme.colors.fillAccent.default,
                    shape = FluentTheme.shapes.control
                )
        )
        Row(Modifier.fillMaxSize()) {
            fieldWeights.forEachIndexed { index, weight ->
                Spacer(Modifier.weight(weight))
                if (index < fieldWeights.lastIndex) {
                    Box(
                        Modifier
                            .width(1.dp)
                            .height(PickerItemHeight)
                            .background(FluentTheme.colors.stroke.control.onAccentTertiary)
                    )
                }
            }
        }
    }
}

@Composable
internal fun PickerWheelDivider() {
    Box(
        Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(FluentTheme.colors.stroke.divider.default)
    )
}

@Composable
internal fun PickerFlyoutFooter(
    onAccept: () -> Unit,
    onCancel: () -> Unit,
    acceptContentDescription: String = "Accept",
    cancelContentDescription: String = "Cancel",
) {
    Box(
        Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(FluentTheme.colors.stroke.divider.default)
    )
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SubtleButton(
            modifier = Modifier.padding(4.dp).weight(1f),
            onClick = onAccept
        ) {
            FontIcon(
                type = FontIconPrimitive.Accept,
                contentDescription = acceptContentDescription
            )
        }
        SubtleButton(
            modifier = Modifier.padding(4.dp).weight(1f),
            onClick = onCancel
        ) {
            FontIcon(
                type = FontIconPrimitive.Cancel,
                contentDescription = cancelContentDescription
            )
        }
    }
}

private fun pickerVisibleItemsCount(
    availableSpace: FlyoutAvailableSpace
): Int {
    val anchorHalfHeight = availableSpace.anchorHeight / 2f
    val overlapSpaceAbove = availableSpace.above + anchorHalfHeight
    val overlapSpaceBelow = availableSpace.below + anchorHalfHeight
    val directionalSpace = maxOf(availableSpace.above, availableSpace.below)

    return PickerVisibleItemCounts.firstOrNull { visibleItemsCount ->
        val wheelHeight = PickerItemHeight * visibleItemsCount
        val popupHeight = wheelHeight + PickerFooterHeight
        val selectedCenter = wheelHeight / 2f
        val overlapFits = selectedCenter <= overlapSpaceAbove &&
            popupHeight - selectedCenter <= overlapSpaceBelow
        val directionalPlacementFits = popupHeight <= directionalSpace
        overlapFits || directionalPlacementFits
    } ?: PickerVisibleItemCounts.last()
}

@Stable
private class PickerPopupPositionProvider(
    density: Density,
    visibleItemsCount: Int
) : FlyoutPositionProvider(density) {
    private val selectedCenterY = with(density) {
        (PickerItemHeight * visibleItemsCount / 2f).roundToPx()
    }
    private val windowPadding = with(density) { flyoutDefaultPadding.roundToPx() }
    var revealOriginY by mutableIntStateOf(0)
        private set

    var placement by mutableStateOf(SelectionPopupPlacement.Overlap)
        private set

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val position = calculateSelectionPopupPosition(
            anchorBounds = anchorBounds,
            windowSize = windowSize,
            popupContentSize = popupContentSize,
            selectedCenterY = selectedCenterY,
            windowPadding = windowPadding,
            fallback = SelectionPopupFallback.Directional
        )

        revealOriginY = position.revealOriginY
        placement = position.placement
        targetPlacement = when (position.placement) {
            SelectionPopupPlacement.Overlap -> FlyoutPlacement.Full
            SelectionPopupPlacement.Above -> FlyoutPlacement.Top
            SelectionPopupPlacement.Below -> FlyoutPlacement.Bottom
        }
        applyAnimation = true
        return position.offset
    }
}

internal val PickerWidth = 300.dp

private val PickerFooterHeight = 47.dp
private val PickerVisibleItemCounts = listOf(9, 7, 5, 3)
