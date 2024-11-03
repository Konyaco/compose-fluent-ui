package com.konyaco.fluent.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.HazeTint
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild
import kotlin.jvm.JvmInline

@ExperimentalFluentApi
@Composable
fun MaterialContainerScope.Material(
    material: Material,
    modifier: Modifier = Modifier,
    enabled: () -> Boolean = { supportMaterial() },
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier.materialOverlay(material = material, enabled = enabled),
        color = if (enabled()) Color.Transparent else material.style.tints.first().color,
        border = border,
        backgroundSizing = BackgroundSizing.InnerBorderEdge
    ) {
        content()
    }
}

@ExperimentalFluentApi
@Composable
fun MaterialContainer(
    content: @Composable MaterialContainerScope.() -> Unit
) {
    Box {
        val scope = remember(this) { MaterialContainerScopeImpl(this) }
        scope.content()
    }
}

@OptIn(ExperimentalFluentApi::class)
private class MaterialContainerScopeImpl(boxScope: BoxScope) : MaterialContainerScope,
    BoxScope by boxScope {
    private val hazeState = HazeState()

    override fun Modifier.behindMaterial(): Modifier {
        return then(Modifier.haze(state = hazeState))
    }

    override fun Modifier.materialOverlay(material: Material, enabled: () -> Boolean): Modifier {
        return when {
            !enabled() -> this
            else -> hazeChild(
                state = hazeState,
                style = material.style
            )
        }
    }
}

@ExperimentalFluentApi
interface MaterialContainerScope : BoxScope {
    fun Modifier.behindMaterial(): Modifier

    @Deprecated("Use materialOverlay instead")
    fun Modifier.acrylicOverlay(
        tint: Color,
        shape: Shape,
        enabled: () -> Boolean = { true }
    ): Modifier {
        return materialOverlay(
            material = MaterialDefaults.customAcrylic(tint),
            enabled = enabled
        )
    }

    fun Modifier.materialOverlay(
        material: Material,
        enabled: () -> Boolean = { true }
    ): Modifier

}

@JvmInline
@Immutable
value class Material(val style: HazeStyle)

object MaterialDefaults {

    private const val acrylicNoiseFactor = 0.02f

    private val acrylicBlurRadius = 60.dp

    private val micaBlurRadius = 240.dp

    /**
     * A [HazeStyle] which implements a mostly translucent material.
     */
    @Composable
    @ReadOnlyComposable
    fun thinAcrylic(
        isDark: Boolean = FluentTheme.colors.darkMode,
    ): Material = acrylicMaterial(
        containerColor = if (isDark) {
            Color(0xFF545454)
        } else {
            Color(0xFFD3D3D3)
        },
        fallbackColor = if (isDark) {
            Color(0x545454, 0.64f)
        } else {
            Color(0xD3D3D3, 0.6f)
        },
        isDark = isDark,
        lightTintOpacity = 0f,
        lightLuminosityOpacity = 0.44f,
        darkTintOpacity = 0f,
        darkLuminosityOpacity = 0.64f,
    )

    /**
     * A [HazeStyle] which implements a translucent material used for the most translucent layer with accent color.
     */
    @Composable
    @ReadOnlyComposable
    fun accentAcrylicBase(
        tint: Color = FluentTheme.colors.background.accentAcrylic.base,
        fallback: Color = FluentTheme.colors.background.accentAcrylic.baseFallback,
        isDark: Boolean = FluentTheme.colors.darkMode
    ): Material = acrylicMaterial(
        containerColor = tint,
        fallbackColor = fallback,
        isDark = isDark,
        lightTintOpacity = 0.8f,
        lightLuminosityOpacity = 0.8f,
        darkTintOpacity = 0.8f,
        darkLuminosityOpacity = 0.8f,
    )

    /**
     * A [HazeStyle] which implements a translucent material used for the popup container background with accent color.
     */
    @Composable
    @ReadOnlyComposable
    fun accentAcrylicDefault(
        tint: Color = FluentTheme.colors.background.accentAcrylic.default,
        fallback: Color = FluentTheme.colors.background.accentAcrylic.defaultFallback,
        isDark: Boolean = FluentTheme.colors.darkMode
    ): Material = acrylicMaterial(
        containerColor = tint,
        fallbackColor = fallback,
        isDark = isDark,
        lightTintOpacity = 0.8f,
        lightLuminosityOpacity = 0.9f,
        darkTintOpacity = 0.8f,
        darkLuminosityOpacity = 0.8f,
    )

    /**
     * A [HazeStyle] which implements a translucent material used for the most translucent layer.
     */
    @Composable
    @ReadOnlyComposable
    fun acrylicBase(
        isDark: Boolean = FluentTheme.colors.darkMode,
    ): Material = acrylicMaterial(
        containerColor = FluentTheme.colors.background.acrylic.base,
        fallbackColor = FluentTheme.colors.background.acrylic.baseFallback,
        isDark = isDark,
        lightTintOpacity = 0f,
        lightLuminosityOpacity = 0.9f,
        darkTintOpacity = 0.5f,
        darkLuminosityOpacity = 0.96f,
    )

