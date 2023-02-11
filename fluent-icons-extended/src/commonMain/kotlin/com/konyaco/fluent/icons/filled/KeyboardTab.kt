

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.KeyboardTab: ImageVector
    get() {
        if (_keyboardTab != null) {
            return _keyboardTab!!
        }
        _keyboardTab = fluentIcon(name = "Filled.KeyboardTab") {
            fluentPath {
                moveTo(18.2f, 11.3f)
                lineToRelative(-6.5f, -6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.49f, 1.31f)
                lineToRelative(0.08f, 0.1f)
                lineTo(15.1f, 11.0f)
                lineTo(4.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.88f)
                lineTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.88f, 1.0f)
                lineTo(15.1f, 13.0f)
                lineToRelative(-4.8f, 4.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, 1.31f)
                lineToRelative(0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 0.08f)
                lineToRelative(0.1f, -0.08f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.08f, -1.32f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-6.5f, -6.5f)
                lineToRelative(6.5f, 6.5f)
                close()
                moveTo(21.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
            }
        }
        return _keyboardTab!!
    }

private var _keyboardTab: ImageVector? = null
