

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) {
            return _arrowDownLeft!!
        }
        _arrowDownLeft = fluentIcon(name = "Filled.ArrowDownLeft") {
            fluentPath {
                moveTo(13.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.41f)
                lineToRelative(14.3f, -14.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.4f)
                lineTo(5.0f, 17.58f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
