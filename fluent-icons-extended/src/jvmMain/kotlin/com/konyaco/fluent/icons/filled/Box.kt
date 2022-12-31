

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = fluentIcon(name = "Filled.Box") {
            fluentPath {
                moveTo(13.4f, 2.51f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -2.8f, 0.0f)
                lineToRelative(-2.2f, 0.9f)
                lineTo(18.0f, 7.12f)
                lineToRelative(3.37f, -1.3f)
                curveToRelative(-0.14f, -0.12f, -0.3f, -0.2f, -0.46f, -0.28f)
                lineToRelative(-7.5f, -3.04f)
                close()
                moveTo(22.0f, 7.2f)
                lineToRelative(-9.25f, 3.58f)
                verticalLineToRelative(10.92f)
                curveToRelative(0.22f, -0.05f, 0.44f, -0.11f, 0.66f, -0.2f)
                lineToRelative(7.5f, -3.04f)
                curveToRelative(0.66f, -0.27f, 1.09f, -0.91f, 1.09f, -1.62f)
                verticalLineTo(7.19f)
                close()
                moveTo(11.25f, 21.7f)
                verticalLineTo(10.77f)
                lineTo(2.0f, 7.19f)
                verticalLineToRelative(9.64f)
                curveToRelative(0.0f, 0.71f, 0.43f, 1.35f, 1.1f, 1.62f)
                lineToRelative(7.5f, 3.04f)
                curveToRelative(0.2f, 0.09f, 0.43f, 0.15f, 0.65f, 0.2f)
                close()
                moveTo(2.63f, 5.83f)
                lineTo(12.0f, 9.45f)
                lineToRelative(3.92f, -1.52f)
                lineToRelative(-9.55f, -3.7f)
                lineTo(3.1f, 5.54f)
                curveToRelative(-0.17f, 0.07f, -0.32f, 0.16f, -0.46f, 0.28f)
                close()
            }
        }
        return _box!!
    }

private var _box: ImageVector? = null
