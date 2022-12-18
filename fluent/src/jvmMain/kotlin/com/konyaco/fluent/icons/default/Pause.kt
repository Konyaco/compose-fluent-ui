

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = fluentIcon(name = "Default.Pause") {
            fluentPath {
                moveTo(640.0f, 256.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(1536.0f)
                horizontalLineTo(640.0f)
                verticalLineTo(256.0f)
                close()
                moveToRelative(768.0f, 0.0f)
                verticalLineToRelative(1536.0f)
                horizontalLineToRelative(-128.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(128.0f)
                close()
            }
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
