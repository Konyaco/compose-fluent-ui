

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = fluentIcon(name = "Filled.RotateLeft") {
            fluentPath {
                moveTo(14.5f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.49f, 0.0f, 4.5f, -1.57f, 4.5f, -3.5f)
                curveToRelative(0.0f, -1.87f, -1.9f, -3.4f, -4.28f, -3.5f)
                lineTo(8.06f, 6.5f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, 1.13f)
                lineTo(8.06f, 5.0f)
                lineTo(15.0f, 5.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.24f, 6.0f, 5.0f)
                reflectiveCurveToRelative(-2.69f, 5.0f, -6.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(3.5f, 10.37f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.14f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.25f, -0.93f)
                lineTo(3.75f, 10.43f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.25f, -0.06f)
                close()
            }
        }
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
