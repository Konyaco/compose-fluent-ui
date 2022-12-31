

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = fluentIcon(name = "Regular.ArrowClockwise") {
            fluentPath {
                moveTo(12.0f, 4.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 7.42f, 6.4f)
                curveToRelative(-0.07f, -0.46f, 0.26f, -0.9f, 0.72f, -0.9f)
                curveToRelative(0.37f, 0.0f, 0.7f, 0.26f, 0.76f, 0.62f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 18.0f, 5.3f)
                verticalLineTo(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.35f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, false, -5.1f, -2.0f)
                close()
            }
        }
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
