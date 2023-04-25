

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = fluentIcon(name = "Regular.Eraser") {
            fluentPath {
                moveToRelative(15.87f, 2.67f)
                lineToRelative(4.97f, 4.97f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-8.68f, 8.68f)
                horizontalLineToRelative(6.1f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(9.83f, 21.0f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, true, -1.71f, -0.65f)
                lineToRelative(-4.97f, -4.97f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -3.18f)
                lineToRelative(9.53f, -9.53f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                close()
                moveTo(5.71f, 11.77f)
                lineTo(4.22f, 13.26f)
                curveToRelative(-0.3f, 0.29f, -0.3f, 0.76f, 0.0f, 1.06f)
                lineToRelative(4.97f, 4.96f)
                curveToRelative(0.15f, 0.15f, 0.34f, 0.22f, 0.53f, 0.22f)
                horizontalLineToRelative(0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.46f, -0.22f)
                lineToRelative(1.49f, -1.48f)
                lineToRelative(-6.03f, -6.03f)
                close()
                moveTo(13.75f, 3.73f)
                lineTo(6.77f, 10.7f)
                lineToRelative(6.03f, 6.03f)
                lineToRelative(6.98f, -6.98f)
                curveToRelative(0.29f, -0.3f, 0.29f, -0.77f, 0.0f, -1.06f)
                lineTo(14.8f, 3.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
