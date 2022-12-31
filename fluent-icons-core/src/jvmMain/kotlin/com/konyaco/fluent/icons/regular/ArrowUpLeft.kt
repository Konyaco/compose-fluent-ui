

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) {
            return _arrowUpLeft!!
        }
        _arrowUpLeft = fluentIcon(name = "Regular.ArrowUpLeft") {
            fluentPath {
                moveTo(13.25f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(5.58f)
                lineToRelative(15.2f, 15.2f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -1.08f, 1.08f)
                lineTo(4.5f, 5.58f)
                verticalLineToRelative(7.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.5f)
                close()
            }
        }
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
