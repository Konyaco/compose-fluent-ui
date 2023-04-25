

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HourglassOneQuarter: ImageVector
    get() {
        if (_hourglassOneQuarter != null) {
            return _hourglassOneQuarter!!
        }
        _hourglassOneQuarter = fluentIcon(name = "Filled.HourglassOneQuarter") {
            fluentPath {
                moveTo(7.92f, 16.0f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -1.42f, 2.65f)
                verticalLineToRelative(0.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.6f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 16.08f, 16.0f)
                horizontalLineTo(7.92f)
                close()
            }
        }
        return _hourglassOneQuarter!!
    }

private var _hourglassOneQuarter: ImageVector? = null
