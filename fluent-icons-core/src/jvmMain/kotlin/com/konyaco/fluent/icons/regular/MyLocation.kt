

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MyLocation: ImageVector
    get() {
        if (_myLocation != null) {
            return _myLocation!!
        }
        _myLocation = fluentIcon(name = "Regular.MyLocation") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(1.79f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 6.71f, 6.71f)
                horizontalLineToRelative(1.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(19.46f, 12.75f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -6.71f, 6.71f)
                verticalLineToRelative(1.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(11.25f, 19.46f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -6.71f, -6.71f)
                lineTo(2.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(4.54f, 11.25f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 6.71f, -6.71f)
                lineTo(11.25f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
            }
        }
        return _myLocation!!
    }

private var _myLocation: ImageVector? = null
