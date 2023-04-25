

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp = fluentIcon(name = "Regular.ArrowCircleUp") {
            fluentPath {
                moveToRelative(7.47f, 12.28f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineToRelative(2.72f, -2.72f)
                verticalLineToRelative(6.79f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                verticalLineToRelative(-6.7f)
                lineToRelative(2.72f, 2.73f)
                lineToRelative(0.09f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.97f, -1.13f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.22f, 0.3f, -0.2f, 0.71f, 0.07f, 0.98f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
            }
        }
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
