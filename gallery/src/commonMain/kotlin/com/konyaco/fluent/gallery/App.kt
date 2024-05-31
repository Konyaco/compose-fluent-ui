package com.konyaco.fluent.gallery

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
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
import com.konyaco.fluent.gallery.screen.settings.SettingsScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Settings
import com.konyaco.fluent.surface.Card

@Composable
fun App() {
    Row(Modifier.fillMaxSize()) {
        var expanded by remember { mutableStateOf(true) }
        val (selectedItem, setSelectedItem) = remember {
            mutableStateOf(components.first())
        }
        var selectedItemWithContent by remember {
            mutableStateOf(selectedItem)
        }
        LaunchedEffect(selectedItem) {
            if (selectedItem.content != null) {
                selectedItemWithContent = selectedItem
            }
        }
        var textFieldValue by remember {
            mutableStateOf(TextFieldValue())
        }
        val navigator = remember(setSelectedItem) {
            ComponentNavigator(setSelectedItem)
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
                NavigationItem(selectedItem, setSelectedItem, settingItem)
            }
        ) {
            components.forEach { navItem ->
                NavigationItem(selectedItem, setSelectedItem, navItem)
                if (navItem.name == "All samples") {
                    NavigationItemSeparator(modifier = Modifier.padding(vertical = 2.dp))
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxHeight().weight(1f),
            shape = RoundedCornerShape(topStart = FluentTheme.cornerRadius.overlay)
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
                it.content?.invoke(it, navigator)
            }
        }
    }
}

@Composable
private fun NavigationItem(
    selectedItem: ComponentItem,
    onSelectedItemChanged: (ComponentItem) -> Unit,
    navItem: ComponentItem
) {
    val expandedItems = remember {
        mutableStateOf(false)
    }
    LaunchedEffect(selectedItem) {
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