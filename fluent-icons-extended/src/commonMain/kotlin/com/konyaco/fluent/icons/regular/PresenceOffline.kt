

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceOffline: ImageVector
    get() {
        if (_presenceOffline != null) {
            return _presenceOffline!!
        }
        _presenceOffline = fluentIcon(name = "Regular.PresenceOffline") {
            fluentPath {
                moveTo(16.06f, 7.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.12f)
                lineTo(14.12f, 12.0f)
                lineToRelative(1.94f, 1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 2.12f)
                lineTo(12.0f, 14.12f)
                lineToRelative(-1.94f, 1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, -2.12f)
                lineTo(9.88f, 12.0f)
                lineToRelative(-1.94f, -1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.12f, -2.12f)
                lineTo(12.0f, 9.88f)
                lineToRelative(1.94f, -1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, 0.0f)
                close()
                moveTo(0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                close()
            }
        }
        return _presenceOffline!!
    }

private var _presenceOffline: ImageVector? = null
