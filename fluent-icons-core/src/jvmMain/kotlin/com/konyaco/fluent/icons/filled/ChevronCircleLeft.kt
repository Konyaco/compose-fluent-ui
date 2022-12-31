

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronCircleLeft: ImageVector
    get() {
        if (_chevronCircleLeft != null) {
            return _chevronCircleLeft!!
        }
        _chevronCircleLeft = fluentIcon(name = "Filled.ChevronCircleLeft") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
                moveTo(14.03f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(10.56f, 12.0f)
                lineToRelative(3.47f, -3.47f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                close()
            }
        }
        return _chevronCircleLeft!!
    }

private var _chevronCircleLeft: ImageVector? = null
