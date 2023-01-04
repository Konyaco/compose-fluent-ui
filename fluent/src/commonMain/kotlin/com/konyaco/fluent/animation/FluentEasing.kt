package com.konyaco.fluent.animation

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.LinearEasing

object FluentEasing {
    /**
     * Direct and subtle
     *
     * Usage: Transitions that are functional and utilitarian should use this curve.
     */
    val FastInvokeEasing = CubicBezierEasing(0f, 0f, 0f, 1f)

    /**
     * Bold and emphasizing
     *
     * Usage: Transitions that call attention or reinforce an action should use this curve.
     */
    val StrongInvokeEasing = CubicBezierEasing(0.13f, 1.62f, 0f, 0.92f)

    /**
     * Direct and subtle
     *
     * Usage: Transitions that dismiss a surface without going off screen or within the same area should use this curve combined with a fade out.
     */
    val FastDismissEasing = FastInvokeEasing

    /**
     * Gentle and mellow
     *
     * Usage: Transitions that dismiss a surface off screen while confirming a user action should use this curve.
     */
    val SoftDismissEasing = CubicBezierEasing(1f, 0f, 1f, 1f)

    /**
     * Direct and guiding
     *
     * Usage: Transitions that keep the same element on screen going from one place to another should use this curve.
     */
    val PointToPointEasing = CubicBezierEasing(0.55f, 0.55f, 0f, 1f)

    /**
     * Quick and efficient
     *
     * Usage: Transitions that keep the same element on screen going from one place to another should use this curve.
     */
    val FadeInFadeOutEasing = LinearEasing
}