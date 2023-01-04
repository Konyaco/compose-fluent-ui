

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = fluentIcon(name = "Regular.ChevronDown") {
            fluentPath {
                moveTo(4.22f, 8.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(12.0f, 15.19f)
                lineToRelative(6.72f, -6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-7.25f, 7.25f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineTo(4.22f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
