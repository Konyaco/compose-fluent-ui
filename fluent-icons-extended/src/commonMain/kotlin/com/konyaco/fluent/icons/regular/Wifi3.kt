

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Wifi3: ImageVector
    get() {
        if (_wifi3 != null) {
            return _wifi3!!
        }
        _wifi3 = fluentIcon(name = "Regular.Wifi3") {
            fluentPath {
                moveTo(10.94f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, -2.12f)
                close()
                moveTo(8.44f, 13.82f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 8.28f, 1.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.38f, 0.6f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 8.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.37f, -0.6f)
                curveToRelative(0.26f, -0.59f, 0.62f, -1.12f, 1.06f, -1.57f)
                close()
            }
        }
        return _wifi3!!
    }

private var _wifi3: ImageVector? = null
