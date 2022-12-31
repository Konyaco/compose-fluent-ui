

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonMail: ImageVector
    get() {
        if (_personMail != null) {
            return _personMail!!
        }
        _personMail = fluentIcon(name = "Filled.PersonMail") {
            fluentPath {
                moveTo(11.0f, 15.5f)
                curveToRelative(0.0f, -0.56f, 0.19f, -1.08f, 0.5f, -1.5f)
                lineTo(5.25f, 14.0f)
                curveTo(4.01f, 14.0f, 3.0f, 15.0f, 3.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(5.06f, 20.92f, 7.58f, 22.0f, 11.0f, 22.0f)
                horizontalLineToRelative(0.05f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -0.05f, -0.5f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(17.51f, 18.93f)
                lineToRelative(-5.5f, -3.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.73f)
                lineTo(21.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.97f)
                lineToRelative(-5.49f, 2.96f)
                close()
                moveTo(17.74f, 19.94f)
                lineTo(23.0f, 17.11f)
                lineTo(23.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.13f)
                lineToRelative(5.25f, 3.06f)
                curveToRelative(0.15f, 0.09f, 0.33f, 0.1f, 0.49f, 0.01f)
                close()
            }
        }
        return _personMail!!
    }

private var _personMail: ImageVector? = null
