

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonAvailable: ImageVector
    get() {
        if (_personAvailable != null) {
            return _personAvailable!!
        }
        _personAvailable = fluentIcon(name = "Filled.PersonAvailable") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(12.02f, 14.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.57f, 7.76f)
                curveToRelative(-0.8f, 0.16f, -1.66f, 0.24f, -2.59f, 0.24f)
                curveToRelative(-3.42f, 0.0f, -5.94f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.5f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.0f, 3.0f, 14.0f, 4.24f, 14.0f)
                horizontalLineToRelative(7.77f)
                close()
                moveTo(14.85f, 17.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, -0.7f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _personAvailable!!
    }

private var _personAvailable: ImageVector? = null
