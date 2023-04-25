

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = fluentIcon(name = "Regular.WifiOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.36f, 3.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.42f, 3.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.23f, 0.85f)
                arcToRelative(10.47f, 10.47f, 0.0f, false, true, 3.28f, -3.09f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, false, -3.42f, 3.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.34f, 0.67f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, 3.2f, -3.03f)
                lineToRelative(1.93f, 1.93f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, false, -3.94f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.61f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, true, 4.1f, -2.07f)
                lineToRelative(7.87f, 7.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(11.58f, 8.4f)
                lineTo(13.17f, 10.0f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, true, 4.73f, 3.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.34f, -0.68f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, false, -7.65f, -4.42f)
                close()
                moveTo(8.48f, 5.3f)
                lineTo(9.71f, 6.53f)
                arcToRelative(10.44f, 10.44f, 0.0f, false, true, 10.91f, 4.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.24f, -0.85f)
                arcTo(11.95f, 11.95f, 0.0f, false, false, 8.49f, 5.3f)
                close()
                moveTo(13.06f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                close()
            }
        }
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
