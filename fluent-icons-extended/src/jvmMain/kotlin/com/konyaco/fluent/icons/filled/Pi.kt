

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = fluentIcon(name = "Filled.Pi") {
            fluentPath {
                moveTo(2.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(15.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(10.7f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.0f, 1.42f)
                lineToRelative(0.16f, -0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.68f, 1.88f)
                lineToRelative(-0.16f, 0.06f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 16.7f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.98f)
                arcToRelative(53.9f, 53.9f, 0.0f, false, true, -0.36f, 4.21f)
                arcToRelative(45.04f, 45.04f, 0.0f, false, true, -1.93f, 9.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.88f, -0.66f)
                arcToRelative(43.1f, 43.1f, 0.0f, false, false, 1.82f, -8.7f)
                arcTo(65.6f, 65.6f, 0.0f, false, false, 7.98f, 6.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        return _pi!!
    }

private var _pi: ImageVector? = null
