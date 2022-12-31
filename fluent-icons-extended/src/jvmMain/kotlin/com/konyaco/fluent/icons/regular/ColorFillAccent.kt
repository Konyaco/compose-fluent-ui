

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ColorFillAccent: ImageVector
    get() {
        if (_colorFillAccent != null) {
            return _colorFillAccent!!
        }
        _colorFillAccent = fluentIcon(name = "Regular.ColorFillAccent") {
            fluentPath {
                moveTo(13.05f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.45f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.44f, -2.94f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 16.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.05f, 0.0f)
                horizontalLineToRelative(1.41f)
                close()
            }
        }
        return _colorFillAccent!!
    }

private var _colorFillAccent: ImageVector? = null
