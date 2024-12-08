package com.konyaco.fluent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.konyaco.fluent.background.MaterialContainer
import com.konyaco.fluent.background.MaterialContainerScope
import com.konyaco.fluent.background.Material
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
    compactMode: Boolean = LocalCompactMode.current,
    contentDialogHostState: ContentDialogHostState = remember { ContentDialogHostState() },
    content: @Composable () -> Unit
) {
    FluentThemeConfiguration(
        colors = colors,
        typography = typography,
        cornerRadius = cornerRadius,
        useAcrylicPopup = useAcrylicPopup,
        compactMode = compactMode,
        contentDialogHostState = contentDialogHostState,
    ) {
        FluentWindowLayer(
            contentDialogHostState = contentDialogHostState,
            content = content
        )
    }
}

/**
 * Uses for override theme configuration and application scope
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

@ExperimentalFluentApi
@Composable
fun FluentWindowLayer(
    contentDialogHostState: ContentDialogHostState = remember { ContentDialogHostState() },
    content: @Composable () -> Unit
) {
    MaterialContainer {
        ContentDialogHost(contentDialogHostState)
        Box(modifier = Modifier.behindMaterial()) {
            CompositionLocalProvider(
                LocalWindowAcrylicContainer provides this@MaterialContainer,
                LocalContentDialog provides contentDialogHostState
            ) {
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
    FluentTheme(
        colors = colors,
        typography = typography,
        useAcrylicPopup = false,
        compactMode = true,
        content = content
    )
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
    staticCompositionLocalOf<MaterialContainerScope> { EmptyMaterialContainerScope() }

internal val LocalCompactMode = staticCompositionLocalOf { true }

@OptIn(ExperimentalFluentApi::class)
private class EmptyMaterialContainerScope : MaterialContainerScope {
    override fun Modifier.behindMaterial(): Modifier {
        return this
    }

    override fun Modifier.materialOverlay(material: Material, enabled: () -> Boolean): Modifier {
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