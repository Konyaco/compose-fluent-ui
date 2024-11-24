package com.konyaco.fluent.gallery

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.AutoSuggestBoxDefaults
import com.konyaco.fluent.component.AutoSuggestionBox
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.ListItem
import com.konyaco.fluent.component.MenuItem
import com.konyaco.fluent.component.NavigationDefaults
import com.konyaco.fluent.component.NavigationView
import com.konyaco.fluent.component.NavigationDisplayMode
import com.konyaco.fluent.component.NavigationMenuItemScope
import com.konyaco.fluent.component.SideNavItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextBoxButton
import com.konyaco.fluent.component.TextBoxButtonDefaults
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.component.rememberNavigationState
import com.konyaco.fluent.gallery.component.ComponentItem
import com.konyaco.fluent.gallery.component.ComponentNavigator
import com.konyaco.fluent.gallery.component.components
import com.konyaco.fluent.gallery.component.rememberComponentNavigator
import com.konyaco.fluent.gallery.component.flatMapComponents
import com.konyaco.fluent.gallery.screen.settings.SettingsScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowLeft
import com.konyaco.fluent.icons.regular.Settings
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.map

@OptIn(FlowPreview::class, ExperimentalFluentApi::class)
@Composable
fun App(
    navigator: ComponentNavigator = rememberComponentNavigator(components.first()),
    windowInset: WindowInsets = WindowInsets(0),
    contentInset: WindowInsets = WindowInsets(0),
    collapseWindowInset: WindowInsets = WindowInsets(0),
    icon: Painter? = null,
    title: String = "",
) {

    var selectedItemWithContent by remember {
        mutableStateOf(navigator.latestBackEntry)
    }
    LaunchedEffect(navigator.latestBackEntry) {
        val latestBackEntry = navigator.latestBackEntry
        if (selectedItemWithContent == latestBackEntry) return@LaunchedEffect
        if (latestBackEntry == null || latestBackEntry.content != null) {
            selectedItemWithContent = latestBackEntry
        }
    }
    var textFieldValue by remember {
        mutableStateOf(TextFieldValue())
    }

    val settingItem = remember(navigator) {
        ComponentItem(
            "Settings",
            group = "",
            description = "",
            icon = Icons.Default.Settings
        ) { SettingsScreen(navigator) }
    }
    val store = LocalStore.current
    val isCollapsed = store.navigationDisplayMode == NavigationDisplayMode.LeftCollapsed
    NavigationView(
        modifier = Modifier.windowInsetsPadding(
            insets = if (isCollapsed) collapseWindowInset else windowInset
        ),
        state = rememberNavigationState(),
        displayMode = store.navigationDisplayMode,
        contentPadding = if (!isCollapsed) {
            PaddingValues()
        } else {
            PaddingValues(top = 48.dp)
        },
        menuItems = {
            components.forEach { navItem ->
                item {
                    MenuItem(
                        navigator.latestBackEntry,
                        navigator::navigate,
                        navItem,
                        navItem.name == "All samples"
                    )
                }
            }
        },
        footerItems = {
            item {
                MenuItem(navigator.latestBackEntry, navigator::navigate, settingItem)
            }
        },
        title = {
            if (isCollapsed) {
                if (icon != null) {
                    Image(
                        painter = icon,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 12.dp).size(16.dp)
                    )
                }
                if (title.isNotEmpty()) {
                    Text(
                        text = title,
                        style = FluentTheme.typography.caption,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            } else {
                Text("Controls")
            }
        },
        backButton = {
            if (isCollapsed) {
                NavigationDefaults.BackButton(
                    onClick = {
                        navigator.navigateUp()
                    },
                    disabled = !navigator.canNavigateUp,
                    icon = { Icon(Icons.Default.ArrowLeft, contentDescription = null) },
                    modifier = Modifier.windowInsetsPadding(contentInset.only(WindowInsetsSides.Start))
                )
            }
        },
        autoSuggestBox = {
            var expandedSuggestion by remember { mutableStateOf(false) }
            AutoSuggestionBox(
                expanded = expandedSuggestion,
                onExpandedChange = { expandedSuggestion = it }
            ) {
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    placeholder = { Text("Search") },
                    trailing = {
                        TextBoxButton(onClick = {}) { TextBoxButtonDefaults.SearchIcon() }
                    },
                    isClearable = true,
                    shape = AutoSuggestBoxDefaults.textFieldShape(expandedSuggestion),
                    modifier = Modifier.fillMaxWidth().focusHandle().flyoutAnchor()
                )
                val searchResult = remember(flatMapComponents) {
                    snapshotFlow {
                        textFieldValue.text
                    }.debounce { if (it.isBlank()) 0 else 200 }
                        .map {
                            flatMapComponents.filter { item ->
                                item.name.contains(
                                    it,
                                    ignoreCase = true
                                ) || item.description.contains(it, ignoreCase = true)
                            }
                        }
                }.collectAsState(flatMapComponents)
                AutoSuggestBoxDefaults.suggestFlyout(
                    expanded = expandedSuggestion,
                    onDismissRequest = { expandedSuggestion = false },
                    modifier = Modifier.flyoutSize(matchAnchorWidth = true),
                    itemsContent = {
                        items(
                            items = searchResult.value,
                            contentType = { "Item" },
                            key = { it.hashCode().toString() }
                        ) {
                            ListItem(
                                onClick = {
                                    navigator.navigate(it)
                                    expandedSuggestion = false
                                },
                                text = { Text(it.name, maxLines = 1) },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                )
            }
        },
        pane = {
            AnimatedContent(selectedItemWithContent, Modifier.fillMaxSize(), transitionSpec = {
                (fadeIn(
                    tween(
                        FluentDuration.ShortDuration,
                        easing = FluentEasing.FadeInFadeOutEasing,
                        delayMillis = FluentDuration.QuickDuration
                    )
                ) + slideInVertically(
                    tween(
                        FluentDuration.MediumDuration,
                        easing = FluentEasing.FastInvokeEasing,
                        delayMillis = FluentDuration.QuickDuration
                    )
                ) { it / 5 }) togetherWith fadeOut(
                    tween(
                        FluentDuration.QuickDuration,
                        easing = FluentEasing.FadeInFadeOutEasing,
                        delayMillis = FluentDuration.QuickDuration
                    )
                )
            }) {
                if (it != null) {
                    it.content?.invoke(it, navigator)
                } else {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text("No content selected", style = FluentTheme.typography.bodyStrong)
                    }
                }
            }
        }
    )
}

@Composable
private fun NavigationMenuItemScope.MenuItem(
    selectedItem: ComponentItem?,
    onSelectedItemChanged: (ComponentItem) -> Unit,
    navItem: ComponentItem,
    hasSeparator: Boolean = false,
) {
    val expandedItems = remember {
        mutableStateOf(false)
    }
    LaunchedEffect(selectedItem) {
        if (selectedItem == null) return@LaunchedEffect
        if (navItem != selectedItem) {
            val navItemAsGroup = "${navItem.group}/${navItem.name}/"
            if ((selectedItem.group + "/").startsWith(navItemAsGroup))
                expandedItems.value = true
        }
    }
    val flyoutVisible = remember {
        mutableStateOf(false)
    }
    if (!hasSeparator) {
        MenuItem(
            selected = selectedItem == navItem,
            onClick = {
                onSelectedItemChanged(navItem)
                expandedItems.value = !expandedItems.value
                if (navItem.items.isNullOrEmpty()) {
                    flyoutDismissRequest()
                }
            },
            icon = navItem.icon?.let { { Icon(it, navItem.name) } },
            text = { Text(navItem.name) },
            expandItems = expandedItems.value || flyoutVisible.value,
            onExpandItemsChanged = { flyoutVisible.value = it },
            items = navItem.items?.let {
                if (it.isNotEmpty()) {
                    {
                        it.forEach { nestedItem ->
                            NavigationItem(
                                selectedItem = selectedItem,
                                onSelectedItemChanged = {
                                    onSelectedItemChanged(nestedItem)
                                },
                                navItem = nestedItem,
                                onFlyoutDismissRequest = {
                                    isFlyoutVisible = false
                                    flyoutDismissRequest()
                                }
                            )
                        }
                    }
                } else {
                    null
                }
            }
        )
    } else {
        MenuItem(
            selected = selectedItem == navItem,
            onClick = {
                onSelectedItemChanged(navItem)
                expandedItems.value = !expandedItems.value
            },
            icon = navItem.icon?.let { { Icon(it, navItem.name) } },
            text = { Text(navItem.name) },
            expandItems = expandedItems.value || flyoutVisible.value,
            onExpandItemsChanged = { flyoutVisible.value = it },
            items = navItem.items?.let {
                if (it.isNotEmpty()) {
                    {
                        it.forEach { nestedItem ->
                            NavigationItem(
                                selectedItem = selectedItem,
                                onSelectedItemChanged = {
                                    onSelectedItemChanged(nestedItem)
                                },
                                navItem = nestedItem,
                                onFlyoutDismissRequest = {
                                    isFlyoutVisible = false
                                    flyoutDismissRequest()
                                }
                            )
                        }
                    }
                } else {
                    null
                }
            },
            header = null,
            separatorVisible = true
        )
    }
}

@Composable
private fun NavigationItem(
    selectedItem: ComponentItem?,
    onSelectedItemChanged: (ComponentItem) -> Unit,
    navItem: ComponentItem,
    onFlyoutDismissRequest: () -> Unit = {},
) {
    val expandedItems = remember {
        mutableStateOf(false)
    }
    LaunchedEffect(selectedItem) {
        if (selectedItem == null) return@LaunchedEffect
        if (navItem != selectedItem) {
            val navItemAsGroup = "${navItem.group}/${navItem.name}/"
            if ((selectedItem.group + "/").startsWith(navItemAsGroup))
                expandedItems.value = true
        }
    }
    SideNavItem(
        selectedItem == navItem,
        onClick = {
            onSelectedItemChanged(navItem)
            if (navItem.items == null) {
                onFlyoutDismissRequest()
            } else {
                expandedItems.value = !expandedItems.value
            }
        },
        icon = navItem.icon?.let { { Icon(it, navItem.name) } },
        content = { Text(navItem.name) },
        expandItems = expandedItems.value,
        items = navItem.items?.let {
            if (it.isNotEmpty()) {
                {
                    it.forEach { nestedItem ->
                        NavigationItem(
                            selectedItem = selectedItem,
                            onSelectedItemChanged = onSelectedItemChanged,
                            navItem = nestedItem,
                            onFlyoutDismissRequest = onFlyoutDismissRequest
                        )
                    }
                }
            } else {
                null
            }
        }
    )
}