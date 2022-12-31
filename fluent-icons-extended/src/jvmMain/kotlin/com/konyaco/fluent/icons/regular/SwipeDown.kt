

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = fluentIcon(name = "Regular.SwipeDown") {
            fluentPath {
                moveTo(12.0f, 6.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.64f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(12.7f)
                lineToRelative(2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.69f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.13f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(2.22f, 2.22f)
                lineTo(11.25f, 6.74f)
                curveToRelative(0.0f, -0.4f, 0.34f, -0.74f, 0.75f, -0.74f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 1.75f, 9.68f)
                verticalLineToRelative(-1.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(1.66f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
