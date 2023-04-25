

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Call: ImageVector
    get() {
        if (_call != null) {
            return _call!!
        }
        _call = fluentIcon(name = "Filled.Call") {
            fluentPath {
                moveToRelative(7.77f, 2.44f)
                lineToRelative(1.08f, -0.35f)
                curveToRelative(1.0f, -0.32f, 2.09f, 0.2f, 2.52f, 1.22f)
                lineToRelative(0.86f, 2.03f)
                curveToRelative(0.37f, 0.88f, 0.16f, 1.92f, -0.52f, 2.57f)
                lineToRelative(-1.9f, 1.8f)
                arcToRelative(8.68f, 8.68f, 0.0f, false, false, 3.36f, 5.77f)
                lineToRelative(2.28f, -0.76f)
                curveToRelative(0.86f, -0.29f, 1.8f, 0.04f, 2.33f, 0.82f)
                lineToRelative(1.23f, 1.8f)
                curveToRelative(0.62f, 0.91f, 0.5f, 2.16f, -0.26f, 2.93f)
                lineToRelative(-0.81f, 0.82f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, -3.06f, 0.77f)
                curveToRelative(-2.53f, -0.79f, -4.87f, -3.14f, -7.0f, -7.05f)
                curveTo(5.75f, 10.9f, 5.0f, 7.57f, 5.62f, 4.84f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 2.15f, -2.4f)
                close()
            }
        }
        return _call!!
    }

private var _call: ImageVector? = null
