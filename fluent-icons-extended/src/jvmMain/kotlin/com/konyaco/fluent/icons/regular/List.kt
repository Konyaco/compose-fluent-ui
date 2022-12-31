

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = fluentIcon(name = "Regular.List") {
            fluentPath {
                moveTo(2.75f, 18.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(12.6f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(2.75f, 11.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(2.75f, 5.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(15.6f)
                horizontalLineToRelative(-15.5f)
                close()
            }
        }
        return _list!!
    }

private var _list: ImageVector? = null
