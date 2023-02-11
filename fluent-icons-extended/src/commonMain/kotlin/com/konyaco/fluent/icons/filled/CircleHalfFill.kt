

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CircleHalfFill: ImageVector
    get() {
        if (_circleHalfFill != null) {
            return _circleHalfFill!!
        }
        _circleHalfFill = fluentIcon(name = "Filled.CircleHalfFill") {
            fluentPath {
                moveTo(2.03f, 11.25f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 19.94f, 0.0f)
                lineTo(22.0f, 11.25f)
                lineTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(0.03f)
                close()
                moveTo(4.03f, 11.25f)
                horizontalLineToRelative(15.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.94f, 0.0f)
                close()
            }
        }
        return _circleHalfFill!!
    }

private var _circleHalfFill: ImageVector? = null
