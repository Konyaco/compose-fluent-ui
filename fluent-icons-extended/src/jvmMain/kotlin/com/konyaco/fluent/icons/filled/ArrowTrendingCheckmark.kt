

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTrendingCheckmark: ImageVector
    get() {
        if (_arrowTrendingCheckmark != null) {
            return _arrowTrendingCheckmark!!
        }
        _arrowTrendingCheckmark = fluentIcon(name = "Filled.ArrowTrendingCheckmark") {
            fluentPath {
                moveTo(20.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(19.0f, 6.41f)
                lineToRelative(-5.8f, 5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineTo(10.0f, 10.4f)
                lineToRelative(-5.3f, 5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.42f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(1.8f, 1.8f)
                lineTo(17.59f, 5.0f)
                lineTo(15.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(20.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _arrowTrendingCheckmark!!
    }

private var _arrowTrendingCheckmark: ImageVector? = null
