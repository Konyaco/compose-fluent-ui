

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = fluentIcon(name = "Regular.ArrowUpRight") {
            fluentPath {
                moveTo(10.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.67f)
                lineTo(3.22f, 19.7f)
                arcToRelative(0.76f, 0.76f, 0.0f, true, false, 1.08f, 1.08f)
                lineToRelative(15.2f, -15.2f)
                verticalLineToRelative(7.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
