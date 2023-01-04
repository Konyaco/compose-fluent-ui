

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.UsbStick: ImageVector
    get() {
        if (_usbStick != null) {
            return _usbStick!!
        }
        _usbStick = fluentIcon(name = "Filled.UsbStick") {
            fluentPath {
                moveTo(15.27f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineTo(16.01f, 7.13f)
                curveToRelative(0.82f, 0.3f, 1.42f, 1.05f, 1.49f, 1.95f)
                verticalLineToRelative(10.67f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.19f, 0.0f, -2.16f, -0.93f, -2.24f, -2.1f)
                lineTo(6.51f, 9.25f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.82f, 1.5f, -2.13f)
                lineTo(8.01f, 2.75f)
                curveToRelative(0.0f, -0.38f, 0.29f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(6.6f)
                close()
                moveTo(14.52f, 3.5f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.52f, 7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.52f, 3.5f)
                close()
            }
        }
        return _usbStick!!
    }

private var _usbStick: ImageVector? = null
