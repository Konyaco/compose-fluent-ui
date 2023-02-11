

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowRotateCounterclockwise: ImageVector
    get() {
        if (_arrowRotateCounterclockwise != null) {
            return _arrowRotateCounterclockwise!!
        }
        _arrowRotateCounterclockwise = fluentIcon(name = "Regular.ArrowRotateCounterclockwise") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.98f, 16.5f)
                lineTo(5.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, -0.1f)
                verticalLineToRelative(2.49f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 11.0f, -6.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 9.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                close()
                moveTo(12.0f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _arrowRotateCounterclockwise!!
    }

private var _arrowRotateCounterclockwise: ImageVector? = null
