package com.konyaco.fluent.example

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SideNav
import com.konyaco.fluent.component.SideNavItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.darkColors
import com.konyaco.fluent.example.screen.HomeScreen
import com.konyaco.fluent.example.screen.TodoScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.*
import com.konyaco.fluent.lightColors

private data class NavItem(
    val label: String,
    val icon: ImageVector,
    val content: @Composable () -> Unit
)

private val navs = listOf(
    NavItem("Home", Icons.Default.Home) { HomeScreen() },
    NavItem("Design guidance", Icons.Default.Ruler) { TodoScreen() },
    NavItem("All samples", Icons.Default.AppsList) { TodoScreen() },
    NavItem("Basic input", Icons.Default.CheckboxChecked) { TodoScreen() },
    NavItem("Collections", Icons.Default.Table) { TodoScreen() },
    NavItem("Date & time", Icons.Default.CalendarClock) { TodoScreen() },
    NavItem("Dialogs & flyouts", Icons.Default.Chat) { TodoScreen() },
    NavItem("Layout", Icons.Default.SlideLayout) { TodoScreen() },
    NavItem("Media", Icons.Default.VideoClip) { TodoScreen() },
    NavItem("Menus & toolbars", Icons.Default.Save) { TodoScreen() },
    NavItem("Motion", Icons.Default.Flash) { TodoScreen() },
    NavItem("Navigation", Icons.Default.Navigation) { TodoScreen() },
    NavItem("Scrolling", Icons.Default.ArrowSort) { TodoScreen() },
    NavItem("Status & info", Icons.Default.ChatMultiple) { TodoScreen() },
    NavItem("Styles", Icons.Default.Color) { TodoScreen() },
    NavItem("System", Icons.Default.System) { TodoScreen() },
    NavItem("Text", Icons.Default.TextFont) { TodoScreen() },
    NavItem("Windowing", Icons.Default.Window) { TodoScreen() },
)


internal val LocalStore = compositionLocalOf<Store> { error("Not provided") }
class Store(
    systemDarkMode: Boolean
) {
    var darkMode by mutableStateOf(systemDarkMode)
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun App() {
    val systemDarkMode = isSystemInDarkTheme()
    
    val store = remember { Store(systemDarkMode) }
    
    LaunchedEffect(systemDarkMode) {
        store.darkMode = systemDarkMode
    }

    CompositionLocalProvider(LocalStore provides store) {
        FluentTheme(colors = if (store.darkMode) darkColors() else lightColors()) {
            Mica(Modifier.fillMaxSize()) {
                Row(Modifier.fillMaxSize()) {
                    var expanded by remember { mutableStateOf(true) }
                    var selected by remember { mutableStateOf(0) }

                    SideNav(Modifier.fillMaxHeight(), expanded, { expanded = it },
                        footer = {
                            SideNavItem(false, onClick = {
                                // TODO
                            }, icon = { Icon(Icons.Default.Settings, "Settings") }) {
                                Text("Settings")
                            }
                        }
                    ) {
                        navs.forEachIndexed { index, navItem ->
                            SideNavItem(
                                selected == index,
                                onClick = { selected = index },
                                icon = { Icon(navItem.icon, null) },
                                content = { Text(navItem.label) }
                            )
                        }
                    }

                    AnimatedContent(selected, Modifier.fillMaxHeight().weight(1f), transitionSpec = {
                        fadeIn(tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)) +
                                slideInVertically(
                                    tween(
                                        FluentDuration.ShortDuration,
                                        easing = FluentEasing.FastInvokeEasing
                                    ), { it / 6 }) with
                                fadeOut(tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing))
                    }) {
                        navs[it].content()
                    }
                }
            }
        }
    }
}