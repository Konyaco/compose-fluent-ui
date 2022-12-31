

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.New: ImageVector
    get() {
        if (_new != null) {
            return _new!!
        }
        _new = fluentIcon(name = "Filled.New") {
            fluentPath {
                moveTo(18.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(4.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(7.7f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.4f)
                lineToRelative(7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.4f)
                lineToRelative(-7.0f, -7.0f)
                close()
            }
        }
        return _new!!
    }

private var _new: ImageVector? = null
