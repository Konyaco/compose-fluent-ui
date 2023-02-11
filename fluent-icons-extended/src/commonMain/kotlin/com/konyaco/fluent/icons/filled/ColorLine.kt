

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ColorLine: ImageVector
    get() {
        if (_colorLine != null) {
            return _colorLine!!
        }
        _colorLine = fluentIcon(name = "Filled.ColorLine") {
            fluentPath {
                moveTo(4.38f, 14.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-6.45f)
                lineToRelative(-1.32f, 1.31f)
                curveToRelative(-0.38f, 0.38f, -0.85f, 0.66f, -1.36f, 0.82f)
                lineToRelative(-4.3f, 1.29f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.47f, -2.53f)
                lineToRelative(0.28f, -0.89f)
                close()
                moveTo(18.65f, 2.94f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 0.0f, 4.56f)
                lineToRelative(-7.13f, 7.1f)
                curveToRelative(-0.26f, 0.27f, -0.58f, 0.46f, -0.94f, 0.57f)
                lineToRelative(-4.3f, 1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.23f, -1.27f)
                lineToRelative(1.36f, -4.22f)
                curveToRelative(0.1f, -0.35f, 0.3f, -0.65f, 0.55f, -0.9f)
                lineToRelative(7.13f, -7.13f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 4.56f, 0.0f)
                close()
            }
        }
        return _colorLine!!
    }

private var _colorLine: ImageVector? = null
