

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
                moveTo(4.5f, 11.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 8.19f, 8.5f)
                curveToRelative(-0.17f, 0.51f, -0.4f, 1.0f, -0.68f, 1.45f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 3.05f, 12.0f)
                curveToRelative(0.45f, -0.28f, 0.94f, -0.51f, 1.46f, -0.68f)
                lineTo(4.5f, 11.0f)
                close()
                moveTo(13.0f, 5.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 5.65f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(4.5f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(8.5f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
