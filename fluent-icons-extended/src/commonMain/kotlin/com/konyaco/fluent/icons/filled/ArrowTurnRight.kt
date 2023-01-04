

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTurnRight: ImageVector
    get() {
        if (_arrowTurnRight != null) {
            return _arrowTurnRight!!
        }
        _arrowTurnRight = fluentIcon(name = "Filled.ArrowTurnRight") {
            fluentPath {
                moveTo(16.46f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, 1.4f)
                lineToRelative(2.3f, 2.3f)
                horizontalLineTo(10.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.0f, 11.5f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 9.0f)
                horizontalLineToRelative(7.34f)
                lineToRelative(-2.8f, 2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(4.25f, -4.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(16.46f, 3.3f)
                close()
            }
        }
        return _arrowTurnRight!!
    }

private var _arrowTurnRight: ImageVector? = null
