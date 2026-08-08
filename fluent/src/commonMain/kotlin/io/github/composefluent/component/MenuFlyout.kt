package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.scheme.VisualStateScheme
import kotlinx.coroutines.delay
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

/**
 * A container for a menu flyout that displays a flyout next to the content, allowing for
 * interactive menu-like behavior.
 *
 * @param flyout The composable content to be displayed within the flyout. This content is
 *   scoped to a [MenuFlyoutContainerScope] for menu-specific features.
 * @param modifier The modifier to be applied to the container.
 * @param initialVisible Determines if the flyout is visible initially. Defaults to `false`.
 * @param placement Specifies the desired placement of the flyout relative to its anchor.
 *   Defaults to `FlyoutPlacement.Auto`.
 * @param adaptivePlacement If true, the placement of the flyout will be adjusted to fit within
 *   the available space. Defaults to `false`.
 * @param onKeyEvent An optional callback for handling key events within the flyout. If not
 *   null, this callback will be invoked for key events, and if it returns `true`, the event
 *   will be considered consumed.
 * @param onPreviewKeyEvent An optional callback for previewing key events within the flyout.
 *   If not null, this callback will be invoked before the key event is dispatched, and if it
 *   returns `true`, the event will be considered consumed.
 * @param content The composable content that acts as the anchor for the flyout. This content
 *   is scoped to a [FlyoutContainerScope].
 */
@Composable
fun MenuFlyoutContainer(
    flyout: @Composable MenuFlyoutContainerScope.() -> Unit,
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
            MenuFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                placement = placement,
                adaptivePlacement = adaptivePlacement,
                content = {
                    val containerScope = remember(this@BasicFlyoutContainer, this) {
                        MenuFlyoutContainerScopeImpl(this@BasicFlyoutContainer, this)
                    }
                    containerScope.flyout()
                },
                onKeyEvent = onKeyEvent,
                onPreviewKeyEvent = onPreviewKeyEvent
            )
        },
        content = content,
        modifier = modifier,
        initialVisible = initialVisible
    )
}

/**
 * A composable function that creates a menu flyout.
 *
 * A menu flyout is a transient UI that can be used to display a list of commands or options.
 *
 * @param visible Whether the menu flyout is visible.
 * @param onDismissRequest Called when the user attempts to dismiss the menu flyout.
 * @param modifier The [Modifier] to be applied to the menu flyout.
 * @param placement The preferred placement of the menu flyout relative to its anchor. Defaults to [FlyoutPlacement.Auto].
 * @param adaptivePlacement Whether the placement of the flyout should be adapted to fit within the available space.
 *   Defaults to false.
 * @param shape The shape of the menu flyout. Defaults to [FluentTheme.shapes.overlay].
 * @param onKeyEvent Optional callback invoked when a key event is received by this flyout.
 *   Returns true if the event was handled, false otherwise.
 * @param onPreviewKeyEvent Optional callback invoked when a key event is received by this flyout, before it is dispatched to
 *   children. Returns true if the event was handled, false otherwise.
 * @param content The content of the menu flyout.
 */
@Composable
fun MenuFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    adaptivePlacement: Boolean = false,
    shape: Shape = FluentTheme.shapes.overlay,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable MenuFlyoutScope.() -> Unit
) {
    MenuFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        shape = shape,
        positionProvider = rememberFlyoutPositionProvider(
            placement,
            adaptivePlacement = adaptivePlacement
        ),
        content = content,
        onKeyEvent = onKeyEvent,
        onPreviewKeyEvent = onPreviewKeyEvent
    )
}

@Composable
internal fun MenuFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.overlay,
    positionProvider: FlyoutPositionProvider = rememberFlyoutPositionProvider(),
    enterPlacementAnimation: (FlyoutPlacement) -> EnterTransition = ::defaultFlyoutEnterPlacementAnimation,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable MenuFlyoutScope.() -> Unit
) {
    BasicFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        enterPlacementAnimation = enterPlacementAnimation,
        shape = shape,
        positionProvider = positionProvider,
        contentPadding = PaddingValues(vertical = 3.dp),
        onKeyEvent = onKeyEvent,
        onPreviewKeyEvent = onPreviewKeyEvent,
        focusable = false
    ) {
        val state = rememberScrollState()
        Column(
            modifier = Modifier
                .scrollbar(state = state, orientation = Orientation.Vertical)
                .width(IntrinsicSize.Max)
                .verticalScroll(state)
        ) {
            val scope = remember { MenuFlyoutScopeImpl() }
            scope.content()
        }

    }
}

/**
 * A separator for a [MenuFlyout].
 *
 * Separators help group related menu items, making the menu easier to scan.
 *
 * @param modifier The [Modifier] to be applied to this separator.
 */
@Composable
fun MenuFlyoutSeparator(modifier: Modifier = Modifier) {
    ListItemSeparator(modifier)
}

