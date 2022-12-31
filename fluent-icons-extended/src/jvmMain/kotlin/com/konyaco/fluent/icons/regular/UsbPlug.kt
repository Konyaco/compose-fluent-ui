

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.UsbPlug: ImageVector
    get() {
        if (_usbPlug != null) {
            return _usbPlug!!
        }
        _usbPlug = fluentIcon(name = "Regular.UsbPlug") {
            fluentPath {
                moveTo(11.0f, 21.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(9.5f, 17.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.19f, 0.0f, -2.16f, -0.93f, -2.24f, -2.1f)
                lineTo(6.51f, 9.25f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.82f, 1.5f, -2.13f)
                lineTo(8.01f, 2.75f)
                curveToRelative(0.0f, -0.38f, 0.29f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.39f, 0.0f, 0.7f, 0.28f, 0.75f, 0.65f)
                lineTo(16.01f, 7.13f)
                curveToRelative(0.82f, 0.3f, 1.42f, 1.05f, 1.49f, 1.95f)
                verticalLineToRelative(5.67f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.25f)
                close()
                moveTo(15.25f, 8.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.38f, 0.0f, -0.69f, 0.28f, -0.74f, 0.65f)
                verticalLineToRelative(5.6f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.64f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.75f, -0.65f)
                verticalLineToRelative(-5.6f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.64f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                close()
                moveTo(14.52f, 3.5f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.52f, 7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.52f, 3.5f)
                close()
            }
        }
        return _usbPlug!!
    }

private var _usbPlug: ImageVector? = null
