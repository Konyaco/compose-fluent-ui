

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = fluentIcon(name = "Filled.Eraser") {
            fluentPath {
                moveToRelative(15.87f, 2.67f)
                lineToRelative(4.97f, 4.97f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-8.68f, 8.68f)
                horizontalLineToRelative(6.1f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineTo(9.83f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, true, -1.71f, -0.65f)
                lineToRelative(-4.97f, -4.97f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -3.18f)
                lineToRelative(9.53f, -9.53f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                close()
                moveTo(11.7f, 17.76f)
                lineTo(5.74f, 11.8f)
                lineToRelative(-1.5f, 1.47f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(4.94f, 4.95f)
                curveToRelative(0.3f, 0.28f, 0.77f, 0.28f, 1.06f, -0.02f)
                lineToRelative(1.46f, -1.5f)
                close()
            }
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
