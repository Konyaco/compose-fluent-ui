

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ConferenceRoom: ImageVector
    get() {
        if (_conferenceRoom != null) {
            return _conferenceRoom!!
        }
        _conferenceRoom = fluentIcon(name = "Filled.ConferenceRoom") {
            fluentPath {
                moveToRelative(10.6f, 2.01f)
                lineToRelative(9.0f, 2.0f)
                curveToRelative(0.23f, 0.05f, 0.4f, 0.25f, 0.4f, 0.49f)
                verticalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.5f)
                lineToRelative(-9.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.6f, -0.5f)
                verticalLineToRelative(-19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.49f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.75f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(4.0f, 4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(13.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _conferenceRoom!!
    }

private var _conferenceRoom: ImageVector? = null
