

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Teddy: ImageVector
    get() {
        if (_teddy != null) {
            return _teddy!!
        }
        _teddy = fluentIcon(name = "Filled.Teddy") {
            fluentPath {
                moveTo(3.2f, 10.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.25f, -4.96f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, false, -6.24f, 4.96f)
                close()
                moveTo(14.54f, 5.31f)
                arcTo(3.99f, 3.99f, 0.0f, false, true, 21.5f, 8.0f)
                curveToRelative(0.0f, 0.84f, -0.26f, 1.63f, -0.7f, 2.27f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, false, -6.26f, -4.96f)
                close()
                moveTo(6.63f, 19.31f)
                arcTo(7.19f, 7.19f, 0.0f, false, true, 3.5f, 13.5f)
                curveTo(3.5f, 9.36f, 7.3f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(8.5f, 3.36f, 8.5f, 7.5f)
                arcToRelative(7.19f, 7.19f, 0.0f, false, true, -3.13f, 5.81f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -10.74f, 0.0f)
                close()
                moveTo(15.0f, 17.14f)
                curveToRelative(-0.45f, -0.4f, -0.98f, -0.7f, -1.54f, -0.9f)
                curveToRelative(-0.17f, 0.44f, -0.76f, 0.76f, -1.46f, 0.76f)
                reflectiveCurveToRelative(-1.3f, -0.32f, -1.46f, -0.76f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.0f, 3.65f)
                curveToRelative(1.3f, 0.7f, 2.82f, 1.11f, 4.46f, 1.11f)
                curveToRelative(1.64f, 0.0f, 3.16f, -0.4f, 4.46f, -1.11f)
                arcTo(4.48f, 4.48f, 0.0f, false, false, 15.0f, 17.14f)
                close()
            }
        }
        return _teddy!!
    }

private var _teddy: ImageVector? = null
