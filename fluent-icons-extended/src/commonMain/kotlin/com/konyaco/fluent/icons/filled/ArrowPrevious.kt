

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowPrevious: ImageVector
    get() {
        if (_arrowPrevious != null) {
            return _arrowPrevious!!
        }
        _arrowPrevious = fluentIcon(name = "Filled.ArrowPrevious") {
            fluentPath {
                moveTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.88f)
                lineTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.12f)
                lineTo(7.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(18.7f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.31f, -0.09f)
                lineToRelative(-0.1f, 0.08f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, 1.32f)
                lineToRelative(0.08f, 0.1f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.5f, -1.32f)
                lineToRelative(-0.08f, -0.1f)
                lineTo(11.4f, 12.0f)
                lineToRelative(7.3f, -7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                close()
            }
        }
        return _arrowPrevious!!
    }

private var _arrowPrevious: ImageVector? = null
