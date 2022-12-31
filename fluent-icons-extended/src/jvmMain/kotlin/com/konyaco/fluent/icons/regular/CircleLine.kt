

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CircleLine: ImageVector
    get() {
        if (_circleLine != null) {
            return _circleLine!!
        }
        _circleLine = fluentIcon(name = "Regular.CircleLine") {
            fluentPath {
                moveTo(3.53f, 11.25f)
                horizontalLineToRelative(16.94f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -16.94f, 0.0f)
                close()
                moveTo(20.47f, 12.75f)
                lineTo(3.53f, 12.75f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 16.94f, 0.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                close()
            }
        }
        return _circleLine!!
    }

private var _circleLine: ImageVector? = null
