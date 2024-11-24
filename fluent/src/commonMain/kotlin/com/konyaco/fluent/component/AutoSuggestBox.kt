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
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.CompactMode
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme

@OptIn(ExperimentalFluentApi::class)
@Composable
fun AutoSuggestionBox(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable FlyoutAnchorScope.() -> Unit
) {
    val flyoutAnchorScope = rememberFlyoutAnchorScope()
    val expandedState = rememberUpdatedState(expanded)
    val autoSuggestBoxScopeImpl = remember(expandedState, onExpandedChange) {
        AutoSuggestBoxScopeImpl(
            onExpandedChange = onExpandedChange,
            expanded = { expandedState.value },
            scope = flyoutAnchorScope
        )
    }
    Box(modifier = modifier) {
        autoSuggestBoxScopeImpl.content()
    }
    SideEffect {
        if (expanded) autoSuggestBoxScopeImpl.focusRequester.requestFocus()
    }
}

object AutoSuggestBoxDefaults {

    @Composable
    @Stable
    fun textFieldShape(expanded: Boolean): Shape {
        return if (expanded) RoundedCornerShape(
            topStart = FluentTheme.cornerRadius.control,
            topEnd = FluentTheme.cornerRadius.control,
        ) else FluentTheme.shapes.control
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
                bottomStart = FluentTheme.cornerRadius.overlay,
                bottomEnd = FluentTheme.cornerRadius.overlay
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

@ExperimentalFluentApi
private class AutoSuggestBoxScopeImpl(
    private val onExpandedChange: (Boolean) -> Unit,
    private val expanded: () -> Boolean,
    private val scope: FlyoutAnchorScope
): FlyoutAnchorScope {

    val focusRequester = FocusRequester()

    override fun Modifier.flyoutAnchor(): Modifier = with(scope) {
        flyoutAnchor().pointerInput(onExpandedChange) {
            awaitEachGesture {
                awaitFirstDown(pass = PointerEventPass.Initial)
                val upEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
                if (upEvent != null) {
                    onExpandedChange(!expanded())
                }
            }
        }.focusRequester(focusRequester)
    }

    override fun Modifier.flyoutSize(matchAnchorWidth: Boolean): Modifier {
        return with(scope) { flyoutSize(matchAnchorWidth) }
    }
}