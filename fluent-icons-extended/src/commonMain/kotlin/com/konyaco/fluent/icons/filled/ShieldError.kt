

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShieldError: ImageVector
    get() {
        if (_shieldError != null) {
            return _shieldError!!
        }
        _shieldError = fluentIcon(name = "Filled.ShieldError") {
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
                moveTo(11.25f, 7.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.75f, 14.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.25f, 7.63f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _shieldError!!
    }

private var _shieldError: ImageVector? = null
