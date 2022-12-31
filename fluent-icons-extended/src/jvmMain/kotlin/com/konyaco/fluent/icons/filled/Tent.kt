

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = fluentIcon(name = "Filled.Tent") {
            fluentPath {
                moveTo(12.26f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.04f, 0.02f)
                lineToRelative(-1.7f, 1.7f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, true, -3.84f, 3.0f)
                curveToRelative(-0.4f, 0.23f, -0.66f, 0.63f, -0.72f, 1.09f)
                lineTo(3.6f, 17.5f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-1.35f, -9.45f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, -0.8f, -1.15f)
                arcToRelative(20.82f, 20.82f, 0.0f, false, true, -4.23f, -3.06f)
                lineTo(12.26f, 2.2f)
                close()
                moveTo(14.1f, 15.12f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, 1.65f, 2.38f)
                lineTo(8.28f, 17.5f)
                curveToRelative(0.54f, -0.66f, 1.18f, -1.52f, 1.64f, -2.4f)
                arcToRelative(43.26f, 43.26f, 0.0f, false, false, 2.06f, -5.02f)
                lineToRelative(0.19f, 0.53f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, false, 1.93f, 4.5f)
                close()
            }
        }
        return _tent!!
    }

private var _tent: ImageVector? = null
