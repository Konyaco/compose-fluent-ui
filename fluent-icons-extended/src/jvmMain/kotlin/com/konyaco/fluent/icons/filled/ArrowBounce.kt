

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowBounce: ImageVector
    get() {
        if (_arrowBounce != null) {
            return _arrowBounce!!
        }
        _arrowBounce = fluentIcon(name = "Filled.ArrowBounce") {
            fluentPath {
                moveTo(11.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(9.41f)
                lineToRelative(8.04f, 8.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineTo(21.7f, 9.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineToRelative(-7.54f, 7.55f)
                lineTo(5.41f, 8.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowBounce!!
    }

private var _arrowBounce: ImageVector? = null
