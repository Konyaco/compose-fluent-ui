

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = fluentIcon(name = "Default.Forward") {
            fluentPath {
                moveTo(2042.0f, 1024.0f)
                lineToRelative(-941.0f, 941.0f)
                lineToRelative(-90.0f, -90.0f)
                lineToRelative(787.0f, -787.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(960.0f)
                horizontalLineToRelative(1798.0f)
                lineToRelative(-787.0f, -787.0f)
                lineToRelative(90.0f, -90.0f)
                lineToRelative(941.0f, 941.0f)
                close()
            }
        }
        return _forward!!
    }

private var _forward: ImageVector? = null
