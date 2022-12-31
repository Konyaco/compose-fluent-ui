

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonPill: ImageVector
    get() {
        if (_personPill != null) {
            return _personPill!!
        }
        _personPill = fluentIcon(name = "Regular.PersonPill") {
            fluentPath {
                moveTo(11.16f, 20.48f)
                curveToRelative(0.06f, 0.53f, 0.24f, 1.05f, 0.52f, 1.52f)
                curveToRelative(-2.99f, -0.06f, -5.26f, -0.97f, -6.78f, -2.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.9f, -2.43f)
                verticalLineToRelative(-0.58f)
                curveTo(4.0f, 15.0f, 5.01f, 14.0f, 6.25f, 14.0f)
                horizontalLineToRelative(9.28f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(6.25f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.53f, 0.2f, 1.05f, 0.54f, 1.46f)
                curveToRelative(1.12f, 1.3f, 2.81f, 2.04f, 5.12f, 2.19f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(22.03f, 12.97f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, -4.06f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 4.06f, 4.06f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.0f, -4.06f)
                close()
                moveTo(19.03f, 14.03f)
                arcToRelative(1.37f, 1.37f, 0.0f, true, true, 1.94f, 1.94f)
                lineTo(19.0f, 17.94f)
                lineTo(17.06f, 16.0f)
                lineToRelative(1.97f, -1.97f)
                close()
                moveTo(17.03f, 18.97f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _personPill!!
    }

private var _personPill: ImageVector? = null
