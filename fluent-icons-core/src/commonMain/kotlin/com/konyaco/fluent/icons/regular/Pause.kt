

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = fluentIcon(name = "Regular.Pause") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                curveTo(5.01f, 3.0f, 4.0f, 4.0f, 4.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 19.99f, 5.0f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(2.5f)
                curveTo(9.99f, 21.0f, 11.0f, 20.0f, 11.0f, 18.75f)
                lineTo(11.0f, 5.25f)
                curveTo(11.0f, 4.01f, 10.0f, 3.0f, 8.75f, 3.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(5.5f, 5.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.5f, 5.25f)
                close()
                moveTo(15.25f, 3.0f)
                curveTo(14.01f, 3.0f, 13.0f, 4.0f, 13.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 5.25f)
                curveTo(20.0f, 4.01f, 19.0f, 3.0f, 17.75f, 3.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(14.5f, 5.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(14.5f, 5.25f)
                close()
            }
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
