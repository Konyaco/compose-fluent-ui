

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = fluentIcon(name = "Filled.Cube") {
            fluentPath {
                moveTo(13.4f, 2.51f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -2.8f, 0.0f)
                lineTo(3.1f, 5.55f)
                curveToRelative(-0.67f, 0.27f, -1.1f, 0.91f, -1.1f, 1.62f)
                verticalLineToRelative(9.66f)
                curveToRelative(0.0f, 0.7f, 0.43f, 1.35f, 1.1f, 1.62f)
                lineToRelative(7.5f, 3.04f)
                curveToRelative(0.9f, 0.36f, 1.9f, 0.36f, 2.8f, 0.0f)
                lineToRelative(7.5f, -3.04f)
                curveToRelative(0.67f, -0.27f, 1.1f, -0.91f, 1.1f, -1.62f)
                verticalLineTo(7.17f)
                curveToRelative(0.0f, -0.71f, -0.43f, -1.35f, -1.1f, -1.62f)
                lineToRelative(-7.5f, -3.04f)
                close()
                moveTo(6.06f, 7.98f)
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
            }
        }
        return _cube!!
    }

private var _cube: ImageVector? = null
