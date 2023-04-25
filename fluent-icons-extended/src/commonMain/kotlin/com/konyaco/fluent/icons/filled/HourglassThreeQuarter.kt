

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HourglassThreeQuarter: ImageVector
    get() {
        if (_hourglassThreeQuarter != null) {
            return _hourglassThreeQuarter!!
        }
        _hourglassThreeQuarter = fluentIcon(name = "Filled.HourglassThreeQuarter") {
            fluentPath {
                moveTo(6.97f, 7.0f)
                curveToRelative(0.24f, 0.4f, 0.56f, 0.74f, 0.95f, 1.0f)
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
                curveToRelative(0.39f, -0.26f, 0.7f, -0.6f, 0.95f, -1.0f)
                horizontalLineTo(6.97f)
                close()
            }
        }
        return _hourglassThreeQuarter!!
    }

private var _hourglassThreeQuarter: ImageVector? = null
