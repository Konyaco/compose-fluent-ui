package com.konyaco.fluent.gallery

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.*
import com.konyaco.fluent.gallery.component.ComponentItem
import com.konyaco.fluent.gallery.component.ComponentNavigator
import com.konyaco.fluent.gallery.component.components
import com.konyaco.fluent.gallery.screen.TodoScreen
import com.konyaco.fluent.shape.FluentRoundedCornerShape
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
            shape = FluentRoundedCornerShape(
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
                        easing = FluentEasing.FastInvokeEasing,
                        delayMillis = FluentDuration.ShortDuration
                    )
                ) + slideInVertically(
                    tween(
                        FluentDuration.ShortDuration,
                        easing = FluentEasing.FastInvokeEasing,
                        delayMillis = FluentDuration.ShortDuration
                    )
                ) { it / 6 }) togetherWith fadeOut(
                    tween(
                        FluentDuration.QuickDuration,
                        easing = FluentEasing.FastDismissEasing
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

private val settingItem = ComponentItem("Settings", group = "", description = "") { TodoScreen() }