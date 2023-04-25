

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
                moveToRelative(16.68f, 17.74f)
                lineToRelative(4.04f, 4.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(8.48f, 8.48f)
                lineToRelative(-4.32f, 3.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.24f, 1.56f)
                lineToRelative(3.38f, -2.7f)
                lineTo(11.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.7f, 0.7f)
                lineToRelative(3.98f, -3.96f)
                close()
                moveTo(13.1f, 14.16f)
                lineTo(15.26f, 16.32f)
                lineTo(13.0f, 18.6f)
                verticalLineToRelative(-4.5f)
                lineToRelative(0.1f, 0.07f)
                close()
                moveTo(17.62f, 8.78f)
                lineTo(14.48f, 11.3f)
                lineTo(13.06f, 9.87f)
                lineTo(15.5f, 7.92f)
                lineTo(13.0f, 5.42f)
                verticalLineToRelative(4.4f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.7f, -0.7f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, 1.48f)
                close()
            }
        }
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
