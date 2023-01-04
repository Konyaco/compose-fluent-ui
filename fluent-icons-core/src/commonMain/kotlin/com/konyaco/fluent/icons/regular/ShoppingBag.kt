

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = fluentIcon(name = "Regular.ShoppingBag") {
            fluentPath {
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.0f, -2.24f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineTo(8.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(4.0f, 8.5f)
                curveTo(4.0f, 7.67f, 4.67f, 7.0f, 5.5f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(13.63f, 20.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -0.62f, -2.0f)
                verticalLineToRelative(-10.0f)
                lineTo(5.5f, 8.5f)
                lineTo(5.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 20.5f)
                horizontalLineToRelative(5.63f)
                close()
                moveTo(11.5f, 7.0f)
                lineTo(11.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(2.5f)
                lineTo(15.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.66f, -0.96f)
                curveToRelative(0.1f, 0.3f, 0.16f, 0.63f, 0.16f, 0.96f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.51f, 18.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.99f, 0.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
