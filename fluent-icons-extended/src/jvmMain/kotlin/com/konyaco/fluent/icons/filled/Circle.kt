

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Circle: ImageVector
    get() {
        if (_circle != null) {
            return _circle!!
        }
        _circle = fluentIcon(name = "Filled.Circle") {
            fluentPath {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                close()
            }
        }
        return _circle!!
    }

private var _circle: ImageVector? = null
