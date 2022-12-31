

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodCarrot: ImageVector
    get() {
        if (_foodCarrot != null) {
            return _foodCarrot!!
        }
        _foodCarrot = fluentIcon(name = "Filled.FoodCarrot") {
            fluentPath {
                moveTo(17.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.01f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, -6.3f, 1.22f)
                lineToRelative(-7.35f, 10.8f)
                curveToRelative(-0.55f, 0.82f, -0.45f, 1.92f, 0.26f, 2.61f)
                curveToRelative(0.71f, 0.71f, 1.84f, 0.8f, 2.67f, 0.23f)
                lineToRelative(10.78f, -7.46f)
                arcTo(4.45f, 4.45f, 0.0f, false, false, 17.24f, 8.0f)
                horizontalLineToRelative(4.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(17.5f, 5.44f)
                verticalLineTo(2.75f)
                close()
            }
        }
        return _foodCarrot!!
    }

private var _foodCarrot: ImageVector? = null