/**
 * Creates a selectable item within a [MenuFlyout].
 *
 * This composable represents a single item in the menu that can be selected.
 * It allows for customization of the item's appearance, including text, icon,
 * trailing content, colors, and interaction behavior.
 *
 * @param selected Indicates whether the item is currently selected.
 * @param onSelectedChanged Callback invoked when the selected state of the item changes.
 *   It receives the new selected state as a parameter.
 * @param text The content of the menu item, typically a text label.
 * @param modifier Modifier to be applied to the menu item.
 * @param icon Optional icon to display alongside the text.
 * @param trailing Optional content to display at the end of the item, after the text.
 * @param interaction Optional [MutableInteractionSource] to observe and control the item's interactions.
 * @param enabled Controls whether the item is enabled or disabled.
 * @param selectionType The type of selection behavior for the item.
 *   See [ListItemSelectionType] for available options.
 * @param colors The colors used to represent the different states of the item.
 *   Defaults to [ListItemDefaults.selectedListItemColors] when selected,
 *   or [ListItemDefaults.defaultListItemColors] otherwise.
 */
@Composable
fun MenuFlyoutScope.MenuFlyoutItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    selectionType: ListItemSelectionType = ListItemSelectionType.Standard,
    colors: VisualStateScheme<ListItemColor> = if (selected) {
        ListItemDefaults.selectedListItemColors()
    } else {
        ListItemDefaults.defaultListItemColors()
    }
) {
    val actualInteraction = interaction ?: remember { MutableInteractionSource() }
    registerHoveredMenuItem(actualInteraction) {}
    ListItem(
        selected = selected,
        selectionType = selectionType,
        onSelectedChanged = onSelectedChanged,
        icon = icon,
        text = text,
        modifier = modifier,
        trailing = trailing,
        interaction = interaction,
        enabled = enabled,
        colors = colors
    )
}

/**
 * Represents an item within a [MenuFlyout].
 *
 * @param onClick The callback to be invoked when the item is clicked.
 * @param text The composable function that provides the text content of the item.
 * @param modifier The modifier to be applied to the item.
 * @param icon The composable function that provides the leading icon of the item.
 * @param trailing The composable function that provides the trailing content of the item.
 * @param interaction The [MutableInteractionSource] representing the stream of interactions for this item.
 * @param enabled Whether the item is enabled or not.
 * @param colors The color scheme for this item, default is [ListItemDefaults.defaultListItemColors].
 */
@Composable
fun MenuFlyoutScope.MenuFlyoutItem(
    onClick: () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = ListItemDefaults.defaultListItemColors()
) {
    val actualInteraction = interaction ?: remember { MutableInteractionSource() }
    registerHoveredMenuItem(actualInteraction) {}
    ListItem(
        onClick = onClick,
        icon = icon,
        text = text,
        modifier = modifier,
        trailing = trailing,
        interaction = interaction,
        enabled = enabled,
        colors = colors
    )
}

/**
 * A menu flyout item that can expand to show a sub-menu.
 *
 * @param items The content of the sub-menu.
 * @param text The text content of the menu item.
 * @param modifier The modifier to apply to the menu item.
 * @param icon The icon to display in the menu item.
 * @param interaction The interaction source for the menu item.
 * @param enabled Whether the menu item is enabled.
 * @param colors The colors to use for the menu item.
 */
@Composable
fun MenuFlyoutScope.MenuFlyoutItem(
    items: @Composable MenuFlyoutScope.() -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = ListItemDefaults.defaultListItemColors(),
) {
    val paddingTop = with(LocalDensity.current) { flyoutPopPaddingFixShadowRender.roundToPx() }
    BasicFlyoutContainer(
        flyout = {
            MenuFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                positionProvider = rememberSubMenuFlyoutPositionProvider(),
                enterPlacementAnimation = {
                    defaultMenuFlyoutEnterPlacementAnimation(
                        it,
                        paddingTop
                    )
                },
                content = items
            )
        },
        initialVisible = false
    ) {
        val interactionSource = interaction ?: remember { MutableInteractionSource() }
        MenuFlyoutItem(
            onClick = { isFlyoutVisible = !isFlyoutVisible },
            icon = icon,
            text = text,
            trailing = { ListItemDefaults.CascadingIcon() },
            modifier = modifier,
            interaction = interactionSource,
            enabled = enabled,
            colors = colors
        )

        registerHoveredMenuItem(interactionSource) {
            isFlyoutVisible = it
        }
    }
}

internal class MenuFlyoutScopeImpl : MenuFlyoutScope {
    var latestHoveredItem: String? by mutableStateOf(null)

