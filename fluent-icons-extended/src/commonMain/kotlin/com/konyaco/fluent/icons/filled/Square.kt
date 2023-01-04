

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = fluentIcon(name = "Filled.Square") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        return _square!!
    }

private var _square: ImageVector? = null
