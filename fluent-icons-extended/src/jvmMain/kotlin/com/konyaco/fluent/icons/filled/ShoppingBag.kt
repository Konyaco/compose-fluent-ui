

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = fluentIcon(name = "Filled.ShoppingBag") {
            fluentPath {
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.0f, -2.24f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(20.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.82f, 3.36f)
                lineToRelative(-0.55f, -0.1f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, true, -2.17f, -1.17f)
                curveToRelative(-0.6f, -0.61f, -0.96f, -1.35f, -0.96f, -2.09f)
                lineTo(14.5f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.66f, -0.96f)
                curveToRelative(0.1f, 0.3f, 0.16f, 0.63f, 0.16f, 0.96f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.23f, 0.58f, 2.33f, 1.39f, 3.14f)
                curveToRelative(0.32f, 0.33f, 0.68f, 0.62f, 1.08f, 0.86f)
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
            }
        }
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
