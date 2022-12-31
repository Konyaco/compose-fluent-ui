

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wifi1: ImageVector
    get() {
        if (_wifi1 != null) {
            return _wifi1!!
        }
        _wifi1 = fluentIcon(name = "Filled.Wifi1") {
            fluentPath {
                moveTo(17.78f, 10.7f)
                curveToRelative(0.6f, 0.6f, 1.12f, 1.33f, 1.5f, 2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.77f, 0.9f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, -10.94f, -0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.78f, -0.9f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 13.0f, -2.07f)
                close()
                moveTo(15.74f, 13.7f)
                curveToRelative(0.46f, 0.46f, 0.83f, 1.02f, 1.1f, 1.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, 0.8f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, -5.93f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.83f, -0.8f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 8.49f, -1.61f)
                close()
                moveTo(20.42f, 8.3f)
                curveToRelative(0.5f, 0.5f, 0.99f, 1.09f, 1.4f, 1.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.64f, 1.14f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, false, -16.36f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.64f, -1.15f)
                arcTo(11.92f, 11.92f, 0.0f, false, true, 20.42f, 8.3f)
                close()
                moveTo(13.06f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                close()
            }
        }
        return _wifi1!!
    }

private var _wifi1: ImageVector? = null
