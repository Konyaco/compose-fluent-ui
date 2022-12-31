

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Spacebar: ImageVector
    get() {
        if (_spacebar != null) {
            return _spacebar!!
        }
        _spacebar = fluentIcon(name = "Filled.Spacebar") {
            fluentPath {
                moveTo(20.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
        }
        return _spacebar!!
    }

private var _spacebar: ImageVector? = null
