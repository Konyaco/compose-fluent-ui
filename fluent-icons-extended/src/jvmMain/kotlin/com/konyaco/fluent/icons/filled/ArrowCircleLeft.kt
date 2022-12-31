

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = fluentIcon(name = "Filled.ArrowCircleLeft") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(12.28f, 16.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-2.72f, 2.72f)
                horizontalLineToRelative(6.69f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(9.56f, 12.75f)
                lineToRelative(2.72f, 2.72f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                close()
            }
        }
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
