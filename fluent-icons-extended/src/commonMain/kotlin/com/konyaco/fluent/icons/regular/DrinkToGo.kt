

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrinkToGo: ImageVector
    get() {
        if (_drinkToGo != null) {
            return _drinkToGo!!
        }
        _drinkToGo = fluentIcon(name = "Regular.DrinkToGo") {
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
                lineTo(5.0f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -1.0f)
                lineTo(5.53f, 5.0f)
                curveToRelative(0.11f, -0.3f, 0.4f, -0.5f, 0.71f, -0.5f)
                horizontalLineToRelative(7.19f)
                lineToRelative(2.28f, -2.28f)
                close()
                moveTo(16.44f, 9.5f)
                lineTo(7.56f, 9.5f)
                lineToRelative(1.56f, 9.84f)
                curveToRelative(0.1f, 0.7f, 0.69f, 1.16f, 1.48f, 1.16f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.8f, 0.0f, 1.38f, -0.47f, 1.49f, -1.17f)
                lineToRelative(1.55f, -9.83f)
                close()
                moveTo(17.22f, 6.0f)
                lineTo(6.78f, 6.0f)
                lineToRelative(-0.72f, 2.0f)
                horizontalLineToRelative(11.88f)
                lineToRelative(-0.72f, -2.0f)
                close()
            }
        }
        return _drinkToGo!!
    }

private var _drinkToGo: ImageVector? = null
