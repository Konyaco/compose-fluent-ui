package com.konyaco.fluent.scheme

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue

@Composable
fun InteractionSource.collectVisualState(disabled: Boolean, focusable: Boolean = false): VisualState {
    val pressed by collectIsPressedAsState()
    val hovered by collectIsHoveredAsState()
    val focused by collectIsFocusedAsState()
    return VisualState.fromInteraction(pressed, hovered, disabled, if (focusable) focused else false)
}

enum class VisualState {
    Default, Hovered, Pressed, Disabled, Focused;

    companion object {
        fun fromInteraction(
            pressed: Boolean,
            hovered: Boolean,
            disabled: Boolean,
            focused: Boolean
        ): VisualState {
            return when {
                disabled -> Disabled
                focused -> Focused
                pressed -> Pressed
                hovered -> Hovered
                else -> Default
            }
        }
    }
}

fun interface VisualStateScheme<T> {
    fun schemeFor(state: VisualState): T
}

@Immutable
data class ValueVisualStateScheme<T>(
    val default: T,
    val hovered: T,
    val pressed: T,
    val disabled: T
) : VisualStateScheme<T> {
    override fun schemeFor(state: VisualState): T = when (state) {
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        else -> default
    }
}

interface FocusableVisualStateScheme<T> : VisualStateScheme<T>

@Immutable
data class FocusableValueVisualStateScheme<T>(
    val default: T,
    val hovered: T,
    val pressed: T,
    val disabled: T,
    val focused: T
) : FocusableVisualStateScheme<T> {
    override fun schemeFor(state: VisualState): T = when (state) {
        VisualState.Default -> default
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        VisualState.Focused -> focused
    }
}