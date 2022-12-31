

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowOutlineUpRight: ImageVector
    get() {
        if (_arrowOutlineUpRight != null) {
            return _arrowOutlineUpRight!!
        }
        _arrowOutlineUpRight = fluentIcon(name = "Filled.ArrowOutlineUpRight") {
            fluentPath {
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
