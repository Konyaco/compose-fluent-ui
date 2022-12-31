

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = fluentIcon(name = "Filled.ChevronDown") {
            fluentPath {
                moveTo(4.3f, 8.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(6.3f, 6.29f)
                lineToRelative(6.3f, -6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                close()
            }
        }
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
