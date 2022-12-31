

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DoubleTapSwipeUp: ImageVector
    get() {
        if (_doubleTapSwipeUp != null) {
            return _doubleTapSwipeUp!!
        }
        _doubleTapSwipeUp = fluentIcon(name = "Regular.DoubleTapSwipeUp") {
            fluentPath {
                moveTo(12.53f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.22f, -2.22f)
                verticalLineToRelative(10.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.75f, 4.56f)
                lineToRelative(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-3.5f, -3.5f)
                close()
                moveTo(5.0f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 5.25f, -6.78f)
                verticalLineToRelative(1.56f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 3.5f, 0.0f)
                lineTo(13.75f, 8.22f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 5.0f, 15.0f)
                close()
                moveTo(7.5f, 15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.75f, -4.15f)
                verticalLineToRelative(1.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.5f, 0.0f)
                verticalLineToRelative(-1.7f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 7.5f, 15.0f)
                close()
            }
        }
        return _doubleTapSwipeUp!!
    }

private var _doubleTapSwipeUp: ImageVector? = null
