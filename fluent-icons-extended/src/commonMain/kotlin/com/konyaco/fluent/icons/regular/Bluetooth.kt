

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = fluentIcon(name = "Regular.Bluetooth") {
            fluentPath {
                moveTo(11.46f, 2.06f)
                curveToRelative(0.28f, -0.12f, 0.6f, -0.05f, 0.82f, 0.16f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.04f, 1.1f)
                lineTo(12.9f, 12.0f)
                lineToRelative(4.33f, 3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.04f, 1.1f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.28f, -0.53f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-3.76f, 3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, -1.14f)
                lineTo(10.6f, 12.0f)
                lineTo(6.26f, 8.32f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.98f, -1.14f)
                lineToRelative(3.76f, 3.2f)
                lineTo(11.0f, 2.75f)
                curveToRelative(0.0f, -0.3f, 0.18f, -0.58f, 0.46f, -0.7f)
                close()
                moveTo(12.5f, 13.62f)
                verticalLineToRelative(5.82f)
                lineToRelative(3.14f, -3.15f)
                lineToRelative(-3.14f, -2.67f)
                close()
                moveTo(12.5f, 10.38f)
                lineTo(15.64f, 7.71f)
                lineTo(12.5f, 4.56f)
                verticalLineToRelative(5.82f)
                close()
            }
        }
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
