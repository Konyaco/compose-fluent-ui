

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TicketHorizontal: ImageVector
    get() {
        if (_ticketHorizontal != null) {
            return _ticketHorizontal!!
        }
        _ticketHorizontal = fluentIcon(name = "Filled.TicketHorizontal") {
            fluentPath {
                moveTo(20.75f, 5.0f)
                curveToRelative(0.7f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 0.4f, -0.3f, 0.72f, -0.7f, 0.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.48f)
                curveToRelative(0.4f, 0.03f, 0.7f, 0.36f, 0.7f, 0.75f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineTo(3.25f)
                curveTo(2.56f, 19.0f, 2.0f, 18.44f, 2.0f, 17.75f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.0f, -0.4f, 0.3f, -0.72f, 0.7f, -0.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -0.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.56f, 2.56f, 5.0f, 3.25f, 5.0f)
                horizontalLineToRelative(17.5f)
                close()
            }
        }
        return _ticketHorizontal!!
    }

private var _ticketHorizontal: ImageVector? = null
