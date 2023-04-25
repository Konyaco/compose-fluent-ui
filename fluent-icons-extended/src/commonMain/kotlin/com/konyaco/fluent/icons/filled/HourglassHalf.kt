

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HourglassHalf: ImageVector
    get() {
        if (_hourglassHalf != null) {
            return _hourglassHalf!!
        }
        _hourglassHalf = fluentIcon(name = "Filled.HourglassHalf") {
            fluentPath {
                moveTo(6.75f, 19.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.6f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 16.08f, 16.0f)
                lineTo(14.0f, 14.52f)
                arcTo(3.22f, 3.22f, 0.0f, false, true, 12.56f, 12.0f)
                horizontalLineToRelative(-1.12f)
                arcTo(3.22f, 3.22f, 0.0f, false, true, 10.0f, 14.52f)
                lineTo(7.92f, 16.0f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -1.42f, 2.65f)
                verticalLineToRelative(0.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                close()
            }
        }
        return _hourglassHalf!!
    }

private var _hourglassHalf: ImageVector? = null
