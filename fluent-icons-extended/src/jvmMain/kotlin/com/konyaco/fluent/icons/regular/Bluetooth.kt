

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
                moveTo(11.7f, 12.97f)
                lineToRelative(2.68f, 2.24f)
                lineToRelative(-2.88f, 3.12f)
                verticalLineToRelative(-5.2f)
                lineToRelative(0.2f, -0.16f)
                close()
                moveTo(12.87f, 12.0f)
                lineToRelative(3.08f, -2.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -1.08f)
                lineToRelative(-4.71f, -5.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.3f, 0.5f)
                verticalLineToRelative(5.86f)
                lineToRelative(-1.13f, -0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.96f, 1.16f)
                lineTo(10.0f, 11.56f)
                verticalLineToRelative(0.87f)
                lineToRelative(-2.08f, 1.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.96f, 1.15f)
                lineToRelative(1.12f, -0.94f)
                verticalLineToRelative(5.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.3f, 0.5f)
                lineToRelative(4.72f, -5.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, -1.09f)
                lineTo(12.87f, 12.0f)
                close()
                moveTo(11.7f, 11.02f)
                lineToRelative(-0.2f, -0.16f)
                lineTo(11.5f, 5.67f)
                lineToRelative(2.88f, 3.12f)
                lineToRelative(-2.68f, 2.23f)
                close()
            }
        }
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
