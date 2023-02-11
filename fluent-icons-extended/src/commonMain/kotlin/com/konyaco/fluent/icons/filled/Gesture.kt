

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = fluentIcon(name = "Filled.Gesture") {
            fluentPath {
                moveTo(3.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(12.35f, 6.0f)
                lineToRelative(8.01f, 3.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.2f, 1.77f)
                lineToRelative(-0.11f, 0.06f)
                lineToRelative(-14.0f, 6.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.74f)
                lineToRelative(0.1f, -0.06f)
                lineToRelative(11.98f, -5.95f)
                lineToRelative(-10.9f, -4.22f)
                curveToRelative(-0.99f, -0.38f, -0.76f, -1.82f, 0.25f, -1.92f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(20.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        return _gesture!!
    }

private var _gesture: ImageVector? = null
