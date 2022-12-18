

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = fluentIcon(name = "Default.Add") {
            fluentPath {
                moveTo(2048.0f, 960.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-960.0f)
                verticalLineToRelative(960.0f)
                horizontalLineTo(960.0f)
                verticalLineToRelative(-960.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(960.0f)
                horizontalLineToRelative(960.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(960.0f)
                horizontalLineToRelative(960.0f)
                close()
            }
        }
        return _add!!
    }

private var _add: ImageVector? = null
