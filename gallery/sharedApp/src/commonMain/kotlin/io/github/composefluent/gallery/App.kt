package io.github.composefluent.gallery

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ContentTransform
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.scene.Scene
import androidx.navigation3.scene.SceneStrategy
import androidx.navigation3.scene.SceneStrategyScope
import androidx.navigation3.ui.NavDisplay
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.component.AutoSuggestBoxDefaults
import io.github.composefluent.component.AutoSuggestionBox
import io.github.composefluent.component.Icon
import io.github.composefluent.component.ListItem
import io.github.composefluent.component.MenuItem
import io.github.composefluent.component.NavigationDefaults
import io.github.composefluent.component.NavigationView
import io.github.composefluent.component.NavigationDisplayMode
import io.github.composefluent.component.NavigationMenuItemScope
import io.github.composefluent.component.SideNavItem
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextBoxButton
import io.github.composefluent.component.TextBoxButtonDefaults
import io.github.composefluent.component.TextField
import io.github.composefluent.component.rememberNavigationState
import io.github.composefluent.gallery.component.ComponentItem
import io.github.composefluent.gallery.component.ComponentNavigator
import io.github.composefluent.gallery.component.components
import io.github.composefluent.gallery.component.rememberComponentNavigator
import io.github.composefluent.gallery.component.flatMapComponents
import io.github.composefluent.gallery.screen.settings.SettingsScreen
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.ArrowLeft
import io.github.composefluent.icons.regular.Settings
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.map
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(FlowPreview::class, ExperimentalFluentApi::class, ExperimentalUuidApi::class)
@Composable
fun App(
    navigator: ComponentNavigator = rememberComponentNavigator(components.first()),
    windowInset: WindowInsets = WindowInsets(0),
    contentInset: WindowInsets = WindowInsets(0),
    collapseWindowInset: WindowInsets = WindowInsets(0),
    icon: Painter? = null,
    title: String = "",
) {

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
            val transitionSpec: AnimatedContentTransitionScope<Scene<ComponentItem>>.() -> ContentTransform =
                {
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
                }
            NavDisplay(
                backStack = navigator.currentBackstack,
                onBack = { navigator.navigateUp() },
                transitionSpec = transitionSpec,
                popTransitionSpec = transitionSpec,
                sceneStrategy = GallerySceneStrategy(),
                modifier = Modifier.fillMaxSize(),
                entryProvider = {
                    NavEntry(
                        it,
                        contentKey = Uuid.generateV4().toString(),
                        metadata = mapOf("hasContent" to (it.content != null))
                    ) { navKey ->
                        navKey.content?.invoke(it, navigator)
                    }
                }
            )
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

private class GallerySceneStrategy<T : NavKey> : SceneStrategy<T> {
    override fun SceneStrategyScope<T>.calculateScene(entries: List<NavEntry<T>>): Scene<T> {
        val index = entries.indexOfLast { it.metadata["hasContent"] != false }
        if (index != -1) {
            return GallerySingleScene(
                key = entries[index].contentKey,
                entry = entries[index],
                previousEntries = entries.take(index)
            )
        } else {
            return GallerySingleScene(
                key = entries.last().contentKey,
                entry = entries.last(),
                previousEntries = entries.dropLast(1)
            )
        }

    }

    class GallerySingleScene<T : NavKey>(
        override val key: Any,
        val entry: NavEntry<T>,
        override val previousEntries: List<NavEntry<T>>,
    ) : Scene<T> {
        override val entries: List<NavEntry<T>> = listOf(entry)

        override val content: @Composable () -> Unit = {
            entry.Content()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as GallerySingleScene<*>

            return key == other.key &&
                    entry == other.entry &&
                    previousEntries == other.previousEntries &&
                    entries == other.entries
        }

        override fun hashCode(): Int {
            return key.hashCode() * 31 +
                    entry.hashCode() * 31 +
                    previousEntries.hashCode() * 31 +
                    entries.hashCode() * 31
        }

        override fun toString(): String {
            return "SinglePaneScene(key=$key, entry=$entry, previousEntries=$previousEntries, entries=$entries)"
        }
    }
}
