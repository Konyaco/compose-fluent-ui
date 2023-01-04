

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Thinking: ImageVector
    get() {
        if (_thinking != null) {
            return _thinking!!
        }
        _thinking = fluentIcon(name = "Regular.Thinking") {
            fluentPath {
                moveTo(4.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                close()
                moveTo(4.0f, 19.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(9.5f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(9.5f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(11.82f, 2.0f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, true, 5.33f, 4.47f)
                horizontalLineToRelative(0.09f)
                arcToRelative(3.76f, 3.76f, 0.0f, true, true, 0.0f, 7.53f)
                lineTo(6.4f, 14.0f)
                arcToRelative(3.76f, 3.76f, 0.0f, true, true, 0.0f, -7.53f)
                horizontalLineToRelative(0.08f)
                arcTo(5.41f, 5.41f, 0.0f, false, true, 11.82f, 2.0f)
                close()
                moveTo(11.82f, 3.5f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.91f, 3.73f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.7f, 0.65f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(2.31f, 2.31f, 0.0f, true, false, 0.0f, 4.62f)
                horizontalLineToRelative(10.63f)
                arcToRelative(2.31f, 2.31f, 0.0f, true, false, 0.0f, -4.62f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.69f, -0.65f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.92f, -3.73f)
                close()
            }
        }
        return _thinking!!
    }

private var _thinking: ImageVector? = null
