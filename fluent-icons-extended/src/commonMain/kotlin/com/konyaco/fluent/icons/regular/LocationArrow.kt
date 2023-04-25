

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = fluentIcon(name = "Regular.LocationArrow") {
            fluentPath {
                moveTo(19.96f, 2.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.94f, 1.94f)
                lineToRelative(-6.54f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.85f, -0.16f)
                lineToRelative(-1.85f, -7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.53f, -0.54f)
                lineToRelative(-7.01f, -1.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.16f, -2.85f)
                lineToRelative(17.0f, -6.54f)
                close()
                moveTo(20.5f, 3.5f)
                lineTo(3.5f, 10.04f)
                lineTo(10.51f, 11.89f)
                curveToRelative(0.79f, 0.2f, 1.4f, 0.81f, 1.6f, 1.6f)
                lineToRelative(1.85f, 7.01f)
                lineToRelative(6.54f, -17.0f)
                close()
            }
        }
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
