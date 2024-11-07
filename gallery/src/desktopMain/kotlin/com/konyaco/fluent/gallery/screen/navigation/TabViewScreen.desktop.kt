package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentThemeConfiguration
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.component.GalleryPageScope
import com.konyaco.fluent.gallery.window.WindowFrame
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
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

                FluentThemeConfiguration(
                    useAcrylicPopup = store.enabledAcrylicPopup
                ) {
                    WindowFrame(
                        onCloseRequest = { windowVisible.value = false },
                        state = windowState,
                        backButtonVisible = false
                    ) { _, captionBarInset ->
                        TabViewWindowContent(
                            paddingInsets = WindowInsets(0),
                            header = {
                                Spacer(
                                    modifier = Modifier.heightIn(
                                        40.dp
                                    ).windowInsetsPadding(
                                        captionBarInset.only(
                                            WindowInsetsSides.Left
                                        ).add(WindowInsets(right = 8.dp))
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