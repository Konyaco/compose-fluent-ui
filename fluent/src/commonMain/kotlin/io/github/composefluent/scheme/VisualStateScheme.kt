package io.github.composefluent.scheme

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue

/**
 * Collects the visual state of an [InteractionSource] based on its interactions.
 *
 * This function observes the pressed, hovered, and focused states of the provided [InteractionSource]
 * and maps them to a [VisualState] enum value.
 *
 * @param disabled Indicates whether the component is in a disabled state.
 * @param focusFirst Determines whether the focused state should take precedence over other states when computing the visual state. Defaults to `false`.
 * @return The [VisualState] representing the current interaction state of the [InteractionSource].
 */
@Composable
fun InteractionSource.collectVisualState(disabled: Boolean, focusFirst: Boolean = false): VisualState {
    val pressed by collectIsPressedAsState()
    val hovered by collectIsHoveredAsState()
    val focused by collectIsFocusedAsState()
    return if (focusFirst) VisualState.fromInteractionFocusFirst(pressed, hovered, disabled, focused)
    else VisualState.fromInteraction(pressed, hovered, disabled, focused)
}

/**
 * Represents the visual state of a component.
 *
 * The possible states are:
 * - [Default]: The component is in its normal, inactive state.
 * - [Hovered]: The pointer is hovering over the component.
 * - [Pressed]: The component is being pressed by the pointer.
 * - [Disabled]: The component is disabled and cannot be interacted with.
 * - [Focused]: The component has keyboard focus.
 *
 * This enum also provides factory methods to derive the visual state from
 * interactions such as pressed, hovered, disabled, and focused.
 *
 * The order of precedence is:
 * 1. Disabled
 * 2. Pressed/Focused (depends on the factory method used)
 * 3. Hovered
 * 4. Default
 *
 * @see fromInteraction
 * @see fromInteractionFocusFirst
 */
enum class VisualState {
    Default, Hovered, Pressed, Disabled, Focused;

    companion object {
        /**
         * Maps boolean states of interaction to a [VisualState].
         *
         * The order of precedence for visual states is as follows (from highest to lowest):
         * 1. [VisualState.Disabled]
         * 2. [VisualState.Pressed]
         * 3. [VisualState.Hovered]
         * 4. [VisualState.Focused]
         * 5. [VisualState.Default]
         *
         * If multiple states are active, the one with higher precedence will be chosen.
         *
         * @param pressed Whether the component is currently being pressed.
         * @param hovered Whether the component is currently being hovered over.
         * @param disabled Whether the component is disabled.
         * @param focused Whether the component currently has input focus.
         * @return The corresponding [VisualState] for the given interaction state.
         */
        fun fromInteraction(
            pressed: Boolean,
            hovered: Boolean,
            disabled: Boolean,
            focused: Boolean
        ): VisualState {
            return when {
                disabled -> Disabled
                pressed -> Pressed
                hovered -> Hovered
                focused -> Focused
                else -> Default
            }
        }

        /**
         * Determines the [VisualState] based on interaction states, prioritizing focus over hover and pressed.
         *
         * The priority order is:
         * 1. [Disabled]
         * 2. [Focused]
         * 3. [Pressed]
         * 4. [Hovered]
         * 5. [Default]
         *
         * @param pressed `true` if the component is being pressed, `false` otherwise.
         * @param hovered `true` if the component is being hovered, `false` otherwise.
         * @param disabled `true` if the component is disabled, `false` otherwise.
         * @param focused `true` if the component has focus, `false` otherwise.
         * @return The corresponding [VisualState].
         */
        fun fromInteractionFocusFirst(
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

/**
 * A scheme that provides a value of type [T] based on the current [VisualState].
 *
 * Implementations of this interface define how a visual property should change
 * based on different interaction states like default, hovered, pressed, disabled, and focused.
 *
 * @param T The type of value provided by this scheme.
 */
fun interface VisualStateScheme<T> {

    /**
     * Returns the scheme associated with the given [state].
     *
     * @param state The [VisualState] to retrieve the scheme for.
     * @return The scheme corresponding to the provided [state].
     */
    fun schemeFor(state: VisualState): T
}

/**
 * A visual scheme that provides different values for five visual states:
 * [VisualState.Default], [VisualState.Hovered], [VisualState.Pressed],
 * [VisualState.Disabled], and [VisualState.Focused].
 *
 * @param T The type of the value provided for each state.
 * @property default The value for the [VisualState.Default] state.
 * @property hovered The value for the [VisualState.Hovered] state.
 * @property pressed The value for the [VisualState.Pressed] state.
 * @property disabled The value for the [VisualState.Disabled] state.
 * @property focused The value for the [VisualState.Focused] state. Defaults to [default].
 */
@Immutable
data class PentaVisualScheme<T>(
    val default: T,
    val hovered: T,
    val pressed: T,
    val disabled: T,
    val focused: T = default
) : VisualStateScheme<T> {
    override fun schemeFor(state: VisualState): T = when (state) {
        VisualState.Default -> default
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        VisualState.Focused -> focused
    }
}

/**
 * Transforms every state value in this visual scheme while preserving its state mapping.
 *
 * @param T Type of the values in this scheme.
 * @param R Type of the transformed values.
 * @param transform Transformation applied to each value. The receiver is the value for the
 * corresponding state and [VisualState] identifies that state.
 * @return A five-state scheme containing the transformed values.
 */
inline fun <T, R> VisualStateScheme<T>.map(transform: T.(state: VisualState) -> R): PentaVisualScheme<R> {
    if (this is PentaVisualScheme<T>) return map(transform)
    return PentaVisualScheme(
        default = transform(schemeFor(VisualState.Default), VisualState.Default),
        hovered = transform(schemeFor(VisualState.Hovered), VisualState.Hovered),
        pressed = transform(schemeFor(VisualState.Pressed), VisualState.Pressed),
        disabled = transform(schemeFor(VisualState.Disabled), VisualState.Disabled),
        focused = transform(schemeFor(VisualState.Focused), VisualState.Focused),
    )
}

/**
 * Transforms every value in this [PentaVisualScheme] while preserving its state mapping.
 *
 * @param T Type of the values in this scheme.
 * @param R Type of the transformed values.
 * @param transform Transformation applied to each value. The receiver is the value for the
 * corresponding state and [VisualState] identifies that state.
 * @return A five-state scheme containing the transformed values.
 */
inline fun <T, R> PentaVisualScheme<T>.map(transform: T.(state: VisualState) -> R) = PentaVisualScheme(
    default = transform(default, VisualState.Default),
    hovered = transform(hovered, VisualState.Hovered),
    pressed = transform(pressed, VisualState.Pressed),
    disabled = transform(disabled, VisualState.Disabled),
    focused = transform(focused, VisualState.Focused),
)
