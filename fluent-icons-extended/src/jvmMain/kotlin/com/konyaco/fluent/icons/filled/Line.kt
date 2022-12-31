

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = fluentIcon(name = "Filled.Line") {
            fluentPath {
                moveTo(21.7f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.4f)
                lineToRelative(18.0f, -18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                close()
            }
        }
        return _line!!
    }

private var _line: ImageVector? = null
