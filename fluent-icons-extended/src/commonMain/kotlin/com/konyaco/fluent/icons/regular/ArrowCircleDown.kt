

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = fluentIcon(name = "Regular.ArrowCircleDown") {
            fluentPath {
                moveToRelative(16.53f, 11.72f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-2.72f, 2.72f)
                lineTo(12.75f, 7.65f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.0f, 7.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(6.7f)
                lineToRelative(-2.72f, -2.73f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, 1.13f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.71f, -0.07f, -0.98f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -20.0f, 0.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, -17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 17.0f, 0.0f)
                close()
            }
        }
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
