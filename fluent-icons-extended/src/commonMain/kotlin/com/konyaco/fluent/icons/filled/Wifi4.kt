

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wifi4: ImageVector
    get() {
        if (_wifi4 != null) {
            return _wifi4!!
        }
        _wifi4 = fluentIcon(name = "Filled.Wifi4") {
            fluentPath {
                moveTo(10.96f, 18.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.12f, -2.13f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.12f, 2.13f)
                close()
            }
        }
        return _wifi4!!
    }

private var _wifi4: ImageVector? = null
