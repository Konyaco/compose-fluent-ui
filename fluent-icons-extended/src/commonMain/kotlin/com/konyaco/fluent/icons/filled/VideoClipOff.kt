

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
                moveTo(13.12f, 14.18f)
                lineTo(10.48f, 15.63f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 14.75f)
                verticalLineToRelative(-4.69f)
                lineToRelative(4.12f, 4.12f)
                close()
                moveTo(15.48f, 11.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.31f, 1.5f)
                lineToRelative(6.07f, 6.06f)
                curveToRelative(0.1f, -0.3f, 0.14f, -0.6f, 0.14f, -0.93f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                lineTo(6.18f, 3.0f)
                lineToRelative(6.69f, 6.69f)
                lineToRelative(2.61f, 1.43f)
                close()
            }
        }
        return _videoClipOff!!
    }

private var _videoClipOff: ImageVector? = null
