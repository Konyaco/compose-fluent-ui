

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PresenceAway: ImageVector
    get() {
        if (_presenceAway != null) {
            return _presenceAway!!
        }
        _presenceAway = fluentIcon(name = "Filled.PresenceAway") {
            fluentPath {
                moveTo(12.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(13.0f, 6.5f)
                verticalLineToRelative(4.81f)
                lineToRelative(2.98f, 2.55f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.96f, 2.28f)
                lineToRelative(-3.5f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 12.0f)
                lineTo(10.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        return _presenceAway!!
    }

private var _presenceAway: ImageVector? = null
