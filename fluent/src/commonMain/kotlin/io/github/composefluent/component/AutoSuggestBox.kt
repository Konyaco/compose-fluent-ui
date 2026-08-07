package io.github.composefluent.component

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
import io.github.composefluent.CompactMode
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme

/**
 * A composable that provides an auto-suggestion box functionality.
 *
 * This composable acts as a container for an input field (e.g., a TextField) and a flyout that displays
 * suggestions or other relevant content. The flyout's visibility is controlled by the `expanded` parameter,
 * and changes to the expanded state are communicated through the `onExpandedChange` callback.
 *
 * @param expanded Indicates whether the suggestion flyout should be visible.
 * @param onExpandedChange Callback that is invoked when the expanded state of the flyout changes.
 *   The lambda parameter is `true` if the flyout should be expanded and `false` if it should be collapsed.
 * @param modifier Modifier to be applied to the root container of the auto-suggestion box.
 * @param content The composable content of the auto-suggestion box.
 *   It must use [FlyoutAnchorScope.flyoutAnchor] to set the anchor for the flyout.
 *   [FlyoutAnchorScope.flyoutSize] can also be used to determine the flyout's size.
 */
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

/**
 * Contains the default values used for [AutoSuggestionBox].
 */
object AutoSuggestBoxDefaults {

    /**
     * Provides the shape for the text field in the AutoSuggestBox.
     *
     * When the suggestion flyout is expanded, the text field keeps rounded corners on the
     * edge away from the flyout. When the flyout is not expanded, the text field uses the
     * default control shape defined in [FluentTheme.shapes.control].
     *
     * @param expanded Whether the suggestion flyout is currently expanded.
     * @param placement The current placement of the suggestion flyout relative to the text field.
     * @return The [Shape] to be used for the text field.
     */
    @Composable
    @Stable
    fun textFieldShape(
        expanded: Boolean,
        placement: FlyoutPlacement = FlyoutPlacement.BottomAlignedStart
    ): Shape {
        if (!expanded) return FluentTheme.shapes.control

        return if (placement.opensAboveAnchor) {
            RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = FluentTheme.cornerRadius.control,
                bottomEnd = FluentTheme.cornerRadius.control
            )
        } else {
            RoundedCornerShape(
                topStart = FluentTheme.cornerRadius.control,
                topEnd = FluentTheme.cornerRadius.control,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        }
    }

    /**
     * Provides the shape for a suggestion flyout that is attached to a text field.
     * The corners touching the text field are removed for the current placement.
     *
     * @param placement The current placement of the suggestion flyout relative to the text field.
     * @return The shape to use for the attached suggestion flyout.
     */
    @Composable
    @Stable
    fun suggestFlyoutShape(placement: FlyoutPlacement): Shape {
        return if (placement.opensAboveAnchor) {
            RoundedCornerShape(
                topStart = FluentTheme.cornerRadius.overlay,
                topEnd = FluentTheme.cornerRadius.overlay,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        } else {
            RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = FluentTheme.cornerRadius.overlay,
                bottomEnd = FluentTheme.cornerRadius.overlay
            )
        }
    }

    /**
     * A composable function that displays a flyout for suggestions.
     *
     * @param expanded Whether the flyout should be visible.
     * @param onDismissRequest Callback invoked when the user requests to dismiss the flyout.
     * @param modifier Modifier for the flyout.
     * @param contentPadding The padding to be applied to the content of the flyout.
     * @param content The composable content to be displayed within the flyout.
     */
    @Composable
    fun suggestFlyout(
        expanded: Boolean,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        contentPadding: PaddingValues = PaddingValues(vertical = 3.dp),
        content: @Composable () -> Unit
    ) {
        val positionProvider = rememberFlyoutPositionProvider(
            initialPlacement = FlyoutPlacement.Bottom,
            paddingToAnchor = PaddingValues()
        )
        BasicFlyout(
            visible = expanded,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            enterPlacementAnimation = { expandVertically(flyoutEnterSpec()) { it } },
            shape = suggestFlyoutShape(positionProvider.targetPlacement),
            positionProvider = positionProvider,
            contentPadding = contentPadding,
            content = content
        )
    }

    /**
     * Displays a flyout that can contain a list of suggested items.
     *
     * @param expanded Whether the flyout is currently expanded.
     * @param onDismissRequest Callback invoked when the flyout should be dismissed.
     * @param modifier Modifier for the flyout.
     * @param state The `LazyListState` to be used for the underlying `LazyColumn`.
     * @param contentPadding The padding to be applied to the content inside the `LazyColumn`.
     * @param compactMode Whether to display the flyout in compact mode.
     * @param itemsContent The content of the list items within the flyout. This is a `LazyListScope`
     *  that allows for defining the list items using `item` and `items` composables.
     */
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
        val positionProvider = rememberFlyoutPositionProvider(
            initialPlacement = FlyoutPlacement.Bottom,
            paddingToAnchor = PaddingValues()
        )
        BasicFlyout(
            visible = expanded,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            enterPlacementAnimation = { expandVertically(flyoutEnterSpec()) { it } },
            shape = suggestFlyoutShape(positionProvider.targetPlacement),
            positionProvider = positionProvider,
            contentPadding = PaddingValues(),
            focusable = false,
            content = {
                CompactMode(enabled = compactMode) {
                    LazyColumn(
                        modifier = Modifier.scrollbar(state = state),
                        contentPadding = contentPadding,
                        content = itemsContent,
                        state = state,
                    )

                }
            }
        )
    }

}

private val FlyoutPlacement.opensAboveAnchor: Boolean
    get() = this == FlyoutPlacement.Top ||
        this == FlyoutPlacement.TopAlignedStart ||
        this == FlyoutPlacement.TopAlignedEnd

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
