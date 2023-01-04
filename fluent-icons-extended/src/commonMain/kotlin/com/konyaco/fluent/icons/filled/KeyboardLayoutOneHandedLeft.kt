

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.KeyboardLayoutOneHandedLeft: ImageVector
    get() {
        if (_keyboardLayoutOneHandedLeft != null) {
            return _keyboardLayoutOneHandedLeft!!
        }
        _keyboardLayoutOneHandedLeft = fluentIcon(name = "Filled.KeyboardLayoutOneHandedLeft") {
            fluentPath {
                moveTo(19.75f, 5.0f)
                curveTo(20.99f, 5.0f, 22.0f, 6.0f, 22.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(22.0f, 18.0f, 20.99f, 19.0f, 19.75f, 19.0f)
                lineTo(4.25f, 19.0f)
                curveTo(3.01f, 19.0f, 2.0f, 18.0f, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 6.01f, 3.0f, 5.0f, 4.25f, 5.0f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(6.5f, 16.0f)
                lineTo(10.0f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(6.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _keyboardLayoutOneHandedLeft!!
    }

private var _keyboardLayoutOneHandedLeft: ImageVector? = null
