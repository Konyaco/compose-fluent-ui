

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = fluentIcon(name = "Regular.Box") {
            fluentPath {
                moveTo(10.6f, 2.51f)
                curveToRelative(0.9f, -0.36f, 1.9f, -0.36f, 2.8f, 0.0f)
                lineToRelative(7.5f, 3.04f)
                curveToRelative(0.67f, 0.27f, 1.1f, 0.91f, 1.1f, 1.62f)
                verticalLineToRelative(9.66f)
                curveToRelative(0.0f, 0.71f, -0.43f, 1.35f, -1.1f, 1.62f)
                lineToRelative(-7.5f, 3.04f)
                curveToRelative(-0.9f, 0.37f, -1.9f, 0.37f, -2.8f, 0.0f)
                lineToRelative(-7.5f, -3.04f)
                curveToRelative(-0.67f, -0.27f, -1.1f, -0.91f, -1.1f, -1.62f)
                lineTo(2.0f, 7.17f)
                curveToRelative(0.0f, -0.7f, 0.43f, -1.35f, 1.1f, -1.62f)
                lineToRelative(7.5f, -3.04f)
                close()
                moveTo(12.85f, 3.91f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -1.7f, 0.0f)
                lineToRelative(-1.9f, 0.77f)
                lineToRelative(7.52f, 2.93f)
                lineToRelative(2.67f, -1.03f)
                lineToRelative(-6.6f, -2.68f)
                close()
                moveTo(14.69f, 8.41f)
                lineTo(7.21f, 5.5f)
                lineTo(4.6f, 6.56f)
                lineTo(12.0f, 9.45f)
                lineToRelative(2.7f, -1.04f)
                close()
                moveTo(3.5f, 16.83f)
                curveToRelative(0.0f, 0.1f, 0.06f, 0.2f, 0.16f, 0.23f)
                lineToRelative(7.5f, 3.04f)
                lineToRelative(0.09f, 0.04f)
                verticalLineToRelative(-9.38f)
                lineTo(3.5f, 7.75f)
                verticalLineToRelative(9.08f)
                close()
                moveTo(12.85f, 20.1f)
                lineToRelative(7.5f, -3.04f)
                curveToRelative(0.09f, -0.04f, 0.15f, -0.13f, 0.15f, -0.23f)
                lineTo(20.5f, 7.77f)
                lineToRelative(-7.75f, 3.0f)
                verticalLineToRelative(9.37f)
                lineToRelative(0.1f, -0.04f)
                close()
            }
        }
        return _box!!
    }

private var _box: ImageVector? = null
