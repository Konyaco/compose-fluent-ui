package com.konyaco.fluent.background

import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Paint
import org.jetbrains.skia.FilterBlurMode
import org.jetbrains.skia.MaskFilter

internal actual fun Paint.applyShadowMaskFilter(radius: Float) {
    asFrameworkPaint().maskFilter = MaskFilter.makeBlur(
        mode = FilterBlurMode.NORMAL,
        sigma = BlurEffect.convertRadiusToSigma(radius)
    )
}

internal actual fun supportFluentElevation(): Boolean {
    return true
}