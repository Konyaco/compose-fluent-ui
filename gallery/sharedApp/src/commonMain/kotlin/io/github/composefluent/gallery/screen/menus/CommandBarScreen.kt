package io.github.composefluent.gallery.screen.menus

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.composefluent.component.CommandBar
import io.github.composefluent.component.CommandBarSeparator
import io.github.composefluent.component.CommandBarButton
import io.github.composefluent.component.Icon
import io.github.composefluent.component.LargeCommandBar
import io.github.composefluent.component.ListItem
import io.github.composefluent.component.MenuFlyoutItem
import io.github.composefluent.component.MenuFlyoutSeparator
import io.github.composefluent.component.SubtleButton
import io.github.composefluent.component.Text
import io.github.composefluent.component.commandBarButtonSize
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Save
import io.github.composefluent.source.generated.FluentSourceFile

@Component(
    description = "A toolbar for displaying application-specific " +
            "commands that handles layout and resizing of " +
            "its contents."
)
@Composable
fun CommandBarScreen() {
    GalleryPage(
        title = "CommandBar",
        description = "Command bars provide users with easy access to your app's most common tasks. " +
                "Command bars can provide access to app-level or page-specific commands and can be used with any navigation pattern. " +
                "By default, the command bar shows a row of icon buttons and an optional \"see more\" button, which is represented by an ellipsis [...].",
        componentPath = FluentSourceFile.CommandBar,
        galleryPath = ComponentPagePath.CommandBarScreen
    ) {
        Section(
            title = "Basic CommandBar",
            sourceCode = sourceCodeOfBasicCommandBarSample,
            content = { BasicCommandBarSample() }
        )

        Section(
            title = "Secondary CommandBar",
            sourceCode = sourceCodeOfSecondaryCommandBarSample,
            content = { SecondaryCommandBarSample() }
        )

        Section(
            title = "Large CommandBar",
            sourceCode = sourceCodeOfLargeCommandBarSample,
            content = { LargeCommandBarSample() }
        )
    }
}

@Sample
@Composable
private fun BasicCommandBarSample() {
    val (expanded, setExpanded) = remember { mutableStateOf(false) }
    CommandBar(
        expanded = expanded,
        onExpandedChanged = setExpanded
    ) {
        items(8) {
            if (isOverflow) {
                Column {
                    ListItem(
                        onClick = { setExpanded(false) },
                        text = {
                            Text("Item $it")
                        },
                        icon = {
                            Icon(imageVector = Icons.Default.Save, contentDescription = null)
                        },
                        trailing = {
                            Text("Ctrl + A")
                        }
                    )
                    if (it == 3) {
                        MenuFlyoutSeparator()
                    }
                }
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    SubtleButton(
                        onClick = {},
                        content = {
                            Icon(imageVector = Icons.Default.Save, contentDescription = null)
                            Text("Item $it")
                        },
                        modifier = Modifier.commandBarButtonSize()
                    )
                    if (it == 3) {
                        CommandBarSeparator()
                    }
                }
            }
        }
    }
}

@Sample
@Composable
private fun SecondaryCommandBarSample() {
    val (expanded, setExpanded) = remember { mutableStateOf(false) }
    CommandBar(
        expanded = expanded,
        onExpandedChanged = setExpanded,
        secondary = { hasOverFlowItem ->
            if (hasOverFlowItem) {
                MenuFlyoutSeparator()
            }
            repeat(3) {
                MenuFlyoutItem(
                    onClick = { setExpanded(false) },
                    text = {
                        Text("Secondary Item $it")
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Save, contentDescription = null)
                    }
                )
            }
        }
    ) {
        items(4) {
            if (isOverflow) {
                ListItem(
                    onClick = { setExpanded(false) },
                    text = {
                        Text("Item $it")
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Save, contentDescription = null)
                    },
                    trailing = {
                        Text("Ctrl + A")
                    }
                )
            } else {
                SubtleButton(
                    onClick = {},
                    content = {
                        Icon(imageVector = Icons.Default.Save, contentDescription = null)
                        Text("Item $it")
                    },
                    modifier = Modifier.commandBarButtonSize()
                )
            }
        }
    }
}

@Sample
@Composable
private fun LargeCommandBarSample() {
    val (expanded, setExpanded) = remember { mutableStateOf(false) }

    LargeCommandBar(
        expanded = expanded,
        onExpandedChanged = setExpanded,
        secondary = { hasOverFlowItem ->
            if (hasOverFlowItem) {
                MenuFlyoutSeparator()
            }

            repeat(3) {
                MenuFlyoutItem(
                    onClick = { setExpanded(false) },
                    text = {
                        Text("Secondary Item $it")

                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Save, contentDescription = null)
                    }
                )
            }
        },
        content = {
            items(4) {
                if (isOverflow) {
                    ListItem(
                        onClick = { setExpanded(false) },
                        text = {
                            Text("Item $it")
                        },
                        icon = {
                            Icon(imageVector = Icons.Default.Save, contentDescription = null)
                        },
                        trailing = {
                            Text("Ctrl + A")
                        }
                    )
                } else {
                    CommandBarButton(
                        onClick = {},
                        content = {
                            Icon(imageVector = Icons.Default.Save, contentDescription = null)
                            Text("Item $it")
                        }
                    )
                }
            }
        }
    )
}