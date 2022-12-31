

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = fluentIcon(name = "Filled.SwipeRight") {
            fluentPath {
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(11.59f)
                lineToRelative(-1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, 1.31f)
                lineToRelative(0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 0.08f)
                lineToRelative(0.1f, -0.08f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.08f, -1.32f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.5f, 1.32f)
                lineToRelative(0.08f, 0.1f)
                lineTo(18.6f, 11.0f)
                lineTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.58f, 2.0f)
                horizontalLineToRelative(-1.7f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -4.0f)
                horizontalLineToRelative(1.7f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 12.0f)
                close()
            }
        }
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
