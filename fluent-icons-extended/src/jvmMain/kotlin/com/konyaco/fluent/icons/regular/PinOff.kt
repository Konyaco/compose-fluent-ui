

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PinOff: ImageVector
    get() {
        if (_pinOff != null) {
            return _pinOff!!
        }
        _pinOff = fluentIcon(name = "Regular.PinOff") {
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
                moveTo(13.64f, 14.7f)
                lineToRelative(-1.26f, 3.62f)
                lineToRelative(-6.7f, -6.7f)
                lineToRelative(3.62f, -1.26f)
                lineToRelative(4.34f, 4.34f)
                close()
                moveTo(19.68f, 10.82f)
                lineToRelative(-3.78f, 1.9f)
                lineTo(17.0f, 13.82f)
                lineToRelative(3.34f, -1.67f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.72f, -4.4f)
                lineToRelative(-4.83f, -4.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -4.4f, 0.72f)
                lineToRelative(-1.67f, 3.34f)
                lineToRelative(1.12f, 1.11f)
                lineToRelative(1.89f, -3.78f)
                curveToRelative(0.38f, -0.77f, 1.4f, -0.93f, 2.0f, -0.33f)
                lineToRelative(4.83f, 4.83f)
                curveToRelative(0.6f, 0.6f, 0.44f, 1.62f, -0.33f, 2.0f)
                close()
            }
        }
        return _pinOff!!
    }

private var _pinOff: ImageVector? = null
