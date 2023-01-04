

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShieldTask: ImageVector
    get() {
        if (_shieldTask != null) {
            return _shieldTask!!
        }
        _shieldTask = fluentIcon(name = "Regular.ShieldTask") {
            fluentPath {
                moveTo(16.76f, 9.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.02f, -1.1f)
                lineToRelative(-5.47f, 5.01f)
                lineToRelative(-1.99f, -1.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.28f, 0.28f, 0.74f, 0.3f, 1.04f, 0.02f)
                lineToRelative(6.0f, -5.5f)
                close()
                moveTo(20.25f, 5.0f)
                curveToRelative(-2.66f, 0.0f, -5.26f, -0.94f, -7.8f, -2.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.9f, 0.0f)
                curveTo(9.01f, 4.05f, 6.41f, 5.0f, 3.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 5.0f, 2.96f, 8.68f, 8.73f, 10.95f)
                curveToRelative(0.17f, 0.07f, 0.37f, 0.07f, 0.54f, 0.0f)
                curveTo(18.04f, 19.68f, 21.0f, 16.0f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(4.5f, 6.48f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, false, 7.5f, -2.8f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, false, 7.5f, 2.8f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 4.26f, -2.45f, 7.38f, -7.5f, 9.44f)
                curveToRelative(-5.05f, -2.06f, -7.5f, -5.18f, -7.5f, -9.44f)
                verticalLineTo(6.48f)
                close()
            }
        }
        return _shieldTask!!
    }

private var _shieldTask: ImageVector? = null
