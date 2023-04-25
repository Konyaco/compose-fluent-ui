

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = fluentIcon(name = "Regular.Dock") {
            fluentPath {
                moveTo(4.8f, 10.0f)
                horizontalLineToRelative(4.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.49f)
                lineTo(4.8f, 11.49f)
                curveToRelative(-0.68f, 0.0f, -1.2f, 0.46f, -1.27f, 1.0f)
                verticalLineToRelative(0.12f)
                lineToRelative(-0.03f, 4.78f)
                curveToRelative(0.0f, 0.56f, 0.49f, 1.04f, 1.14f, 1.1f)
                lineTo(19.23f, 18.49f)
                curveToRelative(0.67f, 0.0f, 1.2f, -0.44f, 1.26f, -1.0f)
                lineToRelative(0.01f, -0.1f)
                lineToRelative(0.02f, -4.78f)
                curveToRelative(0.0f, -0.56f, -0.49f, -1.05f, -1.14f, -1.1f)
                lineToRelative(-0.13f, -0.01f)
                horizontalLineToRelative(-4.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(4.8f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 2.77f, 2.44f)
                verticalLineToRelative(0.17f)
                lineTo(22.0f, 17.39f)
                curveToRelative(0.0f, 1.4f, -1.16f, 2.52f, -2.6f, 2.6f)
                lineTo(4.77f, 19.99f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -2.76f, -2.44f)
                lineTo(2.0f, 17.38f)
                lineToRelative(0.02f, -4.77f)
                curveToRelative(0.0f, -1.4f, 1.16f, -2.52f, 2.6f, -2.6f)
                lineToRelative(0.17f, -0.01f)
                horizontalLineToRelative(4.7f)
                horizontalLineToRelative(-4.7f)
                close()
                moveTo(12.45f, 3.15f)
                lineTo(12.53f, 3.22f)
                lineTo(16.46f, 7.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.14f)
                lineToRelative(-0.09f, -0.07f)
                lineToRelative(-2.65f, -2.66f)
                verticalLineToRelative(9.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.24f, 5.57f)
                lineTo(8.61f, 8.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(3.93f, -3.92f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                close()
            }
        }
        return _dock!!
    }

private var _dock: ImageVector? = null
