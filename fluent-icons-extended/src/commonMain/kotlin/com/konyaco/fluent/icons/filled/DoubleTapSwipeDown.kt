

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoubleTapSwipeDown: ImageVector
    get() {
        if (_doubleTapSwipeDown != null) {
            return _doubleTapSwipeDown!!
        }
        _doubleTapSwipeDown = fluentIcon(name = "Filled.DoubleTapSwipeDown") {
            fluentPath {
                moveTo(12.7f, 21.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.4f)
                lineToRelative(1.3f, 1.29f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(9.59f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(4.5f, 9.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 5.5f, 7.23f)
                verticalLineToRelative(-2.1f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(2.1f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 4.5f, 9.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.5f, 4.03f)
                lineTo(10.0f, 10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(2.53f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 7.5f, 9.0f)
                close()
            }
        }
        return _doubleTapSwipeDown!!
    }

private var _doubleTapSwipeDown: ImageVector? = null
