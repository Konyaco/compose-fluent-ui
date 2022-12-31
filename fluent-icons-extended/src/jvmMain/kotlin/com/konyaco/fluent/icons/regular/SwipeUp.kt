

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = fluentIcon(name = "Regular.SwipeUp") {
            fluentPath {
                moveTo(12.0f, 18.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.64f)
                lineToRelative(0.01f, -0.1f)
                lineTo(12.75f, 4.55f)
                lineToRelative(2.22f, 2.22f)
                curveToRelative(0.27f, 0.26f, 0.68f, 0.29f, 0.98f, 0.07f)
                lineToRelative(0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, 1.13f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(2.22f, -2.22f)
                verticalLineToRelative(12.7f)
                curveToRelative(0.0f, 0.4f, 0.34f, 0.74f, 0.75f, 0.74f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.75f, -9.68f)
                verticalLineToRelative(1.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -3.5f, 0.0f)
                verticalLineToRelative(-1.66f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 22.0f)
                close()
            }
        }
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
