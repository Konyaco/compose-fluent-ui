

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowMaximize: ImageVector
    get() {
        if (_arrowMaximize != null) {
            return _arrowMaximize!!
        }
        _arrowMaximize = fluentIcon(name = "Regular.ArrowMaximize") {
            fluentPath {
                moveTo(12.75f, 3.0f)
                horizontalLineToRelative(7.55f)
                lineToRelative(0.1f, 0.02f)
                lineToRelative(0.1f, 0.02f)
                lineToRelative(0.06f, 0.03f)
                curveToRelative(0.08f, 0.03f, 0.15f, 0.09f, 0.22f, 0.15f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(0.06f, 0.09f)
                lineToRelative(0.04f, 0.06f)
                lineToRelative(0.04f, 0.1f)
                lineToRelative(0.02f, 0.06f)
                lineToRelative(0.01f, 0.06f)
                verticalLineToRelative(0.1f)
                lineToRelative(0.01f, 7.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-5.8f)
                lineTo(5.56f, 19.5f)
                horizontalLineToRelative(5.69f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.29f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                curveToRelative(0.0f, 0.39f, -0.28f, 0.7f, -0.65f, 0.75f)
                horizontalLineTo(3.68f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.18f, -0.04f)
                lineToRelative(-0.1f, -0.04f)
                horizontalLineTo(3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.38f, -0.56f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.11f)
                verticalLineToRelative(5.8f)
                lineTo(18.44f, 4.5f)
                horizontalLineToRelative(-5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        return _arrowMaximize!!
    }

private var _arrowMaximize: ImageVector? = null
