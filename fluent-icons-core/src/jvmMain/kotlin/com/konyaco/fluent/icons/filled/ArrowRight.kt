

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = fluentIcon(name = "Filled.ArrowRight") {
            fluentPath {
                moveTo(13.7f, 4.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.43f)
                lineTo(17.67f, 11.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(13.66f)
                lineToRelative(-5.36f, 5.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.43f)
                lineToRelative(6.93f, -6.82f)
                curveToRelative(0.5f, -0.5f, 0.5f, -1.3f, 0.0f, -1.78f)
                lineTo(13.7f, 4.28f)
                close()
            }
        }
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
