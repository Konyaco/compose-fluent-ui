

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = fluentIcon(name = "Filled.ArrowDown") {
            fluentPath {
                moveTo(19.72f, 13.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.43f, -1.4f)
                lineTo(13.0f, 17.67f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(13.66f)
                lineTo(5.72f, 12.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.43f, 1.4f)
                lineToRelative(6.82f, 6.93f)
                curveToRelative(0.5f, 0.5f, 1.3f, 0.5f, 1.78f, 0.0f)
                lineToRelative(6.83f, -6.93f)
                close()
            }
        }
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
