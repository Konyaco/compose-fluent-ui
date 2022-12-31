

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrinkWine: ImageVector
    get() {
        if (_drinkWine != null) {
            return _drinkWine!!
        }
        _drinkWine = fluentIcon(name = "Regular.DrinkWine") {
            fluentPath {
                moveTo(15.93f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.47f, -0.28f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -1.95f, 1.98f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.31f, 1.47f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, 3.1f, -3.17f)
                close()
                moveTo(6.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 3.2f, -2.4f, 5.83f, -5.5f, 6.2f)
                verticalLineToRelative(5.06f)
                lineToRelative(2.75f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineToRelative(-3.5f, 0.01f)
                lineToRelative(-3.0f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(11.0f, 20.5f)
                verticalLineToRelative(-5.05f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.0f, -5.7f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(7.5f, 3.5f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 3.5f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(7.5f, 9.75f)
                curveTo(7.5f, 12.1f, 9.4f, 14.0f, 11.75f, 14.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 4.75f, -4.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        return _drinkWine!!
    }

private var _drinkWine: ImageVector? = null
