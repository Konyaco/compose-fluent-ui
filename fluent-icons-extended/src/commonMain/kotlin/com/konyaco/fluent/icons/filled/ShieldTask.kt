

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShieldTask: ImageVector
    get() {
        if (_shieldTask != null) {
            return _shieldTask!!
        }
        _shieldTask = fluentIcon(name = "Filled.ShieldTask") {
            fluentPath {
                moveTo(20.25f, 5.0f)
                curveToRelative(-2.66f, 0.0f, -5.26f, -0.94f, -7.8f, -2.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.9f, 0.0f)
                curveTo(9.01f, 4.05f, 6.41f, 5.0f, 3.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(3.0f, 11.0f)
                curveToRelative(0.0f, 5.0f, 2.96f, 8.68f, 8.73f, 10.95f)
                curveToRelative(0.17f, 0.07f, 0.37f, 0.07f, 0.54f, 0.0f)
                curveTo(18.04f, 19.68f, 21.0f, 16.0f, 21.0f, 11.0f)
                lineTo(21.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(16.75f, 9.3f)
                lineToRelative(-6.0f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.03f, -0.02f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(5.46f, -5.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.02f, 1.1f)
                close()
            }
        }
        return _shieldTask!!
    }

private var _shieldTask: ImageVector? = null
