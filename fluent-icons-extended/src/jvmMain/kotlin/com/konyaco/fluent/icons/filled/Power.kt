

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = fluentIcon(name = "Filled.Power") {
            fluentPath {
                moveTo(8.2f, 4.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.85f, 1.82f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 5.92f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.84f, -1.8f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -7.6f, -0.02f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _power!!
    }

private var _power: ImageVector? = null
