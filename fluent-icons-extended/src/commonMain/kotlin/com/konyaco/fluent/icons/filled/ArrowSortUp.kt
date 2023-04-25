

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSortUp: ImageVector
    get() {
        if (_arrowSortUp != null) {
            return _arrowSortUp!!
        }
        _arrowSortUp = fluentIcon(name = "Filled.ArrowSortUp") {
            fluentPath {
                moveToRelative(7.3f, 8.3f)
                lineToRelative(3.99f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.1f)
                lineToRelative(0.1f, 0.1f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.5f)
                lineToRelative(-0.1f, -0.1f)
                lineTo(13.0f, 7.43f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineTo(7.4f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.31f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        return _arrowSortUp!!
    }

private var _arrowSortUp: ImageVector? = null
