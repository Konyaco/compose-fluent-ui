

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = fluentIcon(name = "Filled.Clipboard") {
            fluentPath {
                moveTo(13.75f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineTo(6.25f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                lineTo(8.0f, 4.25f)
                curveTo(8.0f, 3.01f, 9.0f, 2.0f, 10.25f, 2.0f)
                close()
            }
        }
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
