

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CenterVertical: ImageVector
    get() {
        if (_centerVertical != null) {
            return _centerVertical!!
        }
        _centerVertical = fluentIcon(name = "Regular.CenterVertical") {
            fluentPath {
                moveTo(21.0f, 3.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(3.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(21.0f, 20.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(3.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(7.25f, 8.0f)
                curveTo(6.01f, 8.0f, 5.0f, 9.0f, 5.0f, 10.25f)
                verticalLineToRelative(3.5f)
                curveTo(5.0f, 14.99f, 6.0f, 16.0f, 7.25f, 16.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-3.5f)
                curveTo(19.0f, 9.01f, 18.0f, 8.0f, 16.75f, 8.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(6.5f, 10.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        return _centerVertical!!
    }

private var _centerVertical: ImageVector? = null
