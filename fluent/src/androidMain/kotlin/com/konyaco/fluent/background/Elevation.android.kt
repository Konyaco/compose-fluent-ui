package com.konyaco.fluent.background

import android.graphics.BlurMaskFilter
import android.os.Build
import androidx.compose.ui.graphics.Paint

internal actual fun Paint.applyShadowMaskFilter(radius: Float) {
    asFrameworkPaint().maskFilter = BlurMaskFilter(radius, BlurMaskFilter.Blur.NORMAL)
}

internal actual fun supportFluentElevation(): Boolean {
    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.P
}