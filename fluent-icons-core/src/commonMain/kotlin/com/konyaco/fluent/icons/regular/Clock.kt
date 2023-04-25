

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = fluentIcon(name = "Regular.Clock") {
            fluentPath {
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 6.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 6.65f)
                close()
            }
        }
        return _clock!!
    }

private var _clock: ImageVector? = null
