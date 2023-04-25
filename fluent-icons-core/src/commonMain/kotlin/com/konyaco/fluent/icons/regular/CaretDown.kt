

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = fluentIcon(name = "Regular.CaretDown") {
            fluentPath {
                moveTo(5.16f, 10.07f)
                curveTo(4.46f, 9.27f, 5.03f, 8.0f, 6.1f, 8.0f)
                horizontalLineToRelative(11.8f)
                curveToRelative(1.07f, 0.0f, 1.65f, 1.26f, 0.94f, 2.07f)
                lineToRelative(-5.52f, 6.31f)
                curveToRelative(-0.7f, 0.8f, -1.94f, 0.8f, -2.64f, 0.0f)
                lineToRelative(-5.52f, -6.3f)
                close()
                moveTo(6.66f, 9.5f)
                lineTo(11.81f, 15.4f)
                curveToRelative(0.1f, 0.11f, 0.28f, 0.11f, 0.38f, 0.0f)
                lineToRelative(5.16f, -5.9f)
                lineTo(6.65f, 9.5f)
                close()
            }
        }
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
