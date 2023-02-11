

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PortUsbA: ImageVector
    get() {
        if (_portUsbA != null) {
            return _portUsbA!!
        }
        _portUsbA = fluentIcon(name = "Filled.PortUsbA") {
            fluentPath {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        return _portUsbA!!
    }

private var _portUsbA: ImageVector? = null
