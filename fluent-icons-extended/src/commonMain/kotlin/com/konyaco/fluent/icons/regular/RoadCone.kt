

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RoadCone: ImageVector
    get() {
        if (_roadCone != null) {
            return _roadCone!!
        }
        _roadCone = fluentIcon(name = "Regular.RoadCone") {
            fluentPath {
                moveTo(11.18f, 2.0f)
                curveToRelative(-0.56f, 0.0f, -1.06f, 0.38f, -1.2f, 0.93f)
                lineTo(5.29f, 20.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.54f)
                lineTo(14.02f, 2.93f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.2f, -0.93f)
                horizontalLineToRelative(-1.64f)
                close()
                moveTo(6.84f, 20.5f)
                lineToRelative(0.94f, -3.5f)
                horizontalLineToRelative(5.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.18f)
                lineToRelative(0.53f, -2.0f)
                horizontalLineToRelative(4.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(9.11f)
                lineToRelative(2.27f, -8.5f)
                horizontalLineToRelative(1.24f)
                lineToRelative(4.54f, 17.0f)
                horizontalLineTo(6.84f)
                close()
            }
        }
        return _roadCone!!
    }

private var _roadCone: ImageVector? = null
