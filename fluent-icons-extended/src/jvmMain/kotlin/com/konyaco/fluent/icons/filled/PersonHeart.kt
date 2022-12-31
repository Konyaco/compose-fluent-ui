

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonHeart: ImageVector
    get() {
        if (_personHeart != null) {
            return _personHeart!!
        }
        _personHeart = fluentIcon(name = "Filled.PersonHeart") {
            fluentPath {
                moveTo(11.4f, 19.07f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, -0.88f, -5.07f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(4.06f, 20.92f, 6.58f, 22.0f, 10.0f, 22.0f)
                curveToRelative(1.41f, 0.0f, 2.67f, -0.18f, 3.77f, -0.55f)
                lineToRelative(-2.37f, -2.38f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(17.04f, 23.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -0.22f)
                lineToRelative(-4.4f, -4.41f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 4.9f, -4.9f)
                lineToRelative(0.03f, 0.03f)
                lineToRelative(0.04f, -0.04f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 4.9f, 4.9f)
                lineToRelative(-4.4f, 4.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.22f)
                close()
            }
        }
        return _personHeart!!
    }

private var _personHeart: ImageVector? = null
