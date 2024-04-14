package com.konyaco.fluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.benasher44.uuid.uuid4
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronRight
import com.konyaco.fluent.scheme.ValueVisualStateScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectCurrentScheme
import kotlinx.coroutines.delay

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
    shape: Shape = RoundedCornerShape(8.dp),
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable MenuFlyoutScope.() -> Unit
) {
    MenuFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        shape = shape,
        positionProvider = rememberFlyoutPositionProvider(placement, adaptivePlacement = adaptivePlacement),
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
    shape: Shape = RoundedCornerShape(8.dp),
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
        contentPadding = PaddingValues(vertical = 2.dp),
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
    Box(
        Modifier
            .then(modifier)
            .fillMaxWidth().height(1.dp)
            .background(FluentTheme.colors.stroke.surface.default.copy(0.1f))
    )
}

@Composable
fun MenuFlyoutScope.MenuFlyoutItem(
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    training: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<MenuItemColor> = MenuFlyoutDefaults.defaultMenuItemColors(),
    paddingIcon: Boolean = false,
) {
    val actualInteraction = interaction ?: remember { MutableInteractionSource() }
    val color = colors.collectCurrentScheme(actualInteraction, !enabled)

    val fillColor by animateColorAsState(
        color.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        color.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )
    registerHoveredMenuItem(actualInteraction) {}
    Layer(
        modifier = modifier
            .padding(horizontal = 4.dp, vertical = 2.dp).defaultMinSize(
                minWidth = 108.dp,
                minHeight = 30.dp
            ).fillMaxWidth(),
        shape = RoundedCornerShape(size = 4.dp),
        color = fillColor,
        contentColor = contentColor,
        border = BorderStroke(1.dp, color.borderBrush),
        backgroundSizing = BackgroundSizing.InnerBorderEdge
    ) {
        Row(
            modifier = Modifier
                .clickable(
                    onClick = onClick,
                    interactionSource = actualInteraction,
                    indication = null,
                    enabled = enabled
                )
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.then(
                    if (paddingIcon) {
                        Modifier.defaultMinSize(minWidth = 16.dp)
                    } else {
                        Modifier
                    }
                ),
                contentAlignment = Alignment.Center
            ) {
                icon()
            }
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                text()
            }
            CompositionLocalProvider(
                LocalContentColor provides color.trainingColor,
                LocalContentAlpha provides color.trainingColor.alpha,
                LocalTextStyle provides FluentTheme.typography.caption.copy(fontWeight = FontWeight.Normal)
            ) {
                training?.invoke()
            }
        }
    }
}

@Composable
fun MenuFlyoutScope.MenuFlyoutItem(
    items: @Composable MenuFlyoutScope.() -> Unit,
    icon: (@Composable () -> Unit),
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<MenuItemColor> = MenuFlyoutDefaults.defaultMenuItemColors(),
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
            training = {
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    modifier = Modifier.size(12.dp).offset(x = 6.dp)
                )
            },
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


private class MenuFlyoutScopeImpl : MenuFlyoutScope {
    var latestHoveredItem: String? by mutableStateOf(null)

    @Composable
    override fun registerHoveredMenuItem(
        interaction: MutableInteractionSource,
        onDelayedHoveredChanged: (hovered: Boolean) -> Unit
    ) {
        val isHovered = interaction.collectIsHoveredAsState()
        val uuid = remember { uuid4().toString() }
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
    message = "use MenuItemColorScheme instead",
    replaceWith = ReplaceWith(
        expression = "MenuItemColorScheme",
        imports = arrayOf("com.konyaco.fluent.component.MenuItemColorScheme")
    )
)
typealias MenuColors = MenuItemColorScheme
typealias MenuItemColorScheme = ValueVisualStateScheme<MenuItemColor>

@Deprecated(
    message = "use MenuItemColor instead",
    replaceWith = ReplaceWith("MenuItemColor", imports = arrayOf("com.konyaco.fluent.component.MenuItemColor"))
)
typealias MenuColor = MenuItemColor

@Immutable
data class MenuItemColor(
    val fillColor: Color,
    val contentColor: Color,
    val trainingColor: Color,
    val borderBrush: Brush
)

object MenuFlyoutDefaults {

    @Composable
    @Stable
    fun defaultMenuItemColors(
        default: MenuItemColor = MenuItemColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            trainingColor = FluentTheme.colors.text.text.primary.copy(0.6f),
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: MenuItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary
        ),
        pressed: MenuItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: MenuItemColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
            trainingColor = FluentTheme.colors.text.text.disabled,
        )
    ) = MenuItemColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    //TODO Selected MenuItemColor
}

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
) : MenuFlyoutContainerScope, FlyoutContainerScope by flyoutScope, MenuFlyoutScope by menuFlyoutScope

private fun defaultMenuFlyoutEnterPlacementAnimation(
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
private fun rememberSubMenuFlyoutPositionProvider(
    initialPlacement: FlyoutPlacement = FlyoutPlacement.Auto,
    paddingToAnchor: PaddingValues = PaddingValues(vertical = flyoutDefaultPadding)
): SubMenuFlyoutPositionProvider {
    val density = LocalDensity.current
    return remember(initialPlacement, density, paddingToAnchor) {
        SubMenuFlyoutPositionProvider(density, initialPlacement, paddingToAnchor)
    }
}

@Stable
private class SubMenuFlyoutPositionProvider(
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