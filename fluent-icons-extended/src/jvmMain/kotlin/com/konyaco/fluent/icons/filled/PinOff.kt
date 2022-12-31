

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PinOff: ImageVector
    get() {
        if (_pinOff != null) {
            return _pinOff!!
        }
        _pinOff = fluentIcon(name = "Filled.PinOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(5.9f, 5.9f)
                lineToRelative(-3.3f, 1.15f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.49f, 2.07f)
                lineToRelative(3.1f, 3.1f)
                lineTo(3.0f, 19.94f)
                lineTo(3.0f, 21.0f)
                horizontalLineToRelative(1.06f)
                lineToRelative(4.44f, -4.44f)
                lineToRelative(3.1f, 3.1f)
                curveToRelative(0.66f, 0.66f, 1.77f, 0.4f, 2.07f, -0.47f)
                lineToRelative(1.14f, -3.31f)
                lineToRelative(5.91f, 5.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(20.35f, 12.16f)
                lineToRelative(-3.34f, 1.67f)
                lineTo(10.17f, 7.0f)
                lineToRelative(1.67f, -3.34f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 4.4f, -0.72f)
                lineToRelative(4.83f, 4.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.72f, 4.4f)
                close()
            }
        }
        return _pinOff!!
    }

private var _pinOff: ImageVector? = null
