

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PenOff: ImageVector
    get() {
        if (_penOff != null) {
            return _penOff!!
        }
        _penOff = fluentIcon(name = "Regular.PenOff") {
            fluentPath {
                moveTo(8.94f, 10.0f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineTo(14.0f, 15.06f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.7f, -1.48f, 0.82f)
                lineToRelative(-4.6f, 1.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.9f, -0.9f)
                lineToRelative(1.1f, -4.6f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 3.94f, 15.0f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(12.94f, 14.0f)
                lineTo(10.0f, 11.06f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.42f, 0.76f)
                lineToRelative(-0.82f, 3.42f)
                lineToRelative(3.42f, -0.81f)
                curveToRelative(0.29f, -0.07f, 0.55f, -0.22f, 0.76f, -0.43f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(19.89f, 7.05f)
                lineToRelative(-4.83f, 4.83f)
                lineToRelative(1.06f, 1.06f)
                lineTo(19.0f, 10.06f)
                curveToRelative(0.68f, 0.68f, 0.68f, 1.79f, 0.0f, 2.47f)
                lineToRelative(-1.65f, 1.64f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(1.64f, -1.64f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 20.07f, 9.0f)
                lineToRelative(0.9f, -0.9f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -5.07f, -5.05f)
                lineToRelative(-4.83f, 4.83f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(4.83f, -4.83f)
                arcToRelative(2.08f, 2.08f, 0.0f, true, true, 2.94f, 2.94f)
                close()
            }
        }
        return _penOff!!
    }

private var _penOff: ImageVector? = null
