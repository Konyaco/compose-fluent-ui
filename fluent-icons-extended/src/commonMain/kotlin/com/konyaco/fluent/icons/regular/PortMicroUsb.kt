

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PortMicroUsb: ImageVector
    get() {
        if (_portMicroUsb != null) {
            return _portMicroUsb!!
        }
        _portMicroUsb = fluentIcon(name = "Regular.PortMicroUsb") {
            fluentPath {
                moveTo(15.17f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.36f, 0.15f)
                lineToRelative(1.82f, 1.82f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.15f, 0.36f)
                lineTo(17.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(7.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-0.17f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.15f, -0.36f)
                lineToRelative(1.82f, -1.82f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.36f, -0.15f)
                horizontalLineToRelative(6.34f)
                close()
                moveTo(15.17f, 9.0f)
                lineTo(8.83f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.42f, 0.59f)
                lineTo(5.6f, 11.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 12.83f)
                lineTo(5.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                lineTo(16.6f, 9.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.17f, 9.0f)
                close()
            }
        }
        return _portMicroUsb!!
    }

private var _portMicroUsb: ImageVector? = null
