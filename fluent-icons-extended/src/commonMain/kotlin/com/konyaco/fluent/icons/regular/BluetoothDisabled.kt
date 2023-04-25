

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BluetoothDisabled: ImageVector
    get() {
        if (_bluetoothDisabled != null) {
            return _bluetoothDisabled!!
        }
        _bluetoothDisabled = fluentIcon(name = "Regular.BluetoothDisabled") {
            fluentPath {
                moveToRelative(16.5f, 17.56f)
                lineToRelative(4.22f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(8.56f, 8.56f)
                lineToRelative(-4.52f, 3.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.98f, 1.14f)
                lineToRelative(3.76f, -3.2f)
                verticalLineToRelative(7.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.28f, 0.53f)
                lineToRelative(4.22f, -4.22f)
                close()
                moveTo(12.9f, 13.96f)
                lineTo(15.44f, 16.5f)
                lineTo(12.5f, 19.44f)
                verticalLineToRelative(-5.82f)
                lineToRelative(0.4f, 0.35f)
                close()
                moveTo(17.24f, 8.32f)
                lineTo(14.14f, 10.96f)
                lineTo(13.07f, 9.89f)
                lineTo(15.64f, 7.71f)
                lineTo(12.5f, 4.56f)
                verticalLineToRelative(4.76f)
                lineTo(11.0f, 7.82f)
                lineTo(11.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.28f, -0.53f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.04f, 1.1f)
                close()
            }
        }
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
