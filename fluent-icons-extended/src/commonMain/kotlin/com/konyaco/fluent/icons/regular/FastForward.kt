

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = fluentIcon(name = "Regular.FastForward") {
            fluentPath {
                moveTo(11.5f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.47f, -1.14f)
                lineToRelative(7.41f, 6.3f)
                curveToRelative(0.82f, 0.7f, 0.82f, 1.97f, 0.0f, 2.67f)
                lineToRelative(-7.4f, 6.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.48f, -1.13f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-6.03f, 5.14f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.47f, -1.14f)
                lineTo(11.5f, 9.5f)
                lineTo(11.5f, 5.5f)
                close()
                moveTo(11.5f, 11.46f)
                lineTo(4.5f, 5.5f)
                verticalLineToRelative(13.0f)
                lineToRelative(7.0f, -5.96f)
                verticalLineToRelative(-1.08f)
                close()
                moveTo(20.41f, 11.81f)
                lineTo(13.0f, 5.5f)
                lineTo(13.0f, 18.5f)
                lineToRelative(7.41f, -6.31f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.38f)
                close()
            }
        }
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
