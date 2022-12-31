

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = fluentIcon(name = "Regular.Stack") {
            fluentPath {
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(15.0f, 5.5f)
                lineTo(4.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(15.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(4.56f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, 1.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 6.56f)
                verticalLineToRelative(6.94f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(4.56f, 16.0f)
                close()
                moveTo(7.06f, 18.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineToRelative(7.25f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 22.0f, 14.25f)
                lineTo(22.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.5f, -1.94f)
                verticalLineToRelative(5.19f)
                curveToRelative(0.0f, 2.35f, -1.9f, 4.25f, -4.25f, 4.25f)
                lineTo(7.06f, 18.5f)
                close()
            }
        }
        return _stack!!
    }

private var _stack: ImageVector? = null
