package io.github.composefluent.platform

import androidx.compose.ui.input.pointer.PointerEvent

/**
 * Returns whether this event provides platform-specific evidence of continuous scroll input.
 *
 * A false result means that the event is inconclusive, not necessarily that it came from a
 * stepping mouse wheel. Callers may retain a true result for the rest of the input sequence.
 */
internal expect fun PointerEvent.indicatesPreciseScrollInput(): Boolean
