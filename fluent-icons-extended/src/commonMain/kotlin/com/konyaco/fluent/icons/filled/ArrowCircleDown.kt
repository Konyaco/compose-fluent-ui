

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = fluentIcon(name = "Filled.ArrowCircleDown") {
            fluentPath {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -20.0f, 0.0f)
                close()
                moveTo(16.53f, 11.72f)
                curveToRelative(0.27f, 0.27f, 0.29f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.97f, -1.13f)
                lineToRelative(0.09f, 0.07f)
                lineToRelative(2.72f, 2.72f)
                lineTo(11.25f, 7.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                lineToRelative(0.01f, 6.69f)
                lineToRelative(2.72f, -2.72f)
                curveToRelative(0.27f, -0.27f, 0.68f, -0.3f, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                close()
            }
        }
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
