

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FoodToast: ImageVector
    get() {
        if (_foodToast != null) {
            return _foodToast!!
        }
        _foodToast = fluentIcon(name = "Regular.FoodToast") {
            fluentPath {
                moveTo(8.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(9.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(2.0f, 7.75f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 6.75f, 3.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 3.5f, 7.96f)
                verticalLineToRelative(7.79f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-7.79f)
                arcTo(4.74f, 4.74f, 0.0f, false, true, 2.0f, 7.75f)
                close()
                moveTo(6.75f, 4.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -2.23f, 5.61f)
                curveToRelative(0.15f, 0.14f, 0.23f, 0.34f, 0.23f, 0.54f)
                verticalLineToRelative(8.1f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-7.7f)
                curveToRelative(0.0f, -0.24f, 0.12f, -0.47f, 0.33f, -0.61f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.83f, -5.94f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(19.5f, 7.75f)
                curveToRelative(0.0f, 1.49f, -0.68f, 2.81f, -1.75f, 3.68f)
                verticalLineToRelative(7.32f)
                curveToRelative(0.0f, 0.26f, -0.05f, 0.52f, -0.13f, 0.75f)
                horizontalLineToRelative(0.88f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-8.1f)
                curveToRelative(0.0f, -0.2f, 0.08f, -0.4f, 0.23f, -0.54f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -1.08f, -5.4f)
                curveToRelative(0.69f, 0.82f, 1.1f, 1.88f, 1.1f, 3.04f)
                close()
            }
        }
        return _foodToast!!
    }

private var _foodToast: ImageVector? = null
