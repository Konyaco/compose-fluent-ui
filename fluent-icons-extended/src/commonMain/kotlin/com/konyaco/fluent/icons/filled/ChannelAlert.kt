

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChannelAlert: ImageVector
    get() {
        if (_channelAlert != null) {
            return _channelAlert!!
        }
        _channelAlert = fluentIcon(name = "Filled.ChannelAlert") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(17.75f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 21.0f, 6.07f)
                lineTo(21.0f, 12.02f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -8.2f, 0.98f)
                lineTo(8.76f, 13.0f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                horizontalLineToRelative(3.08f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.3f, 6.5f)
                lineTo(6.24f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(3.0f, 17.75f)
                lineTo(3.0f, 9.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.22f, -4.3f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.05f, 3.0f)
                lineToRelative(0.2f, -0.01f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(18.5f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, -0.12f)
                close()
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-0.94f, 0.1f, -1.67f, 0.77f, -1.81f, 1.64f)
                lineToRelative(-0.02f, 0.16f)
                verticalLineToRelative(1.5f)
                lineToRelative(-0.86f, 0.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.26f, 0.84f)
                lineTo(15.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.41f, -0.79f)
                lineToRelative(-0.06f, -0.06f)
                lineToRelative(-0.85f, -0.85f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -2.0f, -1.8f)
                close()
                moveTo(15.25f, 9.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                lineTo(15.35f, 10.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(3.75f, 6.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _channelAlert!!
    }

private var _channelAlert: ImageVector? = null
