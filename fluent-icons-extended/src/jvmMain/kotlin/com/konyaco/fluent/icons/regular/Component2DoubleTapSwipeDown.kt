

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Component2DoubleTapSwipeDown: ImageVector
    get() {
        if (_component2DoubleTapSwipeDown != null) {
            return _component2DoubleTapSwipeDown!!
        }
        _component2DoubleTapSwipeDown = fluentIcon(name = "Regular.Component2DoubleTapSwipeDown") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(10.7f)
                lineToRelative(2.22f, -2.21f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.08f)
                lineToRelative(0.08f, 0.08f)
                curveToRelative(0.27f, 0.26f, 0.3f, 0.68f, 0.07f, 0.97f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.14f)
                lineToRelative(0.08f, 0.08f)
                lineToRelative(2.22f, 2.21f)
                lineTo(11.25f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 1.75f, 13.78f)
                verticalLineToRelative(-1.56f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(1.56f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.75f, 8.65f)
                verticalLineToRelative(-1.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(1.7f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.0f, 4.5f)
                close()
            }
        }
        return _component2DoubleTapSwipeDown!!
    }

private var _component2DoubleTapSwipeDown: ImageVector? = null
