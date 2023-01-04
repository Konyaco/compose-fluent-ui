

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wifi2: ImageVector
    get() {
        if (_wifi2 != null) {
            return _wifi2!!
        }
        _wifi2 = fluentIcon(name = "Filled.Wifi2") {
            fluentPath {
                moveTo(10.96f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, -2.12f)
                close()
                moveTo(8.36f, 13.7f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 8.5f, 1.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.83f, 0.8f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, -5.93f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.83f, -0.8f)
                curveToRelative(0.26f, -0.6f, 0.63f, -1.15f, 1.09f, -1.61f)
                close()
                moveTo(6.31f, 10.7f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 13.0f, 2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.78f, 0.9f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, -10.94f, -0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.78f, -0.9f)
                curveToRelative(0.38f, -0.76f, 0.88f, -1.46f, 1.5f, -2.07f)
                close()
            }
        }
        return _wifi2!!
    }

private var _wifi2: ImageVector? = null
