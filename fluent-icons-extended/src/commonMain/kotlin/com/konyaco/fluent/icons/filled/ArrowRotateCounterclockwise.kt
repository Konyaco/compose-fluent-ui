

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowRotateCounterclockwise: ImageVector
    get() {
        if (_arrowRotateCounterclockwise != null) {
            return _arrowRotateCounterclockwise!!
        }
        _arrowRotateCounterclockwise = fluentIcon(name = "Filled.ArrowRotateCounterclockwise") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.13f, 17.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, 2.0f)
                lineTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.88f)
                lineTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.12f)
                lineTo(9.0f, 18.33f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 19.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        return _arrowRotateCounterclockwise!!
    }

private var _arrowRotateCounterclockwise: ImageVector? = null
