

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TicketDiagonal: ImageVector
    get() {
        if (_ticketDiagonal != null) {
            return _ticketDiagonal!!
        }
        _ticketDiagonal = fluentIcon(name = "Filled.TicketDiagonal") {
            fluentPath {
                moveTo(15.6f, 2.53f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.2f, 0.0f)
                lineToRelative(-9.87f, 9.88f)
                curveToRelative(-0.88f, 0.88f, -0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.51f, 0.51f, 1.23f, 0.42f, 1.66f, 0.16f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 1.71f, 1.71f)
                curveToRelative(-0.25f, 0.44f, -0.34f, 1.16f, 0.17f, 1.67f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.88f, 0.88f, 2.3f, 0.88f, 3.18f, 0.0f)
                lineToRelative(9.88f, -9.88f)
                curveToRelative(0.88f, -0.88f, 0.88f, -2.3f, 0.0f, -3.18f)
                lineTo(20.3f, 7.24f)
                curveToRelative(-0.51f, -0.51f, -1.23f, -0.42f, -1.66f, -0.16f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.71f, -1.71f)
                curveToRelative(0.25f, -0.44f, 0.34f, -1.16f, -0.17f, -1.67f)
                lineTo(15.6f, 2.53f)
                close()
            }
        }
        return _ticketDiagonal!!
    }

private var _ticketDiagonal: ImageVector? = null
