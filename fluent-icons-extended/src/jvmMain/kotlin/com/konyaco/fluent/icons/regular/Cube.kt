

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = fluentIcon(name = "Regular.Cube") {
            fluentPath {
                moveTo(6.05f, 7.98f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.97f, -0.43f)
                lineTo(12.0f, 9.44f)
                lineToRelative(4.98f, -1.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.54f, 1.41f)
                lineToRelative(-4.77f, 1.8f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                lineToRelative(-4.77f, -1.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.43f, -0.97f)
                close()
                moveTo(10.59f, 2.51f)
                curveToRelative(0.9f, -0.37f, 1.92f, -0.37f, 2.82f, 0.0f)
                lineToRelative(7.5f, 3.04f)
                curveToRelative(0.66f, 0.27f, 1.09f, 0.91f, 1.09f, 1.62f)
                verticalLineToRelative(9.66f)
                curveToRelative(0.0f, 0.7f, -0.43f, 1.35f, -1.1f, 1.62f)
                lineToRelative(-7.5f, 3.04f)
                curveToRelative(-0.9f, 0.36f, -1.9f, 0.36f, -2.8f, 0.0f)
                lineToRelative(-7.5f, -3.04f)
                curveToRelative(-0.67f, -0.27f, -1.1f, -0.91f, -1.1f, -1.62f)
                lineTo(2.0f, 7.17f)
                curveToRelative(0.0f, -0.71f, 0.43f, -1.35f, 1.1f, -1.62f)
                lineToRelative(7.5f, -3.04f)
                close()
                moveTo(12.85f, 3.91f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -1.7f, 0.0f)
                lineToRelative(-7.5f, 3.03f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.15f, 0.23f)
                verticalLineToRelative(9.66f)
                curveToRelative(0.0f, 0.1f, 0.06f, 0.19f, 0.16f, 0.23f)
                lineToRelative(7.5f, 3.04f)
                curveToRelative(0.54f, 0.22f, 1.14f, 0.22f, 1.69f, 0.0f)
                lineToRelative(7.5f, -3.04f)
                curveToRelative(0.09f, -0.04f, 0.15f, -0.13f, 0.15f, -0.23f)
                lineTo(20.5f, 7.17f)
                curveToRelative(0.0f, -0.1f, -0.06f, -0.2f, -0.16f, -0.23f)
                lineToRelative(-7.5f, -3.04f)
                close()
            }
        }
        return _cube!!
    }

private var _cube: ImageVector? = null
