

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = fluentIcon(name = "Regular.Checkmark") {
            fluentPath {
                moveTo(4.53f, 12.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(8.5f, 16.94f)
                lineToRelative(-3.97f, -3.97f)
                close()
            }
        }
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
