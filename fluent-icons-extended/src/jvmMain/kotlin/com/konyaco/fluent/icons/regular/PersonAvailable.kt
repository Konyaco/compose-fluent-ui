

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonAvailable: ImageVector
    get() {
        if (_personAvailable != null) {
            return _personAvailable!!
        }
        _personAvailable = fluentIcon(name = "Regular.PersonAvailable") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
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
                moveTo(12.02f, 14.0f)
                curveToRelative(-0.3f, 0.46f, -0.53f, 0.97f, -0.7f, 1.5f)
                lineTo(4.24f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.53f, 0.2f, 1.05f, 0.54f, 1.46f)
                curveTo(5.3f, 19.76f, 7.26f, 20.5f, 10.0f, 20.5f)
                curveToRelative(0.6f, 0.0f, 1.16f, -0.03f, 1.68f, -0.1f)
                curveToRelative(0.25f, 0.49f, 0.55f, 0.95f, 0.91f, 1.36f)
                curveToRelative(-0.8f, 0.16f, -1.66f, 0.24f, -2.59f, 0.24f)
                curveToRelative(-3.15f, 0.0f, -5.53f, -0.9f, -7.1f, -2.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.9f, -2.43f)
                verticalLineToRelative(-0.58f)
                curveTo(2.0f, 15.0f, 3.01f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(7.77f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
            }
        }
        return _personAvailable!!
    }

private var _personAvailable: ImageVector? = null
