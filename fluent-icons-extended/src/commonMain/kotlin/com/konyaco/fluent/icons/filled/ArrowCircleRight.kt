

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = fluentIcon(name = "Filled.ArrowCircleRight") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.78f, 7.47f)
                lineTo(12.7f, 7.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.89f, -0.01f)
                lineToRelative(-0.09f, 0.08f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.2f, 0.26f, -0.2f, 0.62f, 0.0f, 0.89f)
                lineToRelative(0.07f, 0.09f)
                lineToRelative(2.72f, 2.72f)
                lineTo(7.65f, 11.25f)
                curveToRelative(-0.33f, 0.05f, -0.6f, 0.31f, -0.64f, 0.65f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.05f, 0.33f, 0.32f, 0.6f, 0.65f, 0.64f)
                horizontalLineToRelative(6.79f)
                lineToRelative(-2.72f, 2.73f)
                lineToRelative(-0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, 1.05f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.2f, -0.26f, 0.2f, -0.62f, 0.01f, -0.89f)
                lineToRelative(-0.08f, -0.09f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                close()
            }
        }
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
