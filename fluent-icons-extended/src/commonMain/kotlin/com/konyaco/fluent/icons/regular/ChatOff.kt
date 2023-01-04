

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatOff: ImageVector
    get() {
        if (_chatOff != null) {
            return _chatOff!!
        }
        _chatOff = fluentIcon(name = "Regular.ChatOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, -1.3f, 11.11f)
                lineToRelative(-1.07f, 3.83f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.54f, 1.54f)
                lineToRelative(3.82f, -1.07f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, 11.11f, -1.3f)
                lineToRelative(2.2f, 2.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.46f, 18.52f)
                arcToRelative(8.47f, 8.47f, 0.0f, false, true, -9.6f, 0.91f)
                lineToRelative(-0.26f, -0.15f)
                lineToRelative(-3.99f, 1.11f)
                lineToRelative(1.11f, -3.98f)
                lineToRelative(-0.15f, -0.27f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, 0.91f, -9.6f)
                lineToRelative(3.0f, 3.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.76f, 11.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(2.0f, 2.0f)
                lineTo(8.65f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(4.6f)
                lineToRelative(0.07f, -0.02f)
                lineToRelative(4.04f, 4.04f)
                close()
            }
            fluentPath {
                moveTo(15.25f, 9.5f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineTo(15.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
            }
            fluentPath {
                moveTo(20.5f, 12.0f)
                curveToRelative(0.0f, 1.53f, -0.4f, 2.97f, -1.11f, 4.2f)
                lineToRelative(1.1f, 1.1f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 6.7f, 3.52f)
                lineToRelative(1.08f, 1.1f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 20.5f, 12.0f)
                close()
            }
        }
        return _chatOff!!
    }

private var _chatOff: ImageVector? = null
