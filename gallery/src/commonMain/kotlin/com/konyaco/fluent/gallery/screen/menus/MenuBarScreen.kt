package com.konyaco.fluent.gallery.screen.menus

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.ListItemDefaults
import com.konyaco.fluent.component.ListItemSelectionType
import com.konyaco.fluent.component.MenuBar
import com.konyaco.fluent.component.MenuBarItem
import com.konyaco.fluent.component.MenuFlyoutItem
import com.konyaco.fluent.component.MenuFlyoutSeparator
import com.konyaco.fluent.component.OverflowMenuBar
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "A classic menu, allowing the display of MenuItems containing MenuFlyoutItems")
@Composable
fun MenuBarScreen() {
    GalleryPage(
        title = "MenuBar",
        description = "The MenuBar simplifies the creation of basic applications by providing a set of menus at the top of the app or window.",
        componentPath = FluentSourceFile.MenuBar,
        galleryPath = ComponentPagePath.MenuBarScreen,
    ) {
        Section(
            title = "A simple MenuBar",
            sourceCode = sourceCodeOfBasicMenuBarSample,
            content = { BasicMenuBarSample() }
        )

        //TODO MenuBar with keyboard accelerator sample

        Section(
            title = "A MenuBar with SubMenus, Separators and RadioItems",
            sourceCode = sourceCodeOfMenuBarWithSubMenuSample,
            content = { MenuBarWithSubMenuSample() }
        )

        Section(
            title = "An Overflow MenuBar",
            sourceCode = sourceCodeOfOverflowMenuBarSample,
            content = { OverflowMenuBarSample() }
        )
    }
}

@Sample
@Composable
private fun BasicMenuBarSample() {
    MenuBar {
        MenuBarItem(
            content = { Text("File") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("New") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Open") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Save") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Exit") }
                )
            },
        )

        MenuBarItem(
            content = { Text("Edit") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Undo") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Cut") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Copy") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Paste") }
                )
            },
        )

        MenuBarItem(
            content = { Text("Help") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("About") }
                )
            }
        )
    }
}

@Sample
@Composable
private fun MenuBarWithSubMenuSample() {
    MenuBar {
        MenuBarItem(
            content = { Text("File") },
            items = {
                MenuFlyoutItem(
                    items = {
                        MenuFlyoutItem(
                            onClick = { isFlyoutVisible = false },
                            text = { Text("Plain Text Document") }
                        )
                        MenuFlyoutItem(
                            onClick = { isFlyoutVisible = false },
                            text = { Text("Rich Text Document") }
                        )
                        MenuFlyoutItem(
                            onClick = { isFlyoutVisible = false },
                            text = { Text("Other Formats") }
                        )
                    },
                    text = { Text("New") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Open") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Save") }
                )
                MenuFlyoutSeparator()
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Exit") }
                )
            },
        )

        MenuBarItem(
            content = { Text("Edit") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Undo") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Cut") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Copy") }
                )
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Paste") }
                )
            },
        )
        var isLandscape by remember { mutableStateOf(false) }

        var iconIndex by remember { mutableStateOf(1) }
        MenuBarItem(
            content = { Text("View") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("Output") },
                    icon = {}
                )
                MenuFlyoutSeparator()

                MenuFlyoutItem(
                    text = { Text("Landscape") },
                    onSelectedChanged = {
                        isLandscape = true
                        isFlyoutVisible = false
                    },
                    selected = isLandscape,
                    selectionType = ListItemSelectionType.Radio,
                    colors = ListItemDefaults.defaultListItemColors()
                )
                MenuFlyoutItem(
                    text = { Text("Portrait") },
                    onSelectedChanged = {
                        isLandscape = false
                        isFlyoutVisible = false
                    },
                    selected = !isLandscape,
                    selectionType = ListItemSelectionType.Radio,
                    colors = ListItemDefaults.defaultListItemColors()
                )
                MenuFlyoutSeparator()
                repeat(3) { index ->
                    MenuFlyoutItem(
                        text = {
                            Text(
                                text = when(index) {
                                    0 -> "Small icons"
                                    1 -> "Medium icons"
                                    else -> "Large icons"
                                }
                            )
                        },
                        selected = index == iconIndex,
                        onSelectedChanged = { iconIndex = index },
                        selectionType = ListItemSelectionType.Radio,
                        colors = ListItemDefaults.defaultListItemColors()
                    )
                }
            }
        )

        MenuBarItem(
            content = { Text("Help") },
            items = {
                MenuFlyoutItem(
                    onClick = { isFlyoutVisible = false },
                    text = { Text("About") }
                )
            },
        )
    }
}

@Sample
@Composable
private fun OverflowMenuBarSample() {
    OverflowMenuBar {
        items(16) {
            MenuBarItem(
                items = {
                    MenuFlyoutItem(
                        onClick = { isFlyoutVisible = false },
                        text = { Text("Menu Item 1") }
                    )
                },
                content = {
                    Text("Menu ${it + 1}")
                }
            )
        }
    }
}