

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = fluentIcon(name = "Regular.RotateRight") {
            fluentPath {
                moveTo(8.98f, 5.0f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(6.79f, 6.79f, 0.0f, false, false, -3.13f, 0.89f)
                arcTo(4.82f, 4.82f, 0.0f, false, false, 3.0f, 10.0f)
                curveToRelative(0.0f, 1.7f, 1.03f, 3.22f, 2.6f, 4.12f)
                curveToRelative(0.96f, 0.55f, 2.14f, 0.88f, 3.4f, 0.88f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(9.0f, 13.5f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -2.59f, -0.64f)
                curveTo(5.26f, 12.23f, 4.5f, 11.18f, 4.5f, 10.0f)
                reflectiveCurveToRelative(0.76f, -2.23f, 1.91f, -2.86f)
                curveToRelative(0.68f, -0.37f, 1.49f, -0.6f, 2.37f, -0.64f)
                horizontalLineToRelative(7.16f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, 1.13f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.02f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.02f, -1.04f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.13f)
                lineTo(15.94f, 5.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(-0.02f)
                close()
                moveTo(3.61f, 20.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.25f, 0.93f)
                lineTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-9.13f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.75f, -0.44f)
                lineTo(3.6f, 20.07f)
                close()
                moveTo(7.58f, 19.5f)
                lineToRelative(11.92f, -6.9f)
                verticalLineToRelative(6.9f)
                lineTo(7.58f, 19.5f)
                close()
            }
        }
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
