

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShieldError: ImageVector
    get() {
        if (_shieldError != null) {
            return _shieldError!!
        }
        _shieldError = fluentIcon(name = "Regular.ShieldError") {
            fluentPath {
                moveTo(12.45f, 2.15f)
                curveTo(14.99f, 4.05f, 17.59f, 5.0f, 20.25f, 5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(21.0f, 11.0f)
                curveToRelative(0.0f, 5.0f, -2.96f, 8.68f, -8.73f, 10.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.0f)
                curveTo(5.96f, 19.68f, 3.0f, 16.0f, 3.0f, 11.0f)
                lineTo(3.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(2.66f, 0.0f, 5.26f, -0.94f, 7.8f, -2.85f)
                curveToRelative(0.27f, -0.2f, 0.63f, -0.2f, 0.9f, 0.0f)
                close()
                moveTo(12.0f, 3.68f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, 2.8f)
                lineTo(4.5f, 11.0f)
                curveToRelative(0.0f, 4.26f, 2.45f, 7.38f, 7.5f, 9.44f)
                curveToRelative(5.05f, -2.06f, 7.5f, -5.18f, 7.5f, -9.44f)
                lineTo(19.5f, 6.48f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, -2.8f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.29f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _shieldError!!
    }

private var _shieldError: ImageVector? = null
