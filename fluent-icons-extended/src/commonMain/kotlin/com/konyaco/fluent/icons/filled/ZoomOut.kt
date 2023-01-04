

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = fluentIcon(name = "Filled.ZoomOut") {
            fluentPath {
                moveTo(17.5f, 10.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, -2.95f, 5.96f)
                lineToRelative(4.74f, 4.75f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -1.5f)
                lineToRelative(-4.75f, -4.74f)
                arcTo(7.47f, 7.47f, 0.0f, false, false, 17.5f, 10.0f)
                close()
                moveTo(13.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
