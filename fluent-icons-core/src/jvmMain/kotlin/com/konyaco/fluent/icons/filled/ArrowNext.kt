

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowNext: ImageVector
    get() {
        if (_arrowNext != null) {
            return _arrowNext!!
        }
        _arrowNext = fluentIcon(name = "Filled.ArrowNext") {
            fluentPath {
                moveTo(18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(17.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.3f, 3.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.6f, 3.2f)
                lineToRelative(0.1f, 0.08f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineTo(12.6f, 12.0f)
                lineToRelative(-7.3f, -7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                close()
            }
        }
        return _arrowNext!!
    }

private var _arrowNext: ImageVector? = null
