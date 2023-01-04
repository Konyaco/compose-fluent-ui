

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DeviceMeetingRoom: ImageVector
    get() {
        if (_deviceMeetingRoom != null) {
            return _deviceMeetingRoom!!
        }
        _deviceMeetingRoom = fluentIcon(name = "Regular.DeviceMeetingRoom") {
            fluentPath {
                moveTo(7.07f, 3.0f)
                curveToRelative(-1.42f, 0.0f, -2.65f, 0.97f, -2.98f, 2.35f)
                lineTo(2.1f, 13.62f)
                arcTo(3.55f, 3.55f, 0.0f, false, false, 5.55f, 18.0f)
                horizontalLineToRelative(12.9f)
                curveToRelative(2.29f, 0.0f, 3.98f, -2.15f, 3.44f, -4.38f)
                lineTo(19.9f, 5.35f)
                arcTo(3.06f, 3.06f, 0.0f, false, false, 16.93f, 3.0f)
                horizontalLineTo(7.07f)
                close()
                moveTo(5.55f, 5.7f)
                curveToRelative(0.17f, -0.7f, 0.8f, -1.2f, 1.52f, -1.2f)
                horizontalLineToRelative(9.86f)
                curveToRelative(0.72f, 0.0f, 1.35f, 0.5f, 1.51f, 1.2f)
                lineToRelative(2.0f, 8.27f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -2.0f, 2.53f)
                horizontalLineTo(5.55f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -2.0f, -2.53f)
                lineToRelative(2.0f, -8.27f)
                close()
                moveTo(6.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        return _deviceMeetingRoom!!
    }

private var _deviceMeetingRoom: ImageVector? = null
