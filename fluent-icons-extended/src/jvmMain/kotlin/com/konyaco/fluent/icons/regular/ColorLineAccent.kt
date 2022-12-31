

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ColorLineAccent: ImageVector
    get() {
        if (_colorLineAccent != null) {
            return _colorLineAccent!!
        }
        _colorLineAccent = fluentIcon(name = "Regular.ColorLineAccent") {
            fluentPath {
                moveTo(4.0f, 15.63f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.57f, 1.79f)
                lineToRelative(4.3f, -1.3f)
                curveToRelative(0.42f, -0.12f, 0.82f, -0.33f, 1.16f, -0.62f)
                horizontalLineToRelative(7.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.37f, 0.2f, -0.7f, 0.5f, -0.87f)
                close()
            }
        }
        return _colorLineAccent!!
    }

private var _colorLineAccent: ImageVector? = null
