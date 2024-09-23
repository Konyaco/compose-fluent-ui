package com.konyaco.fluent.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild

@ExperimentalFluentApi
@Composable
fun AcrylicContainerScope.Acrylic(
    modifier: Modifier = Modifier,
    enabled: () -> Boolean = { supportAcrylic() },
    tint: Color = AcrylicDefaults.tintColor,
    shape: Shape = AcrylicDefaults.shape,
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) {
    Layer(
        modifier = modifier.acrylicOverlay(tint = tint, shape = shape, enabled = enabled),
        shape = shape,
        color = if (enabled()) Color.Transparent else FluentTheme.colors.background.acrylic.default,
        border = border,
        backgroundSizing = BackgroundSizing.InnerBorderEdge
    ) {
        content()
    }
}

@ExperimentalFluentApi
@Composable
fun AcrylicContainer(
    content: @Composable AcrylicContainerScope.() -> Unit
) {
    Box {
        val scope = remember(this) { AcrylicContainerScopeImpl(this) }
        scope.content()
    }
}

@OptIn(ExperimentalFluentApi::class)
private class AcrylicContainerScopeImpl(boxScope: BoxScope): AcrylicContainerScope, BoxScope by boxScope {
    private val hazeState = HazeState()

    override fun Modifier.behindAcrylic(): Modifier {
        return then(Modifier.haze(state = hazeState))
    }

    override fun Modifier.acrylicOverlay(tint: Color, shape: Shape, enabled: () -> Boolean): Modifier {
        return when {
            !supportAcrylic() -> background(tint.copy(1f), shape)
            !enabled() -> this
            else -> hazeChild(
                state = hazeState,
                shape = shape,
                style = HazeStyle(
                    tint = tint,
                    noiseFactor = AcrylicDefaults.noise,
                    blurRadius = AcrylicDefaults.blurRadius
                )
            )
        }
    }
}

@ExperimentalFluentApi
interface AcrylicContainerScope: BoxScope {
    fun Modifier.behindAcrylic(): Modifier

    fun Modifier.acrylicOverlay(tint: Color, shape: Shape, enabled: () -> Boolean = { true }): Modifier

}

internal object AcrylicDefaults {

    const val noise = 0.02f

    val blurRadius = 60.dp

    val tintColor: Color
        @Composable
        get() = FluentTheme.colors.background.acrylic.default.copy(
            if (FluentTheme.colors.darkMode) 0.96f else 0.85f
        )

    val shape = RectangleShape
}

internal expect fun supportAcrylic(): Boolean