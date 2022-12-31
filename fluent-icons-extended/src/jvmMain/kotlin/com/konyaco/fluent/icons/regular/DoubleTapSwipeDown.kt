

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DoubleTapSwipeDown: ImageVector
    get() {
        if (_doubleTapSwipeDown != null) {
            return _doubleTapSwipeDown!!
        }
        _doubleTapSwipeDown = fluentIcon(name = "Regular.DoubleTapSwipeDown") {
            fluentPath {
                moveTo(12.53f, 21.78f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.22f, 2.22f)
                lineTo(11.25f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(10.69f)
                lineToRelative(2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.5f, 3.5f)
                close()
                moveTo(5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 5.25f, 6.78f)
                verticalLineToRelative(-1.56f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(1.56f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 5.0f, 9.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.75f, 4.15f)
                verticalLineToRelative(-1.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(1.7f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 7.5f, 9.0f)
                close()
            }
        }
        return _doubleTapSwipeDown!!
    }

private var _doubleTapSwipeDown: ImageVector? = null
