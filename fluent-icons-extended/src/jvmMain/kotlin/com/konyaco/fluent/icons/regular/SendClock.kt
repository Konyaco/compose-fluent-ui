

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SendClock: ImageVector
    get() {
        if (_sendClock != null) {
            return _sendClock!!
        }
        _sendClock = fluentIcon(name = "Regular.SendClock") {
            fluentPath {
                moveTo(5.7f, 12.0f)
                lineTo(2.3f, 3.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.94f, -0.98f)
                lineToRelative(0.1f, 0.04f)
                lineToRelative(18.0f, 9.0f)
                curveToRelative(0.44f, 0.22f, 0.52f, 0.77f, 0.26f, 1.12f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 17.33f, 11.0f)
                lineTo(4.4f, 4.54f)
                lineToRelative(2.61f, 6.7f)
                lineToRelative(6.63f, 0.01f)
                curveToRelative(0.35f, 0.0f, 0.64f, 0.24f, 0.72f, 0.56f)
                curveToRelative(-0.47f, 0.26f, -0.9f, 0.57f, -1.3f, 0.94f)
                horizontalLineTo(7.01f)
                lineToRelative(-2.6f, 6.7f)
                lineToRelative(6.74f, -3.37f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -0.14f, 1.75f)
                lineToRelative(-7.68f, 3.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -0.85f)
                lineToRelative(0.03f, -0.1f)
                lineTo(5.7f, 12.0f)
                close()
            }
            fluentPath {
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.5f, 17.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(17.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        return _sendClock!!
    }

private var _sendClock: ImageVector? = null
