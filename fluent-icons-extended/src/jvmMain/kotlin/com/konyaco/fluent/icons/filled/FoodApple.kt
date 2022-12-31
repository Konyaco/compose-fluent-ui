

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FoodApple: ImageVector
    get() {
        if (_foodApple != null) {
            return _foodApple!!
        }
        _foodApple = fluentIcon(name = "Filled.FoodApple") {
            fluentPath {
                moveTo(5.47f, 3.42f)
                arcTo(5.18f, 5.18f, 0.0f, false, false, 6.9f, 7.3f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, false, -3.66f, 4.22f)
                curveToRelative(-0.33f, 2.35f, 0.15f, 4.75f, 1.37f, 6.8f)
                lineToRelative(0.35f, 0.58f)
                lineToRelative(0.04f, 0.07f)
                lineToRelative(1.42f, 1.9f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, 5.28f, 0.34f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.62f, 0.0f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, 5.28f, -0.34f)
                lineToRelative(1.42f, -1.9f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.04f, -0.07f)
                lineToRelative(0.35f, -0.59f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, false, 1.37f, -6.8f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, false, -6.1f, -4.3f)
                lineToRelative(-1.9f, 0.4f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 0.39f, -2.34f)
                curveToRelative(0.29f, -0.87f, 0.7f, -1.4f, 1.14f, -1.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.58f, -1.38f)
                curveToRelative(-1.05f, 0.44f, -1.65f, 1.48f, -1.98f, 2.48f)
                lineToRelative(-0.05f, 0.15f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, false, -4.92f, -2.8f)
                curveToRelative(-0.7f, 0.04f, -1.25f, 0.59f, -1.29f, 1.28f)
                close()
                moveTo(8.4f, 11.23f)
                curveToRelative(-0.35f, 0.07f, -0.67f, 0.32f, -0.87f, 0.78f)
                curveToRelative(-0.2f, 0.48f, -0.27f, 1.18f, -0.05f, 2.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.46f, 0.36f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, true, 0.13f, -3.0f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 8.1f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.3f, 1.47f)
                close()
            }
        }
        return _foodApple!!
    }

private var _foodApple: ImageVector? = null
