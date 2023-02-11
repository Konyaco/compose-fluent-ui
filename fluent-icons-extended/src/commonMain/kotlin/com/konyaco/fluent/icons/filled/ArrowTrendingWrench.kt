

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTrendingWrench: ImageVector
    get() {
        if (_arrowTrendingWrench != null) {
            return _arrowTrendingWrench!!
        }
        _arrowTrendingWrench = fluentIcon(name = "Filled.ArrowTrendingWrench") {
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
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineTo(19.0f, 6.4f)
                lineTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(21.0f, 4.0f)
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
