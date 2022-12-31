

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrinkToGo: ImageVector
    get() {
        if (_drinkToGo != null) {
            return _drinkToGo!!
        }
        _drinkToGo = fluentIcon(name = "Filled.DrinkToGo") {
            fluentPath {
                moveTo(15.72f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                lineTo(15.56f, 4.5f)
                horizontalLineToRelative(2.2f)
                curveToRelative(0.3f, 0.0f, 0.59f, 0.2f, 0.7f, 0.5f)
                lineToRelative(1.25f, 3.5f)
                curveToRelative(0.17f, 0.49f, -0.2f, 1.0f, -0.7f, 1.0f)
                horizontalLineToRelative(-1.05f)
                lineToRelative(-1.6f, 10.05f)
                arcTo(2.89f, 2.89f, 0.0f, false, true, 13.4f, 22.0f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-1.5f, 0.0f, -2.76f, -0.99f, -2.97f, -2.44f)
                lineTo(6.05f, 9.5f)
                horizontalLineTo(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -1.0f)
                lineTo(5.53f, 5.0f)
                curveToRelative(0.11f, -0.3f, 0.4f, -0.5f, 0.71f, -0.5f)
                horizontalLineToRelative(7.19f)
                lineToRelative(2.28f, -2.28f)
                close()
                moveTo(17.22f, 6.0f)
                horizontalLineTo(6.78f)
                lineToRelative(-0.72f, 2.0f)
                horizontalLineToRelative(11.88f)
                lineToRelative(-0.72f, -2.0f)
                close()
            }
        }
        return _drinkToGo!!
    }

private var _drinkToGo: ImageVector? = null
