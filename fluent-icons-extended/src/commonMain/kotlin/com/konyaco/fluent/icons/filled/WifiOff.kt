

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = fluentIcon(name = "Filled.WifiOff") {
            fluentPath {
                moveToRelative(12.86f, 14.27f)
                lineToRelative(7.43f, 7.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.42f)
                lineToRelative(-18.0f, -18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, 1.42f)
                lineToRelative(3.1f, 3.1f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, false, -3.21f, 3.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.64f, 1.14f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, true, 3.01f, -2.87f)
                lineTo(8.0f, 9.4f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, -3.2f, 3.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.78f, 0.9f)
                arcToRelative(6.08f, 6.08f, 0.0f, false, true, 2.9f, -2.8f)
                lineToRelative(1.41f, 1.42f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -3.63f, 3.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.83f, 0.8f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 3.78f, -1.84f)
                close()
                moveTo(11.53f, 8.34f)
                lineTo(13.75f, 10.57f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 3.76f, 3.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.78f, -0.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -7.76f, -4.45f)
                close()
                moveTo(8.5f, 5.33f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, 10.02f, 4.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.64f, -1.14f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 8.51f, 5.33f)
                close()
                moveTo(13.05f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                close()
            }
        }
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
