

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceAvailable: ImageVector
    get() {
        if (_presenceAvailable != null) {
            return _presenceAvailable!!
        }
        _presenceAvailable = fluentIcon(name = "Regular.PresenceAvailable") {
            fluentPath {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -18.0f, 0.0f)
                close()
                moveTo(17.06f, 8.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.12f)
                lineToRelative(-5.5f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(4.44f, -4.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, 0.0f)
                close()
            }
        }
        return _presenceAvailable!!
    }

private var _presenceAvailable: ImageVector? = null
