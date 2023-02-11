

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodEgg: ImageVector
    get() {
        if (_foodEgg != null) {
            return _foodEgg!!
        }
        _foodEgg = fluentIcon(name = "Filled.FoodEgg") {
            fluentPath {
                moveTo(11.5f, 12.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                curveTo(11.01f, 10.0f, 10.0f, 11.0f, 10.0f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(13.5f, 2.0f)
                arcToRelative(8.38f, 8.38f, 0.0f, false, false, -7.29f, 4.5f)
                curveToRelative(-0.24f, 0.43f, -0.6f, 0.8f, -1.05f, 1.1f)
                arcTo(7.38f, 7.38f, 0.0f, false, false, 2.0f, 13.76f)
                curveTo(2.0f, 17.7f, 4.97f, 21.0f, 8.75f, 21.0f)
                curveToRelative(0.32f, 0.0f, 0.64f, -0.02f, 0.95f, -0.07f)
                curveToRelative(0.87f, -0.13f, 1.8f, 0.0f, 2.57f, 0.38f)
                arcTo(6.75f, 6.75f, 0.0f, false, false, 21.9f, 14.0f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, true, -0.03f, -1.07f)
                curveToRelative(0.1f, -0.54f, 0.14f, -1.1f, 0.14f, -1.66f)
                curveTo(22.0f, 6.22f, 18.26f, 2.0f, 13.5f, 2.0f)
                close()
                moveTo(17.25f, 12.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, -9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 9.5f, 0.0f)
                close()
            }
        }
        return _foodEgg!!
    }

private var _foodEgg: ImageVector? = null
