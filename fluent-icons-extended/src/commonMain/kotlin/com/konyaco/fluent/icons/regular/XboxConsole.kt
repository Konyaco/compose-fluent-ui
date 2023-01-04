

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.XboxConsole: ImageVector
    get() {
        if (_xboxConsole != null) {
            return _xboxConsole!!
        }
        _xboxConsole = fluentIcon(name = "Regular.XboxConsole") {
            fluentPath {
                moveTo(9.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(5.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(5.75f)
                close()
                moveTo(9.5f, 20.5f)
                verticalLineToRelative(-8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(8.75f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        return _xboxConsole!!
    }

private var _xboxConsole: ImageVector? = null
