package com.konyaco.fluent.animation

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.LinearEasing

object FluentEasing {
    val FastInvokeEasing = CubicBezierEasing(0f, 0f, 0f, 1f)
    val StrongInvokeEasing = CubicBezierEasing(0.13f, 1.62f, 0f, 0.92f)
    val FastDismissEasing = FastInvokeEasing
    val SoftDismissEasing = CubicBezierEasing(1f, 0f, 1f, 1f)
    val PointToPointEasing = CubicBezierEasing(0.55f, 0.55f, 0f, 1f)
    val FadeInFadeOutEasing = LinearEasing
}