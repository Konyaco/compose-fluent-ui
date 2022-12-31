

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = fluentIcon(name = "Regular.Snooze") {
            fluentPath {
                moveTo(8.24f, 13.0f)
                curveToRelative(0.58f, 0.0f, 0.93f, 0.62f, 0.67f, 1.1f)
                lineToRelative(-0.06f, 0.1f)
                lineToRelative(-4.62f, 6.3f)
                horizontalLineToRelative(4.01f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.75f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.66f, -1.1f)
                lineToRelative(0.05f, -0.1f)
                lineToRelative(4.62f, -6.3f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                lineToRelative(-0.01f, -0.1f)
                curveToRelative(0.0f, -0.39f, 0.28f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(5.6f)
                close()
                moveTo(21.25f, 2.0f)
                curveToRelative(0.6f, 0.0f, 0.94f, 0.66f, 0.64f, 1.15f)
                lineToRelative(-0.06f, 0.08f)
                lineToRelative(-8.5f, 10.27f)
                horizontalLineToRelative(7.92f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                horizontalLineToRelative(-9.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.64f, -1.14f)
                lineToRelative(0.06f, -0.08f)
                lineTo(19.66f, 3.5f)
                horizontalLineToRelative(-7.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.65f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                horizontalLineToRelative(9.6f)
                close()
            }
        }
        return _snooze!!
    }

private var _snooze: ImageVector? = null
