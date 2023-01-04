

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Oval: ImageVector
    get() {
        if (_oval != null) {
            return _oval!!
        }
        _oval = fluentIcon(name = "Regular.Oval") {
            fluentPath {
                moveTo(2.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                close()
                moveTo(10.0f, 5.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, -13.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        return _oval!!
    }

private var _oval: ImageVector? = null
