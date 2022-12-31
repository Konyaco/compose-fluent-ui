

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LockMultiple: ImageVector
    get() {
        if (_lockMultiple != null) {
            return _lockMultiple!!
        }
        _lockMultiple = fluentIcon(name = "Filled.LockMultiple") {
            fluentPath {
                moveTo(7.25f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-7.5f)
                curveTo(4.0f, 7.51f, 5.0f, 6.5f, 6.25f, 6.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.75f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.75f, 13.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(7.63f, 19.5f)
                curveToRelative(0.3f, 0.87f, 1.14f, 1.5f, 2.12f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveTo(18.1f, 21.0f, 20.0f, 19.1f, 20.0f, 16.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.98f, -0.63f, -1.81f, -1.5f, -2.12f)
                verticalLineToRelative(6.62f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                lineTo(7.63f, 19.5f)
                close()
            }
        }
        return _lockMultiple!!
    }

private var _lockMultiple: ImageVector? = null
