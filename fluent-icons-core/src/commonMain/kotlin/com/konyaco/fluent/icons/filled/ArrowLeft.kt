

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = fluentIcon(name = "Filled.ArrowLeft") {
            fluentPath {
                moveTo(10.3f, 19.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.43f)
                lineTo(6.33f, 13.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.33f)
                lineToRelative(5.37f, -5.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineToRelative(-6.93f, 6.82f)
                curveToRelative(-0.5f, 0.5f, -0.5f, 1.3f, 0.0f, 1.78f)
                lineToRelative(6.92f, 6.83f)
                close()
            }
        }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
