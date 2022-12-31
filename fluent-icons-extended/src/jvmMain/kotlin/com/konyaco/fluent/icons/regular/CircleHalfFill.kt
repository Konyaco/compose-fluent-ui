

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CircleHalfFill: ImageVector
    get() {
        if (_circleHalfFill != null) {
            return _circleHalfFill!!
        }
        _circleHalfFill = fluentIcon(name = "Regular.CircleHalfFill") {
            fluentPath {
                moveTo(2.03f, 11.25f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 19.94f, 0.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(0.03f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.47f, 7.75f)
                horizontalLineToRelative(16.94f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
            }
        }
        return _circleHalfFill!!
    }

private var _circleHalfFill: ImageVector? = null
