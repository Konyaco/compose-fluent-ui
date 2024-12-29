package com.konyaco.fluent.component

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.MoreHorizontal
import com.konyaco.fluent.layout.overflow.OverflowRow
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import kotlin.jvm.JvmInline
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Composable
fun MenuBar(
    modifier: Modifier = Modifier,
    content: @Composable MenuBarScope.() -> Unit
) {
    val scope = remember { MenuBarItemScopeImpl() }
    Row(
        modifier = modifier.height(MenuBarHeight),
        horizontalArrangement = Arrangement.spacedBy(MenuBarItemSpacing),
        verticalAlignment = Alignment.CenterVertically,
        content = { scope.content() }
    )
}

@Composable
fun MenuBarScope.MenuBarItem(
    items: @Composable MenuFlyoutContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val item = registerMenuBarItem(interactionSource)
    Box(modifier = modifier, propagateMinConstraints = true) {
        val containerScope = rememberNavigationItemsFlyoutScope(
            expanded = currentItem == item,
            onExpandedChanged = {
                if (it) {
                    currentItem = item
                } else if (currentItem == item) {
                    currentItem = null
                }
            }
        )
        MenuFlyout(
            visible = containerScope.isFlyoutVisible,
            onDismissRequest = { containerScope.isFlyoutVisible = false },
            positionProvider = rememberFlyoutPositionProvider(
                initialPlacement = FlyoutPlacement.BottomAlignedStart,
                adaptivePlacement = true,
                paddingToAnchor = PaddingValues()
            ),
            content = { items(containerScope) }
        )

        MenuBarButton(
            selected = currentItem == item,
            onClick = { currentItem = item },
            interaction = interactionSource,
            content = { content() }
        )
    }
}

@Composable
fun OverflowMenuBarItemScope.MenuBarItem(
    items: @Composable MenuFlyoutContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val item = registerMenuBarItem(interactionSource)
    Box(modifier = modifier, propagateMinConstraints = true) {
        val containerScope = rememberNavigationItemsFlyoutScope(
            expanded = currentItem == item,
            onExpandedChanged = {
                if (it) {
                    currentItem = item
                } else if (currentItem == item) {
                    currentItem = null
                }
            }
        )
        if (!isOverflow) {
            MenuFlyout(
                visible = containerScope.isFlyoutVisible,
                onDismissRequest = { containerScope.isFlyoutVisible = false },
                positionProvider = rememberFlyoutPositionProvider(
                    initialPlacement = FlyoutPlacement.BottomAlignedStart,
                    adaptivePlacement = true,
                    paddingToAnchor = PaddingValues()
                ),
                content = { items(containerScope) }
            )

            MenuBarButton(
                selected = currentItem == item,
                onClick = { currentItem = item },
                interaction = interactionSource,
                content = { content() }
            )
        } else {

            Box(modifier = modifier, propagateMinConstraints = true) {
                val containerScope = rememberNavigationItemsFlyoutScope(
                    expanded = currentItem == item,
                    onExpandedChanged = {
                        if (it) {
                            currentItem = item
                        } else if (currentItem == item) {
                            currentItem = null
                        }
                    }
                )
                val paddingTop = with(LocalDensity.current) { flyoutPopPaddingFixShadowRender.roundToPx() }
                MenuFlyout(
                    visible = containerScope.isFlyoutVisible,
                    onDismissRequest = { containerScope.isFlyoutVisible = false },
                    positionProvider = rememberSubMenuFlyoutPositionProvider(),
                    enterPlacementAnimation = {
                        defaultMenuFlyoutEnterPlacementAnimation(it, paddingTop)
                    },
                    content = { items(containerScope) }
                )

                ListItem(
                    onClick = { currentItem = item },
                    trailing = { ListItemDefaults.CascadingIcon() },
                    text = { content() },
                    interaction = interactionSource,
                    colors = if (currentItem == item) {
                        ListItemDefaults.selectedListItemColors()
                    } else {
                        ListItemDefaults.defaultListItemColors()
                    }
                )
            }
        }
    }
}

@Composable
fun OverflowMenuBar(
    modifier: Modifier = Modifier,
    content: OverflowMenuBarScope.() -> Unit
) {
    val menuBarScope = remember { MenuBarItemScopeImpl() }
    val overflowItems = remember { mutableListOf<MenuBarItem>() }
    OverflowRow(
        modifier = modifier.height(MenuBarHeight),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(MenuBarItemSpacing),
        overflowAction = {
            var expanded by remember { mutableStateOf(false) }
            Box {
                MenuFlyout(
                    visible = expanded,
                    onDismissRequest = { expanded = false },
                    positionProvider = rememberFlyoutPositionProvider(
                        initialPlacement = FlyoutPlacement.BottomAlignedEnd,
                        adaptivePlacement = false,
                        paddingToAnchor = PaddingValues()
                    ),
                    content = {
                        repeat(overflowItemCount) { index ->
                            overflowItem(index)
                        }
                    }
                )
                val interactionSource = remember { MutableInteractionSource() }
                val item = menuBarScope.registerMenuBarItem(interactionSource)
                DisposableEffect(item, overflowItems) {
                    overflowItems.add(item)
                    onDispose {
                        overflowItems.remove(item)
                    }
                }
                LaunchedEffect(menuBarScope.currentItem, overflowItems) {
                    if (menuBarScope.currentItem != null) {
                        expanded = menuBarScope.currentItem in overflowItems
                    }
                }
                MenuBarButton(
                    selected = expanded,
                    onClick = { menuBarScope.currentItem = item },
                    interaction = interactionSource,
                    content = {
                        FontIcon(
                            glyph = '\uE712',
                            vector = Icons.Default.MoreHorizontal,
                            contentDescription = null,
                        )
                    }
                )
            }
        }
    ) {
        OverflowMenuBarScopeImpl(this, overflowItems, menuBarScope).content()
    }
}

