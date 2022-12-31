

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FoodEgg: ImageVector
    get() {
        if (_foodEgg != null) {
            return _foodEgg!!
        }
        _foodEgg = fluentIcon(name = "Regular.FoodEgg") {
            fluentPath {
                moveTo(11.5f, 12.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                curveTo(11.01f, 10.0f, 10.0f, 11.0f, 10.0f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(7.0f, 12.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                close()
                moveTo(12.5f, 8.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(6.21f, 6.5f)
                arcTo(8.38f, 8.38f, 0.0f, false, true, 13.5f, 2.0f)
                curveToRelative(4.76f, 0.0f, 8.5f, 4.22f, 8.5f, 9.28f)
                curveToRelative(0.0f, 0.56f, -0.05f, 1.12f, -0.14f, 1.66f)
                curveToRelative(-0.05f, 0.34f, -0.04f, 0.7f, 0.03f, 1.08f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, -9.62f, 7.3f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.57f, -0.4f)
                curveToRelative(-0.3f, 0.06f, -0.63f, 0.08f, -0.95f, 0.08f)
                curveTo(4.97f, 21.0f, 2.0f, 17.7f, 2.0f, 13.75f)
                arcToRelative(7.38f, 7.38f, 0.0f, false, true, 3.16f, -6.14f)
                curveToRelative(0.45f, -0.3f, 0.81f, -0.68f, 1.05f, -1.12f)
                close()
                moveTo(13.5f, 3.5f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, false, -5.97f, 3.72f)
                arcTo(4.8f, 4.8f, 0.0f, false, true, 6.0f, 8.85f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, -2.5f, 4.9f)
                curveToRelative(0.0f, 3.23f, 2.4f, 5.75f, 5.25f, 5.75f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.02f, 0.73f, -0.05f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 3.45f, 0.51f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 7.48f, -5.67f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, true, -0.03f, -1.6f)
                curveToRelative(0.08f, -0.46f, 0.12f, -0.93f, 0.12f, -1.41f)
                curveToRelative(0.0f, -4.37f, -3.2f, -7.78f, -7.0f, -7.78f)
                close()
            }
        }
        return _foodEgg!!
    }

private var _foodEgg: ImageVector? = null
