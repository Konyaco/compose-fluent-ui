

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShoppingBagPause: ImageVector
    get() {
        if (_shoppingBagPause != null) {
            return _shoppingBagPause!!
        }
        _shoppingBagPause = fluentIcon(name = "Filled.ShoppingBagPause") {
            fluentPath {
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.0f, -2.24f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -5.5f, 0.23f)
                lineTo(14.5f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.66f, -0.96f)
                curveToRelative(0.1f, 0.3f, 0.16f, 0.63f, 0.16f, 0.96f)
                verticalLineToRelative(7.81f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -0.19f, 9.19f)
                lineTo(8.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(4.0f, 8.5f)
                curveTo(4.0f, 7.67f, 4.67f, 7.0f, 5.5f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.5f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(19.5f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _shoppingBagPause!!
    }

private var _shoppingBagPause: ImageVector? = null
