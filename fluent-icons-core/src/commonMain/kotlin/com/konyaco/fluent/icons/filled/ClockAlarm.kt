

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClockAlarm: ImageVector
    get() {
        if (_clockAlarm != null) {
            return _clockAlarm!!
        }
        _clockAlarm = fluentIcon(name = "Filled.ClockAlarm") {
            fluentPath {
                moveTo(9.1f, 3.48f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 3.48f, 9.1f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, false, 1.65f, 8.71f)
                lineToRelative(-1.91f, 1.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.9f, -1.9f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 11.63f, 0.0f)
                lineToRelative(1.91f, 1.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.9f, -1.9f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 1.64f, -8.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.62f, -5.62f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, false, -5.8f, 0.0f)
                close()
                moveTo(6.0f, 3.5f)
                curveToRelative(0.63f, 0.0f, 1.2f, 0.23f, 1.65f, 0.62f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, false, -3.53f, 3.53f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 3.5f)
                close()
                moveTo(16.35f, 4.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.53f, 3.53f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, false, -3.53f, -3.53f)
                close()
                moveTo(11.25f, 7.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(12.0f, 12.0f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _clockAlarm!!
    }

private var _clockAlarm: ImageVector? = null
