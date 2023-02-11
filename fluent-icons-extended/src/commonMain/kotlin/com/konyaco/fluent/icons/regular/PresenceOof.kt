

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceOof: ImageVector
    get() {
        if (_presenceOof != null) {
            return _presenceOof!!
        }
        _presenceOof = fluentIcon(name = "Regular.PresenceOof") {
            fluentPath {
                moveTo(12.56f, 9.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.12f, -2.12f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.12f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.12f, -2.12f)
                lineToRelative(-1.44f, -1.44f)
                horizontalLineToRelative(5.38f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                horizontalLineToRelative(-5.38f)
                lineToRelative(1.44f, -1.44f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -18.0f, 0.0f)
                close()
            }
        }
        return _presenceOof!!
    }

private var _presenceOof: ImageVector? = null
