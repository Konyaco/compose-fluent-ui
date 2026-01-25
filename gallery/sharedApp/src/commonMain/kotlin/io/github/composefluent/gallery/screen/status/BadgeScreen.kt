package io.github.composefluent.gallery.screen.status

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.Badge
import io.github.composefluent.component.BadgeDefaults
import io.github.composefluent.component.BadgeStatus
import io.github.composefluent.component.Button
import io.github.composefluent.component.DropDownButton
import io.github.composefluent.component.Icon
import io.github.composefluent.component.MenuFlyoutContainer
import io.github.composefluent.component.MenuFlyoutItem
import io.github.composefluent.component.NavigationDefaults
import io.github.composefluent.component.NavigationDisplayMode
import io.github.composefluent.component.NavigationView
import io.github.composefluent.component.Switcher
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextField
import io.github.composefluent.component.menuItem
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.filled.ArrowSync
import io.github.composefluent.icons.regular.Home
import io.github.composefluent.icons.regular.Mail
import io.github.composefluent.icons.regular.Person
import io.github.composefluent.icons.regular.Settings
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "An non-intrusive UI to display notifications or bring focus to an area.")
@Composable
fun BadgeScreen() {
    GalleryPage(
        title = "Badge",
        description = "Badging is a non-intrusive and intuitive way to display notifications " +
                "or bring focus to an area within an app - whether that be for notifications, " +
                "indicating new content, or showing an alert.",
        componentPath = FluentSourceFile.Badge,
        galleryPath = ComponentPagePath.BadgeScreen
    ) {

        var badgeVisible by remember { mutableStateOf(true) }
        var displayMode by remember { mutableStateOf(NavigationDisplayMode.Left) }
        Section(
            title = "Badge embedded in NavigationView",
            sourceCode = sourceCodeOfBadgeInsideNavigationViewSample,
            content = { BadgeInsideNavigationViewSample(badgeVisible, displayMode) },
            options = {
                Text("Badge Visible")
                Switcher(
                    checked = badgeVisible,
                    onCheckStateChange = { badgeVisible = it }
                )
                Text("Display Mode")
                MenuFlyoutContainer(
                    flyout = {
                        NavigationDisplayMode.entries.forEach { item ->
                            MenuFlyoutItem(
                                selected = item == displayMode,
                                onSelectedChanged = {
                                    displayMode = item
                                    isFlyoutVisible = false
                                },
                                text = { Text(item.name) }
                            )
                        }
                    },
                    content = {
                        DropDownButton(
                            onClick = { isFlyoutVisible = true },
                            content = { Text(displayMode.name) }
                        )
                    }
                )
            }
        )

        var status by remember { mutableStateOf(BadgeStatus.Attention) }
        Section(
            title = "Different Badge Styles",
            sourceCode = sourceCodeOfBadgeStatusSample,
            content = { BadgeStatusSample(status) },
            options = {
                Text("Status")
                MenuFlyoutContainer(
                    flyout = {
                        BadgeStatus.entries.forEach { item ->
                            MenuFlyoutItem(
                                selected = item == status,
                                onSelectedChanged = {
                                    status = item
                                    isFlyoutVisible = false
                                },
                                text = { Text(item.name) }
                            )
                        }
                    },
                    content = {
                        DropDownButton(
                            onClick = { isFlyoutVisible = true },
                            content = { Text(status.name) }
                        )
                    }
                )
            }
        )

        Section(
            title = "Placing an Badge Inside Another Control",
            sourceCode = sourceCodeOfBadgeInsideComponentSample,
            content = { BadgeInsideComponentSample() }
        )

        var badgeContent by remember { mutableStateOf("9") }
        Section(
            title = "Badge with content",
            sourceCode = sourceCodeOfBadgeContentSample,
            content = { BadgeContentSample(badgeContent) },
            options = {
                TextField(
                    header = { Text("Content") },
                    value = badgeContent,
                    onValueChange = { badgeContent = it }
                )
            }
        )

    }
}

@Sample
@OptIn(ExperimentalFluentApi::class)
@Composable
private fun BadgeInsideNavigationViewSample(
    badgeVisible: Boolean = true,
    displayMode: NavigationDisplayMode = NavigationDisplayMode.Left
) {
    var selectedIndex by remember { mutableStateOf(0) }
    NavigationView(
        displayMode = displayMode,
        backButton = { NavigationDefaults.BackButton(onClick = {}, disabled = true) },
        menuItems = {
            menuItem(
                selected = 0 == selectedIndex,
                onClick = { selectedIndex = 0 },
                text = { Text("Home") },
                icon = { Icon(Icons.Default.Home, contentDescription = null) },
            )
            menuItem(
                selected = 1 == selectedIndex,
                onClick = { selectedIndex = 1 },
                text = { Text("Account") },
                icon = { Icon(Icons.Default.Person, contentDescription = null) },
            )
            menuItem(
                selected = 2 == selectedIndex,
                onClick = { selectedIndex = 2 },
                text = { Text("Inbox") },
                icon = { Icon(Icons.Default.Mail, contentDescription = null) },
                badge = if (badgeVisible) {
                    { Badge(status = BadgeStatus.Attention, content = { Text("5") }) }
                } else {
                    null
                }
            )
        },
        footerItems = {
            menuItem(
                selected = 3 == selectedIndex,
                onClick = { selectedIndex = 3 },
                text = { Text("Settings") },
                icon = { Icon(Icons.Default.Settings, contentDescription = null) },
            )
        },
        pane = {},
        modifier = Modifier.height(300.dp)
    )
}

@Sample
@Composable
private fun BadgeStatusSample(
    status: BadgeStatus
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        modifier = Modifier.fillMaxWidth()
    ) {
        Badge(
            status = status,
            content = { BadgeDefaults.Icon(status = status) }
        )
        Badge(
            status = status,
            content = { Text(text = "10") }
        )
        Badge(status = status)
    }
}

@Sample
@Composable
private fun BadgeInsideComponentSample() {
    Box(
        modifier = Modifier.fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {},
            content = { Icon(Icons.Filled.ArrowSync, contentDescription = null) },
            modifier = Modifier.defaultMinSize(120.dp, minHeight = 48.dp)
        )
        Badge(
            status = BadgeStatus.Critical,
            content = { BadgeDefaults.Icon(status = BadgeStatus.Caution) },
            modifier = Modifier.align(Alignment.TopEnd)
        )
    }
}

@Sample
@Composable
private fun BadgeContentSample(content: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Badge(
            status = BadgeStatus.Attention,
            content = { Text(content) }
        )
    }
}