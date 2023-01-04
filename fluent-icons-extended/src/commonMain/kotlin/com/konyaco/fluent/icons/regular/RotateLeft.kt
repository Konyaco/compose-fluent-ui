

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = fluentIcon(name = "Regular.RotateLeft") {
            fluentPath {
                moveTo(15.02f, 5.0f)
                horizontalLineToRelative(0.26f)
                curveToRelative(1.16f, 0.05f, 2.24f, 0.37f, 3.13f, 0.89f)
                curveTo(19.98f, 6.79f, 21.0f, 8.29f, 21.0f, 10.0f)
                curveToRelative(0.0f, 1.7f, -1.03f, 3.22f, -2.6f, 4.12f)
                curveToRelative(-0.96f, 0.55f, -2.14f, 0.88f, -3.4f, 0.88f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 2.59f, -0.64f)
                curveToRelative(1.15f, -0.63f, 1.91f, -1.68f, 1.91f, -2.86f)
                reflectiveCurveToRelative(-0.76f, -2.23f, -1.91f, -2.86f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, false, -2.37f, -0.64f)
                lineTo(8.06f, 6.5f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.02f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.02f, -1.04f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, 1.13f)
                lineTo(8.06f, 5.0f)
                horizontalLineToRelative(6.96f)
                close()
                moveTo(20.39f, 20.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.25f, 0.93f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.13f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.75f, -0.44f)
                lineToRelative(16.64f, 9.64f)
                close()
                moveTo(16.42f, 19.5f)
                lineTo(4.5f, 12.6f)
                verticalLineToRelative(6.9f)
                horizontalLineToRelative(11.92f)
                close()
            }
        }
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
