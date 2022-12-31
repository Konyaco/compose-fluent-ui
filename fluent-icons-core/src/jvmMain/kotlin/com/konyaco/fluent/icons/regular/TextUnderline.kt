

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = fluentIcon(name = "Regular.TextUnderline") {
            fluentPath {
                moveTo(6.75f, 19.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(10.6f)
                horizontalLineToRelative(-10.5f)
                close()
                moveTo(17.25f, 4.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.4f, -2.06f, 6.75f, -6.0f, 6.75f)
                curveToRelative(-3.86f, 0.0f, -5.91f, -2.26f, -6.0f, -6.47f)
                lineTo(6.0f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(6.1f)
                curveTo(7.5f, 14.35f, 8.93f, 16.0f, 12.0f, 16.0f)
                curveToRelative(2.98f, 0.0f, 4.43f, -1.56f, 4.5f, -4.98f)
                lineTo(16.5f, 4.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
