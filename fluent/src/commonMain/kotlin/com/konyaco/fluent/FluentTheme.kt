package com.konyaco.fluent

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.konyaco.fluent.background.AcrylicContainer
import com.konyaco.fluent.background.AcrylicContainerScope
import com.konyaco.fluent.component.ProvideFontIcon

@ExperimentalFluentApi
@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    useAcrylicPopup: Boolean = false,
    content: @Composable () -> Unit
) {
    AcrylicContainer {
        CompositionLocalProvider(
            LocalAcrylicPopupEnabled provides useAcrylicPopup,
            LocalColors provides colors,
            LocalTypography provides typography,
            LocalWindowAcrylicContainer provides this
        ) {
            Box(modifier = Modifier.behindAcrylic()) {
                ProvideFontIcon {
                    PlatformCompositionLocalProvider(content)
                }
            }
        }
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    content: @Composable () -> Unit
) {
    FluentTheme(colors, typography, useAcrylicPopup = false, content)
}

object FluentTheme {
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

@ExperimentalFluentApi
internal val LocalWindowAcrylicContainer =
    staticCompositionLocalOf<AcrylicContainerScope> { EmptyAcrylicContainerScope() }

@OptIn(ExperimentalFluentApi::class)
private class EmptyAcrylicContainerScope : AcrylicContainerScope {
    override fun Modifier.behindAcrylic(): Modifier {
        return this
    }

    override fun Modifier.acrylicOverlay(tint: Color, shape: Shape, enabled: () -> Boolean): Modifier {
        return this
    }

    override fun Modifier.align(alignment: Alignment): Modifier {
        return this
    }

    override fun Modifier.matchParentSize(): Modifier {
        return this
    }
}

internal val LocalAcrylicPopupEnabled = staticCompositionLocalOf { true }

fun lightColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), false)
fun darkColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), true)