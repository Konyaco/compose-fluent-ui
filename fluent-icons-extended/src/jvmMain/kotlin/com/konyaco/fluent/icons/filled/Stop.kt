

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = fluentIcon(name = "Filled.Stop") {
            fluentPath {
                moveTo(4.75f, 3.0f)
                curveTo(3.78f, 3.0f, 3.0f, 3.78f, 3.0f, 4.75f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(4.75f)
                curveTo(21.0f, 3.78f, 20.22f, 3.0f, 19.25f, 3.0f)
                horizontalLineTo(4.75f)
                close()
            }
        }
        return _stop!!
    }

private var _stop: ImageVector? = null
