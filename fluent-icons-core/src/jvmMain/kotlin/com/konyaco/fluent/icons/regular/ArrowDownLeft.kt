

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) {
            return _arrowDownLeft!!
        }
        _arrowDownLeft = fluentIcon(name = "Regular.ArrowDownLeft") {
            fluentPath {
                moveTo(13.25f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineTo(5.58f)
                lineToRelative(15.2f, -15.2f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -1.08f, -1.08f)
                lineTo(4.5f, 18.42f)
                verticalLineToRelative(-7.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.42f, 0.33f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.5f)
                close()
            }
        }
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
