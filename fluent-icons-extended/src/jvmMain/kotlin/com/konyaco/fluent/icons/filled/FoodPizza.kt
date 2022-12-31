

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodPizza: ImageVector
    get() {
        if (_foodPizza != null) {
            return _foodPizza!!
        }
        _foodPizza = fluentIcon(name = "Filled.FoodPizza") {
            fluentPath {
                moveTo(5.0f, 4.66f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.82f, -2.64f)
                arcToRelative(20.78f, 20.78f, 0.0f, false, true, 13.45f, 6.82f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.48f, 3.85f)
                lineToRelative(-0.43f, 0.3f)
                lineToRelative(-0.36f, -0.53f)
                verticalLineToRelative(-0.02f)
                arcTo(17.55f, 17.55f, 0.0f, false, false, 5.74f, 5.17f)
                lineTo(5.0f, 5.17f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(18.77f, 13.31f)
                lineToRelative(0.38f, 0.57f)
                lineToRelative(-3.95f, 2.86f)
                lineToRelative(-0.2f, 0.15f)
                lineTo(15.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.06f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.1f)
                lineToRelative(-1.43f, 1.04f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 5.0f, 19.81f)
                lineTo(5.0f, 6.67f)
                horizontalLineToRelative(0.75f)
                curveToRelative(5.36f, 0.0f, 10.1f, 2.62f, 13.02f, 6.64f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _foodPizza!!
    }

private var _foodPizza: ImageVector? = null
