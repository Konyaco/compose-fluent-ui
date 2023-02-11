

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = fluentIcon(name = "Filled.List") {
            fluentPath {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(15.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(18.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                close()
            }
        }
        return _list!!
    }

private var _list: ImageVector? = null
