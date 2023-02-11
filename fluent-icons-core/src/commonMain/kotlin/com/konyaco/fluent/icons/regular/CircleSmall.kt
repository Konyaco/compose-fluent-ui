

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = fluentIcon(name = "Regular.CircleSmall") {
            fluentPath {
                moveTo(12.0f, 9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
