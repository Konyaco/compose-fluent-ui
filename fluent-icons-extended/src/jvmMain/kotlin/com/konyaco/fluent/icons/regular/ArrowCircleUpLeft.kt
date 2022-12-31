

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) {
            return _arrowCircleUpLeft!!
        }
        _arrowCircleUpLeft = fluentIcon(name = "Regular.ArrowCircleUpLeft") {
            fluentPath {
                moveTo(10.5f, 9.5f)
                horizontalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.64f)
                lineToRelative(5.22f, 5.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(10.5f, 9.5f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, -17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, 17.0f)
                close()
            }
        }
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
