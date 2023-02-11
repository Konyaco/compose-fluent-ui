

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BluetoothDisabled: ImageVector
    get() {
        if (_bluetoothDisabled != null) {
            return _bluetoothDisabled!!
        }
        _bluetoothDisabled = fluentIcon(name = "Filled.BluetoothDisabled") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(10.0f, 11.06f)
                verticalLineToRelative(1.24f)
                lineTo(8.1f, 13.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.28f, 1.53f)
                lineToRelative(0.64f, -0.54f)
                lineTo(10.02f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.73f, 0.68f)
                lineToRelative(3.78f, -4.1f)
                lineToRelative(5.2f, 5.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(12.01f, 13.07f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(-2.1f, 2.27f)
                verticalLineToRelative(-4.37f)
                close()
                moveTo(16.21f, 9.72f)
                lineToRelative(-1.8f, 1.5f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(1.14f, -0.95f)
                lineTo(12.0f, 6.56f)
                verticalLineToRelative(2.26f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.73f, -0.68f)
                lineToRelative(4.57f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, 1.45f)
                close()
            }
        }
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
