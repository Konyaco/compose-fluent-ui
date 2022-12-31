

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PortMicroUsb: ImageVector
    get() {
        if (_portMicroUsb != null) {
            return _portMicroUsb!!
        }
        _portMicroUsb = fluentIcon(name = "Filled.PortMicroUsb") {
            fluentPath {
                moveTo(19.0f, 12.83f)
                verticalLineTo(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.42f)
                lineToRelative(1.82f, -1.82f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.83f, 9.0f)
                horizontalLineToRelative(6.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.42f, 0.59f)
                lineToRelative(1.82f, 1.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, 1.42f)
                close()
            }
        }
        return _portMicroUsb!!
    }

private var _portMicroUsb: ImageVector? = null
