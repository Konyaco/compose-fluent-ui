

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = fluentIcon(name = "Filled.Hourglass") {
            fluentPath {
                moveTo(17.25f, 4.5f)
                horizontalLineTo(6.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.6f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 7.92f, 8.0f)
                lineTo(10.0f, 9.48f)
                curveToRelative(0.42f, 0.28f, 0.77f, 0.65f, 1.02f, 1.09f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 0.0f, 2.86f)
                curveToRelative(-0.25f, 0.44f, -0.6f, 0.81f, -1.02f, 1.09f)
                lineTo(7.92f, 16.0f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -1.42f, 2.65f)
                verticalLineToRelative(0.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.6f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 16.08f, 16.0f)
                lineTo(14.0f, 14.52f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, -1.02f, -1.09f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 0.0f, -2.86f)
                curveToRelative(0.25f, -0.44f, 0.6f, -0.81f, 1.02f, -1.09f)
                lineTo(16.08f, 8.0f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, 1.42f, -2.65f)
                verticalLineToRelative(-0.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
