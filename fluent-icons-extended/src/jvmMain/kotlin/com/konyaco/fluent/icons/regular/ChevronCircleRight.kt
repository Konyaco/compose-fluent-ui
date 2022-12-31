

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChevronCircleRight: ImageVector
    get() {
        if (_chevronCircleRight != null) {
            return _chevronCircleRight!!
        }
        _chevronCircleRight = fluentIcon(name = "Regular.ChevronCircleRight") {
            fluentPath {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -17.0f, 0.0f)
                close()
                moveTo(9.97f, 16.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineTo(13.44f, 12.0f)
                lineTo(9.97f, 8.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(4.0f, 4.0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                close()
            }
        }
        return _chevronCircleRight!!
    }

private var _chevronCircleRight: ImageVector? = null
