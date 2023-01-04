

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChannelSubtract: ImageVector
    get() {
        if (_channelSubtract != null) {
            return _channelSubtract!!
        }
        _channelSubtract = fluentIcon(name = "Filled.ChannelSubtract") {
            fluentPath {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.55f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                curveToRelative(-1.38f, 0.0f, -2.55f, 0.85f, -3.03f, 2.06f)
                arcTo(2.26f, 2.26f, 0.0f, true, true, 3.0f, 9.37f)
                verticalLineToRelative(8.38f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(5.77f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -0.29f, -6.5f)
                lineTo(8.65f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.49f)
                lineTo(12.8f, 13.01f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 8.19f, -0.99f)
                lineTo(20.99f, 6.25f)
                close()
                moveTo(8.75f, 9.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.49f)
                lineTo(8.65f, 10.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.49f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(5.0f, 7.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(20.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        return _channelSubtract!!
    }

private var _channelSubtract: ImageVector? = null
