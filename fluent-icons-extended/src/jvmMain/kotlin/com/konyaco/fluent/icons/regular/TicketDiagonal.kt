

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TicketDiagonal: ImageVector
    get() {
        if (_ticketDiagonal != null) {
            return _ticketDiagonal!!
        }
        _ticketDiagonal = fluentIcon(name = "Regular.TicketDiagonal") {
            fluentPath {
                moveTo(14.53f, 3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-9.88f, 9.87f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(1.07f, 1.07f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 8.75f, 18.0f)
                curveToRelative(0.0f, 0.49f, -0.13f, 0.94f, -0.35f, 1.34f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(9.88f, -9.88f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineTo(19.34f, 8.4f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 15.25f, 6.0f)
                curveToRelative(0.0f, -0.49f, 0.13f, -0.94f, 0.35f, -1.34f)
                lineToRelative(-1.07f, -1.07f)
                close()
                moveTo(12.41f, 2.53f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.51f, 0.51f, 0.42f, 1.23f, 0.16f, 1.66f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.71f, 1.71f)
                curveToRelative(0.44f, -0.25f, 1.16f, -0.34f, 1.67f, 0.17f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-9.88f, 9.88f)
                curveToRelative(-0.88f, 0.88f, -2.3f, 0.88f, -3.18f, 0.0f)
                lineTo(7.24f, 20.3f)
                curveToRelative(-0.51f, -0.51f, -0.42f, -1.23f, -0.16f, -1.66f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.71f, -1.71f)
                curveToRelative(-0.44f, 0.25f, -1.16f, 0.34f, -1.67f, -0.17f)
                lineTo(2.53f, 15.6f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -3.18f)
                lineToRelative(9.88f, -9.88f)
                close()
            }
        }
        return _ticketDiagonal!!
    }

private var _ticketDiagonal: ImageVector? = null
