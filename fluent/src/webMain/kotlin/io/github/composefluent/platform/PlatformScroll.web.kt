package io.github.composefluent.platform

import androidx.compose.ui.input.pointer.PointerEvent

internal actual fun PointerEvent.indicatesPreciseScrollInput(): Boolean = false
