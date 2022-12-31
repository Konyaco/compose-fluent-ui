

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = fluentIcon(name = "Regular.ToggleLeft") {
            fluentPath {
                moveTo(7.25f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                close()
                moveTo(17.0f, 8.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                lineTo(7.0f, 15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
