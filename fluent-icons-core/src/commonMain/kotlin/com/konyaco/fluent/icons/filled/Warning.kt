

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = fluentIcon(name = "Filled.Warning") {
            fluentPath {
                moveTo(10.03f, 3.66f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.94f, 0.0f)
                lineToRelative(7.74f, 14.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 19.74f, 21.0f)
                lineTo(4.25f, 21.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -1.97f, -3.34f)
                lineToRelative(7.75f, -14.0f)
                close()
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.74f, 9.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(4.5f)
                lineToRelative(0.02f, 0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.49f, -0.1f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.01f, -0.1f)
                close()
            }
        }
        return _warning!!
    }

private var _warning: ImageVector? = null
