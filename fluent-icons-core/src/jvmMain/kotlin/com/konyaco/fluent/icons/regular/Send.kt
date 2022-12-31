

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = fluentIcon(name = "Regular.Send") {
            fluentPath {
                moveTo(5.7f, 12.0f)
                lineTo(2.3f, 3.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.94f, -0.98f)
                lineToRelative(0.1f, 0.04f)
                lineToRelative(18.0f, 9.0f)
                curveToRelative(0.51f, 0.26f, 0.54f, 0.97f, 0.1f, 1.28f)
                lineToRelative(-0.1f, 0.06f)
                lineToRelative(-18.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.07f, -0.85f)
                lineToRelative(0.03f, -0.1f)
                lineTo(5.7f, 12.0f)
                lineTo(2.3f, 3.27f)
                lineTo(5.7f, 12.0f)
                close()
                moveTo(4.4f, 4.54f)
                lineToRelative(2.61f, 6.7f)
                lineToRelative(6.63f, 0.01f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.27f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineTo(7.0f)
                lineToRelative(-2.6f, 6.7f)
                lineTo(19.31f, 12.0f)
                lineTo(4.4f, 4.54f)
                close()
            }
        }
        return _send!!
    }

private var _send: ImageVector? = null
