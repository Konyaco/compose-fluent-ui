

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrinkCoffee: ImageVector
    get() {
        if (_drinkCoffee != null) {
            return _drinkCoffee!!
        }
        _drinkCoffee = fluentIcon(name = "Regular.DrinkCoffee") {
            fluentPath {
                moveTo(3.94f, 5.0f)
                curveTo(2.87f, 5.0f, 2.0f, 5.87f, 2.0f, 6.94f)
                verticalLineTo(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.91f, 1.2f)
                horizontalLineToRelative(0.74f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, false, 0.0f, -6.7f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-0.2f, -0.86f, -0.97f, -1.5f, -1.9f, -1.5f)
                horizontalLineTo(3.96f)
                close()
                moveTo(3.5f, 6.94f)
                curveToRelative(0.0f, -0.24f, 0.2f, -0.44f, 0.44f, -0.44f)
                horizontalLineToRelative(12.12f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.2f, 0.44f, 0.44f)
                verticalLineTo(12.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
                verticalLineTo(6.94f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(0.65f)
                arcToRelative(1.85f, 1.85f, 0.0f, true, true, 0.0f, 3.7f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        return _drinkCoffee!!
    }

private var _drinkCoffee: ImageVector? = null
