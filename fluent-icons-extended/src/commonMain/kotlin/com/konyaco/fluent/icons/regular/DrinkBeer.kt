

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrinkBeer: ImageVector
    get() {
        if (_drinkBeer != null) {
            return _drinkBeer!!
        }
        _drinkBeer = fluentIcon(name = "Regular.DrinkBeer") {
            fluentPath {
                moveTo(8.5f, 10.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 7.0f, 10.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.5f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(14.5f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.45f, 5.46f, 2.0f, 7.25f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                lineTo(17.5f, 6.0f)
                horizontalLineToRelative(1.25f)
                curveTo(20.55f, 6.0f, 22.0f, 7.46f, 22.0f, 9.25f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(17.5f, 18.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 5.25f)
                close()
                moveTo(16.0f, 7.5f)
                lineTo(5.5f, 7.5f)
                verticalLineToRelative(12.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(16.0f, 7.5f)
                close()
                moveTo(17.5f, 16.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(17.5f, 7.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.0f, 5.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(5.5f, 6.0f)
                lineTo(16.0f, 6.0f)
                verticalLineToRelative(-0.75f)
                close()
            }
        }
        return _drinkBeer!!
    }

private var _drinkBeer: ImageVector? = null
