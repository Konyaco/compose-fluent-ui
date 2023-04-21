package com.konyaco.fluent.example

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.darkColors
import com.konyaco.fluent.lightColors

val LocalStore = compositionLocalOf<Store> { error("Not provided") }

class Store(
    systemDarkMode: Boolean
) {
    var darkMode by mutableStateOf(systemDarkMode)
}

@Composable
fun ExampleTheme(
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
        FluentTheme(colors = if (store.darkMode) darkColors() else lightColors()) {
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