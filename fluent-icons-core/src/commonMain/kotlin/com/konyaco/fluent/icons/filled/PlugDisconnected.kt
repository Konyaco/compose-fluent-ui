

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PlugDisconnected: ImageVector
    get() {
        if (_plugDisconnected != null) {
            return _plugDisconnected!!
        }
        _plugDisconnected = fluentIcon(name = "Filled.PlugDisconnected") {
            fluentPath {
                moveTo(21.7f, 3.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.4f)
                lineToRelative(-1.8f, 1.79f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -5.26f, 0.6f)
                lineToRelative(-1.06f, 1.07f)
                curveToRelative(-0.69f, 0.69f, -0.69f, 1.8f, 0.0f, 2.48f)
                lineToRelative(3.58f, 3.58f)
                curveToRelative(0.69f, 0.69f, 1.8f, 0.69f, 2.48f, 0.0f)
                lineToRelative(1.07f, -1.06f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 0.6f, -5.26f)
                lineToRelative(1.8f, -1.8f)
                close()
                moveTo(10.7f, 11.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.4f)
                lineToRelative(-1.48f, 1.46f)
                lineToRelative(-0.29f, -0.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-1.78f, 1.77f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -0.6f, 5.26f)
                lineToRelative(-1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(1.8f, -1.79f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 5.25f, -0.6f)
                lineToRelative(1.77f, -1.78f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(1.48f, -1.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
        }
        return _plugDisconnected!!
    }

private var _plugDisconnected: ImageVector? = null
