

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrinkBeer: ImageVector
    get() {
        if (_drinkBeer != null) {
            return _drinkBeer!!
        }
        _drinkBeer = fluentIcon(name = "Filled.DrinkBeer") {
            fluentPath {
                moveTo(7.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.0f, 5.25f)
                verticalLineToRelative(14.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(17.5f, 18.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-5.5f)
                curveTo(22.0f, 7.45f, 20.54f, 6.0f, 18.75f, 6.0f)
                lineTo(17.5f, 6.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(18.75f, 16.5f)
                lineTo(17.5f, 16.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                close()
                moveTo(16.0f, 6.0f)
                lineTo(5.5f, 6.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(16.0f, 6.0f)
                close()
                moveTo(8.5f, 10.0f)
                verticalLineToRelative(7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 17.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(11.5f, 10.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(14.5f, 10.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
            }
        }
        return _drinkBeer!!
    }

private var _drinkBeer: ImageVector? = null
