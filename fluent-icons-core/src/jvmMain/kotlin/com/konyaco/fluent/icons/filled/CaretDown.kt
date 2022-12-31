

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = fluentIcon(name = "Filled.CaretDown") {
            fluentPath {
                moveTo(6.1f, 8.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.94f, 2.07f)
                lineToRelative(5.52f, 6.31f)
                curveToRelative(0.7f, 0.8f, 1.94f, 0.8f, 2.64f, 0.0f)
                lineToRelative(5.52f, -6.3f)
                curveToRelative(0.7f, -0.82f, 0.13f, -2.08f, -0.94f, -2.08f)
                horizontalLineTo(6.1f)
                close()
            }
        }
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
