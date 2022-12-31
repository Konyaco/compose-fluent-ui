

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTrendingText: ImageVector
    get() {
        if (_arrowTrendingText != null) {
            return _arrowTrendingText!!
        }
        _arrowTrendingText = fluentIcon(name = "Filled.ArrowTrendingText") {
            fluentPath {
                moveTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-5.09f, 5.09f)
                lineToRelative(-1.8f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, 1.42f)
                lineToRelative(5.3f, -5.3f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.56f, 0.28f)
                curveToRelative(0.3f, -0.2f, 0.63f, -0.34f, 0.98f, -0.42f)
                lineTo(19.0f, 6.41f)
                lineTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(14.0f, 16.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(14.0f, 19.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        return _arrowTrendingText!!
    }

private var _arrowTrendingText: ImageVector? = null
