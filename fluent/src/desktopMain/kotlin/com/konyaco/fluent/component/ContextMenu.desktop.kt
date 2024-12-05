package com.konyaco.fluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.ContextMenuArea
import androidx.compose.foundation.ContextMenuItem
import androidx.compose.foundation.ContextMenuRepresentation
import androidx.compose.foundation.ContextMenuState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.TextContextMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.isAltPressed
import androidx.compose.ui.input.key.isCtrlPressed
import androidx.compose.ui.input.key.isMetaPressed
import androidx.compose.ui.input.key.isShiftPressed
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLocalization
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import androidx.compose.ui.unit.sp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.FluentContextMenuItem.KeyData
import org.jetbrains.skiko.hostOs

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
                            it.keyData.isCtrlPressed == (if (hostOs.isMacOS) keyEvent.isMetaPressed else keyEvent.isCtrlPressed) &&
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
                        icon = if (shouldPaddingIcon) {
                            {

                                if (it.glyph != null && LocalFontIconFontFamily.current != null) {
                                    FontIcon(
                                        glyph = it.glyph,
                                        vector = it.vector?.let { vector -> { vector } },
                                        contentDescription = it.label,
                                    )
                                } else if (it.vector != null) {
                                    Icon(
                                        it.vector, it.label,
                                        modifier = Modifier.size(with(LocalDensity.current) { ((FontIconSize.Standard.value + 2).sp).toDp() })
                                    )
                                }
                            }
                        } else {
                            null
                        },
                        trailing = {
                            it.keyData?.let { keyData ->
                                val keyString = remember(keyData) {
                                    buildString {
                                        if (!hostOs.isMacOS) {
                                            if (keyData.isAltPressed) {
                                                append("Alt+")
                                            }
                                            if (keyData.isCtrlPressed) {
                                                append("Ctrl+")
                                            }
                                            if (keyData.isShiftPressed) {
                                                append("Shift+")
                                            }
                                        } else {
                                            if (keyData.isAltPressed) {
                                                append("⌥ ")
                                            }
                                            if (keyData.isCtrlPressed) {
                                                append("⌘ ")
                                                }
                                            if (keyData.isShiftPressed) {
                                                append("⇧ ")
                                            }
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
                        }
                    )
                } else {
                    MenuFlyoutItem(
                        onClick = {
                            it.onClick()
                            state.status = ContextMenuState.Status.Closed
                        },
                        text = { Text(it.label) },
                        icon = if (shouldPaddingIcon) { {} } else { null },
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
                        icon = FontIconPrimitive.Cut,
                        keyData = KeyData(Key.X, isCtrlPressed = true)
                    )
                },
                textManager.copy?.let {
                    FluentContextMenuItem(
                        label = localization.copy,
                        onClick = it,
                        icon = FontIconPrimitive.Copy,
                        keyData = KeyData(Key.C, isCtrlPressed = true)
                    )
                },
                textManager.paste?.let {
                    FluentContextMenuItem(
                        label = localization.paste,
                        onClick = it,
                        icon = FontIconPrimitive.Paste,
                        keyData = KeyData(Key.V, isCtrlPressed = true)
                    )
                },
                textManager.selectAll?.let {
                    FluentContextMenuItem(
                        label = localization.selectAll,
                        onClick = it,
                        keyData = KeyData(Key.A, isCtrlPressed = true),
                    )
                },
            )
        }
        ContextMenuArea(items, state, content = content)
    }

}

fun FluentContextMenuItem(
    label: String,
    onClick: () -> Unit,
    icon: FontIconPrimitive,
    keyData: KeyData? = null,
) = FluentContextMenuItem(
    label = label,
    onClick = onClick,
    glyph = icon.glyph,
    vector = icon.vector(),
    keyData = keyData
)

class FluentContextMenuItem(
    label: String,
    onClick: () -> Unit,
    val vector: ImageVector? = null,
    val keyData: KeyData? = null,
    val glyph: Char? = null
) : ContextMenuItem(label, onClick) {
    data class KeyData(
        val key: Key,
        // option key in macOS, otherwise alt key
        val isAltPressed: Boolean = false,
        //command[modifier is meta] key in macOS, otherwise control key
        val isCtrlPressed: Boolean = false,
        // shift key
        val isShiftPressed: Boolean = false
    )
}

private class ContextMenuFlyoutPositionProvider(
    val rect: Rect,
    density: Density,
) : FlyoutPositionProvider(
    density = density,
    adaptivePlacement = true,
    initialPlacement = FlyoutPlacement.BottomAlignedStart
) {

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