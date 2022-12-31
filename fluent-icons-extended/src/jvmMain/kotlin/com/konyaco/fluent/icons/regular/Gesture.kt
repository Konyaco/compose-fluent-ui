

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = fluentIcon(name = "Regular.Gesture") {
            fluentPath {
                moveTo(3.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(6.75f, 4.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-6.6f)
                lineToRelative(9.77f, 3.8f)
                curveToRelative(0.57f, 0.22f, 0.64f, 0.98f, 0.16f, 1.31f)
                lineToRelative(-0.1f, 0.06f)
                lineTo(6.1f, 17.93f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.76f, -1.3f)
                lineToRelative(0.09f, -0.04f)
                lineToRelative(12.97f, -6.5f)
                lineTo(6.48f, 5.45f)
                curveToRelative(-0.74f, -0.28f, -0.58f, -1.35f, 0.16f, -1.44f)
                horizontalLineToRelative(10.61f)
                horizontalLineToRelative(-10.5f)
                close()
                moveTo(19.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _gesture!!
    }

private var _gesture: ImageVector? = null
