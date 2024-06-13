package com.konyaco.fluent.gallery

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.konyaco.fluent.*
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.gallery.component.LocalFontIconFontFamily
import com.konyaco.fluent.gallery.component.ProvideFontIcon

val LocalStore = compositionLocalOf<Store> { error("Not provided") }

class Store(
    systemDarkMode: Boolean,
    enabledAcrylicPopup: Boolean,
    compactMode: Boolean,
    fontIconEnabled: Boolean
) {
    var darkMode by mutableStateOf(systemDarkMode)

    var enabledAcrylicPopup by mutableStateOf(enabledAcrylicPopup)

    var compactMode by mutableStateOf(compactMode)

    var fontIconEnabled by mutableStateOf(fontIconEnabled)
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
            fontIconEnabled = true
        )
    }

    LaunchedEffect(systemDarkMode) {
        store.darkMode = systemDarkMode
    }
    CompositionLocalProvider(
        LocalStore provides store
    ) {
        ProvideFontIcon(store.fontIconEnabled) {
            FluentTheme(
                colors = if (store.darkMode) darkColors() else lightColors(),
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
}

@Composable
private fun ProvideFontIcon(enabled: Boolean, content: @Composable () -> Unit) {
    ProvideFontIcon {
        CompositionLocalProvider(
            LocalFontIconFontFamily provides if (enabled) LocalFontIconFontFamily.current else null,
            content = content
        )
    }
}