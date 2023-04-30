package com.konyaco.fluent.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.TextContextMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.*
import androidx.compose.ui.platform.LocalLocalization
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Copy
import com.konyaco.fluent.icons.regular.Cut
import com.konyaco.fluent.icons.regular.ClipboardPaste

internal object FluentContextMenuRepresentation : ContextMenuRepresentation {
    @Composable
    override fun Representation(state: ContextMenuState, items: () -> List<ContextMenuItem>) {
        val isOpen = state.status is ContextMenuState.Status.Open
        DropdownMenu(
            focusable = true,
            expanded = isOpen,
            onDismissRequest = {
                state.status = ContextMenuState.Status.Closed
            },
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
            }
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                items().forEach {
                    if (it is FluentContextMenuItem) {
                        DropdownMenuItem(
                            onClick = {
                                it.onClick()
                                state.status = ContextMenuState.Status.Closed
                            }
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.width(24.dp).fillMaxHeight()
                            ) {
                                if (it.glyph != null && LocalFontIconFontFamily.current != null) {
                                    FontIcon(it.glyph)
                                } else if (it.vector != null) {
                                    Icon(it.vector, it.label, modifier = Modifier.size(20.dp))
                                }
                            }
                            Text(it.label, modifier = Modifier.weight(1f))
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
                                    color = LocalContentColor.current.copy(0.6f),
                                    style = FluentTheme.typography.caption,
                                    modifier = Modifier.padding(start = 24.dp, end = 8.dp)
                                )
                            }
                        }
                    } else {
                        DropdownMenuItem(
                            onClick = {
                                it.onClick()
                                state.status = ContextMenuState.Status.Closed
                            },
                        ) {
                            Spacer(Modifier.width(28.dp))
                            Text(it.label)
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
internal object FluentTextContextMenu : TextContextMenu {

    @OptIn(ExperimentalComposeUiApi::class)
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