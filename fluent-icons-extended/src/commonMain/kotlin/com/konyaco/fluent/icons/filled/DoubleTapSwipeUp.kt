

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoubleTapSwipeUp: ImageVector
    get() {
        if (_doubleTapSwipeUp != null) {
            return _doubleTapSwipeUp!!
        }
        _doubleTapSwipeUp = fluentIcon(name = "Filled.DoubleTapSwipeUp") {
            fluentPath {
                moveTo(12.7f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.4f)
                lineTo(11.0f, 5.42f)
                lineTo(11.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(13.0f, 5.41f)
                lineToRelative(1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(4.5f, 15.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 10.0f, 7.77f)
                verticalLineToRelative(2.1f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-2.1f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 4.5f, 15.0f)
                close()
                moveTo(7.5f, 15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.5f, -4.03f)
                verticalLineToRelative(2.53f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-2.53f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 7.5f, 15.0f)
                close()
            }
        }
        return _doubleTapSwipeUp!!
    }

private var _doubleTapSwipeUp: ImageVector? = null
