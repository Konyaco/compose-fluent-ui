

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
                moveTo(11.62f, 2.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.09f, 0.21f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.09f, 1.5f)
                lineTo(13.6f, 12.0f)
                lineToRelative(4.02f, 3.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.09f, 1.49f)
                lineToRelative(-5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 21.0f)
                verticalLineToRelative(-6.92f)
                lineToRelative(-3.38f, 2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.24f, -1.56f)
                lineTo(10.4f, 12.0f)
                lineTo(6.38f, 8.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.24f, -1.56f)
                lineTo(11.0f, 9.92f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.62f, -0.92f)
                close()
                moveTo(13.0f, 14.08f)
                verticalLineToRelative(4.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.0f)
                close()
                moveTo(13.0f, 9.92f)
                lineTo(15.5f, 7.92f)
                lineTo(13.0f, 5.42f)
                verticalLineToRelative(4.5f)
                close()
            }
        }
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
