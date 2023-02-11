

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DarkTheme: ImageVector
    get() {
        if (_darkTheme != null) {
            return _darkTheme!!
        }
        _darkTheme = fluentIcon(name = "Filled.DarkTheme") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(12.0f, 20.0f)
                lineTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                close()
            }
        }
        return _darkTheme!!
    }

private var _darkTheme: ImageVector? = null
