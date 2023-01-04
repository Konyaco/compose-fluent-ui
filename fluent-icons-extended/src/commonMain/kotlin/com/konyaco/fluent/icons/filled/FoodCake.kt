

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodCake: ImageVector
    get() {
        if (_foodCake != null) {
            return _foodCake!!
        }
        _foodCake = fluentIcon(name = "Filled.FoodCake") {
            fluentPath {
                moveTo(12.0f, 7.0f)
                curveToRelative(1.71f, 0.0f, 2.0f, -1.34f, 2.0f, -2.44f)
                curveToRelative(0.0f, -1.1f, -0.74f, -3.06f, -2.0f, -3.06f)
                reflectiveCurveToRelative(-2.0f, 1.95f, -2.0f, 3.06f)
                curveToRelative(0.0f, 1.1f, 0.29f, 2.44f, 2.0f, 2.44f)
                close()
                moveTo(3.5f, 10.25f)
                curveTo(3.5f, 9.01f, 4.5f, 8.0f, 5.75f, 8.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.88f)
                lineToRelative(-3.63f, 2.72f)
                curveToRelative(-0.4f, 0.3f, -0.95f, 0.33f, -1.39f, 0.08f)
                lineToRelative(-2.04f, -1.2f)
                curveToRelative(-0.9f, -0.53f, -2.0f, -0.5f, -2.88f, 0.06f)
                lineTo(8.8f, 13.92f)
                curveToRelative(-0.41f, 0.27f, -0.94f, 0.27f, -1.35f, 0.0f)
                lineTo(3.5f, 11.42f)
                verticalLineToRelative(-1.16f)
                close()
                moveTo(3.5f, 13.19f)
                verticalLineToRelative(5.31f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.75f)
                lineTo(20.5f, 13.0f)
                lineToRelative(-2.73f, 2.05f)
                curveToRelative(-0.9f, 0.67f, -2.1f, 0.73f, -3.05f, 0.17f)
                lineToRelative(-2.04f, -1.2f)
                curveToRelative(-0.4f, -0.24f, -0.91f, -0.23f, -1.3f, 0.03f)
                lineTo(9.6f, 15.18f)
                curveToRelative(-0.9f, 0.59f, -2.06f, 0.59f, -2.97f, 0.01f)
                lineToRelative(-3.14f, -2.0f)
                close()
            }
        }
        return _foodCake!!
    }

private var _foodCake: ImageVector? = null
