

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.KeyboardShift: ImageVector
    get() {
        if (_keyboardShift != null) {
            return _keyboardShift!!
        }
        _keyboardShift = fluentIcon(name = "Regular.KeyboardShift") {
            fluentPath {
                moveTo(10.68f, 2.6f)
                curveToRelative(0.7f, -0.8f, 1.94f, -0.8f, 2.64f, 0.0f)
                lineToRelative(8.25f, 9.5f)
                curveToRelative(0.98f, 1.14f, 0.17f, 2.9f, -1.33f, 2.9f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(5.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.5f)
                curveTo(7.78f, 22.0f, 7.0f, 21.22f, 7.0f, 20.25f)
                lineTo(7.0f, 15.0f)
                lineTo(3.75f, 15.0f)
                curveToRelative(-1.5f, 0.0f, -2.3f, -1.76f, -1.32f, -2.9f)
                lineToRelative(8.25f, -9.5f)
                close()
                moveTo(12.18f, 3.59f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.37f, 0.0f)
                lineToRelative(-8.24f, 9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.18f, 0.41f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.2f, 0.0f, 0.32f, -0.25f, 0.18f, -0.41f)
                lineToRelative(-8.24f, -9.5f)
                close()
            }
        }
        return _keyboardShift!!
    }

private var _keyboardShift: ImageVector? = null
