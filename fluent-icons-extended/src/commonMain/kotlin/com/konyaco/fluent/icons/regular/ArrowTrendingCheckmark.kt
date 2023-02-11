

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTrendingCheckmark: ImageVector
    get() {
        if (_arrowTrendingCheckmark != null) {
            return _arrowTrendingCheckmark!!
        }
        _arrowTrendingCheckmark = fluentIcon(name = "Regular.ArrowTrendingCheckmark") {
            fluentPath {
                moveTo(20.25f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(19.5f, 5.56f)
                lineToRelative(-5.97f, 5.97f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-2.22f, -2.22f)
                lineToRelative(-5.97f, 5.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(6.5f, -6.5f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(13.0f, 9.94f)
                lineToRelative(5.44f, -5.44f)
                horizontalLineToRelative(-3.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
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
