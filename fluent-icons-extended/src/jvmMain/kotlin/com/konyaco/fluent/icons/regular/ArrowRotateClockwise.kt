

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowRotateClockwise: ImageVector
    get() {
        if (_arrowRotateClockwise != null) {
            return _arrowRotateClockwise!!
        }
        _arrowRotateClockwise = fluentIcon(name = "Regular.ArrowRotateClockwise") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 4.98f, 16.5f)
                horizontalLineToRelative(1.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(2.49f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 4.5f, 12.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                close()
                moveTo(12.0f, 9.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                close()
                moveTo(12.0f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _arrowRotateClockwise!!
    }

private var _arrowRotateClockwise: ImageVector? = null
