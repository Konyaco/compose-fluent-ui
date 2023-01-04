

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = fluentIcon(name = "Filled.Stack") {
            fluentPath {
                moveTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(17.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(6.5f, 17.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.56f, 16.0f)
                lineTo(15.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                lineTo(18.0f, 6.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.5f, 1.94f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(9.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, -1.5f)
                horizontalLineToRelative(9.19f)
                curveToRelative(2.35f, 0.0f, 4.25f, -1.9f, 4.25f, -4.25f)
                lineTo(20.5f, 9.06f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 11.0f)
                verticalLineToRelative(3.25f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 16.25f, 20.0f)
                lineTo(9.0f, 20.0f)
                close()
            }
        }
        return _stack!!
    }

private var _stack: ImageVector? = null
