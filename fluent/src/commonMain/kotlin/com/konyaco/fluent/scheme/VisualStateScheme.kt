package com.konyaco.fluent.scheme

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.*

fun interface VisualStateScheme<Scheme: Any> {
    fun schemeFor(state: VisualState): Scheme
}

@Immutable
data class ValueVisualStateScheme<Scheme: Any>(
    val default: Scheme,
    val hovered: Scheme,
    val pressed: Scheme,
    val disabled: Scheme
): VisualStateScheme<Scheme> {

    override fun schemeFor(state: VisualState): Scheme = when(state) {
        VisualState.Default -> default
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
    }

}

fun <T: Any> VisualStateScheme<T>.collectCurrentScheme(isHovered: Boolean = false, isPressed: Boolean = false, disabled: Boolean = false): T {
    return when {
        disabled -> schemeFor(VisualState.Disabled)
        isPressed -> schemeFor(VisualState.Pressed)
        isHovered -> schemeFor(VisualState.Hovered)
        else -> schemeFor(VisualState.Default)
    }
}

@Composable
fun <T: Any> VisualStateScheme<T>.collectCurrentScheme(interactionSource: InteractionSource, disabled: Boolean = false): T {
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isPressed by interactionSource.collectIsPressedAsState()
    return collectCurrentScheme(isHovered, isPressed, disabled)
}

sealed interface VisualState {
    data object Default: VisualState

    data object Hovered: VisualState

    data object Pressed: VisualState

    data object Disabled: VisualState
}