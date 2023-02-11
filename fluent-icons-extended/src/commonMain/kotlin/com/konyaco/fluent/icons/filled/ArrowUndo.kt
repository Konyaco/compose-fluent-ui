

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowUndo: ImageVector
    get() {
        if (_arrowUndo != null) {
            return _arrowUndo!!
        }
        _arrowUndo = fluentIcon(name = "Filled.ArrowUndo") {
            fluentPath {
                moveTo(6.9f, 6.68f)
                lineToRelative(2.74f, -2.73f)
                arcToRelative(6.66f, 6.66f, 0.0f, true, true, 9.42f, 9.42f)
                lineToRelative(-8.34f, 8.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, -1.42f)
                lineToRelative(8.34f, -8.33f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -6.42f, -6.76f)
                lineToRelative(-0.18f, 0.17f)
                lineTo(7.41f, 9.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(4.94f)
                lineToRelative(-0.1f, -0.01f)
                lineToRelative(-0.1f, -0.03f)
                lineToRelative(-0.14f, -0.04f)
                lineToRelative(-0.08f, -0.04f)
                lineToRelative(-0.1f, -0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.13f, -0.1f)
                lineToRelative(-0.09f, -0.1f)
                lineToRelative(-0.07f, -0.12f)
                lineToRelative(-0.05f, -0.1f)
                lineToRelative(-0.04f, -0.1f)
                lineToRelative(-0.01f, -0.06f)
                lineToRelative(-0.02f, -0.08f)
                verticalLineToRelative(-0.06f)
                lineTo(4.0f, 10.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.11f)
                verticalLineToRelative(4.7f)
                lineToRelative(3.64f, -3.64f)
                lineToRelative(-2.73f, 2.73f)
                close()
            }
        }
        return _arrowUndo!!
    }

private var _arrowUndo: ImageVector? = null
