package com.konyaco.fluent.gallery

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.konyaco.fluent.*
import com.konyaco.fluent.background.Mica

val LocalStore = compositionLocalOf<Store> { error("Not provided") }

class Store(
    systemDarkMode: Boolean,
    enabledAcrylicPopup: Boolean,
    compactMode: Boolean,
    accentColor: Color
) {
    var darkMode by mutableStateOf(systemDarkMode)

    var accentColor by mutableStateOf(accentColor)

    var enabledAcrylicPopup by mutableStateOf(enabledAcrylicPopup)

    var compactMode by mutableStateOf(compactMode)
}

@OptIn(ExperimentalFluentApi::class)
@Composable
fun GalleryTheme(
    displayMicaLayer: Boolean = true,
    content: @Composable () -> Unit
) {
    val systemDarkMode = isSystemInDarkTheme()

    val store = remember {
        Store(
            systemDarkMode = systemDarkMode,
            enabledAcrylicPopup = true,
            compactMode = true,
            accentColor = Color(0xFF0078D4)
        )
    }

    LaunchedEffect(systemDarkMode) {
        store.darkMode = systemDarkMode
    }
    CompositionLocalProvider(
        LocalStore provides store
    ) {
        FluentTheme(
            colors = if (store.darkMode) darkColors(store.accentColor) else lightColors(store.accentColor),
            useAcrylicPopup = store.enabledAcrylicPopup,
            compactMode = store.compactMode
        ) {
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