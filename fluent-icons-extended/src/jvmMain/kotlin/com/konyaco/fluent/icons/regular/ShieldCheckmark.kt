

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShieldCheckmark: ImageVector
    get() {
        if (_shieldCheckmark != null) {
            return _shieldCheckmark!!
        }
        _shieldCheckmark = fluentIcon(name = "Regular.ShieldCheckmark") {
            fluentPath {
                moveTo(3.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(2.66f, 0.0f, 5.26f, -0.94f, 7.8f, -2.85f)
                curveToRelative(0.27f, -0.2f, 0.63f, -0.2f, 0.9f, 0.0f)
                curveTo(14.99f, 4.05f, 17.59f, 5.0f, 20.25f, 5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(21.0f, 11.0f)
                curveToRelative(0.0f, 0.34f, -0.01f, 0.67f, -0.04f, 1.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -1.46f, -0.69f)
                lineTo(19.5f, 6.48f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, -2.8f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, 2.8f)
                lineTo(4.5f, 11.0f)
                curveToRelative(0.0f, 4.15f, 2.33f, 7.22f, 7.13f, 9.28f)
                curveToRelative(0.26f, 0.56f, 0.6f, 1.07f, 1.0f, 1.52f)
                lineToRelative(-0.36f, 0.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.0f)
                curveTo(5.96f, 19.68f, 3.0f, 16.0f, 3.0f, 11.0f)
                lineTo(3.0f, 5.75f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(20.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _shieldCheckmark!!
    }

private var _shieldCheckmark: ImageVector? = null
