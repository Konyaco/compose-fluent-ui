

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = fluentIcon(name = "Regular.Drop") {
            fluentPath {
                moveTo(11.47f, 2.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                curveToRelative(0.4f, 0.4f, 2.0f, 2.13f, 3.5f, 4.36f)
                curveTo(17.5f, 8.78f, 19.0f, 11.63f, 19.0f, 14.25f)
                curveToRelative(0.0f, 2.52f, -0.75f, 4.48f, -2.04f, 5.8f)
                arcTo(6.78f, 6.78f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(6.78f, 6.78f, 0.0f, false, true, -4.96f, -1.94f)
                curveTo(5.74f, 18.73f, 5.0f, 16.77f, 5.0f, 14.25f)
                curveToRelative(0.0f, -2.62f, 1.5f, -5.46f, 2.97f, -7.67f)
                curveToRelative(1.5f, -2.23f, 3.1f, -3.96f, 3.5f, -4.36f)
                close()
                moveTo(9.22f, 7.42f)
                curveToRelative(-1.46f, 2.17f, -2.72f, 4.7f, -2.72f, 6.83f)
                curveToRelative(0.0f, 2.23f, 0.65f, 3.77f, 1.62f, 4.76f)
                curveToRelative(0.96f, 0.98f, 2.32f, 1.49f, 3.88f, 1.49f)
                reflectiveCurveToRelative(2.92f, -0.5f, 3.88f, -1.5f)
                curveToRelative(0.97f, -0.98f, 1.62f, -2.52f, 1.62f, -4.75f)
                curveToRelative(0.0f, -2.13f, -1.26f, -4.66f, -2.72f, -6.83f)
                arcTo(33.36f, 33.36f, 0.0f, false, false, 12.0f, 3.85f)
                curveToRelative(-0.65f, 0.73f, -1.74f, 2.02f, -2.78f, 3.57f)
                close()
            }
        }
        return _drop!!
    }

private var _drop: ImageVector? = null
