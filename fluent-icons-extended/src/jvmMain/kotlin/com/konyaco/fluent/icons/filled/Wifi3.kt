

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wifi3: ImageVector
    get() {
        if (_wifi3 != null) {
            return _wifi3!!
        }
        _wifi3 = fluentIcon(name = "Filled.Wifi3") {
            fluentPath {
                moveTo(10.94f, 16.45f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, -2.12f)
                close()
                moveTo(8.34f, 13.7f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 8.5f, 1.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, 0.8f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, -5.93f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.83f, -0.8f)
                curveToRelative(0.27f, -0.6f, 0.63f, -1.16f, 1.1f, -1.62f)
                close()
            }
        }
        return _wifi3!!
    }

private var _wifi3: ImageVector? = null
