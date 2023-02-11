

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PenOff: ImageVector
    get() {
        if (_penOff != null) {
            return _penOff!!
        }
        _penOff = fluentIcon(name = "Filled.PenOff") {
            fluentPath {
                moveTo(14.0f, 15.06f)
                lineToRelative(6.72f, 6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(8.94f, 10.0f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.4f, 0.4f, -0.7f, 0.92f, -0.82f, 1.48f)
                lineToRelative(-1.1f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.9f, 0.9f)
                lineToRelative(4.6f, -1.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 9.0f, 20.06f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(19.0f, 12.53f)
                lineToRelative(-1.65f, 1.64f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(1.65f, -1.64f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -4.59f)
                lineToRelative(0.9f, -0.9f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -5.07f, -5.05f)
                lineToRelative(-4.83f, 4.83f)
                lineToRelative(5.06f, 5.06f)
                lineTo(19.0f, 10.06f)
                curveToRelative(0.68f, 0.68f, 0.68f, 1.79f, 0.0f, 2.47f)
                close()
            }
        }
        return _penOff!!
    }

private var _penOff: ImageVector? = null
