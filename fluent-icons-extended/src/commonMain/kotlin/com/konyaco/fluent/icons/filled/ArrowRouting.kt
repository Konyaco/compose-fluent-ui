

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowRouting: ImageVector
    get() {
        if (_arrowRouting != null) {
            return _arrowRouting!!
        }
        _arrowRouting = fluentIcon(name = "Filled.ArrowRouting") {
            fluentPath {
                moveTo(18.7f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.4f)
                lineTo(18.59f, 5.0f)
                horizontalLineToRelative(-5.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(7.84f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.58f)
                lineTo(17.3f, 8.29f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 18.7f, 9.7f)
                lineToRelative(3.01f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.41f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        return _arrowRouting!!
    }

private var _arrowRouting: ImageVector? = null
