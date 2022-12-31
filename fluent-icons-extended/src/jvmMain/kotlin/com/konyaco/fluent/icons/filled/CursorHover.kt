

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CursorHover: ImageVector
    get() {
        if (_cursorHover != null) {
            return _cursorHover!!
        }
        _cursorHover = fluentIcon(name = "Filled.CursorHover") {
            fluentPath {
                moveTo(4.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 6.5f)
                verticalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 18.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(-7.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.78f, -1.41f)
                lineToRelative(7.5f, 7.5f)
                curveToRelative(0.38f, 0.27f, 0.62f, 0.68f, 0.7f, 1.11f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 15.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 4.0f)
                horizontalLineToRelative(-15.0f)
                close()
                moveTo(11.28f, 10.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.28f, 0.53f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.42f)
                lineToRelative(2.46f, -3.58f)
                lineToRelative(4.27f, 0.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.68f, -1.27f)
                lineToRelative(-7.5f, -7.5f)
                close()
            }
        }
        return _cursorHover!!
    }

private var _cursorHover: ImageVector? = null
