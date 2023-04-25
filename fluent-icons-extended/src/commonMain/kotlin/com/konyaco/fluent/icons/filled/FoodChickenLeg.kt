

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodChickenLeg: ImageVector
    get() {
        if (_foodChickenLeg != null) {
            return _foodChickenLeg!!
        }
        _foodChickenLeg = fluentIcon(name = "Filled.FoodChickenLeg") {
            fluentPath {
                moveTo(22.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.9f, -1.1f)
                arcToRelative(15.12f, 15.12f, 0.0f, false, true, -1.36f, 3.3f)
                lineToRelative(-2.52f, 2.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.28f, 1.24f)
                lineTo(4.46f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.42f, 4.53f)
                curveToRelative(0.17f, 0.12f, 0.31f, 0.26f, 0.43f, 0.43f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 19.53f)
                lineToRelative(2.04f, -2.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.24f, 0.29f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(0.48f, -0.29f, 1.48f, -0.8f, 3.32f, -1.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 22.0f, 8.0f)
                close()
                moveTo(8.58f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.41f)
                lineToRelative(-3.12f, 3.12f)
                curveToRelative(-0.29f, 0.3f, -0.38f, 0.67f, -0.38f, 0.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.81f, 0.58f)
                curveToRelative(-0.21f, -0.3f, -0.48f, -0.55f, -0.77f, -0.77f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.58f, -1.81f)
                curveToRelative(0.3f, 0.0f, 0.67f, -0.09f, 0.96f, -0.38f)
                lineTo(8.58f, 14.0f)
                close()
            }
        }
        return _foodChickenLeg!!
    }

private var _foodChickenLeg: ImageVector? = null
