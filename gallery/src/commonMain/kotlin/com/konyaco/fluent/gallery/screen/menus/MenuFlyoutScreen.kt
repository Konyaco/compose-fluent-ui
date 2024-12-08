package com.konyaco.fluent.gallery.screen.menus

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.isCtrlPressed
import androidx.compose.ui.input.key.isMetaPressed
import androidx.compose.ui.input.key.key
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.ListItemDefaults
import com.konyaco.fluent.component.ListItemSelectionType
import com.konyaco.fluent.component.MenuFlyoutContainer
import com.konyaco.fluent.component.MenuFlyoutItem
import com.konyaco.fluent.component.MenuFlyoutSeparator
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.commandBarButtonSize
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowSort
import com.konyaco.fluent.icons.regular.ChevronRight
import com.konyaco.fluent.icons.regular.Copy
import com.konyaco.fluent.icons.regular.Delete
import com.konyaco.fluent.icons.regular.Share
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "Shows a contextual list of simple commands or options.")
@Composable
fun MenuFlyoutScreen() {
    GalleryPage(
        title = "MenuFlyout",
        description = "A MenuFlyout displays lightweight UI that is light dismissed by clicking or tapping off of it. " +
                "Use it to let the user choose from a contextual list of simple commands or options.",
        componentPath = FluentSourceFile.MenuFlyout,
        galleryPath = ComponentPagePath.MenuFlyoutScreen
    ) {
        Section(
            title = "A CommandBarButton with MenuFlyout",
            sourceCode = sourceCodeOfBasicMenuFlyoutSample,
            content = { BasicMenuFlyoutSample() }
        )

        Section(
            title = "A MenuFlyout with SelectableMenuFlyoutItems and MenuFlyoutSeparator",
            sourceCode = sourceCodeOfSelectableMenuFlyoutSample,
            content = { SelectableMenuFlyoutSample() }
        )

        Section(
            title = "A MenuFlyout with Cascading menus.",
            sourceCode = sourceCodeOfCascadingMenuFlyoutSample,
            content = { CascadingMenuFlyoutSample() }
        )

        Section(
            title = "A MenuFlyout with Icons.",
            sourceCode = sourceCodeOfMenuFlyoutWithIconSample,
            content = { MenuFlyoutWithIconSample() }
        )

        Section(
            title = "A MenuFlyout with Keyboard Accelerators.",
            sourceCode = sourceCodeOfMenuFlyoutWithKeyboardSample,
            content = { MenuFlyoutWithKeyboardSample() }
        )
    }
}

@Sample
@Composable
private fun BasicMenuFlyoutSample() {
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                text = { Text("By rating") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                text = { Text("By match") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                text = { Text("By distance") }
            )
        },
        content = {
            SubtleButton(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(Icons.Default.ArrowSort, contentDescription = null)
                        Icon(Icons.Default.ChevronRight, contentDescription = null, modifier = Modifier.size(12.dp))
                    }
                },
                modifier = Modifier.commandBarButtonSize()
            )
        }

    )
}

@Sample
@Composable
private fun SelectableMenuFlyoutSample() {
    var resetKey by remember { mutableStateOf(0) }
    val options = remember(resetKey) {
        listOf(
            "Repeat" to mutableStateOf(true),
            "Shuffle" to mutableStateOf(true),
        )
    }
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(
                onClick = {
                    resetKey += 1
                    isFlyoutVisible = false
                },
                icon = { },
                text = { Text("Reset") }
            )
            MenuFlyoutSeparator()
            options.forEach { (name, state) ->
                MenuFlyoutItem(
                    selected = state.value,
                    onSelectedChanged = {
                        state.value = it
                        isFlyoutVisible = false
                    },
                    selectionType = ListItemSelectionType.Radio,
                    colors = ListItemDefaults.defaultListItemColors(),
                    text = { Text(name) }
                )
            }
        },
        content = {
            Button(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = { Text("Options") }
            )
        }
    )
}

@Sample
@Composable
private fun CascadingMenuFlyoutSample() {
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                text = { Text("Open") },
            )
            MenuFlyoutItem(
                text = { Text("Send to") },
                items = {
                    MenuFlyoutItem(
                        onClick = { isFlyoutVisible = false },
                        text = { Text("Bluetooth") }
                    )
                    MenuFlyoutItem(
                        onClick = { isFlyoutVisible = false },
                        text = { Text("Desktop (shortcut)") }
                    )
                    MenuFlyoutItem(
                        text = { Text("Compressed file") },
                        items = {
                            MenuFlyoutItem(
                                onClick = { isFlyoutVisible = false },
                                text = { Text("Compress and email") }
                            )
                            MenuFlyoutItem(
                                onClick = { isFlyoutVisible = false },
                                text = { Text("Compress to .7z") }
                            )
                            MenuFlyoutItem(
                                onClick = { isFlyoutVisible = false },
                                text = { Text("Compress to .zip") }
                            )

                        }
                    )
                }
            )
        },
        content = {
            Button(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = { Text("File Options") }
            )
        }
    )
}

@Sample
@Composable
private fun MenuFlyoutWithIconSample() {
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Share, contentDescription = null) },
                text = { Text("Share") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Copy, contentDescription = null) },
                text = { Text("Copy") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Delete, contentDescription = null) },
                text = { Text("Delete") }
            )
            MenuFlyoutSeparator()
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { },
                text = { Text("Rename") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { },
                text = { Text("Select") }
            )
        },
        content = {
            Button(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = { Text("Edit Options") }
            )
        }
    )
}

@Sample
@Composable
private fun MenuFlyoutWithKeyboardSample() {
    val isMacOs = remember { isMacOs() }
    var closeAction by remember { mutableStateOf({}) }
    MenuFlyoutContainer(
        onKeyEvent = {
            val key = it.key
            when(key) {
                Key.C, Key.S, Key.Delete -> {
                    val accept = when {
                        Key.Delete == key -> true
                        isMacOs -> it.isMetaPressed
                        else -> it.isCtrlPressed
                    }
                    if (accept) {
                        closeAction()
                        true
                    } else {
                        false
                    }
                }

                else -> false
            }
        },
        flyout = {
            LaunchedEffect(this, closeAction) {
                closeAction = { isFlyoutVisible = false }
            }
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Share, contentDescription = null) },
                text = { Text("Share") },
                trailing = {
                    if (isMacOs) {
                        Text("⌘ S")
                    } else {
                        Text("Ctrl+S")
                    }
                }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Copy, contentDescription = null) },
                text = { Text("Copy") },
                trailing = {
                    if (isMacOs) {
                        Text("⌘ C")
                    } else {
                        Text("Ctrl+C")
                    }
                }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.Delete, contentDescription = null) },
                text = { Text("Delete") },
                trailing = { Text("Delete") }
            )
            MenuFlyoutSeparator()
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { },
                text = { Text("Rename") }
            )
            MenuFlyoutItem(
                onClick = { isFlyoutVisible = false },
                icon = { },
                text = { Text("Select") }
            )
        },
        content = {
            Button(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = { Text("Edit Options") }
            )
        }
    )
}

expect fun isMacOs(): Boolean