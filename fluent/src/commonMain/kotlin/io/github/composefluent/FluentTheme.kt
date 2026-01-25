package io.github.composefluent

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
import io.github.composefluent.background.MaterialContainer
import io.github.composefluent.background.MaterialContainerScope
import io.github.composefluent.background.Material
import io.github.composefluent.component.ContentDialogHost
import io.github.composefluent.component.ContentDialogHostState
import io.github.composefluent.component.LocalContentDialog
import io.github.composefluent.component.ProvideFontIcon

/**
 * FluentTheme is the root component of the Fluent Design System for Compose.
 * It provides the default theming values and a [MaterialContainer] for acrylic effects.
 * **Note:** This function is designed to be placed inside a Window or View. For global
 * theme configuration, consider using [FluentThemeConfiguration].
 *
 * @param colors The colors to use for the theme. Defaults to [FluentTheme.colors].
 * @param typography The typography to use for the theme. Defaults to [FluentTheme.typography].
 * @param cornerRadius The corner radius to use for the theme. Defaults to [FluentTheme.cornerRadius].
 * @param useAcrylicPopup Whether to use acrylic for popups. Defaults to [LocalAcrylicPopupEnabled.current].
 * @param compactMode Whether to use compact mode. Defaults to true.
 * @param content The content to display within the theme.
 */
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
    MaterialContainer {
        CompositionLocalProvider(
            LocalWindowAcrylicContainer provides this,
        ) {
            FluentThemeConfiguration(
                colors = colors,
                typography = typography,
                cornerRadius = cornerRadius,
                useAcrylicPopup = useAcrylicPopup,
                compactMode = compactMode,
                contentDialogHostState = contentDialogHostState
            ) {
                ContentDialogHost(contentDialogHostState)
                Box(modifier = Modifier.behindMaterial()) {
                    ProvideFontIcon {
                        PlatformCompositionLocalProvider(content)
                    }
                }
            }
        }
    }
}

/**
 * Overrides individual theme configuration options for a subset of the UI tree.
 *
 * This allows you to locally modify aspects of the theme, such as colors, typography,
 * corner radius, compact mode, and whether acrylic popups are used,
 * for the components within the provided `content`.
 *
 * @param colors The colors to use for this configuration scope. Defaults to the current [FluentTheme.colors].
 * @param typography The typography to use for this configuration scope. Defaults to the current [FluentTheme.typography].
 * @param cornerRadius The corner radius values to use for this configuration scope. Defaults to the current [FluentTheme.cornerRadius].
 * @param useAcrylicPopup Whether to use acrylic for popups within this configuration scope. Defaults to the current value of [LocalAcrylicPopupEnabled].
 * @param compactMode Whether compact mode is enabled within this configuration scope. Defaults to the current value of [LocalCompactMode].
 * @param contentDialogHostState The state of the content dialog host to use for this configuration scope. Defaults to the current value of [LocalContentDialog].
 * @param content The composable content that will inherit the specified theme configuration.
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

/**
 * FluentTheme provides a default theme for your application using the Fluent Design System.
 * It applies default colors and typography, and enables compact mode.
 *
 * @param colors The colors to use for the theme. Defaults to the current FluentTheme colors.
 * @param typography The typography to use for the theme. Defaults to the current FluentTheme typography.
 * @param content The composable content to be themed.
 */
@OptIn(ExperimentalFluentApi::class)
@Composable
fun FluentTheme(
    colors: Colors = FluentTheme.colors,
    typography: Typography = FluentTheme.typography,
    content: @Composable () -> Unit
) {
    FluentTheme(colors, typography, LocalCornerRadius.current, useAcrylicPopup = false, compactMode = true, content)
}

/**
 * A composable that provides a compact mode configuration for its content.
 *
 * This function wraps the provided content within a [CompositionLocalProvider] that sets the
 * [LocalCompactMode] to the specified [enabled] value. This allows components within the
 * [content] to react to the compact mode setting and adjust their appearance or behavior accordingly.
 *
 * @param enabled Whether compact mode should be enabled for the wrapped content. Defaults to `true`.
 * @param content The composable content that should be provided with the compact mode setting.
 */
@Composable
fun CompactMode(enabled: Boolean = true, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalCompactMode provides enabled,
        content = content
    )
}

/**
 * Helper object to access the current Fluent Theme properties in a type-safe way.
 */
object FluentTheme {

    /**
     * The current [Colors] provided by the [FluentTheme].
     */
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    /**
     * The typography used by the theme.
     */
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    /**
     * CompositionLocal for the current [Shapes]
     */
    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    /**
     * Represents the corner radius values for various components in the theme.
     */
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

/**
 * Creates a Fluent light theme color scheme.
 *
 * @param accent The accent color to be used for generating the color scheme. Defaults to a specific blue color (0xFF0078D4).
 * @return A [Colors] object representing the light theme color scheme.
 */
fun lightColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), false)


/**
 * Creates a Fluent dark theme color scheme.
 *
 * @param accent The accent color to be used for generating the color scheme. Defaults to a specific blue color (0xFF0078D4).
 * @return A [Colors] object representing the dark theme color scheme.
 */
fun darkColors(accent: Color = Color(0xFF0078D4)): Colors = Colors(generateShades(accent), true)