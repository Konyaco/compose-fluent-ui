

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = fluentIcon(name = "Regular.Pi") {
            fluentPath {
                moveTo(2.5f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.25f, 4.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(11.45f)
                curveToRelative(0.0f, 1.21f, 1.2f, 2.06f, 2.34f, 1.65f)
                lineToRelative(0.16f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.5f, 1.42f)
                lineToRelative(-0.16f, 0.05f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.34f, -3.06f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(56.9f, 56.9f, 0.0f, false, true, -0.25f, 4.53f)
                curveToRelative(-0.25f, 2.87f, -0.76f, 6.5f, -1.8f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.4f, -0.5f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, 1.7f, -9.1f)
                arcTo(67.9f, 67.9f, 0.0f, false, false, 8.0f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.56f, 5.5f, 4.0f, 6.06f, 4.0f, 6.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        return _pi!!
    }

private var _pi: ImageVector? = null
