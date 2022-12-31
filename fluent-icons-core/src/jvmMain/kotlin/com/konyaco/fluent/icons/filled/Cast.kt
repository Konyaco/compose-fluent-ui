

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = fluentIcon(name = "Filled.Cast") {
            fluentPath {
                moveTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 5.01f, 21.0f, 4.0f, 19.75f, 4.0f)
                lineTo(4.25f, 4.0f)
                close()
                moveTo(5.75f, 9.0f)
                curveToRelative(4.0f, 0.0f, 7.25f, 3.24f, 7.25f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.75f, -5.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(5.0f, 12.74f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                curveToRelative(2.34f, 0.0f, 4.24f, 1.9f, 4.24f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.74f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _cast!!
    }

private var _cast: ImageVector? = null
