

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TicketHorizontal: ImageVector
    get() {
        if (_ticketHorizontal != null) {
            return _ticketHorizontal!!
        }
        _ticketHorizontal = fluentIcon(name = "Regular.TicketHorizontal") {
            fluentPath {
                moveTo(20.25f, 5.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 0.4f, -0.3f, 0.72f, -0.69f, 0.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.48f)
                curveToRelative(0.4f, 0.03f, 0.69f, 0.36f, 0.69f, 0.75f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 19.0f)
                curveTo(2.78f, 19.0f, 2.0f, 18.22f, 2.0f, 17.25f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.0f, -0.4f, 0.3f, -0.72f, 0.69f, -0.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.48f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 9.0f)
                lineTo(2.0f, 6.75f)
                curveTo(2.0f, 5.78f, 2.78f, 5.0f, 3.75f, 5.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(20.5f, 8.38f)
                lineTo(20.5f, 6.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(3.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.63f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 0.0f, 7.24f)
                verticalLineToRelative(1.63f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-1.63f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.19f, -7.18f)
                lineToRelative(0.19f, -0.06f)
                close()
            }
        }
        return _ticketHorizontal!!
    }

private var _ticketHorizontal: ImageVector? = null
