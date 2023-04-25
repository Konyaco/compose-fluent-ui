

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.KeyboardTab: ImageVector
    get() {
        if (_keyboardTab != null) {
            return _keyboardTab!!
        }
        _keyboardTab = fluentIcon(name = "Regular.KeyboardTab") {
            fluentPath {
                moveToRelative(18.03f, 11.47f)
                lineToRelative(-6.5f, -6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.13f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(5.22f, 5.22f)
                horizontalLineTo(3.75f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineTo(3.0f, 12.0f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(11.94f)
                lineToRelative(-5.22f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                curveToRelative(0.27f, 0.27f, 0.68f, 0.3f, 0.98f, 0.07f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-6.5f, -6.5f)
                lineToRelative(6.5f, 6.5f)
                close()
                moveTo(21.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        return _keyboardTab!!
    }

private var _keyboardTab: ImageVector? = null
