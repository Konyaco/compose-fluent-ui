

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FoodCarrot: ImageVector
    get() {
        if (_foodCarrot != null) {
            return _foodCarrot!!
        }
        _foodCarrot = fluentIcon(name = "Regular.FoodCarrot") {
            fluentPath {
                moveTo(17.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.01f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, -6.3f, 1.22f)
                lineToRelative(-7.34f, 10.8f)
                curveToRelative(-0.56f, 0.82f, -0.45f, 1.92f, 0.25f, 2.61f)
                curveToRelative(0.71f, 0.71f, 1.84f, 0.8f, 2.67f, 0.23f)
                lineToRelative(10.79f, -7.46f)
                arcTo(4.45f, 4.45f, 0.0f, false, false, 17.24f, 8.0f)
                horizontalLineToRelative(4.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(17.5f, 5.44f)
                lineTo(17.5f, 2.75f)
                close()
                moveTo(10.96f, 8.81f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 4.65f, -0.44f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -0.4f, 4.56f)
                lineTo(4.4f, 20.4f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, -0.73f, -0.06f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.07f, -0.72f)
                lineToRelative(7.35f, -10.8f)
                close()
            }
        }
        return _foodCarrot!!
    }

private var _foodCarrot: ImageVector? = null
