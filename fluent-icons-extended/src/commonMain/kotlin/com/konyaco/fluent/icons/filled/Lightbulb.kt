

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = fluentIcon(name = "Filled.Lightbulb") {
            fluentPath {
                moveToRelative(15.54f, 19.0f)
                lineToRelative(-0.3f, 1.26f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.01f, 1.73f)
                lineToRelative(-0.17f, 0.01f)
                horizontalLineToRelative(-2.12f)
                curveToRelative(-0.99f, 0.0f, -1.85f, -0.65f, -2.14f, -1.58f)
                lineToRelative(-0.05f, -0.16f)
                lineTo(8.46f, 19.0f)
                horizontalLineToRelative(7.08f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.0f, 0.0f, 7.25f, 3.25f, 7.25f, 7.25f)
                curveToRelative(0.0f, 2.14f, -0.94f, 4.1f, -2.77f, 5.84f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.07f, 0.13f)
                lineToRelative(-0.52f, 2.28f)
                horizontalLineTo(8.1f)
                lineToRelative(-0.52f, -2.28f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.07f, -0.13f)
                curveToRelative(-1.83f, -1.75f, -2.77f, -3.7f, -2.77f, -5.84f)
                curveTo(4.75f, 5.25f, 8.0f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
