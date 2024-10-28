package com.konyaco.fluent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.konyaco.fluent.background.AcrylicContainer
import com.konyaco.fluent.background.AcrylicContainerScope
import com.konyaco.fluent.component.ContentDialogHost
import com.konyaco.fluent.component.ContentDialogHostState
import com.konyaco.fluent.component.LocalContentDialog
import com.konyaco.fluent.component.ProvideFontIcon

@ExperimentalFluentApi
@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    cornerRadius: CornerRadius = FluentTheme.cornerRadius,
    useAcrylicPopup: Boolean = LocalAcrylicPopupEnabled.current,
    compactMode: Boolean = true,
    content: @Composable () -> Unit
) {
    val contentDialogHostState = remember { ContentDialogHostState() }
    AcrylicContainer {
        CompositionLocalProvider(
            LocalAcrylicPopupEnabled provides useAcrylicPopup,
            LocalColors provides colors,
            LocalTypography provides typography,
            LocalWindowAcrylicContainer provides this,
            LocalTextSelectionColors provides TextSelectionColors(
                colors.text.onAccent.primary,
                colors.fillAccent.selectedTextBackground.copy(0.4f)
            ),
            LocalContentDialog provides contentDialogHostState,
            LocalCompactMode provides compactMode,
            LocalCornerRadius provides cornerRadius,
            LocalShapes provides cornerRadius.toShapes()
        ) {
            ContentDialogHost(contentDialogHostState)
            Box(modifier = Modifier.behindAcrylic()) {
                ProvideFontIcon {
                    PlatformCompositionLocalProvider(content)
                }
            }
        }
    }
}

/**
 * Uses for override theme configuration
 */
@ExperimentalFluentApi
@Composable
fun FluentThemeConfiguration(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    cornerRadius: CornerRadius = FluentTheme.cornerRadius,
    useAcrylicPopup: Boolean = LocalAcrylicPopupEnabled.current,
    compactMode: Boolean = LocalCompactMode.current,
    contentDialogHostState: ContentDialogHostState = LocalContentDialog.current,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalAcrylicPopupEnabled provides useAcrylicPopup,
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalTextSelectionColors provides TextSelectionColors(
            colors.text.onAccent.primary,
            colors.fillAccent.selectedTextBackground.copy(0.4f)
        ),
        LocalCompactMode provides compactMode,
        LocalContentDialog provides contentDialogHostState,
        LocalCornerRadius provides cornerRadius,
        LocalShapes provides cornerRadius.toShapes(),
        content = content
    )
}

@OptIn(ExperimentalFluentApi::class)
@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    content: @Composable () -> Unit
) {
    FluentTheme(colors, typography, LocalCornerRadius.current, useAcrylicPopup = false, compactMode = true, content)
}

@Composable
fun CompactMode(enabled: Boolean = true, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalCompactMode provides enabled,
        content = content
    )
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

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val cornerRadius: CornerRadius
        @Composable
        @ReadOnlyComposable
        get() = LocalCornerRadius.current
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

@ExperimentalFluentApi
internal val LocalWindowAcrylicContainer =
    staticCompositionLocalOf<AcrylicContainerScope> { EmptyAcrylicContainerScope() }

internal val LocalCompactMode = staticCompositionLocalOf { true }

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

@Stable
fun lightColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(Shades.generate(accent), false)

@Stable
fun darkColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(Shades.generate(accent), true)