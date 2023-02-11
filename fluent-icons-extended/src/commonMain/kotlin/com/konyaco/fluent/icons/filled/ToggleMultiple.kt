

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ToggleMultiple: ImageVector
    get() {
        if (_toggleMultiple != null) {
            return _toggleMultiple!!
        }
        _toggleMultiple = fluentIcon(name = "Filled.ToggleMultiple") {
            fluentPath {
                moveTo(2.0f, 6.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.5f, 2.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                horizontalLineToRelative(-11.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 2.0f, 6.5f)
                close()
                moveTo(6.5f, 8.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(6.5f, 13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, 9.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, -9.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(19.5f, 17.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        return _toggleMultiple!!
    }

private var _toggleMultiple: ImageVector? = null
