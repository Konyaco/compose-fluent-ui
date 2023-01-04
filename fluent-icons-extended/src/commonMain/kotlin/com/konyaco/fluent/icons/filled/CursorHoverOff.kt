

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CursorHoverOff: ImageVector
    get() {
        if (_cursorHoverOff != null) {
            return _cursorHoverOff!!
        }
        _cursorHoverOff = fluentIcon(name = "Filled.CursorHoverOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.05f, 1.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 6.5f)
                verticalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-7.25f)
                curveToRelative(0.0f, -0.2f, 0.04f, -0.4f, 0.1f, -0.59f)
                lineToRelative(0.9f, 0.9f)
                verticalLineToRelative(10.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.42f)
                lineToRelative(2.46f, -3.58f)
                lineToRelative(4.05f, 0.85f)
                lineToRelative(2.84f, 2.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(7.18f, 4.0f)
                lineToRelative(13.63f, 13.63f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 15.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 4.0f)
                horizontalLineTo(7.18f)
                close()
            }
        }
        return _cursorHoverOff!!
    }

private var _cursorHoverOff: ImageVector? = null
