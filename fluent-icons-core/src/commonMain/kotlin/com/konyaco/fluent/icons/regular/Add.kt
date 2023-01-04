

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = fluentIcon(name = "Regular.Add") {
            fluentPath {
                moveTo(11.75f, 3.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, 0.1f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _add!!
    }

private var _add: ImageVector? = null
