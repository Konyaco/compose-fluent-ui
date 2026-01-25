package io.github.composefluent.gallery.screen.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.rememberWindowState
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.FluentThemeConfiguration
import io.github.composefluent.component.Button
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.LocalStore
import io.github.composefluent.gallery.component.GalleryPageScope
import io.github.composefluent.gallery.window.WindowFrame
import io.github.composefluent.gallery.resources.Res
import io.github.composefluent.gallery.resources.icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.skiko.hostOs

@OptIn(ExperimentalFluentApi::class)
@Composable
internal actual fun GalleryPageScope.PlatformTabViewSection() {
    Section(
        title = "TabView Window",
        sourceCode = "",
        content = {
            val windowVisible = remember { mutableStateOf(false) }
            Button(
                onClick = {
                    windowVisible.value = !windowVisible.value
                },
                content = {
                    Text("Open Window")
                }
            )
            val windowState = rememberWindowState(width = 1600.dp, height = 1000.dp)
            val store = LocalStore.current
            Window(
                visible = windowVisible.value,
                onCloseRequest = {
                    windowVisible.value = false
                },
                state = windowState,
                title = "TabView Window",
                icon = painterResource(Res.drawable.icon)
            ) {
                val colors = FluentTheme.colors
                FluentThemeConfiguration(
                    useAcrylicPopup = store.enabledAcrylicPopup
                ) {
                    WindowFrame(
                        onCloseRequest = { windowVisible.value = false },
                        state = windowState,
                        backButtonVisible = false,
                        captionBarHeight = 40.dp,
                    ) { _, captionBarInset ->
                        val windowStore = LocalStore.current
                        LaunchedEffect(colors.darkMode) {
                            windowStore.darkMode = colors.darkMode
                        }
                        TabViewWindowContent(
                            paddingInsets = WindowInsets(0),
                            header = {
                                Spacer(
                                    modifier = Modifier.heightIn(
                                        40.dp
                                    ).windowInsetsPadding(
                                        captionBarInset.only(
                                            WindowInsetsSides.Left
                                        ).add(WindowInsets(right = if (!hostOs.isMacOS ) 8.dp else 0.dp))
                                    )
                                )
                            },
                            footer =  {
                                Spacer(
                                    modifier = Modifier.heightIn(
                                        40.dp
                                    ).windowInsetsPadding(
                                        captionBarInset.only(
                                            WindowInsetsSides.Right
                                        ).add(WindowInsets(right = 8.dp))
                                    )
                                )
                            }
                        )
                    }
                }
            }
        }
    )
}