

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ConferenceRoom: ImageVector
    get() {
        if (_conferenceRoom != null) {
            return _conferenceRoom!!
        }
        _conferenceRoom = fluentIcon(name = "Regular.ConferenceRoom") {
            fluentPath {
                moveToRelative(10.82f, 2.0f)
                lineToRelative(0.1f, 0.02f)
                lineToRelative(8.5f, 2.0f)
                curveToRelative(0.3f, 0.07f, 0.53f, 0.32f, 0.57f, 0.63f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.31f, -0.2f, 0.59f, -0.48f, 0.7f)
                lineToRelative(-0.1f, 0.03f)
                lineToRelative(-8.5f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.91f, -0.63f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(10.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.74f, 0.72f, -0.75f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(11.5f, 3.7f)
                verticalLineToRelative(16.6f)
                lineToRelative(7.0f, -1.64f)
                lineTo(18.5f, 5.34f)
                lineToRelative(-7.0f, -1.64f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(1.5f)
                lineTo(5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(9.0f, 18.5f)
                lineTo(9.0f, 20.0f)
                lineTo(4.75f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(4.0f, 4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(14.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        return _conferenceRoom!!
    }

private var _conferenceRoom: ImageVector? = null
