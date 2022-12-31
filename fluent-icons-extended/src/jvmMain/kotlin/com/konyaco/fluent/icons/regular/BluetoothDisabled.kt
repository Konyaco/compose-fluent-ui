

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
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(10.0f, 11.06f)
                verticalLineToRelative(1.37f)
                lineToRelative(-2.08f, 1.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.96f, 1.15f)
                lineToRelative(1.12f, -0.94f)
                verticalLineToRelative(5.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.3f, 0.5f)
                lineToRelative(4.03f, -4.36f)
                lineToRelative(5.39f, 5.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(11.5f, 12.56f)
                lineToRelative(2.77f, 2.77f)
                lineToRelative(-2.77f, 3.0f)
                lineTo(11.5f, 12.56f)
                close()
                moveTo(15.95f, 9.43f)
                lineToRelative(-1.82f, 1.52f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(1.32f, -1.1f)
                lineToRelative(-2.88f, -3.1f)
                verticalLineToRelative(2.64f)
                lineTo(10.0f, 6.82f)
                lineTo(10.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.3f, -0.5f)
                lineToRelative(4.72f, 5.1f)
                curveToRelative(0.29f, 0.31f, 0.26f, 0.8f, -0.07f, 1.08f)
                close()
            }
        }
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
