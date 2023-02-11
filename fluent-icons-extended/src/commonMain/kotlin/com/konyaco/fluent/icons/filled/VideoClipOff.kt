

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoClipOff: ImageVector
    get() {
        if (_videoClipOff != null) {
            return _videoClipOff!!
        }
        _videoClipOff = fluentIcon(name = "Filled.VideoClipOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.7f, 0.7f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 19.55f, 3.46f, 21.0f, 5.25f, 21.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.36f, 0.0f, 0.7f, -0.06f, 1.02f, -0.16f)
                lineToRelative(0.95f, 0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(12.94f, 14.0f)
                lineToRelative(-2.33f, 1.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.11f, -0.65f)
                verticalLineToRelative(-4.06f)
                lineTo(12.94f, 14.0f)
                close()
                moveTo(15.4f, 11.34f)
                curveToRelative(0.42f, 0.23f, 0.5f, 0.77f, 0.23f, 1.11f)
                lineToRelative(6.23f, 6.23f)
                curveToRelative(0.1f, -0.3f, 0.14f, -0.6f, 0.14f, -0.93f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                lineTo(6.18f, 3.0f)
                lineToRelative(7.29f, 7.29f)
                lineToRelative(1.93f, 1.05f)
                close()
            }
        }
        return _videoClipOff!!
    }

private var _videoClipOff: ImageVector? = null
