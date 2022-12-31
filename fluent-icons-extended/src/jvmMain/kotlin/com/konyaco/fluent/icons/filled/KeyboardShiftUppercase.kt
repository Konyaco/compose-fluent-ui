

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.KeyboardShiftUppercase: ImageVector
    get() {
        if (_keyboardShiftUppercase != null) {
            return _keyboardShiftUppercase!!
        }
        _keyboardShiftUppercase = fluentIcon(name = "Filled.KeyboardShiftUppercase") {
            fluentPath {
                moveTo(13.32f, 2.6f)
                curveToRelative(-0.7f, -0.8f, -1.95f, -0.8f, -2.64f, 0.0f)
                lineToRelative(-8.25f, 9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 3.75f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(3.24f)
                curveToRelative(1.5f, 0.0f, 2.3f, -1.76f, 1.33f, -2.9f)
                lineToRelative(-8.25f, -9.5f)
                close()
                moveTo(7.75f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        return _keyboardShiftUppercase!!
    }

private var _keyboardShiftUppercase: ImageVector? = null
