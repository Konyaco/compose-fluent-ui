

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = fluentIcon(name = "Regular.ArrowTrendingDown") {
            fluentPath {
                moveTo(13.75f, 18.5f)
                horizontalLineToRelative(7.55f)
                lineToRelative(0.1f, -0.01f)
                lineToRelative(0.1f, -0.03f)
                lineToRelative(0.06f, -0.03f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.22f, -0.15f)
                lineToRelative(0.04f, -0.04f)
                lineToRelative(0.04f, -0.06f)
                lineToRelative(0.06f, -0.09f)
                lineToRelative(0.04f, -0.09f)
                lineToRelative(0.02f, -0.06f)
                lineToRelative(0.01f, -0.07f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-7.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, -0.1f)
                verticalLineToRelative(5.8f)
                lineToRelative(-7.72f, -7.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-2.97f, 2.97f)
                lineToRelative(-5.47f, -5.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.13f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(6.0f, 6.0f)
                curveToRelative(0.27f, 0.27f, 0.68f, 0.3f, 0.98f, 0.07f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(2.97f, -2.97f)
                lineTo(19.44f, 17.0f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-0.37f, 0.0f, -0.68f, 0.28f, -0.73f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                close()
            }
        }
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
