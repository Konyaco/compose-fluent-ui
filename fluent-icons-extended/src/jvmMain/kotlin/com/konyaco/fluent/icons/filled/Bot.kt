

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Bot: ImageVector
    get() {
        if (_bot != null) {
            return _bot!!
        }
        _bot = fluentIcon(name = "Filled.Bot") {
            fluentPath {
                moveTo(17.75f, 14.0f)
                curveTo(19.0f, 14.0f, 20.0f, 15.0f, 20.0f, 16.25f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.0f, 1.1f, -0.47f, 2.14f, -1.3f, 2.85f)
                curveToRelative(-1.57f, 1.34f, -3.81f, 2.0f, -6.7f, 2.0f)
                reflectiveCurveToRelative(-5.13f, -0.66f, -6.7f, -2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 17.16f)
                verticalLineToRelative(-0.91f)
                curveTo(4.0f, 15.0f, 5.01f, 14.0f, 6.25f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(11.9f, 2.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.25f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(9.75f, 6.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(14.25f, 6.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _bot!!
    }

private var _bot: ImageVector? = null
