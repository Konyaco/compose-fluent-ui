

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward = fluentIcon(name = "Filled.ArrowForward") {
            fluentPath {
                moveTo(14.3f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.41f, 1.4f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 1.4f)
                lineToRelative(3.29f, 3.3f)
                horizontalLineTo(11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 7.75f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.78f, -6.0f)
                horizontalLineToRelative(6.81f)
                lineToRelative(-3.3f, 3.3f)
                close()
            }
        }
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
