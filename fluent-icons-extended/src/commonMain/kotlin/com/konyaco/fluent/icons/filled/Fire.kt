

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = fluentIcon(name = "Filled.Fire") {
            fluentPath {
                moveTo(6.16f, 9.32f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.01f, 0.02f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -0.13f, 0.1f)
                curveToRelative(-0.07f, 0.07f, -0.18f, 0.16f, -0.3f, 0.3f)
                curveToRelative(-0.24f, 0.24f, -0.55f, 0.62f, -0.83f, 1.12f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, false, -0.8f, 4.55f)
                curveToRelative(0.27f, 2.0f, 1.1f, 3.67f, 2.53f, 4.83f)
                curveTo(8.02f, 21.4f, 9.94f, 22.0f, 12.25f, 22.0f)
                curveToRelative(2.39f, 0.0f, 4.3f, -0.9f, 5.55f, -2.43f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, false, 1.68f, -5.86f)
                curveToRelative(-0.13f, -2.18f, -1.31f, -3.83f, -2.36f, -5.29f)
                lineToRelative(-0.3f, -0.42f)
                curveTo(15.68f, 6.4f, 14.78f, 4.9f, 15.0f, 2.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.83f)
                curveToRelative(-0.38f, 0.0f, -0.82f, 0.12f, -1.24f, 0.3f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, false, -3.72f, 3.96f)
                curveToRelative(-0.49f, 1.4f, -0.24f, 2.73f, 0.12f, 3.7f)
                curveToRelative(0.24f, 0.64f, -0.02f, 1.27f, -0.4f, 1.46f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.93f, -0.31f)
                lineToRelative(-0.81f, -1.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.11f, -0.25f)
                close()
            }
        }
        return _fire!!
    }

private var _fire: ImageVector? = null