    @OptIn(ExperimentalUuidApi::class)
    @Composable
    override fun registerHoveredMenuItem(
        interaction: MutableInteractionSource,
        onDelayedHoveredChanged: (hovered: Boolean) -> Unit
    ) {
        val isHovered = interaction.collectIsHoveredAsState()
        val uuid = remember { Uuid.random().toString() }
        val delayHovered = remember { mutableStateOf(false) }
        LaunchedEffect(isHovered.value) {
            if (isHovered.value) {
                latestHoveredItem = uuid
                delay(250)
                delayHovered.value = true
            }
        }

        LaunchedEffect(latestHoveredItem, delayHovered.value) {
            if (latestHoveredItem != uuid) {
                delayHovered.value = false
            }
            onDelayedHoveredChanged(latestHoveredItem == uuid && delayHovered.value)
        }
    }
}

@Deprecated(
    message = "use ListItemColorScheme instead",
    replaceWith = ReplaceWith(
        expression = "ListItemColorScheme",
        imports = arrayOf("io.github.composefluent.component.ListItemColorScheme")
    )
)
typealias MenuColors = ListItemColorScheme

@Deprecated(
    message = "use ListItemColor instead",
    replaceWith = ReplaceWith(
        "ListItemColor",
        imports = arrayOf("io.github.composefluent.component.ListItemColor")
    )
)
typealias MenuColor = ListItemColor

/**
 * Scope for the content of a [MenuFlyout].
 *
 * This scope provides functions to register menu items that need to track their hover state,
 * which is useful for managing the display of submenus or highlighting items.
 */
interface MenuFlyoutScope {

    /**
     * Registers a menu item to track its hovered state with a delay.
     *
     * This function uses a [MutableInteractionSource] to monitor the hovered state of a menu item.
     * It introduces a delay before considering the item as truly hovered to avoid flickering
     * when the user's mouse briefly passes over the item.
     *
     * @param interaction The [MutableInteractionSource] associated with the menu item to track.
     * @param onDelayedHoveredChanged A callback that is invoked when the delayed hovered state of the item changes.
     *        The `hovered` parameter indicates whether the item is considered hovered after the delay.
     */
    @Composable
    fun registerHoveredMenuItem(
        interaction: MutableInteractionSource,
        onDelayedHoveredChanged: (hovered: Boolean) -> Unit
    )
}

/**
 * Scope for the content of a [MenuFlyoutContainer].
 *
 * Inherits from [MenuFlyoutScope] and [FlyoutContainerScope], providing functionalities
 * for both menu items and container-level flyout operations.
 */
interface MenuFlyoutContainerScope : MenuFlyoutScope, FlyoutContainerScope

private class MenuFlyoutContainerScopeImpl(
    flyoutScope: FlyoutContainerScope,
    menuFlyoutScope: MenuFlyoutScope
) : MenuFlyoutContainerScope, FlyoutContainerScope by flyoutScope,
    MenuFlyoutScope by menuFlyoutScope

internal fun defaultMenuFlyoutEnterPlacementAnimation(
    placement: FlyoutPlacement,
    paddingTop: Int
): EnterTransition {
    return fadeIn(menuFlyoutEnterSpec()) + when (placement) {
        FlyoutPlacement.Auto, FlyoutPlacement.Full -> scaleIn(menuFlyoutEnterSpec())

        // slide from top
        FlyoutPlacement.Start,
        FlyoutPlacement.End,
        FlyoutPlacement.Bottom,
        FlyoutPlacement.BottomAlignedStart,
        FlyoutPlacement.BottomAlignedEnd,
        FlyoutPlacement.StartAlignedTop,
        FlyoutPlacement.EndAlignedTop -> slideInVertically(menuFlyoutEnterSpec()) { -paddingTop } +
                expandVertically(
                    animationSpec = menuFlyoutEnterSpec(),
                    expandFrom = Alignment.Top,
                    initialHeight = { it }
                )

        //slide from bottom
        FlyoutPlacement.Top,
        FlyoutPlacement.TopAlignedStart,
        FlyoutPlacement.TopAlignedEnd,
        FlyoutPlacement.StartAlignedBottom,
        FlyoutPlacement.EndAlignedBottom -> slideInVertically(menuFlyoutEnterSpec()) { paddingTop } +
                expandVertically(
                    animationSpec = menuFlyoutEnterSpec(),
                    initialHeight = { it }
                )
    }
}

@Composable
internal fun rememberSubMenuFlyoutPositionProvider(
    initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    paddingToAnchor: PaddingValues = PaddingValues(vertical = flyoutDefaultPadding)
): SubMenuFlyoutPositionProvider {
    val density = LocalDensity.current
    return remember(initialPlacement, density, paddingToAnchor) {
        SubMenuFlyoutPositionProvider(density, initialPlacement, paddingToAnchor)
    }
}

@Stable
internal class SubMenuFlyoutPositionProvider(
    density: Density,
    initialPlacement: FlyoutPlacement,
    paddingToAnchor: PaddingValues,
) : FlyoutPositionProvider(density, initialPlacement, paddingToAnchor) {
    override fun Density.calculateTargetPlacement(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: Size
    ): Pair<HorizontalPlacement, VerticalPlacement> {
        return calculatePlacementByHorizontal(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        )
    }
}

private fun <T> menuFlyoutEnterSpec() =
    tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
