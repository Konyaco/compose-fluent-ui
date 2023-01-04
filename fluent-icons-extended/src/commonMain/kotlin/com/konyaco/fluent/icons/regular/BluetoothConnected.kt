

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = fluentIcon(name = "Regular.BluetoothConnected") {
            fluentPath {
                moveTo(10.0f, 9.6f)
                lineTo(10.0f, 3.76f)
                curveToRelative(0.0f, -0.64f, 0.76f, -0.97f, 1.23f, -0.58f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(4.7f, 5.1f)
                curveToRelative(0.27f, 0.3f, 0.27f, 0.74f, 0.01f, 1.02f)
                lineToRelative(-0.07f, 0.07f)
                lineTo(12.87f, 12.0f)
                lineToRelative(3.08f, 2.56f)
                curveToRelative(0.3f, 0.26f, 0.35f, 0.7f, 0.13f, 1.0f)
                lineToRelative(-0.06f, 0.09f)
                lineToRelative(-4.71f, 5.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.3f, -0.4f)
                verticalLineToRelative(-5.97f)
                lineToRelative(-1.13f, 0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.04f, -1.08f)
                lineToRelative(0.08f, -0.07f)
                lineTo(10.0f, 12.43f)
                verticalLineToRelative(-0.87f)
                lineTo(7.92f, 9.83f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.8f, 8.6f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(1.11f, 0.94f)
                lineTo(10.01f, 3.75f)
                verticalLineToRelative(5.86f)
                close()
                moveTo(11.7f, 12.97f)
                lineToRelative(-0.2f, 0.16f)
                verticalLineToRelative(5.2f)
                lineToRelative(2.88f, -3.12f)
                lineToRelative(-2.68f, -2.24f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(11.5f, 5.67f)
                verticalLineToRelative(5.19f)
                lineToRelative(0.2f, 0.16f)
                lineToRelative(2.68f, -2.23f)
                lineToRelative(-2.88f, -3.12f)
                close()
            }
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
