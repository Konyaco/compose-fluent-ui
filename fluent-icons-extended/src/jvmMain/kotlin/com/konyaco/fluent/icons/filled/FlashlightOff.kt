

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = fluentIcon(name = "Filled.FlashlightOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.06f, 15.0f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(0.89f, -0.89f, 0.89f, -2.31f, 0.0f, -3.2f)
                lineTo(13.6f, 3.54f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.18f, 0.0f)
                lineTo(9.0f, 4.93f)
                lineTo(19.06f, 15.0f)
                close()
                moveTo(13.0f, 16.06f)
                lineTo(7.94f, 11.0f)
                lineToRelative(-4.91f, 4.9f)
                curveToRelative(-0.88f, 0.89f, -0.88f, 2.31f, 0.0f, 3.2f)
                lineToRelative(1.88f, 1.87f)
                curveToRelative(0.88f, 0.88f, 2.3f, 0.88f, 3.18f, 0.0f)
                lineToRelative(4.91f, -4.9f)
                close()
                moveTo(9.53f, 15.53f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                close()
            }
        }
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
