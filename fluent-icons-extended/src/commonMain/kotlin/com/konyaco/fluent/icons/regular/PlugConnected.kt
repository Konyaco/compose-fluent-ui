

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PlugConnected: ImageVector
    get() {
        if (_plugConnected != null) {
            return _plugConnected!!
        }
        _plugConnected = fluentIcon(name = "Regular.PlugConnected") {
            fluentPath {
                moveTo(19.49f, 5.57f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, true, -1.9f, 8.96f)
                curveToRelative(-0.64f, 0.35f, -1.42f, 0.14f, -1.94f, -0.38f)
                lineToRelative(-5.8f, -5.8f)
                curveToRelative(-0.52f, -0.52f, -0.73f, -1.3f, -0.38f, -1.95f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.96f, -1.89f)
                lineToRelative(2.29f, -2.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.29f, 2.3f)
                close()
                moveTo(17.47f, 12.83f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -6.3f, -6.3f)
                curveToRelative(-0.27f, 0.35f, -0.19f, 0.83f, 0.12f, 1.14f)
                lineToRelative(5.04f, 5.04f)
                curveToRelative(0.31f, 0.3f, 0.8f, 0.39f, 1.14f, 0.12f)
                close()
                moveTo(3.28f, 21.78f)
                lineToRelative(2.3f, -2.29f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, 8.95f, -1.9f)
                curveToRelative(0.35f, -0.64f, 0.14f, -1.42f, -0.38f, -1.94f)
                lineToRelative(-5.8f, -5.8f)
                curveToRelative(-0.52f, -0.52f, -1.3f, -0.73f, -1.95f, -0.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.89f, 8.96f)
                lineToRelative(-2.29f, 2.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                close()
                moveTo(7.67f, 11.29f)
                lineTo(12.71f, 16.33f)
                curveToRelative(0.3f, 0.31f, 0.39f, 0.8f, 0.12f, 1.14f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -6.3f, -6.3f)
                curveToRelative(0.35f, -0.27f, 0.83f, -0.19f, 1.14f, 0.12f)
                close()
            }
        }
        return _plugConnected!!
    }

private var _plugConnected: ImageVector? = null
