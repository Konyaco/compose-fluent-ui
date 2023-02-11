

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonMail: ImageVector
    get() {
        if (_personMail != null) {
            return _personMail!!
        }
        _personMail = fluentIcon(name = "Regular.PersonMail") {
            fluentPath {
                moveTo(11.0f, 15.5f)
                curveToRelative(0.0f, -0.56f, 0.19f, -1.08f, 0.5f, -1.5f)
                lineTo(5.25f, 14.0f)
                curveTo(4.01f, 14.0f, 3.0f, 15.0f, 3.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(5.47f, 21.1f, 7.85f, 22.0f, 11.0f, 22.0f)
                horizontalLineToRelative(0.05f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -0.05f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-2.74f, 0.0f, -4.7f, -0.74f, -5.96f, -2.21f)
                curveToRelative(-0.34f, -0.4f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(11.0f, 15.5f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(11.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
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
