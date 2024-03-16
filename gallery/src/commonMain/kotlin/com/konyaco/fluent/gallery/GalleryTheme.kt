package com.konyaco.fluent.gallery

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.konyaco.fluent.*
import com.konyaco.fluent.background.Mica

val LocalStore = compositionLocalOf<Store> { error("Not provided") }

class Store(
    systemDarkMode: Boolean
) {
    var darkMode by mutableStateOf(systemDarkMode)
}

@OptIn(ExperimentalFluentApi::class)
@Composable
fun GalleryTheme(
    displayMicaLayer: Boolean = true,
    content: @Composable () -> Unit
) {
    val systemDarkMode = isSystemInDarkTheme()

    val store = remember { Store(systemDarkMode) }

    LaunchedEffect(systemDarkMode) {
        store.darkMode = systemDarkMode
    }
    CompositionLocalProvider(
        LocalStore provides store
    ) {
        FluentTheme(colors = if (store.darkMode) darkColors() else lightColors(), useAcrylicPopup = true) {
            if (displayMicaLayer) {
                Mica(modifier = Modifier.fillMaxSize()) {
                    content()
                }
            } else {
                CompositionLocalProvider(
                    LocalContentColor provides FluentTheme.colors.text.text.primary,
                    content = content
                )
            }
        }
    }
}