

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TimerOff: ImageVector
    get() {
        if (_timerOff != null) {
            return _timerOff!!
        }
        _timerOff = fluentIcon(name = "Regular.TimerOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 12.01f, 12.01f)
                lineToRelative(2.49f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.07f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.16f, 18.22f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -9.89f, -9.89f)
                lineToRelative(3.98f, 3.98f)
                verticalLineToRelative(1.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.33f)
                lineToRelative(4.54f, 4.55f)
                close()
                moveTo(11.44f, 8.25f)
                lineToRelative(1.31f, 1.32f)
                lineTo(12.75f, 8.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.31f, -0.4f)
                close()
                moveTo(19.0f, 13.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.3f, 2.02f)
                lineToRelative(1.18f, 1.18f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 8.8f, 5.62f)
                lineTo(9.97f, 6.8f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 13.5f)
                close()
                moveTo(19.15f, 5.11f)
                lineToRelative(0.08f, 0.06f)
                lineToRelative(1.16f, 0.97f)
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
        return _timerOff!!
    }

private var _timerOff: ImageVector? = null
