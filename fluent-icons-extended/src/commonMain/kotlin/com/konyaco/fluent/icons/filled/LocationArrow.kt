

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = fluentIcon(name = "Filled.LocationArrow") {
            fluentPath {
                moveTo(21.9f, 4.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.94f, -1.94f)
                lineToRelative(-17.0f, 6.54f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.16f, 2.85f)
                lineToRelative(7.0f, 1.85f)
                curveToRelative(0.27f, 0.07f, 0.47f, 0.27f, 0.54f, 0.53f)
                lineToRelative(1.85f, 7.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.85f, 0.16f)
                lineToRelative(6.54f, -17.0f)
                close()
            }
        }
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
