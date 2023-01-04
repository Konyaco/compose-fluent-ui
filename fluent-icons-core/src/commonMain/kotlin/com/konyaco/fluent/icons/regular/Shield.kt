

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = fluentIcon(name = "Regular.Shield") {
            fluentPath {
                moveTo(3.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(2.66f, 0.0f, 5.26f, -0.94f, 7.8f, -2.85f)
                curveToRelative(0.27f, -0.2f, 0.63f, -0.2f, 0.9f, 0.0f)
                curveTo(14.99f, 4.05f, 17.59f, 5.0f, 20.25f, 5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(21.0f, 11.0f)
                curveToRelative(0.0f, 5.0f, -2.96f, 8.68f, -8.73f, 10.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.0f)
                curveTo(5.96f, 19.68f, 3.0f, 16.0f, 3.0f, 11.0f)
                lineTo(3.0f, 5.75f)
                close()
                moveTo(4.5f, 6.48f)
                lineTo(4.5f, 11.0f)
                curveToRelative(0.0f, 4.26f, 2.45f, 7.38f, 7.5f, 9.44f)
                curveToRelative(5.05f, -2.06f, 7.5f, -5.18f, 7.5f, -9.44f)
                lineTo(19.5f, 6.48f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, -2.8f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, 2.8f)
                close()
            }
        }
        return _shield!!
    }

private var _shield: ImageVector? = null
