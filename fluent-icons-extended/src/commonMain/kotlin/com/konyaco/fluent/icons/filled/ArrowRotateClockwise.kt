

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowRotateClockwise: ImageVector
    get() {
        if (_arrowRotateClockwise != null) {
            return _arrowRotateClockwise!!
        }
        _arrowRotateClockwise = fluentIcon(name = "Filled.ArrowRotateClockwise") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 4.13f, 17.0f)
                lineTo(18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(15.0f, 18.33f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _arrowRotateClockwise!!
    }

private var _arrowRotateClockwise: ImageVector? = null
