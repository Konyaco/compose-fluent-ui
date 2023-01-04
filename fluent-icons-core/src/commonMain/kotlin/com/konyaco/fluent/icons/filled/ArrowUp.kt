

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = fluentIcon(name = "Filled.ArrowUp") {
            fluentPath {
                moveTo(4.28f, 10.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.43f, 1.4f)
                lineTo(11.0f, 6.33f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(6.33f)
                lineToRelative(5.28f, 5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.43f, -1.4f)
                lineToRelative(-6.82f, -6.93f)
                curveToRelative(-0.5f, -0.5f, -1.3f, -0.5f, -1.78f, 0.0f)
                lineTo(4.28f, 10.3f)
                close()
            }
        }
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
