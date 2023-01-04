

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = fluentIcon(name = "Filled.BluetoothConnected") {
            fluentPath {
                moveTo(10.0f, 9.1f)
                lineTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.66f, -0.76f)
                lineToRelative(0.08f, 0.08f)
                lineToRelative(4.57f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.37f)
                lineToRelative(-0.1f, 0.08f)
                lineTo(13.49f, 12.0f)
                lineToRelative(2.74f, 2.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.17f, 1.35f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-4.57f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.73f, -0.57f)
                lineTo(10.02f, 14.9f)
                lineToRelative(-0.64f, 0.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.38f, -1.45f)
                lineToRelative(0.1f, -0.09f)
                lineTo(10.0f, 12.3f)
                verticalLineToRelative(-0.59f)
                lineToRelative(-1.93f, -1.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.18f, -1.61f)
                lineToRelative(0.1f, 0.07f)
                lineToRelative(0.65f, 0.54f)
                lineTo(10.0f, 4.0f)
                verticalLineToRelative(5.1f)
                close()
                moveTo(12.0f, 13.37f)
                verticalLineToRelative(4.07f)
                lineToRelative(2.13f, -2.3f)
                lineTo(12.0f, 13.37f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 6.56f)
                verticalLineToRelative(4.07f)
                lineToRelative(2.13f, -1.77f)
                lineTo(12.0f, 6.56f)
                close()
            }
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
