

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EqualOff: ImageVector
    get() {
        if (_equalOff != null) {
            return _equalOff!!
        }
        _equalOff = fluentIcon(name = "Regular.EqualOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(6.94f, 8.0f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.69f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(11.19f)
                lineToRelative(5.78f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(20.25f, 14.5f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(1.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(11.18f, 8.0f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(7.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.07f)
                close()
            }
        }
        return _equalOff!!
    }

private var _equalOff: ImageVector? = null
