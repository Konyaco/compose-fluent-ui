

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = fluentIcon(name = "Filled.Location") {
            fluentPath {
                moveToRelative(18.16f, 16.88f)
                lineToRelative(-1.19f, 1.18f)
                lineToRelative(-3.4f, 3.3f)
                curveToRelative(-0.88f, 0.85f, -2.26f, 0.85f, -3.13f, 0.0f)
                lineToRelative(-3.5f, -3.39f)
                lineToRelative(-1.1f, -1.09f)
                arcToRelative(8.7f, 8.7f, 0.0f, true, true, 12.32f, 0.0f)
                close()
                moveTo(14.5f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
        }
        return _location!!
    }

private var _location: ImageVector? = null
