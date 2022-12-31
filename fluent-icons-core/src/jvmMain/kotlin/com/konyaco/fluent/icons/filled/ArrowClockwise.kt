

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = fluentIcon(name = "Filled.ArrowClockwise") {
            fluentPath {
                moveTo(12.0f, 4.75f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, false, 7.2f, 6.4f)
                curveToRelative(-0.07f, -0.58f, 0.36f, -1.15f, 0.95f, -1.15f)
                curveToRelative(0.52f, 0.0f, 0.97f, 0.36f, 1.03f, 0.87f)
                arcToRelative(9.25f, 9.25f, 0.0f, true, true, -3.43f, -6.12f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.7f)
                lineToRelative(0.03f, 0.05f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.67f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 12.0f, 4.75f)
                close()
            }
        }
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
