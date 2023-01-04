

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoubleSwipeUp: ImageVector
    get() {
        if (_doubleSwipeUp != null) {
            return _doubleSwipeUp!!
        }
        _doubleSwipeUp = fluentIcon(name = "Filled.DoubleSwipeUp") {
            fluentPath {
                moveTo(18.2f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.4f)
                lineToRelative(1.3f, -1.29f)
                lineTo(16.5f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(18.5f, 5.41f)
                lineToRelative(1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(12.5f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 3.0f, -4.58f)
                verticalLineToRelative(2.34f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.24f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -5.24f)
                verticalLineToRelative(-2.34f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -7.0f, 4.58f)
                close()
                moveTo(4.5f, 12.42f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(2.34f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 5.24f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, -5.24f)
                verticalLineToRelative(-2.34f)
                close()
                moveTo(7.2f, 2.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.42f)
                lineToRelative(1.3f, -1.3f)
                lineTo(5.5f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(7.5f, 5.41f)
                lineToRelative(1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        return _doubleSwipeUp!!
    }

private var _doubleSwipeUp: ImageVector? = null
