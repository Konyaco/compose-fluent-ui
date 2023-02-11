

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RoadCone: ImageVector
    get() {
        if (_roadCone != null) {
            return _roadCone!!
        }
        _roadCone = fluentIcon(name = "Filled.RoadCone") {
            fluentPath {
                moveTo(11.2f, 2.0f)
                curveToRelative(-0.58f, 0.0f, -1.08f, 0.4f, -1.22f, 0.96f)
                arcTo(325.4f, 325.4f, 0.0f, false, true, 7.59f, 12.0f)
                horizontalLineToRelative(5.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(7.18f)
                lineToRelative(-0.55f, 2.0f)
                horizontalLineToRelative(7.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(6.22f)
                lineToRelative(-0.93f, 3.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.54f)
                lineTo(14.02f, 2.93f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.2f, -0.93f)
                horizontalLineToRelative(-1.63f)
                close()
            }
        }
        return _roadCone!!
    }

private var _roadCone: ImageVector? = null
