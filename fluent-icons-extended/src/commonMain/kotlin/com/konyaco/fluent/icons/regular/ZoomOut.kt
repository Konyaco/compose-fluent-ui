

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = fluentIcon(name = "Regular.ZoomOut") {
            fluentPath {
                moveTo(12.75f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(17.25f, 10.0f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, false, -2.68f, 5.63f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, -1.13f)
                lineToRelative(-4.9f, -4.9f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 17.25f, 10.0f)
                close()
                moveTo(4.25f, 10.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, true, 11.5f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                close()
            }
        }
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
