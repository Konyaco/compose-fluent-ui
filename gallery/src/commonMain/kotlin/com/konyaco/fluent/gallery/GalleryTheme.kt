package com.konyaco.fluent.gallery

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.BrushPainter
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.darkColors
import com.konyaco.fluent.generateShades
import com.konyaco.fluent.lightColors

val LocalStore = compositionLocalOf<Store> { error("Not provided") }

class Store(
    systemDarkMode: Boolean,
    enabledAcrylicPopup: Boolean,
    compactMode: Boolean
) {
    var darkMode by mutableStateOf(systemDarkMode)

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
            compactMode = true
        )
    }

    LaunchedEffect(systemDarkMode) {
        store.darkMode = systemDarkMode
    }
    CompositionLocalProvider(
        LocalStore provides store
    ) {
        FluentTheme(
            colors = if (store.darkMode) darkColors() else lightColors(),
            useAcrylicPopup = store.enabledAcrylicPopup,
            compactMode = store.compactMode
        ) {
            if (displayMicaLayer) {
                val accentColor = FluentTheme.colors.fillAccent.selectedTextBackground
                val painter = remember(accentColor) {
                    val shades = generateShades(accentColor)
                    BrushPainter(
                        Brush.linearGradient(
                            colors = listOf(
                                shades.light3,
                                shades.light2,
                                shades.light1
                            ),
                            start = Offset.Zero,
                            end = Offset.Infinite,
                            tileMode = TileMode.Clamp
                        )
                    )
                }
                Mica(painter = painter, modifier = Modifier.fillMaxSize()) {
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