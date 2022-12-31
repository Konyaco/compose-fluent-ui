

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DeviceMeetingRoom: ImageVector
    get() {
        if (_deviceMeetingRoom != null) {
            return _deviceMeetingRoom!!
        }
        _deviceMeetingRoom = fluentIcon(name = "Filled.DeviceMeetingRoom") {
            fluentPath {
                moveTo(4.1f, 5.35f)
                arcTo(3.06f, 3.06f, 0.0f, false, true, 7.06f, 3.0f)
                horizontalLineToRelative(9.86f)
                curveToRelative(1.41f, 0.0f, 2.65f, 0.97f, 2.98f, 2.35f)
                lineToRelative(1.99f, 8.27f)
                arcTo(3.55f, 3.55f, 0.0f, false, true, 18.45f, 18.0f)
                horizontalLineTo(5.55f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, -3.45f, -4.38f)
                lineToRelative(2.0f, -8.27f)
                close()
                moveTo(6.74f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        return _deviceMeetingRoom!!
    }

private var _deviceMeetingRoom: ImageVector? = null
