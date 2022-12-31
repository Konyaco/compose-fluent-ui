

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = fluentIcon(name = "Regular.Cart") {
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
                moveTo(7.57f, 10.84f)
                lineToRelative(0.75f, 2.74f)
                curveToRelative(0.15f, 0.54f, 0.65f, 0.92f, 1.21f, 0.92f)
                horizontalLineToRelative(5.95f)
                curveToRelative(0.56f, 0.0f, 1.05f, -0.37f, 1.2f, -0.9f)
                lineToRelative(1.74f, -6.1f)
                lineTo(6.59f, 7.5f)
                lineToRelative(0.97f, 3.29f)
                lineToRelative(0.01f, 0.05f)
                close()
                moveTo(11.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(9.5f, 19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(16.5f, 19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
            }
        }
        return _cart!!
    }

private var _cart: ImageVector? = null
