

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Acceptmedium: ImageVector
    get() {
        if (_acceptmedium != null) {
            return _acceptmedium!!
        }
        _acceptmedium = fluentIcon(name = "Default.Acceptmedium") {
            fluentPath {
                moveTo(1902.0f, 196.0f)
                lineToRelative(121.0f, 120.0f)
                lineTo(683.0f, 1657.0f)
                lineTo(25.0f, 999.0f)
                lineToRelative(121.0f, -121.0f)
                lineToRelative(537.0f, 537.0f)
                lineTo(1902.0f, 196.0f)
                close()
            }
        }
        return _acceptmedium!!
    }

private var _acceptmedium: ImageVector? = null
