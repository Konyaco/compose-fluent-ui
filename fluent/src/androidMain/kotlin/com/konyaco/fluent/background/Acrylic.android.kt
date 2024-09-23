package com.konyaco.fluent.background

import android.os.Build

internal actual fun supportAcrylic(): Boolean {
    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
}