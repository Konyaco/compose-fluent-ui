

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClockAlarm: ImageVector
    get() {
        if (_clockAlarm != null) {
            return _clockAlarm!!
        }
        _clockAlarm = fluentIcon(name = "Regular.ClockAlarm") {
            fluentPath {
                moveTo(12.0f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 7.75f)
                close()
                moveTo(3.48f, 9.1f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 9.1f, 3.48f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, 5.8f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.62f, 5.62f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, -1.65f, 8.71f)
                lineToRelative(1.91f, 1.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-1.9f, -1.9f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -11.63f, 0.0f)
                lineToRelative(-1.91f, 1.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.9f, -1.9f)
                arcTo(8.96f, 8.96f, 0.0f, false, true, 3.49f, 9.1f)
                close()
                moveTo(3.5f, 6.0f)
                curveToRelative(0.0f, 0.63f, 0.23f, 1.2f, 0.62f, 1.65f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, true, 3.53f, -3.53f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.5f, 6.0f)
                close()
                moveTo(19.88f, 7.65f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.53f, -3.53f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, true, 3.53f, 3.53f)
                close()
                moveTo(4.5f, 12.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -15.0f, 0.0f)
                close()
            }
        }
        return _clockAlarm!!
    }

private var _clockAlarm: ImageVector? = null
