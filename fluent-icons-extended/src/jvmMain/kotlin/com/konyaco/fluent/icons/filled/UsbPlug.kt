

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.UsbPlug: ImageVector
    get() {
        if (_usbPlug != null) {
            return _usbPlug!!
        }
        _usbPlug = fluentIcon(name = "Filled.UsbPlug") {
            fluentPath {
                moveTo(11.0f, 21.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.19f, 0.0f, -2.16f, -0.93f, -2.24f, -2.1f)
                verticalLineTo(9.25f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.82f, 1.5f, -2.13f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.38f, 0.29f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.39f, 0.0f, 0.7f, 0.28f, 0.75f, 0.65f)
                verticalLineTo(7.13f)
                curveToRelative(0.82f, 0.3f, 1.42f, 1.05f, 1.49f, 1.95f)
                verticalLineToRelative(5.67f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.25f)
                close()
                moveTo(14.52f, 3.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        return _usbPlug!!
    }

private var _usbPlug: ImageVector? = null
