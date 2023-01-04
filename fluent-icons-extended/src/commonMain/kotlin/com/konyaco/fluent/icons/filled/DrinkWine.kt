

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrinkWine: ImageVector
    get() {
        if (_drinkWine != null) {
            return _drinkWine!!
        }
        _drinkWine = fluentIcon(name = "Filled.DrinkWine") {
            fluentPath {
                moveTo(6.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 5.0f, 5.7f)
                verticalLineToRelative(5.06f)
                lineToRelative(-2.25f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineToRelative(3.0f, 0.01f)
                lineToRelative(3.5f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(12.5f, 20.5f)
                verticalLineToRelative(-5.04f)
                curveToRelative(3.1f, -0.38f, 5.5f, -3.01f, 5.5f, -6.21f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(6.75f, 2.0f)
                close()
                moveTo(7.5f, 7.0f)
                lineTo(7.5f, 3.5f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 7.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(15.68f, 9.7f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, -2.91f, 2.97f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.2f, -0.98f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, 2.13f, -2.17f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.98f, 0.19f)
                close()
            }
        }
        return _drinkWine!!
    }

private var _drinkWine: ImageVector? = null
