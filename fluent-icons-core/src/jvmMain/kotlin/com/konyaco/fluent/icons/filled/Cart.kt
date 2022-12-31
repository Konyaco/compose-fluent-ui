

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = fluentIcon(name = "Filled.Cart") {
            fluentPath {
                moveTo(2.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.95f, 0.0f, 1.52f, 0.64f, 1.84f, 1.23f)
                curveToRelative(0.22f, 0.4f, 0.38f, 0.86f, 0.5f, 1.27f)
                horizontalLineToRelative(12.6f)
                curveToRelative(0.83f, 0.0f, 1.43f, 0.8f, 1.2f, 1.6f)
                lineTo(18.12f, 14.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.64f, 2.0f)
                lineTo(9.53f, 16.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.65f, -2.02f)
                lineToRelative(-0.76f, -2.78f)
                lineToRelative(-1.26f, -4.24f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-0.16f, -0.57f, -0.3f, -1.1f, -0.52f, -1.5f)
                curveTo(4.13f, 5.07f, 3.96f, 5.0f, 3.8f, 5.0f)
                horizontalLineToRelative(-0.56f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(16.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        return _cart!!
    }

private var _cart: ImageVector? = null
