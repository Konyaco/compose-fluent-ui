

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSortDown: ImageVector
    get() {
        if (_arrowSortDown != null) {
            return _arrowSortDown!!
        }
        _arrowSortDown = fluentIcon(name = "Filled.ArrowSortDown") {
            fluentPath {
                moveTo(11.88f, 4.01f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineToRelative(11.7f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.31f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -1.5f)
                lineToRelative(0.1f, 0.08f)
                lineTo(11.0f, 16.6f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -0.99f)
                horizontalLineTo(12.0f)
                horizontalLineToRelative(-0.12f)
                close()
            }
        }
        return _arrowSortDown!!
    }

private var _arrowSortDown: ImageVector? = null
