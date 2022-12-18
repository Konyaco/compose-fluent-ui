

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Back: ImageVector
    get() {
        if (_back != null) {
            return _back!!
        }
        _back = fluentIcon(name = "Default.Back") {
            fluentPath {
                moveTo(2048.0f, 1088.0f)
                horizontalLineTo(250.0f)
                lineToRelative(787.0f, 787.0f)
                lineToRelative(-90.0f, 90.0f)
                lineTo(6.0f, 1024.0f)
                lineTo(947.0f, 83.0f)
                lineToRelative(90.0f, 90.0f)
                lineToRelative(-787.0f, 787.0f)
                horizontalLineToRelative(1798.0f)
                verticalLineToRelative(128.0f)
                close()
            }
        }
        return _back!!
    }

private var _back: ImageVector? = null
