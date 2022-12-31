

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = fluentIcon(name = "Filled.Bluetooth") {
            fluentPath {
                moveTo(16.22f, 9.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.1f, -1.45f)
                lineToRelative(-4.58f, -4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.73f, 0.68f)
                verticalLineToRelative(5.1f)
                lineToRelative(-0.64f, -0.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.29f, 1.54f)
                lineToRelative(1.93f, 1.6f)
                verticalLineToRelative(0.6f)
                lineToRelative(-1.92f, 1.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.28f, 1.53f)
                lineToRelative(0.64f, -0.54f)
                lineTo(10.01f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.73f, 0.68f)
                lineToRelative(4.57f, -4.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.1f, -1.44f)
                lineTo(13.49f, 12.0f)
                lineToRelative(2.74f, -2.28f)
                close()
                moveTo(12.0f, 13.37f)
                lineToRelative(2.12f, 1.77f)
                lineToRelative(-2.12f, 2.3f)
                verticalLineToRelative(-4.07f)
                close()
                moveTo(12.0f, 10.63f)
                lineTo(12.0f, 6.56f)
                lineToRelative(2.12f, 2.3f)
                lineTo(12.0f, 10.63f)
                close()
            }
        }
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
