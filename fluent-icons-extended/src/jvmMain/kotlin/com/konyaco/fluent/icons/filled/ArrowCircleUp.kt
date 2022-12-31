

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp = fluentIcon(name = "Filled.ArrowCircleUp") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(7.47f, 12.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 1.13f)
                lineToRelative(-0.09f, -0.07f)
                lineToRelative(-2.72f, -2.72f)
                verticalLineToRelative(6.69f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineTo(12.0f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                verticalLineToRelative(-0.1f)
                lineToRelative(-0.01f, -6.69f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                close()
            }
        }
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
