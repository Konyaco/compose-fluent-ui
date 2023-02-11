

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = fluentIcon(name = "Filled.ZoomIn") {
            fluentPath {
                moveTo(17.5f, 10.0f)
                curveToRelative(0.0f, 1.71f, -0.57f, 3.29f, -1.54f, 4.55f)
                lineToRelative(4.75f, 4.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.5f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-4.74f, -4.75f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 17.5f, 10.0f)
                close()
                moveTo(10.0f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
