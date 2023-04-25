

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.KeyboardShift: ImageVector
    get() {
        if (_keyboardShift != null) {
            return _keyboardShift!!
        }
        _keyboardShift = fluentIcon(name = "Filled.KeyboardShift") {
            fluentPath {
                moveTo(10.68f, 2.6f)
                curveToRelative(0.7f, -0.8f, 1.94f, -0.8f, 2.64f, 0.0f)
                lineToRelative(8.25f, 9.5f)
                curveToRelative(0.98f, 1.14f, 0.17f, 2.9f, -1.33f, 2.9f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(5.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.5f)
                curveTo(7.78f, 22.0f, 7.0f, 21.22f, 7.0f, 20.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.75f)
                curveToRelative(-1.5f, 0.0f, -2.3f, -1.76f, -1.32f, -2.9f)
                lineToRelative(8.25f, -9.5f)
                close()
            }
        }
        return _keyboardShift!!
    }

private var _keyboardShift: ImageVector? = null
