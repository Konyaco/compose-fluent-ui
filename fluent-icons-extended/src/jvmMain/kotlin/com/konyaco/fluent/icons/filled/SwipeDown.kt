

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = fluentIcon(name = "Filled.SwipeDown") {
            fluentPath {
                moveTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.59f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.31f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -1.5f)
                lineToRelative(0.1f, 0.08f)
                lineTo(11.0f, 18.6f)
                lineTo(11.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.0f, 9.58f)
                verticalLineToRelative(-1.7f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(1.7f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
