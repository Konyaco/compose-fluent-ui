

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = fluentIcon(name = "Regular.History") {
            fluentPath {
                moveTo(19.5f, 12.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 6.9f, 6.5f)
                horizontalLineToRelative(1.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.04f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -2.9f, 5.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.62f)
                curveToRelative(0.46f, 0.0f, 0.79f, 0.44f, 0.72f, 0.9f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 19.5f, 12.0f)
                close()
                moveTo(12.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(12.5f, 11.5f)
                lineTo(12.5f, 7.75f)
                close()
            }
        }
        return _history!!
    }

private var _history: ImageVector? = null
