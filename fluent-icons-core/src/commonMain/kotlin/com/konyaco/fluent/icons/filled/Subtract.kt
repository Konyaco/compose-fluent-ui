

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = fluentIcon(name = "Filled.Subtract") {
            fluentPath {
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                close()
            }
        }
        return _subtract!!
    }

private var _subtract: ImageVector? = null
