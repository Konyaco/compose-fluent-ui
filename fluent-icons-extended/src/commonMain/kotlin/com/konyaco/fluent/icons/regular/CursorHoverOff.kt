

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CursorHoverOff: ImageVector
    get() {
        if (_cursorHoverOff != null) {
            return _cursorHoverOff!!
        }
        _cursorHoverOff = fluentIcon(name = "Regular.CursorHoverOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.05f, 1.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 6.5f)
                verticalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 18.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(-1.5f)
                lineTo(4.5f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.94f, -1.0f)
                lineTo(10.0f, 11.06f)
                verticalLineToRelative(10.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.42f)
                lineToRelative(2.46f, -3.58f)
                lineToRelative(4.05f, 0.85f)
                lineToRelative(2.84f, 2.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(11.5f, 12.56f)
                lineTo(15.94f, 17.0f)
                lineToRelative(-2.29f, -0.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.77f, 0.3f)
                lineToRelative(-1.38f, 2.02f)
                verticalLineToRelative(-6.28f)
                close()
                moveTo(20.5f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.83f, 0.99f)
                lineToRelative(1.14f, 1.14f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 15.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 4.0f)
                lineTo(7.18f, 4.0f)
                lineToRelative(1.5f, 1.5f)
                lineTo(19.5f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        return _cursorHoverOff!!
    }

private var _cursorHoverOff: ImageVector? = null
