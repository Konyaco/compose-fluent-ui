

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowHookUpRight: ImageVector
    get() {
        if (_arrowHookUpRight != null) {
            return _arrowHookUpRight!!
        }
        _arrowHookUpRight = fluentIcon(name = "Regular.ArrowHookUpRight") {
            fluentPath {
                moveTo(10.5f, 18.5f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(10.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f)
                horizontalLineToRelative(5.95f)
                lineToRelative(-2.62f, -2.62f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(3.89f, 3.88f)
                curveToRelative(0.1f, 0.1f, 0.16f, 0.23f, 0.2f, 0.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.21f, 0.74f)
                lineToRelative(-3.88f, 3.88f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(2.6f, -2.61f)
                horizontalLineTo(10.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                close()
            }
        }
        return _arrowHookUpRight!!
    }

private var _arrowHookUpRight: ImageVector? = null
