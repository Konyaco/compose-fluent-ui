

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShoppingBagDismiss: ImageVector
    get() {
        if (_shoppingBagDismiss != null) {
            return _shoppingBagDismiss!!
        }
        _shoppingBagDismiss = fluentIcon(name = "Filled.ShoppingBagDismiss") {
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
                moveTo(15.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-1.64f, -1.65f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-1.65f, 1.64f)
                lineToRelative(-1.65f, -1.64f)
                close()
            }
        }
        return _shoppingBagDismiss!!
    }

private var _shoppingBagDismiss: ImageVector? = null
