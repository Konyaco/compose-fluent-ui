package com.konyaco.fluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
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
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.scheme.VisualStateScheme
import kotlinx.coroutines.delay
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

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
        onPreviewKeyEvent = onPreviewKeyEvent
    ) {
        Column(
            modifier = Modifier.width(IntrinsicSize.Max)
        ) {
            val scope = remember { MenuFlyoutScopeImpl() }
            scope.content()
        }
    }
}

@Composable
fun MenuFlyoutSeparator(modifier: Modifier = Modifier) {
    ListItemSeparator(modifier)
}

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
        imports = arrayOf("com.konyaco.fluent.component.ListItemColorScheme")
    )
)
typealias MenuColors = ListItemColorScheme

@Deprecated(
    message = "use ListItemColor instead",
    replaceWith = ReplaceWith(
        "ListItemColor",
        imports = arrayOf("com.konyaco.fluent.component.ListItemColor")
    )
)
typealias MenuColor = ListItemColor

interface MenuFlyoutScope {

    @Composable
    fun registerHoveredMenuItem(
        interaction: MutableInteractionSource,
        onDelayedHoveredChanged: (hovered: Boolean) -> Unit
    )
}

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