

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClockPause: ImageVector
    get() {
        if (_clockPause != null) {
            return _clockPause!!
        }
        _clockPause = fluentIcon(name = "Filled.ClockPause") {
            fluentPath {
                moveTo(15.75f, 13.5f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.14f, -0.01f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -0.4f, 8.48f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -9.97f, -9.22f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 8.97f, 0.03f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.0f, -0.06f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.5f, 12.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(4.5f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(8.5f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
