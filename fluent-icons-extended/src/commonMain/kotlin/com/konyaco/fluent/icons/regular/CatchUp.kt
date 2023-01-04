

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CatchUp: ImageVector
    get() {
        if (_catchUp != null) {
            return _catchUp!!
        }
        _catchUp = fluentIcon(name = "Regular.CatchUp") {
            fluentPath {
                moveTo(9.28f, 8.16f)
                curveToRelative(0.08f, -0.2f, 0.37f, -0.21f, 0.46f, 0.0f)
                lineToRelative(3.24f, 7.76f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.17f, 0.12f)
                lineToRelative(1.6f, -3.13f)
                curveToRelative(0.13f, -0.25f, 0.39f, -0.41f, 0.67f, -0.41f)
                horizontalLineToRelative(0.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.2f, -1.5f)
                horizontalLineToRelative(-0.84f)
                curveToRelative(-0.85f, 0.0f, -1.62f, 0.47f, -2.0f, 1.23f)
                lineToRelative(-1.6f, 3.13f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.46f, -0.01f)
                lineToRelative(-3.24f, -7.77f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -3.23f, 0.01f)
                lineToRelative(-1.2f, 2.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.47f)
                horizontalLineTo(4.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.2f, 1.5f)
                horizontalLineTo(6.0f)
                curveToRelative(0.92f, 0.0f, 1.74f, -0.55f, 2.09f, -1.4f)
                lineToRelative(1.2f, -2.94f)
                close()
            }
        }
        return _catchUp!!
    }

private var _catchUp: ImageVector? = null
