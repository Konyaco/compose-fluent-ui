

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ColorBackgroundAccent: ImageVector
    get() {
        if (_colorBackgroundAccent != null) {
            return _colorBackgroundAccent!!
        }
        _colorBackgroundAccent = fluentIcon(name = "Regular.ColorBackgroundAccent") {
            fluentPath {
                moveTo(3.0f, 17.5f)
                verticalLineToRelative(-4.09f)
                lineToRelative(1.49f, 1.49f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(1.37f, -1.37f)
                curveToRelative(-0.06f, 0.27f, -0.1f, 0.55f, -0.1f, 0.85f)
                curveToRelative(0.0f, 1.85f, 1.4f, 3.62f, 3.5f, 3.62f)
                reflectiveCurveToRelative(3.5f, -1.77f, 3.5f, -3.63f)
                curveToRelative(0.0f, -0.69f, -0.21f, -1.32f, -0.43f, -1.8f)
                curveToRelative(-0.23f, -0.49f, -0.51f, -0.93f, -0.77f, -1.3f)
                curveToRelative(-0.27f, -0.36f, -0.52f, -0.67f, -0.72f, -0.88f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.33f, -0.35f)
                lineToRelative(-0.01f, -0.02f)
                curveToRelative(-0.3f, -0.3f, -0.67f, -0.46f, -1.05f, -0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.72f, -3.1f)
                lineTo(11.56f, 5.0f)
                horizontalLineToRelative(7.94f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 17.5f)
                close()
            }
        }
        return _colorBackgroundAccent!!
    }

private var _colorBackgroundAccent: ImageVector? = null
