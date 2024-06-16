package com.konyaco.fluent.component

import androidx.compose.animation.expandVertically
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.CompactMode

@Composable
fun AutoSuggestionBox(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable AutoSuggestBoxScope.() -> Unit
) {

    var anchorCoordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }
    var anchorWidth by remember { mutableIntStateOf(0) }
    var flyoutMaxHeight by remember { mutableIntStateOf(0) }

    val calculateMaxHeight = rememberSuggestFlyoutCalculateMaxHeight(flyoutPopPaddingFixShadowRender + flyoutDefaultPadding)

    val focusRequester = remember { FocusRequester() }

    val autoSuggestBoxScopeImpl = remember(calculateMaxHeight, onExpandedChange) {

        object : AutoSuggestBoxScope {

            override fun Modifier.suggestFlyoutAnchor(): Modifier = this.onGloballyPositioned {
                anchorCoordinates = it
                anchorWidth = it.size.width
                flyoutMaxHeight = calculateMaxHeight(it)
            }.pointerInput(onExpandedChange) {
                awaitEachGesture {
                    awaitFirstDown(pass = PointerEventPass.Initial)
                    val upEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
                    if (upEvent != null) {
                        onExpandedChange(!expanded)
                    }
                }
            }.focusRequester(focusRequester)

            override fun Modifier.suggestFlyoutSize(matchTextFieldWidth: Boolean): Modifier =
                this.layout { measurable, constraints ->
                    val flyoutWidth = constraints.constrainWidth(anchorWidth)
                    val flyoutConstraints = constraints.copy(
                        maxHeight = constraints.constrainHeight(flyoutMaxHeight),
                        minWidth = if (matchTextFieldWidth) flyoutWidth else constraints.minWidth,
                        maxWidth = if (matchTextFieldWidth) flyoutWidth else constraints.maxWidth,
                    )
                    val placeable = measurable.measure(flyoutConstraints)
                    layout(placeable.width, placeable.height) {
                        placeable.place(0, 0)
                    }
                }

        }
    }
    Box(modifier = modifier) {
        autoSuggestBoxScopeImpl.content()
    }
    SideEffect {
        if (expanded) focusRequester.requestFocus()
    }
}

object AutoSuggestBoxDefaults {

    @Stable
    fun textFieldShape(expanded: Boolean): Shape {
        return if (expanded) RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ) else RoundedCornerShape(4.dp)
    }

    @Composable
    fun suggestFlyout(
        expanded: Boolean,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        contentPadding: PaddingValues = PaddingValues(vertical = 3.dp),
        content: @Composable () -> Unit
    ) {
        //TODO Flyout animation
        BasicFlyout(
            visible = expanded,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            enterPlacementAnimation = { expandVertically(flyoutEnterSpec()) { it } },
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 8.dp,
                bottomEnd = 8.dp
            ),
            positionProvider = rememberFlyoutPositionProvider(
                initialPlacement = FlyoutPlacement.Bottom,
                paddingToAnchor = PaddingValues()
            ),
            contentPadding = contentPadding,
            content = content
        )
    }

    @Composable
    fun suggestFlyout(
        expanded: Boolean,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        state: LazyListState = rememberLazyListState(),
        contentPadding: PaddingValues = PaddingValues(vertical = 3.dp),
        compactMode: Boolean = false,
        itemsContent: LazyListScope.() -> Unit
    ) {
        BasicFlyout(
            visible = expanded,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            enterPlacementAnimation = { expandVertically(flyoutEnterSpec()) { it } },
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 8.dp,
                bottomEnd = 8.dp
            ),
            positionProvider = rememberFlyoutPositionProvider(
                initialPlacement = FlyoutPlacement.Bottom,
                paddingToAnchor = PaddingValues()
            ),
            contentPadding = PaddingValues(),
            content = {
                CompactMode(enabled = compactMode) {
                    val adapter = rememberScrollbarAdapter(state)
                    ScrollbarContainer(
                        adapter = adapter
                    ) {
                        LazyColumn(
                            contentPadding = contentPadding,
                            content = itemsContent,
                            state = state,
                        )
                    }

                }
            }
        )
    }

}

interface AutoSuggestBoxScope {
    fun Modifier.suggestFlyoutAnchor(): Modifier

    fun Modifier.suggestFlyoutSize(matchTextFieldWidth: Boolean = true): Modifier
}

@Composable
internal expect fun rememberSuggestFlyoutCalculateMaxHeight(padding: Dp): (anchorCoordinates: LayoutCoordinates) -> Int