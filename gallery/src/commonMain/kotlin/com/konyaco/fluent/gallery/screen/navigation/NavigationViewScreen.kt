@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.MenuItem
import com.konyaco.fluent.component.NavigationView
import com.konyaco.fluent.component.NavigationDisplayMode
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.SideNav
import com.konyaco.fluent.component.SideNavHeader
import com.konyaco.fluent.component.SideNavItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TopNav
import com.konyaco.fluent.component.TopNavHeader
import com.konyaco.fluent.component.TopNavItem
import com.konyaco.fluent.component.rememberNavigationState
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.component.components
import com.konyaco.fluent.gallery.component.rememberComponentNavigator
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Circle
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(
    description = "Common vertical layout for top-level areas of" +
            " your app via a collapsible navigation menu."
)
@Composable
fun NavigationViewScreen() {
    GalleryPage(
        title = "NavigationView",
        description = "The navigation view control provides a common vertical layout " +
                "for top-level areas of your app via a collapsible navigation menu.",
        componentPath = FluentSourceFile.NavigationView,
        galleryPath = ComponentPagePath.NavigationViewScreen
    ) {
        Section(
            title = "SideNav",
            sourceCode = sourceCodeOfSideNavSample,
            content = { SideNavSample() }
        )

        Section(
            title = "TopNav",
            sourceCode = sourceCodeOfTopNavSample,
            content = { TopNavSample() }
        )

        var displayMode by remember { mutableStateOf(NavigationDisplayMode.Top) }
        Section(
            title = "NavigationView",
            sourceCode = sourceCodeOfNavigationViewSample,
            content = { NavigationViewSample(displayMode) },
            options = {
                NavigationDisplayMode.entries.forEach {
                    RadioButton(
                        selected = displayMode == it,
                        onClick = { displayMode = it },
                        label = it.name
                    )
                }
            }
        )
    }
}

@Sample
@Composable
private fun SideNavSample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableStateOf(0) }
    SideNav(
        expanded = expanded,
        onExpandStateChange = { expanded = it },
        modifier = Modifier.height(300.dp)
    ) {
        repeat(6) { index ->
            SideNavItem(
                selected = selectedIndex == index,
                onClick = { selectedIndex = index },
                content = { Text("Menu Item $index") },
                icon = {
                    Icon(imageVector = Icons.Default.Circle, contentDescription = null)
                }
            )
        }
    }
}

@Sample
@Composable
private fun TopNavSample() {
    Column(modifier = Modifier.height(100.dp)) {
        var selectedIndex by remember { mutableStateOf(0) }
        var expanded by remember { mutableStateOf(false) }
        TopNav(
            header = {
                TopNavHeader {
                    Text("Header")
                }
            },
            expanded = expanded,
            onExpandedChanged = { expanded = it }
        ) {

            items(6) { index ->
                if (isOverflow) {
                    SideNavItem(
                        selected = index == selectedIndex,
                        onClick = {
                            selectedIndex = index
                        },
                        content = {
                            Text(text = "Menu Item ${index + 1}")

                        },
                        icon = {
                            Icon(imageVector = Icons.Default.Circle, contentDescription = null)
                        }
                    )
                } else {
                    TopNavItem(
                        selected = index == selectedIndex,
                        onClick = {
                            selectedIndex = index
                        },
                        text = {
                            Text(text = "Menu Item ${index + 1}")
                        },
                        icon = {
                            Icon(imageVector = Icons.Default.Circle, contentDescription = null)
                        }
                    )
                }
            }
            item {

                if (isOverflow) {
                    Column {
                        SideNavHeader {
                            Text("Header")
                        }
                        SideNavItem(
                            selected = false,
                            onClick = {},
                            content = {
                                Text(text = "Menu Item")
                            },
                            icon = {
                                Icon(imageVector = Icons.Default.Circle, contentDescription = null)
                            }
                        )
                    }
                } else {
                    Row {
                        TopNavHeader {
                            Text("Header")
                        }
                        TopNavItem(
                            selected = false,
                            onClick = {},
                            text = {
                                Text(text = "Menu Item")
                            },
                            icon = {
                                Icon(imageVector = Icons.Default.Circle, contentDescription = null)
                            }
                        )
                    }
                }
            }
        }
    }
}

@Sample
@Composable
private fun NavigationViewSample(displayMode: NavigationDisplayMode) {
    val navigator = rememberComponentNavigator()
    val navigationState = rememberNavigationState()
    NavigationView(
        displayMode = displayMode,
        state = navigationState,
        menuItems = {
            items(components.size) { index ->
                val item = components[index]
                var showItems by remember { mutableStateOf(false) }
                MenuItem(
                    selected = item == navigator.latestBackEntry,
                    onClick = {
                        navigator.navigate(item)
                        if (item.items.isNullOrEmpty()) {
                            flyoutDismissRequest()
                        } else {
                            showItems = !showItems
                        }
                    },
                    text = {
                        Text(text = item.name)
                    },
                    icon = item.icon?.let {
                        {
                            Icon(imageVector = it, contentDescription = item.description)
                        }
                    },
                    expandItems = showItems && item.items.isNullOrEmpty().not(),
                    onExpandItemsChanged = { showItems = it },
                    items = {
                        item.items?.forEach { nestedItem ->
                            var expandedItem by remember { mutableStateOf(false) }
                            var flyoutVisible by remember { mutableStateOf(false) }
                            SideNavItem(
                                selected = nestedItem == navigator.latestBackEntry,
                                onSelectedChanged = {
                                    navigator.navigate(nestedItem)
                                    if (nestedItem.items.isNullOrEmpty()) {
                                        isFlyoutVisible = false
                                        flyoutDismissRequest()
                                    }
                                },
                                text = {
                                    Text(text = nestedItem.name)
                                },
                                onExpandItemsChanged = { expandedItem = it },
                                flyoutVisible = flyoutVisible && nestedItem.items.isNullOrEmpty().not(),
                                onFlyoutVisibleChanged = { flyoutVisible = it },
                                indicatorState = navigationState.indicatorState,
                                icon = nestedItem.icon?.let { icon ->
                                    {
                                        Icon(
                                            imageVector = icon,
                                            contentDescription = nestedItem.description
                                        )
                                    }
                                }

                            )
                        }
                    }
                )
            }
        },
        modifier = Modifier.height(600.dp)
    ) {
        navigator.latestBackEntry?.let {
            it.content?.invoke(it, navigator)
        }
    }
}