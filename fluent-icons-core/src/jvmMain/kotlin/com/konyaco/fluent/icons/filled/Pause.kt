

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = fluentIcon(name = "Filled.Pause") {
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
            }
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
