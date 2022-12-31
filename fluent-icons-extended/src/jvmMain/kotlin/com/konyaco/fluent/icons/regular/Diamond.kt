

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = fluentIcon(name = "Regular.Diamond") {
            fluentPath {
                moveTo(2.66f, 13.6f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -3.19f)
                lineToRelative(7.75f, -7.75f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                lineToRelative(7.75f, 7.75f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-7.75f, 7.75f)
                curveToRelative(-0.88f, 0.88f, -2.3f, 0.88f, -3.18f, 0.0f)
                lineTo(2.66f, 13.6f)
                close()
                moveTo(3.72f, 11.47f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(7.75f, 7.75f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(7.75f, -7.75f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-7.75f, -7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-7.75f, 7.75f)
                close()
            }
        }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
