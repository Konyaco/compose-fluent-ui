

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTrending: ImageVector
    get() {
        if (_arrowTrending != null) {
            return _arrowTrending!!
        }
        _arrowTrending = fluentIcon(name = "Filled.ArrowTrending") {
            fluentPath {
                moveTo(14.0f, 5.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineToRelative(7.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineTo(8.9f)
                lineToRelative(-7.3f, 7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.31f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(9.0f, 13.9f)
                lineToRelative(-5.28f, 5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                lineTo(12.0f, 14.1f)
                lineToRelative(6.58f, -6.59f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.99f, -0.88f)
                verticalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                horizontalLineTo(21.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _arrowTrending!!
    }

private var _arrowTrending: ImageVector? = null
