

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = fluentIcon(name = "Filled.Mic") {
            fluentPath {
                moveTo(18.25f, 11.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(0.5f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, -6.25f, 6.73f)
                verticalLineToRelative(2.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-2.37f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 5.0f, 12.48f)
                verticalLineToRelative(-0.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.6f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 5.03f, 5.25f)
                horizontalLineToRelative(0.72f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 5.25f, -5.03f)
                verticalLineToRelative(-0.72f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
            }
        }
        return _mic!!
    }

private var _mic: ImageVector? = null
