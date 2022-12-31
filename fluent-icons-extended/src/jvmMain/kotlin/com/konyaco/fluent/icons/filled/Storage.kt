

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Storage: ImageVector
    get() {
        if (_storage != null) {
            return _storage!!
        }
        _storage = fluentIcon(name = "Filled.Storage") {
            fluentPath {
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 2.82f)
                lineTo(22.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.82f, 3.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -2.82f)
                lineTo(2.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.82f, -3.0f)
                lineTo(19.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(14.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _storage!!
    }

private var _storage: ImageVector? = null
