

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EqualOff: ImageVector
    get() {
        if (_equalOff != null) {
            return _equalOff!!
        }
        _equalOff = fluentIcon(name = "Filled.EqualOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(6.94f, 8.0f)
                lineTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.94f)
                lineToRelative(4.0f, 4.0f)
                lineTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(10.94f)
                lineToRelative(5.78f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-2.82f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                close()
                moveTo(11.18f, 8.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-8.82f)
                close()
            }
        }
        return _equalOff!!
    }

private var _equalOff: ImageVector? = null
