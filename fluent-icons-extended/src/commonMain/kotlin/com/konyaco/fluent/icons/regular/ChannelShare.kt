

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChannelShare: ImageVector
    get() {
        if (_channelShare != null) {
            return _channelShare!!
        }
        _channelShare = fluentIcon(name = "Regular.ChannelShare") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(5.85f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(6.25f, 15.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 12.25f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.5f, 14.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.5f, 0.0f)
                close()
                moveTo(17.75f, 10.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                lineTo(11.9f, 8.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.85f)
                close()
                moveTo(9.25f, 8.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _channelShare!!
    }

private var _channelShare: ImageVector? = null
