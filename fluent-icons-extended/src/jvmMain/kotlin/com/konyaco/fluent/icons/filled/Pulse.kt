

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = fluentIcon(name = "Filled.Pulse") {
            fluentPath {
                moveTo(8.47f, 7.24f)
                lineToRelative(3.06f, 12.99f)
                curveToRelative(0.23f, 1.0f, 1.63f, 1.04f, 1.93f, 0.06f)
                lineToRelative(2.94f, -9.58f)
                lineToRelative(0.39f, 1.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, 0.76f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.47f)
                lineToRelative(-1.06f, -4.24f)
                curveToRelative(-0.25f, -0.99f, -1.63f, -1.02f, -1.93f, -0.05f)
                lineToRelative(-2.91f, 9.47f)
                lineToRelative(-3.15f, -13.4f)
                curveToRelative(-0.24f, -1.03f, -1.7f, -1.04f, -1.95f, -0.02f)
                lineTo(5.47f, 11.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, -0.76f)
                lineToRelative(1.25f, -5.0f)
                close()
            }
        }
        return _pulse!!
    }

private var _pulse: ImageVector? = null
