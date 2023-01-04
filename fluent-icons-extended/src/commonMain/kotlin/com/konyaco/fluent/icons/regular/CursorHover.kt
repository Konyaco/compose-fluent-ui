

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CursorHover: ImageVector
    get() {
        if (_cursorHover != null) {
            return _cursorHover!!
        }
        _cursorHover = fluentIcon(name = "Regular.CursorHover") {
            fluentPath {
                moveTo(19.5f, 5.5f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(9.0f, 16.5f)
                lineTo(9.0f, 18.0f)
                lineTo(4.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 15.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 4.0f)
                horizontalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 6.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.02f, 2.45f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.7f, -1.11f)
                lineToRelative(-0.33f, -0.34f)
                horizontalLineToRelative(0.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
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
                moveTo(11.5f, 18.84f)
                verticalLineToRelative(-6.28f)
                lineTo(15.94f, 17.0f)
                lineToRelative(-2.29f, -0.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.77f, 0.3f)
                lineToRelative(-1.38f, 2.02f)
                close()
            }
        }
        return _cursorHover!!
    }

private var _cursorHover: ImageVector? = null
