package com.konyaco.fluent.scheme

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
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
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        else -> default
    }

}

interface FocusableVisualStateScheme<Scheme: Any>: VisualStateScheme<Scheme>

@Immutable
data class FocusableValueVisualStateScheme<Scheme: Any>(
    val default: Scheme,
    val hovered: Scheme,
    val pressed: Scheme,
    val disabled: Scheme,
    val focused: Scheme
): FocusableVisualStateScheme<Scheme> {

    override fun schemeFor(state: VisualState): Scheme = when(state) {
        VisualState.Default -> default
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        VisualState.Focused -> focused
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

fun <T: Any> FocusableVisualStateScheme<T>.collectCurrentScheme(
    isHovered: Boolean = false,
    isPressed: Boolean = false,
    disabled: Boolean = false,
    focused: Boolean = false
): T {
    return when {
        disabled -> schemeFor(VisualState.Disabled)
        focused -> schemeFor(VisualState.Focused)
        isPressed -> schemeFor(VisualState.Pressed)
        isHovered -> schemeFor(VisualState.Hovered)
        else -> schemeFor(VisualState.Default)
    }
}

@Composable
fun <T: Any> FocusableVisualStateScheme<T>.collectCurrentScheme(interactionSource: InteractionSource, disabled: Boolean = false): T {
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isPressed by interactionSource.collectIsPressedAsState()
    val isFocused by interactionSource.collectIsFocusedAsState()
    return collectCurrentScheme(isHovered, isPressed, disabled, isFocused)
}

sealed interface VisualState {
    data object Default: VisualState

    data object Hovered: VisualState

    data object Pressed: VisualState

    data object Disabled: VisualState

    data object Focused: VisualState
}