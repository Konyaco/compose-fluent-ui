package io.github.composefluent.platform

import androidx.compose.ui.awt.awtEventOrNull
import androidx.compose.ui.input.pointer.PointerEvent
import java.awt.event.MouseWheelEvent
import kotlin.math.abs

internal actual fun PointerEvent.indicatesPreciseScrollInput(): Boolean {
    val mouseWheelEvent = awtEventOrNull as? MouseWheelEvent ?: return false
    return when {
        isMacOS -> mouseWheelEvent.wheelRotation == 0
        isWindows -> false
        else -> abs(
            mouseWheelEvent.preciseWheelRotation - mouseWheelEvent.wheelRotation.toDouble()
        ) > PrecisionEpsilon
    }
}

private val isMacOS = System.getProperty("os.name").startsWith("Mac", ignoreCase = true)
private val isWindows = System.getProperty("os.name").startsWith("Windows", ignoreCase = true)
private const val PrecisionEpsilon = 0.001
