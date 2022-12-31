

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = fluentIcon(name = "Filled.VideoOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.57f, 1.57f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(7.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.17f, -2.52f)
                lineToRelative(4.8f, 4.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.0f, 13.82f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.86f)
                verticalLineTo(6.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.65f, -0.76f)
                lineTo(17.0f, 8.63f)
                verticalLineToRelative(5.19f)
                close()
                moveTo(7.68f, 4.5f)
                lineTo(16.0f, 12.82f)
                verticalLineTo(7.75f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineTo(7.68f)
                close()
            }
        }
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
