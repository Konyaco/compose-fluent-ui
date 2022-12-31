

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = fluentIcon(name = "Filled.Alert") {
            fluentPath {
                moveTo(9.04f, 19.0f)
                horizontalLineToRelative(5.92f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.92f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, 7.5f)
                verticalLineToRelative(4.0f)
                lineToRelative(1.42f, 3.16f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.87f, 1.34f)
                horizontalLineTo(3.95f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.86f, -1.34f)
                lineTo(4.5f, 13.5f)
                verticalLineTo(9.24f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        return _alert!!
    }

private var _alert: ImageVector? = null
