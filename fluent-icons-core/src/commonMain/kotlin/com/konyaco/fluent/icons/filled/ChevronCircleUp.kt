

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronCircleUp: ImageVector
    get() {
        if (_chevronCircleUp != null) {
            return _chevronCircleUp!!
        }
        _chevronCircleUp = fluentIcon(name = "Filled.ChevronCircleUp") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(7.47f, 14.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(12.0f, 10.56f)
                lineToRelative(-3.47f, 3.47f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                close()
            }
        }
        return _chevronCircleUp!!
    }

private var _chevronCircleUp: ImageVector? = null
