

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) {
            return _lockClosed!!
        }
        _lockClosed = fluentIcon(name = "Regular.LockClosed") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.75f)
                curveTo(18.99f, 8.0f, 20.0f, 9.0f, 20.0f, 10.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                verticalLineToRelative(-9.5f)
                curveTo(4.0f, 9.01f, 5.0f, 8.0f, 6.25f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(17.75f, 9.5f)
                lineTo(6.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
            }
        }
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
