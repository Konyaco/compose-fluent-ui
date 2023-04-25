

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoubleSwipeDown: ImageVector
    get() {
        if (_doubleSwipeDown != null) {
            return _doubleSwipeDown!!
        }
        _doubleSwipeDown = fluentIcon(name = "Filled.DoubleSwipeDown") {
            fluentPath {
                moveTo(18.2f, 21.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.4f)
                lineToRelative(1.3f, 1.29f)
                lineTo(16.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(11.59f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.58f)
                lineTo(15.5f, 9.24f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.0f, -5.24f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.0f, 5.24f)
                verticalLineToRelative(2.34f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -7.0f, -4.58f)
                close()
                moveTo(4.5f, 11.58f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 4.0f, 0.0f)
                lineTo(8.5f, 9.24f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.5f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, 5.24f)
                verticalLineToRelative(2.34f)
                close()
                moveTo(7.2f, 21.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.42f)
                lineToRelative(1.3f, 1.3f)
                lineTo(5.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(11.59f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineToRelative(-3.0f, 3.0f)
                close()
            }
        }
        return _doubleSwipeDown!!
    }

private var _doubleSwipeDown: ImageVector? = null
