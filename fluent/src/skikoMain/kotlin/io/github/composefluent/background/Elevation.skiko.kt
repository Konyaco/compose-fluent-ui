package io.github.composefluent.background

import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.skiaPaint
import org.jetbrains.skia.FilterBlurMode
import org.jetbrains.skia.MaskFilter

internal actual fun Paint.applyShadowMaskFilter(radius: Float) {
    skiaPaint.maskFilter = MaskFilter.makeBlur(
        mode = FilterBlurMode.NORMAL,
        // Same formula as BlurEffect.convertRadiusToSigma, which became an
        // unstable compose-ui internal API in Compose 1.11.
        sigma = if (radius > 0) radius * 0.57735f + 0.5f else 0.0f
    )
}

internal actual fun supportFluentElevation(): Boolean {
    return true
}