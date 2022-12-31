

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTrending: ImageVector
    get() {
        if (_arrowTrending != null) {
            return _arrowTrending!!
        }
        _arrowTrending = fluentIcon(name = "Regular.ArrowTrending") {
            fluentPath {
                moveTo(13.75f, 5.5f)
                horizontalLineToRelative(7.55f)
                lineToRelative(0.1f, 0.01f)
                lineToRelative(0.1f, 0.03f)
                lineToRelative(0.06f, 0.03f)
                curveToRelative(0.08f, 0.03f, 0.16f, 0.08f, 0.22f, 0.15f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(0.04f, 0.06f)
                lineToRelative(0.06f, 0.09f)
                lineToRelative(0.04f, 0.09f)
                lineToRelative(0.02f, 0.06f)
                lineToRelative(0.01f, 0.07f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(7.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-5.8f)
                lineToRelative(-7.72f, 7.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-2.97f, -2.97f)
                lineToRelative(-5.47f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(2.97f, 2.97f)
                lineTo(19.44f, 7.0f)
                horizontalLineToRelative(-5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.73f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                close()
            }
        }
        return _arrowTrending!!
    }

private var _arrowTrending: ImageVector? = null
