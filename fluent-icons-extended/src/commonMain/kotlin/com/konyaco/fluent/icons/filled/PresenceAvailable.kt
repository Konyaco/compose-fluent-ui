

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PresenceAvailable: ImageVector
    get() {
        if (_presenceAvailable != null) {
            return _presenceAvailable!!
        }
        _presenceAvailable = fluentIcon(name = "Filled.PresenceAvailable") {
            fluentPath {
                moveTo(12.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(17.06f, 10.56f)
                lineTo(11.56f, 16.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(4.44f, -4.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, 2.12f)
                close()
            }
        }
        return _presenceAvailable!!
    }

private var _presenceAvailable: ImageVector? = null
