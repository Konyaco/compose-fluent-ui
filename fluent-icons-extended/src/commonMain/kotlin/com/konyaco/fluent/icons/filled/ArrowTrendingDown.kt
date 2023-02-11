

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = fluentIcon(name = "Filled.ArrowTrendingDown") {
            fluentPath {
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.88f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.12f)
                verticalLineToRelative(4.7f)
                lineTo(12.7f, 8.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.31f, -0.08f)
                lineToRelative(-0.1f, 0.08f)
                lineTo(9.0f, 10.6f)
                lineToRelative(-5.28f, -5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.5f, 1.32f)
                lineToRelative(0.08f, 0.1f)
                lineToRelative(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 0.08f)
                lineToRelative(0.1f, -0.09f)
                lineTo(12.0f, 10.41f)
                lineTo(18.58f, 17.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.99f, 0.88f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.88f, 1.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
