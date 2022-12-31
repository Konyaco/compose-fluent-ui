

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = fluentIcon(name = "Filled.Cursor") {
            fluentPath {
                moveTo(7.92f, 2.3f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 3.48f)
                verticalLineTo(20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.68f, 0.93f)
                lineToRelative(4.19f, -5.3f)
                curveToRelative(0.31f, -0.4f, 0.79f, -0.62f, 1.3f, -0.62f)
                horizontalLineToRelative(6.84f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.93f, -2.69f)
                lineTo(7.92f, 2.3f)
                close()
            }
        }
        return _cursor!!
    }

private var _cursor: ImageVector? = null
