

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChannelAdd: ImageVector
    get() {
        if (_channelAdd != null) {
            return _channelAdd!!
        }
        _channelAdd = fluentIcon(name = "Filled.ChannelAdd") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(5.77f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -8.2f, 0.98f)
                lineTo(8.76f, 13.0f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                horizontalLineToRelative(3.08f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.3f, 6.5f)
                lineTo(6.24f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 9.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.22f, -4.3f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
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
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _channelAdd!!
    }

private var _channelAdd: ImageVector? = null
