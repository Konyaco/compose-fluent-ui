package io.github.composefluent.platform

import androidx.compose.ui.appkit.appkitEventOrNull
import androidx.compose.ui.input.pointer.PointerEvent
import platform.AppKit.NSEventPhaseNone

internal actual fun PointerEvent.indicatesPreciseScrollInput(): Boolean {
    val event = appkitEventOrNull ?: return false
    return event.phase != NSEventPhaseNone || event.momentumPhase != NSEventPhaseNone
}
