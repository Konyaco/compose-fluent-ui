

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowOutlineUpRight: ImageVector
    get() {
        if (_arrowOutlineUpRight != null) {
            return _arrowOutlineUpRight!!
        }
        _arrowOutlineUpRight = fluentIcon(name = "Regular.ArrowOutlineUpRight") {
            fluentPath {
                moveTo(20.5f, 4.0f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(7.94f, 4.84f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.27f, 0.77f)
                lineToRelative(1.8f, 1.8f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.76f, 0.0f, 1.06f)
                lineTo(3.63f, 14.3f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.0f, 0.64f)
                lineToRelative(5.43f, 5.43f)
                curveToRelative(0.18f, 0.17f, 0.46f, 0.17f, 0.64f, 0.0f)
                lineToRelative(5.83f, -5.84f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                lineToRelative(1.8f, 1.8f)
                curveToRelative(0.27f, 0.27f, 0.72f, 0.1f, 0.76f, -0.27f)
                lineTo(20.5f, 4.0f)
                close()
                moveTo(19.83f, 2.01f)
                curveToRelative(1.24f, -0.14f, 2.3f, 0.91f, 2.16f, 2.16f)
                lineToRelative(-1.34f, 12.06f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, -3.32f, 1.16f)
                lineToRelative(-1.27f, -1.27f)
                lineToRelative(-5.3f, 5.3f)
                curveToRelative(-0.76f, 0.77f, -2.0f, 0.77f, -2.76f, 0.0f)
                lineTo(2.57f, 16.0f)
                curveToRelative(-0.76f, -0.76f, -0.76f, -2.0f, 0.0f, -2.76f)
                lineToRelative(5.3f, -5.3f)
                lineToRelative(-1.26f, -1.27f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, 1.16f, -3.32f)
                lineToRelative(12.06f, -1.34f)
                close()
            }
        }
        return _arrowOutlineUpRight!!
    }

private var _arrowOutlineUpRight: ImageVector? = null
