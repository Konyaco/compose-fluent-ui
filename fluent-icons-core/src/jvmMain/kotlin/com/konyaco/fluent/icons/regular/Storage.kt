

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Storage: ImageVector
    get() {
        if (_storage != null) {
            return _storage!!
        }
        _storage = fluentIcon(name = "Regular.Storage") {
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
                moveTo(19.0f, 8.5f)
                lineTo(5.0f, 8.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(14.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        return _storage!!
    }

private var _storage: ImageVector? = null
