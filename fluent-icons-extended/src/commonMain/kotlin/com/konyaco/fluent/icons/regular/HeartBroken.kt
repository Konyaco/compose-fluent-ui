

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = fluentIcon(name = "Regular.HeartBroken") {
            fluentPath {
                moveToRelative(12.0f, 5.75f)
                lineToRelative(0.82f, -0.82f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, true, 7.61f, 7.6f)
                lineToRelative(-7.9f, 7.9f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(-7.9f, -7.9f)
                arcToRelative(5.37f, 5.37f, 0.0f, true, true, 7.6f, -7.6f)
                lineToRelative(0.83f, 0.82f)
                close()
                moveTo(12.0f, 18.84f)
                lineTo(19.37f, 11.47f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, -5.3f, -5.66f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-0.52f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, 0.07f)
                lineToRelative(-1.23f, 1.23f)
                lineToRelative(2.8f, 2.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.01f, 1.07f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.96f, -1.96f)
                lineToRelative(-2.8f, -2.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.01f, -1.07f)
                lineToRelative(1.32f, -1.3f)
                lineToRelative(-0.82f, -0.83f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, -5.48f, 5.48f)
                lineTo(12.0f, 18.84f)
                close()
            }
        }
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
