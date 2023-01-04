

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = fluentIcon(name = "Regular.Pulse") {
            fluentPath {
                moveTo(8.46f, 6.8f)
                lineToRelative(3.29f, 13.63f)
                curveToRelative(0.17f, 0.73f, 1.2f, 0.77f, 1.44f, 0.05f)
                lineToRelative(3.26f, -10.12f)
                lineToRelative(0.58f, 2.1f)
                curveToRelative(0.1f, 0.32f, 0.39f, 0.54f, 0.72f, 0.54f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(-1.1f, -3.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.44f, -0.03f)
                lineToRelative(-3.2f, 9.96f)
                lineToRelative(-3.35f, -13.9f)
                curveToRelative(-0.19f, -0.76f, -1.26f, -0.77f, -1.46f, -0.02f)
                lineToRelative(-2.1f, 7.94f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.34f, 0.0f, 0.63f, -0.23f, 0.72f, -0.56f)
                lineToRelative(1.5f, -5.63f)
                close()
            }
        }
        return _pulse!!
    }

private var _pulse: ImageVector? = null
