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
import androidx.compose.foundation.interaction.collectIsPressedAsState
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
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.benasher44.uuid.uuid4
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronRight
import com.konyaco.fluent.shape.FluentRoundedCornerShape
import kotlinx.coroutines.delay

@Composable
fun MenuFlyoutContainer(
    flyout: @Composable MenuFlyoutScope.() -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    onKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    onPreviewKeyEvent: ((keyEvent: KeyEvent) -> Boolean)? = null,
    content: @Composable FlyoutScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            MenuFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                placement = placement,
                content = flyout,
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
        positionProvider = rememberFlyoutPositionProvider(placement),
        content = content,
        onKeyEvent = onKeyEvent,
        onPreviewKeyEvent = onPreviewKeyEvent
    )
}

@Composable
private fun MenuFlyout(
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
    colors: MenuColors = menuColors(),
    paddingIcon: Boolean = false,
) {
    val actualInteraction = interaction ?: remember { MutableInteractionSource() }
    val hovered by actualInteraction.collectIsHoveredAsState()
    val pressed by actualInteraction.collectIsPressedAsState()

    val menuColor = when {
        !enabled -> colors.disabled
        pressed -> colors.pressed
        hovered -> colors.hovered
        else -> colors.default
    }

    val fillColor by animateColorAsState(
        menuColor.fillColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )

    val contentColor by animateColorAsState(
        menuColor.contentColor,
        animationSpec = tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
    )
    registerHoveredMenuItem(actualInteraction) {}
    Layer(
        modifier = modifier
            .padding(horizontal = 4.dp, vertical = 2.dp).defaultMinSize(
                minWidth = 108.dp,
                minHeight = 28.dp
            ).fillMaxWidth(),
        shape = FluentRoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, menuColor.borderBrush),
        color = fillColor,
        contentColor = contentColor,
        outsideBorder = true
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
            text()
            CompositionLocalProvider(
                LocalContentColor provides menuColor.trainingColor,
                LocalContentAlpha provides menuColor.trainingColor.alpha
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
    colors: MenuColors = menuColors(),
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

@Immutable
data class MenuColors(
    val default: MenuColor,
    val hovered: MenuColor,
    val pressed: MenuColor,
    val disabled: MenuColor
)

@Immutable
data class MenuColor(
    val fillColor: Color,
    val contentColor: Color,
    val trainingColor: Color,
    val borderBrush: Brush
)

@Composable
private fun menuColors(): MenuColors {
    val colors = FluentTheme.colors
    return remember(colors) {
        MenuColors(
            default = MenuColor(
                colors.subtleFill.transparent,
                colors.text.text.primary,
                colors.text.text.primary.copy(0.6f),
                SolidColor(Color.Transparent)
            ),
            hovered = MenuColor(
                colors.subtleFill.secondary,
                colors.text.text.primary,
                colors.text.text.primary.copy(0.6f),
                SolidColor(Color.Transparent)
            ),
            pressed = MenuColor(
                colors.subtleFill.tertiary,
                colors.text.text.secondary,
                colors.text.text.secondary.copy(0.6f),
                SolidColor(Color.Transparent)
            ),
            disabled = MenuColor(
                colors.subtleFill.disabled,
                colors.text.text.disabled,
                colors.text.text.disabled,
                SolidColor(Color.Transparent)
            ),
        )
    }
}

interface MenuFlyoutScope {

    @Composable
    fun registerHoveredMenuItem(
        interaction: MutableInteractionSource,
        onDelayedHoveredChanged: (hovered: Boolean) -> Unit
    )
}

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
        return calculateHorizontalPlacement(
            anchorBounds,
            windowSize,
            layoutDirection,
            popupContentSize
        )
    }
}

private fun <T> menuFlyoutEnterSpec() =
    tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)