package com.konyaco.fluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.TextContextMenu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.*
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLocalization
import androidx.compose.ui.unit.*
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Copy
import com.konyaco.fluent.icons.regular.Cut
import com.konyaco.fluent.icons.regular.ClipboardPaste

internal object FluentContextMenuRepresentation : ContextMenuRepresentation {
    @Composable
    override fun Representation(state: ContextMenuState, items: () -> List<ContextMenuItem>) {
        var rect by remember {
            mutableStateOf(Rect.Zero)
        }
        var visible by remember {
            mutableStateOf(false)
        }
        val status = state.status
        LaunchedEffect(status) {
            if (status is ContextMenuState.Status.Open) {
                rect = status.rect
                visible = true
            } else {
                visible = false
            }
        }
        val density = LocalDensity.current
        MenuFlyout(
            visible = visible,
            onDismissRequest = { state.status = ContextMenuState.Status.Closed },
            onKeyEvent = { keyEvent ->
                items().firstOrNull {
                    val result = it is FluentContextMenuItem &&
                            keyEvent.type == KeyEventType.KeyDown &&
                            it.keyData != null &&
                            it.keyData.isAltPressed == keyEvent.isAltPressed &&
                            it.keyData.isCtrlPressed == keyEvent.isCtrlPressed &&
                            it.keyData.isShiftPressed == keyEvent.isShiftPressed &&
                            it.keyData.key == keyEvent.key
                    if (result) {
                        it.onClick()
                        state.status = ContextMenuState.Status.Closed
                    }
                    result
                } != null
            },
            positionProvider = remember(rect, density) {
                ContextMenuFlyoutPositionProvider(rect, density)
            },
            enterPlacementAnimation = { enterAnimation() }
        ) {
            val menuItems = items()
            val shouldPaddingIcon =
                menuItems.any { it is FluentContextMenuItem && (it.glyph != null || it.vector != null) }
            menuItems.forEach {
                if (it is FluentContextMenuItem) {
                    MenuFlyoutItem(
                        text = {
                            Text(it.label, modifier = Modifier)
                        },
                        icon = {
                            if (it.glyph != null && LocalFontIconFontFamily.current != null) {
                                FontIcon(it.glyph, modifier = Modifier)
                            } else if (it.vector != null) {
                                Icon(it.vector, it.label, modifier = Modifier.size(20.dp))
                            }
                        },
                        training = {
                            it.keyData?.let { keyData ->
                                val keyString = remember(keyData) {
                                    buildString {
                                        if (keyData.isAltPressed) {
                                            append("Alt+")
                                        }
                                        if (keyData.isCtrlPressed) {
                                            append("Ctrl+")
                                        }
                                        if (keyData.isShiftPressed) {
                                            append("Shift+")
                                        }
                                        append(keyData.key.toString().removePrefix("Key: "))
                                    }
                                }
                                Text(
                                    text = keyString,
                                    modifier = Modifier.padding(start = 16.dp, end = 8.dp)
                                )
                            }
                        },
                        onClick = {
                            it.onClick()
                            state.status = ContextMenuState.Status.Closed
                        },
                        paddingIcon = shouldPaddingIcon
                    )
                } else {
                    MenuFlyoutItem(
                        onClick = {
                            it.onClick()
                            state.status = ContextMenuState.Status.Closed
                        },
                        icon = {

                        },
                        text = { Text(it.label) },
                        paddingIcon = true
                    )
                }
            }
        }
    }


    private fun enterAnimation(): EnterTransition {
        return fadeIn(defaultAnimationSpec())
    }

    private fun <T> defaultAnimationSpec() =
        tween<T>(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
}

@OptIn(ExperimentalFoundationApi::class)
internal object FluentTextContextMenu : TextContextMenu {

    @Composable
    override fun Area(
        textManager: TextContextMenu.TextManager,
        state: ContextMenuState,
        content: @Composable () -> Unit
    ) {
        val localization = LocalLocalization.current
        val items = {
            listOfNotNull(
                textManager.cut?.let {
                    FluentContextMenuItem(
                        label = localization.cut,
                        onClick = it,
                        glyph = '\uE8C6',
                        vector = Icons.Default.Cut,
                        keyData = FluentContextMenuItem.KeyData(Key.X, isCtrlPressed = true)
                    )
                },
                textManager.copy?.let {
                    FluentContextMenuItem(
                        label = localization.copy,
                        onClick = it,
                        glyph = '\uE8C8',
                        vector = Icons.Default.Copy,
                        keyData = FluentContextMenuItem.KeyData(Key.C, isCtrlPressed = true)
                    )
                },
                textManager.paste?.let {
                    FluentContextMenuItem(
                        label = localization.paste,
                        onClick = it,
                        glyph = '\uE77F',
                        vector = Icons.Default.ClipboardPaste,
                        keyData = FluentContextMenuItem.KeyData(Key.V, isCtrlPressed = true)
                    )
                },
                textManager.selectAll?.let {
                    FluentContextMenuItem(
                        label = localization.selectAll,
                        onClick = it,
                        keyData = FluentContextMenuItem.KeyData(Key.A, isCtrlPressed = true),
                    )
                },
            )
        }
        ContextMenuArea(items, state, content = content)
    }
}

class FluentContextMenuItem(
    label: String,
    onClick: () -> Unit,
    val vector: ImageVector? = null,
    val keyData: KeyData? = null,
    val glyph: Char? = null
) : ContextMenuItem(label, onClick) {
    data class KeyData(
        val key: Key,
        val isAltPressed: Boolean = false,
        val isCtrlPressed: Boolean = false,
        val isShiftPressed: Boolean = false
    )
}

private class ContextMenuFlyoutPositionProvider(
    val rect: Rect,
    density: Density,
) : FlyoutPositionProvider(density = density, adaptivePlacement = true, initialPlacement = FlyoutPlacement.BottomAlignedStart) {

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val targetAnchor = IntRect(
            offset = rect.center.round() + anchorBounds.topLeft,
            size = IntSize.Zero
        )
        return super.calculatePosition(targetAnchor, windowSize, layoutDirection, popupContentSize)
    }
}