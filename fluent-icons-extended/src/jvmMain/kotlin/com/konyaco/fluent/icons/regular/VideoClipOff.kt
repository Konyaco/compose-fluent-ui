

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoClipOff: ImageVector
    get() {
        if (_videoClipOff != null) {
            return _videoClipOff!!
        }
        _videoClipOff = fluentIcon(name = "Regular.VideoClipOff") {
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
                moveTo(18.44f, 19.5f)
                lineTo(5.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.47f, 0.18f, -0.9f, 0.48f, -1.2f)
                lineToRelative(5.52f, 5.51f)
                verticalLineToRelative(4.06f)
                curveToRelative(0.0f, 0.57f, 0.61f, 0.93f, 1.11f, 0.65f)
                lineTo(12.94f, 14.0f)
                lineToRelative(5.5f, 5.5f)
                close()
                moveTo(13.47f, 10.3f)
                lineToRelative(2.17f, 2.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.24f, -1.1f)
                lineToRelative(-1.93f, -1.06f)
                close()
                moveTo(20.5f, 6.25f)
                verticalLineToRelative(11.07f)
                lineToRelative(1.36f, 1.36f)
                curveToRelative(0.1f, -0.3f, 0.14f, -0.6f, 0.14f, -0.93f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                lineTo(6.18f, 3.0f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(11.07f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                close()
            }
        }
        return _videoClipOff!!
    }

private var _videoClipOff: ImageVector? = null
