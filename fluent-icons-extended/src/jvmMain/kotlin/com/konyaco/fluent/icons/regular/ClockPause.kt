

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClockPause: ImageVector
    get() {
        if (_clockPause != null) {
            return _clockPause!!
        }
        _clockPause = fluentIcon(name = "Regular.ClockPause") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -19.97f, 0.78f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, 1.64f, -1.14f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, 16.66f, 0.36f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, -7.97f, 8.33f)
                curveToRelative(-0.3f, 0.6f, -0.68f, 1.16f, -1.14f, 1.64f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
                moveTo(6.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(11.75f, 6.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                lineTo(12.5f, 12.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
