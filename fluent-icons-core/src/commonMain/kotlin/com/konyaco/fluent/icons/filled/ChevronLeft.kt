

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = fluentIcon(name = "Filled.ChevronLeft") {
            fluentPath {
                moveTo(15.7f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineTo(9.42f, 12.0f)
                lineToRelative(6.3f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.4f)
                lineToRelative(-7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                close()
            }
        }
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
