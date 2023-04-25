

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = fluentIcon(name = "Filled.HeartBroken") {
            fluentPath {
                moveToRelative(11.28f, 5.03f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(5.37f, 5.37f, 0.0f, true, false, -7.6f, 7.6f)
                lineToRelative(7.89f, 7.9f)
                curveToRelative(0.3f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                lineToRelative(7.9f, -7.9f)
                arcToRelative(5.38f, 5.38f, 0.0f, true, false, -7.61f, -7.6f)
                lineToRelative(-0.79f, 0.8f)
                lineToRelative(-1.88f, 3.02f)
                lineToRelative(3.68f, 3.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.02f, 0.73f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, -0.7f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.6f, -3.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.1f, -0.64f)
                lineToRelative(2.21f, -3.56f)
                close()
            }
        }
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
