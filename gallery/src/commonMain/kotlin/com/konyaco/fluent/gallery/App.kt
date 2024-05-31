package com.konyaco.fluent.gallery

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.NavigationItemSeparator
import com.konyaco.fluent.component.SideNav
import com.konyaco.fluent.component.SideNavItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.gallery.component.ComponentItem
import com.konyaco.fluent.gallery.component.ComponentNavigator
import com.konyaco.fluent.gallery.component.components
import com.konyaco.fluent.gallery.component.rememberComponentNavigator
import com.konyaco.fluent.gallery.screen.settings.SettingsScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Settings
import com.konyaco.fluent.surface.Card

@Composable
fun App(
    navigator: ComponentNavigator = rememberComponentNavigator(components.first())
) {
    Row(Modifier.fillMaxSize()) {
        var expanded by remember { mutableStateOf(true) }
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
        SideNav(
            modifier = Modifier.fillMaxHeight(),
            expanded = expanded,
            onExpandStateChange = { expanded = it },
            title = { Text("Controls") },
            autoSuggestionBox = {
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    placeholder = { Text("Search") },
                    modifier = Modifier.fillMaxWidth().focusHandle()
                )
            },
            footer = {
                NavigationItem(navigator.latestBackEntry, navigator::navigate, settingItem)
            }
        ) {
            components.forEach { navItem ->
                NavigationItem(navigator.latestBackEntry, navigator::navigate, navItem)
                if (navItem.name == "All samples") {
                    NavigationItemSeparator(modifier = Modifier.padding(vertical = 2.dp))
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxHeight().weight(1f),
            shape = RoundedCornerShape(
                topStart = 8.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        ) {
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
    }
}

@Composable
private fun NavigationItem(
    selectedItem: ComponentItem?,
    onSelectedItemChanged: (ComponentItem) -> Unit,
    navItem: ComponentItem
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
            expandedItems.value = !expandedItems.value
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
                            navItem = nestedItem
                        )
                    }
                }
            } else {
                null
            }
        }
    )
}

private val settingItem = ComponentItem("Settings", group = "", description = "", icon = Icons.Default.Settings) { SettingsScreen() }