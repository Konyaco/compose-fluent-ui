

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = fluentIcon(name = "Regular.Power") {
            fluentPath {
                moveTo(8.2f, 4.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.64f, 1.36f)
                arcToRelative(7.51f, 7.51f, 0.0f, true, false, 6.34f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.63f, -1.35f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -7.6f, -0.01f)
                close()
                moveTo(12.0f, 2.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.64f)
                verticalLineToRelative(7.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, 0.1f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.4f, 0.33f, -0.74f, 0.75f, -0.74f)
                close()
            }
        }
        return _power!!
    }

private var _power: ImageVector? = null
