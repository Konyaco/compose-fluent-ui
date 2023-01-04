

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTurnRight: ImageVector
    get() {
        if (_arrowTurnRight != null) {
            return _arrowTurnRight!!
        }
        _arrowTurnRight = fluentIcon(name = "Regular.ArrowTurnRight") {
            fluentPath {
                moveTo(16.28f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(3.22f, 3.22f)
                horizontalLineToRelative(-7.69f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineTo(20.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 20.0f)
                verticalLineToRelative(-8.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 10.75f, 9.0f)
                horizontalLineToRelative(7.69f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-4.5f, -4.5f)
                close()
            }
        }
        return _arrowTurnRight!!
    }

private var _arrowTurnRight: ImageVector? = null
