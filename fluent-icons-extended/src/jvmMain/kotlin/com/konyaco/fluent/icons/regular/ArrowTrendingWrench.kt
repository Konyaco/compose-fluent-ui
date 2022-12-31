

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTrendingWrench: ImageVector
    get() {
        if (_arrowTrendingWrench != null) {
            return _arrowTrendingWrench!!
        }
        _arrowTrendingWrench = fluentIcon(name = "Regular.ArrowTrendingWrench") {
            fluentPath {
                moveTo(21.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.19f)
                lineTo(13.0f, 9.94f)
                lineToRelative(-2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(5.97f, -5.97f)
                lineToRelative(2.22f, 2.22f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(5.97f, -5.97f)
                verticalLineToRelative(3.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(20.48f, 11.83f)
                curveToRelative(0.25f, -0.25f, 0.17f, -0.67f, -0.18f, -0.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.54f, 5.47f)
                lineToRelative(-3.74f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.12f, 2.12f)
                lineToRelative(3.74f, -3.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.47f, -4.54f)
                curveToRelative(-0.08f, -0.35f, -0.5f, -0.44f, -0.75f, -0.19f)
                lineToRelative(-1.74f, 1.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, -2.12f)
                lineToRelative(1.74f, -1.75f)
                close()
            }
        }
        return _arrowTrendingWrench!!
    }

private var _arrowTrendingWrench: ImageVector? = null
