

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonHeart: ImageVector
    get() {
        if (_personHeart != null) {
            return _personHeart!!
        }
        _personHeart = fluentIcon(name = "Regular.PersonHeart") {
            fluentPath {
                moveTo(10.1f, 15.5f)
                curveToRelative(0.06f, -0.52f, 0.2f, -1.02f, 0.42f, -1.5f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(4.47f, 21.1f, 6.85f, 22.0f, 10.0f, 22.0f)
                curveToRelative(1.41f, 0.0f, 2.67f, -0.18f, 3.77f, -0.55f)
                lineToRelative(-1.21f, -1.21f)
                curveToRelative(-0.76f, 0.17f, -1.62f, 0.26f, -2.56f, 0.26f)
                curveToRelative(-2.74f, 0.0f, -4.7f, -0.75f, -5.96f, -2.21f)
                curveToRelative(-0.34f, -0.41f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.86f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(17.04f, 23.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -0.22f)
                lineToRelative(-4.4f, -4.41f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 4.9f, -4.9f)
                lineToRelative(0.03f, 0.03f)
                lineToRelative(0.04f, -0.03f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 4.9f, 4.9f)
                lineToRelative(-4.4f, 4.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.23f)
                close()
            }
        }
        return _personHeart!!
    }

private var _personHeart: ImageVector? = null
