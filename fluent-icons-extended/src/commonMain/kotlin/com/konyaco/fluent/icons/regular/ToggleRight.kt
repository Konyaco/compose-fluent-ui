

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = fluentIcon(name = "Regular.ToggleRight") {
            fluentPath {
                moveTo(16.75f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                lineTo(7.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                close()
                moveTo(7.0f, 8.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                lineTo(7.0f, 8.5f)
                close()
            }
        }
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