    /**
     * A [HazeStyle] which implements a translucent material used for the popup container background.
     */
    @Composable
    @ReadOnlyComposable
    fun acrylicDefault(
        isDark: Boolean = FluentTheme.colors.darkMode,
    ): Material = acrylicMaterial(
        containerColor = FluentTheme.colors.background.acrylic.default,
        fallbackColor = FluentTheme.colors.background.acrylic.defaultFallback,
        isDark = isDark,
        lightTintOpacity = 0f,
        lightLuminosityOpacity = 0.85f,
        darkTintOpacity = 0.15f,
        darkLuminosityOpacity = 0.96f,
    )

    /**
     * A [HazeStyle] which implements a translucent application background material.
     */
    @Composable
    @ReadOnlyComposable
    fun mica(
        isDark: Boolean = FluentTheme.colors.darkMode,
    ): Material = micaMaterial(
        containerColor = FluentTheme.colors.background.mica.base,
        fallbackColor = FluentTheme.colors.background.mica.baseFallback,
        isDark = isDark,
        lightTintOpacity = 0.5f,
        lightLuminosityOpacity = 1f,
        darkTintOpacity = 0.8f,
        darkLuminosityOpacity = 1f,
    )

    /**
     * A [HazeStyle] which implements a translucent application background material used for the tab experience.
     */
    @Composable
    @ReadOnlyComposable
    fun micaAlt(
        isDark: Boolean = FluentTheme.colors.darkMode,
    ): Material = micaMaterial(
        containerColor = FluentTheme.colors.background.mica.baseAlt,
        fallbackColor = FluentTheme.colors.background.mica.baseAltFallback,
        isDark = isDark,
        lightTintOpacity = 0.5f,
        lightLuminosityOpacity = 1f,
        darkTintOpacity = 0.0f,
        darkLuminosityOpacity = 1f,
    )

    fun customAcrylic(
        tint: Color,
        fallback: Color = tint,
        backgroundColor: Color = fallback,
        isDark: Boolean = tint.luminance() < 0.5f,
        lightTintOpacity: Float = 0.8f,
        lightLuminosityOpacity: Float = 0.8f,
        darkTintOpacity: Float = lightTintOpacity,
        darkLuminosityOpacity: Float = darkTintOpacity,
    ): Material {
        return acrylicMaterial(
            containerColor = tint,
            fallbackColor = fallback,
            backgroundColor = backgroundColor,
            isDark = isDark,
            lightTintOpacity = lightTintOpacity,
            lightLuminosityOpacity = lightLuminosityOpacity,
            darkTintOpacity = darkTintOpacity,
            darkLuminosityOpacity = darkLuminosityOpacity,
        )
    }

    private fun acrylicMaterial(
        containerColor: Color,
        fallbackColor: Color = containerColor,
        backgroundColor: Color = fallbackColor,
        isDark: Boolean,
        lightTintOpacity: Float,
        lightLuminosityOpacity: Float,
        darkTintOpacity: Float,
        darkLuminosityOpacity: Float,
    ): Material = material(
        containerColor = containerColor,
        fallbackColor = fallbackColor,
        backgroundColor = backgroundColor,
        isDark = isDark,
        lightTintOpacity = lightTintOpacity,
        lightLuminosityOpacity = lightLuminosityOpacity,
        darkTintOpacity = darkTintOpacity,
        darkLuminosityOpacity = darkLuminosityOpacity,
        blurRadius = acrylicBlurRadius,
        noiseFactor = acrylicNoiseFactor,
    )

    @ReadOnlyComposable
    @Composable
    private fun micaMaterial(
        containerColor: Color = FluentTheme.colors.background.mica.base,
        fallbackColor: Color = FluentTheme.colors.background.solid.base,
        isDark: Boolean = FluentTheme.colors.darkMode,
        lightTintOpacity: Float,
        lightLuminosityOpacity: Float,
        darkTintOpacity: Float,
        darkLuminosityOpacity: Float,
    ): Material = material(
        containerColor = containerColor,
        fallbackColor = fallbackColor,
        isDark = isDark,
        lightTintOpacity = lightTintOpacity,
        lightLuminosityOpacity = lightLuminosityOpacity,
        darkTintOpacity = darkTintOpacity,
        darkLuminosityOpacity = darkLuminosityOpacity,
        blurRadius = micaBlurRadius,
        noiseFactor = 0f,
    )

    private fun material(
        containerColor: Color,
        isDark: Boolean,
        fallbackColor: Color = containerColor,
        backgroundColor: Color = fallbackColor,
        blurRadius: Dp,
        noiseFactor: Float,
        lightTintOpacity: Float,
        lightLuminosityOpacity: Float,
        darkTintOpacity: Float,
        darkLuminosityOpacity: Float,
    ): Material = Material(
        HazeStyle(
            blurRadius = blurRadius,
            noiseFactor = noiseFactor,
            backgroundColor = backgroundColor.copy(1f),
            tints = listOf(
                HazeTint(
                    color = containerColor.copy(if (isDark) darkTintOpacity else lightTintOpacity),
                    blendMode = BlendMode.Hardlight,
                ),
                HazeTint(
                    color = containerColor.copy(if (isDark) darkLuminosityOpacity else lightLuminosityOpacity),
                    blendMode = BlendMode.Luminosity,
                )
            ),
            fallbackTint = HazeTint(fallbackColor),
        )
    )

    private fun Color(color: Int, alpha: Float): Color {
        return Color(color).copy(alpha = alpha)
    }
}

internal expect fun supportMaterial(): Boolean