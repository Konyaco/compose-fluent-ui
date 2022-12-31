

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = fluentIcon(name = "Regular.Stop") {
            fluentPath {
                moveTo(19.25f, 4.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineTo(4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineTo(4.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(14.5f)
                close()
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
