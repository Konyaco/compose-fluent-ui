

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = fluentIcon(name = "Regular.Timer") {
            fluentPath {
                moveTo(12.0f, 5.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, -17.0f)
                close()
                moveTo(12.0f, 6.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -14.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(19.15f, 5.11f)
                lineTo(19.23f, 5.17f)
                lineTo(20.39f, 6.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.88f, 1.21f)
                lineToRelative(-0.08f, -0.06f)
                lineToRelative(-1.16f, -0.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.88f, -1.22f)
                close()
                moveTo(14.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(4.6f)
                close()
            }
        }
        return _timer!!
    }

private var _timer: ImageVector? = null
