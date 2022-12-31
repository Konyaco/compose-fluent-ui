

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowReset: ImageVector
    get() {
        if (_arrowReset != null) {
            return _arrowReset!!
        }
        _arrowReset = fluentIcon(name = "Filled.ArrowReset") {
            fluentPath {
                moveTo(7.2f, 2.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineTo(5.42f, 5.75f)
                horizontalLineToRelative(7.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, -6.0f)
                horizontalLineTo(5.41f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.4f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                close()
            }
        }
        return _arrowReset!!
    }

private var _arrowReset: ImageVector? = null
