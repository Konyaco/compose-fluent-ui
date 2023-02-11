

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowHookDownRight: ImageVector
    get() {
        if (_arrowHookDownRight != null) {
            return _arrowHookDownRight!!
        }
        _arrowHookDownRight = fluentIcon(name = "Filled.ArrowHookDownRight") {
            fluentPath {
                moveTo(10.5f, 6.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, 13.0f)
                horizontalLineToRelative(5.14f)
                lineToRelative(-1.93f, 1.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.42f)
                lineToRelative(3.53f, -3.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.21f, -0.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.18f, -1.24f)
                lineToRelative(-0.03f, -0.03f)
                lineToRelative(-3.53f, -3.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 1.41f)
                lineTo(15.59f, 15.0f)
                horizontalLineTo(10.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                close()
            }
        }
        return _arrowHookDownRight!!
    }

private var _arrowHookDownRight: ImageVector? = null
