

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = fluentIcon(name = "Regular.ArrowCircleRight") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(11.65f, 7.55f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(4.0f, 4.0f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(2.72f, -2.72f)
                lineTo(7.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineTo(7.0f, 12.0f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(6.69f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(-0.07f, 0.08f)
                close()
            }
        }
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
