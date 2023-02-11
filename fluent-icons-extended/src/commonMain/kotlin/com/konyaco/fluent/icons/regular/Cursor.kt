

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = fluentIcon(name = "Regular.Cursor") {
            fluentPath {
                moveTo(5.5f, 3.48f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.92f, 2.3f)
                lineTo(21.44f, 12.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.93f, 2.69f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.5f, 0.0f, -0.98f, 0.23f, -1.3f, 0.62f)
                lineToRelative(-4.18f, 5.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.68f, -0.93f)
                verticalLineToRelative(-17.0f)
                close()
                moveTo(20.51f, 14.0f)
                lineTo(7.0f, 3.48f)
                verticalLineTo(20.5f)
                lineToRelative(4.2f, -5.3f)
                curveToRelative(0.59f, -0.75f, 1.5f, -1.2f, 2.46f, -1.2f)
                horizontalLineToRelative(6.85f)
                close()
            }
        }
        return _cursor!!
    }

private var _cursor: ImageVector? = null
