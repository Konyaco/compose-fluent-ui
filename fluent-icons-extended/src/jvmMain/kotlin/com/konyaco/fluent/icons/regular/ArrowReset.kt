

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowReset: ImageVector
    get() {
        if (_arrowReset != null) {
            return _arrowReset!!
        }
        _arrowReset = fluentIcon(name = "Regular.ArrowReset") {
            fluentPath {
                moveTo(6.78f, 2.72f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineTo(4.56f, 6.0f)
                horizontalLineToRelative(8.69f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, true, -7.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, 6.25f, -6.25f)
                horizontalLineTo(4.56f)
                lineToRelative(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _arrowReset!!
    }

private var _arrowReset: ImageVector? = null
