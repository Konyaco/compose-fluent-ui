

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = fluentIcon(name = "Regular.SwipeRight") {
            fluentPath {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.64f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(12.7f)
                lineToRelative(-2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                curveToRelative(0.27f, 0.27f, 0.69f, 0.3f, 0.98f, 0.07f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.13f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(2.22f, 2.22f)
                lineTo(6.74f, 11.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 6.0f, 12.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.68f, 1.75f)
                horizontalLineToRelative(-1.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -3.5f)
                horizontalLineToRelative(1.66f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 12.0f)
                close()
            }
        }
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
