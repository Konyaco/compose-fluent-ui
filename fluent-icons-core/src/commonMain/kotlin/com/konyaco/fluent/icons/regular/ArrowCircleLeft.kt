

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = fluentIcon(name = "Regular.ArrowCircleLeft") {
            fluentPath {
                moveTo(12.28f, 16.53f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.71f, -0.07f, -0.98f)
                lineToRelative(-2.72f, -2.72f)
                horizontalLineToRelative(6.79f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.0f, 12.0f)
                verticalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.65f)
                horizontalLineToRelative(-6.7f)
                lineToRelative(2.73f, -2.72f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.13f, -0.98f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.22f, 0.3f, -0.2f, 0.71f, 0.07f, 0.98f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 0.0f, -17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, 17.0f)
                close()
            }
        }
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