@Composable
fun MenuBarButton(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    interaction: MutableInteractionSource = remember { MutableInteractionSource() },
    buttonColors: ButtonColorScheme = if (selected) {
        MenuBarDefaults.selectedItemColors()
    } else {
        MenuBarDefaults.defaultItemColors()
    },
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit,
) {
    SubtleButton(
        interaction = interaction,
        buttonColors = buttonColors,
        onClick = onClick,
        content = { content() },
        disabled = !enabled,
        modifier = modifier
    )
}

object MenuBarDefaults {

    @Stable
    @Composable
    fun selectedItemColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary,
        ),
        pressed: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.text.disabled
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled,
    )

    @Stable
    @Composable
    fun defaultItemColors(
        default: ButtonColor = ButtonColor(
            fillColor = FluentTheme.colors.subtleFill.transparent,
            contentColor = FluentTheme.colors.text.text.primary,
            borderBrush = SolidColor(Color.Transparent)
        ),
        hovered: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.secondary,
        ),
        pressed: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary
        ),
        disabled: ButtonColor = default.copy(
            fillColor = FluentTheme.colors.subtleFill.disabled,
            contentColor = FluentTheme.colors.text.text.disabled
        )
    ) = ButtonColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled,
    )
}

interface MenuBarScope : MenuBarItemScope

interface OverflowMenuBarScope {
    fun item(
        key: Any? = null,
        contentType: Any? = null,
        content: @Composable OverflowMenuBarItemScope.() -> Unit
    )

    fun items(
        count: Int,
        key: ((index: Int) -> Any)? = null,
        contentType: (index: Int) -> Any? = { null },
        itemContent: @Composable OverflowMenuBarItemScope.(index: Int) -> Unit
    )
}

@Immutable
private class OverflowMenuBarScopeImpl(
    private val rowScope: OverflowRowScope,
    overflowItems: MutableList<MenuBarItem>,
    menuBarScope: MenuBarItemScope = MenuBarItemScopeImpl(),
) : OverflowMenuBarScope {
    private val normalItemScope = NormalItemScope(menuBarScope)
    private val overflowItemScope = OverflowItemScope(overflowItems, menuBarScope)

    override fun items(
        count: Int,
        key: ((Int) -> Any)?,
        contentType: (Int) -> Any?,
        itemContent: @Composable (OverflowMenuBarItemScope.(Int) -> Unit)
    ) {
        rowScope.items(count, key, contentType) {
            if (isOverflow) {
                overflowItemScope.itemContent(it)
            } else {
                normalItemScope.itemContent(it)
            }
        }
    }

    override fun item(
        key: Any?,
        contentType: Any?,
        content: @Composable OverflowMenuBarItemScope.() -> Unit
    ) {
        rowScope.item(key, contentType) {
            if (isOverflow) {
                overflowItemScope.content()
            } else {
                normalItemScope.content()
            }
        }
    }

    class NormalItemScope(
        private val itemScopeDelegate: MenuBarItemScope
    ) : OverflowMenuBarItemScope, MenuBarItemScope by itemScopeDelegate {
        override val isOverflow: Boolean
            get() = false
    }

    class OverflowItemScope(
        private val items: MutableList<MenuBarItem>,
        private val itemScopeDelegate: MenuBarItemScope
    ) : OverflowMenuBarItemScope, MenuBarItemScope by itemScopeDelegate {
        override val isOverflow: Boolean
            get() = true

        @Composable
        override fun registerMenuBarItem(interactionSource: InteractionSource): MenuBarItem {
            val item = itemScopeDelegate.registerMenuBarItem(interactionSource)
            DisposableEffect(items, item) {
                items.add(item)
                onDispose {
                    items.remove(item)
                }
            }
            return item
        }
    }
}

interface OverflowMenuBarItemScope : MenuBarItemScope {
    val isOverflow: Boolean
}

interface MenuBarItemScope {

    var currentItem: MenuBarItem?

    @Composable
    fun registerMenuBarItem(
        interactionSource: InteractionSource,
    ): MenuBarItem
}

@JvmInline
@OptIn(ExperimentalUuidApi::class)
value class MenuBarItem internal constructor(private val uuid: Uuid)

@OptIn(ExperimentalUuidApi::class)
private class MenuBarItemScopeImpl() : MenuBarScope {

    override var currentItem: MenuBarItem? by mutableStateOf(null)

    @Composable
    override fun registerMenuBarItem(
        interactionSource: InteractionSource
    ): MenuBarItem {
        val isHovered by interactionSource.collectIsHoveredAsState()
        val menuBarItem = remember {
            MenuBarItem(Uuid.random())
        }
        LaunchedEffect(isHovered, menuBarItem) {
            if (currentItem != null && currentItem != menuBarItem && isHovered) {
                currentItem = menuBarItem
            }
        }
        return menuBarItem
    }
}

private val MenuBarItemSpacing = 8.dp
private val MenuBarHeight = 48.dp